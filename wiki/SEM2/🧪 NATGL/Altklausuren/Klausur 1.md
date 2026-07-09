---
tags:
  - sem2
  - natgl
type: exam
---
# Klausur 1 — Altklausur

> [!info] Kontext
> Altklausur mit 6 Aufgaben aus den Bereichen Mechanik (schiefe Ebene/Reibung, Rotation/Trägheitsmoment, gedämpfte Schwingung/Federstoß), Elektrizitätslehre (Plattenkondensator, Massenspektrometer, Induktion) und Wechselstromtechnik (komplexe Impedanzen, RC-Entladung).

## Inhaltsverzeichnis

- [[#Aufgabe 1: Umzug eines Servers]]
- [[#Aufgabe 2: Drehbewegung von DVDs]]
- [[#Aufgabe 3: Roboter-Aufprallschutz]]
- [[#Aufgabe 4: Elektrische und Magnetische Felder]]
- [[#Aufgabe 5: Impedanzen]]
- [[#Aufgabe 6: Zeitabhängige Ströme]]

---

### Aufgabe 1: Umzug eines Servers

> [!info] Aufgabenstellung
> Über ein kräftiges Holzbrett soll eine Kiste aus Stahl mit Computertechnik auf einen LKW gezogen werden. Das Brett ist 4 m lang, die LKW-Pritsche befindet sich 1,0 m über dem Erdboden. Die Kiste hat eine Masse von 60 kg.
>
> Die Gleitreibungszahl zwischen Holz und Stahl sei 0,5, die Haftreibungszahl 0,6.
>
> a) Geben Sie die Hangabtriebskraft und die Normalkraft an, die auf einen Körper der Masse $m$ auf einer schiefen Ebene mit einem Neigungswinkel $\alpha$ wirkt.
>
> b) Berechnen Sie die Kraft, die notwendig ist, um die Kiste mit gleichförmiger Geschwindigkeit das Brett hinaufzuziehen.
>
> c) Überprüfen Sie mit einer Rechnung, ob die Kiste wieder herunterrutschen würde, wenn das Seil losgelassen wird.
>
> d) Berechnen Sie die Höhe der LKW-Pritsche, bei der die Kiste nach dem Loslassen gerade noch stehen bleiben würde.

**a) Allgemeine Formeln für Hangabtriebskraft und Normalkraft**

Auf der schiefen Ebene wird die Gewichtskraft $F_G=m\cdot g$ in eine Komponente entlang der Ebene (Hangabtrieb) und eine Komponente senkrecht zur Ebene (Normalkraft) zerlegt:

$$
\begin{align*}
F_H &= F_G \cdot \sin(\alpha) = m \cdot g \cdot \sin(\alpha) \\
F_N &= F_G \cdot \cos(\alpha) = m \cdot g \cdot \cos(\alpha)
\end{align*}
$$

**b) Kraft zum gleichförmigen Hinaufziehen**

Neigungswinkel aus Brettlänge $l=4$ m und Pritschenhöhe $h=1$ m: $\alpha=\arcsin(h/l)$. Bei gleichförmiger Bewegung ($a=0$) muss die Zugkraft Hangabtrieb **und** Gleitreibung überwinden: $F = F_H + F_{RG}$.

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Masse | `m` | `60` kg |
| | Brettlänge | `l` | `4` m |
| | Pritschenhöhe | `h` | `1` m |
| | Gleitreibungszahl | `muG` | `0.5` |
| Gesucht | Zugkraft | `F` | |

$$
\begin{align*}
\text{Gegeben:} \\
m &= 60 \text{ kg} \\
l &= 4 \text{ m}, \quad h = 1 \text{ m} \\
\mu_G &= 0.5 \\
\text{Weg:} \\
\alpha &= \arcsin\left(\frac{h}{l}\right) = \arcsin\left(\frac{1}{4}\right) = 14.48° \\
F_G &= m \cdot g = 60 \cdot 9.81 = 588.6 \text{ N} \\
F_H &= F_G \cdot \sin(\alpha) = 588.6 \cdot \sin(0.2527) = 147.2 \text{ N} \\
F_N &= F_G \cdot \cos(\alpha) = 588.6 \cdot \cos(0.2527) = 569.9 \text{ N} \\
F_{RG} &= \mu_G \cdot F_N = 0.5 \cdot 569.9 = 284.9 \text{ N} \\
F &= F_H + F_{RG} = 147.2 + 284.9 = 432.1 \text{ N} \\
\text{ERG:} \quad F &= 432.1 \text{ N}
\end{align*}
$$

Es ist eine Zugkraft von **ca. 432,1 N** notwendig.

**c) Prüfung: Rutscht die Kiste beim Loslassen zurück?**

Die Kiste rutscht von selbst zurück, wenn der Hangabtrieb die maximale Haftreibungskraft übersteigt, d. h. wenn $\tan(\alpha) > \mu_H$.

$$
\begin{align*}
\text{Gegeben:} \\
\alpha &= 14.48° \\
\mu_H &= 0.6 \\
\text{Weg:} \\
\tan(\alpha) &= \tan(14.48°) = 0.258 \\
\text{Vergleich:} \quad \tan(\alpha) &= 0.258 < \mu_H = 0.6 \\
\text{ERG:} \quad &\text{Haftreibung reicht aus} \Rightarrow \text{Kiste rutscht NICHT zurück}
\end{align*}
$$

Da $\tan(\alpha) = 0{,}258$ kleiner ist als $\mu_H = 0{,}6$, überwiegt die maximale Haftreibungskraft den Hangabtrieb — die Kiste bleibt bei $h = 1$ m auch ohne Seil liegen.

**d) Grenzhöhe der Pritsche**

Die Kiste rutscht gerade noch nicht, wenn Hangabtrieb und maximale Haftreibungskraft im Gleichgewicht sind: $\tan(\alpha_{krit}) = \mu_H$.

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Haftreibungszahl | `muH` | `0.6` |
| | Brettlänge | `l` | `4` m |
| Gesucht | Grenzhöhe | `h` | |

$$
\begin{align*}
\text{Gegeben:} \\
\mu_H &= 0.6 \\
l &= 4 \text{ m} \\
\text{Weg:} \\
\alpha_{krit} &= \arctan(\mu_H) = \arctan(0.6) = 30.96° \\
h &= l \cdot \sin(\alpha_{krit}) = 4 \cdot \sin(0.5404) = 2.058 \text{ m} \\
\text{ERG:} \quad h &= 2.058 \text{ m}
\end{align*}
$$

Die Kiste würde erst ab einer Pritschenhöhe von ca. **2,058 m** von selbst zu rutschen beginnen.

---

### Aufgabe 2: Drehbewegung von DVDs

> [!info] Aufgabenstellung
> Eine DVD habe einen Durchmesser von 12 cm, eine Dicke von 1,2 mm und eine Masse von 20 g. Die Rotationsgeschwindigkeit variiere zwischen 630 und 1530 Umdrehungen pro Minute. Die DVD soll kein Loch in der Mitte besitzen.
>
> a) Berechnen Sie die maximale Winkelgeschwindigkeit und die maximale Geschwindigkeit eines Punktes auf dem äußeren Rand.
>
> b) Die maximale Drehzahl werde vom Stillstand aus in 20 Sekunden erreicht. Berechnen Sie für den Fall einer gleichförmigen Winkelbeschleunigung die in dieser Zeit erreichte Anzahl an Umdrehungen.
>
> c) Berechnen Sie die Dichte der DVD, ihr Trägheitsmoment $J$ und ihre Rotationsenergie bei maximaler Drehzahl. Hinweis: Für das Trägheitsmoment eines Vollzylinders, der um seine Symmetrieachse rotiert, gilt: $J=\frac{1}{2}mr^2$.
>
> d) Für das Trägheitsmoment $J$ gilt allgemein: $J=\int_V r_\perp^2 \rho(\vec r)\,dV$.
>
> Bestätigen Sie durch Integration die Richtigkeit der Formel $J=\frac{1}{2}mr^2$. Hinweis: In Polarkoordinaten hat ein infinitesimales Flächenelement den Flächeninhalt $dr\cdot r\cdot d\varphi$.

**a) Maximale Winkelgeschwindigkeit und Randgeschwindigkeit**

Die maximale Drehzahl ist $n_{max}=1530$ 1/min $=25{,}5$ 1/s, der Radius $r=6$ cm $=0{,}06$ m.

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Maximale Drehzahl | `n` | `25.5` 1/s |
| Gesucht | Winkelgeschwindigkeit | `omega` | |

$$
\begin{align*}
\text{Gegeben:} \\
n &= 25.5 \text{ 1/s} \\
\text{Weg:} \\
\omega &= 2\pi n \\
&= 2\pi \cdot 25.5 \\
&= 160.2 \text{ rad/s} \\
\text{ERG:} \quad \omega &= 160.2 \text{ rad/s}
\end{align*}
$$

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Winkelgeschwindigkeit | `omega` | `160.2` rad/s |
| | Radius | `r` | `0.06` m |
| Gesucht | Geschwindigkeit | `v` | |

$$
\begin{align*}
\text{Gegeben:} \\
\omega &= 160.2 \text{ rad/s} \\
r &= 0.06 \text{ m} \\
\text{Weg:} \\
v &= \omega \cdot r \\
&= 160.2 \cdot 0.06 \\
&= 9.613 \text{ m/s} \\
\text{ERG:} \quad v &= 9.613 \text{ m/s}
\end{align*}
$$

Die maximale Winkelgeschwindigkeit beträgt **160,2 rad/s**, die maximale Randgeschwindigkeit **9,613 m/s**.

**b) Anzahl der Umdrehungen bei gleichförmiger Winkelbeschleunigung**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Winkelgeschwindigkeit (Ende) | `omega` | `160.2` rad/s |
| | Zeit | `t` | `20` s |
| Gesucht | Winkelbeschleunigung | `alphaW` | |

$$
\begin{align*}
\text{Gegeben:} \\
\omega &= 160.2 \text{ rad/s} \\
t &= 20 \text{ s} \\
\text{Weg:} \\
\alpha_W &= \frac{\omega}{t} \\
&= \frac{160.2}{20} \\
&= 8.011 \text{ rad/s}^2 \\
\text{ERG:} \quad \alpha_W &= 8.011 \text{ rad/s}^2
\end{align*}
$$

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Winkelbeschleunigung | `alphaW` | `8.011` rad/s² |
| | Zeit | `t` | `20` s |
| Gesucht | Drehwinkel | `phi` | |

$$
\begin{align*}
\text{Gegeben:} \\
\alpha_W &= 8.011 \text{ rad/s}^2 \\
t &= 20 \text{ s} \\
\text{Weg:} \\
\varphi &= 0.5 \cdot \alpha_W \cdot t^2 \\
&= 0.5 \cdot 8.011 \cdot 20^2 \\
&= 1602 \text{ rad} \\
N &= \frac{\varphi}{2\pi} \\
&= \frac{1602}{2\pi} \\
&= 255 \\
\text{ERG:} \quad N &= 255
\end{align*}
$$

In den 20 Sekunden werden **255 Umdrehungen** erreicht (Plausibilitätscheck: bei linearem Anstieg von 0 auf $n_{max}$ ist die mittlere Drehzahl $n_{max}/2 = 12{,}75$ 1/s, mal 20 s ergibt ebenfalls 255 — passt).

**c) Dichte, Trägheitsmoment, Rotationsenergie**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Fläche (Kreis, $r=0{,}06$ m) | `A` | `0.01131` m² |
| | Dicke | `lges` | `0.0012` m |
| Gesucht | Volumen | `V` | |

$$
\begin{align*}
\text{Gegeben:} \\
A &= \pi r^2 = 0.01131 \text{ m}^2 \\
d &= 0.0012 \text{ m} \\
\text{Weg:} \\
V &= A \cdot d \\
&= 0.01131 \cdot 0.0012 \\
&= 1.357 \times 10^{-5} \text{ m}^3 \\
\rho &= \frac{m}{V} \\
&= \frac{0.02}{1.357 \times 10^{-5}} \\
&= 1474 \text{ kg/m}^3 \\
\text{ERG:} \quad \rho &= 1474 \text{ kg/m}^3
\end{align*}
$$

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Masse | `m` | `0.02` kg |
| | Radius | `r` | `0.06` m |
| Gesucht | Trägheitsmoment | `J` | |

$$
\begin{align*}
\text{Gegeben:} \\
m &= 0.02 \text{ kg} \\
r &= 0.06 \text{ m} \\
\text{Weg:} \\
J &= \frac{1}{2} m r^2 \\
&= 0.5 \cdot 0.02 \cdot 0.06^2 \\
&= 3.6 \times 10^{-5} \text{ kg}\cdot\text{m}^2 \\
\text{ERG:} \quad J &= 3.6 \times 10^{-5} \text{ kg}\cdot\text{m}^2
\end{align*}
$$

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Trägheitsmoment | `J` | `3.6e-5` kg·m² |
| | Winkelgeschwindigkeit (max.) | `omega` | `160.2` rad/s |
| Gesucht | Rotationsenergie | `Erot` | |

$$
\begin{align*}
\text{Gegeben:} \\
J &= 3.6 \times 10^{-5} \text{ kg}\cdot\text{m}^2 \\
\omega &= 160.2 \text{ rad/s} \\
\text{Weg:} \\
E_{rot} &= \frac{1}{2} J \omega^2 \\
&= 0.5 \cdot 3.6 \times 10^{-5} \cdot 160.2^2 \\
&= 0.4621 \text{ J} \\
\text{ERG:} \quad E_{rot} &= 0.4621 \text{ J}
\end{align*}
$$

Ergebnisse: Dichte $\rho \approx$ **1474 kg/m³**, Trägheitsmoment $J =$ **3,6·10⁻⁵ kg·m²**, Rotationsenergie bei maximaler Drehzahl $E_{rot} \approx$ **0,4621 J**.

**d) Herleitung von $J=\frac{1}{2}mr^2$ durch Integration**

Für eine homogene Kreisscheibe (Dicke $d$, Radius $R$, konstante Dichte $\rho$) gilt in Polarkoordinaten $r_\perp = r$ (Abstand von der Symmetrieachse) und das Volumenelement $dV = d \cdot r\, dr\, d\varphi$:

$$
\begin{align*}
J &= \int_V r_\perp^2 \, \rho(\vec r)\, dV \\
&= \rho \, d \int_0^{2\pi}\!\int_0^{R} r^2 \cdot r \, dr \, d\varphi \\
&= \rho \, d \int_0^{2\pi} d\varphi \int_0^{R} r^3\, dr \\
&= \rho \, d \cdot 2\pi \cdot \left[\frac{r^4}{4}\right]_0^{R} \\
&= \rho \, d \cdot 2\pi \cdot \frac{R^4}{4} \\
&= \frac{\pi \rho \, d\, R^4}{2}
\end{align*}
$$

Mit der Gesamtmasse $m = \rho \cdot V = \rho \cdot \pi R^2 d$ folgt $\rho \, d = \dfrac{m}{\pi R^2}$, eingesetzt:

$$
J = \frac{\pi R^4}{2} \cdot \frac{m}{\pi R^2} = \frac{1}{2} m R^2
$$

Damit ist $J=\frac{1}{2}mr^2$ für den homogenen Vollzylinder (bzw. die Kreisscheibe) durch Integration bestätigt. $\blacksquare$

---

### Aufgabe 3: Roboter-Aufprallschutz

> [!info] Aufgabenstellung
> Ein Haushaltsroboter mit der Masse $m=50$ kg soll eine Art „Knautschzone" besitzen, um Zusammenstöße mit Hindernissen bei Versagen der Elektronik zu dämpfen. Die Knautschzone besteht aus mechanischen Federn, die dem Hooke'schen Gesetz gehorchen, mit der Länge $l=20$ cm und der Federhärte $D$. Die Maximalgeschwindigkeit des Roboters beträgt $v_{max}=1{,}5\,\frac{m}{s}$.
>
> a) Berechnen Sie unter Verwendung der Gleichung für die Federspannenergie die notwendige Federhärte $D$, wenn die Feder maximal 10 cm eingedrückt werden soll.
>
> b) Stellen Sie die Differentialgleichung auf, die den Zusammenstoß mit der Wand beschreibt, und zeigen Sie, dass die folgende Gleichung eine Lösung der Differentialgleichung darstellt (gültig ab Berührung der Wand, $x(t)$ gibt dann den Abstand zur Wand bzw. die Länge der Feder an):
> $$x(t)=l-v_{max}\sqrt{\frac{m}{D}}\sin\!\left(\sqrt{\frac{D}{m}}\,t\right)$$
>
> c) Berechnen Sie unter Verwendung der Gleichung aus Teil b) die maximal auftretende Verzögerung (Bremsbeschleunigung).
>
> d) Skizzieren Sie die Funktionen $x(t), \dot x(t)$ und $\ddot x(t)$.

**a) Federhärte D**

Beim Aufprall wird die gesamte kinetische Energie des Roboters in Federspannenergie umgewandelt (Energieerhaltung, $E_{kin}=E_{sp}$):

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Masse | `m` | `50` kg |
| | Maximalgeschwindigkeit | `v` | `1.5` m/s |
| Gesucht | Kinetische Energie | `Ekin` | |

$$
\begin{align*}
\text{Gegeben:} \\
m &= 50 \text{ kg} \\
v_{max} &= 1.5 \text{ m/s} \\
\text{Weg:} \\
E_{kin} &= \frac{1}{2} m v_{max}^2 \\
&= 0.5 \cdot 50 \cdot 1.5^2 \\
&= 56.25 \text{ J} \\
\text{ERG:} \quad E_{kin} &= 56.25 \text{ J}
\end{align*}
$$

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Federenergie ($=E_{kin}$) | `Esp` | `56.25` J |
| | maximale Eindrückung | `x` | `0.1` m |
| Gesucht | Federkonstante | `D` | |

$$
\begin{align*}
\text{Gegeben:} \\
E_{sp} &= 56.25 \text{ J} \\
x &= 0.1 \text{ m} \\
\text{Weg:} \\
D &= \frac{2 E_{sp}}{x^2} \\
&= \frac{2 \cdot 56.25}{0.1^2} \\
&= 11250 \text{ N/m} \\
\text{ERG:} \quad D &= 11250 \text{ N/m}
\end{align*}
$$

Die notwendige Federhärte beträgt $D=$ **11.250 N/m**.

**b) Differentialgleichung und Lösungsnachweis**

Ab Berührung der Wand wirkt auf den Roboter nur noch die rücktreibende Federkraft $F_{sp}=-D\cdot u$, wobei $u=l-x(t)$ die Eindrückung der Feder (Auslenkung aus der ungedehnten Länge $l$) ist. Mit Newton II ($F=m\ddot u$, und $\ddot u = -\ddot x$, da $l$ konstant) folgt die Bewegungsgleichung für $x(t)$:

$$
m\ddot x(t) = -D\big(l-x(t)\big) \quad\Leftrightarrow\quad \ddot x(t) + \frac{D}{m}x(t) = \frac{D}{m}l
$$

Dies ist die Differentialgleichung eines harmonischen Oszillators um die Ruhelage $x=l$. Mit der Substitution $\omega_0=\sqrt{D/m}$ lautet sie:

$$\ddot x(t) + \omega_0^2 x(t) = \omega_0^2 l$$

**Lösungsnachweis** durch Einsetzen von $x(t)=l-v_{max}\sqrt{\tfrac{m}{D}}\sin(\omega_0 t)$ mit $\omega_0=\sqrt{D/m}$:

$$
\begin{align*}
\dot x(t) &= -v_{max}\sqrt{\frac{m}{D}}\cdot\omega_0\cos(\omega_0 t) = -v_{max}\cos(\omega_0 t) \quad \left(\text{da } \sqrt{\tfrac{m}{D}}\cdot\omega_0 = \sqrt{\tfrac{m}{D}}\cdot\sqrt{\tfrac{D}{m}}=1\right)\\
\ddot x(t) &= v_{max}\,\omega_0\sin(\omega_0 t)
\end{align*}
$$

Einsetzen in die linke Seite der DGL:

$$
\begin{align*}
\ddot x(t) + \omega_0^2 x(t) &= v_{max}\omega_0\sin(\omega_0 t) + \omega_0^2\left(l - v_{max}\sqrt{\frac{m}{D}}\sin(\omega_0 t)\right) \\
&= v_{max}\omega_0\sin(\omega_0 t) + \omega_0^2 l - \omega_0^2 v_{max}\sqrt{\frac{m}{D}}\sin(\omega_0 t)
\end{align*}
$$

Da $\omega_0^2\sqrt{m/D} = \frac{D}{m}\sqrt{\frac{m}{D}} = \sqrt{\frac{D}{m}} = \omega_0$, kürzt sich der Sinus-Term genau weg:

$$
= v_{max}\omega_0\sin(\omega_0 t) + \omega_0^2 l - v_{max}\omega_0\sin(\omega_0 t) = \omega_0^2 l
$$

Das entspricht genau der rechten Seite der DGL — die Lösung ist bestätigt. Auch die Anfangsbedingungen passen: $x(0)=l$ (Feder noch ungedehnt) und $\dot x(0)=-v_{max}$ (Roboter trifft mit $v_{max}$ auf die Wand). $\blacksquare$

**c) Maximale Verzögerung**

Aus $\ddot x(t) = v_{max}\,\omega_0\sin(\omega_0 t)$ folgt die maximale Beschleunigung (Betrag) für $\sin(\omega_0 t)=1$:

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Federkonstante | `D` | `11250` N/m |
| | Masse | `m` | `50` kg |
| Gesucht | Eigenkreisfrequenz | `omega0` | |

$$
\begin{align*}
\text{Gegeben:} \\
D &= 11250 \text{ N/m} \\
m &= 50 \text{ kg} \\
\text{Weg:} \\
\omega_0 &= \sqrt{\frac{D}{m}} \\
&= \sqrt{\frac{11250}{50}} \\
&= 15 \text{ rad/s} \\
a_{max} &= v_{max} \cdot \omega_0 \\
&= 1.5 \cdot 15 \\
&= 22.5 \text{ m/s}^2 \\
\text{ERG:} \quad a_{max} &= 22.5 \text{ m/s}^2
\end{align*}
$$

Die maximale Verzögerung beträgt **22,5 m/s²** (ca. 2,3-fache Erdbeschleunigung), sie tritt zum Zeitpunkt der maximalen Eindrückung auf ($\omega_0 t = \pi/2$).

**d) Skizze der Funktionen**

Für $t\in[0,\pi/\omega_0]$ (eine Halbschwingung, danach löst sich der Roboter wieder von der Feder ab, sobald $x(t)=l$ erneut erreicht ist):

- $x(t) = l - v_{max}\sqrt{m/D}\sin(\omega_0 t)$: startet bei $x(0)=l=0{,}2$ m, fällt sinusförmig ab bis zum Minimum $x_{min}=l-v_{max}\sqrt{m/D}=0{,}2-0{,}1=0{,}1$ m bei $\omega_0 t=\pi/2$, steigt danach wieder bis $x=l$ bei $\omega_0 t=\pi$ an (die Feder ist dann wieder entspannt, der Roboter löst sich ab).
- $\dot x(t) = -v_{max}\cos(\omega_0 t)$: startet bei $\dot x(0)=-v_{max}=-1{,}5$ m/s (Aufprallgeschwindigkeit, negativ = Richtung Wand), durchläuft bei $\omega_0 t=\pi/2$ den Nulldurchgang (Umkehrpunkt, Feder maximal eingedrückt) und erreicht bei $\omega_0 t=\pi$ den Wert $+v_{max}=1{,}5$ m/s (Roboter bewegt sich mit unverändertem Betrag der Geschwindigkeit von der Wand weg — elastischer Stoß, keine Energieverluste).
- $\ddot x(t) = v_{max}\omega_0\sin(\omega_0 t)$: startet bei $\ddot x(0)=0$, steigt auf das Maximum $a_{max}=22{,}5$ m/s² bei $\omega_0 t=\pi/2$ (Punkt der stärksten Abbremsung, deckungsgleich mit dem Minimum von $x(t)$) und fällt danach wieder auf 0 bei $\omega_0 t=\pi$.

Alle drei Kurven sind Sinus-/Cosinus-Halbwellen mit gleicher Periode $2\pi/\omega_0$, phasenverschoben um jeweils $\pi/2$ zueinander ($x$ und $\ddot x$ sind um $\pi$ phasenverschoben zueinander, $\dot x$ liegt dazwischen).

---

### Aufgabe 4: Elektrische und Magnetische Felder

> [!info] Aufgabenstellung
> a) Ein Elektron fliegt mit einer Geschwindigkeit von $6\cdot10^6$ m/s durch je ein Loch in einem Plattenkondensator hinein und verlangsamt heraus. Die angelegte Spannung beträgt 70V, der Plattenabstand 10 cm. Berechnen Sie, um welchen Betrag sich die kinetische Energie des Elektrons verringert hat und mit welcher Geschwindigkeit das Elektron den Plattenkondensator verlässt.
>
> Die Masse des Elektrons beträgt $m_e=9{,}1\cdot10^{-31}$ kg, die Ladung $q_e=-1{,}6\cdot10^{-19}$ C.
>
> b) Mit einem Massenspektrometer können Substanzen, die in der Gasphase vorliegen, unterschieden und erkannt werden. Die Geräte beruhen darauf, dass sich bewegende geladene Teilchen je nach Masse in einem Magnetfeld unterschiedlich stark abgelenkt werden. Für ein Natrium-Ion ergibt sich eine halbkreisförmige Bahn mit einem Radius von 4 cm. Die Geschwindigkeit der Natrium-Ionen beträgt $10^5$ m/s; das Magnetfeld hat die Stärke $B=600$ mT und soll immer senkrecht zur Bewegungsrichtung orientiert sein.
>
> Berechnen Sie die Masse des Natrium-Ions (diesem fehlt ein Elektron, wodurch es einfach positiv geladen ist aber kaum an Masse verliert). Zum Vergleich: Die Masse eines Protons beträgt $1{,}66\cdot10^{-27}$ kg. Hinweis: Welche Kraft hält ein Ion auf einer Kreisbahn?
>
> c) Eine Leiterschleife umschließt die Fläche $A=50\text{ cm}^2$ und steht senkrecht zu einem Magnetfeld mit $B=200$mT. Berechnen Sie die Spannung, die induziert wird, wenn man die Schleife innerhalb von 0,1 s auf $A=5\text{ cm}^2$ zusammendrückt.

**a) Energieverlust und Austrittsgeschwindigkeit des Elektrons**

Das Elektron wird abgebremst; die Verzögerungsspannung entzieht ihm Energie $\Delta E_{kin}=q_e\cdot U$ (Betrag $|q_e|\cdot U$):

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Elementarladung | `Q` | `1.6e-19` C |
| | Spannung | `U` | `70` V |
| Gesucht | Energieänderung | `W` | |

$$
\begin{align*}
\text{Gegeben:} \\
q_e &= 1.6\times10^{-19} \text{ C (Betrag)} \\
U &= 70 \text{ V} \\
\text{Weg:} \\
\Delta E_{kin} &= q_e \cdot U \\
&= 1.6\times10^{-19} \cdot 70 \\
&= 1.12\times10^{-17} \text{ J} \\
\text{ERG:} \quad \Delta E_{kin} &= 1.12\times10^{-17} \text{ J}
\end{align*}
$$

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Masse Elektron | `m` | `9.1e-31` kg |
| | Eintrittsgeschwindigkeit | `v` | `6e6` m/s |
| Gesucht | kin. Energie (Eintritt) | `Ekin` | |

$$
\begin{align*}
\text{Gegeben:} \\
m_e &= 9.1\times10^{-31} \text{ kg} \\
v_0 &= 6\times10^{6} \text{ m/s} \\
\text{Weg:} \\
E_{kin,0} &= \frac{1}{2}m_e v_0^2 \\
&= 0.5 \cdot 9.1\times10^{-31} \cdot (6\times10^{6})^2 \\
&= 1.638\times10^{-17} \text{ J} \\
E_{kin,1} &= E_{kin,0} - \Delta E_{kin} \\
&= 1.638\times10^{-17} - 1.12\times10^{-17} \\
&= 5.18\times10^{-18} \text{ J} \\
v_1 &= \sqrt{\frac{2E_{kin,1}}{m_e}} \\
&= \sqrt{\frac{2\cdot 5.18\times10^{-18}}{9.1\times10^{-31}}} \\
&= 3.374\times10^{6} \text{ m/s} \\
\text{ERG:} \quad v_1 &= 3.374\times10^{6} \text{ m/s}
\end{align*}
$$

Die kinetische Energie verringert sich um **1,12·10⁻¹⁷ J**, das Elektron verlässt den Kondensator mit einer Geschwindigkeit von **3,374·10⁶ m/s**.

**b) Masse des Natrium-Ions**

Im Magnetfeld hält die Lorentzkraft das Ion auf der Kreisbahn — sie wirkt als Zentripetalkraft: $qvB = \dfrac{mv^2}{r} \;\Rightarrow\; m=\dfrac{qBr}{v}$.

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Elementarladung | `q` | `1.6e-19` C |
| | Magnetfeld | `B` | `0.6` T |
| | Bahnradius | `r` | `0.04` m |
| | Geschwindigkeit | `v` | `1e5` m/s |
| Gesucht | Masse Na-Ion | `m` | |

$$
\begin{align*}
\text{Gegeben:} \\
q &= 1.6\times10^{-19} \text{ C} \\
B &= 0.6 \text{ T} \\
r &= 0.04 \text{ m} \\
v &= 1\times10^{5} \text{ m/s} \\
\text{Weg:} \\
m &= \frac{q\cdot B \cdot r}{v} \\
&= \frac{1.6\times10^{-19}\cdot 0.6\cdot 0.04}{1\times10^{5}} \\
&= 3.84\times10^{-26} \text{ kg} \\
\text{ERG:} \quad m &= 3.84\times10^{-26} \text{ kg}
\end{align*}
$$

Vergleich mit der Protonenmasse: $m/m_p = 3.84\times10^{-26}/1.66\times10^{-27} \approx 23{,}1$. Das passt sehr gut zur Massenzahl von Natrium ($^{23}$Na) und bestätigt das Ergebnis.

**c) Induzierte Spannung durch Flächenänderung**

Die induzierte Spannung ergibt sich aus der Änderung des magnetischen Flusses $\Phi=B\cdot A$ über die Zeit: $U_{ind}=-\dfrac{\Delta \Phi}{\Delta t}$.

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Magnetfeld | `B` | `0.2` T |
| | Anfangsfläche | `A` | `0.005` m² |
| Gesucht | Fluss (Anfang) | `Phi` | |

$$
\begin{align*}
\text{Gegeben:} \\
B &= 0.2 \text{ T} \\
A_1 &= 0.005 \text{ m}^2 \\
\text{Weg:} \\
\Phi_1 &= B\cdot A_1 \\
&= 0.2 \cdot 0.005 \\
&= 1\times10^{-3} \text{ Wb} \\
\text{ERG:} \quad \Phi_1 &= 1\times10^{-3} \text{ Wb}
\end{align*}
$$

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Magnetfeld | `B` | `0.2` T |
| | Endfläche | `A` | `0.0005` m² |
| Gesucht | Fluss (Ende) | `Phi` | |

$$
\begin{align*}
\text{Gegeben:} \\
B &= 0.2 \text{ T} \\
A_2 &= 0.0005 \text{ m}^2 \\
\text{Weg:} \\
\Phi_2 &= B\cdot A_2 \\
&= 0.2 \cdot 0.0005 \\
&= 1\times10^{-4} \text{ Wb} \\
\text{ERG:} \quad \Phi_2 &= 1\times10^{-4} \text{ Wb}
\end{align*}
$$

$$
\begin{align*}
\text{Weg (Induktionsgesetz):} \\
\Delta\Phi &= \Phi_2-\Phi_1 = 1\times10^{-4}-1\times10^{-3} = -9\times10^{-4} \text{ Wb} \\
U_{ind} &= -\frac{\Delta\Phi}{\Delta t} = -\frac{-9\times10^{-4}}{0.1} \\
&= 9\times10^{-3} \text{ V} \\
\text{ERG:} \quad U_{ind} &= 9\times10^{-3} \text{ V} = 9 \text{ mV}
\end{align*}
$$

Beim Zusammendrücken der Schleife wird eine Spannung von **9 mV** induziert.

---

### Aufgabe 5: Impedanzen

> [!info] Aufgabenstellung
> Es ist die folgende Schaltung gegeben: Eine Wechselstromquelle ($f=50$ Hz) treibt einen Stromkreis mit einem Widerstand $R_1=100\,\Omega$ in Reihe mit einer Induktivität $L=50$ mH; danach folgt eine Parallelschaltung aus einem Widerstand $R_2=100\,\Omega$ und einem Kondensator $C=0{,}4\,\mu$F, die zur Quelle zurückführt.
>
> a) Berechnen Sie die Ersatzimpedanz für beliebige Werte $R_1, R_2, C$ und $L$. Gesucht ist der Real- und Imaginärteil der Impedanz.
>
> b) Führen Sie eine Grenzwertbetrachtung durch und geben Sie die Impedanzen für $\omega\to0$ und $\omega\to\infty$ durch.
>
> c) Berechnen Sie die Impedanz für die angegebenen Werte.

**a) Allgemeine Ersatzimpedanz**

Die Schaltung besteht aus $R_1$ in Reihe mit $L$, gefolgt von der Parallelschaltung $R_2\parallel C$. Mit $Z_L=j\omega L$ und $Z_C=\dfrac{1}{j\omega C}$ ergibt sich für den Parallelzweig:

$$
Z_2 = \frac{R_2\cdot Z_C}{R_2+Z_C} = \frac{R_2\cdot\frac{1}{j\omega C}}{R_2+\frac{1}{j\omega C}} = \frac{R_2}{1+j\omega R_2 C}
$$

Erweitern mit dem konjugiert Komplexen des Nenners liefert Real- und Imaginärteil:

$$
Z_2 = \frac{R_2(1-j\omega R_2 C)}{1+(\omega R_2 C)^2} = \underbrace{\frac{R_2}{1+(\omega R_2 C)^2}}_{\text{Re}(Z_2)} - j\underbrace{\frac{\omega R_2^2 C}{1+(\omega R_2 C)^2}}_{-\text{Im}(Z_2)}
$$

Die Gesamtimpedanz ist $Z=R_1+j\omega L+Z_2$:

$$
\boxed{Z = \underbrace{R_1+\frac{R_2}{1+(\omega R_2 C)^2}}_{\text{Re}(Z)} + j\underbrace{\left(\omega L-\frac{\omega R_2^2 C}{1+(\omega R_2 C)^2}\right)}_{\text{Im}(Z)}}
$$

**b) Grenzwertbetrachtung**

**Für $\omega\to0$:** Der Term $(\omega R_2 C)^2\to0$, also:

$$
\text{Re}(Z)\to R_1+R_2, \qquad \text{Im}(Z)\to 0 \qquad\Rightarrow\qquad Z\to R_1+R_2
$$

Anschaulich: Bei sehr niedriger Frequenz sperrt der Kondensator praktisch (unendlich hoher Widerstand $Z_C\to\infty$), der gesamte Strom fließt durch $R_2$; die Spule wirkt wie ein Kurzschluss ($Z_L\to0$). Es bleibt die reine Reihenschaltung $R_1+R_2$.

**Für $\omega\to\infty$:** Es gilt $(\omega R_2 C)^2\to\infty$, damit geht $\text{Re}(Z_2)\to0$ und $\text{Im}(Z_2)=-\dfrac{\omega R_2^2C}{1+(\omega R_2C)^2}\to-\dfrac{1}{\omega C}\to0$ (Nenner wächst quadratisch, Zähler nur linear in $\omega$). Gleichzeitig wächst $\omega L$ unbegrenzt:

$$
\text{Re}(Z)\to R_1, \qquad \text{Im}(Z)\to\omega L\to\infty \qquad\Rightarrow\qquad Z\to R_1+j\omega L
$$

Anschaulich: Bei sehr hoher Frequenz wird der Kondensator zum Kurzschluss ($Z_C\to0$) und überbrückt $R_2$ vollständig; die Spule wird zum (theoretisch unendlich großen) Sperrwiderstand. Es bleibt $Z\to R_1+j\omega L$, dominiert von der Induktivität.

**c) Zahlenwerte einsetzen**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Widerstand 1 | `R1` | `100` Ω |
| | Widerstand 2 | `R2` | `100` Ω |
| | Induktivität | `L` | `50` mH |
| | Kapazität | `C` | `0.4` µF |
| | Frequenz | `f` | `50` Hz |
| Gesucht | Impedanz (Re, Im) | `Z` | |

$$
\begin{align*}
\text{Gegeben:} \\
R_1 &= 100\ \Omega, \quad R_2 = 100\ \Omega \\
L &= 0.05 \text{ H}, \quad C = 0.4\times10^{-6} \text{ F} \\
f &= 50 \text{ Hz} \\
\text{Weg:} \\
\omega &= 2\pi f = 2\pi\cdot 50 = 314.2 \text{ rad/s} \\
\omega L &= 314.2 \cdot 0.05 = 15.71\ \Omega \\
\omega R_2 C &= 314.2\cdot 100\cdot 0.4\times10^{-6} = 0.01257 \\
(\omega R_2 C)^2 &= 1.579\times10^{-4} \\
\text{Re}(Z_2) &= \frac{100}{1+1.579\times10^{-4}} = 99.98\ \Omega \\
\text{Im}(Z_2) &= -\frac{314.2\cdot 100^2\cdot 0.4\times10^{-6}}{1+1.579\times10^{-4}} = -1.256\ \Omega \\
\text{Re}(Z) &= R_1+\text{Re}(Z_2) = 100+99.98 = 199.98\ \Omega \\
\text{Im}(Z) &= \omega L + \text{Im}(Z_2) = 15.71-1.256 = 14.45\ \Omega \\
|Z| &= \sqrt{\text{Re}(Z)^2+\text{Im}(Z)^2} = \sqrt{199.98^2+14.45^2} = 200.5\ \Omega \\
\varphi &= \arctan\!\left(\frac{14.45}{199.98}\right) = 4.133° \\
\text{ERG:} \quad Z &= (199.98 + j\,14.45)\ \Omega, \quad |Z|\approx200.5\ \Omega,\ \varphi\approx4.13°
\end{align*}
$$

Die Ersatzimpedanz beträgt $Z\approx(200{,}0+j\,14{,}45)\,\Omega$, also näherungsweise **200,5 Ω** bei einem Phasenwinkel von ca. **4,13°** (überwiegend ohmsch, leicht induktiv).

---

### Aufgabe 6: Zeitabhängige Ströme

> [!info] Aufgabenstellung
> Ein geladener Kondensator mit der Kapazität $C=1$ mF und einer anfänglichen Spannung von $U_C(0)=5$V wird über einen Widerstand $R=100\,\Omega$ entladen.
>
> a) Stellen Sie für die im Kondensator gespeicherte Ladung eine Differentialgleichung auf und zeigen Sie, dass $Q(t)=Q_0\cdot e^{-\frac{1}{RC}t}$ eine Lösung dieser Gleichung darstellt.
>
> b) Skizzieren Sie die Funktion $Q(t)$. Kennzeichnen Sie besonders den Wert für $t=RC$.

**a) Differentialgleichung und Lösungsnachweis**

Beim Entladevorgang gilt die Maschenregel: die Kondensatorspannung $U_C=Q/C$ treibt den Strom durch den Widerstand, $U_C=I\cdot R$. Der Entladestrom entspricht der Abnahme der gespeicherten Ladung, $I=-\dot Q$ (negatives Vorzeichen, da $Q$ abnimmt):

$$
\frac{Q(t)}{C} = -\dot Q(t)\cdot R \quad\Longleftrightarrow\quad \dot Q(t) + \frac{1}{RC}Q(t) = 0
$$

Dies ist eine homogene lineare Differentialgleichung 1. Ordnung mit der Zeitkonstante $\tau=RC$.

**Lösungsnachweis** durch Einsetzen von $Q(t)=Q_0\cdot e^{-\frac{1}{RC}t}$:

$$
\dot Q(t) = Q_0\cdot\left(-\frac{1}{RC}\right)e^{-\frac{1}{RC}t} = -\frac{1}{RC}Q(t)
$$

Eingesetzt in die DGL:

$$
\dot Q(t)+\frac{1}{RC}Q(t) = -\frac{1}{RC}Q(t)+\frac{1}{RC}Q(t) = 0 \quad\checkmark
$$

Die Gleichung ist für alle $t$ erfüllt — die Lösung ist bestätigt. Die Anfangsbedingung $Q(0)=Q_0$ ist ebenfalls automatisch erfüllt, wobei $Q_0=C\cdot U_C(0)$ die Anfangsladung ist:

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Kapazität | `C` | `1` mF |
| | Anfangsspannung | `U` | `5` V |
| Gesucht | Anfangsladung | `Q` | |

$$
\begin{align*}
\text{Gegeben:} \\
C &= 1\times10^{-3} \text{ F} \\
U_C(0) &= 5 \text{ V} \\
\text{Weg:} \\
Q_0 &= C\cdot U_C(0) \\
&= 1\times10^{-3}\cdot 5 \\
&= 5\times10^{-3} \text{ C} \\
\text{ERG:} \quad Q_0 &= 5\times10^{-3} \text{ C} = 5 \text{ mC}
\end{align*}
$$

Die Zeitkonstante beträgt $\tau=RC=100\cdot1\times10^{-3}=0{,}1$ s.

**b) Skizze von Q(t)**

$Q(t)=Q_0 e^{-t/\tau}$ ist eine fallende Exponentialfunktion, die bei $t=0$ beim Wert $Q_0=5$ mC beginnt und asymptotisch gegen 0 strebt (der Kondensator entlädt sich vollständig, aber theoretisch nie exakt auf 0).

Besonderer Punkt bei $t=RC=\tau=0{,}1$ s: Dort ist

$$
Q(\tau) = Q_0\cdot e^{-1} = 5\text{ mC}\cdot 0.3679 \approx 1.839 \text{ mC}
$$

d. h. nach einer Zeitkonstante ist die Ladung auf ca. **36,79 %** des Anfangswerts abgefallen (charakteristischer Punkt jeder Exponentialentladung — die Tangente an $Q(t)$ bei $t=0$ schneidet die $t$-Achse ebenfalls genau bei $t=\tau$).
