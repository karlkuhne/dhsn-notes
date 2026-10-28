---
name: process-pdf
description: Vollautomatische Pipeline: PDF → Markdown (marker) → Logo-Cleanup → Wiki-Integration → Reformatierung. Aufruf mit PDF-Dateiname aus marker/input/. Orchestriert die Sub-Skills clean-marker-logos, integrate-marker-output und reformat-notes.
allowed-tools: Bash(TORCH_DEVICE=cpu marker_single *) Bash(marker_single *) Bash(cp *) Bash(ls *) Bash(cat *) Bash(python3 *) Read Write Edit Agent
---

# PDF-Verarbeitungs-Pipeline

Orchestriert die gesamte Pipeline von der PDF-Datei bis zur fertig formatierten Wiki-Notiz.

## Aufruf-Syntax

```
/process-pdf <dateiname.pdf> [Kontext]
```

Beispiele:
```
/process-pdf 5-Signale.pdf Das ist die 5. Vorlesung für BILD
```

`<dateiname.pdf>` liegt normalerweise in `marker/input/`. Liegt die PDF woanders (z.B. als Anhang), erst dorthin kopieren (`cp <quelle> marker/input/<sprechender-name>.pdf`). Kontext wird an `integrate-marker-output` weitergegeben.

**Mehrere PDFs:** Jede PDF durchläuft alle 4 Schritte komplett (inkl. Reformatierung und Commit), bevor die nächste startet. Gehören mehrere PDFs zum selben Kapitel, wird die Notiz nicht neu angelegt, sondern um neue `{N}.X`-Abschnitte erweitert (`sources` im Frontmatter ergänzen).

---

## Pipeline-Schritte

Führe die Schritte **sequenziell** aus. Stoppe bei einem Fehler und berichte was schiefgelaufen ist. **Alle 4 Schritte sind Pflicht.** Kein Schritt darf übersprungen oder durch manuelles Arbeiten ersetzt werden, auch nicht bei kleinen Notizen.

### Schritt 1: PDF → Markdown (marker)

Marker läuft **immer auf der CPU** (`TORCH_DEVICE=cpu` vor den Befehl setzen, auch bei den Block-Läufen unten):

```bash
TORCH_DEVICE=cpu marker_single marker/input/<dateiname.pdf> --output_dir marker/output --force_ocr
```

**Große PDFs aufteilen:** Lange PDFs (ab ca. 60 Seiten) laufen sonst nicht durch (`MPS backend out of memory`, auch nicht mit kleineren Batch-Größen). Seitenzahl prüfen (`mdls -name kMDItemNumberOfPages <pdf>`) und in Blöcken von ca. 30 Seiten konvertieren, jeweils in ein eigenes Ausgabeverzeichnis:

```bash
for r in 0-31 32-63 64-93; do
  TORCH_DEVICE=cpu marker_single marker/input/<dateiname.pdf> --output_dir /tmp/<name>/$r --force_ocr --page_range $r
done
```

Danach Bilder (Seitenzahlen in den Dateinamen bleiben absolut) und `.md`-Dateien der Teile in der Reihenfolge zu einem Ordner `marker/output/<name>/` zusammenführen.

Warte auf Abschluss. Prüfe danach ob ein Unterordner in `marker/output/` entstanden ist:
```bash
ls marker/output/
```

Wenn kein neuer Ordner → Fehler melden, Pipeline abbrechen.

Ausgabe: `▶ Schritt 1/4 abgeschlossen: marker/output/<ordner>/`

---

### Schritt 2: Logo-Cleanup

Invoke the `clean-marker-logos` skill via the Skill tool.

Ausgabe: `▶ Schritt 2/4 abgeschlossen: Logos bereinigt`

---

### Schritt 3: Wiki-Integration

Invoke the `integrate-marker-output` skill via the Skill tool. Übergib dabei den optionalen Kontext aus `$ARGUMENTS` (alles nach dem Dateinamen).

Ausgabe: `▶ Schritt 3/4 abgeschlossen: In Wiki integriert`

---

### Schritt 4: Reformatierung (Pflicht, mit parallelen Agents)

Die Regeln stehen im Skill `reformat-notes` (Abschnitte „Formatierungsregeln" und „Regeln"). Der selbsttaktende `/loop` wird hier **nicht** verwendet, weil er nicht sauber terminiert und die nächste PDF nicht erst nach Abschluss starten kann. Stattdessen:

1. Zu reformatierenden Bereich bestimmen: bei einer neuen Notiz die ganze Datei ab der ersten `##`-Überschrift, beim Anhängen an eine bestehende Notiz nur die neuen Abschnitte. Bei ≤ ca. 100 Zeilen genügt ein einzelner Block (selbst reformatieren oder ein Agent).
2. Bereich an `##`/`###`-Grenzen in Blöcke von ca. 100–170 Zeilen teilen und jeden Block als Auszug in eine eigene Datei im Scratchpad legen (`sed -n 'a,bp'`).
3. Pro Block **einen Agent** (Agent-Tool, `general-purpose`) parallel in einer Nachricht starten. Der Prompt nennt: den Pfad zu `.claude/skills/reformat-notes/SKILL.md` (Regeln lesen, State/Loop-Teil ignorieren), Eingabe-Auszug, Ausgabe-Datei im Scratchpad, und diese Vorgaben: nur den eigenen Auszug bearbeiten, nie die Wiki-Notiz; Überschriften, Nummern und `![[...]]`-Bilder unverändert; nichts kürzen; nur `[!formula]`-Callouts, sonst einfache `> **Definition:**`-Blockquotes; keine `####`/`#####`; Notiz kompakt halten.
4. Wenn alle Agents fertig sind, **vor dem Zusammensetzen prüfen**: Bildeinbettungen, Überschriften und LaTeX-Formeln je Block mit dem Auszug vergleichen (nichts fehlt), keine anderen Callout-Typen als `[!formula]`, keine `####`+.
5. Blöcke in der Reihenfolge wieder in die Notiz einsetzen und committen (`{KÜRZEL}: {Titel} reformatiert`).

Ausgabe: `▶ Schritt 4/4 abgeschlossen: Reformatiert (<n> Blöcke)`

---

## Fehlerbehandlung

- **Schritt 1 schlägt fehl** (kein Output-Ordner): Prüfe ob die PDF-Datei existiert. Melde den marker-Fehler.
- **Schritt 2 oder 3 schlägt fehl**: Berichte den Fehler, lass den User entscheiden ob manuell weitergemacht werden soll.
- **Schritt 4**: Schlägt ein Agent fehl oder fehlt im Prüfschritt Inhalt, den Block erneut reformatieren lassen. Nicht stillschweigend überspringen.

## Zusammenfassung am Ende

Nach Schritt 4 kurze Zusammenfassung ausgeben und dabei **ausdrücklich nennen, falls ein Schritt anders als hier beschrieben lief**:
```
✓ Pipeline abgeschlossen:
  - PDF: marker/input/<datei>
  - Wiki: wiki/SEM<n>/<emoji> <KÜRZEL>/<N>. <Titel>.md
  - Bilder: Images/<KÜRZEL>/<N>. <Titel>/
  - Reformatiert: <n> Blöcke (parallel)
```
