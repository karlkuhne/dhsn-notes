---
tags:
  - sem2
  - bidru
type: exercise
sources:
  - Aufgaben_BB.pdf
date: 2026-04-29
updated: 2026-04-29
---
**29.04.26**

# Aufgaben zur Bildbearbeitung

> [!info] Dieses Thema existiert auch in: [[1. Digitale Bilder Grundbegriffe]] (BIDRU)
> Theoretische Grundlagen zu diesem Thema: [[2. Bildformate]], [[3. Chroma-Subsampling]]

## Grundlagen & Kompression

### Digitale Bilder: Grundbegriffe

> [!todo]
> (1) Was versteht man unter Bildgröße und Auflösung?

- **Bildgröße:** Die Abmessungen eines Bildes, für die Bildschirmdarstellung typischerweise in Pixel angegeben (Breite x Höhe).
- **Auflösung:** Die Anzahl der Pixel pro Längeneinheit auf einem Ausgabegerät (typischerweise in **ppi** - pixels per inch). Sie bestimmt den Zusammenhang zwischen der digitalen Pixelanzahl und der physischen Druckgröße.


> [!todo]
> (2) Was versteht man unter Farbauflösung (bzw. Farbtiefe), Farbkanal und indizierter Speicherung?

- **Farbtiefe (Farbauflösung):** Die Anzahl der Farben, die pro Pixel gespeichert werden können, ausgedrückt in Bit (z. B. 24 Bit für True Color).
- **Farbkanal:** Ein Teil der Bildinformation, der sich auf eine Primärkomponente eines Farbmodells bezieht (z. B. Rot-, Grün- oder Blau-Kanal im RGB-Modell).
- **Indizierte Speicherung:** Ein Verfahren, bei dem eine Farbtabelle (**Palette**) mit den im Bild vorkommenden Farben erstellt wird. Pro Pixel wird dann nur noch der Index in dieser Tabelle gespeichert (platzsparend).


> [!todo]
> (3) Berechnen Sie den Speicherplatzbedarf eines Bildes der Größe $1440 \times 960$ Pixel mit 56 Farben (RGB, 24 Bit/Pixel) in Byte
> - a) ohne Verwendung einer Farbtabelle
> - b) mit Verwendung einer Farbtabelle
> - c) Wie ist die Druckgröße des Bildes in cm bei einer Auflösung von 192 ppi?

Pixelanzahl = $1440 \times 960 = 1.382.400$ Pixel

**a) Ohne Farbtabelle (24 Bit/Pixel):**
$1.382.400 \text{ px} \times 24 \text{ Bit/px} = 33.177.600 \text{ Bit}$
$33.177.600 / 8 = \mathbf{4.147.200 \text{ Byte}}$ (~3,95 MB)

**b) Mit Farbtabelle (Index-Speicherung):**
Für 56 Farben werden $\lceil \log_2(56) \rceil = 6 \text{ Bit}$ pro Pixel benötigt.
Index-Daten: $1.382.400 \times 6 = 8.294.400 \text{ Bit}$
Palette: $56 \text{ Farben} \times 24 \text{ Bit} = 1.344 \text{ Bit}$
Gesamt: $8.295.744 \text{ Bit} / 8 = \mathbf{1.036.968 \text{ Byte}}$ (~0,99 MB)

**c) Druckgröße bei 192 ppi:**
Breite: $1440 / 192 = 7,5 \text{ Zoll} \times 2,54 = \mathbf{19,05 \text{ cm}}$
Höhe: $960 / 192 = 5 \text{ Zoll} \times 2,54 = \mathbf{12,7 \text{ cm}}$


> [!todo]
> (4) Was ist Dithering?

**Dithering** ist eine Technik zur Darstellung von Farbverläufen bei reduzierter Farbpalette. Dabei werden verfügbare Farben in Punktmustern so angeordnet, dass das Auge aus der Entfernung den Eindruck einer Mischfarbe oder eines sanften Übergangs erhält (optische Farbmischung).


> [!todo]
> (5) Wozu dient der Alphakanal? In welchem Farbformat wird er unterstützt? Wieviel Bit pro Pixel sind notwendig, wenn zusätzlich zu Echtfarben auch der Alphakanal mit 8 Bit berücksichtigt werden soll?

- **Zweck:** Speicherung des Grades der Deckkraft bzw. Transparenz eines Pixels.
- **Formate:** Unterstützt z. B. in PNG, TIFF oder im RGBA-Modell.
- **Bits pro Pixel:** $24 \text{ Bit (RGB)} + 8 \text{ Bit (Alpha)} = \mathbf{32 \text{ Bit pro Pixel}}$.

### 4.1.2 Chroma-Subsampling

> [!todo]
> (1) Ein Bild im RGB-Format (unkomprimiert, 24 Bit/Pixel) soll ins YCbCr-Format überführt werden. Hierbei findet eine Unterabtastung der Farbkanäle statt (Chroma-Subsampling). Wieviel Speicherplatz kann mit den unten in x:y:z-Notation dargestellten Subsampling-Varianten gespart werden? Füllen Sie die Tabelle aus.

| Chroma-Subsampling | Speicherplatzersparnis in % |
| ------------------ | --------------------------- |
| 4:4:4              | 0%                          |
| 4:2:2              | 33.3%                       |
| 4:2:0              | 50%                         |
| 4:1:1              | 50%                         |
| 4:1:0              | 59%                         |

> [!todo]
> (2) Ein Bild der Größe 5,76 Megapixel (1 Megapixel = 1 Million Pixel) und mit einem Seitenverhältnis von 16:9 (Breite: Höhe) liegt im YCbCr-Farbmodell vor (Auflösung von 8 Bit/Kanal).
> - a) Berechnen Sie Breite und Höhe des Bildes in Pixeln.
> - b) Berechnen Sie den Speicherplatzbedarf des Bildes unter Verwendung von 4:1:1 Chroma-Subsampling.

a)
$16x \cdot 9x = 5.760.000 \Rightarrow x = 200$
w: $16 \cdot 200 = 3200$ px
h: $9 \cdot 200 = 1800$ px

b)
Bei 4:1:1 entfallen pro 4 Pixel:
Y: 4 Samples
Cb: 1 Sample
Cr: 1 Sample
→ 6 Samples × 8 Bit = 48 Bit pro 4 Pixel
→ 48 Bit / 4 = 12 Bit pro Pixel

$5.760.000 \text{ Pixel } \cdot 12 \text{ Bit } = 69.120.000 \text{ Bit } = 8.640.000 \text{ Byte }$

### 4.1.3 JPEG-Kompression

> [!todo]
> (4) Was sind Ortsfrequenzen?

Ortsfrequenzen beschreiben, wie schnell sich Helligkeitswerte **im Raum** (also über die Pixelpositionen hinweg) ändern. Niedrige Ortsfrequenzen = langsamer Helligkeitswechsel (große gleichmäßige Flächen), hohe Ortsfrequenzen = schnelle Wechsel (Kanten, feine Details).

> [!todo]
> (5) Welche Aufgabe hat die Discrete Cosinus Transformation?

Die **DCT** transformiert die Pixelwerte eines Bildblocks (Ortsraum) in Frequenzkoeffizienten (Frequenzraum). Jeder Koeffizient gibt an, wie stark eine bestimmte Ortsfrequenz im Bildblock vertreten ist: niedrige Koeffizienten stehen für gleichmäßige Flächen, hohe für Kanten und feine Details.

> [!todo]
> (6) Warum wird ein Bild für die Kompression zunächst in den Frequenzraum überführt?

Im Frequenzraum lassen sich die Koeffizienten nach ihrer Wahrnehmungsrelevanz trennen: Das menschliche Auge ist für die höchsten Frequenzen (feinste Texturen, einzelnes Pixelrauschen, winzige Helligkeitsschwankungen) wenig empfindlich. Durch die Überführung in den Frequenzraum können gezielt die hochfrequenten Koeffizienten stärker quantisiert werden, während niedrige (Helligkeit, Flächen) und mittlere (Kanten) weitgehend erhalten bleiben. Das spart Speicherplatz, ohne den visuellen Eindruck stark zu beeinträchtigen.

> [!todo]
> (7) Bei welchem Schritt der JPEG-Kompression treten Verluste auf?

Bei der **Quantisierung**. Hier werden die DCT-Koeffizienten durch Division mit einer Quantisierungsmatrix gerundet, wodurch Informationen irreversibel verloren gehen. Alle anderen Schritte (Farbraumkonvertierung, DCT, Entropiekodierung) sind verlustfrei bzw. umkehrbar.

> [!todo]
> (8) Für welches Bild ist JPEG besser geeignet: Für ein Cartoon-Bild mit vielen einfarbigen Flächen (A) oder ein Foto eines Laubbaumes (B)? Begründen Sie kurz!

**B (Foto eines Laubbaumes).** Fotos enthalten natürliche, kontinuierliche Übergänge mit vielen feinen Texturen — hier sind die hochfrequenten Anteile, die bei der Quantisierung verloren gehen, weniger auffällig. Cartoons haben scharfe Kanten und große einfarbige Flächen; hier fallen Quantisierungsartefakte (Blockartefakte, Ringing an Kanten) deutlich auf.

> [!todo]
> (9) Welche alternativen Formate gibt es für die verlustbehaftete Bildkompression?

## 4.2 Bildanalyse & Punktoperationen

### 4.2.1 Histogramme

> [!info] Theoretische Grundlagen: [[6. Histogramme]]

> [!todo]
> (1) Mit welcher Datenstruktur kann man ein Histogramm im Speicher des Computers am einfachsten repräsentieren?

> [!todo]
> (2) Welchen Vorteil hat die logarithmische Histogrammdarstellung?

> [!todo]
> (3) Was ist Binning und wann bietet sich dessen Anwendung an?

> [!todo]
> (4) Was ist ein normalisiertes Histogramm?

> [!todo]
> (5) Was ist das kumulative Histogramm?

> [!todo]
> (6) Es soll ein Histogramm der Größe 16 eines 8-bit-Grauwertbildes angezeigt werden. Bestimmen Sie die Länge der Intensitätsintervalle, wenn diese gleich lang sind. Geben Sie die Grenzen des 13. Intervalls an.

> [!todo]
> (7) In der Funktion `binnedHistogram` (s. Vorlesung) sind B und K konstant. Überlegen Sie, warum es dennoch nicht sinnvoll ist, den Wert von B/K außerhalb der Schleifen im Voraus zu berechnen.

> [!todo]
> (8) Gegeben sei das untenstehende Bild mit den Graustufen 0 bis 3. Skizzieren Sie das herkömmliche Histogramm, das Klassenhistogramm für die Histogrammgröße B=2, das kumulative Histogramm $H(i)$ sowie die Verteilungsfunktion $P(i)$.

| 3   | 2   |
| --- | --- |
| 3   | 0   |

### 4.2.2 Homogene Punktoperationen

> [!todo]
> (1) Wodurch ist eine Punktoperation gekennzeichnet?

> [!todo]
> (2) Was ist Clamping?

> [!todo]
> (3) Nennen Sie verschiedene Punktoperationen!

> [!todo]
> (4) Wofür wird Thresholding verwendet?

> [!todo]
> (5) Welches Ziel wird bei der Histogrammanpassung verfolgt?

> [!todo]
> (6) Ist es möglich, dass Bild (b) durch Anwendung einer homogenen Punktoperation aus Bild (a) hervorgegangen ist? Begründen Sie Ihre Entscheidung!

![[Aufgaben Bildbearbeitung/4-page_2_Figure_0.jpeg]]

> [!todo]
> (7) Skizzieren Sie folgende Funktionsgraphen für Punktoperationen ($i = 0, 1, \dots, 255$)! Um welche Arten von Punktoperationen handelt es sich jeweils?
> - a) $f(i) = 2 \cdot i$
> - b) $f(i) = i + 20$
> - c) $f(i) = 255 - i$
> - d) $f(i) = 0$ für $i < 100$; $f(i) = 255$ für $i \ge 100$

> [!todo]
> (8) Welche der drei Graphen $f_1, f_2$ and $f_3$ stellen homogene Punktoperationen dar? Begründen Sie Ihre Entscheidung!

![[Aufgaben Bildbearbeitung/4-page_2_Figure_8.jpeg]]

> [!todo]
> (9) Gegeben sei untenstehendes Histogramm eines 8-Bit-Grauwertbildes. Welchen Grauwert nimmt ein Pixel des Bildes mit dem Grauwert 128 nach einer Autokontrastanpassung auf den Wertebereich $[0, 255]$ an?

![[Aufgaben Bildbearbeitung/4-page_2_Figure_10.jpeg]]

> [!todo]
> (10) Bildbearbeitung mit Programmen
> Untenstehender Pseudocode soll auf 8-bit Graustufenbilder angewendet werden. Um welche Art von Operation handelt es sich? Kreuzen Sie die richtige(n) Antwort(en) an.
> - [ ] Homogene Punktoperation
> - [ ] Inhomogene Punktoperation
> - [ ] Schwellwertbildung
> - [ ] Gammafunktion

```java
// image ist das Bild
int w = image.getWidth();
int h = image.getHeight();
for (int v = 0; v < h; v++) {
    for (int u = 0; u < w; u++) {
        int oldPixel = image.getPixel(u, v);
        // Math.cbrt liefert die dritte Wurzel des Argumentes
        // (datatype)x konvertiert x in datatype
        int newPixel = (int) (Math.cbrt((double)oldPixel/255.0) * 255.0);
        image.putPixel(u, v, newPixel);
    }
}
```

> [!todo]
> (11) Histogrammanpassung
> Gegeben sei ein 8 Bit-Graustufenbild mit $1024 \times 768$ Pixeln. Die kumulierte Häufigkeit des Grauwertes $a_1 = 56$ im Ausgangsbild sei $H_A(a_1) = 314573$. Die kumulierte Häufigkeit des Grauwertes $a_2 = 240$ sei $H_A(a_2) = 707789$.
> Gegeben ist zudem eine stückweise lineare Referenzverteilung $P_L(i)$.
> Berechnen Sie, welche Grauwerte Pixel mit den Grauwerten $a_1$ und $a_2$ nach einer Histogramm-Anpassung auf $P_L(i)$ annehmen, d.h. berechnen Sie $a_1' = f_{hs}(a_1)$ und $a_2' = f_{hs}(a_2)$!

> [!todo]
> (12) Autokontrast und Histogrammausgleich
> Einzelne Extremwerte im Bild können die Autokontrastanpassung verhindern (z.B. einzelner schwarzer Punkt im Bild). Können derartige Extremwerte auch einen Histogrammausgleich verhindern?

> [!todo]
> (13) Klassifizierung von Punktoperationen
> Gegeben ist folgende Look-Up-Tabelle (LUT) für die Graustufen $i = 0, 1, 2, 3$ (2 Bit/Pixel). Als welche Art von Punktoperation lässt sich die in der LUT dargestellte Abbildung $f$ klassifizieren?

| $i$ | $f(i)$ |
| --- | ------ |
| 0   | 0      |
| 1   | 1      |
| 2   | 2      |
| 3   | 3      |
*(Hinweis: Tabellendaten aus OCR unklar, Platzhalter für Identitätsabbildung)*

## 4.3 Filtertechniken

### 4.3.1 Grundlagen Filter

> [!todo]
> (1) Warum ist die Anzahl der Zeilen und Spalten einer Filtermatrix ungerade?

> [!todo]
> (2) Warum sollte die Summe der Filterkoeffizienten bei Weich- und Scharfzeichnern Eins sein?

> [!todo]
> (3) Warum ist bei Filtern keine In-Place-Ausführung möglich?

> [!todo]
> (4) Testen Sie verschiedene Glättungsfilter mit GIMP, verwenden Sie unterschiedliche Filtergrößen ($3 \times 3, 5 \times 5$).

> [!todo]
> (5) Wie müsste beispielhaft eine Filtermatrix aussehen, die ausschließlich senkrechte Kanten im Bild extrahiert?

### 4.3.2 Lineare & Nichtlineare Filter

> [!todo]
> (6) Gegeben sei ein Bild der Größe $3 \times 3$ Pixel mit den folgenden Werten:
> | 55  | 75  | 77  |
> | --- | --- | --- |
> | 199 | 40  | 135 |
> | 91  | 10  | 225 |
> Filtern Sie das Bild mittels eines linearen Filters der Größe $1 \times 3$ (Spalten $\times$ Zeilen) mit einem Faltungskern $H = [0.25, 0.5, 0.25]^T$.

> [!todo]
> (7) Was bedeutet x/y-Separierbarkeit (bezogen auf einen linearen Filter) and warum ist sie wichtig?

> [!todo]
> (8) Erklären Sie, warum etwa die folgende Gewichtsmatrix eines gewichteten Median-Filters nicht sinnvoll ist:
> $$W(i,j) = \begin{bmatrix} 0 & 1 & 0 \\ 1 & 5 & 1 \\ 0 & 1 & 0 \end{bmatrix}$$

> [!todo]
> (9) Überprüfen Sie die Eigenschaften des Dirac-Impulses in Bezug auf lineare Filter.

> [!todo]
> (10) Gegeben sei ein Bild der Größe $3 \times 3$ Pixel (Werte siehe oben):
> - a) Filtern Sie das Bild mittels eines Maximum-Filters der Größe $1 \times 3$.
> - b) Filtern Sie das Bild mittels eines Minimum-Filters der Größe $1 \times 3$.
> - c) Filtern Sie das Bild mittels eines Median-Filters der Größe $1 \times 3$.
> - d) Filtern Sie das Bild mittels eines gewichteten Median-Filters der Größe $3 \times 1$ mit der Gewichtsmatrix $W = [1, 3, 1]$.

![[Aufgaben Bildbearbeitung/4-page_5_Figure_8.jpeg]]

---
## Review & Learning
> [!summary] Zusammenfassung
> Diese Übung umfasst die grundlegenden Konzepte der digitalen Bildverarbeitung, angefangen bei Farbtiefe und Speicherplatzberechnung über Kompressionsverfahren wie JPEG und Chroma-Subsampling bis hin zu Bildverbesserungstechniken mittels Punktoperationen (Histogrammanpassung, Autokontrast) und Filtertechniken (Faltung, Median-Filter).

> [!question] Mögliche Prüfungsfragen
> - Wie berechnet sich die Speicherplatzersparnis bei verschiedenen Chroma-Subsampling-Varianten?
> - Erklären Sie den Unterschied zwischen homogenen und inhomogenen Punktoperationen.
> - Warum ist die Separierbarkeit von Filtern für die Recheneffizienz wichtig?
