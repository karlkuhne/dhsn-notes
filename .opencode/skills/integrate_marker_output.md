# Skill: Marker-Output in Wiki integrieren

## Beschreibung
Dieser Skill nimmt das von `marker` konvertierte Markdown (und die Bilder) aus einem Ausgabe-Verzeichnis (z.B. `@marker/output/Vorlesungsname`) und integriert es strukturiert und formatgerecht in die Obsidian-Vault unter `wiki/`.

## Argumente
- `$ARGUMENTS` (optional): Kontext (z.B. "Das ist die 5. Vorlesung für NatGl", "Neues Fach Mechanik im 2. Semester")

---

## SCHRITT 1: ORIENTIERUNG UND SCAN

Analysiere `$ARGUMENTS` und den Inhalt des Marker-Ordners, um den Kontext zu verstehen.

Führe **parallel** aus:
1. `ls marker/output/` (oder das vom User genannte Verzeichnis)
2. `ls wiki/SEM*/` — welche Semester und Fächer existieren bereits?
3. Finde die `.md`-Datei und den zugehörigen Bilder-Ordner im Marker-Output.
4. Lese die ersten ~100 Zeilen der `.md`-Datei (`head -n 100 ...`), um das genaue Thema zu begreifen.

Kläre die Zuordnung (ggf. durch das `question` Tool, falls unklar):
- **Semester:** Zu welchem Semester gehört das? (Falls der User ein neues Semester erwähnt -> neues anlegen)
- **Fach:** Welches Fachkürzel und Emoji sollen verwendet werden? (Wenn nichts angegeben, leite es aus dem Dateinamen/Text ab oder ordne es der bestehenden Struktur zu)
- **Modus:** Ist es ein völlig neues Fach, eine neue Vorlesung (neue Nummer `{N}`) oder ein Update einer bestehenden Notiz?

---

## SCHRITT 2: STRUKTUR VORBEREITEN / WENN NÖTIG NEUES FACH ANLEGEN

1. **Fach-Ordner:** Falls das Fach nicht existiert (weil der User ein neues Fach erwähnt hat oder es sich aus dem Kontext zwingend ergibt):
   - Emoji wählen (passend zum Fach)
   - Ordner anlegen: `wiki/SEM{n}/{emoji} {KÜRZEL}/`
   - Index-Datei (`wiki/SEM{n}/{emoji} {KÜRZEL}/{emoji} {KÜRZEL}.md`) anlegen mit Standardstruktur:
     ```markdown
     # {Fachname}
     {Beschreibung}
     ## Vorlesungen
     ## Übungen
     ```
2. **Ziel-Dateiname:** Bestimme die nächste freie Nummer `{N}` im Ziel-Fachordner und extrahiere den **inhaltlichen Titel** aus dem Dokument (nicht zwingend den rohen Dateinamen): `wiki/SEM{n}/{emoji} {KÜRZEL}/{N}. {Titel}.md`.
3. **Bilder-Ordner:** Bestimme den Ziel-Bildordner: `images/{KÜRZEL}/`.

---

## SCHRITT 3: BILDER VERSCHIEBEN UND LINKS ANPASSEN

Marker generiert kryptische Bildnamen (z.B. `_page_10_Figure_5.jpeg`). Das muss an die Vault-Konventionen angepasst werden!

1. Erstelle ein Mapping der vorhandenen Bilder.
2. Verschiebe alle Bilder aus dem Marker-Ordner nach `images/{KÜRZEL}/{N}-{beschreibender_name}.jpeg` (oder übernimm den Originalnamen, falls schwer beschreibbar, aber setze `{N}-` davor, um Namenskonflikte zu vermeiden).
3. **WICHTIG:** Passe alle Bild-Links im Marker-Markdown an das Obsidian-Wikilink-Format an:
   - *Alt:* `![](_page_10_Figure_5.jpeg)`
   - *Neu:* `![[{N}-page_10_Figure_5.jpeg]]` (bzw. der neue Name)

Nutze hierfür ein Python-Skript (Inline oder im `/tmp/` Verzeichnis!) oder `sed`, um die Links in der `.md` Datei massenhaft und sicher zu ersetzen.

---

## SCHRITT 4: INHALT TRANSFORMIEREN & FORMATIEREN

Der Marker-Output ist oft "rohes" Markdown und hält sich nicht an die Stilrichtlinien.
Lies die Datei stückweise (oder ganz, wenn sie klein genug ist) und schreibe sie in die Zieldatei um. 

**Exakte Formatierungsregeln für die Ziel-Datei**

1. **Frontmatter setzen:**
   ```markdown
   ---
   tags: [sem{n}, {kürzel_kleingeschrieben}]
   type: lecture
   sources: ["{Ursprünglicher PDF-Name}"]
   date: {YYYY-MM-DD}
   updated: {YYYY-MM-DD}
   ---
   ```
2. **Datum:** Unter dem Frontmatter das Datum als fettgedruckten Text: `**{DD.MM.YY}**`
3. **Überschriften (Logische Gruppierung & Nummerierung):**
   - **SEHR WICHTIG:** Vermeide extrem flache Hierarchien (wie z.B. von `1.1` bis `1.60`). Gruppiere thematisch zusammenhängende Abschnitte stattdessen unter neuen, logischen Oberbegriffen (`## {N}.X`), sodass die eigentlichen Abschnitte zu Unterpunkten (`### {N}.X.Y`) werden.
   - Ändere die Überschriften-Ebenen (`#`, `##`, `###`) so, dass sie bei `.1` beginnen, z.B.:
     `## {N}.1 {Themenblock}`
     `### {N}.1.1 {Unterpunkt}`
   - Flache Überschriften aus dem Marker-Output müssen aktiv in eine tiefere Struktur (`{N}.X.Y` oder `{N}.X.Y.Z`) umstrukturiert oder als einfache fette Zwischenüberschriften (`**Text**`) formatiert werden, um das Inhaltsverzeichnis kompakt und lesbar zu halten.
4. **Callouts (Obsidian-Stil):**
   - Marker macht oft `> Definition:` oder ähnliches. Wandle dies um in:
     `> [!abstract] Definition: ...`
   - Warnungen: `> [!warning] Zu beachten: ...`
   - Merksätze: `> [!tip] Merke: ...`
5. **Mathematik:** Überprüfe, dass Inline-Math `$ ... $` und Block-Math `$$ ... $$` korrekt von Marker übernommen wurden und in Obsidian rendern. Repariere offensichtliche OCR-Fehler. Nichts vereinfachen, LaTeX exakt übernehmen!
6. **Code-Blöcke:** Kontrolliere generierte Code-Blöcke. Füge die korrekte Sprache hinzu (` ```python `) und formatiere wenn nötig nach.
7. **Tabellen:** Stelle sicher, dass Tabellen nicht durch den PDF-Parser zerstört wurden. Sie müssen vollständig und als echtes Markdown formatiert sein.
8. **Zusammenfassung:** Füge am Ende der Datei zwingend die Review-Sektion an:
   ```markdown
   ---
   ## Review & Learning
   > [!summary] Zusammenfassung
   > ... (aus dem Text generiert)
   
   > [!question] Mögliche Prüfungsfragen
   > - ...
   ```

---

## SCHRITT 5: VERLINKUNG (INTELLIGENT & KONTEXTUELL)

Die Verlinkung ist einer der wichtigsten Schritte, um aus isolierten Marker-Outputs ein echtes, vernetztes Wissensnetzwerk zu machen.

### 5.1 Index aktualisieren
In der Fach-Übersicht (`wiki/SEM{n}/{emoji} {KÜRZEL}/{emoji} {KÜRZEL}.md`):
- Trage die neue Notiz ein: `- [[{N}. {Thema}]]`

### 5.2 Cross-Subject Scan & Link (Top-of-File)
Bevor du die Formatierung abschließt, scanne (`grep`) den gesamten `wiki/`-Ordner nach dem aktuellen Hauptthema.
1. **Identische Themen:** Wenn z.B. "Vektoren" schon in Mathe existiert und jetzt in Mechanik vorkommt, setze ganz oben unter den Frontmatter:
   `> [!info] Dieses Thema existiert auch in: [[Andere Notiz]] ({ANDERES_FACH})`
2. **Thematische Verwandtschaft:** Wenn die neue Notiz Grundlagen für ein anderes Fach liefert oder darauf aufbaut:
   `> [!info] Theoretische Grundlagen zu diesem Thema: [[...]]`

### 5.3 In-Text Verlinkung (Kontextuelles Linking)
Während du den Marker-Text formatierst und umschreibst:
1. **Begriffs-Scan:** Identifiziere Schlüsselbegriffe (z.B. "Kinematik", "Ableitung", "Integral"), zu denen bereits Notizen in der Vault existieren.
2. **Präzise Platzierung:** Setze den Wikilink direkt beim ersten Vorkommen im Text.
3. **Kontextuelle Aliase:** Nutze Aliase, damit der Lesefluss nicht gestört wird: `...berechnet sich durch das [[4. Das Integral|Integral]]...` anstelle von unschönen "Siehe auch"-Listen am Ende.

### 5.4 Bidirektionale Verlinkung (Back-Linking - EXTREM WICHTIG)
Die Vernetzung darf keine Einbahnstraße sein!
1. **Bestand scannen:** Nutze `grep` im `wiki/`-Ordner, um zu schauen, ob der Titel deiner *neuen* Notiz (oder deren Kernbegriffe) schon in *alten* Notizen erwähnt wurde.
2. **Alte Notizen editieren:** Wenn eine alte Notiz das Thema bisher nur als Stichwort erwähnt hat, öffne die alte Notiz und verlinke dieses Stichwort auf die neue Notiz.
3. **Top-of-File in alten Notizen:** Wenn das Thema identisch ist (siehe 5.2), füge die `> [!info]` Box auch oben in der **bereits existierenden** Notiz ein, damit beide Seiten aufeinander verweisen.

---

## SCHRITT 6: AUFRÄUMEN UND COMMIT

1. Wenn die Transformation erfolgreich war und die Zieldatei sauber aussieht, lösche den ursprünglichen Ordner (z.B. `marker/output/NatGl_MI_Mechanik/`).
2. Führe einen Git-Commit aus: `{KÜRZEL}: {Titel} (via Marker) importiert`.

## WICHTIGE REGELN
- **Nichts weglassen:** Der gesamte Text aus dem Marker-Output muss übernommen werden.
- **Keine Skripte im Projektordner:** Nutze für Skripte `/tmp/` oder `python3 -c`.
