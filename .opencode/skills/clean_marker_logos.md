# Skill: DHSN/BA Logos aus Marker-Outputs entfernen

## Beschreibung
Dieser Skill wird verwendet, um nach einer PDF-zu-Markdown-Konvertierung (z.B. via `marker`) redundante Logos (DHSN/BA Sachsen) aus dem `/marker/output/...` Ordner zu entfernen. Diese treten oft in verschiedenen Variationen auf und "müllen" den Ordner zu.

## Voraussetzungen
- Der Zielordner enthält eine `.md`-Datei und viele generierte Bilder (`.jpeg` oder `.png`).
- Python 3 und `Pillow` (`PIL`) sind verfügbar.

## Workflow

### 1. Analysephase (Dynamische Erkennung)
Lade **alle** Bilddimensionen in eine Liste, um Cluster zu erkennen. Führe dieses Skript aus:
```python
import os
from PIL import Image
from collections import Counter

dir_path = "PFAD_ZUM_ORDNER"
sizes = []

for filename in os.listdir(dir_path):
    if filename.endswith((".jpeg", ".png")):
        try:
            with Image.open(os.path.join(dir_path, filename)) as img:
                sizes.append(img.size)
        except: pass

# Zeige alle Größen sortiert nach Breite und Höhe
for size, count in sorted(Counter(sizes).items(), key=lambda x: x[0]):
    print(f"{size[0]}x{size[1]}: {count} Bilder")
```
**Wichtig:** Logos erscheinen oft als kleine Cluster oder Ausreißer. Untersuche die Liste nach Clustern von Bildern, die logisch wie Logos aussehen (oft sehr häufig vorkommend). **Prüfe stichprobenartig ein Bild aus einem Cluster, bevor du es löschst.**

### 2. Bereinigungsphase (Bilder & Markdown)
Wenn Logos identifiziert wurden, nutze für **jeden identifizierten Cluster** ein dediziertes Lösch-Skript, um keine inhaltlich wichtigen Grafiken zu löschen.
```python
import os
import re
from PIL import Image

dir_path = "PFAD_ZUM_ORDNER"
md_file_path = os.path.join(dir_path, "DATEINAME.md")

# Ziel-Dimensionen (Toleranzbereich angeben!)
target_w, target_h = (BREITE, HOEHE)
TOLERANZ = 10

def is_logo(w, h):
    return abs(w - target_w) <= TOLERANZ and abs(h - target_h) <= TOLERANZ

# Identifikation
to_delete = []
for filename in os.listdir(dir_path):
    if filename.endswith((".jpeg", ".png")):
        try:
            with Image.open(os.path.join(dir_path, filename)) as img:
                if is_logo(*img.size):
                    to_delete.append(filename)
        except: pass

# Löschen & MD Update
if os.path.exists(md_file_path):
    with open(md_file_path, "r", encoding="utf-8") as f:
        content = f.read()
    for f_name in to_delete:
        content = re.sub(rf"!\[\]\({re.escape(f_name)}\)", "", content)
    with open(md_file_path, "w", encoding="utf-8") as f:
        f.write(re.sub(r"\n\s*\n", "\n\n", content))

for f_name in to_delete:
    os.remove(os.path.join(dir_path, f_name))
    print(f"Deleted {f_name}")
```

### 3. Verifizierung
Prüfe nach dem Cleanup die verbleibenden Bildgrößen erneut, um sicherzustellen, dass keine wichtigen Diagramme gelöscht wurden (`find ...` Befehl oder erneut das Analyse-Skript).