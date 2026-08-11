---
tags: [sem2, bidru, klausurvorbereitung]
type: exercise
date: 2026-07-09
updated: 2026-07-09
---

Übungsaufgaben (ohne Lösungen) zu allen Klausur-Schwerpunkten, bei denen Rechenaufgaben denkbar sind. Orientiert an den Aufgaben aus der Probeklausur in [[🎨 BIDRU]].

- [[#1. Speicherplatzbedarf von Bildern]]
- [[#2. Druckgröße von Bildern]]
- [[#3. JPEG-Kompression (Grundprinzip)]]
- [[#4. Histogramme]]
- [[#5. Homogene Punktoperationen]]
- [[#6. Lineare Filter]]
- [[#7. Nicht-lineare Filter]]

---

## 1. Speicherplatzbedarf von Bildern

> [!example] Aufgabe 1 — Unkomprimiertes RGB-Bild
> Berechnen Sie den Speicherplatzbedarf eines Bildes der Größe **2560 × 1440 Pixel** als unkomprimiertes RGB-Bild mit einer Farbauflösung von 24 Bit/Pixel.

> [!success] Lösung
> $2560 \times 1440 \times 3 = \mathbf{11{.}059{.}200 \text{ Byte}}$

> [!example] Aufgabe 2 — Bild mit Alphakanal
> Berechnen Sie den Speicherplatzbedarf desselben Bildes (2560 × 1440), wenn zusätzlich zu RGB ein 8-Bit-Alphakanal (RGBA, 32 Bit/Pixel) gespeichert wird.

> [!success] Lösung
> $2560 \times 1440 \times 4 = \mathbf{14{.}745{.}600 \text{ Byte}}$

> [!example] Aufgabe 3 — Indexbild mit Farbtabelle
> Ein Bild der Größe 1920 × 1080 Pixel enthält **180 unterschiedliche Farben**. Berechnen Sie den Speicherplatzbedarf als Indexbild (Farbtabelle + indizierte Bilddaten).

> [!success] Lösung
> $180 \leq 256$ → 1 Byte/Pixel für den Index.
> - Farbtabelle: $180 \times 3 = 540$ Byte
> - Bilddaten: $1920 \times 1080 \times 1 = 2{.}073{.}600$ Byte
> - **Gesamt: $\mathbf{2{.}074{.}140 \text{ Byte}}$**

> [!example] Aufgabe 4 — Indexbild mit vielen Farben
> Wie ändert sich die Rechnung aus Aufgabe 3, wenn das Bild stattdessen **300 Farben** enthält? Worauf müssen Sie bei der Bit-Breite pro Index achten?

> [!success] Lösung
> $300 > 256$ → 1 Byte reicht nicht mehr, es werden **2 Byte/Pixel** für den Index benötigt.
> - Farbtabelle: $300 \times 3 = 900$ Byte
> - Bilddaten: $1920 \times 1080 \times 2 = 4{.}147{.}200$ Byte
> - **Gesamt: $\mathbf{4{.}148{.}100 \text{ Byte}}$**

> [!example] Aufgabe 5 — YCbCr mit 4:2:0-Subsampling
> Berechnen Sie den Speicherplatzbedarf eines Bildes der Größe 1920 × 1080 Pixel im YCbCr-Format (8 Bit/Kanal) mit **4:2:0 Chroma-Subsampling**.

> [!success] Lösung
> 4:2:0 → 1,5 Byte/Pixel. $1920 \times 1080 = 2{.}073{.}600$ Pixel.
> $$2{.}073{.}600 \times 1{,}5 = \mathbf{3{.}110{.}400 \text{ Byte}}$$

> [!example] Aufgabe 6 — YCbCr mit 4:2:2-Subsampling
> Berechnen Sie den Speicherplatzbedarf desselben Bildes (1920 × 1080) im YCbCr-Format (8 Bit/Kanal) mit **4:2:2 Chroma-Subsampling** und vergleichen Sie die prozentuale Ersparnis gegenüber 4:4:4.

> [!success] Lösung
> 4:2:2 → 2 Byte/Pixel: $2{.}073{.}600 \times 2 = \mathbf{4{.}147{.}200 \text{ Byte}}$
> 4:4:4 (Referenz, 3 Byte/Pixel) wäre $6{.}220{.}800$ Byte → Ersparnis $\approx \mathbf{33{,}3\,\%}$

> [!example] Aufgabe 7 — Vergleich RGB vs. Subsampling
> Ein Foto hat 3200 × 1800 Pixel. Berechnen Sie den Speicherplatzbedarf a) als unkomprimiertes 24-Bit-RGB-Bild und b) im YCbCr-Format mit 4:2:0-Subsampling. Um wie viel Prozent ist b) kleiner als a)?

> [!success] Lösung
> $3200 \times 1800 = 5{.}760{.}000$ Pixel.
> a) $\times 3 = \mathbf{17{.}280{.}000 \text{ Byte}}$
> b) $\times 1{,}5 = \mathbf{8{.}640{.}000 \text{ Byte}}$
> b) ist genau **50 % kleiner** als a).

## 2. Druckgröße von Bildern

> [!example] Aufgabe 8 — Druckgröße in cm
> Ein Bild hat eine Auflösung von 4096 × 2304 Pixel. Wie groß ist die Druckgröße in cm bei einer Auflösung von 300 ppi?

> [!success] Lösung
> $$\frac{4096}{300} = 13{,}65 \text{ inch} \cdot 2{,}54 \approx \mathbf{34{,}68 \text{ cm}}$$
> $$\frac{2304}{300} = 7{,}68 \text{ inch} \cdot 2{,}54 \approx \mathbf{19{,}51 \text{ cm}}$$

> [!example] Aufgabe 9 — Benötigte Pixelanzahl für Druckgröße
> Sie möchten ein Foto in der Größe 20 × 30 cm mit 300 ppi drucken. Wie viele Pixel muss das Bild mindestens in Breite und Höhe haben?

> [!success] Lösung
> $$\frac{20}{2{,}54} \cdot 300 \approx \mathbf{2362 \text{ px}}$$
> $$\frac{30}{2{,}54} \cdot 300 \approx \mathbf{3543 \text{ px}}$$

> [!example] Aufgabe 10 — ppi aus gegebener Druckgröße berechnen
> Ein Bild mit 6000 × 4000 Pixel soll auf eine Fläche von 50 × 33,3 cm gedruckt werden. Welche Auflösung (in ppi) ergibt sich?

> [!success] Lösung
> $50 \text{ cm} / 2{,}54 \approx 19{,}69$ inch → $6000 / 19{,}69 \approx \mathbf{304{,}8 \text{ ppi}}$
> (Kontrolle: $33{,}3 / 2{,}54 \approx 13{,}11$ inch → $4000/13{,}11 \approx 305{,}1$ ppi ✓)

## 3. JPEG-Kompression (Grundprinzip)

> [!example] Aufgabe 11 — MCU-Berechnung bei 4:2:0
> Ein Bild wird mit JPEG und **4:2:0-Subsampling** kodiert. Wie viele Y-Blöcke enthält eine MCU, und welchen Bildbereich (in Pixeln) deckt eine MCU ab?

> [!success] Lösung
> Ein Farb-Sample deckt $2\times2$ Y-Pixel ab, ein $8\times8$-Farbblock also $16\times16$ Y-Pixel. Das ergibt $16/8=2$ Y-Blöcke pro Richtung → $\mathbf{4}$ **Y-Blöcke**, MCU-Fläche $\mathbf{16 \times 16}$ Pixel.

> [!example] Aufgabe 12 — MCU-Berechnung bei 4:1:1
> Ein Bild wird mit JPEG und **4:1:1-Subsampling** kodiert (ein Farb-Sample deckt 4×1 Y-Pixel ab). Wie viele Y-Blöcke enthält eine MCU, und welche Fläche deckt sie ab? Begründen Sie Ihr Vorgehen wie in [[4. Verlustbehaftete Bildkompression#4.2.1 Blockbildung und MCUs]].

> [!success] Lösung
> Ein $8\times8$-Farbblock deckt $(8\times4)\times(8\times1) = 32\times8$ Y-Pixel ab. Aufteilung in $8\times8$-Y-Blöcke: $32/8=4$ horizontal, $8/8=1$ vertikal → $\mathbf{4}$ **Y-Blöcke**, MCU-Fläche $\mathbf{32\times8}$ Pixel.

> [!example] Aufgabe 13 — Quantisierung eines DCT-Koeffizienten
> Ein DCT-Koeffizient hat den Wert $F(u,v) = 52$, der zugehörige Quantisierungstabellenwert ist $Q(u,v) = 60$. Berechnen Sie den quantisierten Koeffizienten $F'(u,v) = \text{Round}(F(u,v)/Q(u,v))$. Wird hier Information verloren? Begründen Sie.

> [!success] Lösung
> $F'(u,v) = \text{Round}(52/60) = \text{Round}(0{,}867) = \mathbf{1}$. Ja, es geht Information verloren: Das Runden ist nicht umkehrbar — jeder Wert zwischen z.B. 46 und 75 würde ebenfalls auf 1 abgebildet, der genaue Ursprungswert 52 lässt sich später nicht mehr rekonstruieren.

> [!example] Aufgabe 14 — Anzahl der 8×8-Blöcke
> Ein Bild hat die Größe 1920 × 1080 Pixel. Wie viele 8×8-Blöcke ergeben sich pro Zeile bzw. Spalte, und wie viel Padding wird jeweils benötigt, falls die Maße nicht exakt durch 8 teilbar sind? (Hinweis: Prüfen Sie zunächst, ob 1920 bzw. 1080 durch 8 teilbar sind.)

> [!success] Lösung
> $1920/8=240$ und $1080/8=135$ — beide Werte sind exakt durch 8 teilbar. Es ergeben sich $\mathbf{240 \times 135}$ Blöcke, **kein Padding** nötig.

## 4. Histogramme

> [!example] Aufgabe 15 — Histogramm, kumulatives Histogramm, Binning
> Gegeben ist ein 4×4-Bild mit Graustufen 0–3 (2 Bit/Pixel):
> ```
> 1 2 0 3
> 1 1 2 3
> 0 2 2 1
> 3 3 0 1
> ```
> a) Bestimmen Sie das Histogramm $h(i)$ für $i = 0,1,2,3$.
> b) Bestimmen Sie das kumulative Histogramm $H(i)$.
> c) Bestimmen Sie das Binned Histogramm der Größe 2.

> [!success] Lösung
> a) $h(0)=3,\ h(1)=5,\ h(2)=4,\ h(3)=4$ (Summe 16 ✓)
> b) $H(0)=3,\ H(1)=8,\ H(2)=12,\ H(3)=16$
> c) Bin 0 (Werte 0–1): $h(0)+h(1)=8$; Bin 1 (Werte 2–3): $h(2)+h(3)=8$

> [!example] Aufgabe 16 — Normalisiertes Histogramm und Verteilungsfunktion
> Nutzen Sie das Histogramm aus Aufgabe 15. Berechnen Sie das normalisierte Histogramm $p(i)$ sowie die Verteilungsfunktion $P(i)$ für alle $i$.

> [!tip] Was ist der Unterschied zwischen $p(i)$ und $P(i)$?
> Beide sind einfach $h(i)$ bzw. $H(i)$, nur geteilt durch die Gesamtpixelzahl $M\cdot N$ — es wird also nichts Neues berechnet, sondern nur umskaliert:
> - $p(i) = h(i)/(M\cdot N)$ → "Wie groß ist der **Anteil** der Pixel, die **genau** Helligkeit $i$ haben?" (aus $h(i)$)
> - $P(i) = H(i)/(M\cdot N)$ → "Wie groß ist der **Anteil** der Pixel, die Helligkeit **$\leq i$** haben?" (aus dem kumulativen $H(i)$ von Aufgabe 15b)
> 
> Beispiel $i=1$: $h(1)=5$ heißt "5 von 16 Pixeln haben genau Helligkeit 1" → $p(1)=5/16$. $H(1)=8$ heißt "8 von 16 Pixeln haben Helligkeit 0 **oder** 1" → $P(1)=8/16$. $P(i)$ ist immer $\geq p(i)$, weil es alle kleineren Werte mitzählt.

> [!success] Lösung
> $M \cdot N = 16$.
> $p(0)=3/16=0{,}1875,\ p(1)=5/16=0{,}3125,\ p(2)=4/16=0{,}25,\ p(3)=4/16=0{,}25$
> $P(0)=0{,}1875,\ P(1)=0{,}5,\ P(2)=0{,}75,\ P(3)=1$

> [!example] Aufgabe 17 — Binned Histogramm bei hoher Farbtiefe
> Ein „Binned"-Histogramm der Größe 128 eines **14-Bit-Grauwertbildes** soll berechnet werden. Bestimmen Sie die Intervalllänge und die Grenzen des **50. Intervalls**.

> [!success] Lösung
> $K=2^{14}=16384$, $B=128$ → $k_B = 16384/128 = \mathbf{128}$
> 50. Intervall (1-indiziert): Untergrenze $(50-1)\times128=\mathbf{6272}$, Obergrenze $6272+127=\mathbf{6399}$

> [!example] Aufgabe 18 — Binned Histogramm, Einordnung eines Pixels
> Ein 12-Bit-Bild ($K = 4096$) soll auf ein Histogramm mit $B = 64$ Bins reduziert werden. Berechnen Sie die Bin-Breite $k_B$ und bestimmen Sie, in welchen Bin ein Pixel mit dem Wert 1500 einsortiert wird.

> [!success] Lösung
> $k_B = 4096/64 = \mathbf{64}$
> $j = \lfloor 1500/64 \rfloor = \lfloor 23{,}44 \rfloor = \mathbf{23}$

## 5. Homogene Punktoperationen

> [!example] Aufgabe 19 — Autokontrast
> Ein 8-Bit-Grauwertbild hat $a_{\text{low}} = 30$ und $a_{\text{high}} = 210$. Welchen neuen Grauwert erhält ein Pixel mit ursprünglichem Wert **150** nach Autokontrastanpassung auf [0, 255]?

> [!success] Lösung
> $$a' = \frac{150-30}{210-30}\cdot255 = \frac{120}{180}\cdot255 = \mathbf{170}$$

> [!example] Aufgabe 20 — Autokontrast bei hoher Bittiefe
> Ein 12-Bit-Grauwertbild (Wertebereich [0, 4095]) hat $a_{\text{low}} = 250$ und $a_{\text{high}} = 3500$. Welchen Grauwert nimmt ein Pixel mit dem Wert **1800** nach Autokontrastanpassung an?

> [!success] Lösung
> $$a' = \frac{1800-250}{3500-250}\cdot4095 = \frac{1550}{3250}\cdot4095 \approx \mathbf{1954}$$

> [!example] Aufgabe 21 — Kontrast und Helligkeit mit Clamping
> Auf ein 8-Bit-Bild wird zunächst die Helligkeit um +40 erhöht, danach der Kontrast mit dem Faktor 1,3 multipliziert. Berechnen Sie den resultierenden Pixelwert (mit Clamping auf [0, 255]) für die Ausgangswerte 20, 120 und 210.

> [!success] Lösung
> - $20 \to 60 \to 60\cdot1{,}3=78$ → **78**
> - $120 \to 160 \to 160\cdot1{,}3=208$ → **208**
> - $210 \to 250 \to 250\cdot1{,}3=325$ → Clamping → **255**

> [!example] Aufgabe 22 — Histogrammausgleich (Equalization)
> Nutzen Sie das Bild aus Aufgabe 15 (4×4, $K=4$). Berechnen Sie $a' = f_{eq}(a)$ für $a = 0$, $a = 1$ und $a = 3$.

> [!tip] Woher kommt die Formel $f_{eq}(a) = \frac{H(a)}{M\cdot N}\cdot(K-1)$?
> Histogrammausgleich ist nur ein Spezialfall der Histogrammanpassung $a' = P_R^{-1}(P_A(a))$ (siehe [[7. Homogene Punktoperationen#7.9.5 Mathematische Grundidee]]), bei dem die Zielverteilung $P_R$ die **Gleichverteilung** ist. Für eine Gleichverteilung gilt einfach $P_R^{-1}(p) = p\cdot(K-1)$ (kein stückweises Interpolieren nötig wie bei Aufgabe 23/24).
> 
> Setzt man $P_A(a) = \frac{H(a)}{M\cdot N}$ (Anteil der Pixel mit Helligkeit $\leq a$, aus dem kumulativen Histogramm von Aufgabe 15b) ein, ergibt sich direkt:
> $$f_{eq}(a) = P_R^{-1}(P_A(a)) = \frac{H(a)}{M\cdot N}\cdot(K-1)$$
> 
> **Zwei Schritte in Worten:**
> 1. $\frac{H(a)}{M\cdot N}$ — wie groß ist der Anteil der Pixel mit Helligkeit $\leq a$? (ein Wert zwischen 0 und 1)
> 2. $\cdot (K-1)$ — diesen Anteil auf den Zielbereich $[0, K-1]$ hochskalieren und runden

> [!success] Lösung
> $f_{eq}(a) = \frac{H(a)}{M\cdot N}\cdot(K-1) = \frac{H(a)}{16}\cdot3$, mit $H(0)=3,\ H(1)=8,\ H(3)=16$.
> - $a=0$: $\frac{3}{16}\cdot3=0{,}5625 \to \mathbf{1}$
> - $a=1$: $\frac{8}{16}\cdot3=1{,}5 \to \mathbf{2}$
> - $a=3$: $\frac{16}{16}\cdot3=3 \to \mathbf{3}$

> [!example] Aufgabe 23 — Histogrammanpassung mit stückweise linearer Referenzverteilung
> Gegeben ist die stückweise lineare Referenzverteilung $P_L(i) = \langle 0,\ 0{,}1 \rangle,\ \langle 100,\ 0{,}5 \rangle,\ \langle 255,\ 1{,}0 \rangle$ sowie ein Pixelwert $a$ mit $P_A(a) = 0{,}6$. Berechnen Sie $a' = f_{hs}(a)$.

> [!success] Lösung
> $0{,}6$ liegt im Segment $[0{,}5;\,1{,}0]$ (zu $i\in[100,255]$), da $0{,}6 > 0{,}5$.
> Anteil: $\frac{0{,}6-0{,}5}{1{,}0-0{,}5}=0{,}2$
> $$a' = 100 + 0{,}2\cdot(255-100) = \mathbf{131}$$

> [!example] Aufgabe 24 — Histogrammanpassung, zweites Segment
> Nutzen Sie dieselbe Referenzverteilung wie in Aufgabe 23. Berechnen Sie $a'$ für einen Pixelwert mit $P_A(a) = 0{,}7$.

> [!success] Lösung
> $0{,}7$ liegt im Segment $[0{,}5;\,1{,}0]$ (zu $i\in[100,255]$).
> Anteil: $\frac{0{,}7-0{,}5}{1{,}0-0{,}5}=0{,}4$
> $$a' = 100 + 0{,}4\cdot(255-100) = \mathbf{162}$$

> [!example] Aufgabe 25 — Gammakorrektur
> Ein Pixel hat den normierten Wert $a_{\text{norm}} = 0{,}3$ (bezogen auf $a_{\max}=255$). Berechnen Sie den Ausgabewert nach Anwendung der Gammafunktion mit a) $\gamma = 2{,}2$ und b) $\gamma = 1/2{,}2$. Wie erklären Sie den Unterschied?

> [!success] Lösung
> a) $0{,}3^{2{,}2} \approx \mathbf{0{,}071}$ — Wert wird kleiner (dunkler), da $\gamma>1$
> b) $0{,}3^{1/2{,}2} \approx \mathbf{0{,}579}$ — Wert wird größer (heller), da $\gamma<1$
> Die beiden Funktionen sind zueinander invers ($f_\gamma^{-1}=f_{1/\gamma}$), daher die entgegengesetzte Wirkung.

> [!example] Aufgabe 26 — Gammakorrektur mit konkretem Grauwert
> Ein 8-Bit-Pixel hat den Wert $a = 64$. Berechnen Sie den korrigierten Wert $b = f_{gc}(a,\gamma)$ mit $\gamma = 0{,}45$ (typischer Kamera-Gammawert) und $a_{\max}=255$.

> [!success] Lösung
> $a_{\text{norm}} = 64/255 \approx 0{,}251$
> $0{,}251^{0{,}45} \approx 0{,}537$
> $$b = 0{,}537 \cdot 255 \approx \mathbf{137}$$

> [!example] Aufgabe 27 — Modifizierter Autokontrast (robuste Variante)
> Ein 8-Bit-Bild mit 20.000 Pixeln soll mit modifiziertem Autokontrast bearbeitet werden: die dunkelsten 2% und die hellsten 1% der Pixel sollen ignoriert werden. Wie viele Pixel werden jeweils ignoriert, und wie viele Pixel definieren den neuen Helligkeitsbereich?

> [!success] Lösung
> Dunkelste 2 %: $20{.}000 \cdot 0{,}02 = \mathbf{400}$ Pixel
> Hellste 1 %: $20{.}000 \cdot 0{,}01 = \mathbf{200}$ Pixel
> Verbleibend: $20{.}000 - 400 - 200 = \mathbf{19{.}400}$ Pixel definieren den neuen Bereich

## 6. Lineare Filter

> [!example] Aufgabe 28 — Box-Filter auf 3×3-Ausschnitt
> Gegeben ist folgender Bildausschnitt (Grauwerte):
> ```
> 40  60  80
> 50 100 120
> 30  70  90
> ```
> Berechnen Sie den gefilterten Wert des Zentrumspixels mit einem 3×3-Box-Filter (Gewicht $\tfrac{1}{9}$ überall).

> [!success] Lösung
> Summe aller 9 Werte: $40+60+80+50+100+120+30+70+90=640$
> $$640/9 \approx \mathbf{71}$$

> [!example] Aufgabe 29 — Gaußfilter auf 3×3-Ausschnitt
> Nutzen Sie denselben Bildausschnitt wie in Aufgabe 28. Berechnen Sie den gefilterten Wert des Zentrumspixels mit dem Gaußfilter $\frac{1}{40}\begin{bmatrix}3&5&3\\5&8&5\\3&5&3\end{bmatrix}$.

> [!success] Lösung
> Ecken (Gewicht 3): $40+80+30+90=240 \to 240\cdot3=720$
> Kanten (Gewicht 5): $60+50+120+70=300 \to 300\cdot5=1500$
> Zentrum (Gewicht 8): $100\cdot8=800$
> Summe: $720+1500+800=3020$
> $$3020/40 = \mathbf{75{,}5} \to 75$$

> [!example] Aufgabe 30 — Laplace-Filter
> Nutzen Sie denselben Bildausschnitt wie in Aufgabe 28. Berechnen Sie den gefilterten Wert des Zentrumspixels mit dem Laplace-Filter $\begin{bmatrix}0&-1&0\\-1&4&-1\\0&-1&0\end{bmatrix}$. Ist Clamping nötig?

> [!success] Lösung
> $$4\cdot100 - (60+50+120+70) = 400-300 = \mathbf{100}$$
> Liegt im Bereich [0, 255] → **kein Clamping nötig**.

> [!example] Aufgabe 31 — Separierbarkeit prüfen
> Prüfen Sie, ob der Filter $H = \begin{bmatrix}2&4&2\\3&6&3\\1&2&1\end{bmatrix}$ separierbar ist. Falls ja, bestimmen Sie $H_x$ und $H_y$.

> [!success] Lösung
> Jede Zeile ist ein Vielfaches der mittleren Zeile: Zeile1 $=\tfrac{2}{3}\cdot$Zeile2, Zeile3 $=\tfrac{1}{3}\cdot$Zeile2 → **separierbar**.
> $H_x=[3,\,6,\,3]$ (Zentrumszeile), $H_y=[\tfrac{2}{3},\,1,\,\tfrac{1}{3}]^T$ (Zentrumsspalte ÷ Hot-Spot-Wert 6). Probe: $H_y\cdot H_x$ ergibt wieder $H$ ✓.

> [!example] Aufgabe 32 — Separierbarkeit prüfen (nicht separierbar)
> Prüfen Sie, ob der Filter $H = \begin{bmatrix}1&0&-1\\0&1&0\\-1&0&1\end{bmatrix}$ separierbar ist. Begründen Sie anhand des Zeilen-/Spalten-Kriteriums.

> [!success] Lösung
> **Nicht separierbar.** Zeile 1 $=[1,0,-1]$, Zeile 2 $=[0,1,0]$ — Zeile 2 ist kein Vielfaches von Zeile 1 (an Position 1 steht bei Zeile 1 eine 0, bei Zeile 2 eine 1 $\neq 0\cdot k$). Schon dieser Widerspruch reicht.

> [!example] Aufgabe 33 — Rechenaufwand mit/ohne Separierung
> Ein 9×9-Gaußfilter wird auf ein Bild der Größe 1920×1080 angewendet. Berechnen Sie die Anzahl der Multiplikationen pro Pixel a) ohne Separierung und b) mit Separierung in zwei 1D-Filter. Wie groß ist der Speedup-Faktor?

> [!success] Lösung
> a) Ohne Separierung: $9\times9=\mathbf{81}$ Multiplikationen/Pixel
> b) Mit Separierung: $9+9=\mathbf{18}$ Multiplikationen/Pixel
> Speedup: $81/18 = \mathbf{4{,}5\times}$

> [!example] Aufgabe 34 — Filter mit Randbehandlung (konstanter Randwert)
> Gegeben ist folgendes 3×3-Bild (Werte in [0,255]), außerhalb des Bildes gilt der Randwert 0:
> ```
> 10  20  90
> 30 200  15
> 5   40  60
> ```
> Wenden Sie den Filter $[0{,}25 \;\; 0{,}5 \;\; 0{,}25]$ (3×1, horizontal, Hotspot Zentrum) auf jedes Pixel der mittleren Zeile an. Nachkommastellen abschneiden (nicht runden).

> [!success] Lösung
> Mittlere Zeile: $30,\ 200,\ 15$ (links/rechts außerhalb = Randwert 0).
> | Pixel | Rechnung | Ergebnis |
> |---|---|---|
> | links (30) | $0{,}25\cdot0 + 0{,}5\cdot30 + 0{,}25\cdot200 = 65$ | **65** |
> | Mitte (200) | $0{,}25\cdot30 + 0{,}5\cdot200 + 0{,}25\cdot15 = 111{,}25$ | **111** |
> | rechts (15) | $0{,}25\cdot200 + 0{,}5\cdot15 + 0{,}25\cdot0 = 57{,}5$ | **57** |

   . # 7. Nicht-lineare Filter

> [!example] Aufgabe 35 — Minimum- und Maximum-Filter
> Nutzen Sie das Bild aus Aufgabe 34 (Randwert außerhalb = 0). Berechnen Sie für die mittlere Zeile jeweils den Minimum-Filter- und den Maximum-Filter-Wert (Filtergröße 3×1).

> [!success] Lösung
> | Pixel | Kandidaten | Min | Max |
> |---|---|---|---|
> | links (30) | 0, 30, 200 | **0** | **200** |
> | Mitte (200) | 30, 200, 15 | **15** | **200** |
> | rechts (15) | 200, 15, 0 | **0** | **200** |

> [!example] Aufgabe 36 — Medianfilter (ungewichtet)
> Nutzen Sie das Bild aus Aufgabe 34 (Randwert außerhalb = 0). Berechnen Sie für die mittlere Zeile den Medianfilter-Wert (Filtergröße 3×1).

> [!success] Lösung
> | Pixel | Sortiert | Median |
> |---|---|---|
> | links (30) | 0, 30, 200 | **30** |
> | Mitte (200) | 15, 30, 200 | **30** |
> | rechts (15) | 0, 15, 200 | **15** |

> [!example] Aufgabe 37 — Gewichteter Medianfilter
> Nutzen Sie das Bild aus Aufgabe 34. Berechnen Sie für das Zentrumspixel der mittleren Zeile (Wert 200) den gewichteten Medianfilter mit der Gewichtsmatrix $\begin{bmatrix}0&0&0\\2&1&1\\0&0&0\end{bmatrix}$ (3×1-Filter: links Gewicht 2, Zentrum 1, rechts 1).

> [!success] Lösung
> Werte: links=30 (2×), Zentrum=200 (1×), rechts=15 (1×) → Sortierfolge: $[15,\ 30,\ 30,\ 200]$ (4 Werte).
> Median $= (30+30)/2 = \mathbf{30}$

> [!example] Aufgabe 38 — Vergleich linear vs. nichtlinear bei Ausreißer
> Ein 3×3-Fenster enthält die Werte 50, 55, 52, 48, **250**, 51, 49, 53, 54 (Zentrum = 250, ein Ausreißer durch Bildrauschen). Berechnen Sie das Ergebnis a) mit einem Box-Filter (linear) und b) mit einem Medianfilter (nichtlinear). Welcher Filter eliminiert den Ausreißer besser und warum?

> [!success] Lösung
> a) Box-Filter: Summe $=50+55+52+48+250+51+49+53+54=712$; $712/9\approx\mathbf{79}$ — durch den Ausreißer immer noch deutlich verzerrt.
> b) Median: sortiert $48,49,50,51,52,53,54,55,250$ → Median (5. Wert) $=\mathbf{52}$ — entspricht dem normalen Umgebungsniveau.
> **Der Medianfilter eliminiert den Ausreißer deutlich besser**, da ein einzelner Extremwert beim Sortieren an den Rand rutscht und den Median kaum beeinflusst, während er beim Box-Filter voll in die Summe eingeht.
