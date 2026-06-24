---
name: reformat-notes
description: Reformatiert genau einen Block (~100 Zeilen) einer Obsidian-Notiz und speichert den Fortschritt. Erster Aufruf mit Dateipfad, Folgeaufrufe ohne Argumente. Mit /loop /reformat-notes die gesamte Datei automatisch durcharbeiten.
allowed-tools: Read Edit Bash(grep *) Bash(wc *) Bash(python3 *) Bash(cat *)
model: haiku
---

# Notizen-Reformatierung (Ein Block)

Verarbeite genau EINEN Block (~100 Zeilen). State wird in `.claude/reformat-state.json` gespeichert und zwischen Aufrufen weitergeführt.

## Aufruf-Syntax

```
/reformat-notes <Dateipfad> [ab '<Abschnittstitel>']   # Erster Aufruf – initialisiert State
/reformat-notes                                          # Folgeaufruf – liest State, nächster Block
```

Beispiel:
```
/reformat-notes wiki/SEM2/🧪 NATGL/3. Elektrotechnik.md ab '3.6 Induktivität'
/loop /reformat-notes   # danach: loop treibt den Rest automatisch an
```

---

## Schritt 1: State laden oder initialisieren

Prüfe ob `.claude/reformat-state.json` existiert (`Bash: cat .claude/reformat-state.json`):

**Kein State → erster Aufruf:**
- Lies `$ARGUMENTS` für Dateipfad und optionalen Startabschnitt (`ab '...'`)
- Zähle Gesamtzeilen: `wc -l <datei>`
- Falls Startabschnitt angegeben: finde seine Zeilennummer via `grep -n`
- Schreibe State:
  ```json
  {"file": "<pfad>", "next_line": <startzeile>, "total_lines": <n>, "blocks_done": 0}
  ```

**State vorhanden → Folgeaufruf:**
- Lies State, extrahiere `file`, `next_line`, `total_lines`, `blocks_done`
- Wenn `next_line >= total_lines`:
  - Lösche `.claude/reformat-state.json`
  - Gib aus: `✓ FERTIG. <blocks_done> Blöcke reformatiert. State gelöscht.`
  - **Stoppe hier.** Kein weiterer Block.

---

## Schritt 2: Block bestimmen

- Starte bei `next_line`
- Ziel: ~100 Zeilen, aber schneide immer an einer **natürlichen Abschnittsgrenze** ab (nächste `##`- oder `###`-Überschrift nach ~100 Zeilen, nie mitten in einem Abschnitt)
- Lies den Block mit `Read` (offset=next_line, limit=~120 für Spielraum)
- Bestimme `block_end` (letzte Zeile dieses Blocks)

---

## Schritt 3: Formatvorlage verstehen (nur beim ersten Block)

Falls `blocks_done == 0`: Lies die ersten ~50 Zeilen der Datei als Formatvorlage – erkenne das verwendete Muster (Frontmatter, Überschriften-Schema, Callout-Stil). Halte dich beim Reformatieren exakt daran.

---

## Schritt 4: Block reformatieren

Reformatiere den Block nach den **Formatierungsregeln** unten. Ersetze ihn mit `Edit` (exact string replacement).

---

## Schritt 5: State aktualisieren

Schreibe zurück:
```json
{"file": "<pfad>", "next_line": <block_end + 1>, "total_lines": <n>, "blocks_done": <blocks_done + 1>}
```

---

## Schritt 6: Ausgabe

Einzeilige Statusmeldung:
```
✓ <Abschnittstitel> (Zeilen <next_line>–<block_end>) — /reformat-notes für nächsten Block
```

Wenn das der letzte Block war (`block_end >= total_lines - 1`):
```
✓ <Abschnittstitel> (Zeilen <next_line>–<block_end>) — LETZTER BLOCK. Beim nächsten Aufruf: DONE.
```

**Stoppe danach.** Kein weiterer Block in dieser Invocation.

---

## Formatierungsregeln

### Sprache
- Einfache, verständliche Sprache – erkläre das *Warum*, nicht nur das *Was*
- Kurze, klare Sätze – keine Endlos-Aufzählungen
- Statt trockener Stichpunkte: Einleitungssatz + strukturierte Punkte
- Analogien und Beispiele zur Veranschaulichung einsetzen (z.B. "ähnlich wie ein Wassertank")

### Struktur
- Jeder Abschnitt beginnt mit einem **Konzeptsatz** (bold oder als Intro-Absatz)
- Dann Erklärung, dann Formel(n), dann Intuition/Bedeutung
- Subsektionen mit `###` Überschriften
- Nummerierung konsistent zu den bestehenden Überschriften beibehalten

### Formelboxen (PFLICHT für alle wichtigen Formeln)
Formeln IMMER in Callout-Blöcke einbetten:

```
> [!formula] Titel der Formel
> $$ Formel $$
> - $Symbol$: Beschreibung (Einheit, Einheitenname)
> - $Symbol$: Beschreibung (Einheit, Einheitenname)
```

### Callouts vs. einfache Blockquotes

`> [!type]`-Callouts (mit Obsidian-Icon) **ausschließlich für Formelboxen** (`[!formula]`). Für Definitionen, Merksätze und Hinweise stattdessen einfaches `>` ohne Typ:

```
> **Definition:** Eine Kapazität ist ...
> **Merke:** Die Spule wirkt als Differenzierer.
> **Hinweis:** Gilt nur für lineare Systeme.
```

`> [!tip]`, `> [!abstract]`, `> [!warning]`, `> [!info]` etc. **nicht verwenden**.

### Was zu erhalten ist
- Alle `![[Bildname.jpeg]]` Einbettungen (nicht verschieben, nur den Kontext drum herum verbessern)
- Alle mathematisch korrekten Formeln (nur Formatierung ändern, nie Inhalt)
- Alle Überschriften-Nummern (3.6, 3.6.1 etc.) – keine Nummern erfinden oder weglassen
- Links zu anderen Dateien `[[...]]`

### Was zu entfernen/korrigieren ist
- Rohe `\n`-Escapes im Text
- Doppelte Überschriften (gleicher Titel kommt zwemals vor)
- Unformatierte Formeln außerhalb von Formelboxen (wenn es wichtige Formeln sind)
- Schlechte OCR-Artefakte wie abgebrochene Sätze, falsche Zeilenumbrüche in Formeln
- Überflüssige Punkte `·` oder `•` am Zeilenanfang → in echte Listenpunkte umwandeln

### Struktur-Vorlage

```markdown
### 3.X.Y Titel

>**Konzept:** Kurzer Intro-Satz, der das Thema einführt.

Erklärung in 1-3 Sätzen was passiert und warum es wichtig ist.

> [!formula] Name der Formel
> $$ Formel $$
> - $Symbol$: Bedeutung (Einheit, V)
> - $Symbol$: Bedeutung (Einheit, A)

**Intuition:**
- Punkt 1 → Konsequenz
- Punkt 2 → Konsequenz
```

### Beispiel

**Vorher:**
```
- Selbstinduktivität verknüpft die Änderungsrate des elektrischen Stroms mit der elektrischen Spannung:
$$u(t) = L \frac{di(t)}{dt}$$
- L: Induktivität; Einheit: Henry
- Merke: Spule wirkt als Differenzierer
```

**Nachher:**
```
### 3.6.2 Die Grundformel: Selbstinduktivität

Wenn sich der Strom durch eine Spule ändert, entsteht eine Spannung. Die **Selbstinduktivität** verknüpft diese Stromänderung mit der erzeugten Spannung:

> [!formula] Selbstinduktionsspannung
> $$ u(t) = L \frac{\mathrm{d}i(t)}{\mathrm{d}t} $$
> - $u(t)$: Induzierte Spannung zum Zeitpunkt $t$ (Volt, V)
> - $L$: Induktivität (Henry, H)
> - $\frac{\mathrm{d}i(t)}{\mathrm{d}t}$: Änderungsrate des Stroms (A/s)

**Merke:** Die Spule wirkt als **Differenzierer** – sie reagiert auf Stromänderungen, nicht auf den Strom selbst.
```

---

## Regeln

- **VOLLSTÄNDIGKEIT IST OBERSTES GEBOT:** Jeder Satz, jeder Stichpunkt, jede Formel, jede Zahl aus dem Original muss im Output vorhanden sein. Nichts weglassen, nichts zusammenfassen, nichts kürzen. Im Zweifel lieber wörtlich übernehmen als riskieren, etwas zu verlieren.
- **Kein Paraphrasieren zum Kürzen:** Umformulierungen dienen nur der Verständlichkeit, nie der Verdichtung. Ein Abschnitt mit 10 Stichpunkten hat danach immer noch 10 Stichpunkte.
- **Keine implizite Zusammenfassung:** Formulierungen wie "u.a.", "z.B. …", "unter anderem" dürfen nicht dazu genutzt werden, Listenpunkte wegzulassen. Alle Punkte vollständig ausschreiben.
- Nie den Inhalt (Formeln, Fakten) verfälschen – nur Formatierung und Sprache verbessern
- Nie Bilder verschieben oder löschen
- Immer die Formatvorlage aus dem vorherigen Teil der Datei als Referenz nutzen
- Lieber etwas mehr erklären als zu wenig – der Leser soll es ohne Vorlesung verstehen
- **Genau ein Block pro Invocation** – kein internes Weiterloopen
