---
tags:
  - sem2
  - natgl
type: exercise
sources:
  - Aufgaben_Sammlung_Medieninformatik_Stud.pdf
date: 2026-05-05
updated: 2026-05-05
---
## Kinematik (AB1)

BA Dresden, D. Gembris

### Aufgabe 1: Geschwindigkeit

> [!info] Aufgabenstellung
> a) Berechnen Sie, wie viel m/s 100 km/h und wie viel km/h 10 m/s sind.
>
> b) Ein Echolot bestimmt die Meerestiefe durch einen kurzen Ton, dessen Echo nach
>
> ∆t = 1,4 s wieder an der Meeresoberfläche ankommt. Berechnen Sie die Meerestiefe, für den Fall, dass die Schallgeschwindigkeit c = 1475 m/s beträgt.
>
> c) Die amerikanische Raumsonde Pioneer 11 passierte im Dezember 1974 den Jupiter mit einer Geschwindigkeit von 171 000 km/h. Berechnen Sie die Zeit At, die die Sonde für eine Strecke von der Länge des Jupiterdurchmesser d = 142 000 km benötigte.
>
> d) Berechnen Sie, wie lange das Licht bei einer Geschwindigkeit von c ≈ 300 000 km/s von der 150 Mio. km entfernten Sonne zu uns benötigt.
>
> e) Ein 300 m langer Zug überquert mit 72 km/h eine 200 m lange Brücke. Berechnen Sie, wie lange es dauert, bis der gesamte Zug die Brücke passiert hat. Formulieren Sie diese umgangssprachlich vage gestellte Frage zunächst exakt und berechnen Sie dann das Ergebnis.
>

**a) 100 km/h → m/s**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Geschwindigkeit | `vkmh` | `100` km/h |
| Gesucht | Geschwindigkeit (SI) | `vc` | |

$$
\begin{align*}
\text{Gegeben:} \\
v_{\text{kmh}} &= 100 \text{ km/h} \\
\text{Weg:} \\
v_c &= \frac{v_{\text{kmh}}}{3.6} \\
&= \frac{100}{3.6} \\
&= 27.78 \text{ m/s} \\
\text{ERG:} \quad v_c &= 27.78 \text{ m/s}
\end{align*}
$$

**a) 10 m/s → km/h**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Geschwindigkeit (SI) | `vc` | `10` m/s |
| Gesucht | Geschwindigkeit | `vkmh` | |

$$
\begin{align*}
\text{Gegeben:} \\
v_c &= 10 \text{ m/s} \\
\text{Weg:} \\
v_{\text{kmh}} &= v_c \cdot 3.6 \\
&= 10 \cdot 3.6 \\
&= 36 \text{ km/h} \\
\text{ERG:} \quad v_{\text{kmh}} &= 36 \text{ km/h}
\end{align*}
$$

**b) Meerestiefe (Echolot)**

|         | Größe                      | Symbol | Wert       |
| ------- | -------------------------- | ------ | ---------- |
| Gegeben | Schallgeschwindigkeit      | `cph`  | `1475` m/s |
|         | Laufzeit (Echo)            | `t`    | `1.4` s    |
| Gesucht | Entfernung (Laufzeit/Echo) | `sT`   |            |

$$
\begin{align*}
\text{Gegeben:} \\
c_{\text{ph}} &= 1475 \text{ m/s} \\
t &= 1.4 \text{ s} \\
\text{Weg:} \\
s_T &= \frac{c_{\text{ph}} \cdot t}{2} \\
&= \frac{1475 \cdot 1.4}{2} \\
&= 1032 \text{ m} \\
\text{ERG:} \quad s_T &= 1032 \text{ m}
\end{align*}
$$

$v_c$ = Geschwindigkeit in SI-Einheiten

**c) Pioneer 11 am Jupiter**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Geschwindigkeit | `vkmh` | `171000` km/h |
| | Strecke (Jupiterdurchmesser) | `s` | `142000000` m |
| Gesucht | Zeit | `t` | |

$$
\begin{align*}
\text{Gegeben:} \\
s &= 142000000 \text{ m} \\
v_{\text{kmh}} &= 171000 \text{ km/h} \\
\text{Weg:} \\
v_c &= \frac{v_{\text{kmh}}}{3.6} \\
&= \frac{171000}{3.6} \\
&= 47500 \text{ m/s} \\
t &= \frac{s}{v_c} \\
&= \frac{142000000}{47500} \\
&= 2989 \text{ s} \\
\text{ERG:} \quad t &= 2989 \text{ s}
\end{align*}
$$

**d) Lichtlaufzeit von der Sonne**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Geschwindigkeit (gleichförmig) | `vc` | `300000km/s` (Einheit direkt mit eingeben) |
| | Strecke | `s` | `150000000000` m |
| Gesucht | Zeit | `t` | |

$$
\begin{align*}
\text{Gegeben:} \\
s &= 150000000000 \text{ m} \\
v_c &= 300000000 \text{ m/s} \\
\text{Weg:} \\
t &= \frac{s}{v_c} \\
&= \frac{150000000000}{300000000} \\
&= 500 \text{ s} \\
\text{ERG:} \quad t &= 500 \text{ s}
\end{align*}
$$

**e) Zug über Brücke**

Exakte Formulierung: Gesucht ist die Zeit von dem Moment, in dem die Zugspitze auf die Brücke fährt, bis zu dem Moment, in dem das Zugende die Brücke verlässt — der Zug legt dabei die Strecke Brückenlänge + Zuglänge zurück.

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Geschwindigkeit | `vkmh` | `72` km/h |
| | Strecke (Brücke + Zuglänge, `200+300`) | `s` | `500` m |
| Gesucht | Zeit | `t` | |

$$
\begin{align*}
\text{Gegeben:} \\
s &= 500 \text{ m} \\
v_{\text{kmh}} &= 72 \text{ km/h} \\
\text{Weg:} \\
v_c &= \frac{v_{\text{kmh}}}{3.6} \\
&= \frac{72}{3.6} \\
&= 20 \text{ m/s} \\
t &= \frac{s}{v_c} \\
&= \frac{500}{20} \\
&= 25 \text{ s} \\
\text{ERG:} \quad t &= 25 \text{ s}
\end{align*}
$$

$v_c$ = Geschwindigkeit in SI-Einheiten

### Aufgabe 2: geradlinig gleichförmige Bewegung

> [!info] Aufgabenstellung
> Zeichnen Sie jeweils das x-t-Diagramm und das v-t-Diagramm für die folgenden Bewegungen:
>
> a) A bewegt sich vom Ursprung aus mit konstanter Geschwindigkeit in 3 Sekunden 5 m weit in positive x-Richtung, geht dann innerhalb von 2 Sekunden um 7 m zurück und schließlich in einer Sekunde wieder zurück zum Ursprung.
>
> b) B bewegt sich 3 Sekunden lang mit 2 m/s rückwärts in negative x-Richtung, dann eine Sekunde lang mit 3 m/s vorwärts und schließlich 2 Sekunden lang mit 1 m/s weiter vorwärts.
>
> c) C benötigt 3 Sekunden, um vom Ursprung aus 3 m nach vorne zu gehen, bewegt sich dann mit 2 m/s für 2 Sekunden nach hinten und geht schließlich in einer Sekunde wieder 1 m nach vorne.
>

### Aufgabe 3: Graphische Integration

> [!info] Aufgabenstellung
> Rekonstruieren Sie das x-t-Diagramm durch graphische Integration:
>
![[Übungen/Übungen-_page_0_Figure_16.jpeg]]

## Dynamik (AB2)

### Aufgabe 1: 2. Newtonsches Axiom

> [!info] Aufgabenstellung
> a) Berechnen Sie die Kraft, die benötigt wird, um einen 1 kg schweren Körper in 3 Sekunden von 0 auf 2 m/s zu beschleunigen.
>
> b) Berechnen Sie, wie schnell wird 1,5 t schweres Auto nach 10 Sekunden ist, wenn seine Reifen jede Sekunde eine Kraft von 2 kN auf die Straße übertragen.
>
> c) Berechnen Sie die Kraft, die auf ein 2 t schweres Fahrzeug wirkt, das mit 54 km/h auf einen Brückenpfeiler prallt und dabei in 0,1 s zum Stillstand kommt.
>
> d) Berechnen Sie die Masse eines Körpers, der durch eine konstante Kraft von 10 N gleichmäßig aus der Ruhe heraus beschleunigt wird und dabei in 20 Sekunden eine Strecke von 200 m zurücklegt.

**a) Kraft aus Geschwindigkeitsänderung**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Masse | `m` | `1` kg |
| | Endgeschwindigkeit | `v` | `2` m/s |
| | Anfangsgeschwindigkeit | `v0` | `0` m/s |
| | Zeit | `t` | `3` s |
| Gesucht | Kraft | `F` | |

$$
\begin{align*}
\text{Gegeben:} \\
m &= 1 \text{ kg} \\
t &= 3 \text{ s} \\
v &= 2 \text{ m/s} \\
v_0 &= 0 \text{ m/s} \\
\text{Weg:} \\
a &= \frac{v-v_0}{t} \\
&= \frac{2-0}{3} \\
&= 0.6667 \text{ m/s}^2 \\
F &= m \cdot a \\
&= 1 \cdot 0.6667 \\
&= 0.6667 \text{ N} \\
\text{ERG:} \quad F &= 0.6667 \text{ N}
\end{align*}
$$

$a$ = Beschleunigung

**b) Endgeschwindigkeit aus Kraft**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Masse | `m` | `1500` kg |
| | Kraft | `F` | `2000` N |
| | Zeit | `t` | `10` s |
| | Anfangsgeschwindigkeit | `v0` | `0` m/s |
| Gesucht | Endgeschwindigkeit | `v` | |

$$
\begin{align*}
\text{Gegeben:} \\
F &= 2000 \text{ N} \\
m &= 1500 \text{ kg} \\
t &= 10 \text{ s} \\
v_0 &= 0 \text{ m/s} \\
\text{Weg:} \\
a &= \frac{F}{m} \\
&= \frac{2000}{1500} \\
&= 1.333 \text{ m/s}^2 \\
v &= v_0 + a \cdot t \\
&= 0 + 1.333 \cdot 10 \\
&= 13.33 \text{ m/s} \\
\text{ERG:} \quad v &= 13.33 \text{ m/s}
\end{align*}
$$

$a$ = Beschleunigung

**c) Aufprallkraft**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Masse | `m` | `2000` kg |
| | Anfangsgeschwindigkeit | `v0` | `15` m/s (= 54 km/h) |
| | Endgeschwindigkeit | `v` | `0` m/s |
| | Zeit | `t` | `0.1` s |
| Gesucht | Kraft | `F` | |

$$
\begin{align*}
\text{Gegeben:} \\
m &= 2000 \text{ kg} \\
t &= 0.1 \text{ s} \\
v &= 0 \text{ m/s} \\
v_0 &= 15 \text{ m/s} \\
\text{Weg:} \\
a &= \frac{v-v_0}{t} \\
&= \frac{0-15}{0.1} \\
&= -150 \text{ m/s}^2 \\
F &= m \cdot a \\
&= 2000 \cdot (-150) \\
&= -300000 \text{ N} \\
\text{ERG:} \quad F &= -300000 \text{ N}
\end{align*}
$$

$a$ = Beschleunigung

Die Kraft hat also einen Betrag von **300.000 N** (300 kN), sie wirkt der ursprünglichen Fahrtrichtung entgegen (negatives Vorzeichen).

**d) Masse aus Weg-Zeit-Gesetz**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Kraft | `F` | `10` N |
| | Zeit | `t` | `20` s |
| | Strecke | `s` | `200` m |
| | Anfangsgeschwindigkeit | `v0` | `0` m/s |
| Gesucht | Masse | `m` | |

$$
\begin{align*}
\text{Gegeben:} \\
F &= 10 \text{ N} \\
s &= 200 \text{ m} \\
t &= 20 \text{ s} \\
v_0 &= 0 \text{ m/s} \\
\text{Weg:} \\
a &= \frac{2(s-v_0 \cdot t)}{t^2} \\
&= \frac{2(200-0 \cdot 20)}{20^2} \\
&= 1 \text{ m/s}^2 \\
m &= \frac{F}{a} \\
&= \frac{10}{1} \\
&= 10 \text{ kg} \\
\text{ERG:} \quad m &= 10 \text{ kg}
\end{align*}
$$

$a$ = Beschleunigung

### Aufgabe 2: Newtonsche Axiome

> [!info] Aufgabenstellung
> In einem Aufzug wirken auf eine 70 kg schwere Person die Gewichtskraft $F_G$ und die Kraft F des Bodens, auf dem die Person steht. Berechnen Sie den Betrag von F für den Fall, dass der Aufzug
>
> a) stillsteht, b) mit 2 m/s<sup>2</sup> nach oben beschleunigt, c) mit 2 m/s<sup>2</sup> nach unten beschleunigt, d) frei fällt.
>

**a) Aufzug steht still ($a=0$)**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Masse | `m` | `70` kg |
| | Beschleunigung | `a` | `0` m/s² |
| Gesucht | Bodenkraft | `FB` | |

$$
\begin{align*}
\text{Gegeben:} \\
a &= 0 \text{ m/s}^2 \\
m &= 70 \text{ kg} \\
\text{Weg:} \\
F_B &= m(g+a) \\
&= 70(9.81+0) \\
&= 686.7 \text{ N} \\
\text{ERG:} \quad F_B &= 686.7 \text{ N}
\end{align*}
$$

**b) Beschleunigung $2\,\text{m/s}^2$ nach oben ($a=+2$)**

$$
\begin{align*}
\text{Gegeben:} \\
a &= 2 \text{ m/s}^2 \\
m &= 70 \text{ kg} \\
\text{Weg:} \\
F_B &= m(g+a) \\
&= 70(9.81+2) \\
&= 826.7 \text{ N} \\
\text{ERG:} \quad F_B &= 826.7 \text{ N}
\end{align*}
$$

**c) Beschleunigung $2\,\text{m/s}^2$ nach unten ($a=-2$)**

$$
\begin{align*}
\text{Gegeben:} \\
a &= -2 \text{ m/s}^2 \\
m &= 70 \text{ kg} \\
\text{Weg:} \\
F_B &= m(g+a) \\
&= 70(9.81-2) \\
&= 546.7 \text{ N} \\
\text{ERG:} \quad F_B &= 546.7 \text{ N}
\end{align*}
$$

**d) Freier Fall ($a=-g=-9.81$)**

$$
\begin{align*}
\text{Gegeben:} \\
a &= -9.81 \text{ m/s}^2 \\
m &= 70 \text{ kg} \\
\text{Weg:} \\
F_B &= m(g+a) \\
&= 70(9.81-9.81) \\
&= 0 \text{ N} \\
\text{ERG:} \quad F_B &= 0 \text{ N}
\end{align*}
$$

Bei d) hebt die Person vom Boden ab (Schwerelosigkeit) — Bodenkraft = 0 N passt genau dazu.

### Aufgabe 3: Newtonsche Axiome

> [!info] Aufgabenstellung
> Die beiden durch einen Faden verbundenen Gewichte werden mit 20 N nach oben gezogen. Berechnen Sie die Beschleunigung und die Fadenkräfte im oberen und im unteren Faden (unter Vernachlässigung der Gewichtskraft).
> 
>![[Pasted image 20260505094435.png]]

Werte aus der Abbildung: Zugkraft 20 N nach oben, Masse oben $m_1=6$ kg, Masse unten $m_2=4$ kg, Gewichtskraft vernachlässigt.

**Schritt 1 — Beschleunigung des Gesamtsystems**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Zugkraft | `F` | `20` N |
| | Gesamtmasse ($m_1+m_2$) | `m` | `10` kg |
| Gesucht | Beschleunigung | `a` | |

$$
\begin{align*}
\text{Gegeben:} \\
F &= 20 \text{ N} \\
m &= 10 \text{ kg} \\
\text{Weg:} \\
a &= \frac{F}{m} \\
&= \frac{20}{10} \\
&= 2 \text{ m/s}^2 \\
\text{ERG:} \quad a &= 2 \text{ m/s}^2
\end{align*}
$$

**Schritt 2 — Fadenkraft im unteren Faden** (wirkt nur auf $m_2=4$ kg, die mit der Systembeschleunigung mitgezogen wird)

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Masse (unten) | `m` | `4` kg |
| | Beschleunigung | `a` | `2` m/s² (aus Schritt 1) |
| Gesucht | Kraft | `F` | |

$$
\begin{align*}
\text{Gegeben:} \\
a &= 2 \text{ m/s}^2 \\
m &= 4 \text{ kg} \\
\text{Weg:} \\
F &= m \cdot a \\
&= 4 \cdot 2 \\
&= 8 \text{ N} \\
\text{ERG:} \quad F &= 8 \text{ N}
\end{align*}
$$

### Aufgabe 4: Newtonsche Axiome

> [!info] Aufgabenstellung
> Berechnen Sie jeweils die Beschleunigung der beiden reibungsfrei gelagerten und über eine Schnur auf einer ebenfalls reibungsfreien Rolle verbundenen Körper, wenn sie sich unter dem Einfluss der Gravitationskraft anfangen zu bewegen.
> 
> ![[Pasted image 20260505094522.png]]

**a) Tisch (m1=15 kg) + hängende Masse (m2=5 kg)** — Auswahl `1`

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Masse 1 (auf Tisch) | `m1` | `15` kg |
| | Masse 2 (hängend) | `m2` | `5` kg |
| Gesucht | Beschleunigung | `a` | |

$$
\begin{align*}
\text{Gegeben:} \\
m_1 &= 15 \text{ kg} \\
m_2 &= 5 \text{ kg} \\
\text{Weg:} \\
a &= \frac{m_2 \cdot g}{m_1+m_2} \\
&= \frac{5 \cdot 9.81}{15+5} \\
&= 2.453 \text{ m/s}^2 \\
\text{ERG:} \quad a &= 2.453 \text{ m/s}^2
\end{align*}
$$

**b) Atwoodsche Fallmaschine (m1=5 kg, m2=15 kg, beide hängend)** — Auswahl `2`

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Masse 1 (leichter) | `m1` | `5` kg |
| | Masse 2 (schwerer) | `m2` | `15` kg |
| Gesucht | Beschleunigung | `a` | |

$$
\begin{align*}
\text{Gegeben:} \\
m_1 &= 5 \text{ kg} \\
m_2 &= 15 \text{ kg} \\
\text{Weg:} \\
a &= \frac{(m_2-m_1) \cdot g}{m_1+m_2} \\
&= \frac{(15-5) \cdot 9.81}{5+15} \\
&= 4.905 \text{ m/s}^2 \\
\text{ERG:} \quad a &= 4.905 \text{ m/s}^2
\end{align*}
$$

### Aufgabe 5: Schiefe Ebene

> [!info] Aufgabenstellung
> Auf dem einen Ende eines 1 m langen Brettes liegt ein Holzklotz mit Haftreibungszahl $\mu_{HR}$ = 0,8 und Gleitreibungszahl $\mu_{GR}$ = 0,6. Berechnen Sie, wie hoch man das Brett auf der Seite anheben kann, bis der Klotz ins Rutschen gerät und welche Geschwindigkeit er dann am unteren Ende besitzt.
> 
> ![[Pasted image 20260505102326.png]]

**Lösung mit PhyCalc** (Thema `1`=Mechanik, keine Mehrfachauswahl nötig — der Winkel `alpha` wird aus `muH` abgeleitet, bevor überhaupt ein Zwei-Körper-Szenario in Frage käme):

**Schritt 1 — Höhe h (Grenzfall Haftung)**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Haftreibungszahl | `muH` | `0.8` |
| | Länge der Ebene | `l` | `1` m |
| Gesucht | Höhe | `h` | |

$$
\begin{align*}
\text{Gegeben:} \\
l &= 1 \text{ m} \\
\mu_H &= 0.8 \\
\text{Weg:} \\
\alpha &= \arctan(\mu_H) \\
&= \arctan(0.8) \\
&= 38.66° \\
h &= l \cdot \sin(\alpha) \\
&= 1 \cdot \sin(0.6747) \\
&= 0.6247 \text{ m} \\
\text{ERG:} \quad h &= 0.6247 \text{ m}
\end{align*}
$$

$\alpha$ = Neigungswinkel

Man kann das Brett also ca. **62,5 cm** anheben, bevor der Klotz ins Rutschen gerät.

**Schritt 2 — Endgeschwindigkeit v**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Haftreibungszahl | `muH` | `0.8` |
| | Gleitreibungszahl | `muG` | `0.6` |
| | Strecke | `s` | `1` m |
| | Anfangsgeschwindigkeit | `v0` | `0` m/s |
| Gesucht | Endgeschwindigkeit | `v` | |

$$
\begin{align*}
\text{Gegeben:} \\
\mu_G &= 0.6 \\
\mu_H &= 0.8 \\
s &= 1 \text{ m} \\
v_0 &= 0 \text{ m/s} \\
\text{Weg:} \\
\alpha &= \arctan(\mu_H) \\
&= \arctan(0.8) \\
&= 38.66° \\
a &= g(\sin(\alpha)-\mu_G \cos(\alpha)) \\
&= 9.81(\sin(0.6747)-0.6 \cos(0.6747)) \\
&= 1.532 \text{ m/s}^2 \\
v &= \sqrt{v_0^2+2 a s} \\
&= \sqrt{0^2+2 \cdot 1.532 \cdot 1} \\
&= 1.75 \text{ m/s} \\
\text{ERG:} \quad v &= 1.75 \text{ m/s}
\end{align*}
$$

$\alpha$ = Neigungswinkel
$a$ = Beschleunigung

Die Geschwindigkeit des Klotzes am unteren Ende beträgt ca. **1,75 m/s**.

### Aufgabe 6: Schiefe Ebene (6)

> [!info] Aufgabenstellung
> Die beiden rechts abgebildeten Körper sind mit einem Seil über eine feste Rolle miteinander verbunden. Der rechte Körper sitzt mit der Gleitreibungszahl $\mu$ = 0,3 auf der um $\alpha$ = 30° geneigten Ebene und ist fünfmal so schwer wie der linke. Berechnen Sie die Beschleunigung, mit der sich der rechte Körper nach unten bewegt.
> 
>![[Pasted image 20260505094701.png]]

Werte: linker (hängender) Körper $m_1=1$ kg, rechter (auf der Ebene) Körper $m_2=5$ kg (fünfmal so schwer), $\alpha=30°$, $\mu_{GR}=0,3$.

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Masse 1 (hängend) | `m1` | `1` kg |
| | Masse 2 (auf Ebene) | `m2` | `5` kg |
| | Neigungswinkel | `alpha` | `30` (Grad, ohne Einheit = automatisch Grad) |
| | Gleitreibungszahl | `muG` | `0.3` |
| Gesucht | Beschleunigung | `a` | |

$$
\begin{align*}
\text{Gegeben:} \\
\alpha &= 30° \\
m_1 &= 1 \text{ kg} \\
m_2 &= 5 \text{ kg} \\
\mu_G &= 0.3 \\
\text{Weg:} \\
a &= \frac{m_2 g \sin(\alpha) - \mu_G m_2 g \cos(\alpha) - m_1 g}{m_1+m_2} \\
&= \frac{5 \cdot 9.81 \cdot \sin(0.5236) - 0.3 \cdot 5 \cdot 9.81 \cdot \cos(0.5236) - 1 \cdot 9.81}{1+5} \\
&= 0.3286 \text{ m/s}^2 \\
\text{ERG:} \quad a &= 0.3286 \text{ m/s}^2
\end{align*}
$$

Der rechte Körper bewegt sich mit **0,3286 m/s²** nach unten.

### Aufgabe 7: Bremsweg

> [!info] Aufgabenstellung
> a) Berechnen Sie den Bremsweg bei einer Geschwindigkeit von 126 km/h, einer Reaktionszeit von einer Sekunde und einer Haftreibungszahl $\mu_{HR}$ = 0,5? Zeichnen Sie ein v-t-Diagramm.
> 
> b) Berechnen Sie, wie schnell darf ein Zug fahren darf, wenn der Gleitreibungskoeffizient $\mu_{GR}$ = 0,06 beträgt und eine Bremsstrecke von höchstens 500 m vorgeschrieben ist.

**a) Reaktionsweg** (gleichförmige Bewegung während der Reaktionszeit)

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Geschwindigkeit | `vkmh` | `126` km/h |
| | Reaktionszeit | `t` | `1` s |
| Gesucht | Reaktionsweg | `s` | |

$$
\begin{align*}
\text{Gegeben:} \\
t &= 1 \text{ s} \\
v_{\text{kmh}} &= 126 \text{ km/h} \\
\text{Weg:} \\
v_c &= \frac{v_{\text{kmh}}}{3.6} \\
&= \frac{126}{3.6} \\
&= 35 \text{ m/s} \\
s &= v_c \cdot t \\
&= 35 \cdot 1 \\
&= 35 \text{ m} \\
\text{ERG:} \quad s &= 35 \text{ m}
\end{align*}
$$

$v_c$ = Geschwindigkeit in SI-Einheiten

**a) Bremsweg** (gleichmäßig verzögert mit $a=-\mu_{HR}\cdot g = -0.5 \cdot 9.81 = -4.905\,\text{m/s}^2$, von Hand berechnet und als `a` eingegeben)

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Anfangsgeschwindigkeit | `v0` | `35` m/s |
| | Endgeschwindigkeit | `v` | `0` m/s |
| | Verzögerung | `a` | `-4.905` m/s² |
| Gesucht | Bremsweg | `s` | |

$$
\begin{align*}
\text{Gegeben:} \\
a &= -4.905 \text{ m/s}^2 \\
v &= 0 \text{ m/s} \\
v_0 &= 35 \text{ m/s} \\
\text{Weg:} \\
t &= \frac{v-v_0}{a} \\
&= \frac{0-35}{-4.905} \\
&= 7.136 \text{ s} \\
s &= v_0 \cdot t + 0.5 \cdot a \cdot t^2 \\
&= 35 \cdot 7.136 + 0.5 \cdot (-4.905) \cdot 7.136^2 \\
&= 124.9 \text{ m} \\
\text{ERG:} \quad s &= 124.9 \text{ m}
\end{align*}
$$

$t$ = Bremszeit

**Anhalteweg gesamt: 35 m + 124,9 m = 159,9 m** (Summe der beiden `s`-Ergebnisse, von Hand addiert — PhyCalc trennt Reaktions- und Bremsweg als zwei separate Rechnungen, weil beide dasselbe Symbol `s` verwenden).

**b) Maximalgeschwindigkeit des Zugs** (Verzögerung $a=-\mu_{GR}\cdot g=-0.06\cdot 9.81=-0.589\,\text{m/s}^2$, von Hand berechnet)

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Endgeschwindigkeit | `v` | `0` m/s |
| | Bremsweg (max.) | `s` | `500` m |
| | Verzögerung | `a` | `-0.589` m/s² |
| Gesucht | Anfangsgeschwindigkeit | `v0` | |

$$
\begin{align*}
\text{Gegeben:} \\
a &= -0.589 \text{ m/s}^2 \\
s &= 500 \text{ m} \\
v &= 0 \text{ m/s} \\
\text{Weg:} \\
v_0 &= \sqrt{v^2-2 a s} \\
&= \sqrt{0^2-2 \cdot (-0.589) \cdot 500} \\
&= 24.27 \text{ m/s} \\
\text{ERG:} \quad v_0 &= 24.27 \text{ m/s}
\end{align*}
$$

Umrechnung in km/h (Ergebnis erneut eingeben, diesmal als `vc`, um die Einheiten-Brücke zu nutzen):

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Geschwindigkeit (SI) | `vc` | `24.27` m/s |
| Gesucht | Geschwindigkeit | `vkmh` | |

$$
\begin{align*}
\text{Gegeben:} \\
v_c &= 24.27 \text{ m/s} \\
\text{Weg:} \\
v_{\text{kmh}} &= v_c \cdot 3.6 \\
&= 24.27 \cdot 3.6 \\
&= 87.37 \text{ km/h} \\
\text{ERG:} \quad v_{\text{kmh}} &= 87.37 \text{ km/h}
\end{align*}
$$

Der Zug darf höchstens **87,37 km/h** fahren.

### Aufgabe 8: Beschleunigung und Inertialsysteme

> [!info] Aufgabenstellung
> Ein 40 t schweres Flugzeug mit einer Startgeschwindigkeit von 216 km/h soll von dem 100 m langen Katapult eines Flugzeugträgers abfliegen. Das riesige Schiff dreht dazu jedes Mal zusammen mit allen Begleitschiffen in den 36 km/h schnellen Wind und beschleunigt auf 54 km um zusätzlichen Auftrieb zu erzeugen.
>
> a) Berechnen Sie die auf dem Flugdeck herrschende Windgeschwindigkeit
>
> b) Berechnen Sie die Geschwindigkeit, die das Flugzeug relativ zum Flugdeck erreichen muss.
>
> c) Berechnen Sie die notwendige Beschleunigung auf dem Katapult.
>
> d) Berechnen Sie die Kraft, die das Vorderrad des Flugzeuges übertragen muss, an dem der Katapultschlitten festgehakt ist.

**a) + b): PhyCalc nicht anwendbar** — reine Vektoraddition/-subtraktion von Geschwindigkeiten (Relativbewegung), kein Formel-Solver-Fall:
- Windgeschwindigkeit auf Deck: $v_{Deck} = 36 + 54 = 90\,\text{km/h}$
- Relativgeschwindigkeit Flugzeug↔Deck: $v_{rel} = 216 - 90 = 126\,\text{km/h} = 35\,\text{m/s}$

**c) Beschleunigung auf dem Katapult** — Lösung mit PhyCalc (Thema `1`=Mechanik, keine Mehrfachauswahl nötig):

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Anfangsgeschwindigkeit | `v0` | `0` m/s |
| | Endgeschwindigkeit | `v` | `35` m/s |
| | Strecke | `s` | `100` m |
| Gesucht | Beschleunigung | `a` | |

$$
\begin{align*}
\text{Gegeben:} \\
s &= 100 \text{ m} \\
v &= 35 \text{ m/s} \\
v_0 &= 0 \text{ m/s} \\
\text{Weg:} \\
a &= \frac{v^2-v_0^2}{2s} \\
&= \frac{35^2-0^2}{2 \cdot 100} \\
&= 6.125 \text{ m/s}^2 \\
\text{ERG:} \quad a &= 6.125 \text{ m/s}^2
\end{align*}
$$

**d) Kraft am Vorderrad**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Masse | `m` | `40000` kg |
| | Beschleunigung | `a` | `6.125` m/s² (aus c) |
| Gesucht | Kraft | `F` | |

$$
\begin{align*}
\text{Gegeben:} \\
a &= 6.125 \text{ m/s}^2 \\
m &= 40000 \text{ kg} \\
\text{Weg:} \\
F &= m \cdot a \\
&= 40000 \cdot 6.125 \\
&= 245000 \text{ N} \\
\text{ERG:} \quad F &= 245000 \text{ N}
\end{align*}
$$

Der Katapultschlitten muss eine Kraft von **245.000 N (245 kN)** auf das Vorderrad übertragen.

## Kinematik (AB3)

### Aufgabe 1: Winkelbeschleunigung

> [!info] Aufgabenstellung
> Ein Elektromotor beschleunigt während der ersten 40 Umdrehungen gleichmäßig aus dem Stillstand auf eine Drehzahl von 2000 Umdrehungen pro Minute.
> 
> a) Berechnen Sie die Winkelbeschleunigung des Elektromotors!
> b) Berechnen Sie die Zeit, die der Elektromotor benötigt, um die o.g. Drehzahl zu erreichen!

**a) Winkelbeschleunigung**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Anzahl Umdrehungen | `N` | `40` |
| | Enddrehzahl | `n` | `2000` 1/min |
| Gesucht | Winkelbeschleunigung | `alphaW` | |

$$
\begin{align*}
\text{Gegeben:} \\
N &= 40 \\
n &= 33.33 \text{ 1/s} \\
\text{Weg:} \\
\varphi &= 2\pi N \\
&= 2\pi \cdot 40 \\
&= 14400° \\
\omega &= 2\pi n \\
&= 2\pi \cdot 33.33 \\
&= 209.4 \text{ rad/s} \\
\alpha_W &= \frac{\omega^2}{2\varphi} \\
&= \frac{209.4^2}{2 \cdot 251.3} \\
&= 87.27 \text{ rad/s}^2 \\
\text{ERG:} \quad \alpha_W &= 87.27 \text{ rad/s}^2
\end{align*}
$$

$\varphi$ = Winkel in Radiant
$\omega$ = Winkelgeschwindigkeit

**b) Zeitdauer der Beschleunigung**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Anzahl Umdrehungen | `N` | `40` |
| | Enddrehzahl | `n` | `2000` 1/min |
| Gesucht | Zeit | `t` | |

$$
\begin{align*}
\text{Gegeben:} \\
N &= 40 \\
n &= 33.33 \text{ 1/s} \\
\text{Weg:} \\
\varphi &= 2\pi N \\
&= 2\pi \cdot 40 \\
&= 14400° \\
\omega &= 2\pi n \\
&= 2\pi \cdot 33.33 \\
&= 209.4 \text{ rad/s} \\
\alpha_W &= \frac{\omega^2}{2\varphi} \\
&= \frac{209.4^2}{2 \cdot 251.3} \\
&= 87.27 \text{ rad/s}^2 \\
t &= \frac{\omega}{\alpha_W} \\
&= \frac{209.4}{87.27} \\
&= 2.4 \text{ s} \\
\text{ERG:} \quad t &= 2.4 \text{ s}
\end{align*}
$$

$\varphi$ = Winkel in Radiant
$\omega$ = Winkelgeschwindigkeit
$\alpha_W$ = Winkelbeschleunigung

### Aufgabe 2: Beschleunigung und Reibung

> [!info] Aufgabenstellung
> Ein Kraftfahrzeug mit einer Masse von 1200 kg beschleunigt gleichmäßig mit $1,1 \text{ m/s}^2$ von $0 \text{ km/h}$ auf $96 \text{ km/h}$ (Frage: gelingt dies mit einer festen Einstellung des Gaspedals?). Die Rollreibungskraft beträgt $240 \text{ N}$. Für die Luftreibungskraft (turbulente Reibung) gilt die Gleichung $|\vec{F}_{Luft}| = \frac{1}{2} \cdot \rho_{Luft} \cdot c_w \cdot A \cdot v^2$ (mit einer Luftdichte $\rho_{Luft} = 1,293 \text{ kg/m}^3$, einem Luftwiderstandsbeiwert $c_w = 0,29$ und $A = 1,9 \text{ m}^2$, der Frontfläche des Fahrzeugs). Berechnen Sie:
> 
> a) die Zeitdauer des Beschleunigungsvorgangs!
> b) die während des Beschleunigungsvorgangs zurückgelegte Strecke!
> c) die während des Beschleunigungsvorgangs verrichtete Reibungsarbeit (für Rollreibung und turbulente Reibung)!

**a) Zeitdauer**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Endgeschwindigkeit | `v` | `96` km/h |
| | Anfangsgeschwindigkeit | `v0` | `0` m/s |
| | Beschleunigung | `a` | `1.1` m/s² |
| Gesucht | Zeit | `t` | |

$$
\begin{align*}
\text{Gegeben:} \\
a &= 1.1 \text{ m/s}^2 \\
v &= 26.67 \text{ m/s} \\
v_0 &= 0 \text{ m/s} \\
\text{Weg:} \\
t &= \frac{v-v_0}{a} \\
&= \frac{26.67-0}{1.1} \\
&= 24.24 \text{ s} \\
\text{ERG:} \quad t &= 24.24 \text{ s}
\end{align*}
$$

**b) Zurückgelegte Strecke**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Endgeschwindigkeit | `v` | `96` km/h |
| | Anfangsgeschwindigkeit | `v0` | `0` m/s |
| | Beschleunigung | `a` | `1.1` m/s² |
| Gesucht | Strecke | `s` | |

$$
\begin{align*}
\text{Gegeben:} \\
a &= 1.1 \text{ m/s}^2 \\
v &= 26.67 \text{ m/s} \\
v_0 &= 0 \text{ m/s} \\
\text{Weg:} \\
t &= \frac{v-v_0}{a} \\
&= \frac{26.67-0}{1.1} \\
&= 24.24 \text{ s} \\
s &= v_0 \cdot t + 0.5 \cdot a \cdot t^2 \\
&= 0 \cdot 24.24 + 0.5 \cdot 1.1 \cdot 24.24^2 \\
&= 323.2 \text{ m} \\
\text{ERG:} \quad s &= 323.2 \text{ m}
\end{align*}
$$

$t$ = Zeit

**c) Reibungsarbeit**

Die *Rollreibungskraft* ist konstant (240 N), also einfach Kraft × Weg — als `F` eingeben:

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Rollreibungskraft | `F` | `240` N |
| | Strecke | `s` | `323.2` m (aus b) |
| Gesucht | Arbeit | `W` | |

$$
\begin{align*}
\text{Gegeben:} \\
F &= 240 \text{ N} \\
s &= 323.2 \text{ m} \\
\text{Weg:} \\
W &= F \cdot s \\
&= 240 \cdot 323.2 \\
&= 77568 \text{ J} \\
\text{ERG:} \quad W &= 77568 \text{ J}
\end{align*}
$$

Die *Luftreibungskraft* wächst mit $v^2$, also ist die Arbeit ein Integral. Bei gleichmäßiger Beschleunigung aus dem Stillstand gilt $v^2 = 2as$, damit ist $F_{Luft}$ linear im Weg und die Arbeit $W = \frac{1}{4}\,c_w A \rho\, v^2 s$. Dieses Szenario ist im Programm hinterlegt (Eingabe `cw`, `Av`, `rho`, `v`, `s`):

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Widerstandsbeiwert | `cw` | `0.29` |
| | Frontfläche | `Av` | `1.9` m² |
| | Luftdichte | `rho` | `1.293` kg/m³ |
| | Endgeschwindigkeit | `v` | `96` km/h |
| | Strecke | `s` | `323.2` m (aus b) |
| Gesucht | Arbeit | `W` | |

$$
\begin{align*}
\text{Gegeben:} \\
A_v &= 1.9 \text{ m}^2 \\
c_w &= 0.29 \\
\rho &= 1.293 \text{ kg/m}^3 \\
s &= 323.2 \text{ m} \\
v &= 26.67 \text{ m/s} \\
\text{Weg:} \\
W &= 0.25 \cdot c_w \cdot A_v \cdot \rho \cdot v^2 \cdot s \\
&= 0.25 \cdot 0.29 \cdot 1.9 \cdot 1.293 \cdot 26.67^2 \cdot 323.2 \\
&= 40935 \text{ J} \\
\text{ERG:} \quad W &= 40935 \text{ J}
\end{align*}
$$

Gesamte Reibungsarbeit: $77568 + 40935 \approx 118{,}5 \text{ kJ}$. (Zusatzfrage „festes Gaspedal": Da die Luftreibung mit $v^2$ steigt, müsste die Antriebskraft mitwachsen — mit fester Gaspedalstellung gelingt die gleichmäßige Beschleunigung **nicht**.)

### Aufgabe 3: Kreisbewegung und Haftreibung

> [!info] Aufgabenstellung
> Auf einer sich drehenden Scheibe liegt im Abstand von $50 \text{ cm}$ von der Drehachse (=Symmetrieachse) eine (punktförmige) Masse von $1 \text{ kg}$. Berechnen Sie die Drehzahl, bis zu welcher die Masse im o.g. Abstand auf der Scheibe unverändert liegen bleibt, wenn die Haftreibungszahl $0,3$ beträgt!

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Radius | `r` | `0.5` m |
| | Masse | `m` | `1` kg |
| | Haftreibungszahl | `muH` | `0.3` |
| Gesucht | Drehzahl | `n` | |

$$
\begin{align*}
\text{Gegeben:} \\
m &= 1 \text{ kg} \\
\mu_H &= 0.3 \\
r &= 0.5 \text{ m} \\
\text{Weg:} \\
\omega &= \sqrt{\frac{\mu_H \cdot g}{r}} \\
&= \sqrt{\frac{0.3 \cdot 9.81}{0.5}} \\
&= 2.426 \text{ rad/s} \\
n &= \frac{\omega}{2\pi} \\
&= \frac{2.426}{2\pi} \\
&= 0.3861 \text{ 1/s} \\
\text{ERG:} \quad n &= 0.3861 \text{ 1/s}
\end{align*}
$$

$\omega$ = Winkelgeschwindigkeit

### Aufgabe 4: Bremsweg

> [!info] Aufgabenstellung
> In der Fahrschule lernt man folgende Formel für den Bremsweg in Metern bei einer normalen Bremsung:
> 
> $$s_{Brems} = \left(\frac{\text{Geschwindigkeit in km/h}}{10}\right) \times \left(\frac{\text{Geschwindigkeit in km/h}}{10}\right)$$
> 
> Berechnen Sie den zugrundeliegenden Reibungskoeffizienten, der als konstant angenommen wird, und interpretieren Sie das Ergebnis.

Physikalisch gilt für den Bremsweg $s_B = \frac{v^2}{2\,\mu\,g}$ (mit $v$ in m/s). Setzt man das mit der Fahrschulformel $s_B = (v_{kmh}/10)^2$ gleich, ergibt sich ein konstantes $\mu$. Das Programm verkettet beides automatisch: nur `vkmh` eingeben, gesucht `muG` — der Bremsweg kommt aus der Fahrschulformel, daraus die Reibungszahl (Beispielwert $v = 100$ km/h; das Ergebnis ist unabhängig von der Geschwindigkeit).

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Geschwindigkeit | `vkmh` | `100` km/h |
| Gesucht | Gleitreibungszahl | `muG` | |

$$
\begin{align*}
\text{Gegeben:} \\
v_{\text{kmh}} &= 100 \text{ km/h} \\
\text{Weg:} \\
s_B &= \left(\frac{v_{\text{kmh}}}{10}\right)^2 \\
&= \left(\frac{100}{10}\right)^2 \\
&= 100 \text{ m} \\
\mu_G &= \frac{(v_{\text{kmh}}/3.6)^2}{2 g s_B} \\
&= \frac{(100/3.6)^2}{2 \cdot 9.81 \cdot 100} \\
&= 0.3933 \\
\text{ERG:} \quad \mu_G &= 0.3933
\end{align*}
$$

$s_B$ = Bremsweg

**Interpretation:** $\mu \approx 0{,}39$ ist ein realistischer Gleitreibungswert für Reifen auf trockener, griffiger Fahrbahn. Die Fahrschulformel entspricht also einer normalen (nicht maximalen) Bremsung; eine Vollbremsung mit ABS erreicht eher $\mu \approx 0{,}7\!-\!0{,}8$ und damit den halben Bremsweg.

### Aufgabe 5: Impuls und Raketenantrieb

> [!info] Aufgabenstellung
> Eine Rakete mit einer Masse von $200 \text{ t}$ soll von der Erdoberfläche aus senkrecht starten.
> 
> a) Berechnen Sie die Schubkraft, die auf die Rakete wirken muss, damit sie gerade abhebt.
> b) In einer Sekunde werden Verbrennungsgase der Masse $0,74 \text{ t}$ mit der Geschwindigkeit $4,0 \text{ km/s}$ ausgestoßen. Berechnen Sie die mittlere Schubkraft, die dadurch hervorgerufen wird.
> c) Berechnen Sie die mittlere Beschleunigung, mit der die Rakete gehoben wird.

**a) Schubkraft zum Abheben**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Masse | `m` | `200` t |
| Gesucht | Gewichtskraft | `FG` | |

$$
\begin{align*}
\text{Gegeben:} \\
m &= 200000 \text{ kg} \\
\text{Weg:} \\
F_G &= m \cdot g \\
&= 200000 \cdot 9.81 \\
&= 1962000 \text{ N} \\
\text{ERG:} \quad F_G &= 1962000 \text{ N}
\end{align*}
$$

Die Schubkraft muss mindestens **1.962.000 N (1,962 MN)** betragen.

**b) Mittlere Schubkraft durch Gasausstoß**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Massenstrom | `mdot` | `740` kg/s |
| | Ausströmgeschwindigkeit | `ve` | `4` km/s |
| Gesucht | Schubkraft | `FS` | |

$$
\begin{align*}
\text{Gegeben:} \\
\dot{m} &= 740 \text{ kg/s} \\
v_e &= 4000 \text{ m/s} \\
\text{Weg:} \\
F_S &= \dot{m} \cdot v_e \\
&= 740 \cdot 4000 \\
&= 2960000 \text{ N} \\
\text{ERG:} \quad F_S &= 2960000 \text{ N}
\end{align*}
$$

**c) Mittlere Beschleunigung**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Schubkraft | `FS` | `2960000` N (aus b) |
| | Gewichtskraft | `FG` | `1962000` N (aus a) |
| | Masse | `m` | `200000` kg |
| Gesucht | Beschleunigung | `a` | |

$$
\begin{align*}
\text{Gegeben:} \\
F_G &= 1962000 \text{ N} \\
F_S &= 2960000 \text{ N} \\
m &= 200000 \text{ kg} \\
\text{Weg:} \\
a &= \frac{F_S-F_G}{m} \\
&= \frac{2960000-1962000}{200000} \\
&= 4.99 \text{ m/s}^2 \\
\text{ERG:} \quad a &= 4.99 \text{ m/s}^2
\end{align*}
$$


## Energie (AB4)

### Aufgabe 1: Federspannarbeit

> [!info] Aufgabenstellung
> Zum weiteren Dehnen einer vorgespannten Feder auf 4 cm Gesamtverlängerung wird die Spannarbeit 0,06 J aufgebracht. Die Federkonstante beträgt 1 N/cm. Berechnen Sie, um welche Länge gegenüber ihrer Ruhelage die Feder anfangs gespannt war.

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Spannarbeit | `W` | `0.06` J |
| | Federkonstante | `D` | `1` N/cm |
| | Endauslenkung | `xe` | `4` cm |
| Gesucht | Anfangsauslenkung | `xa` | |

$$
\begin{align*}
\text{Gegeben:} \\
D &= 100 \text{ N/m} \\
W &= 0.06 \text{ J} \\
x_e &= 0.04 \text{ m} \\
\text{Weg:} \\
x_a &= \sqrt{x_e^2-\frac{2W}{D}} \\
&= \sqrt{0.04^2-\frac{2 \cdot 0.06}{100}} \\
&= 0.02 \text{ m} \\
\text{ERG:} \quad x_a &= 0.02 \text{ m}
\end{align*}
$$

### Aufgabe 2: Federspannarbeit

> [!info] Aufgabenstellung
> Eine Feder ist durch die Kraft $F_1 = 1.5$ N vorgespannt. Berechnen Sie die Endkraft, wenn für ein weiteres Spannen um 10 cm die Arbeit 0,25 J erforderlich ist.
>
Zur Kontrolle: $F_2 = 3.5$ N.

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Vorspannkraft | `F1` | `1.5` N |
| | Zusätzlicher Weg | `s` | `10` cm |
| | Spannarbeit | `W` | `0.25` J |
| Gesucht | Endkraft | `F2` | |

$$
\begin{align*}
\text{Gegeben:} \\
F_1 &= 1.5 \text{ N} \\
W &= 0.25 \text{ J} \\
s &= 0.1 \text{ m} \\
\text{Weg:} \\
F_2 &= \frac{2W}{s}-F_1 \\
&= \frac{2 \cdot 0.25}{0.1}-1.5 \\
&= 3.5 \text{ N} \\
\text{ERG:} \quad F_2 &= 3.5 \text{ N}
\end{align*}
$$
### Aufgabe 3: Jo-jo (nicht integriert)

> [!info] Aufgabenstellung
> Ein Jo-Jo besteht aus zwei Scheiben (Radius R<sub>s</sub> = 2,5 cm, Masse jeweils m<sub>s</sub> = 10 g) und einer Achse aus einem dünnwandigen Hohlzylinder ( $R_A = 0.5$ cm, $m_A = 2.5$ g). Die Schnur ist $L = 1$ m lang.
>
> a) Berechnen Sie das Trägheitsmoment des Jo-jo.
>
> b) Berechnen Sie die Geschwindigkeit des dünnwandigen Hohlzylinders und die Drehzahl, wenn sich die Schnur (fast) vollständig abgewickelt hat, d.h. kurz vor dem Umkehrpunkt.
>
Zur Kontrolle: a) $J_{ges} = 6{,}3125 \cdot 10^{-6}$ kg · m<sup>2</sup>b) $v \approx 1{,}3\frac{\text{m}}{\text{s}}$ ; $n \approx 2530 \frac{1}{\text{min}}$

```tikz
\begin{document}
\begin{tikzpicture}

  \draw[thick] (2,0) arc[start angle=0, end angle=360, radius=2];

  \draw[thick] (0,0) -- (1.4,1.4);

  \node[above left] at (0.7,0.7) {$R_s$};

  \draw[thick] (0.4,0) arc[start angle=0, end angle=360, radius=0.4];

  \draw[thick] (0,0) -- (0,-0.4);

  \node[right] at (0.1,-0.2) {$R_A$};

  \draw[thick] (0.4,0) -- (0.4,4);

  \node[above] at (0.4,4.2) {Fixpunkt};

  \draw[thick] (0.8,0) -- (0.8,4);

  \node[right] at (0.8,2) {$L = 1$ m};

\end{tikzpicture}
\end{document}
```

**a) Trägheitsmoment**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Radius Scheibe | `Rs` | `2.5` cm |
| | Masse Scheibe (je) | `ms` | `10` g |
| | Radius Achse | `RA` | `0.5` cm |
| | Masse Achse | `mA` | `2.5` g |
| Gesucht | Gesamtträgheitsmoment | `Jges` | |

$$
\begin{align*}
\text{Gegeben:} \\
R_s &= 0.025 \text{ m} \\
m_s &= 0.01 \text{ kg} \\
R_A &= 0.005 \text{ m} \\
m_A &= 0.0025 \text{ kg} \\
\text{Weg:} \\
J_s &= 0.5 \cdot m_s \cdot R_s^2 \\
&= 0.5 \cdot 0.01 \cdot 0.025^2 \\
&= 0.000003125 \text{ kg} \cdot \text{m}^2 \\
J_A &= m_A \cdot R_A^2 \\
&= 0.0025 \cdot 0.005^2 \\
&= 0.0000000625 \text{ kg} \cdot \text{m}^2 \\
J_{\text{ges}} &= 2J_s+J_A \\
&= 2 \cdot 0.000003125+0.0000000625 \\
&= 0.0000063125 \text{ kg} \cdot \text{m}^2 \\
\text{ERG:} \quad J_{\text{ges}} &= 0.0000063125 \text{ kg} \cdot \text{m}^2
\end{align*}

$J_s$ = Trägheitsmoment einer Scheibe
$J_A$ = Trägheitsmoment der Achse
$$

**b) Endgeschwindigkeit und Drehzahl**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Gesamtmasse (2·ms+mA) | `mges` | `0.0225` kg |
| | Schnurlänge | `L` | `1` m |
| | Gesamtträgheitsmoment | `Jges` | `0.0000063125` kg·m² (aus a) |
| | Radius Achse | `RA` | `0.5` cm |
| Gesucht | Geschwindigkeit, Drehzahl | `v`, `n` | |

$$
\begin{align*}
\text{Gegeben:} \\
J_{\text{ges}} &= 0.0000063125 \text{ kg} \cdot \text{m}^2 \\
L &= 1 \text{ m} \\
R_A &= 0.005 \text{ m} \\
m_{\text{ges}} &= 0.0225 \text{ kg} \\
\text{Weg:} \\
v &= \sqrt{\frac{2 m_{\text{ges}} g L}{m_{\text{ges}}+\frac{J_{\text{ges}}}{R_A^2}}} \\
&= \sqrt{\frac{2 \cdot 0.0225 \cdot 9.81 \cdot 1}{0.0225+\frac{0.0000063125}{0.005^2}}} \\
&= 1.267 \text{ m/s} \\
\omega &= \frac{v}{R_A} \\
&= \frac{1.267}{0.005} \\
&= 253.4 \text{ rad/s} \\
n &= \frac{\omega}{2\pi} \\
&= \frac{253.4}{2\pi} \\
&= 40.33 \text{ 1/s} \\
\text{ERG:} \quad n &= 40.33 \text{ 1/s} \quad (= 2420 \text{ 1/min})
\end{align*}
$$

$\omega$ = Winkelgeschwindigkeit

### Aufgabe 4

> [!info] Aufgabenstellung
> Die folgenden Aussagen sind der Alltagssprache entnommen und entsprechen nicht der physikalischen Fachsprache. Überlegen Sie zunächst jeweils, was aus physikalischer Sicht eigentlich ausgesagt werden soll; dabei kann eine Mindmap zu den Begriffen Energie, Arbeit, Leistung, Kraft, Beschleunigung, Höhenenergie, kinetische Energie, Geschwindigkeit und Masse von Nutzen sein. Übersetzen Sie dann jede Aussage in "physikalisch korrekte Sprache" - Sie werden feststellen, dass solche fachlich korrekten Formulierungen sich in der Regel nicht sehr "alltagstauglich" anhören.
>
> (1) Das neue Wasserkraftwerk liefert jährlich eine Leistung von 200 MW.
>
> (2) Überhöhte Geschwindigkeiten beim Autofahren sind sehr gefährlich - in einem schnell fahrenden Auto steckt eine enorme Kraft.
>
> (3) Unser neues Auto beschleunigt mit 115 kW!
>
> (4) Solarenergie – Kraft aus der Natur!
>
> (5) Mit letzter Kraft hat es der Marathonläufer über die Ziellinie geschafft.
>
> (6) Beim Solarauto-Rennen sind mehrere Fahrzeuge liegen geblieben - wegen des stark bewölkten Himmels ist ihnen die Antriebskraft ausgegangen.
>
> (7) Windkrafträder wandeln die Windenergie in elektrischen Strom um.
>
> (8) Über die Treppe in den fünften Stock - das ist schon eine Leistung!
>
> (9) Zu den erneuerbaren Energien gehören Sonnenenergie, Windenergie, Wasserkraft und Biomasse.
>
> (10) Der Aufstieg auf den Gipfel war eine enorme Kraftleistung
>
> Finden Sie weitere Beispiele aus der Alltagssprache oder Medienveröffentlichungen. Untersuchen Sie diese wie die oben aufgeführten und formulieren Sie diese physikalisch korrekt

**Lösung: Mindmap der Begriffe**

```markmap
---
markmap:
  height: 400
---
# Physikalische Grundbegriffe
## Energie (E)
- Fähigkeit, Arbeit zu verrichten
- Einheit: Joule [J]
- **Höhenenergie** ($E_{pot} = m \cdot g \cdot h$)
- **kinetische Energie** ($E_{kin} = \frac{1}{2} m \cdot v^2$)
- Energieerhaltungssatz
## Arbeit (W)
- $W = F \cdot s$ (Kraft $\cdot$ Weg)
- Prozess der Energieumwandlung
- Einheit: Joule [J]
## Leistung (P)
- $P = \frac{W}{t}$ (Arbeit pro Zeit)
- Einheit: Watt [W]
## Dynamik (Kraft & Masse)
- **Kraft** ($F = m \cdot a$)
- **Masse** (Trägheit eines Körpers)
- **Beschleunigung** (Wirkung einer Kraft)
## Kinematik (Bewegung)
- **Geschwindigkeit** ($v = \frac{s}{t}$)
- **Beschleunigung** ($a = \frac{\Delta v}{\Delta t}$)
```

**Physikalische Korrektur der Aussagen:**

1. Das Wasserkraftwerk liefert jährlich eine **Energie** von 200 MWh (Leistung wäre MW ohne Zeitbezug).
2. In einem schnell fahrenden Auto steckt eine enorme **kinetische Energie** (Kraft wirkt nur bei Änderung des Impulses).
3. Das Auto beschleunigt mit einer **Leistung** von 115 kW (Beschleunigung ist $m/s^2$).
4. Solarenergie – **Energie** aus der Natur.
5. Mit letzter **Energie** (Kraft ist die momentane Einwirkung).
6. Ihnen ist die **Energie** ausgegangen (Antriebskraft ist die Folge der Energie).
7. Wandeln Windenergie in **elektrische Energie** um (Strom ist die Ladungsbewegung).
8. Das ist eine ordentliche **Arbeit** (Leistung wäre es nur, wenn man die Zeit betrachtet).
9. (Physikalisch weitgehend korrekt, "Wasserkraft" -> Wasserenergie).
10. Enorme **Arbeit** bzw. **Leistung**.

## Schwingungen (AB5)
### Aufgabe 1: Gedämpfte Schwingung

> [!info] Aufgabenstellung
> An einer Feder mit der Federhärte 20 N/m hängt eine Kugel der Masse 100 g. Die Kugel wird um 10 cm nach unten ausgelenkt und dann losgelassen. Reibungseffekte sollen zunächst vernachlässigt werden.
>
> a) Berechnen Sie die Schwingungsdauer der auftretenden harmonischen Schwingung und geben Sie für die Kugel die Ortsfunktion $x(t)$ an.
>
> b) Bestimmen Sie die maximale Geschwindigkeit und die maximale Beschleunigung der Kugel und geben Sie dann die Geschwindigkeit v(t) und die Beschleunigung $a(t)$ in Abhängigkeit von der Zeit an.
>
> c) Pro Schwingungsdauer gehen etwa 5% der mechanischen Energie auf Grund von Reibungseffekten verloren. Bestimmen Sie die Abnahme der Amplitude pro Schwingungsdauer und berechnen Sie, wie groß die Amplitude nach 10 Sekunden ist.

**a) Schwingungsdauer**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Federkonstante | `D` | `20` N/m |
| | Masse | `m` | `100` g |
| Gesucht | Periodendauer | `T` | |

$$
\begin{align*}
\text{Gegeben:} \\
D &= 20 \text{ N/m} \\
m &= 0.1 \text{ kg} \\
\text{Weg:} \\
\omega_0 &= \sqrt{\frac{D}{m}} \\
&= \sqrt{\frac{20}{0.1}} \\
&= 14.14 \text{ rad/s} \\
T &= \frac{2\pi}{\omega_0} \\
&= \frac{2\pi}{14.14} \\
&= 0.4443 \text{ s} \\
\text{ERG:} \quad T &= 0.4443 \text{ s}
\end{align*}
$$

Ortsfunktion (aus $\omega_0$ und Start bei maximaler Auslenkung, also Cosinus):
$$x(t) = A \cdot \cos(\omega_0 \cdot t) = 0,1 \cdot \cos(14,14 \cdot t) \text{ m}$$

$\omega_0$ = Eigenfrequenz

**b) Maximalgeschwindigkeit und Maximalbeschleunigung**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Federkonstante | `D` | `20` N/m |
| | Masse | `m` | `100` g |
| | Amplitude | `A` | `10` cm |
| Gesucht | Maximalgeschw., -beschl. | `vmax`, `amax` | |

$$
\begin{align*}
\text{Gegeben:} \\
A &= 0.1 \text{ m} \\
D &= 20 \text{ N/m} \\
m &= 0.1 \text{ kg} \\
\text{Weg:} \\
\omega_0 &= \sqrt{\frac{D}{m}} \\
&= \sqrt{\frac{20}{0.1}} \\
&= 14.14 \text{ rad/s} \\
T &= \frac{2\pi}{\omega_0} \\
&= \frac{2\pi}{14.14} \\
&= 0.4443 \text{ s} \\
\omega &= \frac{2\pi}{T} \\
&= \frac{2\pi}{0.4443} \\
&= 14.14 \text{ rad/s} \\
v_{\max} &= A \cdot \omega \\
&= 0.1 \cdot 14.14 \\
&= 1.414 \text{ m/s} \\
a_{\max} &= A \cdot \omega^2 \\
&= 0.1 \cdot 14.14^2 \\
&= 20 \text{ m/s}^2 \\
\text{ERG:} \quad v_{\max} &= 1.414 \text{ m/s} \quad a_{\max} &= 20 \text{ m/s}^2
\end{align*}
$$

Damit: $v(t) = -1{,}414 \cdot \sin(14{,}14 \cdot t)$ m/s, $a(t) = -20 \cdot \cos(14{,}14 \cdot t)$ m/s².

$\omega_0$ = Eigenfrequenz
$T$ = Periodendauer
$\omega$ = Kreisfrequenz

**c) Amplitude nach 10 s (5 % Energieverlust pro Periode)**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Federkonstante | `D` | `20` N/m |
| | Masse | `m` | `100` g |
| | Amplitude | `A` | `10` cm |
| | Energieverlust pro Periode | `pv` | `0.05` |
| | Zeit | `t` | `10` s |
| Gesucht | Amplitude nach t | `At` | |

$$
\begin{align*}
\text{Gegeben:} \\
A &= 0.1 \text{ m} \\
D &= 20 \text{ N/m} \\
m &= 0.1 \text{ kg} \\
p_v &= 0.05 \\
t &= 10 \text{ s} \\
\text{Weg:} \\
\omega_0 &= \sqrt{\frac{D}{m}} \\
&= \sqrt{\frac{20}{0.1}} \\
&= 14.14 \text{ rad/s} \\
T &= \frac{2\pi}{\omega_0} \\
&= \frac{2\pi}{14.14} \\
&= 0.4443 \text{ s} \\
A_t &= A \cdot \sqrt{1-p_v}^{t/T} \\
&= 0.1 \cdot \sqrt{1-0.05}^{10/0.4443} \\
&= 0.05614 \text{ m} \\
\text{ERG:} \quad A_t &= 0.05614 \text{ m}
\end{align*}
$$

$\omega_0$ = Eigenfrequenz
$T$ = Periodendauer

### Aufgabe 2: Harmonische Schwingung am Seil

> [!info] Aufgabenstellung
> Ein Seil wird durch gleichmäßige Auf- und Abbewegung mit f = 2,0 Hz harmonisch angeregt, wobei sich Wellen der Länge 30 cm und der Amplitude 3,0 cm bilden. Zur Zeit to = 0,0 s durchläuft der Anfang des Seils gerade den positiven (von unten nach oben) Nulldurchgang.
>
> a) Berechnen Sie die Phasengeschwindigkeit c.
>
> b) Stellen Sie die allgemeine Formel $y(x,t) = ...$ für die Auslenkung der Welle auf.
>
> c) Stellen Sie die Formel für den zeitlichen Verlauf der Schwingung des Punktes x20 auf, der sich 20 cm vom Anfang des Wellenträgers entfernt befindet.
>
> d) Berechnen Sie die Auslenkung des Punktes $x_{15}$ = 15 cm zur Zeit $t_1$ = 625 ms und geben Sie an, zu welchen Zeiten dieser Punkt wieder die gleiche Auslenkung besitzt. Zeigen Sie rechnerisch, wie sich das Ergebnis für $t_1$ = 625 ms ändern würde.
>
> e) Lösen Sie die Teilaufgabe b) für den Fall, dass der Anfang des Wellenträgers zur Zeit $t_0$ = 0,0 s (I.) gerade den negativen Nulldurchgang durchläuft bzw. (II.) gerade maximale positive Auslenkung besitzt.

**a) Phasengeschwindigkeit**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Wellenlänge | `lam` | `30` cm |
| | Frequenz | `f` | `2` Hz |
| Gesucht | Phasengeschwindigkeit | `cph` | |

$$
\begin{align*}
\text{Gegeben:} \\
f &= 2 \text{ Hz} \\
\lambda &= 0.3 \text{ m} \\
\text{Weg:} \\
c_{\text{ph}} &= \lambda \cdot f \\
&= 0.3 \cdot 2 \\
&= 0.6 \text{ m/s} \\
\text{ERG:} \quad c_{\text{ph}} &= 0.6 \text{ m/s}
\end{align*}
$$

b)-e) verlangen das Aufstellen und Auswerten der Wellenfunktion $y(x,t)$ (Phasenverschiebung, Rückrechnung auf Zeitpunkte) — das ist symbolische Herleitung, kein Einsetzen einzelner Größen, und liegt außerhalb dessen, was der Taschenrechner-Solver abdeckt.

### Zusatzaufgabe: Effektive Federmasse eines Federpendels (zum Praktikumsexperiment)

> [!info] Aufgabenstellung
> Die Formel für die Schwingungsdauer eines Federpendels, $T=2\pi\sqrt{\frac{m}{D}}$, gilt für den Fall, dass die Masse der Feder vernachlässigbar klein ist. Wenn sie berücksichtigt wird, erfolgt dies in der Regel durch eine effektive Federmasse, die einen Bruchteil der tatsächlichen Federmasse ausmacht: $(m_F)_{eff} = b \cdot m_F$. Mit der Schwingungsfrequenz $f = \omega_0/2\pi$ und der Schwingungsdauer $T = 2\pi/\omega_0$ ergibt sich bei Einbeziehung der effektiven Federmasse:
>
> (1) $T = 2\pi \sqrt{\frac{m + b \cdot m_f}{D}}$
>
> **Fall 1: Masse Pendelkörper >> Federmasse $m_f$**
>
> Für die Gesamtenergie einer harmonischen Schwingung mit der Amplitude A gilt generell: $W = \frac{1}{2} m \omega_0^2 A^2$ (Aufgabe: Herleitung)
>
> Die Masse, die gleichmäßig über die Feder verteilt ist, wird gedanklich in Massenelemente der Größe $dm$ unterteilt. Diese schwingen mit gleicher Frequenz, aber unterschiedlicher Amplitude, die nur von der Position $x$ abhängt. Damit gilt: $dW = \frac{1}{2} dm \cdot \omega_0^2 A^2(x)$
>
> Wenn die Masse $m$ deutlich größer ist als die Federmasse, ist die Dehnung pro Windung gleich und die Amplitude wächst dann linear mit der Position $x$: $A(x) = \frac{x}{l}A$. Die Masse sei gleichmäßig entlang der Feder verteilt. Bezeichnet man mit $\mu$ die Masse pro Längeneinheit, ergibt sich: $dm = \mu \cdot dx$.
>
> ![[Übungen/Übungen-_page_9_Figure_8.jpeg]]
>
> Für die gesamte in der Feder befindlichen Energie gilt dann: $W_F = \frac{1}{2} \frac{\mu L}{3} \omega_0^2 A^2$ (Aufgabe: Herleitung) und da $\mu L$ die Masse der Feder ist: $W_F = \frac{1}{2} \frac{m_f}{3} \omega_0^2 A^2$
>
> Die Gesamtenergie setzt sich aus der Energie der Feder und des Pendelkörpers zusammen: $W = \frac{1}{2}\left(m + \frac{m_F}{3}\right)\omega_0^2 A^2$
>
> Die Energie der Feder lässt sich auch mit der Federkonstanten D in dieser Form ausdrücken: $W=\frac{1}{2}D \cdot A^2$
>
> Daraus folgt (Aufgabe: Nachrechnen): $\omega_0^2 = \frac{D}{m + \frac{m_F}{3}}$
>
> Mit $\omega_0 = 2\pi / T$ ergibt sich: $T = 2\pi \sqrt{\frac{m + \frac{1}{3} m_f}{D}}$
>
> **Fall 2: Masse Pendelkörper << Federmasse $m_f$**
>
> Für den Fall $m=0$ lässt sich zeigen, dass die effektive Masse gegeben ist durch: $(m_F)_{eff} = \frac{4}{\pi^2} m_F \approx 0.405 ...$ (Annahme: Schwingungsknoten am oberen Ende, Schwingungsbauch am unteren Ende)
>
> **Quelle:** http://theissenonline.de/Physik/Federpendel_Effektive_Federmasse.pdf

**Lösung:**

**Fall 1: Masse Pendelkörper >> Federmasse $m_f$**

$$
\begin{align*}
\text{Gesamtenergie der Schwingung:} \\
W_{\text{Körper}} &= \frac{1}{2} m \omega_0^2 A^2 \\
W_{\text{Feder}} &= \frac{1}{2} \frac{m_f}{3} \omega_0^2 A^2 \\
W_{\text{ges}} &= \frac{1}{2}\left(m + \frac{m_F}{3}\right)\omega_0^2 A^2 \\
\text{Mit } W_{\text{ges}} &= \frac{1}{2}D A^2 \text{ folgt:} \\
\frac{1}{2}D A^2 &= \frac{1}{2}\left(m + \frac{m_F}{3}\right)\omega_0^2 A^2 \\
D &= \left(m + \frac{m_F}{3}\right)\omega_0^2 \\
\omega_0^2 &= \frac{D}{m + \frac{m_F}{3}} \\
\text{Mit } \omega_0 &= \frac{2\pi}{T} \text{ ergibt sich:} \\
T &= 2\pi\sqrt{\frac{m + \frac{1}{3}m_f}{D}} \\
\text{Die effektive Federmasse ist also: } b &= \frac{1}{3}
\end{align*}
$$

**Fall 2: Masse Pendelkörper << Federmasse $m_f$**

$$
\begin{align*}
\text{Für } m &= 0 \text{ (nur Feder schwingt):} \\
(m_F)_{\text{eff}} &= \frac{4}{\pi^2} m_F \\
&\approx 0.405 \cdot m_F \\
\text{Annahme:} & \quad \text{Schwingungsknoten oben,} \\
& \quad \text{Schwingungsbauch unten}
\end{align*}
$$

## Optik (AB6)

### Aufgabe 1: Sammellinse

> [!info] Aufgabenstellung
> Mit einer dünnen Sammellinse soll ein Gegenstand auf einem Schirm vergrößert abgebildet werden.
>
> - Skizzieren Sie den Strahlenverlauf!
> - Wo muss sich der Gegenstand befinden?
> - Geben Sie Art, Lage und Ort des entstehenden Bildes an!

**Lösung:**

Damit eine Sammellinse ein **vergrößertes, reelles Bild** auf einem Schirm erzeugen kann, muss der Gegenstand innerhalb der einfachen und doppelten Brennweite platziert werden.

- **Ort des Gegenstands:** Zwischen $f$ und $2f$ ($f < g < 2f$).
- **Bildart:** Reell (kann auf Schirm aufgefangen werden), umgekehrt/seitenverkehrt und vergrößert.
- **Bildort:** Jenseits der doppelten Brennweite auf der anderen Linsenseite ($b > 2f$).

```tikz
\begin{document}
\begin{tikzpicture}[scale=0.8, font=\small]
  % Optische Achse
  \draw[->] (-5,0) -- (8,0) node[right] {opt. Achse};
  
  % Linse (Symbolisch als Doppelpfeil)
  \draw[thick, <->] (0,-3) -- (0,3) node[above] {Sammellinse};
  
  % Brennpunkte markieren
  \filldraw (-2,0) circle (2pt) node[below] {f};
  \filldraw (2,0) circle (2pt) node[below] {f'};
  \filldraw (-4,0) circle (2pt) node[below] {2 f};
  \filldraw (4,0) circle (2pt) node[below] {2 f'};
  
  % Gegenstand (zwischen F und 2F)
  % g = 3, f = 2 -> b = 6
  \draw[thick, ->, blue] (-3,0) -- (-3,1.5) node[above] {Gegenstand};
  
  % Strahlenverlauf
  % 1. Parallelstrahl wird zum Brennpunktstrahl
  \draw[red] (-3,1.5) -- (0,1.5);
  \draw[red, ->] (0,1.5) -- (6,-3);
  
  % 2. Mittelpunktstrahl (geht ungebrochen durch)
  \draw[green!60!black, ->] (-3,1.5) -- (6,-3);
  
  % 3. Brennpunktstrahl wird zum Parallelstrahl
  \draw[orange] (-3,1.5) -- (0,-3);
  \draw[orange, ->] (0,-3) -- (6,-3);
  
  % Bild
  \draw[thick, ->, blue] (6,0) -- (6,-3) node[below] {Bild};
  
  % Abstände markieren
  \draw[|<->|] (-3,-0.8) -- (0,-0.8) node[midway, fill=white] {Gegenstandsweite};
  \draw[|<->|] (0,-0.8) -- (6,-0.8) node[midway, fill=white] {Bildweite};
\end{tikzpicture}
\end{document}
```

> [!abstract] Warum muss der Gegenstand dort stehen?
> Es gibt bei einer Sammellinse (Konvexlinse) drei wichtige Bereiche für den Gegenstand:
> * **Weit weg ($g > 2f$):** Das Bild wird klein (wie bei einer Kamera oder im Auge).
> * **Sehr nah ($g < f$):** Das Bild wird riesig, aber **virtuell**. Man kann es nur *durch* die Linse sehen (wie bei einer Lupe), aber nicht auf eine Wand projizieren.
> * **Dazwischen ($f < g < 2f$):** Das ist unser Fall! Hier wird das Bild **größer als das Original** und bleibt **reell** (projektionsfähig).

### Aufgabe 2: Dünne Linsen

> [!info] Aufgabenstellung
> Mit einer Linse der Brennweite 120 mm wird ein Dia mit den Abmessungen 6,0 cm × 6,0 cm auf einer Projektionswand, die 2,5 m von der Linse entfernt ist, scharf abgebildet. Berechnen Sie die Abmessungen des Bildes!

**Skizze des Aufbaus:**

```tikz
\begin{document}
\begin{tikzpicture}[scale=0.8, font=\small]
  % Optische Achse
  \draw[->] (-4,0) -- (8,0) node[right] {opt. Achse};
  
  % Linse
  \draw[thick, <->] (0,-2.5) -- (0,2.5) node[above] {Linse};
  
  % Brennpunkte
  \filldraw (-2,0) circle (1.5pt) node[below] {$F$};
  \filldraw (2,0) circle (1.5pt) node[below] {$F'$};
  
  % Gegenstand (Dia)
  \draw[thick, ->, blue] (-2.8,0) -- (-2.8,1) node[above] {Dia ($G$)};
  
  % Bild (Projektionswand)
  \draw[thick, ->, red] (7,0) -- (7,-2.5) node[below] {Bild ($B$)};
  
  % Hilfslinien für Abstände
  \draw[|<->|] (-2.8, 2.8) -- (0, 2.8) node[midway, fill=white] {Gegenstandsweite $g$};
  \draw[|<->|] (0, 2.8) -- (7, 2.8) node[midway, fill=white] {Bildweite $b$};
  \draw[|<->|] (0, -0.8) -- (2, -0.8) node[midway, below] {120 mm};
  
  % Strahlen (physikalisch korrekt für f=2, g=2.8 -> b=7)
  % 1. Parallelstrahl -> Brennpunktstrahl
  \draw[gray, dashed] (-2.8,1) -- (0,1) -- (7,-2.5);
  % 2. Mittelpunktstrahl
  \draw[gray, dashed] (-2.8,1) -- (0,0) -- (7,-2.5);
  % 3. Brennpunktstrahl -> Parallelstrahl
  \draw[gray, dashed] (-2.8,1) -- (-2,0) -- (0,-2.5) -- (7,-2.5);
\end{tikzpicture}
\end{document}
```

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Brennweite | `f` | `0.12` m |
| | Bildweite | `b` | `2.5` m |
| | Gegenstandsgröße | `G` | `0.06` m |
| Gesucht | Bildgröße | `B` | |

$$
\begin{align*}
\text{Gegeben:} \\
G &= 0.06 \text{ m} \\
b &= 2.5 \text{ m} \\
f &= 0.12 \text{ m} \\
\text{Weg:} \\
g &= \frac{1}{\frac{1}{f}-\frac{1}{b}} \\
&= \frac{1}{\frac{1}{0.12}-\frac{1}{2.5}} \\
&= 0.1261 \text{ m} \\
V &= \frac{b}{g} \\
&= \frac{2.5}{0.1261} \\
&= 19.83 \\
B &= V \cdot G \\
&= 19.83 \cdot 0.06 \\
&= 1.19 \text{ m} \\
\text{ERG:} \quad B &= 1.19 \text{ m}
\end{align*}
$$

Das Bild auf der Projektionswand hat die Abmessungen **$1,19 \text{ m} \times 1,19 \text{ m}$**.

$g$ = Gegenstandsweite (Abstand Gegenstand–Linse)
$V$ = Vergrößerung (Verhältnis Bildweite zu Gegenstandsweite)


### Aufgabe 3: Brechung

> [!info] Aufgabenstellung
> Der Einfallswinkel eines Lichtstrahls auf eine ebene Grenzfläche beträgt 55°. Wie groß ist der Winkel zwischen dem reflektierten und dem gebrochenen Strahl, wenn die Brechzahl $n = 1,5$ ist?


```tikz
\begin{document}
\begin{tikzpicture}[scale=1.5, font=\small]
  % Grenzfläche
  \fill[blue!10] (-2,-2) rectangle (2,0);
  \draw[thick] (-2,0) -- (2,0) node[right] {Grenzfläche ($n=1,5$)};
  
  % Lot
  \draw[dashed] (0,-2) -- (0,1.5) node[above] {Lot};
  
  % Einfallender Strahl (alpha = 55°)
  % In TikZ sind 0° rechts, also ist 90° das Lot. 90 + 55 = 145
  \draw[red, thick, ->] (145:2) -- (0,0);
  \draw (0,0.5) arc[start angle=90, end angle=145, radius=0.5];
  \node at (117:0.7) {$\alpha = 55^\circ$};
  
  % Reflektierter Strahl (alpha' = 55°)
  % 90 - 55 = 35
  \draw[orange, thick, ->] (0,0) -- (35:2);
  \draw (0,0.5) arc[start angle=90, end angle=35, radius=0.5];
  \node at (63:0.7) {$\alpha' = 55^\circ$};
  
  % Gebrochener Strahl (beta approx 33°)
  % Im Medium: Lot ist nach unten (270°). 270 - 33 = 237
  \draw[green!60!black, thick, ->] (0,0) -- (237:1.5);
  \draw (0,-0.5) arc[start angle=270, end angle=237, radius=0.5];
  \node at (253:0.8) {$\beta \approx 33^\circ$};
  
  % Gesuchter Winkel gamma
  \draw[<->, thick, purple] (35:1.2) arc[start angle=35, end angle=-123, radius=1.2];
  \node[purple, right] at (-10:1.3) {gesuchter Winkel $\gamma$};

\end{tikzpicture}
\end{document}
```

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Brechungsidx1 (Luft) | `n1` | `1` |
| | Brechungsidx2 | `n2` | `1.5` |
| | Einfallswinkel | `alpha` | `55` deg |
| Gesucht | Brechungswinkel | `beta` | |

$$
\begin{align*}
\text{Gegeben:} \\
\alpha &= 55 \text{ deg} \\
n_1 &= 1 \\
n_2 &= 1.5 \\
\text{Weg:} \\
\beta &= \arcsin\left(\frac{n_1}{n_2}\sin(\alpha)\right) \\
&= \arcsin\left(\frac{1}{1.5}\sin(55^\circ)\right) \\
&= 33.1 \text{ deg} \\
\text{ERG:} \quad \beta &= 33.1 \text{ deg}
\end{align*}
$$

Reflexionswinkel nach dem Reflexionsgesetz: $\alpha' = \alpha = 55^\circ$. Der gesuchte Winkel $\gamma$ zwischen reflektiertem und gebrochenem Strahl ergibt sich, da das Lot eine gerade Linie (180°) bildet:
$$\gamma = 180^\circ - \alpha' - \beta = 180^\circ - 55^\circ - 33,1^\circ = 91,9^\circ$$

$\alpha'$ = Reflexionswinkel

Der Winkel zwischen dem reflektierten und dem gebrochenen Strahl beträgt **$91,9^\circ$**.


### Aufgabe 4: Parallelplatte

> [!info] Aufgabenstellung
> Wie groß ist die Querverschiebung $q$ eines schräg durch eine Parallelplatte von der Dicke $d$ laufenden Lichtstrahls?
>
> a) Geben Sie eine allgemeine Formel an ($q$ als Funktion von $d$, $\alpha$ und $\beta$; $q = f(d, \alpha, \beta)$).
>
> b) Berechnen Sie $q$ für $d = 6$ mm, $\alpha = 40^{\circ}$ und $n = 1,5$.

**Lösung:**

**a) Herleitung der allgemeinen Formel**

Ein Lichtstrahl trifft unter dem Einfallswinkel $\alpha$ auf eine Parallelplatte der Dicke $d$ und wird im Inneren unter dem Winkel $\beta$ gebrochen. 
1. Die im Glas zurückgelegte Strecke $s$ lässt sich über die Dicke $d$ ausdrücken:
   $$\cos(\beta) = \frac{d}{s} \implies s = \frac{d}{\cos(\beta)}$$
2. Die Querverschiebung $q$ ist der senkrechte Abstand zwischen dem eintretenden und dem austretenden Strahl. Der Winkel zwischen der ursprünglichen Strahlrichtung und dem gebrochenen Strahl beträgt $(\alpha - \beta)$. Im rechtwinkligen Dreieck mit der Hypotenuse $s$ gilt:
   $$\sin(\alpha - \beta) = \frac{q}{s} \implies q = s \cdot \sin(\alpha - \beta)$$
3. Einsetzen von $s$:
   $$q = d \cdot \frac{\sin(\alpha - \beta)}{\cos(\beta)}$$

**b) Berechnung für die gegebenen Werte**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Dicke der Platte | `d` | `6mm` |
| | Einfallswinkel | `alpha` | `40` deg |
| | Brechungsidx1 (Luft) | `n1` | `1` |
| | Brechungsidx2 | `n2` | `1.5` |
| Gesucht | Querverschiebung | `q` | |

$$
\begin{align*}
\text{Gegeben:} \\
\alpha &= 40 \text{ deg} \\
d &= 0.006 \text{ m} \\
n_1 &= 1 \\
n_2 &= 1.5 \\
\text{Weg:} \\
\beta &= \arcsin\left(\frac{n_1}{n_2}\sin(\alpha)\right) \\
&= \arcsin\left(\frac{1}{1.5}\sin(40^\circ)\right) \\
&= 25.37 \text{ deg} \\
q &= d \cdot \frac{\sin(\alpha-\beta)}{\cos(\beta)} \\
&= 0.006 \cdot \frac{\sin(40^\circ-25.37^\circ)}{\cos(25.37^\circ)} \\
&= 0.001677 \text{ m} \\
\text{ERG:} \quad q &= 0.001677 \text{ m}
\end{align*}
$$

$\beta$ = Brechungswinkel

Die Querverschiebung beträgt ca. **$1,68\text{ mm}$**.

![[Übungen/Übungen-_page_10_Figure_10.jpeg]]

### Aufgabe 5: Auge

> [!info] Aufgabenstellung
> Die Empfindlichkeitsschwelle des menschlichen Auges liegt im günstigsten Fall bei etwa 100 Photonen/s. Das Auge ist bei einer Wellenlänge von etwa 550 nm am empfindlichsten. Welche minimale Lichtleistung kann das Auge demnach detektieren?

![[Übungen/Übungen-_page_10_Figure_10.jpeg]]

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Wellenlänge | `lam` | `550nm` |
| | Photonenrate | `Nph` | `100` 1/s |
| Gesucht | Lichtleistung | `P` | |

$$
\begin{align*}
\text{Gegeben:} \\
N_{\text{ph}} &= 100 \text{ 1/s} \\
\lambda &= 0.00000055 \text{ m} \\
\text{Weg:} \\
\nu &= \frac{c}{\lambda} \\
&= \frac{299800000}{0.00000055} \\
&= 545090909090909 \text{ Hz} \\
E_{\text{ph}} &= h \cdot \nu \\
&= 0.0000000000000000000000000000000006626 \cdot 545090909090909 \\
&= 0.0000000000000000003612 \text{ J} \\
P &= N_{\text{ph}} \cdot E_{\text{ph}} \\
&= 100 \cdot 0.0000000000000000003612 \\
&= 0.00000000000000003612 \text{ W} \\
\text{ERG:} \quad P &= 0.00000000000000003612 \text{ W}
\end{align*}
$$

$\nu$ = Frequenz des Lichts
$E_{\text{ph}}$ = Energie eines Photons

## Elektrotechnik (AB7)

### Aufgabe E1: Ladungsmenge in Kupfer

> [!info] Aufgabenstellung
> Berechnen Sie die Ladungsmenge Q, die in 3 cm³ Cu in Form frei verschiebbarer Elektronen vorhanden ist, wenn die Elektronendichte $n = 8{,}6 \cdot 10^{22}$ cm⁻³ beträgt. (Elementarladung: $q_e = 1{,}602 \cdot 10^{-19}$ C)

Elektronenanzahl:
$$N = n \cdot V = 8{,}6 \cdot 10^{22}\,\text{cm}^{-3} \cdot 3\,\text{cm}^3 = 25{,}8 \cdot 10^{22}$$

Gesamtladung: 
$$Q = 25{,}8 \cdot 10^{22} \cdot -1{,}602 \cdot 10^{-19}\,\text{C} = (25{,}8 \cdot -1{,}602) \cdot 10^{3}\,\text{C} = -41{,}3 \cdot 10^{3}\,\text{C} = -41{,}3 \cdot 10^{3}\,\text{As}$$

### Aufgabe E2: Strömungsgeschwindigkeit

> [!info] Aufgabenstellung
> Bestimmen Sie die Strömungsgeschwindigkeit der Elementarladungen aus E1), wenn der Strom 30 A und der Leiterquerschnitt 3 mm² beträgt. (Elektronendichte aus E1; fertigen Sie eine Skizze an.)

**Gegeben:**
- Strom: $I = 30\,\text{A}$
- Leiterquerschnitt: $A = 3\,\text{mm}^2$
- Elektronendichte (aus E1): $n = 8{,}6 \cdot 10^{22}\,\text{cm}^{-3}$
- Elementarladung: $q_e = 1{,}602 \cdot 10^{-19}\,\text{C}$

**Gesucht:** Driftgeschwindigkeit $v_d$ der Elektronen (m/s)

**Lösung:**

Formel für Stromstärke:
$$I = n \cdot A \cdot v_d \cdot q_e \quad \Rightarrow \quad v_d = \frac{I}{n \cdot A \cdot q_e}$$

**Einheitsumrechnung:**
- Elektronendichte: $n = 8{,}6 \cdot 10^{22}\,\text{cm}^{-3}$ → $8{,}6 \cdot 10^{28}\,\text{m}^{-3}$ (Faktor $10^6$)
- Querschnittsfläche: $A = 3\,\text{mm}^2$ → $3 \cdot 10^{-6}\,\text{m}^2$ (Faktor $10^{-6}$)

**Berechnung:**

$$v_d = \frac{30\,\text{A}}{8{,}6 \cdot 10^{28}\,\text{m}^{-3} \cdot 3 \cdot 10^{-6}\,\text{m}^2 \cdot 1{,}602 \cdot 10^{-19}\,\text{C}} = \frac{30}{41{,}3 \cdot 10^{3}}\,\text{m/s} \approx 7{,}27 \cdot 10^{-4}\,\text{m/s} = \underline{\underline{0{,}73\,\text{mm/s}}}$$

### Aufgabe E3: Ladungsmenge bei verschiedenen Stromverläufen

> [!info] Aufgabenstellung
> Berechnen Sie die Ladungsmenge Q, die durch einen Leiter fließt:
>
> - **E3.1)** bei konstantem Strom von 36 mA innerhalb von 2 s
> - **E3.2)** bei quadratisch zunehmendem Strom ($I = 0$ mA für $t = 0$ s; $I = 9$ mA für $t = 1$ s; $I = 36$ mA für $t = 2$ s) innerhalb von 2 s
> - **E3.3)** bei mit der dritten Potenz zunehmendem Strom ($I = 0$ mA für $t = 0$ s; $I = 36$ mA für $t = 2$ s) innerhalb von 2 s

**Lösung:**

**E3.1)** Konstanter Strom:
$$Q = I \cdot t = 0{,}036\,\text{A} \cdot 2\,\text{s} = 0{,}072\,\text{C} = \underline{\underline{72\,\text{mC}}}$$


**E3.2)** Quadratisch zunehmender Strom:

**Gegeben:**
- $I = 0$ mA für $t = 0$ s
- $I = 9$ mA für $t = 1$ s
- $I = 36$ mA für $t = 2$ s
- Zeitraum: $0 \le t \le 2$ s

**Gesucht:** Ladungsmenge $Q$ in mC

**Schritt 1: Formel finden**
- "Quadratisch" bedeutet: $I(t) = a \cdot t^2$ (irgendeine Zahl mal $t^2$)
- Punkt einsetzen: $t = 1, I = 9$ → $9 = a \cdot 1^2$ → **$a = 9$**
- Probe: $I(2) = 9 \cdot 4 = 36$ ✓

**Schritt 2: Integrieren** (Ladung = Integral des Stroms)

$$Q = \int_0^2 9t^2\,dt$$
Stammfunktion von $9t^2$:
- Stammfunktion von $t^2$ ist $\frac{t^3}{3}$
- Mit Koeffizient $9$: $9 \cdot \frac{t^3}{3} = 3t^3$

Grenzen einsetzen (von 0 bis 2):
$$Q = \left[3t^3\right]_0^2 = 3 \cdot 2^3 - 3 \cdot 0^3 = 3 \cdot 8 - 0 = \underline{\underline{24\,\text{mC}}}$$

w
**E3.3)** Mit dritter Potenz zunehmendem Strom:

**Gegeben:**
- $I = 0$ mA für $t = 0$ s
- $I = 36$ mA für $t = 2$ s
- Zeitraum: $0 \le t \le 2$ s

**Gesucht:** Ladungsmenge $Q$ in mC

**Schritt 1: Formel finden**
- "Mit dritter Potenz" bedeutet: $I(t) = b \cdot t^3$ (irgendeine Zahl mal $t^3$)
- Punkt einsetzen: $t = 2, I = 36$ → $36 = b \cdot 2^3 = b \cdot 8$ → **$b = 4{,}5$**
- **Formel:** $I(t) = 4{,}5t^3$ mA

**Schritt 2: Integrieren** (Ladung = Integral des Stroms)

$$Q = \int_0^2 4{,}5t^3\,dt$$

Stammfunktion von $4{,}5t^3$:
- Stammfunktion von $t^3$ ist $\frac{t^4}{4}$
- Mit Koeffizient $4{,}5$: $4{,}5 \cdot \frac{t^4}{4} = 1{,}125t^4$

Grenzen einsetzen (von 0 bis 2):
$$Q = \left[1{,}125t^4\right]_0^2 = 1{,}125 \cdot 2^4 - 1{,}125 \cdot 0^4 = 1{,}125 \cdot 16 - 0 = \underline{\underline{18\,\text{mC}}}$$

### Aufgabe A1: Messingdraht

> [!info] Aufgabenstellung
> Berechnen Sie die Länge eines Messingdrahts, wenn er bei einem Durchmesser von 0,08 mm einen Widerstand von $R = 20\,\Omega$ haben soll. ($\rho_{Ms} = 0{,}0655\,\frac{\Omega\,\text{mm}^2}{\text{m}}$)

### Aufgabe A2: Spannungsabfall Cu-Leitung

> [!info] Aufgabenstellung
> Berechnen Sie den Spannungsabfall zwischen zwei 40 cm voneinander entfernten Punkten einer Cu-Leitung von 1 mm Durchmesser, durch welche ein Strom von 2 A fließt. ($\rho_{Cu} = 0{,}01786\,\frac{\Omega\,\text{mm}^2}{\text{m}}$)

### Aufgabe A3: Nichtlinearer Widerstand

> [!info] Aufgabenstellung
> Durch theoretische Überlegungen ergibt sich die folgende Abhängigkeit zwischen Spannungsabfall und Strom eines nichtlinearen Widerstands: $U = U(I) = 10\,\frac{\text{V}}{\text{A}^2} \cdot I^2$
>
> - **A3.1)** Stellen Sie diese Abhängigkeit grafisch dar ($0\,\text{A} \le I \le 6\,\text{A}$)
> - **A3.2)** Stellen Sie den Gleichstromwiderstand grafisch dar
> - **A3.3)** Stellen Sie den differentiellen Widerstand grafisch dar

### Aufgabe A4: Glühlampe

> [!info] Aufgabenstellung
> Der Wolframfaden einer Glühlampe nimmt bei 230 V einen Strom von 340 mA auf (Fadentemperatur 2500 °C). Berechnen Sie:
>
> - **A4.1)** die Leistung, die die Lampe aufnimmt
> - **A4.2)** den Widerstand bei der Arbeitstemperatur
> - **A4.3)** den Widerstand bei 20 °C ($\alpha_{20} = 0{,}0041\,\text{K}^{-1}$; $\beta_{20} = 10^{-6}\,\text{K}^{-2}$)

**A4.1)** Leistung

Gegeben: $U = 230V \quad , \quad I = 340mA = 0.35A$
Lösung: $P = UI = 230V \cdot 0.35A = 78.2W$

**A4.2)** Widerstand bei Arbeitstemeperatur
Gegeben: $2500 °C$
Lösung: $R = \frac{U}{I} = \frac{230V}{0.35A} = 676,47 \Omega$

**A4.3)** Widerstand bei 20 °C

Gegeben: $R(2500°C) = 676\,\Omega$, $\alpha_{20} = 0{,}0041\,\text{K}^{-1}$, $\beta_{20} = 10^{-6}\,\text{K}^{-2}$

Formel: $R(T) = R_0\left[1 + \alpha_{20}(T-T_0) + \beta_{20}(T-T_0)^2\right]$

Einsetzen mit $\Delta T = 2480\,\text{K}$:
$$676 = R_0\left[1 + 0{,}0041 \cdot 2480 + 10^{-6} \cdot 2480^2\right]$$
$$676 = R_0\left[1 + 10{,}168 + 6{,}150\right]$$
$$676 = R_0 \cdot 17{,}318$$
$$R_0 = \frac{676}{17{,}318} = \boxed{39\,\Omega}$$

### Aufgabe A5: Kabel mit Kurzschluss

> [!info] Aufgabenstellung
> Ein zweiadriges Kupferkabel ($\rho = 17{,}8\,\text{m}\Omega\,\text{mm}^2/\text{m}$, $d = 0{,}8\,\text{mm}$) liegt auf einer Rolle mit vier zugänglichen Klemmen. Zwischen den Adern hat das Kabel einen Kurzschluss. Die Widerstandsmessung ergibt $R_{AB} = 3{,}55\,\Omega$ und $R_{CD} = 13{,}45\,\Omega$. Berechnen Sie allgemein und für die Zahlenwerte:
>
> - **A5.1)** die gesamte Kabellänge
> - **A5.2)** den Abstand des Kurzschlusses von den Klemmen AB

![[Übungen/Übungen-_page_12_Figure_22.jpeg]]

**Erklärung der Aufgabe:**

Ein zweiadriges Kabel liegt auf einer Rolle. Man kann an zwei verschiedenen Stellen messen: Bei den Klemmen $AB$ (Start) und bei den Klemmen $CD$ (Ende). Irgendwo dazwischen ist ein Kurzschluss — die beiden Adern berühren sich.

Wenn man bei $AB$ misst, geht der Strom durch beide Adern bis zum Kurzschluss (Distanz $x$). Wenn man bei $CD$ misst, geht der Strom durch beide Adern von $CD$ bis zum Kurzschluss (Distanz $L-x$).

Die Widerstände sind unterschiedlich, weil die Distanzen unterschiedlich sind. Mit den gemessenen Widerständen kann man zurückrechnen, wie lang das Kabel insgesamt ist und wo der Kurzschluss sitzt.

**Lösung:**

Gegeben: $\rho = 17{,}8\,\text{m}\Omega \cdot \text{mm}^2/\text{m} = 0{,}0178\,\Omega \cdot \text{mm}^2/\text{m}$, $d = 0{,}8\,\text{mm}$, $R_{AB} = 3{,}55\,\Omega$, $R_{CD} = 13{,}45\,\Omega$

Querschnittsfläche: $A = \pi(d/2)^2 = \pi(0{,}4)^2 = 0{,}5027\,\text{mm}^2$

**A5.1) Gesamtkabellänge:**

Die Widerstände beider Adern addieren sich (beide durchquert von Strom):
$$R_{AB} + R_{CD} = 2\rho \frac{L}{A}$$

Nach $L$ auflösen:
$$L = \frac{(R_{AB} + R_{CD}) \cdot A}{2\rho} = \frac{(3{,}55 + 13{,}45) \cdot 0{,}5027}{2 \cdot 0{,}0178}$$
$$L = \frac{17 \cdot 0{,}5027}{0{,}0356} = \frac{8{,}546}{0{,}0356} = \boxed{240\,\text{m}}$$

**A5.2) Abstand des Kurzschlusses von AB:**

Das Verhältnis der Widerstände entspricht dem Verhältnis der Distanzen:
$$\frac{R_{AB}}{R_{CD}} = \frac{x}{L-x}$$

Umstellen nach $x$:
$$x = \frac{R_{AB} \cdot L}{R_{AB} + R_{CD}} = \frac{3{,}55 \cdot 240}{17} = \frac{852}{17} = \boxed{50{,}1\,\text{m}}$$

Der Kurzschluss liegt ca. $50\,\text{m}$ von den Klemmen $AB$ entfernt.

### Aufgabe A6: Leitungsdimensionierung

> [!info] Aufgabenstellung
> Ein Verbraucher wird über eine 100 m lange zweiadrige Cu-Leitung ($\rho_{Cu} = 17{,}86 \cdot 10^{-3}\,\frac{\Omega\,\text{mm}^2}{\text{m}}$) an das Netz ($U_N = 230\,\text{V}$) angeschlossen. Der maximale Strom beträgt 10 A, der Spannungsabfall darf 2,5 % der Nennspannung nicht überschreiten. Berechnen Sie:
>
> - **A6.1)** den Leitungswiderstand
> - **A6.2)** den erforderlichen Drahtdurchmesser
> - **A6.3)** die Stromdichte bei $I = 10\,\text{A}$
> - **A6.4)** die elektrische Feldstärke im Leiter
> - **A6.5)** die Verlustleistung im Leiter
> - **A6.6)** das Verhältnis der Verbraucherleistung zur Verlustleistung

**Erklärung der Aufgabe — was ist $\rho$ (Rho)?**

$\rho$ ist der **spezifische Widerstand** (auch Resistivität genannt). Es ist eine Material-Eigenschaft, die angibt: "Wie viel Widerstand bietet dieses Material pro Meter Länge und pro mm² Querschnittsfläche?"

Die Formel lautet: $R = \rho \cdot \frac{l}{A}$

- $\rho$ = spezifischer Widerstand des Materials (hier Kupfer)
- $l$ = Länge des Drahtes (100 m)
- $A$ = Querschnittsfläche des Drahtes (gesucht!)
- $R$ = Gesamtwiderstand

**Was ist das Problem?** Eine lange Leitung hat Widerstand. Der Strom erzeugt einen Spannungsabfall: $U_{Abfall} = I \cdot R$. Das ist Energie-Verschwendung als Wärme. Deshalb muss der Draht dick genug sein (großes $A$), damit der Widerstand klein bleibt und der Spannungsabfall unter 2,5 % bleibt.

**Lösung:**

Gegeben: $l = 100\,\text{m}$, $I = 10\,\text{A}$, $U_N = 230\,\text{V}$, max. Spannungsabfall = $2{,}5\%$ von $230\,\text{V}$, $\rho_{Cu} = 17{,}86 \cdot 10^{-3}\,\frac{\Omega \cdot \text{mm}^2}{\text{m}}$

**A6.1) Leitungswiderstand:**

Der maximal erlaubte Spannungsabfall ist:
$$U_{max} = 0{,}025 \cdot 230 = 5{,}75\,\text{V}$$

Mit dem Ohmschen Gesetz $R = \frac{U}{I}$:
$$R = \frac{5{,}75}{10} = \boxed{0{,}575\,\Omega}$$

**A6.2) Erforderlicher Drahtdurchmesser:**

**Schritt 1:** Querschnittsfläche aus $R = \rho \cdot \frac{l}{A}$ berechnen:
$$A = \rho \cdot \frac{l}{R} = 0{,}01786 \cdot \frac{100}{0{,}575} = 3{,}10\,\text{mm}^2$$

**Schritt 2:** Ein Draht ist rund. Aus Kreisfläche $A = \pi(d/2)^2$ den Durchmesser ausrechnen:
$$d = 2\sqrt{\frac{A}{\pi}} = 2\sqrt{\frac{3{,}10}{3{,}1416}} = \boxed{1{,}98\,\text{mm} \approx 2\,\text{mm}}$$

**A6.3) Stromdichte:**

Die Stromdichte ist Strom pro Fläche:
$$J = \frac{I}{A} = \frac{10}{3{,}10} = \boxed{3{,}23\,\text{A/mm}^2}$$

**A6.4) Elektrische Feldstärke:**

Die Feldstärke im Leiter ist proportional zu Stromdichte und spezifischem Widerstand:
$$E = \rho \cdot J = 0{,}01786 \cdot 3{,}23 = \boxed{0{,}0577\,\text{V/m} = 57{,}7\,\text{mV/m}}$$

**A6.5) Verlustleistung:**

Die Wärme, die in der Leitung entsteht:
$$P_{loss} = I^2 \cdot R = 10^2 \cdot 0{,}575 = \boxed{57{,}5\,\text{W}}$$

**A6.6) Verhältnis Verbraucherleistung zu Verlustleistung:**

Die nutzbare Leistung beim Verbraucher:
$$P_{Verbraucher} = U_N \cdot I = 230 \cdot 10 = 2300\,\text{W}$$

Verhältnis:
$$\frac{P_{Verbraucher}}{P_{loss}} = \frac{2300}{57{,}5} = \boxed{40}$$

Das bedeutet: Die Verbraucherleistung ist 40-mal höher als die Verlustleistung in der Leitung. Das ist akzeptabel.


### Aufgabe A7: Leitungsmaterial Kupfer vs. Aluminium

> [!info] Aufgabenstellung
> Die Energieversorgung eines Grundstücks erfolgt über eine 200 m lange Doppelleitung ($U = 230\,\text{V}$, $I_{max} = 15\,\text{A}$, Spannungsabfall ≤ 4 %). Berechnen Sie den Mindestquerschnitt und die Gesamtmasse der Leitung für:
>
> - **A7.1)** Kupfer ($\rho_{Cu} = 17{,}86 \cdot 10^{-3}\,\frac{\Omega\,\text{mm}^2}{\text{m}}$, $d_{Cu} = 8{,}9\,\frac{\text{g}}{\text{cm}^3}$)
> - **A7.2)** Aluminium ($\rho_{Al} = 30 \cdot 10^{-3}\,\frac{\Omega\,\text{mm}^2}{\text{m}}$, $d_{Al} = 2{,}7\,\frac{\text{g}}{\text{cm}^3}$)

**Erklärung der Aufgabe**

Eine **Doppelleitung** bedeutet: zwei Drähte (Hin- und Rückleitung). Der Strom fließt durch beide Drähte, daher verdoppelt sich die Gesamtlänge für die Widerstandsberechnung: $l_{ges} = 2 \cdot 200 = 400\,\text{m}$.

Das Problem: Ein langer Draht hat Widerstand. Der Strom erzeugt Spannungsabfall. Deshalb brauchen wir einen dicken genug, damit der Spannungsabfall nicht größer als 4% wird.

**Allgemeiner Lösungsweg (gleich für beide Materialien):**

1. **Maximaler Spannungsabfall berechnen:**
   $$U_{max} = 4\% \cdot 230 = 0{,}04 \cdot 230 = 9{,}2\,\text{V}$$

2. **Benötigter Widerstand (aus Ohmsches Gesetz $R = \frac{U}{I}$):**
   $$R = \frac{U_{max}}{I_{max}} = \frac{9{,}2}{15} = 0{,}6133\,\Omega$$

3. **Querschnittsfläche (aus Formel $R = \rho \cdot \frac{l}{A}$):**
   $$A = \rho \cdot \frac{l}{R} = \rho \cdot \frac{400}{0{,}6133}$$

4. **Gesamtvolumen (beide Drähte):**
   $$V = A \cdot l_{ges} = A \cdot 400$$

5. **Gesamtmasse (mit Dichte $d$):**
   $$m = d \cdot V$$

---

## **A7.1) Kupfer**

**Gegeben:**
- $\rho_{Cu} = 17{,}86 \cdot 10^{-3}\,\frac{\Omega\,\text{mm}^2}{\text{m}} = 0{,}01786\,\frac{\Omega\,\text{mm}^2}{\text{m}}$
- $d_{Cu} = 8{,}9\,\frac{\text{g}}{\text{cm}^3}$
- $l_{ges} = 400\,\text{m}$ (Doppelleitung!)
- $R_{max} = 0{,}6133\,\Omega$ (berechnet oben)

**Schritt 1: Erforderliche Querschnittsfläche**

$$A_{Cu} = \rho_{Cu} \cdot \frac{l_{ges}}{R_{max}} = 0{,}01786 \cdot \frac{400}{0{,}6133}$$
$$A_{Cu} = 0{,}01786 \cdot 651{,}9 = \boxed{11{,}64\,\text{mm}^2}$$

**Schritt 2: Gesamtvolumen**

Das Volumen ist der Querschnitt mal die Länge der Doppelleitung:
$$V_{Cu} = A_{Cu} \cdot l_{ges} = 11{,}64\,\text{mm}^2 \cdot 400\,\text{m}$$

Einheiten umrechnen: $1\,\text{m} = 1000\,\text{mm}$
$$V_{Cu} = 11{,}64 \cdot 400 \cdot 10^3\,\text{mm}^3 = 4{,}656 \cdot 10^6\,\text{mm}^3$$

In cm³: $1\,\text{cm} = 10\,\text{mm}$, also $1\,\text{cm}^3 = 1000\,\text{mm}^3$
$$V_{Cu} = \frac{4{,}656 \cdot 10^6}{1000}\,\text{cm}^3 = 4{,}656 \cdot 10^3\,\text{cm}^3$$

**Schritt 3: Gesamtmasse**

$$m_{Cu} = d_{Cu} \cdot V_{Cu} = 8{,}9\,\frac{\text{g}}{\text{cm}^3} \cdot 4{,}656 \cdot 10^3\,\text{cm}^3$$
$$m_{Cu} = 8{,}9 \cdot 4656 = \boxed{41{,}44\,\text{kg}} \approx 41{,}4\,\text{kg}$$

---

## **A7.2) Aluminium**

**Gegeben:**
- $\rho_{Al} = 30 \cdot 10^{-3}\,\frac{\Omega\,\text{mm}^2}{\text{m}} = 0{,}030\,\frac{\Omega\,\text{mm}^2}{\text{m}}$
- $d_{Al} = 2{,}7\,\frac{\text{g}}{\text{cm}^3}$
- $l_{ges} = 400\,\text{m}$ (Doppelleitung!)
- $R_{max} = 0{,}6133\,\Omega$ (berechnet oben)

**Schritt 1: Erforderliche Querschnittsfläche**

Aluminium hat einen höheren spezifischen Widerstand als Kupfer, daher braucht es eine größere Fläche:

$$A_{Al} = \rho_{Al} \cdot \frac{l_{ges}}{R_{max}} = 0{,}030 \cdot \frac{400}{0{,}6133}$$
$$A_{Al} = 0{,}030 \cdot 651{,}9 = \boxed{19{,}56\,\text{mm}^2}$$

**Schritt 2: Gesamtvolumen**

$$V_{Al} = A_{Al} \cdot l_{ges} = 19{,}56\,\text{mm}^2 \cdot 400\,\text{m}$$
$$V_{Al} = 19{,}56 \cdot 400 \cdot 10^3\,\text{mm}^3 = 7{,}824 \cdot 10^6\,\text{mm}^3 = 7{,}824 \cdot 10^3\,\text{cm}^3$$

**Schritt 3: Gesamtmasse**

$$m_{Al} = d_{Al} \cdot V_{Al} = 2{,}7\,\frac{\text{g}}{\text{cm}^3} \cdot 7{,}824 \cdot 10^3\,\text{cm}^3$$
$$m_{Al} = 2{,}7 \cdot 7824 = \boxed{21{,}12\,\text{kg}} \approx 21{,}1\,\text{kg}$$

---

## **Vergleich: Kupfer vs. Aluminium**

| Eigenschaft | Kupfer | Aluminium | Verhältnis |
|---|---|---|---|
| Querschnitt | 11,64 mm² | 19,56 mm² | Al: 1,68× größer |
| Gesamtmasse | 41,4 kg | 21,1 kg | Al: 0,51× (= etwa halb so schwer) |

**Interpretation:**
- **Aluminium braucht eine dickere Leitung** (wegen des höheren Widerstands), aber
- **Aluminium ist viel leichter** (2,7 g/cm³ vs. 8,9 g/cm³), daher ist die Gesamtmasse trotzdem kleiner.
- Kupfer leitet besser, aber ist schwerer → ideal für kurze Strecken.
- Aluminium ist leichter und billiger → ideal für lange Freileitungen (Stromautobahnenen).


## Elektrotechnik (AB8)

### Aufgabe A1: Schwebendes Staubteilchen

> [!info] Aufgabenstellung
> Ein geladenes Staubteilchen mit einer Masse von $1{,}5 \cdot 10^{-8}$ g schwebt im Feld eines Plattenkondensators, an dem eine Spannung von 500 V angelegt wird. Die Platten sind horizontal in einem Abstand von 5,0 mm angeordnet. Berechnen Sie die Ladung des Staubteilchens.

**Erklärung der Aufgabe**

Das Staubteilchen schwebt — das heißt, es bewegt sich nicht nach oben und nicht nach unten. Das ist nur möglich, wenn zwei Kräfte gleich groß sind und sich gegenseitig aufheben:

1. **Gewichtskraft** $F_G = m \cdot g$ (wirkt **nach unten**)
2. **Elektrische Kraft** $F_E = q \cdot E$ (wirkt **nach oben**, weil das Teilchen geladen ist)

Wenn das Teilchen schwebt, ist: $F_E = F_G$

**Gegeben:**
- Masse des Staubteilchens: $m = 1{,}5 \cdot 10^{-8}\,\text{g} = 1{,}5 \cdot 10^{-11}\,\text{kg}$
- Spannung: $U = 500\,\text{V}$
- Plattenabstand: $d = 5{,}0\,\text{mm} = 5{,}0 \cdot 10^{-3}\,\text{m}$
- Erdbeschleunigung: $g = 9{,}81\,\text{m/s}^2$

**Gesucht:** Ladung $q$ des Staubteilchens

---

**Lösung:**

**Schritt 1: Elektrische Feldstärke berechnen**

Im Plattenkondensator ist die elektrische Feldstärke zwischen den Platten:
$$E = \frac{U}{d} = \frac{500\,\text{V}}{5{,}0 \cdot 10^{-3}\,\text{m}} = 100.000\,\text{V/m} = 10^5\,\text{V/m}$$

**Schritt 2: Gewichtskraft berechnen**

$$F_G = m \cdot g = 1{,}5 \cdot 10^{-11}\,\text{kg} \cdot 9{,}81\,\text{m/s}^2 = 1{,}4715 \cdot 10^{-10}\,\text{N}$$

**Schritt 3: Ladung berechnen (aus Gleichgewichtsbedingung)**

Wenn das Staubteilchen schwebt, ist die elektrische Kraft gleich der Gewichtskraft:
$$F_E = F_G$$
$$q \cdot E = m \cdot g$$

Nach $q$ auflösen:
$$q = \frac{m \cdot g}{E} = \frac{1{,}5 \cdot 10^{-11}\,\text{kg} \cdot 9{,}81\,\text{m/s}^2}{10^5\,\text{V/m}}$$

$$q = \frac{1{,}4715 \cdot 10^{-10}\,\text{N}}{10^5\,\text{V/m}} = \frac{1{,}4715 \cdot 10^{-10}}{10^5}\,\text{C}$$

$$q = 1{,}4715 \cdot 10^{-15}\,\text{C} = \boxed{1{,}47 \cdot 10^{-15}\,\text{C}}$$

**Interpretation:**

Die Ladung ist extrem klein — etwa **1,5 Femtocoulomb** (fC). Das Teilchen trägt wahrscheinlich nur wenige überschüssige Elektronen. Da die elektrische Kraft *nach oben* wirken muss (um das Staubteilchen gegen die Schwerkraft zu halten), muss die *obere* Platte *negativ* und die *untere* Platte *positiv* sein (damit das negativ geladene Teilchen angezogen wird).


### Aufgabe A2: Elektron im homogenen E-Feld

> [!info] Aufgabenstellung
> Ein Elektron tritt mit einer Anfangsgeschwindigkeit $v_0 > 0$ in ein homogenes elektrisches Feld ein. Formulieren Sie jeweils eine Aussage über Bahnform und Bewegungsart für folgende Fälle und begründen Sie diese:
>
> - Eintritt **parallel** zu den Feldlinien
> - Eintritt **senkrecht** zu den Feldlinien
>
> Hilfe: Gleichung der Bahnkurve für den Fall „senkrecht zu den Feldlinien":
> $$y = \frac{Q \cdot U}{2mdv^2}\,x^2$$

**Grundkonzept:**

Die Bewegung eines geladenen Teilchens in einem elektrischen Feld hängt davon ab, **in welche Richtung das Elektron eintritt** — parallel oder senkrecht zu den Feldlinien. Die elektrische Kraft wirkt immer **entlang der Feldlinien** (für negative Ladungen: entgegen der Feldrichtung).

---

**Fall 1: Eintritt parallel zu den Feldlinien**

**Bahnform:** Der Elektronenstrahl folgt einer **geraden Linie** (keine Ablenkung).

**Bewegungsart:** 
- **Gleichmäßig beschleunigte Bewegung** (wenn das Elektron gegen das Feld läuft) oder
- **Gleichmäßig verzögerte Bewegung** (wenn das Elektron mit dem Feld läuft)

**Begründung:**

Wenn das Elektron parallel zu den Feldlinien eintritt, wirkt die elektrische Kraft **in der gleichen Richtung oder entgegengesetzt** zur Bewegungsrichtung.

- **Fall 1a (gegen das Feld):** Die Kraft wirkt bremsend. Das Elektron wird langsamer (Beschleunigung $a < 0$). Es folgt einer geraden Linie, wird aber immer langsamer. Eventually könnte es umkehren.
- **Fall 1b (mit dem Feld):** Die Kraft wirkt beschleunigend. Das Elektron wird schneller (Beschleunigung $a > 0$), folgt aber einer geraden Linie.

**Keine Ablenkung**, weil die Kraft parallel zur Geschwindigkeit wirkt und daher nicht die Richtung ändert.

---

**Fall 2: Eintritt senkrecht zu den Feldlinien**

**Bahnform:** Der Elektronenstrahl folgt einer **Parabel** (oder allgemeiner: einer gekrümmten Bahn).

**Bewegungsart:** Die Bewegung setzt sich aus zwei Komponenten zusammen:
- **Längsrichtung (entlang des Eintritts):** Gleichförmige Bewegung mit $v_0$ (keine Kraft in diese Richtung)
- **Querrichtung (parallel zu den Feldlinien):** Gleichmäßig beschleunigte Bewegung (elektrische Kraft)

**Begründung:**

Die elektrische Kraft wirkt **senkrecht zur Eintrittsrichtung** und **senkrecht zur initialen Geschwindigkeit**. Das Elektron kann also nicht weiter einfach geradeaus gehen — die Kraft zieht es zur Seite.

Das Ergebnis ist eine **parabolische Bahn** — ähnlich wie die Wurfparabel bei einem waagerechten Wurf in der Gravitation:
- Der Strom fliegt in $x$-Richtung mit konstanter Geschwindigkeit $v_0$
- Das elektrische Feld beschleunigt es in $y$-Richtung

Die gegebene Formel bestätigt dies:
$$y = \frac{Q \cdot U}{2mdv^2}\,x^2$$

Das ist die **Gleichung einer Parabel** (Form: $y = \text{const} \cdot x^2$).

### Aufgabe A3: Blitzlicht-Kondensator

> [!info] Aufgabenstellung
> Die in einem Kondensator bei einer Ladespannung von 6,0 V gespeicherte elektrische Feldenergie soll für die Zündung einer Blitzlichtlampe genutzt werden. Die während der Zeitdauer eines Lichtblitzes von 100 µs abgegebene elektrische Leistung beträgt 200 W. Berechnen Sie die Kapazität des Kondensators.

**Erklärung der Aufgabe**

Ein Blitzlicht funktioniert so:
1. Ein Kondensator wird aufgeladen und speichert **Energie**
2. Wenn der Blitz ausgelöst wird, entlädt sich der Kondensator sehr schnell
3. Die gespeicherte Energie wird in kurzer Zeit (100 µs) abgegeben — das erzeugt eine hohe **Leistung**

Wir kennen:
- Die **Spannung** beim Laden: $U = 6{,}0\,\text{V}$
- Die **Leistung** während des Blitzes: $P = 200\,\text{W}$
- Die **Zeit** des Blitzes: $\Delta t = 100\,\mu\text{s} = 100 \cdot 10^{-6}\,\text{s}$

Gesucht: Die **Kapazität** $C$ des Kondensators

---

**Lösung:**

**Schritt 1: Energie des Blitzes berechnen**

Die Leistung ist Energie pro Zeit: $P = \frac{W}{t}$

Umgestellt nach Energie:
$$W = P \cdot \Delta t = 200\,\text{W} \cdot 100 \cdot 10^{-6}\,\text{s}$$
$$W = 200 \cdot 10^{-4}\,\text{J} = 0{,}02\,\text{J} = \boxed{20\,\text{mJ}}$$

**Schritt 2: Kapazität aus der Kondensator-Energieformel berechnen**

Die Energie, die in einem geladenen Kondensator gespeichert ist, lautet:
$$W = \frac{1}{2} C \cdot U^2$$

Nach $C$ umgestellt:
$$C = \frac{2W}{U^2}$$

Werte einsetzen:
$$C = \frac{2 \cdot 0{,}02\,\text{J}}{(6{,}0\,\text{V})^2} = \frac{0{,}04}{36}\,\text{F}$$

$$C = 0{,}001111...\,\text{F} = \boxed{1{,}11 \cdot 10^{-3}\,\text{F}} = \boxed{1{,}11\,\text{mF}}$$

---

**Interpretation:**

Die Kapazität beträgt etwa **1,1 Millifarad**. Das ist eine relativ große Kapazität (normale Kondensatoren haben meist Mikrofarad oder kleiner). Diese Größe ist notwendig, um in 100 Mikrosekunden genug Energie für einen hellen Blitz bereitzustellen.

---

**Kontrolle der Einheiten:**

$$C = \frac{2W}{U^2} = \frac{[\text{J}]}{[\text{V}^2]} = \frac{[\text{V} \cdot \text{A} \cdot \text{s}]}{[\text{V}^2]} = \frac{[\text{A} \cdot \text{s}]}{[\text{V}]} = [\text{F}] \quad ✓$$

(Denn $1\,\text{F} = 1\,\frac{\text{A} \cdot \text{s}}{\text{V}} = 1\,\frac{\text{C}}{\text{V}}$)

### Aufgabe A4: Plattenkondensator

> [!info] Aufgabenstellung
> An einen Plattenkondensator mit der Plattenfläche $A = 500\,\text{cm}^2$ und dem Plattenabstand $d = 4\,\text{mm}$ im Vakuum wird die Spannung $U = 400\,\text{V}$ angelegt.
>
> - **a)** Berechnen Sie die Ladung, die der Kondensator aufnimmt.
> - **b)** Berechnen Sie die Feldstärke des elektrischen Feldes im Kondensator.
> - **c)** Geben Sie mit Begründung die Werte für Ladung und Feldstärke an, wenn der Plattenabstand bei Beibehaltung der Verbindung zur Spannungsquelle auf 6 mm vergrößert wird.
> - **d)** Erläutern Sie, wie sich Ladung, Feldstärke und Spannung ändern, wenn die Vergrößerung des Plattenabstandes nach Abklemmen der Spannungsquelle erfolgt.

**Gegeben (alle Teilaufgaben):**
- Plattenfläche: $A = 500\,\text{cm}^2 = 500 \cdot 10^{-4}\,\text{m}^2 = 0{,}05\,\text{m}^2$
- Anfänglicher Plattenabstand: $d_1 = 4\,\text{mm} = 4 \cdot 10^{-3}\,\text{m}$
- Spannung: $U = 400\,\text{V}$ (konstant, solange verbunden)
- Dielektrizitätskonstante Vakuum: $\varepsilon_0 = 8{,}854 \cdot 10^{-12}\,\frac{\text{F}}{\text{m}}$

---

**a) Ladung beim ursprünglichen Plattenabstand**

**Gegeben:** $A = 0{,}05\,\text{m}^2$, $d_1 = 4 \cdot 10^{-3}\,\text{m}$, $U = 400\,\text{V}$

**Gesucht:** Ladung $Q$

**Schritt 1: Kapazität des Plattenkondensators**

Die Kapazität eines Plattenkondensators ist:
$$C = \varepsilon_0 \cdot \frac{A}{d} = 8{,}854 \cdot 10^{-12} \cdot \frac{0{,}05}{4 \cdot 10^{-3}}$$
$$C = 8{,}854 \cdot 10^{-12} \cdot 12{,}5 = 1{,}107 \cdot 10^{-10}\,\text{F} = \boxed{110{,}7\,\text{pF}}$$

**Schritt 2: Ladung aus $Q = C \cdot U$**

$$Q = C \cdot U = 1{,}107 \cdot 10^{-10}\,\text{F} \cdot 400\,\text{V}$$
$$Q = \boxed{4{,}43 \cdot 10^{-8}\,\text{C}} = \boxed{44{,}3\,\text{nC}}$$

---

**b) Feldstärke beim ursprünglichen Plattenabstand**

**Gegeben:** $U = 400\,\text{V}$, $d_1 = 4 \cdot 10^{-3}\,\text{m}$

**Gesucht:** Elektrische Feldstärke $E$

Die elektrische Feldstärke im Plattenkondensator ist einfach:
$$E = \frac{U}{d} = \frac{400\,\text{V}}{4 \cdot 10^{-3}\,\text{m}} = \boxed{100.000\,\text{V/m}} = \boxed{10^5\,\text{V/m}}$$

---

**c) Plattenabstand vergrößert auf 6 mm (bei Verbindung zur Spannungsquelle)**

**Neuer Plattenabstand:** $d_2 = 6\,\text{mm} = 6 \cdot 10^{-3}\,\text{m}$

**Wichtig:** Die Spannungsquelle bleibt **verbunden** — daher **bleibt die Spannung konstant** bei $U = 400\,\text{V}$.

**Neue Kapazität:**
$$C_2 = \varepsilon_0 \cdot \frac{A}{d_2} = 8{,}854 \cdot 10^{-12} \cdot \frac{0{,}05}{6 \cdot 10^{-3}}$$
$$C_2 = 8{,}854 \cdot 10^{-12} \cdot 8{,}333 = 7{,}378 \cdot 10^{-11}\,\text{F} = \boxed{73{,}8\,\text{pF}}$$

**Neue Ladung:**
$$Q_2 = C_2 \cdot U = 7{,}378 \cdot 10^{-11} \cdot 400 = \boxed{2{,}95 \cdot 10^{-8}\,\text{C}} = \boxed{29{,}5\,\text{nC}}$$

**Neue Feldstärke:**
$$E_2 = \frac{U}{d_2} = \frac{400}{6 \cdot 10^{-3}} = \boxed{66.667\,\text{V/m}} \approx \boxed{6{,}67 \cdot 10^4\,\text{V/m}}$$

**Begründung und Interpretation:**

| Größe | Vorher | Nachher | Änderung | Grund |
|---|---|---|---|---|
| **Plattenabstand** | 4 mm | 6 mm | ↑ vergrößert | Gegeben |
| **Spannung** | 400 V | 400 V | → gleich | Quelle verbunden → $U$ konstant |
| **Kapazität** | 110,7 pF | 73,8 pF | ↓ **sinkt** | $C \propto \frac{1}{d}$ |
| **Ladung** | 44,3 nC | 29,5 nC | ↓ **sinkt** | $Q = C \cdot U$, und $C$ sinkt |
| **Feldstärke** | 100 kV/m | 66,7 kV/m | ↓ **sinkt** | $E = \frac{U}{d}$ |

**Zusammenfassung:** Bei vergrößertem Abstand mit verbundener Quelle sinken **Kapazität, Ladung und Feldstärke**, während die Spannung konstant bleibt.

---

**d) Plattenabstand vergrößert nach Abklemmen der Spannungsquelle**

**Ausgangssituation (vor dem Vergrößern):**
- $d_1 = 4\,\text{mm}$, $U_1 = 400\,\text{V}$, $Q_1 = 44{,}3\,\text{nC}$, $E_1 = 100\,\text{kV/m}$
- Die Quelle wird **abgeklemmt** — die Ladung auf den Platten ist jetzt "gefangen"

**Nach der Vergrößerung auf 6 mm (ohne Spannungsquelle):**

Da die Quelle abgeklemmt ist, kann keine Ladung zu oder wegfließen:
$$Q = \text{konstant} = 44{,}3\,\text{nC}$$

**Neue Kapazität (bei größerem Abstand):**
$$C_2 = \varepsilon_0 \cdot \frac{A}{d_2} = 7{,}378 \cdot 10^{-11}\,\text{F}$$ (gleich wie in Teil c)

**Neue Spannung (aus $U = \frac{Q}{C}$):**
$$U_2 = \frac{Q}{C_2} = \frac{44{,}3 \cdot 10^{-9}}{7{,}378 \cdot 10^{-11}} = \boxed{600\,\text{V}}$$

(Vorher: 400 V → Jetzt: 600 V — Die Spannung **steigt**!)

**Neue Feldstärke (aus $E = \frac{U}{d}$):**
$$E_2 = \frac{U_2}{d_2} = \frac{600}{6 \cdot 10^{-3}} = \boxed{100.000\,\text{V/m}} = \boxed{10^5\,\text{V/m}}$$

(Die Feldstärke bleibt **konstant**!)

**Begründung und Interpretation:**

| Größe | Vorher (4 mm, verbunden) | Nachher (6 mm, abgeklemmt) | Änderung | Grund |
|---|---|---|---|---|
| **Plattenabstand** | 4 mm | 6 mm | ↑ vergrößert | Gegeben |
| **Ladung** | 44,3 nC | 44,3 nC | → **konstant** | Quelle abgeklemmt → keine Ladungsfluss |
| **Kapazität** | 110,7 pF | 73,8 pF | ↓ sinkt | $C \propto \frac{1}{d}$ |
| **Spannung** | 400 V | 600 V | ↑ **steigt** | $U = \frac{Q}{C}$ und $C$ sinkt |
| **Feldstärke** | 100 kV/m | 100 kV/m | → **konstant** | $E = \frac{Q}{\varepsilon_0 A}$ (unabhängig von $d$!) |

**Zusammenfassung:** Bei vergrößertem Abstand mit abgeklemmter Quelle bleibt die **Ladung konstant**, während die **Spannung und Kapazität sich ändern**. Die **Feldstärke bleibt gleich**, weil sie nur von der Ladung und Plattenfläche abhängt — nicht vom Abstand!

## Magnetische Felder (AB9)

### Aufgabe 1: Elektromagnet

> [!info] Aufgabenstellung
> Geben Sie die Eigenschaften eines auf einer schlanken Spule basierenden Elektromagneten an, damit er ein möglichst starkes Magnetfeld erzeugt.

TODO

### Aufgabe 2: Ionenablenkung im Magnetfeld

> [!info] Aufgabenstellung
> Geben Sie die Voraussetzungen an, unter denen ein Strahl positiver Ionen in einem homogenen Magnetfeld eine ablenkende Kraft erfährt und geben Sie den Betrag dieser Kraft an.

TODO

### Aufgabe 3: Elektronenstrahl im Magnetfeld

> [!info] Aufgabenstellung
> Ein Elektronenstrahl tritt mit einer Geschwindigkeit von $v_0 = 1{,}96 \cdot 10^6\,\text{m/s}$ senkrecht zu den Feldlinien in ein homogenes Magnetfeld mit der magnetischen Flussdichte $B = 1{,}6 \cdot 10^{-3}\,\text{T}$ ein.
>
> a) Erklären Sie, warum sich der Elektronenstrahl auf einer Kreisbahn weiterbewegt.
>
> b) Berechnen Sie den Radius der Kreisbahn.
>
> c) Beschreiben Sie mit Hilfe der in b) hergeleiteten Gleichung, wie sich der Radius ändern würde, wenn an Stelle der Elektronen Protonen in das Magnetfeld fliegen (qualitativ).

TODO

### Aufgabe 4: Elektronenstrahlablenkung durch E- und B-Feld

> [!info] Aufgabenstellung
> Elektronen treten mit der Geschwindigkeit $v_1 = 2{,}0 \cdot 10^5\,\text{m/s}$ in ein homogenes elektrisches Feld ein (dort kein Magnetfeld) und durchlaufen es auf einer Strecke von $s = 20\,\text{cm}$. Die Polung der Platten bewirkt, dass die Elektronen beschleunigt werden. Am Ende der Beschleunigungsstrecke sollen die Elektronen eine Geschwindigkeit von $v_2 = 8{,}0 \cdot 10^6\,\text{m/s}$ haben.
>
> Anschließend treten die Elektronen senkrecht zu den Feldlinien in ein homogenes Magnetfeld ein (dort kein elektrisches Feld), in dem sie um $\alpha = 25°$ zu ihrer Bewegungsrichtung abgelenkt werden sollen. Das Magnetfeld ist $b = 3{,}0\,\text{cm}$ breit.
>
> a) Berechnen Sie die elektrische Feldstärke des Feldes im Kondensator.
>
> b) Berechnen Sie die erforderliche magnetische Flussdichte.

Gegeben:
- Anfangsgeschwindigkeit: $v_1 = 2{,}0 \cdot 10^5\,\text{m/s}$
- Endgeschwindigkeit im E-Feld: $v_2 = 8{,}0 \cdot 10^6\,\text{m/s}$
- Strecke im E-Feld: $s = 20\,\text{cm} = 0{,}2\,\text{m}$
- Ablenkungswinkel im B-Feld: $\alpha = 25°$
- Breite des B-Feldes: $b = 3{,}0\,\text{cm} = 0{,}03\,\text{m}$
- Elektronenmasse: $m_e = 9{,}109 \cdot 10^{-31}\,\text{kg}$
- Elementarladung: $e = 1{,}602 \cdot 10^{-19}\,\text{C}$

**a) Elektrische Feldstärke im Kondensator**

Nach den Formeln aus der Elektrotechnik-Notiz:
- **Arbeit/Energie:** $W = e \cdot U$ ($W$ = Arbeit, $e$ = Elementarladung, $U$ = Spannung)
- **E-Feld und Spannung:** $E = \frac{U}{s}$ ($E$ = Elektrische Feldstärke, $U$ = Spannung, $s$ = Strecke)


**Herleitung der Formel: Wie kommt man auf $W = e \cdot U = \Delta E_{kin}$?**

Diese Formel kombiniert drei Konzepte:

**① Arbeit im E-Feld**:
$$W = e \cdot U$$

**② Kinetische Energie** (aus Mechanik):
$$E_{kin} = \frac{1}{2}m v^2$$
Ein bewegtes Teilchen der Masse $m$ mit Geschwindigkeit $v$ hat diese Energie. Die **Änderung** von $v_1$ auf $v_2$ ist:
$$\Delta E_{kin} = \frac{1}{2}m_e v_2^2 - \frac{1}{2}m_e v_1^2 = \frac{1}{2}m_e(v_2^2 - v_1^2)$$

**③ Arbeits-Energie-Satz** (aus Mechanik):
$$W = \Delta E_{kin}$$
Die Arbeit, die eine Kraft verrichtet, wird vollständig in kinetische Energie umgewandelt.

**Zusammenhang:**
$$\underbrace{e \cdot U}_{\text{Arbeit des E-Feldes}} = \underbrace{\frac{1}{2}m_e(v_2^2 - v_1^2)}_{\text{Änderung der kin. Energie}}$$


**Schritt 1: Beschleunigungsspannung aus Energiesatz berechnen**

Ein Elektron wird durch die Potentialdifferenz $U$ beschleunigt. Die Arbeit, die das E-Feld verrichtet, wird in kinetische Energie umgewandelt:

$$W = e \cdot U = \Delta E_{kin} = \frac{1}{2}m_e(v_2^2 - v_1^2)$$

Nach $U$ auflösen:
$$U = \frac{m_e(v_2^2 - v_1^2)}{2e}$$

Werte einsetzen:
$$U = \frac{9{,}109 \cdot 10^{-31}\,\text{kg} \cdot [(8{,}0 \cdot 10^6)^2 - (2{,}0 \cdot 10^5)^2]\,(\text{m/s})^2}{2 \cdot 1{,}602 \cdot 10^{-19}\,\text{C}}$$

$$v_2^2 - v_1^2 = 6{,}4 \cdot 10^{13} - 4{,}0 \cdot 10^{10} \approx 6{,}4 \cdot 10^{13}\,(\text{m/s})^2$$

$$U = \frac{9{,}109 \cdot 10^{-31} \cdot 6{,}4 \cdot 10^{13}}{2 \cdot 1{,}602 \cdot 10^{-19}} = \frac{5{,}83 \cdot 10^{-17}}{3{,}204 \cdot 10^{-19}} \approx 182\,\text{V}$$

**Schritt 2: Elektrische Feldstärke berechnen**

Mit der Formel für das homogene E-Feld:
$$E = \frac{U}{s} = \frac{182\,\text{V}}{0{,}2\,\text{m}} \approx \boxed{910\,\text{V/m}} = \boxed{9{,}1 \cdot 10^5\,\text{V/m}}$$

**b) Erforderliche magnetische Flussdichte**

Im Magnetfeld folgen die Elektronen einer Kreisbahn. Die Ablenkung um $\alpha = 25°$ bedeutet, dass der Elektronenstrahl einen Bogenabschnitt des Kreises beschreibt.

**Geometrie im B-Feld:**

Der Elektronenstrahl tritt senkrecht zu den Feldlinien ein und wird um $\alpha = 25°$ abgelenkt. Der Weg durch das Magnetfeld ist die Breite $b = 0{,}03\,\text{m}$.

Für einen Kreisbogen mit Radius $r$ und Ablenkungswinkel $\alpha$ gilt:
$$\sin(\alpha) = \frac{b}{r}$$

Nach $r$ auflösen:
$$r = \frac{b}{\sin(\alpha)} = \frac{0{,}03\,\text{m}}{\sin(25°)} = \frac{0{,}03}{0{,}4226} \approx 0{,}071\,\text{m} = 7{,}1\,\text{cm}$$

Die Lorentz-Kraft bietet die Zentripetalkraft:
$$e \cdot v_2 \cdot B = \frac{m_e \cdot v_2^2}{r}$$

Nach $B$ auflösen:
$$B = \frac{m_e \cdot v_2}{e \cdot r}$$

Werte einsetzen:
$$B = \frac{9{,}109 \cdot 10^{-31}\,\text{kg} \cdot 8{,}0 \cdot 10^6\,\text{m/s}}{1{,}602 \cdot 10^{-19}\,\text{C} \cdot 0{,}071\,\text{m}}$$

$$B = \frac{7{,}287 \cdot 10^{-24}}{1{,}137 \cdot 10^{-20}} \approx \boxed{6{,}4 \cdot 10^{-4}\,\text{T}} = \boxed{0{,}64\,\text{mT}}$$

### Aufgabe 5: Wechselspannung in rotierender Leiterschleife

> [!info] Aufgabenstellung
> Eine Leiterschleife rotiert gleichförmig in einem homogenen und zeitlich konstanten Magnetfeld. Die Rotationsachse ist senkrecht zu den Feldlinien gerichtet.
>
> Begründen Sie formelmäßig, dass mit dieser Anordnung eine Wechselspannung erzeugt werden kann.

Wir verwenden das **Faradaysche Induktionsgesetz**:

> [!formula] Faradaysches Induktionsgesetz
> $$U(t) = -N \cdot \frac{d\Phi(t)}{dt}$$
> - $U(t)$: Induzierte Spannung [V]
> - $N$: Anzahl der Windungen
> - $\Phi(t)$: Magnetischer Fluss [Wb]
> - $\frac{d\Phi}{dt}$: Änderungsrate des Flusses [Wb/s]

**Schritt 1: Magnetischer Fluss bei rotierender Schleife**

Der magnetische Fluss durch eine Fläche ist:
$$\Phi = \vec{B} \cdot \vec{A} = B \cdot A \cdot \cos(\alpha)$$

wobei $\alpha$ der Winkel zwischen Magnetfeld $\vec{B}$ und dem Normalenvektor der Fläche $\vec{A}$ ist.

Bei gleichförmiger Rotation mit Winkelgeschwindigkeit $\omega$ ändert sich dieser Winkel mit der Zeit:
$$\alpha(t) = \omega t$$

Daher ist der zeitabhängige Fluss:
$$\Phi(t) = B \cdot A \cdot \cos(\omega t)$$

**Schritt 2: Induzierte Spannung berechnen**

Nach dem Faradayschen Induktionsgesetz:
$$U(t) = -\frac{d\Phi(t)}{dt} = -\frac{d}{dt}[B \cdot A \cdot \cos(\omega t)]$$

Die Ableitung von $\cos(\omega t)$ ist $-\omega \sin(\omega t)$:
$$U(t) = -B \cdot A \cdot (-\omega \sin(\omega t)) = B \cdot A \cdot \omega \cdot \sin(\omega t)$$

**Schritt 3: Identifikation der Wechselspannung**

Die induzierte Spannung hat die Form:
$$U(t) = U_0 \cdot \sin(\omega t)$$

mit der **Amplitude:**
$$U_0 = B \cdot A \cdot \omega$$

**Physikalische Interpretation:**

- **Bei $t = 0$:** Die Schleife liegt in der Ebene des Magnetfeldes ($\alpha = 0°$) → Fluss ist maximal → Änderungsrate ist null → $U = 0$
- **Bei $\omega t = 90°$:** Die Schleife steht senkrecht zum Magnetfeld ($\alpha = 90°$) → Fluss ist minimal → Änderungsrate ist maximal → $U = U_0$ (Maximum)
- **Bei $\omega t = 180°$:** Die Schleife liegt wieder in der Feldebene ($\alpha = 180°$) → Fluss ist wieder maximal → $U = 0$
- **Bei $\omega t = 270°$:** Schleife senkrecht zum Feld (andere Seite) → $U = -U_0$ (Minimum)

**Fazit:** Der zeitlich veränderliche magnetische Fluss erzeugt nach dem Faradayschen Induktionsgesetz eine sinusförmige **Wechselspannung** mit der Amplitude $U_0 = B \cdot A \cdot \omega$.

Dies ist das **Funktionsprinzip von Generatoren und Alterndern** (Stromerzeuger in Kraftwerken).

## Übungsblatt (AB10)

### Aufgabe 1: Spannungsmesser (Vorwiderstand)

> [!info] Aufgabenstellung
> Ein Spannungsmesser soll den Messbereich 10 V erhalten. Das zur Verfügung stehende Drehspulmesswerk benötigt einen Messwerksstrom von 100µA für Vollausschlag. Der Widerstand der Drehspule beträgt 1300 $\Omega$ . Berechnen Sie den erforderlichen Vorwiderstand R<sub>v</sub>.

Gegeben:
- Messbereich $U = 10 \text{ V}$
- Vollausschlagstrom $I_g = 100 \text{ µA} = 100 \times 10^{-6} \text{ A}$
- Spulenwiderstand $R_g = 1300 \text{ Ω}$

Gesucht: Vorwiderstand $R_v$

**Lösung:**

Der Spannungsmesser wird durch einen großen Vorwiderstand in Serie mit dem Drehspulmesswerk aufgebaut. Bei Vollausschlag fließt der Messwerksstrom $I_g$ durch beide Widerstände.

Mit dem Ohmschen Gesetz:
$$U = I_g \cdot (R_g + R_v)$$

Nach $R_v$ umformen:
$$R_v = \frac{U}{I_g} - R_g$$

$$R_v = \frac{10 \text{ V}}{100 \times 10^{-6} \text{ A}} - 1300 \text{ Ω}$$

$$R_v = 100.000 \text{ Ω} - 1300 \text{ Ω} = \boxed{98.700 \text{ Ω} = 98,7 \text{ kΩ}}$$

### Aufgabe 2: Strommesser (Messbereicherweiterung)

> [!info] Aufgabenstellung
> Ein Strommesser mit dem Innenwiderstand 0,1 $\Omega$ soll ein um den Faktor 10 größeren Messbereich erhalten. Erläutern Sie die Vorgehensweise.

Gegeben:
- Innenwiderstand des Messwerks $R_i = 0,1 \text{ Ω}$
- Erweiterungsfaktor $n = 10$

Gesucht: Shunt-Widerstand $R_s$ und Erklärung der Vorgehensweise

**Lösung:**

**Prinzip der Messbereicherweiterung:**

Um einen Strommesser in seinem Messbereich zu erweitern, wird ein **Shunt-Widerstand parallel** zum Messwerk geschaltet. Der Shunt leitet den überschüssigen Strom um das empfindliche Messwerk herum.

**Physikalische Bedingung:**

Bei Vollausschlag des Messwerks soll der Gesamtstrom das 10-fache des Messwerksstroms betragen. Da beide Widerstände parallel liegen, ist die Spannung gleich:
$$U_i = U_s$$
$$I_i \cdot R_i = I_s \cdot R_s$$

Wenn $I_{ges} = 10 \cdot I_i$, dann:
$$I_s = I_{ges} - I_i = 10 \cdot I_i - I_i = 9 \cdot I_i$$

Einsetzen:
$$I_i \cdot R_i = 9 \cdot I_i \cdot R_s$$

**Berechnung des Shunt-Widerstands:**
$$R_s = \frac{R_i}{n-1} = \frac{0,1 \text{ Ω}}{10-1} = \frac{0,1}{9} \text{ Ω} \approx \boxed{0,0111 \text{ Ω} = 11,1 \text{ mΩ}}$$

**Allgemeine Formel für Erweiterungsfaktor $n$:**
$$R_s = \frac{R_i}{n-1}$$

**Praktische Realisation:**

Der Shunt-Widerstand muss:
- Ein sehr niedriger Widerstand sein (um große Ströme zu tragen)
- Eine hohe Stromtragfähigkeit haben
- Temperaturstabil sein (großer Temperaturkoeffizient würde die Messung verfälschen)

### Aufgabe 3: Elektronenbeschleunigung

> [!info] Aufgabenstellung
> Ein freies Elektron durchlaufe im Vakuum eine Spannung von 1 V. Berechnen Sie dessen Geschwindigkeit.

Gegeben:
- Beschleunigungsspannung $U = 1 \text{ V}$
- Elektronenmasse $m_e = 9,109 \times 10^{-31} \text{ kg}$
- Elementarladung $e = 1,602 \times 10^{-19} \text{ C}$
- Anfangsgeschwindigkeit $v_0 = 0$ (das Elektron startet aus dem Stillstand)

Gesucht: Endgeschwindigkeit $v$

**Lösung:**

Das Elektron wird durch die elektrische Spannung beschleunigt. Die von der Spannung verrichtete Arbeit wird vollständig in kinetische Energie umgewandelt (Energieerhaltungssatz):

**Energiebilanz:**
$$\text{Elektrische Arbeit} = \text{Kinetische Energie}$$
$$e \cdot U = \frac{1}{2} m_e v^2$$

Nach $v$ auflösen:
$$v = \sqrt{\frac{2eU}{m_e}}$$

**Werte einsetzen:**
$$v = \sqrt{\frac{2 \times 1,602 \times 10^{-19} \text{ C} \times 1 \text{ V}}{9,109 \times 10^{-31} \text{ kg}}}$$

$$v = \sqrt{\frac{3,204 \times 10^{-19} \text{ J}}{9,109 \times 10^{-31} \text{ kg}}}$$

$$v = \sqrt{3,516 \times 10^{11} \text{ m}^2/\text{s}^2}$$

$$v \approx \boxed{5,93 \times 10^5 \text{ m/s} \approx 593 \text{ km/s}}$$

**Bemerkung:**
Diese Geschwindigkeit beträgt etwa 0,2% der Lichtgeschwindigkeit ($c \approx 3 \times 10^8 \text{ m/s}$), daher sind relativistische Effekte noch vernachlässigbar. Die klassische Mechanik ist hier ausreichend.

### Aufgabe 4: Kapazitätsnetzwerk

> [!info] Aufgabenstellung
> Berechnen Sie die Gesamtkapazitäten C<sub>AB</sub> für die folgenden Schaltungen. Für a) und b): $C_1 = 1$ nF, $C_2 = 2$ nF, $C_3 = 5$ nF.
> 
> ![[Übungen/Übungen-_page_18_Figure_6.jpeg|333x355]]

## Übungsblatt (AB11)

MI, BA Dresden, D. Gembris

> [!info] Aufgabenstellung
> - 1. Ein Akzeptor in Silizium (SI) ist ein Fremdatom im Halbleiter-Gitter, dass.. a) weniger Valenzelektronen als ein Si-Atom besitzt,
> - b) mehr Valenzelektronen als ein Si-Atom besitzt,
> - c) zu einer n-Dotierung führt.
> - 2. Ideale Diode
>
> a) Sie machen eine Messung in einer Diodenschaltung, deren Ersatzschaltbild wie folgt aussieht:
>
![[Übungen/Übungen-_page_20_Figure_7.jpeg]]

> [!info] Aufgabenstellung
> Funktionieren alle Bauteile korrekt oder muss die Schaltung repariert werden? b) Bestimmen Sie den Betriebszustand der Diode und den durch sie fließenden Strom
>
![[Übungen/Übungen-_page_20_Figure_9.jpeg]]

> [!info] Aufgabenstellung
> 3. Gegeben ist ein Netzwerk, bestehend aus der idealen Gleichspannungsquelle Uq, dem Widerstand R und einer Diode. Die Spannungsquelle und der Widerstand besitzen die in der Abbildung angegebenen Werte, die Diodenkennlinie ist daneben dargestellt. Bestimmen Sie grafisch den Arbeitspunkt der Diode und geben Sie die zugehörigen Werte für Diodenspannung und Diodenstrom an.
>
![[Übungen/Übungen-_page_20_Figure_11.jpeg]]

## Übungsblatt (AB12)

> [!info] Aufgabenstellung
> Wechselstrom, MI, D. Gembris, BA Dresden
>
> Mittelwert:
>
$$
\bar{u} = \frac{1}{T} \int_{t=t_0}^{t_0+T} u(t) dt = \frac{1}{T} \int_{\varphi=\varphi_0}^{\varphi_0+2\pi} u(t) dt
$$

Gleichrichtwert:

$$
|\bar{u}| = \frac{1}{T} \int_{t=t_0}^{t_0+T} |u(t)| dt = \frac{1}{2\pi} \int_{\varphi=\varphi_0}^{\varphi_0+2\pi} |u(\varphi)| d\varphi
$$

Effektivwert:

$$
> [!info] Aufgabenstellung
> U_{eff} = \sqrt{\frac{1}{T} \int_{t=t_0}^{t_0+T} (u(t))^2 dt}
$$

![[Übungen/Übungen-_page_21_Figure_7.jpeg]]

$3T$

$2T$

> [!info] Aufgabenstellung
> A1) Berechnen Sie für die Funktion: a) den arithmetischen Mittelwert, b) den Gleichrichtwert c) den Effektivwert.
>
> A2) Berechnen Sie für die angegebene Funktion:
>
> a) den arithmetischen Mittelwert
>
> b) den Gleichrichtwert
>
> c) den Effektivwert
>
### A3) Berechnen Sie für die in den

> [!info] Aufgabenstellung
> folgenden Abbildungen dargestellten, periodisch verlaufenden Spannungen den Effektivwert!
>
> $\overline{3}$
>
> $\dot{f}(t)$
>
> $\overline{4}$
>
![[Übungen/Übungen-_page_21_Figure_15.jpeg]]

> [!info] Aufgabenstellung
> A4) Berechnen Sie den Mittelwert, den Gleichrichtwert und den Effektivwert!
>
![[Übungen/Übungen-_page_21_Figure_17.jpeg]]

Hinweis: Es gilt das Additionstheorem $2(\sin(x))^2 = 1 - \cos(2x)$

$$
> [!info] Aufgabenstellung
> 62W.\int (\sin(ax))^2 = \frac{x}{2} - \frac{1}{4a} \sin(2ax)
$$
