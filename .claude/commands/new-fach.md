Lege ein neues Fach im Obsidian Vault an.

Argumente: $ARGUMENTS

Erwarte folgende Angaben (Beispiel: `-s 2 -k OOP -n "Objektorientierte Programmierung" -d "Konzepte der OOP in Java."`):
- `-s` Semester-Nummer
- `-k` Fach-Kürzel (Großbuchstaben, z.B. OOP)
- `-n` Vollständiger Fachname
- `-d` Kurzbeschreibung (optional)

Führe dann folgende Schritte aus:

1. **Emoji wählen**: Überlege spontan ein thematisch passendes Emoji für das Fach

2. **Ordner anlegen**:
   ```
   wiki/SEM{semester}/{emoji} {KÜRZEL}/
   ```

3. **Index-Datei erstellen** (`{emoji} {KÜRZEL}.md`) mit folgendem Inhalt:
   ```markdown
   # {Vollständiger Fachname}

   {Beschreibung, falls angegeben, ansonsten schreibe selbstständig eine}
   ```

4. **Bestätigung ausgeben**
