---
tags:
  - sem2
  - natgl
type: exam
---
# Klausur 5 — Altklausur

> [!info] Kontext
> Altklausur mit 9 Aufgaben aus Mechanik (Energie/Pedelec, Schwungradspeicher, Schwingungen, Wellen), Thermodynamik (Mollier-h,x-Diagramm feuchte Luft), Strömungsmechanik (Reynoldszahl, Modellversuche, Torricelli/Tankausfluss) und Elektrotechnik (E-/B-Felder, Widerstandsnetzwerke).

## Inhaltsverzeichnis

- [[#Aufgabe 1: Pedelec-Akku]]
- [[#Aufgabe 2: Schwungradspeicher]]
- [[#Aufgabe 3: Federpendel]]
- [[#Aufgabe 4: Wellengleichung am gespannten Draht]]
- [[#Aufgabe 5: Mollier-(h,x)-Diagramm]]
- [[#Aufgabe 6: Strömungsmechanik — Reynoldszahl und Modellversuche]]
- [[#Aufgabe 7: Strömungsmechanik — Tankausfluss]]
- [[#Aufgabe 8: Elektrische und magnetische Felder]]
- [[#Aufgabe 9: Widerstandsnetzwerk]]

---

### Aufgabe 1: Pedelec-Akku

> [!info] Aufgabenstellung
> Ein Pedelec ist ein Fahrrad mit Elektromotor, der gesetzlich festgelegt eine maximale Leistung von 250 Watt besitzt und den Fahrer bis zu einer Geschwindigkeit von 25 km/h unterstützt. Die Energie bezieht der Motor aus einem Akku, mit den typischen technischen Daten 10 Ah und 36 V. Im Weiteren soll davon ausgegangen werden, dass die Antriebsleistung des Radfahrers vernachlässigbar klein ist.
>
> a) Berechnen Sie die im Akku gespeicherte Ladung in der Einheit C.
>
> b) Berechnen Sie die im Akku gespeicherte Energie.
>
> c) Berechnen Sie die Entfernung, die das Fahrrad mit einem vollgeladenen Akku zurücklegen kann, wenn die Geschwindigkeit gleichbleibend 25 km/h und die Leistung des Motors gleichbleibend 250 Watt beträgt. Gehen Sie hierbei davon aus, dass aufgrund von Verlusten nur 75% der im Akku gespeicherten Energie für den Vortrieb genutzt werden kann.
>
> d) Berechnen Sie die benötigte Motorleistung, wenn nur die Rollreibung und der Luftwiderstand kompensiert werden muss ($\mu_{Roll}$ = 0,01 für Reifen auf Asphalt; Steigung = 0%, v = 25 km/h, kein Gegenwind, $c_w$ = 0,6, Querschnittsfläche des Fahrrades = 1 m²).
>
> e) Das Fahrrad soll mit Radfahrer und Gepäck 100 kg Masse besitzen. Berechnen Sie die Höhendistanz, die der Radfahrer mit einer vollen Akkuladung und einem Verlust von insgesamt 25% maximal überwinden kann.

**a) Gespeicherte Ladung**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Kapazität (Akku) | `Ah` | `10` Ah |
| Gesucht | Ladung | `Q` | |

$$
\begin{align*}
\text{Gegeben:} \\
Ah &= 10 \text{ Ah} \\
\text{Weg:} \\
Q &= Ah \cdot 3600 \text{ s/h} \\
&= 10 \cdot 3600 \\
&= 36000 \text{ C} \\
\text{ERG:} \quad Q &= 36000 \text{ C}
\end{align*}
$$

Die im Akku gespeicherte Ladung beträgt **36.000 C**.

**b) Gespeicherte Energie**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Ladung | `Q` | `36000` C |
| | Spannung | `U` | `36` V |
| Gesucht | Energie | `W` | |

$$
\begin{align*}
\text{Gegeben:} \\
Q &= 36000 \text{ C} \\
U &= 36 \text{ V} \\
\text{Weg:} \\
W &= Q \cdot U \\
&= 36000 \cdot 36 \\
&= 1296000 \text{ J} \\
\text{ERG:} \quad W &= 1296000 \text{ J} \; (\approx 1,296 \text{ MJ} \approx 0{,}36 \text{ kWh})
\end{align*}
$$

**c) Reichweite bei konstanter Leistung**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Energie (Akku) | `W` | `1296000` J |
| | Wirkungsgrad | `eta` | `0.75` |
| | Motorleistung | `P` | `250` W |
| | Geschwindigkeit | `vkmh` | `25` km/h |
| Gesucht | Fahrzeit, Entfernung | `t`, `s` | |

$$
\begin{align*}
\text{Gegeben:} \\
W &= 1296000 \text{ J} \\
\eta &= 0.75 \\
P &= 250 \text{ W} \\
v_{\text{kmh}} &= 25 \text{ km/h} \\
\text{Weg:} \\
W_{\text{nutz}} &= \eta \cdot W \\
&= 0.75 \cdot 1296000 \\
&= 972000 \text{ J} \\
t &= \frac{W_{\text{nutz}}}{P} \\
&= \frac{972000}{250} \\
&= 3888 \text{ s} \\
v_c &= \frac{v_{\text{kmh}}}{3.6} = 6.944 \text{ m/s} \\
s &= v_c \cdot t \\
&= 6.944 \cdot 3888 \\
&= 27000 \text{ m} \\
\text{ERG:} \quad s &= 27000 \text{ m} = 27 \text{ km}
\end{align*}
$$

Das Fahrrad kann mit einer Akkuladung **27 km** zurücklegen.

**d) Benötigte Motorleistung (Rollreibung + Luftwiderstand)**

Für die Rollreibungskraft wird die Gesamtmasse aus Teilaufgabe e) (Fahrrad + Fahrer + Gepäck = 100 kg) verwendet, da an dieser Stelle keine andere Masse gegeben ist. Für die Luftdichte wird der Standardwert $\rho_{\text{Luft}} \approx 1{,}2\,\text{kg/m}^3$ angenommen (nicht explizit in der Aufgabe angegeben).

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Masse | `m` | `100` kg |
| | Rollreibungszahl | `muR` | `0.01` |
| | Widerstandsbeiwert | `cw` | `0.6` |
| | Querschnittsfläche | `Av` | `1` m² |
| | Luftdichte | `rho` | `1.2` kg/m³ |
| | Geschwindigkeit | `vkmh` | `25` km/h |
| Gesucht | Leistung | `P` | |

$$
\begin{align*}
\text{Gegeben:} \\
m &= 100 \text{ kg} \\
\mu_R &= 0.01 \\
c_w &= 0.6 \\
A_v &= 1 \text{ m}^2 \\
\rho &= 1.2 \text{ kg/m}^3 \\
v_{\text{kmh}} &= 25 \text{ km/h} \\
\text{Weg:} \\
v_c &= \frac{v_{\text{kmh}}}{3.6} = 6.944 \text{ m/s} \\
F_{RRo} &= \mu_R \cdot m \cdot g \\
&= 0.01 \cdot 100 \cdot 9.81 \\
&= 9.81 \text{ N} \\
F_L &= 0.5 \cdot c_w \cdot A_v \cdot \rho \cdot v_c^2 \\
&= 0.5 \cdot 0.6 \cdot 1 \cdot 1.2 \cdot 6.944^2 \\
&= 17.36 \text{ N} \\
F_{\text{ges}} &= F_{RRo} + F_L \\
&= 9.81 + 17.36 \\
&= 27.17 \text{ N} \\
P &= F_{\text{ges}} \cdot v_c \\
&= 27.17 \cdot 6.944 \\
&= 188.7 \text{ W} \\
\text{ERG:} \quad P &= 188.7 \text{ W}
\end{align*}
$$

Die benötigte Motorleistung beträgt ca. **188,7 W** — das liegt unterhalb der zulässigen 250 W Maximalleistung.

**e) Maximale Höhendistanz**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Energie (Akku) | `W` | `1296000` J |
| | Wirkungsgrad | `eta` | `0.75` (Verlust 25%) |
| | Masse | `m` | `100` kg |
| Gesucht | Höhe | `h` | |

$$
\begin{align*}
\text{Gegeben:} \\
W &= 1296000 \text{ J} \\
\eta &= 0.75 \\
m &= 100 \text{ kg} \\
\text{Weg:} \\
W_{\text{nutz}} &= \eta \cdot W \\
&= 0.75 \cdot 1296000 \\
&= 972000 \text{ J} \\
h &= \frac{W_{\text{nutz}}}{m \cdot g} \\
&= \frac{972000}{100 \cdot 9.81} \\
&= 990.8 \text{ m} \\
\text{ERG:} \quad h &= 990.8 \text{ m}
\end{align*}
$$

Der Radfahrer kann mit einer vollen Akkuladung maximal ca. **990,8 Höhenmeter** überwinden (rein aus der gespeicherten Energie, ohne Berücksichtigung von Rollreibung/Luftwiderstand während des Anstiegs).

---

### Aufgabe 2: Schwungradspeicher

> [!info] Aufgabenstellung
> Ein Schwungrad wird auf 30.000 Umdrehungen pro Minute beschleunigt um auf mechanische Weise Energie zu speichern. Das Schwungrad soll ein aus Kohlenstofffaser verstärktem Kunststoff (CFK) bestehender Vollzylinder mit Höhe = Durchmesser sein $\rho_{CFK}$ = 1,5 g/cm³; $J = \frac{1}{2}mr^2$.
>
> a) Berechnen Sie die Energie, die ein derartiges Schwungrad speichern kann, wenn der Radius 30 cm beträgt, die Kosten für das CFK-Material (100 € pro kg) und das Verhältnis zur Energie eines Benzinkanisters mit 20 l Benzin (1 Liter Benzin besitzt einen Energiegehalt von 32 MJ oder 8,9 kWh).
>
> b) Berechnen Sie die Geschwindigkeit in m/s mit der die Mantelfläche rotiert (für r = 30 cm).
>
> c) Gesucht ist eine Gleichung, mit der sich für eine gegebene Energie die erforderliche Schwungmasse berechnen lässt. Stelle Sie dazu zunächst eine Formel auf, mit der sich der Radius aus der Masse berechnen lässt.

**a) Speicherbare Energie, Materialkosten, Verhältnis zu Benzin**

Da Höhe = Durchmesser gilt, ist $h = 2r$. Volumen des Vollzylinders: $V = \pi r^2 h = \pi r^2 \cdot 2r = 2\pi r^3$.

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Dichte CFK | `rho` | `1500` kg/m³ |
| | Radius | `r` | `0.3` m |
| | Drehzahl | `n` | `30000` 1/min |
| Gesucht | Masse, Trägheitsmoment, Energie | `m`, `J`, `Erot` | |

$$
\begin{align*}
\text{Gegeben:} \\
\rho &= 1500 \text{ kg/m}^3 \\
r &= 0.3 \text{ m} \quad (h = 2r = 0.6 \text{ m}) \\
n &= 30000 \text{ 1/min} = 500 \text{ 1/s} \\
\text{Weg:} \\
V &= 2\pi r^3 \\
&= 2\pi \cdot 0.3^3 \\
&= 0.1696 \text{ m}^3 \\
m &= \rho \cdot V \\
&= 1500 \cdot 0.1696 \\
&= 254.5 \text{ kg} \\
J &= 0.5 \cdot m \cdot r^2 \\
&= 0.5 \cdot 254.5 \cdot 0.3^2 \\
&= 11.45 \text{ kg}\cdot\text{m}^2 \\
\omega &= 2\pi n \\
&= 2\pi \cdot 500 \\
&= 3142 \text{ rad/s} \\
E_{\text{rot}} &= 0.5 \cdot J \cdot \omega^2 \\
&= 0.5 \cdot 11.45 \cdot 3142^2 \\
&= 56.51 \text{ MJ} \\
\text{ERG:} \quad E_{\text{rot}} &= 56.51 \text{ MJ}
\end{align*}
$$

Materialkosten:

$$
\begin{align*}
K &= m \cdot 100 \text{ €/kg} \\
&= 254.5 \cdot 100 \\
&= 25450 \text{ €}
\end{align*}
$$

Vergleich mit Benzinkanister (20 l, je 32 MJ):

$$
\begin{align*}
E_{\text{Benzin}} &= 20 \cdot 32 \text{ MJ} = 640 \text{ MJ} \\
\frac{E_{\text{Benzin}}}{E_{\text{rot}}} &= \frac{640}{56.51} \approx 11.3
\end{align*}
$$

**Ergebnis:** Das Schwungrad speichert ca. **56,5 MJ**, das CFK-Material kostet ca. **25.450 €**, und der Benzinkanister enthält ca. **11,3-mal** so viel Energie wie das Schwungrad — mechanische Schwungradspeicher haben eine deutlich geringere Energiedichte als flüssige Brennstoffe.

**b) Geschwindigkeit der Mantelfläche**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Winkelgeschwindigkeit | `omega` | `3142` rad/s |
| | Radius | `r` | `0.3` m |
| Gesucht | Geschwindigkeit | `v` | |

$$
\begin{align*}
\text{Gegeben:} \\
\omega &= 3142 \text{ rad/s} \\
r &= 0.3 \text{ m} \\
\text{Weg:} \\
v &= \omega \cdot r \\
&= 3142 \cdot 0.3 \\
&= 942.5 \text{ m/s} \\
\text{ERG:} \quad v &= 942.5 \text{ m/s}
\end{align*}
$$

Die Mantelfläche rotiert mit ca. **942,5 m/s** — das ist etwa das 2,7-fache der Schallgeschwindigkeit, was in der Praxis eine enorme mechanische Belastung für das Material darstellt (Grund, warum reale Schwungradspeicher Vakuumgehäuse und Magnetlager nutzen).

**c) Formel für Radius aus Masse und für Schwungmasse aus Energie**

Mit $h = 2r$ folgt $V = 2\pi r^3$ und damit $m = \rho \cdot 2\pi r^3$. Aufgelöst nach $r$:

$$
r = \sqrt[3]{\frac{m}{2\pi \rho}}
$$

Für die Rotationsenergie gilt mit $J = \frac{1}{2}mr^2$ und $\omega = 2\pi n$:

$$
E_{\text{rot}} = \frac{1}{2} J \omega^2 = \frac{1}{2} \cdot \frac{1}{2} m r^2 \cdot \omega^2 = \frac{1}{4} m r^2 \omega^2
$$

Setzt man $r^2 = \left(\dfrac{m}{2\pi\rho}\right)^{2/3}$ ein, ergibt sich die gesuchte Gleichung für die erforderliche Schwungmasse bei gegebener Energie $E_{\text{rot}}$ und Drehzahl $\omega$:

$$
E_{\text{rot}} = \frac{1}{4} m \left(\frac{m}{2\pi\rho}\right)^{2/3} \omega^2 \quad\Longrightarrow\quad m^{5/3} = \frac{4 E_{\text{rot}}}{\omega^2 (2\pi\rho)^{-2/3}} \quad\Longrightarrow\quad m = \left(\frac{4 E_{\text{rot}}}{\omega^2} \cdot (2\pi\rho)^{2/3}\right)^{3/5}
$$

**Ergebnis:** Radius aus Masse: $r = \sqrt[3]{\dfrac{m}{2\pi\rho}}$; Masse aus gegebener Energie: $m = \left(\dfrac{4 E_{\text{rot}}}{\omega^2}\cdot(2\pi\rho)^{2/3}\right)^{3/5}$.

---

### Aufgabe 3: Federpendel

> [!info] Aufgabenstellung
> Die Schwingung des ungedämpften Federpendels wird durch das folgende Zeit-Orts-Gesetz beschrieben: $y(t) = \hat{y} \cdot \sin(\omega t + \varphi)$.
>
> a) Geben Sie an, wofür die einzelnen Größen in dieser Gleichung stehen.
>
> b) Geben Sie das zugehörige Zeit-Geschwindigkeits-Gesetz und Zeit-Beschleunigungsgesetz an (für $\varphi$ = 0).
>
> c) Ein Federpendel soll mit einer Periodendauer von 1 Sekunde schwingen. Geben Sie eine mögliche Kombination von Federhärte und Masse an. Hinweis: Sie können die Gleichung ggf. aus den Einheiten rekonstruieren.
>
> d) Beschreiben oder skizzieren Sie ausgehend vom Federpendel ein einfaches Experiment, mit dem sich auch das Phänomen „Resonanz" quantitativ untersuchen lässt. Beschränken Sie sich dabei auf das Nötigste.

**a) Bedeutung der Größen**

- $y(t)$: Auslenkung des Pendels aus der Ruhelage zum Zeitpunkt $t$ (in m)
- $\hat{y}$: Amplitude, maximale Auslenkung (in m)
- $\omega$: Kreisfrequenz der Schwingung (in rad/s), $\omega = 2\pi f = 2\pi/T$
- $t$: Zeit (in s)
- $\varphi$: Phasenwinkel/Nullphasenwinkel, legt die Auslenkung bei $t=0$ fest (in rad)

**b) Zeit-Geschwindigkeits- und Zeit-Beschleunigungsgesetz (für $\varphi=0$)**

Durch Ableiten von $y(t) = \hat{y}\sin(\omega t)$ nach der Zeit:

$$
\begin{align*}
v(t) &= \dot{y}(t) = \hat{y}\,\omega\cos(\omega t) \\
a(t) &= \ddot{y}(t) = -\hat{y}\,\omega^2\sin(\omega t) = -\omega^2 y(t)
\end{align*}
$$

**c) Kombination von Federhärte und Masse für T = 1 s**

Aus den Einheiten von $T$ (s), $m$ (kg) und $D$ (N/m = kg/s²) lässt sich die Periodendauer-Formel des Federpendels rekonstruieren: $T = 2\pi\sqrt{m/D}$ (Einheitencheck: $\sqrt{\text{kg}/(\text{kg/s}^2)} = \sqrt{\text{s}^2} = \text{s}$ ✓).

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Periodendauer | `T` | `1` s |
| | Masse (frei gewählt) | `m` | `1` kg |
| Gesucht | Federhärte | `D` | |

$$
\begin{align*}
\text{Gegeben:} \\
T &= 1 \text{ s} \\
m &= 1 \text{ kg} \\
\text{Weg:} \\
D &= m \cdot \left(\frac{2\pi}{T}\right)^2 \\
&= 1 \cdot \left(\frac{2\pi}{1}\right)^2 \\
&= 39.48 \text{ N/m} \\
\text{ERG:} \quad D &= 39.48 \text{ N/m}
\end{align*}
$$

**Ergebnis:** Eine mögliche Kombination ist $m = 1\,\text{kg}$ und $D \approx 39{,}48\,\text{N/m}$ (jede Kombination mit demselben Verhältnis $m/D = 1/(2\pi)^2 \approx 0{,}0253\,\text{s}^2$ erfüllt $T=1\,\text{s}$, z. B. auch $m=2\,\text{kg}$, $D\approx 78{,}96\,\text{N/m}$).

**d) Experiment zur quantitativen Untersuchung der Resonanz**

Man nimmt das Federpendel aus a)-c) und befestigt das obere Ende der Feder nicht ortsfest, sondern an einem Exzenter-Motor (oder Lautsprecher-Schwingerreger), der eine sinusförmige Anregung mit einstellbarer, bekannter Anregungsfrequenz $f_{\text{err}}$ und (näherungsweise) konstanter Amplitude liefert. Am unteren Ende hängt die Masse $m$ des Federpendels mit Eigenkreisfrequenz $\omega_0 = \sqrt{D/m}$.

Durchführung: Man variiert die Anregungsfrequenz $f_{\text{err}}$ schrittweise (z. B. von deutlich unterhalb bis deutlich oberhalb der Eigenfrequenz $f_0 = \omega_0/(2\pi)$) und misst für jede Frequenz die sich einstellende stationäre Schwingungsamplitude $\hat{y}$ der Masse (z. B. optisch mit einer Skala oder per Bewegungssensor). Trägt man die gemessene Amplitude über der Anregungsfrequenz auf, erhält man die Resonanzkurve: Die Amplitude steigt zur Eigenfrequenz hin stark an und erreicht bei (leicht unterhalb, je nach Dämpfung) $f_0$ ihr Maximum — das ist die Resonanz. Aus der Breite/Schärfe der Resonanzkurve lässt sich zusätzlich die Dämpfung des Systems quantitativ bestimmen.

---

### Aufgabe 4: Wellengleichung am gespannten Draht

> [!info] Aufgabenstellung
> Anhand der Querauslenkung gespannter Drähte wurde die Wellengleichung hergeleitet: $\dfrac{\delta^2 u}{\delta t^2} = c^2 \dfrac{\delta^2 u}{\delta x^2}$ mit $c^2 = \dfrac{F}{\rho A}$.
>
> a) Berechnen Sie die Ausbreitungsgeschwindigkeit der Welle für einen Stahldraht, der an einem Ende an einer Wand befestigt ist und am anderen Ende durch einen Klotz mit der Masse M = 2 kg gespannt wird. Der Draht hat einen kreisförmigen Querschnitt mit 2,8 mm Durchmesser; die Dichte von Stahl beträgt $\rho_{Stahl}$ = 7,85 g/cm³.
>
> b) Ein gespanntes Stahlseil, dessen Wellenausbreitungsgeschwindigkeit 50 m/s beträgt, wird mit einer Frequenz 5 Hz zum Schwingen angeregt. Berechnen Sie die Wellenlänge der Schwingung.
>
> c) Überprüfen Sie rechnerisch, ob die folgende Gleichung eine Lösung der Wellengleichung darstellt: $u(x,t) = A\sin(kx-\omega t)$, wobei A, k und $\omega$ Konstanten sind. Wenn ja, geben Sie an, wie die Ausbreitungsgeschwindigkeit der Welle von k und $\omega$ abhängt.

**a) Ausbreitungsgeschwindigkeit im Stahldraht**

Die Spannkraft im Draht entspricht der Gewichtskraft des hängenden Klotzes: $F = M \cdot g$.

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Masse (Klotz) | `M` | `2` kg |
| | Durchmesser | `d` | `0.0028` m |
| | Dichte Stahl | `rho` | `7850` kg/m³ |
| Gesucht | Wellengeschwindigkeit | `cph` | |

$$
\begin{align*}
\text{Gegeben:} \\
M &= 2 \text{ kg} \\
d &= 0.0028 \text{ m} \\
\rho &= 7850 \text{ kg/m}^3 \\
\text{Weg:} \\
F &= M \cdot g \\
&= 2 \cdot 9.81 \\
&= 19.62 \text{ N} \\
A_v &= \pi \left(\frac{d}{2}\right)^2 \\
&= \pi \cdot 0.0014^2 \\
&= 6.158\times10^{-6} \text{ m}^2 \\
c_{\text{ph}} &= \sqrt{\frac{F}{\rho \cdot A_v}} \\
&= \sqrt{\frac{19.62}{7850 \cdot 6.158\times10^{-6}}} \\
&= 20.15 \text{ m/s} \\
\text{ERG:} \quad c_{\text{ph}} &= 20.15 \text{ m/s}
\end{align*}
$$

**b) Wellenlänge**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Wellengeschwindigkeit | `cph` | `50` m/s |
| | Frequenz | `f` | `5` Hz |
| Gesucht | Wellenlänge | `lam` | |

$$
\begin{align*}
\text{Gegeben:} \\
c_{\text{ph}} &= 50 \text{ m/s} \\
f &= 5 \text{ Hz} \\
\text{Weg:} \\
\lambda &= \frac{c_{\text{ph}}}{f} \\
&= \frac{50}{5} \\
&= 10 \text{ m} \\
\text{ERG:} \quad \lambda &= 10 \text{ m}
\end{align*}
$$

**c) Prüfung der Lösung $u(x,t) = A\sin(kx-\omega t)$**

Partielle Ableitungen bilden:

$$
\begin{align*}
\frac{\delta u}{\delta x} &= A k \cos(kx-\omega t) \\
\frac{\delta^2 u}{\delta x^2} &= -A k^2 \sin(kx-\omega t) \\
\frac{\delta u}{\delta t} &= -A \omega \cos(kx-\omega t) \\
\frac{\delta^2 u}{\delta t^2} &= -A \omega^2 \sin(kx-\omega t)
\end{align*}
$$

Einsetzen in die Wellengleichung $\dfrac{\delta^2 u}{\delta t^2} = c^2 \dfrac{\delta^2 u}{\delta x^2}$:

$$
-A\omega^2\sin(kx-\omega t) = c^2 \cdot \left(-Ak^2\sin(kx-\omega t)\right)
$$

Da beide Seiten den Faktor $-A\sin(kx-\omega t)$ gemeinsam haben, kürzt sich dieser (für $A\neq0$), und es bleibt:

$$
\omega^2 = c^2 k^2 \quad\Longrightarrow\quad c = \frac{\omega}{k}
$$

**Ergebnis:** Ja, $u(x,t)=A\sin(kx-\omega t)$ ist eine Lösung der Wellengleichung, sofern $c = \omega/k$ gilt — die Ausbreitungsgeschwindigkeit ist also der Quotient aus Kreisfrequenz und Wellenzahl.

---

### Aufgabe 5: Mollier-(h,x)-Diagramm

> [!info] Aufgabenstellung
> Aufgabe 5: Ergänzen Sie die Achsenbeschriftung und beantworten Sie folgende Fragen zum Mollier-(h,x)-Diagramm.
>
> I. Wo im Diagramm befinden sich die Isenthalpen? Was bedeuten sie?
>
> II. Wie können Sie zu einem Punkt im Diagramm die Taupunkttemperatur ablesen? Was bedeutet diese?
>
> III. Wie und wo kann a) die relative und b) die absolute Luftfeuchtigkeit abgelesen werden? Wo die Dichte der Luft?
>
> (Es folgt das Mollier-(h,x)-Diagramm für feuchte Luft, Bezugsdruck 1000 mbar, mit eingezeichneten Kurven konstanter relativer Feuchte $\varphi$, Dichtelinien und mehreren markierten Punkten 1–8.)

**Achsenbeschriftung**

Im Mollier-(h,x)-Diagramm für feuchte Luft ist auf der (schräg verlaufenden, meist vertikal gezeichneten) Ordinate die spezifische Enthalpie $h$ der feuchten Luft in kJ/kg (trockene Luft) aufgetragen, auf der (schräg nach unten rechts verlaufenden, meist horizontal projizierten) Abszisse die Wasserbeladung bzw. der Wassergehalt $x$ in g Wasser pro kg trockener Luft (g/kg).

**I. Isenthalpen**

Die Isenthalpen (Linien konstanter Enthalpie $h=\text{const.}$) verlaufen im schiefwinkligen Mollier-Diagramm als parallele Geraden schräg von oben links nach unten rechts (bei den meisten Ausführungen mit einer Neigung, die dem Koordinatenschiefwinkel entspricht, häufig mit ca. 45°/Schrägachsen-Konstruktion, in der Skizze z. B. die Linien "20 kJ/kg", "30 kJ/kg" usw.). Sie bedeuten: Entlang einer Isenthalpe bleibt die spezifische Enthalpie der feuchten Luft konstant — solche Zustandsänderungen entsprechen näherungsweise adiabaten Prozessen ohne Wärmezufuhr/-abfuhr von außen, wie sie z. B. bei der adiabaten Sättigung (Verdunstungskühlung) oder in gut isolierten Mischprozessen auftreten.

**II. Taupunkttemperatur**

Um zu einem beliebigen Zustandspunkt die Taupunkttemperatur zu bestimmen, geht man vom Punkt aus horizontal (d. h. bei konstantem Wassergehalt $x$) nach unten/links, bis man die Sättigungslinie ($\varphi = 1{,}0$ bzw. 100 %) erreicht. Die an diesem Schnittpunkt ablesbare Temperatur (bzw. die dort verlaufende Isotherme) ist die Taupunkttemperatur. Sie bedeutet die Temperatur, auf die die Luft bei gleichbleibendem Wassergehalt abgekühlt werden müsste, damit sie gerade gesättigt ist (relative Feuchte = 100 %) und Kondensation (Tau, Nebel, Beschlagen von Oberflächen) einsetzt.

**III. Ablesen der Luftfeuchtigkeit und der Dichte**

a) Die **relative Luftfeuchtigkeit** $\varphi$ wird direkt an den im Diagramm eingezeichneten Kurvenscharen $\varphi = 0{,}1$ bis $\varphi = 1{,}0$ abgelesen: Der Zustandspunkt liegt zwischen bzw. auf einer dieser Kurven; ihr Wert (z. B. $\varphi=0{,}5$ = 50 % relative Feuchte) kann direkt an der Beschriftung der jeweiligen Kurve abgelesen werden.

b) Die **absolute Luftfeuchtigkeit** (der Wassergehalt $x$) wird durch senkrechtes Herunterprojizieren (Parallele zu den Isenthalpen bzw. senkrecht zur x-Achse) des Zustandspunktes auf die x-Achse abgelesen — der dort abgelesene Wert in g/kg ist die absolute Feuchte (Wasserbeladung).

Die **Dichte der Luft** wird an den zusätzlich im Diagramm eingezeichneten Dichtelinien (in der Abbildung am linken Rand mit Werten wie 1,04 kg/m³ bis 1,16 kg/m³ beschriftet) abgelesen: Der Zustandspunkt liegt zwischen zwei benachbarten Dichtelinien, deren Wert interpoliert die Luftdichte am jeweiligen Zustandspunkt ergibt.

---

### Aufgabe 6: Strömungsmechanik — Reynoldszahl und Modellversuche

> [!info] Aufgabenstellung
> Die Strömungseigenschaften eines 2 m breiten und 2 m hohen PKWs sollen mit Modellen im Windkanal und einem Wasserkanal experimentell untersucht werden. Gesucht sind zugehörige physikalische Größen. Verwenden Sie für Ihre Rechnung folgende Angaben:
>
> Dynamische Viskosität und Dichte von …
> … Wasser bei 20°C: $\eta$ = 1,00 mPa·s, $\rho$ = 998,4 kg/m³
> … Luft bei 0°C: 17,1 µPa·s, $\rho$ = 1,29 kg/m (bei p = 1013 mbar)
>
> a) Berechnen Sie die Reynoldszahl Re des PKW für die Maximalgeschwindigkeit von v = 180 km/h = 50 m/s. In den Modellexperimenten soll die Zahl Re erreicht werden.
>
> b) Die TU Dresden verfügt über einen Hochgeschwindigkeitswindkanal mit einem Messquerschnitt von 350 x 500 mm² und einer Luftgeschwindigkeit von bis zur dreifachen Schallgeschwindigkeit (900 m/s). Berechnen Sie die Modellgröße und beurteilen Sie, ob der Wagen in dem Messquerschnitt passt.
>
> c) Die TU Hamburg besitzt einen Strömungskanal mit einem Strömungsquerschnitt von 409 x 500 mm und einer Fördermenge von 150 m³/h. Es soll ein Modellwagen im Maßstab 1:10 getestet werden. Berechnen Sie die erforderliche Fördermenge und beurteilen Sie, ob die Anlage diese erreichen kann.

Hinweis: Für alle Teilaufgaben gilt die Reynolds-Ähnlichkeit — die Reynoldszahl $Re = \dfrac{\rho v L}{\eta}$ (mit charakteristischer Länge $L$, hier der Fahrzeugbreite) muss zwischen Original und Modell übereinstimmen, damit die Strömungsverhältnisse (Verhältnis von Trägheits- zu Reibungskräften) vergleichbar sind. PhyCalc enthält keine Strömungsmechanik-Formeln (Re, Bernoulli, Torricelli) — diese Teilaufgaben werden händisch nach der Definitionsgleichung der Reynoldszahl gelöst.

**a) Reynoldszahl des PKW**

$$
\begin{align*}
\text{Gegeben:} \\
\rho_{\text{Luft}} &= 1.29 \text{ kg/m}^3 \\
v &= 50 \text{ m/s} \\
L &= 2 \text{ m (Fahrzeugbreite)} \\
\eta_{\text{Luft}} &= 17.1\times10^{-6} \text{ Pa}\cdot\text{s} \\
\text{Weg:} \\
Re &= \frac{\rho \cdot v \cdot L}{\eta} \\
&= \frac{1.29 \cdot 50 \cdot 2}{17.1\times10^{-6}} \\
&= 7{,}54\times10^{6} \\
\text{ERG:} \quad Re &\approx 7{,}54\times10^{6}
\end{align*}
$$

**b) Modellgröße im TU-Dresden-Windkanal**

Um dieselbe Reynoldszahl bei der maximal verfügbaren Luftgeschwindigkeit $v_{\text{max}}=900\,\text{m/s}$ zu erreichen, muss die Modelllänge $L_{\text{Modell}}$ entsprechend kleiner gewählt werden (gleiches Medium Luft, also gleiches $\rho$ und $\eta$):

$$
\begin{align*}
Re &= \frac{\rho \cdot v_{\text{max}} \cdot L_{\text{Modell}}}{\eta} \\
L_{\text{Modell}} &= \frac{Re \cdot \eta}{\rho \cdot v_{\text{max}}} \\
&= \frac{7{,}54\times10^{6} \cdot 17.1\times10^{-6}}{1.29 \cdot 900} \\
&= 0.111 \text{ m} \\
\text{ERG:} \quad L_{\text{Modell}} &\approx 0{,}111 \text{ m} = 11{,}1 \text{ cm}
\end{align*}
$$

Bei gleichem Höhe-Breite-Verhältnis wie das Original (2 m × 2 m) wäre das Modell somit ca. **11,1 cm breit und 11,1 cm hoch**. Der Messquerschnitt des Windkanals beträgt 350 × 500 mm — das Modell (111 × 111 mm) **passt problemlos** in den Messquerschnitt (deutlich kleiner als die 350 mm bzw. 500 mm Kantenlänge, auch unter Berücksichtigung eines für Windkanalversuche üblichen Blockage-Verhältnisses von deutlich unter 10 %).

**c) Erforderliche Fördermenge im TU-Hamburg-Wasserkanal**

Modellmaßstab 1:10 bedeutet $L_{\text{Modell}} = 2\,\text{m}/10 = 0{,}2\,\text{m}$. Da hier das Medium wechselt (Wasser statt Luft), muss für die gleiche Reynoldszahl die Modellgeschwindigkeit im Wasser entsprechend angepasst werden:

$$
\begin{align*}
Re &= \frac{\rho_{\text{Wasser}} \cdot v_{\text{Modell}} \cdot L_{\text{Modell}}}{\eta_{\text{Wasser}}} \\
v_{\text{Modell}} &= \frac{Re \cdot \eta_{\text{Wasser}}}{\rho_{\text{Wasser}} \cdot L_{\text{Modell}}} \\
&= \frac{7{,}54\times10^{6} \cdot 1.00\times10^{-3}}{998.4 \cdot 0.2} \\
&= 37.78 \text{ m/s}
\end{align*}
$$

Die erforderliche Fördermenge ergibt sich aus dem Kanalquerschnitt $A_{\text{Kanal}} = 0{,}409\,\text{m} \times 0{,}5\,\text{m} = 0{,}2045\,\text{m}^2$:

$$
\begin{align*}
\dot{V} &= v_{\text{Modell}} \cdot A_{\text{Kanal}} \\
&= 37.78 \cdot 0.2045 \\
&= 7.73 \text{ m}^3/\text{s} \\
&= 27813 \text{ m}^3/\text{h} \\
\text{ERG:} \quad \dot{V} &\approx 27{,}813 \text{ m}^3/\text{h}
\end{align*}
$$

**Beurteilung:** Die Anlage der TU Hamburg liefert nur 150 m³/h, benötigt würden aber ca. **27.813 m³/h** — das ist etwa das **185-fache** der verfügbaren Fördermenge. Die Anlage kann die für eine vollständige Reynolds-Ähnlichkeit erforderliche Strömungsgeschwindigkeit bei diesem Modellmaßstab **nicht** erreichen; entweder müsste der Modellmaßstab deutlich größer gewählt werden, oder es müsste auf eine exakte Re-Übereinstimmung verzichtet werden (was in der Praxis bei aerodynamischen PKW-Modellversuchen aufgrund derart hoher Reynoldszahlen häufig der Fall ist).

---

### Aufgabe 7: Strömungsmechanik — Tankausfluss

> [!info] Aufgabenstellung
> Aus einem Tank, der 1 m hoch mit Wasser gefüllt ist, lässt man Wasser durch eine Düse mit einem Durchmesser d = 60 mm abfließen. Diese befindet sich in 30 cm Höhe (auf den Mittelpunkt der Düse bezogen).
>
> a) Berechnen Sie den Druck, der auf den Tankboden wirkt.
>
> b) Berechnen Sie die anfängliche Ausflussgeschwindigkeit.
>
> c) Berechnen Sie die Füllhöhe (der Tank soll hinreichend hoch sein), die sich einstellt, wenn ständig Wasser mit $\dot{V}$(Punkt) = 60 m³/h nachfließt und ungehindert über die Düse abfließt.

**a) Druck am Tankboden**

Hydrostatischer Druck durch die 1 m Wassersäule (Überdruck gegenüber Atmosphäre):

$$
\begin{align*}
\text{Gegeben:} \\
\rho_{\text{Wasser}} &= 1000 \text{ kg/m}^3 \\
h &= 1 \text{ m} \\
\text{Weg:} \\
p &= \rho \cdot g \cdot h \\
&= 1000 \cdot 9.81 \cdot 1 \\
&= 9810 \text{ Pa} \\
\text{ERG:} \quad p &= 9810 \text{ Pa} \approx 98.1 \text{ mbar (Überdruck)}
\end{align*}
$$

**b) Anfängliche Ausflussgeschwindigkeit (Torricelli)**

Die für den Ausfluss wirksame Höhe ist die Höhe der Wasseroberfläche über der Düsenmitte: $h_{\text{eff}} = 1\,\text{m} - 0{,}3\,\text{m} = 0{,}7\,\text{m}$.

$$
\begin{align*}
\text{Gegeben:} \\
h_{\text{eff}} &= 0.7 \text{ m} \\
\text{Weg:} \\
v &= \sqrt{2 \cdot g \cdot h_{\text{eff}}} \\
&= \sqrt{2 \cdot 9.81 \cdot 0.7} \\
&= 3.71 \text{ m/s} \\
\text{ERG:} \quad v &= 3.71 \text{ m/s}
\end{align*}
$$

**c) Stationäre Füllhöhe bei kontinuierlichem Zufluss**

Im stationären Zustand ist der Zufluss gleich dem Ausfluss durch die Düse: $\dot{V}_{\text{zu}} = A_{\text{Düse}} \cdot v_{\text{aus}}$, wobei $v_{\text{aus}}$ wieder nach Torricelli von der (jetzt gesuchten) Füllhöhe über der Düse abhängt.

$$
\begin{align*}
\text{Gegeben:} \\
\dot{V} &= 60 \text{ m}^3/\text{h} = 0.01667 \text{ m}^3/\text{s} \\
d &= 0.06 \text{ m} \\
\text{Weg:} \\
A_{\text{Düse}} &= \pi \left(\frac{d}{2}\right)^2 \\
&= \pi \cdot 0.03^2 \\
&= 2.827\times10^{-3} \text{ m}^2 \\
v_{\text{aus}} &= \frac{\dot{V}}{A_{\text{Düse}}} \\
&= \frac{0.01667}{2.827\times10^{-3}} \\
&= 5.898 \text{ m/s} \\
h_{\text{eff}} &= \frac{v_{\text{aus}}^2}{2g} \\
&= \frac{5.898^2}{2 \cdot 9.81} \\
&= 1.771 \text{ m} \\
h_{\text{gesamt}} &= h_{\text{eff}} + 0.3 \text{ m} \\
&= 1.771 + 0.3 \\
&= 2.071 \text{ m} \\
\text{ERG:} \quad h_{\text{gesamt}} &= 2.071 \text{ m}
\end{align*}
$$

**Ergebnis:** Es stellt sich eine stationäre Füllhöhe von ca. **2,07 m** ein (der Tank muss also mindestens diese Höhe besitzen, wie in der Aufgabe vorausgesetzt).

---

### Aufgabe 8: Elektrische und magnetische Felder

> [!info] Aufgabenstellung
> a) Ein Elektron fliegt mit einer Geschwindigkeit von $6\cdot10^6$ m/s durch je ein Loch in einen Plattenkondensator hinein und verlangsamt heraus. Die angegebene Spannung beträgt 70 V, der Plattenabstand 10 cm. Berechnen Sie um welchen Betrag sich die kinetische Energie des Elektrons verringert hat und mit welcher Geschwindigkeit das Elektron den Plattenkondensator verlässt.
> Die Masse des Elektrons beträgt $m_e = 9{,}1\cdot10^{-31}$ kg.
> Die Ladung $q_e = 1{,}6\cdot10^{-19}$ C.
>
> b) Mit einem Massenspektrometer können Substanzen, die in der Gasphase vorliegen, unterschieden und erkannt werden. Die Geräte beruhen darauf, dass sich bewegende geladene Teilchen je nach Masse in einem Magnetfeld unterschiedlich stark abgelenkt werden. Für ein Natrium ergibt sich eine halbkreisförmige Bahn mit einem Radius von 4 cm. Die Geschwindigkeit der Natrium-Ionen beträgt $10^5$ m/s; Das Magnetfeld hat die Stärke B = 600 mT und soll immer senkrecht zur Bewegungsrichtung orientiert sein.
> Berechnen Sie die Masse des Natrium-Ions. (Diesem fehlt ein Elektron, wodurch es einfach positiv geladen ist, aber kaum an Masse verliert.)
> Zum Vergleich: Die Masse ein Protons beträgt $1{,}6\cdot10^{-27}$ kg.
> Hinweis: Welche Kraft hält ein Ion auf der Kreisbahn?
>
> c) Eine Leiterschleife umschließt die Fläche A=50 cm² und steht senkrecht zu einem Magnetfeld mit B = 200 mT. Berechnen Sie die Spannung, die induziert wird, wenn man die Schleife innerhalb von 0,1 s auf A = 5 cm² zusammendrückt.

**a) Energieverlust und Austrittsgeschwindigkeit des Elektrons**

Das Elektron fliegt gegen das (verzögernde) elektrische Feld des Kondensators; der Energieverlust entspricht der Arbeit $W = q_e \cdot U$, die gegen das Feld verrichtet wird.

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Anfangsgeschwindigkeit | `v` | `6e6` m/s |
| | Masse Elektron | `m` | `9.1e-31` kg |
| | Ladung | `Q` | `1.6e-19` C |
| | Spannung | `U` | `70` V |
| Gesucht | Anfangs-$E_{kin}$, $\Delta E$, Austrittsgeschw. | `Ekin`, `W`, `v` | |

$$
\begin{align*}
\text{Gegeben:} \\
v_0 &= 6\times10^6 \text{ m/s} \\
m_e &= 9.1\times10^{-31} \text{ kg} \\
q_e &= 1.6\times10^{-19} \text{ C} \\
U &= 70 \text{ V} \\
\text{Weg:} \\
E_{\text{kin,0}} &= 0.5 \cdot m_e \cdot v_0^2 \\
&= 0.5 \cdot 9.1\times10^{-31} \cdot (6\times10^6)^2 \\
&= 1.638\times10^{-17} \text{ J} \\
\Delta E &= q_e \cdot U \\
&= 1.6\times10^{-19} \cdot 70 \\
&= 1.12\times10^{-17} \text{ J} \\
E_{\text{kin,1}} &= E_{\text{kin,0}} - \Delta E \\
&= 1.638\times10^{-17} - 1.12\times10^{-17} \\
&= 0.518\times10^{-17} \text{ J} \\
v_1 &= \sqrt{\frac{2 E_{\text{kin,1}}}{m_e}} \\
&= \sqrt{\frac{2 \cdot 0.518\times10^{-17}}{9.1\times10^{-31}}} \\
&= 3.373\times10^{6} \text{ m/s} \\
\text{ERG:} \quad \Delta E &\approx 1.12\times10^{-17} \text{ J}, \quad v_1 \approx 3.37\times10^{6} \text{ m/s}
\end{align*}
$$

**Ergebnis:** Die kinetische Energie verringert sich um ca. $1{,}12\times10^{-17}\,\text{J}$; das Elektron verlässt den Kondensator mit ca. $3{,}37\times10^{6}\,\text{m/s}$ (es wird also abgebremst, aber nicht vollständig gestoppt, da $E_{\text{kin,0}} > \Delta E$).

**b) Masse des Natrium-Ions**

Die Lorentzkraft $F = q\,v\,B$ wirkt als Zentripetalkraft $F_Z = \dfrac{mv^2}{r}$ auf das Ion, wodurch es auf einer Kreisbahn gehalten wird. Gleichsetzen ergibt den Radius $r = \dfrac{mv}{qB}$, aufgelöst nach $m$:

$$
\begin{align*}
\text{Gegeben:} \\
q &= 1.6\times10^{-19} \text{ C (einfach positiv geladen)} \\
B &= 0.6 \text{ T} \\
r &= 0.04 \text{ m} \\
v &= 10^5 \text{ m/s} \\
\text{Weg:} \\
m &= \frac{q \cdot B \cdot r}{v} \\
&= \frac{1.6\times10^{-19} \cdot 0.6 \cdot 0.04}{10^5} \\
&= 3.84\times10^{-26} \text{ kg} \\
\text{ERG:} \quad m &\approx 3.84\times10^{-26} \text{ kg}
\end{align*}
$$

**Ergebnis:** Die Masse des Natrium-Ions beträgt ca. $3{,}84\times10^{-26}\,\text{kg}$, das entspricht ca. 24 Protonenmassen ($3{,}84\times10^{-26}/1{,}6\times10^{-27}\approx 24$) — plausibel nahe an der tatsächlichen Natrium-Massenzahl (23).

**c) Induzierte Spannung bei Flächenänderung**

$$
\begin{align*}
\text{Gegeben:} \\
B &= 0.2 \text{ T} \\
A_1 &= 50\times10^{-4} \text{ m}^2 = 0.005 \text{ m}^2 \\
A_2 &= 5\times10^{-4} \text{ m}^2 = 0.0005 \text{ m}^2 \\
\Delta t &= 0.1 \text{ s} \\
\text{Weg:} \\
\Delta \Phi &= B \cdot (A_2 - A_1) \\
&= 0.2 \cdot (0.0005 - 0.005) \\
&= -9\times10^{-4} \text{ Wb} \\
U_{\text{ind}} &= \left|\frac{\Delta \Phi}{\Delta t}\right| \\
&= \frac{9\times10^{-4}}{0.1} \\
&= 9\times10^{-3} \text{ V} \\
\text{ERG:} \quad U_{\text{ind}} &= 9 \text{ mV}
\end{align*}
$$

**Ergebnis:** Beim Zusammendrücken der Schleife wird eine Spannung von ca. **9 mV** induziert.

---

### Aufgabe 9: Widerstandsnetzwerk

> [!info] Aufgabenstellung
> a) Stellen Sie eine Gleichung für den Ersatzwiderstand der abgebildeten Gleichung auf.
>
> b) Berechnen Sie den Widerstand für folgende Zahlenwerte: R1 = 1000 Ohm, R2 = 470 Ohm und R3 = 100 Ohm.
>
> c) Ein ohmscher Widerstand R und eine Spule mit der Induktivität L werden parallel geschaltet. Geben Sie die Gleichung an, mit der sich die Gesamtimpendanz beider Bauteile berechnen lässt.
>
> (Schaltbild: Eine Spannungsquelle $U_0$ treibt einen Strom durch R1, danach verzweigt sich der Strompfad in eine Parallelschaltung von R2 und R3, die gemeinsam zurück zur Quelle führen — R1 liegt also in Reihe zur Parallelschaltung von R2 und R3.)

**a) Gleichung für den Ersatzwiderstand**

R1 liegt in Reihe zur Parallelschaltung von R2 und R3:

$$
R_{\text{ges}} = R_1 + \frac{R_2 \cdot R_3}{R_2+R_3}
$$

**b) Berechnung mit den gegebenen Werten**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Widerstand 1 | `R1` | `1000` Ω |
| | Widerstand 2 | `R2` | `470` Ω |
| | Widerstand 3 | `R3` | `100` Ω |
| Gesucht | Ersatzwiderstand | `Rges` | |

$$
\begin{align*}
\text{Gegeben:} \\
R_1 &= 1000 \text{ } \Omega \\
R_2 &= 470 \text{ } \Omega \\
R_3 &= 100 \text{ } \Omega \\
\text{Weg:} \\
R_{2,3} &= \frac{R_2 \cdot R_3}{R_2+R_3} \\
&= \frac{470 \cdot 100}{470+100} \\
&= 82.46 \text{ } \Omega \\
R_{\text{ges}} &= R_1 + R_{2,3} \\
&= 1000 + 82.46 \\
&= 1082.46 \text{ } \Omega \\
\text{ERG:} \quad R_{\text{ges}} &= 1082.46 \text{ } \Omega
\end{align*}
$$

**c) Gesamtimpedanz von parallel geschaltetem R und L**

Für die Parallelschaltung von ohmschem Widerstand $R$ und Induktivität $L$ (mit Blindwiderstand $X_L = \omega L$) addieren sich die komplexen Leitwerte:

$$
\frac{1}{\underline{Z}} = \frac{1}{R} + \frac{1}{j\omega L}
$$

Aufgelöst nach $\underline{Z}$:

$$
\underline{Z} = \frac{R \cdot j\omega L}{R + j\omega L}
$$

Für den Betrag der Impedanz ergibt sich:

$$
|Z| = \frac{R \cdot \omega L}{\sqrt{R^2 + (\omega L)^2}}
$$

**Ergebnis:** $\underline{Z} = \dfrac{R\cdot j\omega L}{R+j\omega L}$, bzw. im Betrag $|Z| = \dfrac{R\,\omega L}{\sqrt{R^2+(\omega L)^2}}$.
