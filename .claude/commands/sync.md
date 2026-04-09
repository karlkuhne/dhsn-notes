Verarbeite Rohmaterialien aus dem `raw/`-Ordner und arbeite sie in die Obsidian-Vault-Struktur ein. Kann auch neue Fächer anlegen.

Benutzereingabe: $ARGUMENTS

---

## Schritt 1: Inventar erstellen

Führe **parallel** aus:
1. `ls raw/` — welche Dateien warten auf Verarbeitung?
2. `ls wiki/SEM*/` — welche Semester und Fächer existieren?
3. Für jedes Fach: zähle die höchste Themennummer (für spätere Nummerierung)

## Schritt 2: Modus bestimmen

Analysiere `$ARGUMENTS` und den Inhalt von `raw/`. Bestimme, was zu tun ist:

### Modus A: Neues Fach anlegen
Erkennbar an: Benutzer erwähnt ein neues Fach, Kürzel oder will ein Fach erstellen.
Benötigte Infos: Semester-Nummer, Kürzel (Großbuchstaben), vollständiger Fachname, Beschreibung.

### Modus B: Raw-Dateien verarbeiten
Erkennbar an: Dateien in `raw/` vorhanden und/oder Benutzer sagt "einarbeiten"/"verarbeiten" o.ä.

### Modus C: Beides
Erkennbar an: Kombination — z.B. "Neues Fach OOP und arbeite die PDFs ein"

**Wenn Infos fehlen, frage aktiv nach** mit dem AskUserQuestion-Tool. Frage z.B.:
- "Zu welchem Fach gehören die Dateien?" (liste existierende Fächer auf)
- "In welchem Semester?"
- "Wie lautet das Kürzel?"

Versuche fehlende Infos zuerst aus Dateinamen und -inhalten abzuleiten, bevor du fragst.

## Schritt 3: Neues Fach anlegen (falls Modus A/C)

1. Wähle ein thematisch passendes Emoji
2. Erstelle den Ordner: `wiki/SEM{n}/{emoji} {KÜRZEL}/`
3. Erstelle die Index-Datei `{emoji} {KÜRZEL}.md`:

```markdown
# {Vollständiger Fachname}

{Beschreibung — falls nicht angegeben, schreibe selbstständig eine kurze passende Beschreibung}

## Vorlesungen

```

## Schritt 4: Raw-Dateien verarbeiten (falls Modus B/C)

### 4.1 Dateien lesen

Lies jede Datei in `raw/` mit dem passenden Ansatz:
- **PDF** (`.pdf`): Mit dem Read-Tool lesen (nativ unterstützt)
- **Bilder** (`.png`, `.jpg`, `.jpeg`, `.heic`): Mit dem Read-Tool betrachten — transkribiere handschriftliche Notizen, erkenne Text und Formeln
- **Text** (`.txt`, `.md`): Direkt lesen
- **Code** (`.c`, `.java`, `.py` etc.): Lesen und als Code-Beispiel in Notizen einbetten
- **Andere Dateitypen**: Benutzer informieren und überspringen

### 4.2 Inhalte analysieren

Für jede gelesene Datei bestimme:
- **Fach-Zuordnung**: Zu welchem Fach gehört der Inhalt? (Dateiname, Kontext, $ARGUMENTS)
- **Vorlesung vs. Übung**: Enthält die Datei Vorlesungsstoff oder Übungsaufgaben?
- **Neues oder bestehendes Thema?**: Passt der Inhalt zu einer existierenden Notiz oder ist es ein neues Thema?
- **Gruppierung**: Gehören mehrere Dateien zum selben Thema?

### 4.3 Notizen erstellen

#### Neue Vorlesungs-Notiz

Ermittle die nächste freie Nummer im Ziel-Fachordner (höchste bestehende Nummer + 1).

Erstelle `wiki/SEM{n}/{emoji} {KÜRZEL}/{N}. {Thema}.md`:

```markdown
---
tags: [sem{n}, {kürzel_kleingeschrieben}]
type: lecture
---
## {N}.1 {Erster Abschnitt}

{Inhalt}

## {N}.2 {Zweiter Abschnitt}

{Inhalt}
```

#### Neue Übungs-Notiz / Bestehende erweitern

Prüfe ob bereits eine `Übungen.md` (oder ähnlich) im Fachordner existiert.
- **Falls ja**: Inhalt am Ende anhängen, mit Datumsüberschrift `# DD.MM.YY`
- **Falls nein**: Neue Datei erstellen:

```markdown
---
tags: [sem{n}, {kürzel_kleingeschrieben}]
type: exercise
---
# {Datum oder Überschrift}

{Aufgaben}
```

#### Bestehende Vorlesungs-Notiz erweitern

Wenn neuer Stoff zu einem existierenden Thema passt:
- Bestehende Datei lesen
- Neue Inhalte als Unterabschnitte am Ende einfügen
- Bestehende Nummerierung fortsetzen (z.B. wenn `## 3.4` der letzte Abschnitt ist, beginne mit `## 3.5`)

#### Große Dateien aufteilen

Wenn eine Datei (z.B. langes PDF) mehrere klar getrennte Themen enthält, erstelle separate Notiz-Dateien für jedes Thema.

### 4.4 Formatierungsregeln

- **Sprache**: Deutsch. Fachbegriffe dürfen englisch bleiben.
- **Inline-Mathe**: `$...$` — z.B. `$\frac{a}{b}$`
- **Block-Mathe**: `$$...$$` auf eigener Zeile
- **Wikilinks**: `[[Seitenname]]` für interne Verweise
- **Bilder einbetten**: `![[bildname.png]]` (ohne Pfad — Obsidian löst das auf)
- **Code-Blöcke**: Mit Sprach-Tag, z.B. ` ```c `
- **Überschriften**: `## {N}.{sub} Titel` innerhalb von Themen-Dateien
- **Keine Inhalte erfinden** — nur das notieren, was in den Quellen steht
- **Mathe sorgfältig** — LaTeX-Formeln exakt übertragen, nichts vereinfachen oder weglassen

## Schritt 5: Verlinkung

### 5.1 Index-Datei aktualisieren

Öffne die Index-Datei des Fachs (`{emoji} {KÜRZEL}.md`) und füge neue Einträge ein:
- Vorlesungen: `- [[{N}. {Thema}]]` unter `## Vorlesungen`
- Übungen: `- [[Übungen]]` unter `## Übungen` (falls noch nicht vorhanden, Abschnitt anlegen)

### 5.2 Querverweise setzen

- Wenn ein Begriff im neuen Inhalt auf eine existierende Notiz verweist → Wikilink setzen: `[[Seitenname]]`
- Bei fachübergreifenden Bezügen → `## Siehe auch`-Abschnitt am Ende der Notiz:
  ```
  ## Siehe auch
  - [[3. Mengenlehre]] — Mengenlehre mit Operationen und Beweisen (TGI)
  ```

## Schritt 6: Dateien aufräumen

1. **Bilder/Diagramme** die eingebettet werden sollen → nach `images/` verschieben und aussagekräftig umbenennen:
   - `IMG_4532.jpg` → `{KÜRZEL}-{Thema}-{Beschreibung}.png` (z.B. `MAA-Integrale-Skizze.png`)
   - Im Notiz-Text mit `![[neuer-name.png]]` referenzieren
2. **Verarbeitete PDFs und Textdateien** → aus `raw/` löschen
3. **`raw/.gitkeep`** bleibt erhalten — niemals löschen!

## Schritt 7: Zusammenfassung

Gib dem Benutzer eine kurze Zusammenfassung:
- Welche Dateien verarbeitet wurden
- Welche Notizen erstellt/aktualisiert wurden
- Welche Querverweise gesetzt wurden

## Schritt 8: Git Commit

Erstelle einen Commit auf Deutsch. Stil: kurz und informell.
Beispiele:
- `MAA: Vorlesung 18 eingearbeitet`
- `OOP: Neues Fach angelegt`
- `TGI+MAA: Raw-Materialien verarbeitet`
- `IMPP: Übungen ergänzt`

---

## Wichtige Regeln

1. **Nie raten, immer fragen** — wenn Fach, Semester oder Zuordnung unklar ist, frage den Benutzer
2. **Bestehende Konventionen einhalten** — Frontmatter-Format, Ordnerstruktur, Nummerierung exakt wie im Vault
3. **Keine Inhalte erfinden** — nur niederschreiben was in den Quellen steht
4. **Mathe exakt übertragen** — LaTeX-Formeln sorgfältig und vollständig
5. **Qualität vor Geschwindigkeit** — lieber sauber als schnell
