# Sync Skill

Verarbeite Rohmaterialien aus dem `raw/`-Ordner und arbeite sie in die Obsidian-Vault-Struktur ein. Kann auch neue Fächer anlegen.

Argumente: $ARGUMENTS (optional - Kontext des Benutzers)

---

## SCHRITT 1: INVENTAR & KONTEXT-SCAN

Führe **parallel** aus:
1. `ls raw/` — welche Dateien warten auf Verarbeitung?
2. `ls wiki/SEM*/` — welche Semester und Fächer existieren?
3. Für jedes existierende Fach: zähle die höchste Themennummer

**WICHTIG bei mehreren Dateien**: Falls mehrere Dateien in `raw/` liegen, scanne erst alle Dateien (Titel, erste Seite, Metadaten), um Zusammenhänge zu verstehen (z.B. Teil 1 & Teil 2 einer Vorlesung, oder Vorlesung + Übungsblatt). Verarbeite sie als logische Einheit, anstatt blind eine Datei nach der anderen abzuarbeiten.

---

## SCHRITT 2: MODUS & GRUPPIERUNG BESTIMMEN

Analysiere `$ARGUMENTS` und den Inhalt von `raw/`:

- **Modus A**: Neues Fach anlegen — Benutzer erwähnt ein neues Fach
- **Modus B**: Raw-Dateien verarbeiten — Dateien vorhanden
- **Modus C**: Beides

**Fehlende Infos aktiv erfragen** mit dem question-Tool.

---

## SCHRITT 3: NEUES FACH ANLEGEN (falls Modus A/C)

1. Emoji wählen (passend zum Fach)
2. Ordner: `wiki/SEM{n}/{emoji} {KÜRZEL}/`
3. Index-Datei erstellen:

```markdown
# {Fachname}

{Beschreibung}

## Vorlesungen

## Übungen
```

---

## SCHRITT 4: DATEIEN VERARBEITEN (falls Modus B/C)

### 4.1 JEDE DATEI SEITE FÜR SEITE LESEN

**Das ist der KRITISCHE Schritt. Befolge diese Anweisungen EXAKT:**

1. **PDFs**: Lese jede Seite einzeln. Bei mehreren Seiten: lese Seite 1, dann Seite 2, dann Seite 3 usw. Überspringe keine Seite.
   - **WICHTIG**: Nutze beim Lesen von PDFs unbedingt die **Multimodalität** (die Screenshots im Read-Tool).
   - Verlasse dich **NIEMALS nur auf den extrahierten Text (OCR)**.
   - Viele Informationen (Diagramme, Formeln in Formen, Skizzen) sind nur visuell erkennbar. Analysiere jeden Screenshot exakt.

2. **Bilder in PDFs**: Nach dem Extrahieren: Prüfe ob eingebettete Bilder vorhanden sind.

   - **Eigenständige Grafiken/Diagramme** → Speichere nach `images/{fach}/{N}-{bildname}.png` und bette ein mit `![[bildname.png]]`
   - **Tafel-Fotos / eingescannte Folien** → Extrahiere Text/Formeln und schreibe sie in die Notizen (wie regulären Seiteninhalt). Rekonstruiere Diagramme ggf. als Mermaid

3. **Direkte Bilddateien** (Fotos von Tafel, Whiteboard, Skizzen, Handschrift):
   - Unterstützte Formate: .png, .jpg, .jpeg, .gif, .webp
   - Beschreibe JEDES Bild vollständig: Objekte, Beschriftungen, Pfeile, Farben
   - **Text auf Tafel/Folien/Handschrift** → Extrahiere jeden Text, jede Formel in die Notizen
   - **Diagramme/Strukturen** → Rekonstruiere als Mermaid (flowchart, classDiagram, etc.)
   - **Skizzen/Komplexe Grafiken** → Falls Mermaid zu komplex ist oder Details verloren gehen: Speichere Bild nach `images/` und bette es ein. Beschreibe trotzdem den Inhalt.

4. **Für JEDE einzelne Seite musst du erfassen:**
   - Jeden Titel und jede Überschrift
   - Jeden Absatz, jeden Satz, jede Zeile Text
   - Jede Formel, Gleichung, jedes Symbol
   - Jede Tabelle (alle Zeilen und Spalten)
   - Jedes Code-Beispiel (jede Zeile!)
   - Jede Fußnote, jede Quellenangabe
   - Jeden Namen, jedes Datum, jede Nummer
   - Jede Randnotiz, jeder Stern-Hinweis, jeder "Merke:"-Kasten
   - Jedes Diagramm, jeder Box-Titel

3. **NICHTS weglassen.** Wenn du dir nicht sicher bist ob etwas wichtig ist — nimm es auf. Im Zweifel lieber zu viel als zu wenig.

4. **OCR/Extraktionsfehler korrigieren**: Wenn bei der PDF-Extraktion Zeichen falsch erscheinen (z.B. "热血" oder "?"), ersetze sie durch das korrekte Zeichen basierend auf dem Kontext.

### 4.2 EINE PDF = EINE NOTIZ

**Wichtig:** Eine einzelne PDF-Datei ergibt IMMER eine einzelne Notiz. Nicht eine Seite = eine Datei, nicht ein Kapitel = eine Datei. Eine PDF = eine Datei.

Bei PDFs mit mehreren Themen/Kapiteln: Alle Inhalte in einer Datei zusammenfassen und abspeichern.

### 4.3 NOTIZ ERSTELLEN

Ermittle die nächste freie Nummer im Ziel-Fachordner.

Erstelle `wiki/SEM{n}/{emoji} {KÜRZEL}/{N}. {Thema}.md`:

```markdown
---
tags: [sem{n}, {kürzel_kleingeschrieben}]
type: lecture
sources: ["{Dateiname der Quelldatei}"]
date: {YYYY-MM-DD}
updated: {YYYY-MM-DD}
---

**{DD.MM.YY}**

## {N}.1 {Erster Themenblock}

### {N}.1.1 {Erster Unterpunkt}

{Inhalt — SIEHE STILRICHTLINIEN UNTEN}

### {N}.1.2 {Zweiter Unterpunkt}

{Inhalt}

## {N}.2 {Zweiter Themenblock}

### {N}.2.1 {Erster Unterpunkt}

{Inhalt}
```

---

### 4.3 STILRICHTLINIEN — BEFOLGE DIESE EXAKT

**Ton**: Kompakt und sachlich wie ein Student der mitschreibt. Nicht wie ein Lehrbuch. Nicht wie Folien. Nicht zu locker. Fakten auf den Punkt.

**Regeln für den Inhalt:**

1. **JEDE Information aus den Folien MUSS in den Notizen sein.** Keine Ausnahme. Keine Zeile darf fehlen.

2. **Umformulieren ist erlaubt und erwünscht.** Du darfst Sätze umbauen, Synonyme verwenden, Sätze kürzen ABER nur wenn dabei KEINE Information verloren geht. "Kürzen" bedeutet: gleiche Information, weniger Worte. NICHT: weniger Information.

3. **Struktur je nach Inhalt:**
   - Definitionen → Als Blockquote oder fett, dann Erklärung. Nutze Obsidian Callouts: `> [!abstract] Definition: {Begriff}`
   - Wichtige Infos/Merksätze → `> [!tip] Merke: {Inhalt}`
   - Warnungen/Beachten → `> [!warning] Zu beachten: {Inhalt}`
   - Eigenschaften/Fakten → Bulletpoints
   - Verfahren/Algorithmen → Nummerierte Schritte
   - Beweise → Mit Wahrheitstabelle oder Mathe-Ableitung
   - Code → Als Code-Block mit Kommentaren

4. **Tabellen**: Übernimm Tabellen aus den Folien 1:1. Keine Zeile, keine Spalte weglassen.

5. **Formeln**: Alle Formeln exakt übertragen. LaTeX exakt. Nichts vereinfachen.

6. **Zitate**: Zitate aus den Folien als Blockquote übernehmen (mit Quellenangabe).

7. **Code-Beispiele**: Vollständig übernehmen. Jede Zeile. Mit Kommentaren.

8. **Persönliche Marker** (bei Bedarf):
   - `Merke:` — für nicht-offensichtliche Fakten
   - `Zu beachten:` — für wichtige Randbedingungen

**Was du NICHT tun darfst:**

- ❌ Nicht den Folienstil 1:1 übernehmen (kryptische Stichpunkte ohne Zusammenhang)
- ❌ Nicht "Zusammenfassung" schreiben und Details weglassen
- ❌ Nicht Absätze zusammenfassen auf Kosten von Details
- ❌ Nicht Formeln vereinfachen oder Zwischen-Schritte weglassen
- ❌ Nicht Beispiele weglassen
- ❌ Nicht Code-Beispiele kürzen
- ❌ Nicht Tabellen auf wenige Zeilen reduzieren
- ❌ Nicht "usw." schreiben wo auf Folien mehr steht

**Beispiel für korrektes Umformulieren:**

Folie sagt:
> "Die Konjunktion ist das logische UND. Es seien A und B zwei Aussagen. Logischer Ausdruck: A ∧ B"

Erlaubt:
> Die Konjunktion (∧) ist das logische UND. Für zwei Aussagen A und B gilt: A ∧ B

NICHT erlaubt:
> Konjunktion = UND (Details über Ausdruck weggelassen)

---

### 4.4 INHALT STRUKTURIEREN

**Abschnitte innerhalb einer Notiz IMMER durchnummerieren:**

```markdown
## {N}.1 {Erster Themenblock}

### {N}.1.1 {Erster Unterpunkt}

Inhalt...

### {N}.1.2 {Zweiter Unterpunkt}

Inhalt...

## {N}.2 {Zweiter Themenblock}

### {N}.2.1 {Erster Unterpunkt}
```

Die Nummerierung innerhalb der Notiz MUSS immer bei .1 beginnen. Jeder neue Themenblock bekommt eine neue Hauptnummer (`.1`, `.2`, `.3`...). Unterpunkte bekommen Subnummern (`.1.1`, `.1.2`, `.2.1`...).

**WICHTIG: Die führende Nummer in Überschriften darf nicht über die Hauptnummer der Datei hinausgehen.** Beispiel: Eine Datei `0. Einführung.md` darf nur Überschriften mit führender 0 haben (z.B. `## 0.1`, `### 0.1.1`). Überschriften mit führender 1, 2, etc. sind nicht erlaubt. Bei Bedarf als fett markieren (`**Titel**`).

### 4.5 FORMATIERUNG

- **Sprache**: Deutsch. Fachbegriffe englisch ok.
- **Inline-Mathe**: `$...$` — z.B. `$\frac{a}{b}$`
- **Block-Mathe**: `$$...$$` auf eigener Zeile
- **Wikilinks**: `[[Seitenname]]`
- **Bilder**: `![[bildname.png]]`
- **Code**: ` ```sprache ` mit Kommentaren auf Deutsch
- **Überschriften**: NUR nummerierte Überschriften (z.B. `## 0.1`, `### 1.2.3`) sind Überschriften. Überschriften müssen eine Nummer haben (z.B. `0.1`, `1.2.3`). Unnummerierte Zwischenüberschriften werden als fett markiert: `**Titel**`

### 4.6 VISUALISIERUNGEN

**Wann Mermaid nutzen:**
- Prozessabläufe (Compiler → Bytecode → JVM)
- Klassendiagramme (UML)
- Architekturdiagramme (Client-Server, GUI-Strukturen)
- Flussdiagramme

**Mermaid-Typen:**
- ` ```mermaid flowchart LR/TB ` — für Flussdiagramme
- ` ```mermaid classDiagram ` — für UML-Klassendiagramme
- ` ```mermaid sequenceDiagram ` — für Sequenzdiagramme
- ` ```mermaid stateDiagram ` — für Zustandsdiagramme

**Wann obsidian-charts nutzen:**
- Tortendiagramme (Pie Charts)
- Balkendiagramme (Bar Charts)
- Liniendiagramme (Line Charts)
- Streudiagramme (Scatter Plots)

**Wann obsidian-desmos nutzen:**
- Mathematische Funktionsgraphen
- Parametrische Kurven

---

## SCHRITT 5: VERLINKUNG

### 5.1 Index aktualisieren

In `{emoji} {KÜRZEL}.md`:
- Vorlesungen: `- [[{N}. {Thema}]]`
- Übungen: `- [[Übungen]]`

### 5.2 Querverweise

`## Siehe auch` am Ende mit Wikilinks zu verwandten Notizen.

---

## SCHRITT 6: AUFÄUMEN

1. **Bilder** → `images/` verschieben und umbenennen
2. **PDFs** → aus `raw/` löschen
3. **`raw/.gitkeep`** bleibt

---

## SCHRITT 7: GIT COMMIT

Kurz und informell auf Deutsch:
- `OOE: Vorlesung 1 eingearbeitet`
- `MAA: Neues Fach angelegt`

---

## WICHTIGE REGELN

1. **NICHTS WEGLASSEN** — Jede Information muss in den Notizen sein. Umformulieren ja, kürzen nein.
2. **Jede Seite lesen** — Überspringe keine Seite, keine Folie.
3. **Im Zweifel aufnehmen** — Lieber zu viel als zu wenig.
4. **Nie raten** — Bei Unklarheiten fragen.
5. **Konventionen einhalten** — Frontmatter, Ordnerstruktur, Nummerierung.
6. **Mathe exakt** — Formeln vollständig und korrekt.
7. **Qualität vor Geschwindigkeit** — Sauber > Schnell.
