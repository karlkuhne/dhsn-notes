---
name: clean-marker-logos
description: Entfernt redundante Logos aus Marker-Output-Verzeichnissen
triggers: ["logos", "marker cleanup", "clean"]
---

# Skill: Logos aus Marker-Outputs entfernen

## Beschreibung
Dieser Skill wird verwendet, um nach einer PDF-zu-Markdown-Konvertierung (z.B. via `marker`) redundante Logos aus dem `/marker/output/...` Ordner zu entfernen. Diese treten oft in verschiedenen Variationen auf und "müllen" den Ordner zu.

## Bilderkennung: Ja oder Nein?
**WICHTIG:** Prüfe zuerst, ob du Bilder visuell erkennen kannst. Versuche dazu, ein Bild aus dem Zielordner mit dem `Read`-Tool zu lesen. Wenn das Tool eine Fehlermeldung wie *"Cannot read image (this model does not support image input)"* zurückgibt, **hast du keine Bilderkennung** und musst den heuristischen Pfad (Schritt 2b) nutzen. Wenn du das Bild beschreiben kannst, **nutze die visuelle Bestätigung** (Schritt 2a) — sie ist deutlich zuverlässiger.

## Voraussetzungen
- Der Zielordner enthält eine `.md`-Datei und viele generierte Bilder (`.jpeg` oder `.png`).
- Python 3 und `Pillow` (`PIL`) sind verfügbar.

## Workflow

### 1. Analysephase (immer ausführen)
Führe dieses Skript aus, um **alle** Bilddimensionen und Hash-Duplikate zu erkennen:
```python
import os, hashlib
from PIL import Image
from collections import defaultdict, Counter

dir_path = "PFAD_ZUM_ORDNER"

def file_hash(path):
    h = hashlib.md5()
    with open(path, "rb") as f:
        for chunk in iter(lambda: f.read(8192), b""):
            h.update(chunk)
    return h.hexdigest()

sizes = []
hash_groups = defaultdict(list)
file_sizes = {}

for filename in sorted(os.listdir(dir_path)):
    if filename.endswith((".jpeg", ".png")):
        fpath = os.path.join(dir_path, filename)
        try:
            with Image.open(fpath) as img:
                sizes.append(img.size)
            h = file_hash(fpath)
            hash_groups[h].append(filename)
            file_sizes[filename] = os.path.getsize(fpath)
        except: pass

print("=== Dimensions-Cluster ===")
for size, count in sorted(Counter(sizes).items(), key=lambda x: -x[1]):
    print(f"  {size[0]}x{size[1]}: {count} Bilder")

print("\n=== Hash-Duplikate (identische Bilddateien) ===")
dupes_found = False
for h, files in sorted(hash_groups.items(), key=lambda x: -len(x[1])):
    if len(files) > 1:
        dupes_found = True
        fpath = os.path.join(dir_path, files[0])
        with Image.open(fpath) as img:
            w, h_dim = img.size
        kb = file_sizes[files[0]] / 1024
        print(f"  {w}x{h_dim}, {kb:.0f}KB, {len(files)}x identisch: {files[:5]}{'...' if len(files) > 5 else ''}")
if not dupes_found:
    print("  Keine identischen Duplikate gefunden.")

print("\n=== Kleine Bilder (< 100KB, < 500px Breite) ===")
small_imgs = [(fn, file_sizes[fn]) for fn in file_sizes if file_sizes[fn] < 100_000]
for fn, sz in sorted(small_imgs, key=lambda x: x[1]):
    fpath = os.path.join(dir_path, fn)
    with Image.open(fpath) as img:
        w, h = img.size
    if w < 500:
        print(f"  {w}x{h}, {sz/1024:.0f}KB: {fn}")
```

**Auswertung der Analyse:**
- **Hash-Duplikate** (identische Dateien, die mehrfach vorkommen) sind mit sehr hoher Wahrscheinlichkeit **Logos**. Diese können sicher gelöscht werden.
- **Kleine Bilder** (< 500px Breite, < 100KB) sind Logo-Kandidaten, müssen aber nicht zwingend Logos sein (kleine Diagramme sind möglich).
- **Dimension-Cluster** mit vielen gleichgroßen Bildern deuten auf wiederkehrende Elemente (Logos, Seitenkopfzeilen) hin.

### 2. Bereinigungsphase

#### Schritt 2a: Hash-basierte Duplikate löschen (immer, unabhängig von Bilderkennung)
Alle Bilder, deren MD5-Hash mehrfach vorkommt, sind garantiert identisch und mit sehr hoher Wahrscheinlichkeit Logos. Davon bleibt **ein Exemplar** erhalten (als Referenz), der Rest wird gelöscht.
```python
import os, re, hashlib
from PIL import Image

dir_path = "PFAD_ZUM_ORDNER"
md_file_path = os.path.join(dir_path, "DATEINAME.md")

def file_hash(path):
    h = hashlib.md5()
    with open(path, "rb") as f:
        for chunk in iter(lambda: f.read(8192), b""):
            h.update(chunk)
    return h.hexdigest()

hash_to_files = {}
for filename in sorted(os.listdir(dir_path)):
    if filename.endswith((".jpeg", ".png")):
        fpath = os.path.join(dir_path, filename)
        h = file_hash(fpath)
        if h not in hash_to_files:
            hash_to_files[h] = []
        hash_to_files[h].append(filename)

to_delete = []
for h, files in hash_to_files.items():
    if len(files) > 1:
        fpath = os.path.join(dir_path, files[0])
        with Image.open(fpath) as img:
            w, h_dim = img.size
        if w < 500 or len(files) >= 3:
            to_delete.extend(files)
        else:
            to_delete.extend(files[1:])

if os.path.exists(md_file_path):
    with open(md_file_path, "r", encoding="utf-8") as f:
        content = f.read()
    for f_name in to_delete:
        content = re.sub(rf"!\[\]\({re.escape(f_name)}\)\s*", "", content)
    content = re.sub(r"\n\s*\n\s*\n", "\n\n", content)
    with open(md_file_path, "w", encoding="utf-8") as f:
        f.write(content)

for f_name in to_delete:
    os.remove(os.path.join(dir_path, f_name))
    print(f"Deleted {f_name}")
print(f"Insgesamt {len(to_delete)} Duplikate/Logos gelöscht.")
```

#### Schritt 2b: Logo-Kandidaten endgültig identifizieren

**Wähle den Pfad basierend auf deiner Bilderkennung:**

---

**PFAD A: Mit Bilderkennung (bevorzugt)**

Nutze das Read-Tool, um stichprobenartig je ein Bild aus jedem verbleibenden kleinen-Bilder-Cluster visuell zu prüfen. Lese 3-5 repräsentative Kandidaten und entscheide anhand des visuellen Inhalts:
- Typische Logos: kleine Institutionslogos, Hochschulwappen, "Bildbearbeitung"-Header-Grafiken, Seitennummern-Grafiken
- Keine Logos: Diagramme, Formelgrafiken, Code-Screenshots, Tabellenbilder

Sammle alle bestätigten Logos in einer Löschliste und fahre mit Schritt 2c fort.

---

**PFAD B: Ohne Bilderkennung (heuristisch)**

Wenn keine Bilderkennung verfügbar, nutze folgende Heuristiken zur Logo-Erkennung:
1. **Dimensions-Cluster**: Bilder gleicher Größe, die mehrfach auftreten, sind sehr wahrscheinlich Logos oder Seitenkopfzeilen.
2. **Sehr kleine Bilder** (< 160px in beiden Dimensionen, < 5KB): Mit sehr hoher Wahrscheinlichkeit Logos.
3. **Markdown-Kontext**: Prüfe den umgebenden Text der Bildreferenz in der `.md`-Datei. Logos stehen oft:
   - Am Anfang einer Seite (direkt nach einer Überschrift)
   - Kurz vor oder nach wiederkehrendem Text wie "Bildbearbeitung", "Dr.", Seitennummern
   - Isoliert in einer eigenen Zeile ohne inhaltlichen Bezug
4. **Dateinamen-Muster**: `_page_N_Picture_M.jpeg` (Picture statt Figure) deutet eher auf Logos hin.

Für jeden identifizierten Cluster:
```python
import os, re
from PIL import Image

dir_path = "PFAD_ZUM_ORDNER"
md_file_path = os.path.join(dir_path, "DATEINAME.md")

target_w, target_h = (BREITE, HOEHE)
TOLERANZ = 10

def is_target(w, h):
    return abs(w - target_w) <= TOLERANZ and abs(h - target_h) <= TOLERANZ

to_delete = []
for filename in os.listdir(dir_path):
    if filename.endswith((".jpeg", ".png")):
        try:
            with Image.open(os.path.join(dir_path, filename)) as img:
                if is_target(*img.size):
                    to_delete.append(filename)
        except: pass

print(f"Kandidaten zum Löschen ({len(to_delete)}):")
for f in sorted(to_delete):
    fpath = os.path.join(dir_path, f)
    size_kb = os.path.getsize(fpath) / 1024
    print(f"  {f} ({size_kb:.0f}KB)")

bestaetigen = input("Alle oben genannten Dateien löschen? (j/n): ")
if bestaetign.lower() == "j":
    if os.path.exists(md_file_path):
        with open(md_file_path, "r", encoding="utf-8") as f:
            content = f.read()
        for f_name in to_delete:
            content = re.sub(rf"!\[\]\({re.escape(f_name)}\)\s*", "", content)
        content = re.sub(r"\n\s*\n\s*\n", "\n\n", content)
        with open(md_file_path, "w", encoding="utf-8") as f:
            f.write(content)

    for f_name in to_delete:
        os.remove(os.path.join(dir_path, f_name))
        print(f"Deleted {f_name}")
```

#### Schritt 2c: Löschen und Markdown bereinigen (beide Pfade)
Unabhängig vom gewählten Pfad: Nachdem die Logo-Liste final steht, lösche alle identifizierten Dateien und bereinige die Markdown-Referenzen:
```python
import os, re

dir_path = "PFAD_ZUM_ORDNER"
md_file_path = os.path.join(dir_path, "DATEINAME.md")
to_delete = ["datei1.jpeg", "datei2.jpeg"]  # Die identifizierten Logos

if os.path.exists(md_file_path):
    with open(md_file_path, "r", encoding="utf-8") as f:
        content = f.read()
    for f_name in to_delete:
        content = re.sub(rf"!\[\]\({re.escape(f_name)}\)\s*", "", content)
    content = re.sub(r"\n\s*\n\s*\n", "\n\n", content)
    with open(md_file_path, "w", encoding="utf-8") as f:
        f.write(content)

for f_name in to_delete:
    os.remove(os.path.join(dir_path, f_name))
    print(f"Deleted {f_name}")
print(f"Insgesamt {len(to_delete)} Logos gelöscht.")
```

### 3. Verifizierung
Prüfe nach dem Cleanup:
1. Führe das Analyse-Skript aus Schritt 1 erneut aus — es sollten keine Hash-Duplikate mehr erscheinen.
2. Prüfe die Markdown-Datei auf leere Zeilen oder fehlerhafte Bildreferenzen.
3. Stelle sicher, dass keine inhaltlich wichtigen Diagramme gelöscht wurden (Anzahl der verbleibenden Bilder plausibel?).
4. **Mit Bilderkennung:** Stichprobenartig ein verbleibendes Bild lesen um zu bestätigen, dass echte Diagramme erhalten bleiben.
