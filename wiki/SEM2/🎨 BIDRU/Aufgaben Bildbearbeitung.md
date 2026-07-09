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

Neben JPEG u.a.:
- **WebP** (Google; unterstützt auch einen verlustfreien Modus)
- **HEIF/HEIC** (basiert auf dem HEVC-Videocodec, deutlich effizienter als JPEG bei gleicher Qualität)
- **AVIF** (basiert auf dem AV1-Videocodec, noch neuer/effizienter)
- **JPEG 2000** (nutzt Wavelet- statt DCT-Transformation)
- **JPEG XL** (geplantes Nachfolgeformat für klassisches JPEG)

## 4.2 Bildanalyse & Punktoperationen

### 4.2.1 Histogramme

> [!info] Theoretische Grundlagen: [[6. Histogramme]]

> [!todo]
> (1) Mit welcher Datenstruktur kann man ein Histogramm im Speicher des Computers am einfachsten repräsentieren?

Ein **Array** mit $K$ Einträgen (bei 8-Bit: $K=256$). Der Grauwert $i$ dient direkt als Array-Index, der gespeicherte Wert ist $h(i)$, die Anzahl der Pixel mit genau diesem Grauwert (siehe [[6. Histogramme#6.2.1 Histogramm berechnen|6.2.1]]).

> [!todo]
> (2) Welchen Vorteil hat die logarithmische Histogrammdarstellung?

Sie macht auch **seltene Grauwerte sichtbar**: Bei linearer Darstellung dominieren die häufigsten Werte das Diagramm so stark, dass seltene Werte (kleine Balken) kaum noch erkennbar sind. Die logarithmische Skala staucht große Unterschiede zusammen, wodurch auch kleine Häufigkeiten sichtbar bleiben (siehe [[6. Histogramme#6.3.1 Lineare und Logarithmische Darstellung|6.3.1]]).

> [!todo]
> (3) Was ist Binning und wann bietet sich dessen Anwendung an?

**Binning** fasst mehrere benachbarte Grauwerte zu einem gemeinsamen Balken (Bin) zusammen, statt jeden einzelnen Grauwert separat darzustellen. Es bietet sich an, wenn der Wertebereich sehr groß ist (z.B. 12- oder 16-Bit-Bilder mit Tausenden möglicher Werte) und ein Histogramm mit einem Balken pro Wert unübersichtlich bzw. zu feinkörnig wäre (siehe [[6. Histogramme#6.4 Binning — Histogramme für große Wertebereiche|6.4]]).

> [!todo]
> (4) Was ist ein normalisiertes Histogramm?

Ein Histogramm, das statt der absoluten Pixelanzahl $h(i)$ den **relativen Anteil** $p(i) = h(i)/(M \cdot N)$ zeigt — also welcher Bruchteil aller Pixel die Helligkeit $i$ hat. Das macht Histogramme unterschiedlich großer Bilder vergleichbar und erlaubt eine Wahrscheinlichkeitsinterpretation (siehe [[6. Histogramme#6.6.2 Normalisierte Histogramme|6.6.2]]).

> [!todo]
> (5) Was ist das kumulative Histogramm?

Das kumulative Histogramm $H(i) = \sum_{j=0}^{i} h(j)$ gibt an, wie viele Pixel eine Helligkeit **kleiner oder gleich** $i$ haben — im Gegensatz zum normalen Histogramm $h(i)$, das nur die Pixel mit **genau** der Helligkeit $i$ zählt (siehe [[6. Histogramme#6.6.1 Kumulatives Histogramm (Summenhistogramm)|6.6.1]]).

> [!todo]
> (6) Es soll ein Histogramm der Größe 16 eines 8-bit-Grauwertbildes angezeigt werden. Bestimmen Sie die Länge der Intensitätsintervalle, wenn diese gleich lang sind. Geben Sie die Grenzen des 13. Intervalls an.

Bei einem 8-Bit-Bild gibt es $K=256$ mögliche Grauwerte. Bei $B=16$ gleich langen Intervallen ist die Intervalllänge:
$$K/B = 256/16 = 16$$
Das $k$-te Intervall (1-indiziert) umfasst die Grauwerte $[(k-1) \cdot 16,\; k \cdot 16 - 1]$. Für das **13. Intervall** ($k=13$):
$$[(13-1) \cdot 16,\; 13 \cdot 16 - 1] = \mathbf{[192,\ 207]}$$

> [!todo]
> (7) In der Funktion `binnedHistogram` (s. Vorlesung) sind B und K konstant. Überlegen Sie, warum es dennoch nicht sinnvoll ist, den Wert von B/K außerhalb der Schleifen im Voraus zu berechnen.

Die Bin-Zuordnung erfolgt über `bin = i * B / K` — **für jeden Grauwert $i$ einzeln**, mit Ganzzahl-Division erst am Ende. Würde man $B/K$ stattdessen einmalig vorab als eigene Ganzzahl-Variable berechnen und cachen, würde dabei **vorzeitig gerundet**: z.B. $B/K = 2/5 = 0$ (Integer-Division), obwohl $i \cdot B / K$ für größere $i$ durchaus $\geq 1$ ergeben würde. Die Reihenfolge **erst multiplizieren, dann dividieren** ist also entscheidend für eine korrekte Bin-Zuordnung — ein vorab berechnetes $B/K$ rundet zu früh und liefert für die meisten $i$ falsche Bins.

> [!todo]
> (8) Gegeben sei das untenstehende Bild mit den Graustufen 0 bis 3. Skizzieren Sie das herkömmliche Histogramm, das Klassenhistogramm für die Histogrammgröße B=2, das kumulative Histogramm $H(i)$ sowie die Verteilungsfunktion $P(i)$.

| 3   | 2   |
| --- | --- |
| 3   | 0   |

**Lösung:** Pixelwerte (zeilenweise): $3, 2, 3, 0$ → 4 Pixel gesamt, $M \cdot N = 4$.

**a) Herkömmliches Histogramm $h(i)$:**

| $i$ | 0 | 1 | 2 | 3 |
|---|---|---|---|---|
| $h(i)$ | 1 | 0 | 1 | 2 |

**b) Klassenhistogramm ($B=2$ Bins, Bin-Breite $4/2=2$ Graustufen):**

| Bin | Werte | Anzahl |
|---|---|---|
| 0 | 0–1 | $h(0)+h(1) = 1$ |
| 1 | 2–3 | $h(2)+h(3) = 3$ |

**c) Kumulatives Histogramm $H(i)$:**

| $i$ | 0 | 1 | 2 | 3 |
|---|---|---|---|---|
| $H(i)$ | 1 | 1 | 2 | 4 |

**d) Verteilungsfunktion $P(i) = H(i)/(M \cdot N)$:**

| $i$ | 0 | 1 | 2 | 3 |
|---|---|---|---|---|
| $P(i)$ | 0,25 | 0,25 | 0,5 | 1,0 |

### 4.2.2 Homogene Punktoperationen

> [!todo]
> (1) Wodurch ist eine Punktoperation gekennzeichnet?

Der neue Pixelwert hängt **ausschließlich vom alten Wert desselben Pixels** ab, $a' = f(a)$ — nie von den Nachbarpixeln. Bei einer **homogenen** Punktoperation hängt $f$ dabei zusätzlich nicht von der Position $(u,v)$ ab (siehe [[7. Homogene Punktoperationen#7.1.1 Grundkonzept|7.1.1]]).

> [!todo]
> (2) Was ist Clamping?

Clamping begrenzt berechnete Pixelwerte, die außerhalb des gültigen Wertebereichs liegen (z.B. $<0$ oder $>255$), auf die jeweilige Grenze — z.B. wird ein berechneter Wert von 300 auf 255 begrenzt (siehe [[7. Homogene Punktoperationen#7.3.2 Problem: Clamping (Werte begrenzen)|7.3.2]]).

> [!todo]
> (3) Nennen Sie verschiedene Punktoperationen!

- Helligkeit/Kontrast anpassen (Addition/Multiplikation, [[7. Homogene Punktoperationen#7.3 Kontrast und Helligkeit anpassen|7.3]])
- Invertierung ([[7. Homogene Punktoperationen#7.4 Invertierung (Negativbild erzeugen)|7.4]])
- Schwellwertbildung/Thresholding ([[7. Homogene Punktoperationen#7.5 Schwellwertbildung (Thresholding)|7.5]])
- Autokontrast und modifizierter Autokontrast ([[7. Homogene Punktoperationen#7.6 Automatische Kontrastanpassung (Autokontrast)|7.6]], [[7. Homogene Punktoperationen#7.7 Modifizierte Autokontrastfunktion (Robuste Variante)|7.7]])
- Histogrammanpassung/-ausgleich ([[7. Homogene Punktoperationen#7.9 Histogrammanpassung (Histogram Matching)|7.9]])
- Gammakorrektur ([[7. Homogene Punktoperationen#7.10 Die Gammafunktion|7.10]])

> [!todo]
> (4) Wofür wird Thresholding verwendet?

Für **Dokumenten-Scans** (Schwarze Schrift auf weißem Papier), **Bildanalyse** (Trennung von Objekten und Hintergrund) und allgemein zur **Binarisierung** von Graustufenbildern (siehe [[7. Homogene Punktoperationen#7.5.3 Praktisches Beispiel: Schwarz-Weiß-Konvertierung|7.5.3]]).

> [!todo]
> (5) Welches Ziel wird bei der Histogrammanpassung verfolgt?

Die Helligkeitsverteilung eines Bildes soll so verändert werden, dass sie einer **Referenzverteilung** (einem anderen Bild oder einer mathematischen Zielverteilung) entspricht — z.B. damit mehrere Fotos derselben Serie einheitlich aussehen (siehe [[7. Homogene Punktoperationen#7.9.2 Die Lösung: Histogrammanpassung|7.9.2]]).

> [!todo]
> (6) Ist es möglich, dass Bild (b) durch Anwendung einer homogenen Punktoperation aus Bild (a) hervorgegangen ist? Begründen Sie Ihre Entscheidung!

![[Aufgaben Bildbearbeitung/4-page_2_Figure_0.jpeg]]

**Lösung:** **Ja, das ist möglich.**

Für eine homogene Punktoperation muss gelten: **Gleicher Eingabewert → immer derselbe Ausgabewert**, egal an welcher Position. Prüft man das für jeden in (a) vorkommenden Grauwert:
- **Schwarz** (3× in (a)) → wird in (b) immer zu Schwarz
- **Mittelgrau** (2× in (a), oben Mitte/rechts) → wird in (b) beide Male zu Weiß
- **Hellgrau** (2× in (a)) → wird in (b) beide Male zu Weiß
- **Weiß** (2× in (a)) → bleibt in (b) Weiß

Jeder Grauwert wird also **konsistent** auf denselben Zielwert abgebildet — es gibt keinen Widerspruch (kein Fall, in dem der gleiche Eingabewert zu unterschiedlichen Ausgabewerten führt). Das entspricht genau einer **Schwellwertoperation** ([[7. Homogene Punktoperationen#7.5 Schwellwertbildung (Thresholding)|7.5]]): Nur Schwarz (0) bleibt Schwarz, alles andere wird zu Weiß.

> [!todo]
> (7) Skizzieren Sie folgende Funktionsgraphen für Punktoperationen ($i = 0, 1, \dots, 255$)! Um welche Arten von Punktoperationen handelt es sich jeweils?
> - a) $f(i) = 2 \cdot i$
> - b) $f(i) = i + 20$
> - c) $f(i) = 255 - i$
> - d) $f(i) = 0$ für $i < 100$; $f(i) = 255$ für $i \ge 100$

Alle vier sind **homogene Punktoperationen** ($f$ hängt nur von $i$ ab, nicht von der Position) — unterschiedliche Typen:

- **a)** Gerade durch den Ursprung mit Steigung 2 → **Kontrastverstärkung** (Multiplikation, [[7. Homogene Punktoperationen#7.3.1 Grundkonzept: Zwei einfache Operationen|7.3.1]]). Ab $i>127$ wird $f(i)>255$ → **Clamping** nötig.
- **b)** Nach oben verschobene Gerade mit Steigung 1 → **Helligkeitserhöhung** (Addition, [[7. Homogene Punktoperationen#7.3.1 Grundkonzept: Zwei einfache Operationen|7.3.1]]). Ab $i>235$ ebenfalls Clamping nötig.
- **c)** Fallende Gerade mit Steigung $-1$ → **Invertierung** ([[7. Homogene Punktoperationen#7.4 Invertierung (Negativbild erzeugen)|7.4]]).
- **d)** Sprungfunktion mit einer Stufe bei $i=100$ → **Schwellwertbildung/Thresholding** mit $a_{\text{th}}=100$ ([[7. Homogene Punktoperationen#7.5 Schwellwertbildung (Thresholding)|7.5]]).

> [!todo]
> (8) Welche der drei Graphen $f_1, f_2$ and $f_3$ stellen homogene Punktoperationen dar? Begründen Sie Ihre Entscheidung!

![[Aufgaben Bildbearbeitung/4-page_2_Figure_8.jpeg]]

**Entscheidendes Kriterium:** Eine homogene Punktoperation ist einfach eine Funktion $f(i)$ — jedem Eingabewert $i$ muss **genau ein** Ausgabewert zugeordnet sein (jede senkrechte Linie darf die Kurve nur einmal schneiden). **Stetigkeit oder Monotonie sind dafür nicht erforderlich** — auch ein Sprung (Diskontinuität) ist erlaubt, solange die Kurve dabei einwertig bleibt (genau das nutzt z.B. die Schwellwertbildung in Aufgabe 7d aus).

- **$f_1$:** Hat einen Sprung, bleibt dabei aber einwertig (zu jedem $i$ gehört weiterhin nur ein Ausgabewert) → **gültige homogene PO**, nur mit einer Unstetigkeitsstelle.
- **$f_2$:** Stetig und einwertig → **gültige homogene PO**.
- **$f_3$:** Eine waagerechte Linie, also $f(i)=\text{konstant}$ für alle $i$ → ist zwar einwertig und damit formal ebenfalls eine **gültige (aber degenerierte) homogene PO** — das Ergebnis wäre allerdings ein komplett einfarbiges Bild, da jede Information über $i$ verloren geht.

> [!todo]
> (9) Gegeben sei untenstehendes Histogramm eines 8-Bit-Grauwertbildes. Welchen Grauwert nimmt ein Pixel des Bildes mit dem Grauwert 128 nach einer Autokontrastanpassung auf den Wertebereich $[0, 255]$ an?

![[Aufgaben Bildbearbeitung/4-page_2_Figure_10.jpeg]]

**Lösung:** Aus dem Histogramm: $a_{\text{low}}=56$, $a_{\text{high}}=211$. Mit der Autokontrast-Formel ([[7. Homogene Punktoperationen#7.6.3 Mathematik des Autokontrastsr|7.6.3]]):

$$a' = \frac{a - a_{\text{low}}}{a_{\text{high}} - a_{\text{low}}} \cdot 255 = \frac{128 - 56}{211 - 56} \cdot 255 = \frac{72}{155} \cdot 255 \approx 118{,}45 \approx \mathbf{118}$$

> [!todo]
> (10) Bildbearbeitung mit Programmen
> Untenstehender Pseudocode soll auf 8-bit Graustufenbilder angewendet werden. Um welche Art von Operation handelt es sich? Kreuzen Sie die richtige(n) Antwort(en) an.
> - [x] Homogene Punktoperation
> - [ ] Inhomogene Punktoperation
> - [ ] Schwellwertbildung
> - [x] Gammafunktion

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

**Begründung:** `newPixel` hängt nur von `oldPixel` ab, nicht von $(u,v)$ → **homogene Punktoperation**. Zusätzlich entspricht die Formel exakt dem Muster $\left(\frac{a}{a_{\max}}\right)^{\gamma} \cdot a_{\max}$ aus [[7. Homogene Punktoperationen#7.11.2 Allgemeine Formel für beliebige Geräte|7.11.2]] — denn `Math.cbrt(x)` ist nichts anderes als $x^{1/3}$. Es handelt sich also um eine **Gammafunktion** mit $\gamma = \tfrac{1}{3}$ (da $\gamma<1$, wird das Bild in dunklen Bereichen aufgehellt, siehe [[7. Homogene Punktoperationen#7.10.2 Mathematische Definition und Eigenschaften|7.10.2]]).

> [!todo]
> (11) Histogrammanpassung
> Gegeben sei ein 8 Bit-Graustufenbild mit $1024 \times 768$ Pixeln. Die kumulierte Häufigkeit des Grauwertes $a_1 = 56$ im Ausgangsbild sei $H_A(a_1) = 314573$. Die kumulierte Häufigkeit des Grauwertes $a_2 = 240$ sei $H_A(a_2) = 707789$.
> Gegeben ist zudem eine stückweise lineare Referenzverteilung $P_L(i)$.
> Berechnen Sie, welche Grauwerte Pixel mit den Grauwerten $a_1$ und $a_2$ nach einer Histogramm-Anpassung auf $P_L(i)$ annehmen, d.h. berechnen Sie $a_1' = f_{hs}(a_1)$ und $a_2' = f_{hs}(a_2)$!

**Teillösung — der Teil, der ohne die Referenzverteilung berechenbar ist:** Der erste Schritt jeder Histogrammanpassung ist immer, die kumulierte Wahrscheinlichkeit $P_A(a) = H_A(a)/(M \cdot N)$ im Ausgangsbild zu bestimmen ([[7. Homogene Punktoperationen#7.9.5 Mathematische Grundidee|7.9.5]]). Mit $M \cdot N = 1024 \cdot 768 = 786.432$:

$$P_A(a_1) = \frac{314573}{786432} \approx \mathbf{0{,}40} \qquad P_A(a_2) = \frac{707789}{786432} \approx \mathbf{0{,}90}$$

**Der fehlende Schritt:** Um daraus $a_1'$ und $a_2'$ zu berechnen, müsste man anschließend (wie in [[7. Homogene Punktoperationen#Probeklausur|Aufgabe 8 der Probeklausur]] demonstriert) die Stützpunkte der stückweisen linearen Referenzverteilung $P_L(i)$ nehmen, das Segment finden, in dem $P_L(i) = 0{,}40$ bzw. $0{,}90$ liegt, und linear interpolieren.

> [!warning] Fehlende Angabe
> Die konkreten Stützpunkte von $P_L(i)$ sind in der digitalisierten Aufgabenstellung nicht enthalten (vermutlich eine Grafik/Tabelle im Original-PDF, die hier nicht erfasst wurde). Ohne diese Werte lässt sich die Interpolation nicht abschließen — bitte die Stützpunkte aus der Original-Vorlage ergänzen, dann lässt sich nach dem Muster von Aufgabe 8 in [[7. Homogene Punktoperationen]] zu Ende rechnen.

> [!todo]
> (12) Autokontrast und Histogrammausgleich
> Einzelne Extremwerte im Bild können die Autokontrastanpassung verhindern (z.B. einzelner schwarzer Punkt im Bild). Können derartige Extremwerte auch einen Histogrammausgleich verhindern?

**Nein, deutlich weniger stark.** Der Grund liegt darin, worauf sich die beiden Verfahren jeweils stützen:

- **Autokontrast** nutzt nur $a_{\text{low}} = \min(a)$ und $a_{\text{high}} = \max(a)$ ([[7. Homogene Punktoperationen#7.6.3 Mathematik des Autokontrastsr|7.6.3]]) — ein **einzelner** Ausreißer-Pixel bestimmt direkt eine dieser beiden Grenzen und kann die gesamte Spreizung verzerren (siehe [[7. Homogene Punktoperationen#7.7.1 Das Problem mit normalem Autokontrast|7.7.1]]).
- **Histogrammausgleich** nutzt dagegen das **komplette kumulative Histogramm** $H(a)/(M \cdot N)$ — ein einzelner Ausreißer-Pixel trägt nur einen Beitrag von $1/(M \cdot N)$ zur kumulierten Häufigkeit bei, bei einem großen Bild also einen verschwindend geringen Anteil.

Da der Ausgleich auf der **gesamten Verteilung** basiert statt auf zwei Extremwerten, wirkt sich ein einzelner Ausreißer praktisch nicht messbar aus — Histogrammausgleich ist von Natur aus deutlich robuster gegenüber solchen Einzelfehlern als Autokontrast.

> [!todo]
> (13) Klassifizierung von Punktoperationen
> Gegeben ist folgende Look-Up-Tabelle (LUT) für die Graustufen $i = 0, 1, 2, 3$ (2 Bit/Pixel). Als welche Art von Punktoperation lässt sich die in der LUT dargestellte Abbildung $f$ klassifizieren?

| $i$ | $f(i)$ |
| --- | ------ |
| 0   | 0      |
| 1   | 1      |
| 2   | 2      |
| 3   | 3      |

**Lösung:** $f(i) = i$ für alle $i$ — das ist die **Identitätsabbildung**. Sie ist zwar formal eine homogene Punktoperation (hängt nur von $i$ ab), verändert aber **kein einziges Pixel** — das Ausgabebild ist identisch zum Eingabebild. Es handelt sich also um eine **triviale/neutrale Punktoperation** ohne jeglichen Effekt (vergleichbar mit der Dirac-Funktion als neutralem Element der Faltung, siehe [[8. Filter#8.11.1 Das neutrale Element: Die Dirac-Funktion|8.11.1]] — nur eben für Punktoperationen statt Filter).

## 4.3 Filtertechniken

### 4.3.1 Grundlagen Filter

> [!todo]
> (1) Warum ist die Anzahl der Zeilen und Spalten einer Filtermatrix ungerade?

Eine ungerade Anzahl von Zeilen und Spalten ist nötig, um einen **eindeutigen Mittelpunkt (Hot Spot)** zu haben.

**Begründung:**
- Bei einer ungeraden Matrix (z.B. 3×3, 5×5, 7×7) gibt es immer genau einen zentralen Pixel
- Dieser zentrale Pixel ist der Referenzpunkt, um den herum die Filterkoeffizenten symmetrisch angeordnet sind
- Das Koordinatensystem hat seinen Ursprung in der Mitte (z.B. bei 3×3: i,j ∈ {-1, 0, +1})

> [!todo]
> (2) Warum sollte die Summe der Filterkoeffizienten bei Weich- und Scharfzeichnern Eins sein?

Die Summe sollte 1 sein, um die **Gesamthelligkeit des Bildes zu bewahren**.

**Mathematisch:**
$$\sum_{i,j} H(i,j) = 1$$

**Begründung:**

Wenn alle Filterkoeffizenten summiert 1 ergeben, bleibt die durchschnittliche Helligkeit eines konstant hellen Bereiches erhalten.

Wenn in einem Bildbereich alle Pixel den Wert 100 haben:
- Neuer Wert = (100 + 100 + 100 + 100 + 100 + 100 + 100 + 100 + 100) × (1/9) = 100 ✓
- Die Helligkeit bleibt unverändert

> [!todo]
> (3) Warum ist bei Filtern keine In-Place-Ausführung möglich?

Bei Filtern muss man **zwei separate Bilder verwenden** (Quellbild und Zielbild), weil der neue Pixelwert von den **Nachbarpixeln abhängt**, die sich während der Berechnung noch ändern würden.

Wenn wir für Pixel (0,1) mit Wert 20 ein 3×3 Filter anwenden:
- Neuer Wert = Filter(10, 20, 30, 40, 50, 60, 70, 80, 90)
- Angenommen, neuer Wert ist 45
- Wir schreiben: `image[0][1] = 45`

Wenn wir dann das nächste Pixel berechnen (0,2) mit Wert 30:
- Das Filter braucht Pixel (0,1), aber wir haben es schon überschrieben!
- Neuer Wert = Filter(20, **45**, ?, 50, ?, ?, 80, ?, ?)
  - Das Pixel in Position (0,1) hat jetzt Wert **45** statt original **20**
  - Das Ergebnis ist **falsch**!

> [!todo]
> (4) Testen Sie verschiedene Glättungsfilter mit GIMP, verwenden Sie unterschiedliche Filtergrößen ($3 \times 3, 5 \times 5$).

*(Praktische Übung in GIMP — kein textuell lösbarer Rechenteil. Erwartete Beobachtung gemäß [[8. Filter#8.5.2 Visuelle Beispiele|8.5.2]] und [[8. Filter#8.7.3 Größere Filter = stärkere Glättung|8.7.3]]: Je größer das Filter, desto stärker die Glättung, aber auch desto mehr Unschärfe.)*

> [!todo]
> (5) Wie müsste beispielhaft eine Filtermatrix aussehen, die ausschließlich senkrechte Kanten im Bild extrahiert?

Das **Laplace-Filter** für Kantenerkennung:

$$
H = [-1, 2, -1]
$$

**Wie es funktioniert:**
- Der Mittelpunkt bekommt Gewicht +2
- Die Nachbarn bekommen Gewicht -1
- Das Filter berechnet die **zweite Ableitung** (Unterschied der Unterschiede)

**Praktische Bedeutung:**
- An Kanten (starke Helligkeitswechsel) → großer Wert
- In homogenen Bereichen (konstant) → Wert = 0
- Erkennt abrupte Übergänge sehr gut

(Siehe [[8. Filter|8. Filter]] Abschnitt 8.8.2 — Laplace-Filter)

### 4.3.2 Lineare & Nichtlineare Filter

> [!todo]
> (6) Gegeben sei ein Bild der Größe $3 \times 3$ Pixel mit den folgenden Werten (Graustufen im Intervall [0, 255]):
> $$\begin{bmatrix}
> 55 & 75 & 77 \\
> 199 & 40 & 135 \\
> 91 & 10 & 225
> \end{bmatrix}$$
>
> Außerhalb des Bildes soll der Wert 0 angenommen werden. Filtern Sie das Bild mittels eines linearen Filters der Größe $1 \times 3$ (Spaltenzahl $\times$ Zeilenzahl, „Hotspot" im Zentrum) mit einem Faltungskern mit den Werten:
> $$H = \begin{bmatrix} 0.25 \\ 0.5 \\ 0.25 \end{bmatrix}$$
> Streichen Sie die Nachkommastellen. Tragen Sie das Ergebnis in die Matrix ein.

**Lösung:**

Das ist ein **vertikales Filter** (1 Spalte, 3 Zeilen). Für jede Position berechnen wir:
$$I'(u,v) = I(u,v-1) \times 0.25 + I(u,v) \times 0.5 + I(u,v+1) \times 0.25$$

**Berechnungen für jede Position:**

| Position | Rechnung | Ergebnis |
|----------|----------|----------|
| (0,0) | 0×0.25 + 55×0.5 + 199×0.25 | 77 |
| (1,0) | 0×0.25 + 75×0.5 + 40×0.25 | 47 |
| (2,0) | 0×0.25 + 77×0.5 + 135×0.25 | 72 |
| (0,1) | 55×0.25 + 199×0.5 + 91×0.25 | 136 |
| (1,1) | 75×0.25 + 40×0.5 + 10×0.25 | 41 |
| (2,1) | 77×0.25 + 135×0.5 + 225×0.25 | 143 |
| (0,2) | 199×0.25 + 91×0.5 + 0×0.25 | 95 |
| (1,2) | 40×0.25 + 10×0.5 + 0×0.25 | 15 |
| (2,2) | 135×0.25 + 225×0.5 + 0×0.25 | 146 |

**Gefiltertes Bild:**
$$
\begin{bmatrix}
77 & 47 & 72 \\
136 & 41 & 143 \\
95 & 15 & 146
\end{bmatrix}
$$



> [!todo]
> (7) Was bedeutet x/y-Separierbarkeit (bezogen auf einen linearen Filter) and warum ist sie wichtig?

Ein 2D-Filter $H$ ist **separierbar**, wenn er sich als Produkt zweier 1D-Filter schreiben lässt: $H(i,j) = H_x(i) \cdot H_y(j)$. Man kann die Faltung dann in zwei nacheinander ausgeführte 1D-Faltungen (erst alle Zeilen, dann alle Spalten) aufspalten, siehe [[8. Filter#8.12 Separierbare Filter: Effizienztrick|8.12]].

**Warum wichtig?** Reine Effizienz: Ein $n \times n$-Filter braucht direkt $n^2$ Multiplikationen pro Pixel, separiert dagegen nur $2n$ — bei einem $51\times51$-Gaußfilter z.B. $2601$ statt $102$ Operationen, also **rund 25× schneller** (siehe [[8. Filter#8.12.4 Effizienz-Vergleich|8.12.4]]).

> [!todo]
> (8) Erklären Sie, warum etwa die folgende Gewichtsmatrix eines gewichteten Median-Filters nicht sinnvoll ist:
> $$W(i,j) = \begin{bmatrix} 0 & 1 & 0 \\ 1 & 5 & 1 \\ 0 & 1 & 0 \end{bmatrix}$$

**Lösung:** Beim gewichteten Median wird jeder Pixelwert entsprechend seinem Gewicht mehrfach in die Sortierfolge aufgenommen (siehe [[8. Filter#8.19 Gewichteter Median-Filter|8.19]]). Die Gesamtsumme der Gewichte hier ist $0+1+0+1+5+1+0+1+0 = 9$.

Das Zentrum hat alleine das Gewicht **5** — und $5 > 9/2 = 4{,}5$, also **mehr als die Hälfte** der Gesamtgewichtung. Damit landet der Zentrumswert in der sortierten Liste **immer** an der mittleren Position, unabhängig davon, welche Werte die Nachbarn haben — der Median entspricht also immer exakt dem ursprünglichen Zentrumspixel.

**Konsequenz:** Der Filter verändert das Bild **überhaupt nicht** (Identitätsabbildung) — er hat schlicht keine Wirkung und ist damit als Rauschfilter nutzlos. (Dieselbe Rechenlogik zeigt sich auch bei der Gewichtsmatrix `[1,1,4]` in [[8. Filter#Probeklausur|Aufgabe 12d der Probeklausur]] — dort dominiert stattdessen der rechte Nachbar mit Mehrheitsgewicht.)

> [!todo]
> (9) Überprüfen Sie die Eigenschaften des Dirac-Impulses in Bezug auf lineare Filter.

Der **Dirac-Kernel** $\delta$ (überall 0, nur im Zentrum eine 1) ist das **neutrale Element der Faltung**: $I * \delta = I$ — jedes damit gefilterte Bild bleibt unverändert, weil nur das Zentrum ein Gewicht $\neq 0$ hat und alle Nachbarn wegfallen (siehe [[8. Filter#8.11.1 Das neutrale Element: Die Dirac-Funktion|8.11.1]]).

Faltet man umgekehrt ein **Bild**, das wie $\delta$ aussieht (überall 0, ein einzelner heller Punkt), mit einem beliebigen Filter $H$, erscheint an der Position des Punkts exakt die **Form des Filterkernels** selbst — das ist die **Impulsantwort** des Filters, in der Optik als **Point Spread Function** bekannt (siehe [[8. Filter#8.11.2 Impulsantwort und Point Spread Function|8.11.2]]).

> [!todo]
> (10) Gegeben sei ein Bild der Größe $3 \times 3$ Pixel (Werte siehe oben):
> - a) Filtern Sie das Bild mittels eines Maximum-Filters der Größe $1 \times 3$.
> - b) Filtern Sie das Bild mittels eines Minimum-Filters der Größe $1 \times 3$.
> - c) Filtern Sie das Bild mittels eines Median-Filters der Größe $1 \times 3$.
> - d) Filtern Sie das Bild mittels eines gewichteten Median-Filters der Größe $3 \times 1$ mit der Gewichtsmatrix $W = [1, 3, 1]$.

![[Aufgaben Bildbearbeitung/4-page_5_Figure_8.jpeg]]

**Lösung:** Wie in Aufgabe 6 gilt die Konvention **Spaltenzahl × Zeilenzahl**: $1 \times 3$ (a–c) ist also wieder das **vertikale** Filter aus Aufgabe 6 (1 Spalte, 3 Zeilen — oben/Zentrum/unten in derselben Spalte); $3 \times 1$ (d) ist dagegen ein **horizontales** Filter (3 Spalten, 1 Zeile — links/Zentrum/rechts in derselben Zeile). Randwert weiterhin $0$.

Ausgangsbild:
$$\begin{bmatrix} 55 & 75 & 77 \\ 199 & 40 & 135 \\ 91 & 10 & 225 \end{bmatrix}$$

**a) Maximum-Filter (vertikal, je Spalte: oben/Zentrum/unten):**

| Spalte | Werte (mit Rand) | Maxima (oben→unten) |
|---|---|---|
| 0 | $0, 55, 199, 91, 0$ | $199,\ 199,\ 199$ |
| 1 | $0, 75, 40, 10, 0$ | $75,\ 75,\ 40$ |
| 2 | $0, 77, 135, 225, 0$ | $135,\ 225,\ 225$ |

$$\begin{bmatrix} 199 & 75 & 135 \\ 199 & 75 & 225 \\ 199 & 40 & 225 \end{bmatrix}$$

**b) Minimum-Filter (vertikal):**

| Spalte | Minima (oben→unten) |
|---|---|
| 0 | $0,\ 55,\ 0$ |
| 1 | $0,\ 10,\ 0$ |
| 2 | $0,\ 77,\ 0$ |

$$\begin{bmatrix} 0 & 0 & 0 \\ 55 & 10 & 77 \\ 0 & 0 & 0 \end{bmatrix}$$

**c) Median-Filter (vertikal):**

| Spalte | 3er-Gruppen sortiert | Mediane (oben→unten) |
|---|---|---|
| 0 | $[0,55,199]$; $[55,91,199]$; $[0,91,199]$ | $55,\ 91,\ 91$ |
| 1 | $[0,40,75]$; $[10,40,75]$; $[0,10,40]$ | $40,\ 40,\ 10$ |
| 2 | $[0,77,135]$; $[77,135,225]$; $[0,135,225]$ | $77,\ 135,\ 135$ |

$$\begin{bmatrix} 55 & 40 & 77 \\ 91 & 40 & 135 \\ 91 & 10 & 135 \end{bmatrix}$$

**d) Gewichteter Median-Filter (horizontal, $W=[1,3,1]$: links×1, Zentrum×3, rechts×1):**

Gesamtgewicht $= 1+3+1=5$. Da das Zentrum mit Gewicht 3 bereits **mehr als die Hälfte** von 5 hat ($3 > 2{,}5$), landet der Zentrumswert bei jeder Berechnung an der mittleren Position der gewichteten Liste — der Median entspricht also **immer dem unveränderten Zentrumspixel** (exakt dieselbe Logik wie in [[#4.3.2 Lineare & Nichtlineare Filter|Aufgabe 8]] dieses Kapitels).

$$\begin{bmatrix} 55 & 75 & 77 \\ 199 & 40 & 135 \\ 91 & 10 & 225 \end{bmatrix} \quad \text{(unverändert — Identitätsabbildung)}$$
