# Skill: DHSN/BA Logos aus Marker-Outputs entfernen

## Beschreibung
Dieser Skill wird verwendet, um nach einer PDF-zu-Markdown-Konvertierung (z.B. via `marker`) die redundanten Logos der Dualen Hochschule Sachsen (DHSN) / BA Sachsen aus dem Export zu entfernen. Da das Logo auf nahezu jeder Folie auftaucht, generiert der Exporter für jede Seite ein eigenes Bild, was den Ordner zumüllt und den Lesefluss im Markdown stört.

## Voraussetzungen
- Der Zielordner enthält eine `.md`-Datei und viele generierte Bilder (meist `.jpeg` oder `.png`).
- Python 3 und das Paket `Pillow` (`PIL`) sind verfügbar, um Bilddimensionen auszulesen.

## Workflow

Der Agent soll diese Schritte strictly befolgen:

### Wichtige Regel zu Skripten
**Mülle niemals das Projektverzeichnis des Nutzers zu!** Verwende für alle in diesem Skill beschriebenen Schritte entweder Inline-Python (`python3 -c '...'`) oder lege temporäre Skript-Dateien ausschließlich im System-Temp-Ordner (z.B. `/tmp/`) an. Hinterlasse keine `.py` Dateien im Workspace.

### 1. Analysephase (Dynamische Erkennung)
Bevor Bilder gelöscht werden, müssen die genauen Dimensionen der Logos im aktuellen Foliensatz analysiert werden. Logos zeichnen sich dadurch aus, dass sie **sehr häufig** vorkommen und meist eine **geringe Höhe** aufweisen.

Führe ein Inline-Python-Skript (mit `python3 -c`) aus, um die häufigsten Bildgrößen zu finden:
```python
import os
from PIL import Image

dir_path = "PFAD_ZUM_ORDNER"
counts = {}

for filename in os.listdir(dir_path):
    if filename.endswith((".jpeg", ".png")):
        try:
            with Image.open(os.path.join(dir_path, filename)) as img:
                dims = img.size
                counts[dims] = counts.get(dims, 0) + 1
        except: pass

for dims, count in sorted(counts.items(), key=lambda x: x[1], reverse=True)[:10]:
    print(f"Dimension {dims[0]}x{dims[1]}: {count} Bilder")
```
*Leite aus dem Ergebnis die maximalen Logo-Dimensionen ab.*

### 2. Bereinigungsphase (Bilder & Markdown)
Schreibe und führe ein Inline-Python-Skript aus, das Folgendes tut:
1. Identifiziert alle Bilder, die unterhalb der in Schritt 1 definierten Schwellenwerte (Breite/Höhe) liegen.
2. Liest die `.md`-Datei ein.
3. Sucht nach den Markdown-Bildreferenzen der erkannten Logos (z.B. `![](_page_10_Picture_5.jpeg)`) und entfernt sie restlos aus dem Text, ohne Leerzeilen-Artefakte zu hinterlassen.
4. Löscht die identifizierten Logo-Dateien von der Festplatte.

### 3. Verifizierung
Führe nach dem Cleanup einen Bash-Befehl aus, um die **Anzahl und Größen** der verbleibenden Bilder zu prüfen (`find . -name "*.jpeg" -ls | awk '{print $7, $11}' | sort -n | head -n 10`). So stellst du sicher, dass keine wichtigen, großen Inhaltsbilder (wie Vorlesungs-Diagramme) versehentlich gelöscht wurden.
