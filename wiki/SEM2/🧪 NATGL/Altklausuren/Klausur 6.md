---
tags:
  - sem2
  - natgl
type: exam
---
# Klausur 6 — Altklausur

> [!info] Kontext
> Nat.-Gl.-Prüfung 2019 (Naturwissenschaftliche Grundlagen). Themenbereiche: Sensorik/Akustik (Beschleunigungssensor, Elektretmikrofon), Powerbank-Kapazität, Resonanz, Rotationsbewegung (Töpferscheibe), Optik (reelles/virtuelles Bild, Abbildungsgleichung), Elektrotechnik (spez. Widerstand, Widerstandsnetzwerk). Gescannt am 10.11.2021 aus einer Musterklausur von 2019.

## Inhaltsverzeichnis

- [[#Aufgabe 1: Sensoren, Powerbank und Resonanz]]
- [[#Aufgabe 2: Töpferscheibe (Rotation)]]
- [[#Aufgabe 3: Optik — reelles/virtuelles Bild und Abbildungsgleichung]]
- [[#Aufgabe 4: Elektrotechnik — Messingdraht und Widerstandsnetzwerk]]

---

### Aufgabe 1: Sensoren, Powerbank und Resonanz

> [!info] Aufgabenstellung
> a) Erläutern Sie das Funktionsprinzip von Beschleunigungssensoren in Smartphones anhand einer Skizze. (3P)
>
> b) Erläutern Sie das Funktionsprinzip eines Elektretmikrofons anhand einer Skizze. (3P)
>
> c) In der Beschreibung der Powerbank Energy Master finden Sie die Angabe 22.000 mAh. Berechnen Sie, wie lange Sie ihr Tablet mit P = 10 W mit einer vollständig geladenen Powerbank betreiben können. Der Anschluss erfolgt über ein USB-Kabel (5 V Spannung). (4P)
>
> d) Erläutern Sie die folgende Abbildung, die das Resonanz-Phänomen beschreibt. Dabei sind die folgenden Punkte zu berücksichtigen (6P):
> - Ob die auf der y-Achse aufgetragene Größe eine Einheit besitzt, und falls ja, welche; Bedeutung des Wertes 1 (I)
> - Ob die auf der x-Achse aufgetragene Größe eine Einheit besitzt, und falls ja, welche
>   - Bedeutung des Parameters D (II)
>   - Bedeutung des Maximums (wenn vorhanden)

**a) Beschleunigungssensor (kapazitives Funktionsprinzip)**

Ein kapazitiver Beschleunigungssensor (MEMS) besteht aus einer seismischen Masse (bewegliche Platte), die über eine Spiralfeder zwischen zwei feststehenden Platten aufgehängt ist. Dadurch entstehen zwei Kondensatoren $C_1$ und $C_2$ (bewegliche Platte jeweils eine gemeinsame Elektrode, feste Platten die zweiten Elektroden).

- Solange keine Beschleunigung wirkt, befindet sich die bewegliche Platte in ihrer Ruhelage genau in der Mitte, sodass beide Abstände gleich groß sind: $C_1 = C_2$.
- Wirkt eine Beschleunigung, bleibt die seismische Masse aufgrund ihrer Trägheit gegenüber dem Gehäuse zunächst zurück (relativ zum Gehäuse verschiebt sie sich in Gegenrichtung zur Beschleunigung). Dadurch verändert sich der Plattenabstand zu den beiden Festelektroden ungleich: Ein Abstand wird kleiner, der andere größer, sodass $C_1 \neq C_2$ gilt (je nach Richtung $C_1 > C_2$ oder $C_1 < C_2$).
- Aus der Kapazitätsdifferenz $\Delta C = C_1 - C_2$ lässt sich über eine Auswerteschaltung die Auslenkung der Feder und daraus (bei bekannter Federkonstante $D$ und Masse $m$) die wirkende Beschleunigung $a = \frac{D \cdot \Delta s}{m}$ bestimmen.

Skizze (Prosa-Beschreibung): Zwei feste, parallele Platten links und rechts, zwischen ihnen eine bewegliche, über eine Spiralfeder aufgehängte Platte. Mit den festen Platten bildet die bewegliche Platte zwei Plattenkondensatoren $C_1$ (links) und $C_2$ (rechts). Bei Beschleunigung nach rechts verschiebt sich die bewegliche Platte relativ nach links, wodurch sich der Abstand zur linken Platte verkleinert ($C_1$ steigt) und der Abstand zur rechten Platte vergrößert ($C_2$ sinkt).

**b) Elektretmikrofon (Funktionsprinzip)**

Ein Elektretmikrofon besteht aus einer dauerhaft (permanent) elektrisch geladenen Membran (dem Elektret) und einer dahinter angeordneten, feststehenden Gegenelektrode. Membran und Gegenelektrode bilden zusammen einen Plattenkondensator mit fester Ladung $Q$.

- Trifft eine Schallwelle (Luftdruckschwankung) auf die Membran, wird diese zu Schwingungen angeregt und ihr Abstand zur Gegenelektrode ändert sich periodisch ($\Delta d$).
- Da die Ladung $Q$ auf dem Elektret konstant bleibt, während sich die Kapazität $C = \varepsilon_0 \varepsilon_r \frac{A}{d}$ durch die Abstandsänderung ändert, ändert sich wegen $U = \frac{Q}{C}$ auch die Spannung zwischen Membran und Gegenelektrode.
- Diese Spannungsänderung $\Delta U$ wird als elektrisches Ausgangssignal (nach Verstärkung durch einen im Mikrofon integrierten Impedanzwandler/FET) abgegriffen und bildet das analoge Abbild des Schallsignals.

Skizze (Prosa-Beschreibung): Von links treffen Schallwellen auf eine dünne, dauerhaft geladene Membran (das Elektret). Dahinter befindet sich in geringem Abstand $d$ eine feste Gegenelektrode. Membran und Gegenelektrode sind über einen Draht mit einer Kapazitätsänderungs-Auswerteschaltung verbunden, die die Spannungsänderung $\Delta U$ ausgibt.

**c) Betriebsdauer der Powerbank**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Ladungsmenge (Kapazität) | `Q` | `22` Ah (= 22.000 mAh) |
| | Leistung | `P` | `10` W |
| | Spannung | `U` | `5` V |
| Gesucht | Betriebsdauer | `t` | |

$$
\begin{align*}
\text{Gegeben:} \\
Q &= 22 \text{ Ah} \\
P &= 10 \text{ W} \\
U &= 5 \text{ V} \\
\text{Weg:} \\
I &= \frac{P}{U} \\
&= \frac{10}{5} \\
&= 2 \text{ A} \\
t &= \frac{Q}{I} \\
&= \frac{22}{2} \\
&= 11 \text{ h} \\
\text{ERG:} \quad t &= 11 \text{ h}
\end{align*}
$$

Mit der vollständig geladenen Powerbank lässt sich das Tablet **11 Stunden lang** betreiben.

**d) Resonanzdiagramm (Amplitudenüberhöhungsfunktion / Vergrößerungsfunktion)**

Die abgebildete Kurvenfamilie zeigt die **Amplitudenüberhöhungsfunktion (Resonanzüberhöhung) $V(\Omega)$** einer erzwungenen, gedämpften Schwingung in Abhängigkeit vom Frequenzverhältnis, für verschiedene Dämpfungsgrade $D$.

- **y-Achse:** Aufgetragen ist das Verhältnis der Schwingungsamplitude $A$ zur statischen Auslenkung $A_{stat}$ (bzw. allgemein die normierte Amplitude $V = A/A_{stat}$). Diese Größe ist **einheitenlos** (dimensionslos), da es sich um ein Verhältnis zweier Längen handelt. Der Wert **1** bedeutet, dass die dynamische Amplitude gleich der statischen Auslenkung ist — das System reagiert also wie bei einer (quasi-)statischen Kraftbeaufschlagung mit $f \to 0$ (sehr niedrige Anregungsfrequenz, keine Resonanzüberhöhung).
- **x-Achse:** Aufgetragen ist das **Frequenzverhältnis** $\eta = \frac{\Omega}{\omega_0}$ (Anregungsfrequenz zu Eigenfrequenz des ungedämpften Systems). Auch diese Größe ist **einheitenlos**, da Frequenz durch Frequenz geteilt wird.
- **Parameter D:** $D$ ist der **Dämpfungsgrad** (dimensionsloses Verhältnis von tatsächlicher Dämpfung zur kritischen Dämpfung). Je kleiner $D$, desto schwächer gedämpft das System und desto ausgeprägter (höher und schärfer) das Resonanzmaximum. Für $D \geq \frac{1}{\sqrt{2}} \approx 0{,}707$ verschwindet das Maximum, die Kurve fällt monoton ab.
- **Bedeutung des Maximums:** Das Maximum markiert die **Resonanzfrequenz** — bei dieser Anregungsfrequenz wird die Schwingungsamplitude maximal, das System nimmt am meisten Energie aus der anregenden Kraft auf. Mit wachsender Dämpfung $D$ verschiebt sich das Maximum zu kleineren Frequenzverhältnissen (nach links) und wird niedriger/breiter, bis es bei hinreichend großer Dämpfung ganz verschwindet.

---

### Aufgabe 2: Töpferscheibe (Rotation)

> [!info] Aufgabenstellung
> Für den Webauftritt einer Töpferei soll eine Simulation der Formgebung entwickelt werden. Beim Töpfern werden die Gegenstände auf Ton oder Lehm geformt und in einem Ofen gebrannt. Zum Simulieren der Töpferscheibe gibt es eine Leitung von 100 Watt. Die maximale Drehzahl beträgt 230 Umdrehungen pro Minute. Es werden Becher mit 10 cm Durchmesser geformt. Die Entwicklung funktioniert über folgende Aufgaben:
>
> a) Berechnen Sie die Winkelgeschwindigkeit (ω) der Töpferscheibe
>
> b) Berechnen Sie die Geschwindigkeit (v) mit der sich der äußere Rand des Gefäßes bei der maximalen Drehzahl dreht
>
> c) Die Töpferscheibe wird aus der Ruhe in t=10s gleichmäßig auf die Endgeschwindigkeit beschleunigt. Berechnen Sie die Winkelbeschleunigung (α) und die Anzahl der Drehungen in diesem Zeitintervall
>
> d) Beurteilen Sie auf Basis der Rechnung ob die Leitung der Töpferscheibe ausreicht um den Becher in 10 Sekunden gleichmäßig auf 32 Umdrehungen pro Minute zu beschleunigen (Annahme J=m·r²)

Gegeben (Töpferscheibe): Durchmesser $d = 10\,\text{cm} \Rightarrow r = 5\,\text{cm} = 0{,}05\,\text{m}$; maximale Drehzahl $n = 230\,\frac{1}{\text{min}} = \frac{230}{60}\,\frac{1}{\text{s}} = 3{,}833\,\frac{1}{\text{s}}$; Leitungsleistung $P = 100\,\text{W}$.

**a) Winkelgeschwindigkeit ω**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Drehzahl | `n` | `3.833` 1/s (= 230/min) |
| Gesucht | Winkelgeschwindigkeit | `omega` | |

$$
\begin{align*}
\text{Gegeben:} \\
n &= 3.833 \text{ 1/s} \\
\text{Weg:} \\
\omega &= 2\pi n \\
&= 2\pi \cdot 3.833 \\
&= 24.09 \text{ rad/s} \\
\text{ERG:} \quad \omega &= 24.09 \text{ rad/s}
\end{align*}
$$

**b) Bahngeschwindigkeit am Rand**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Winkelgeschwindigkeit | `omega` | `24.09` rad/s (aus a) |
| | Radius | `r` | `0.05` m |
| Gesucht | Bahngeschwindigkeit | `v` | |

$$
\begin{align*}
\text{Gegeben:} \\
\omega &= 24.09 \text{ rad/s} \\
r &= 0.05 \text{ m} \\
\text{Weg:} \\
v &= \omega \cdot r \\
&= 24.09 \cdot 0.05 \\
&= 1.204 \text{ m/s} \\
\text{ERG:} \quad v &= 1.204 \text{ m/s}
\end{align*}
$$

Der äußere Rand des Gefäßes bewegt sich bei maximaler Drehzahl mit ca. **1,204 m/s**.

**c) Winkelbeschleunigung und Anzahl der Umdrehungen**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Winkelgeschwindigkeit (Endwert) | `omega` | `24.09` rad/s |
| | Zeit | `t` | `10` s |
| Gesucht | Winkelbeschleunigung | `alphaW` | |

$$
\begin{align*}
\text{Gegeben:} \\
\omega &= 24.09 \text{ rad/s} \\
t &= 10 \text{ s} \\
\text{Weg:} \\
\alpha_W &= \frac{\omega}{t} \\
&= \frac{24.09}{10} \\
&= 2.409 \text{ rad/s}^2 \\
\text{ERG:} \quad \alpha_W &= 2.409 \text{ rad/s}^2
\end{align*}
$$

Überstrichener Drehwinkel (gleichmäßig beschleunigt aus der Ruhe, $\varphi = \frac{1}{2}\alpha_W t^2$):

$$
\begin{align*}
\varphi &= \frac{1}{2}\alpha_W t^2 \\
&= \frac{1}{2} \cdot 2.409 \cdot 10^2 \\
&= 120.45 \text{ rad} \\
N &= \frac{\varphi}{2\pi} \\
&= \frac{120.45}{2\pi} \\
&\approx 19.17 \\
\text{ERG:} \quad N &\approx 19 \text{ Umdrehungen}
\end{align*}
$$

Die Winkelbeschleunigung beträgt **2,409 rad/s²**, in den 10 Sekunden werden ca. **19 volle Umdrehungen** ausgeführt.

**d) Beurteilung: Reicht die Leistung für den Becher?**

*PhyCalc nicht direkt anwendbar* (keine reine Formel-Verkettung, sondern ein Plausibilitäts-Check mit fehlender Massenangabe des Werkstücks — daher händisch/symbolisch gelöst):

Für die Rotationsenergie eines als Hohlzylinder angenommenen Körpers ($J = m \cdot r^2$, Vorgabe aus der Aufgabenstellung) gilt:

$$
E_{Rot} = \frac{1}{2} J \omega^2 = \frac{1}{2} m r^2 \omega^2
$$

Die momentan benötigte Antriebsleistung ist die zeitliche Ableitung der Rotationsenergie:

$$
P(t) = \frac{d}{dt}E_{Rot} = m r^2 \cdot \omega(t) \cdot \alpha_W, \qquad \omega(t) = \alpha_W \cdot t
$$

Für den Becher mit Zielgrößen $n_B = 32\,\frac{1}{\text{min}}$, $t = 10\,\text{s}$, gleicher Radius $r = 0{,}05\,\text{m}$ (10 cm Durchmesser):

$$
\begin{align*}
\text{Gegeben:} \\
n_B &= 32/60 = 0.5333 \text{ 1/s} \\
t &= 10 \text{ s} \\
r &= 0.05 \text{ m} \\
\text{Weg:} \\
\omega_B &= 2\pi n_B \\
&= 2\pi \cdot 0.5333 \\
&= 3.351 \text{ rad/s} \\
\alpha_B &= \frac{\omega_B}{t} \\
&= \frac{3.351}{10} \\
&= 0.3351 \text{ rad/s}^2 \\
P_{max} &= m r^2 \omega_B \alpha_B \quad (\text{bei } t=10\text{s, wo } \omega \text{ maximal ist}) \\
\frac{P_{max}}{m} &= r^2 \cdot \omega_B \cdot \alpha_B \\
&= 0.05^2 \cdot 3.351 \cdot 0.3351 \\
&= 0.002807 \text{ W/kg} \\
\text{ERG:} \quad m_{max} &= \frac{100 \text{ W}}{0.002807 \text{ W/kg}} \approx 35\,620 \text{ kg}
\end{align*}
$$

Die verfügbare Leitung von 100 W würde also selbst für ein (unrealistisches) Werkstück mit einer Masse von über 35 Tonnen noch ausreichen, um den 10 cm-Becher in 10 s auf 32 U/min zu beschleunigen. Da ein echter Tonbecher nur einige hundert Gramm bis wenige Kilogramm wiegt, liegt der tatsächliche Leistungsbedarf um mehrere Größenordnungen unter 100 W.

**Die Leitung der Töpferscheibe reicht also mit sehr großer Sicherheit aus.** Das ist auch plausibel, da 32 U/min deutlich unter der Maximaldrehzahl von 230 U/min liegt und in a)–c) bereits gezeigt wurde, dass die Scheibe selbst mit 100 W problemlos auf 230 U/min beschleunigt werden kann — der zusätzliche Leistungsbedarf durch das (im Vergleich zur Scheibe leichte) Werkstück fällt kaum ins Gewicht.

---

### Aufgabe 3: Optik — reelles/virtuelles Bild und Abbildungsgleichung

> [!info] Aufgabenstellung
> a) Was ist ein reelles Bild, was ist ein virtuelles Bild?
>
> b) Skizzieren Sie ein reelles und ein virtuelles Bild
>
> c) Berechnen Sie mit der Formel $B = \frac{b \cdot G \cdot (b-f)}{b \cdot f}$ die Bildgröße, indem Sie die Werte aus der Aufgabenstellung einsetzen.

**a) Reelles Bild vs. virtuelles Bild**

Ein **reelles Bild** ist ein Bild, das tatsächlich (physisch) vorhanden ist. Von jedem Punkt des reellen Bildes gehen wirklich Lichtstrahlen aus, die sich dort real schneiden — ein reelles Bild lässt sich daher auf einem Schirm auffangen und sichtbar machen. Reelle Bilder entstehen, wenn die Gegenstandsweite größer als die Brennweite ist ($g > f$).

Ein **virtuelles Bild** existiert dagegen nicht als realer Schnittpunkt von Lichtstrahlen, sondern wird erst durch unsere Wahrnehmung (das Auge/Gehirn) konstruiert: Die von der Linse divergent austretenden Strahlen scheinen von einem gemeinsamen Punkt herzukommen, ohne dass sich dort tatsächlich Lichtstrahlen kreuzen. Ein virtuelles Bild lässt sich daher **nicht** auf einem Schirm auffangen. Virtuelle Bilder entstehen, wenn die Gegenstandsweite kleiner als die Brennweite ist ($g < f$).

**b) Skizzen (Prosa-Beschreibung)**

*Reelles Bild:* Ein Gegenstand $G$ steht links der Linse außerhalb der Brennweite ($g > f$). Zwei charakteristische Konstruktionsstrahlen von der Pfeilspitze von $G$ — der Parallelstrahl (läuft parallel zur optischen Achse zur Linse und wird durch den Brennpunkt gebrochen) und der Mittelpunktstrahl (läuft ungebrochen durch den Linsenmittelpunkt) — schneiden sich rechts der Linse tatsächlich in einem Punkt und bilden dort das umgekehrte, reelle Bild $B$.

*Virtuelles Bild:* Der Gegenstand $G$ steht innerhalb der Brennweite ($g < f$). Die von $G$ ausgehenden Strahlen werden von der Linse so gebrochen, dass sie hinter der Linse divergent auseinanderlaufen und sich real nicht schneiden. Verlängert man die gebrochenen Strahlen jedoch rückwärts auf die Gegenstandsseite der Linse, so schneiden sich diese rückwärtigen Verlängerungen in einem Punkt — dort erscheint dem Betrachter das aufrechte, vergrößerte, virtuelle Bild.

**c) Berechnung der Bildgröße**

Die angegebene Formel $B = \frac{b \cdot G \cdot (b-f)}{b \cdot f}$ lässt sich (der Faktor $b$ kürzt sich heraus) vereinfachen zu:

$$
B = G \cdot \frac{b-f}{f}
$$

Dies folgt direkt aus der Abbildungsgleichung $\frac{1}{f} = \frac{1}{g}+\frac{1}{b}$ (also $g = \frac{f\cdot b}{b-f}$) und dem Abbildungsmaßstab $V = \frac{B}{G} = \frac{b}{g}$: $B = G\cdot\frac{b}{g} = G\cdot\frac{b(b-f)}{fb} = G\cdot\frac{b-f}{f}$.

Mit den (aus der Aufgabenstellung stammenden) Werten Gegenstandsgröße $G = 5{,}5\,\text{cm}$, Bildweite $b = 300\,\text{mm}$ und Brennweite $f = 14\,\text{mm}$:

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Gegenstandsgröße | `G` | `5.5` cm |
| | Bildweite | `b` | `300` mm |
| | Brennweite | `f` | `14` mm |
| Gesucht | Bildgröße | `B` | |

$$
\begin{align*}
\text{Gegeben:} \\
G &= 5.5 \text{ cm} \\
b &= 300 \text{ mm} \\
f &= 14 \text{ mm} \\
\text{Weg:} \\
B &= G \cdot \frac{b-f}{f} \\
&= 5.5 \cdot \frac{300-14}{14} \\
&= 5.5 \cdot 20.43 \\
&= 112.36 \text{ cm} \\
\text{ERG:} \quad B &= 112.36 \text{ cm}
\end{align*}
$$

Die Bildgröße beträgt **112,36 cm**.

---

### Aufgabe 4: Elektrotechnik — Messingdraht und Widerstandsnetzwerk

> [!info] Aufgabenstellung
> a) Berechnen Sie die von einem Widerstand von 50 Ohm notwendige Menge (Länge) eines Messingdrahtes mit einem Durchmesser von 1,2 mm.
>
> b) Schaltung: Ein Widerstand $R_2$ liegt in Reihe zur Parallelschaltung von drei Widerständen $R_1$, $R_3$, $R_4$ (siehe Abbildung: $R_1$, $R_3$, $R_4$ liegen parallel zueinander zwischen den beiden Knoten, $R_2$ liegt in der oberen Zuleitung zum ersten Knoten in Reihe). Wie lässt sich $R_{ges}$ berechnen?

**a) Drahtlänge aus Widerstand**

Spezifischer Widerstand von Messing: $\rho_{Ms} = 0{,}0655\,\frac{\Omega\,\text{mm}^2}{\text{m}} = 6{,}55\times10^{-8}\,\Omega\,\text{m}$ (siehe [[Übungsaufgaben#Aufgabe A1: Messingdraht|Aufgabe A1]] als Cross-Check-Quelle für diesen Wert).

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Durchmesser | `dr` | `1.2` mm |
| | Widerstand | `R` | `50` Ohm |
| | spez. Widerstand | `rho` | `6.55e-8` Ohm·m |
| Gesucht | Drahtlänge | `l` | |

$$
\begin{align*}
\text{Gegeben:} \\
R &= 50 \text{ Ohm} \\
d &= 1.2\times10^{-3} \text{ m} \\
\rho &= 6.55\times10^{-8} \text{ Ohm·m} \\
\text{Weg:} \\
A &= \pi\left(\frac{d}{2}\right)^2 \\
&= \pi\left(\frac{1.2\times10^{-3}}{2}\right)^2 \\
&= 1.131\times10^{-6} \text{ m}^2 \\
l &= \frac{R \cdot A}{\rho} \\
&= \frac{50 \cdot 1.131\times10^{-6}}{6.55\times10^{-8}} \\
&= 863.3 \text{ m} \\
\text{ERG:} \quad l &= 863.3 \text{ m}
\end{align*}
$$

Es werden ca. **863,3 m** Messingdraht mit 1,2 mm Durchmesser benötigt, um einen Widerstand von 50 Ω zu erhalten.

**b) Berechnung von $R_{ges}$ des Netzwerks**

Schaltungstopologie: $R_1$, $R_3$ und $R_4$ liegen alle drei parallel zueinander zwischen den beiden Anschlussklemmen; $R_2$ liegt in Reihe in der oberen Zuleitung, sodass er nur mit dem Zweig aus $R_3 \parallel R_4$ eine Reihenschaltung bildet, während $R_1$ direkt (ohne $R_2$) parallel zu dieser Reihenschaltung liegt.

Schrittweises Vorgehen:

1. $R_3$ und $R_4$ sind parallel zueinander:
$$
R_{34} = \frac{R_3 \cdot R_4}{R_3+R_4}
$$

2. $R_2$ liegt in Reihe zu diesem Parallelzweig:
$$
R_{234} = R_2 + R_{34} = R_2 + \frac{R_3 R_4}{R_3+R_4}
$$

3. Dieser Zweig liegt parallel zu $R_1$:
$$
R_{ges} = \frac{R_1 \cdot R_{234}}{R_1+R_{234}}
$$

Vollständig ausmultipliziert und auf einen Bruch gebracht:

$$
\begin{align*}
R_{ges} &= \frac{R_1 \left(R_2(R_3+R_4)+R_3 R_4\right)}{R_3 R_4 + (R_1+R_2)(R_3+R_4)}
\end{align*}
$$

**Der Gesamtwiderstand berechnet sich also durch schrittweises Zusammenfassen: zuerst $R_3 \parallel R_4$, danach Reihenschaltung mit $R_2$, und zuletzt Parallelschaltung des Ergebnisses mit $R_1$**, was auf die obige geschlossene Formel für $R_{ges}$ führt.
