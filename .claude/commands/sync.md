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
date: {YYYY-MM-DD}
updated: {YYYY-MM-DD}
---
**{DD.MM.YY}**

## {N}.1 {Erster Abschnitt}

{Inhalt}

## {N}.2 {Zweiter Abschnitt}

{Inhalt}
```

- `date`: Erstellungsdatum der Notiz. `updated`: wird bei jeder Änderung aktualisiert. Beide ISO-Format.
- **`**DD.MM.YY**`** als Fetttext-Marker (kein `#`) vor jedem neuen Inhaltsblock — erscheint nicht im Inhaltsverzeichnis.

#### Neue Übungs-Notiz / Bestehende erweitern

Prüfe ob bereits eine `Übungen.md` (oder ähnlich) im Fachordner existiert.
- **Falls ja**: `updated`-Property aktualisieren, Inhalt am Ende anhängen mit `**DD.MM.YY**` als Fetttext-Trenner
- **Falls nein**: Neue Datei erstellen:

```markdown
---
tags: [sem{n}, {kürzel_kleingeschrieben}]
type: exercise
date: {YYYY-MM-DD}
updated: {YYYY-MM-DD}
---
**{DD.MM.YY}**

{Aufgaben}
```

#### Bestehende Vorlesungs-Notiz erweitern

Wenn neuer Stoff zu einem existierenden Thema passt:
1. Bestehende Datei lesen
2. `updated`-Property im Frontmatter auf das heutige Datum setzen
3. Letzte Subsection-Nummer ermitteln (z.B. `## 5.3` → nächste ist `## 5.4`)
4. **`**DD.MM.YY**`** als Fetttext-Trenner vor dem neuen Inhalt einfügen
5. Neue Inhalte mit fortlaufender Nummerierung anhängen

Beispiel — Notiz endet bei `## 5.3`, neue Sitzung am 10.04.26:
```markdown
## 5.3 Bisheriger letzter Abschnitt
...

**10.04.26**

## 5.4 Neuer Abschnitt
...
```

#### Große Dateien aufteilen

Wenn eine Datei (z.B. langes PDF) mehrere klar getrennte Themen enthält, erstelle separate Notiz-Dateien für jedes Thema.

### 4.4 Vorlesungsfolien umformulieren

Wenn das Rohmaterial **Vorlesungsfolien eines Professors** sind (erkennbar an: Folientitel, Grafiken ohne Kontext), formuliere den Inhalt in den persönlichen Schreibstil des Vault-Besitzers um. Übernimm NICHT den Folienstil 1:1.

#### Stilrichtlinien (abgeleitet aus den bestehenden Notizen)

**Ton**: Schreibe wie ein Student, der Kommilitonen den Stoff erklärt — fachlich korrekt, aber zugänglich. Nicht wie ein Lehrbuch und nicht wie Folien-Stichpunkte.

**Definitionen**: Formale Definition zuerst (fett oder als Blockquote), dann sofort 2-3 Bulletpoints die erklären was es *praktisch* bedeutet:
```
__Definition: Grenzwert__
> Eine Folge $(a_n)$ konvergiert gegen $a$, wenn...

- **$\epsilon$**: Eine beliebig kleine, positive Zahl...
- $|a_n - a| < \epsilon$ bedeutet: der Abstand wird beliebig klein
```

**Struktur je nach Inhalt**:
- **Eigenschaften/Fakten** → Bulletpoints
- **Verfahren/Algorithmen** → Nummerierte Schritte
- **Beweise/Herleitungen** → Fließtext mit eingebetteter Mathematik

**Beweise**: Aussage → Beweisstrategie kurz nennen → Dichte Mathe-Ableitung → Ergebnis → Zusammenfassung als eingeklappter Callout:
```
> [!info]- Zusammenfassung
> Kurze Erklärung in eigenen Worten, warum der Beweis funktioniert
```

**Beispiele**: Direkt beim Konzept einbetten, nicht in separaten Abschnitten. Label: `__Bsp.:__` oder `__Beispiel:__`

**Persönliche Marker verwenden**:
- `Merke:` — für nicht-offensichtliche Fakten
- `Problem:` — für praktische Stolperfallen
- `Zu beachten:` — für wichtige Randbedingungen
- `Passt!` — wenn ein Ergebnis aufgeht / eine Probe stimmt

**Mathe im Text verweben**: Mathe ist nicht beiläufig — $\epsilon$-Notation, Variablen und Symbole gehören in den Satzfluss:
- Gut: "Man nimmt die Ungleichung $|a_n - a| < \epsilon$ und löst nach $n$ auf"
- Schlecht: "Man nimmt die Ungleichung und löst sie auf (siehe Formel unten)"

**Emphasis-Hierarchie**:
- `__fett__` für Definitionen und Schlüsselbegriffe
- `**fett**` für rhetorische Betonung im Fließtext
- `$mathe$` für technische Terme auch mitten im Satz

**Code-Beispiele** (bei Informatik-Fächern):
- Vollständige, lauffähige Beispiele mit ` ```run-c ` o.ä.
- Kommentare im Code auf Deutsch
- Ausgabe realistisch als Bash-Block mit `$`-Prompt zeigen

**Querverweise**: Am Ende `## Siehe auch` mit kurzer Erklärung:
```
## Siehe auch
- [[3. Mengenlehre]] — Mengenlehre mit Operationen und Beweisen (TGI)
```

#### Was NICHT tun

- **Nicht** den Folienstil übernehmen (kryptische Stichpunkte, Kontextlose Aufzählungen)
- **Nicht** Inhalte erfinden die nicht auf den Folien stehen
- **Nicht** zu akademisch/steif formulieren — der Ton ist studentisch-zugänglich
- **Nicht** Formeln vereinfachen oder weglassen — alle Mathe exakt übertragen
- **NIEMALS Inhalte weglassen** — jede Folie, jede Zeile, jedes Beispiel, jede Randnotiz muss in den Notizen landen. Umformulieren und neu strukturieren ist gewünscht, aber kürzen oder zusammenfassen auf Kosten von Details ist verboten.

### 4.5 Allgemeine Formatierung

- **Sprache**: Deutsch. Fachbegriffe dürfen englisch bleiben.
- **Inline-Mathe**: `$...$` — z.B. `$\frac{a}{b}$`
- **Block-Mathe**: `$$...$$` auf eigener Zeile
- **Wikilinks**: `[[Seitenname]]` für interne Verweise
- **Bilder einbetten**: `![[bildname.png]]` (ohne Pfad — Obsidian löst das auf)
- **Code-Blöcke**: Mit Sprach-Tag, z.B. ` ```c `
- **Überschriften**: `## {N}.{sub} Titel` innerhalb von Themen-Dateien
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

1. **NICHTS WEGLASSEN** — Jede einzelne Information aus den Rohmaterialien muss sich in den fertigen Notizen wiederfinden. Keine Zeile, keine Formel, kein Beispiel, kein Nebensatz darf verloren gehen. Umformulieren ja, kürzen nein. Im Zweifel lieber zu viel als zu wenig.
2. **Nie raten, immer fragen** — wenn Fach, Semester oder Zuordnung unklar ist, frage den Benutzer
3. **Bestehende Konventionen einhalten** — Frontmatter-Format, Ordnerstruktur, Nummerierung exakt wie im Vault
4. **Keine Inhalte erfinden** — nur niederschreiben was in den Quellen steht
5. **Mathe exakt übertragen** — LaTeX-Formeln sorgfältig und vollständig
6. **Qualität vor Geschwindigkeit** — lieber sauber als schnell
