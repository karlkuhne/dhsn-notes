---
name: process-pdf
description: Vollautomatische Pipeline: PDF → Markdown (marker) → Logo-Cleanup → Wiki-Integration → Reformatierung. Aufruf mit PDF-Dateiname aus marker/input/. Orchestriert die Sub-Skills clean-marker-logos, integrate-marker-output und reformat-notes.
allowed-tools: Bash(marker_single *) Bash(ls *) Bash(cat *) Bash(python3 *) Read
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

`<dateiname.pdf>` liegt immer in `marker/input/`. Kontext wird an `integrate-marker-output` weitergegeben.

---

## Pipeline-Schritte

Führe die Schritte **sequenziell** aus. Stoppe bei einem Fehler und berichte was schiefgelaufen ist.

### Schritt 1: PDF → Markdown (marker)

```bash
marker_single marker/input/<dateiname.pdf> --output_dir marker/output --force_ocr
```

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

### Schritt 4: Reformatierung starten

Invoke the `reformat-notes` skill via the Skill tool. Übergib den Pfad der neu erstellten Wiki-Datei (den du aus Schritt 3 kennst).

Danach invoke the `loop` skill via the Skill tool mit dem Argument `/reformat-notes` — dieser treibt die Reformatierung automatisch bis EOF an.

Ausgabe: `▶ Schritt 4/4 gestartet: Loop läuft`

---

## Fehlerbehandlung

- **Schritt 1 schlägt fehl** (kein Output-Ordner): Prüfe ob die PDF-Datei existiert. Melde den marker-Fehler.
- **Schritt 2 oder 3 schlägt fehl**: Berichte den Fehler, lass den User entscheiden ob manuell weitergemacht werden soll.
- **Schritt 4**: Wenn der Loop-Start fehlschlägt, gib dem User den manuellen Befehl: `/loop /reformat-notes`

## Zusammenfassung am Ende

Nach Schritt 3 (vor dem Loop-Start) kurze Zusammenfassung ausgeben:
```
✓ Pipeline Schritte 1–3 abgeschlossen:
  - PDF: marker/input/<datei>
  - Output: marker/output/<ordner>/
  - Wiki: wiki/SEM<n>/<emoji> <KÜRZEL>/<N>. <Titel>.md
  - Bilder: Images/<KÜRZEL>/<N>. <Titel>/
  → Reformatierungs-Loop läuft...
```
