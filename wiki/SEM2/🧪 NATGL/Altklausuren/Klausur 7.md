---
tags:
  - sem2
  - natgl
type: exam
---
# Klausur 7 — Altklausur

> [!info] Kontext
> NatGl-Klausur vom 15.07.2021. Themen: Erläuterung physikalischer Inhalte (Mischfragen), Rotation/Trägheitsmoment, Optik, Elektrotechnik, Zusatzaufgabe Orts-/Geschwindigkeits-Zeit-Diagramme.

## Inhaltsverzeichnis

- [[#Aufgabe 1: Erläuterung physikalischer Inhalte]]
- [[#Aufgabe 2: Rotation / Trägheitsmoment]]
- [[#Aufgabe 3: Optik]]
- [[#Aufgabe 4: Elektrotechnik]]
- [[#Zusatzaufgabe: Orts- und v-t-Diagramme]]

---

### Aufgabe 1: Erläuterung physikalischer Inhalte

> [!info] Aufgabenstellung
> **1. Erläuterung physikalischer Inhalte (24P)**
>
> a) 2 optische Phänomene mit Wellenmodell des Lichts erklären
>
> b) Erklären, warum der Himmel blau ist
>
> c) Unterschied Fraunhofersche/Fresnelsche Beugung (Skizze)
>
> d) Mindestakkukapazität in mAh mit geg.: P=25W, 10h, USB(5V)
>
> e) Unterschied reelles/virtuelles Bild (anhand eines Beispiels)
>
> f) Funktionsprinzip Beschleunigungssensor (Skizze)
>
> g) Für gegebene Schaltkreise bestimmen, ob Lampe leuchtet oder nicht
>
> h) v-t-Diagramm für einen Gegenstand, erläutern welches das zugehörige Diagramm ist (Pos x als Faktor der Zeit t, gleiche Zeitintervalle)

**a) Zwei optische Phänomene, erklärt mit dem Wellenmodell des Lichts**

- **Beugung (Diffraktion):** Trifft Licht auf ein Hindernis oder einen Spalt, dessen Abmessung in der Größenordnung der Wellenlänge liegt, breitet es sich nicht mehr rein geradlinig aus, sondern "biegt" sich in den geometrischen Schattenraum hinein. Nach dem Huygensschen Prinzip geht von jedem Punkt der Wellenfront eine Elementarwelle aus; diese überlagern sich hinter dem Spalt und erzeugen ein charakteristisches Interferenzmuster (Maxima/Minima). Mit dem reinen Strahlenmodell (geometrische Optik) ist dieses Verhalten nicht erklärbar.
- **Interferenz (z. B. Dünnschichtinterferenz/Farben auf Seifenblasen oder Newtonsche Ringe):** Zwei oder mehr Teilwellen, die an unterschiedlichen Grenzflächen reflektiert wurden, überlagern sich. Je nach Wegunterschied (Gangunterschied) verstärken sie sich (konstruktive Interferenz, wenn der Gangunterschied ein ganzzahliges Vielfaches von $\lambda$ ist) oder löschen sich aus (destruktive Interferenz bei halbzahligem Vielfachen). Das erklärt die farbigen Muster, die im Strahlenmodell nicht auftreten würden.

Beide Phänomene zeigen, dass sich Licht wie eine Welle verhält (Ausbreitung, Überlagerung, Superpositionsprinzip), nicht wie ein Strom einzelner, unabhängiger Strahlen.

**b) Warum ist der Himmel blau?**

Das Sonnenlicht durchdringt die Erdatmosphäre und wird an den Luftmolekülen (N₂, O₂), die viel kleiner als die Wellenlänge des Lichts sind, gestreut (**Rayleigh-Streuung**). Die Intensität der Rayleigh-Streuung ist proportional zu $1/\lambda^4$ — kurzwelliges (blaues, $\lambda \approx 450\,\text{nm}$) Licht wird also sehr viel stärker gestreut als langwelliges (rotes, $\lambda \approx 700\,\text{nm}$) Licht. Blaues Licht wird dadurch in alle Richtungen über den ganzen Himmel verteilt gestreut, sodass man es aus jeder Blickrichtung des Himmels (auch abseits der Sonne) empfängt — der Himmel erscheint blau. Bei Sonnenuntergang legt das Licht einen viel längeren Weg durch die Atmosphäre zurück; der Blauanteil wird dabei fast vollständig herausgestreut, sodass nur noch der rote/orange Anteil übrig bleibt (Abendrot).

**c) Unterschied Fraunhofersche/Fresnelsche Beugung**

- **Fraunhofersche Beugung (Fernfeld-Beugung):** Lichtquelle und Beobachtungsebene sind (näherungsweise) unendlich weit vom beugenden Objekt entfernt, sodass die einfallenden und die abgebeugten Wellen als **parallele (ebene) Wellen** behandelt werden können. Praktisch erreicht man das durch Kollimation mit Linsen (Quelle im Brennpunkt einer Linse vor dem Spalt, Beobachtung im Brennpunkt einer Linse hinter dem Spalt).
- **Fresnelsche Beugung (Nahfeld-Beugung):** Lichtquelle bzw. Beobachtungspunkt befinden sich in endlichem Abstand vom beugenden Objekt. Die Wellenfronten sind gekrümmt (kugelförmig), und die in einem Punkt konstruktiv interferierenden Strahlen wurden unter verschiedenen Winkeln vom Objekt abgebeugt.

Skizze (Prinzip):

```
Fraunhofer (Fernfeld):            Fresnel (Nahfeld):

Quelle (∞)  ‖‖‖  Spalt  ‖‖‖  Schirm (∞)     Quelle (P₁, endlich)
   parallele Strahlen ein/aus         \         Spalt         /
   →→→→→ [ ] →→→→→                     \   ○ Kugelwellen ○   /
                                          Beobachtungspunkt P₂ (endlich)
```

Im Fraunhofer-Fall sind ein- und auslaufende Wellenfronten eben (parallel), im Fresnel-Fall sind sie gekrümmt (Kugelwellen mit endlichem Krümmungsradius).

**d) Mindestakkukapazität**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Leistung | `P` | `25` W |
| | Betriebsdauer | `t` | `10` h |
| | USB-Spannung | `U` | `5` V |
| Gesucht | Kapazität | `Q` | |

$$
\begin{align*}
\text{Gegeben:} \\
P &= 25 \text{ W} \\
t &= 10 \text{ h} \\
U &= 5 \text{ V} \\
\text{Weg:} \\
W &= P \cdot t \\
&= 25 \cdot 10 \\
&= 250 \text{ Wh} \\
Q &= \frac{W}{U} \\
&= \frac{250}{5} \\
&= 50 \text{ Ah} \\
\text{ERG:} \quad Q &= 50 \text{ Ah} = 50000 \text{ mAh}
\end{align*}
$$

Der Akku benötigt eine Mindestkapazität von **50.000 mAh (50 Ah)**.

**e) Unterschied reelles/virtuelles Bild**

- **Reelles Bild:** Die von einem Gegenstandspunkt ausgehenden und durch das optische System (Linse/Spiegel) gebrochenen bzw. reflektierten Strahlen treffen sich tatsächlich wieder in einem Punkt. Ein Schirm kann an dieser Stelle das Bild sichtbar auffangen. **Beispiel:** Kamera — die Sammellinse erzeugt auf dem Sensor/Film ein reelles, meist umgekehrtes Bild ($g > f$).
- **Virtuelles Bild:** Die Strahlen divergieren nach dem optischen System tatsächlich weiter; sie scheinen für den Betrachter nur von einem gemeinsamen Punkt herzukommen, wenn man sie geradlinig rückwärts verlängert. Ein Schirm bliebe an dieser Stelle dunkel. **Beispiel:** Lupe — befindet sich der Gegenstand innerhalb der Brennweite einer Sammellinse ($g < f$), entsteht ein aufrechtes, vergrößertes virtuelles Bild, das nur durch das Auge (welches die divergenten Strahlen selbst wieder fokussiert) wahrgenommen wird. Auch der ebene Spiegel erzeugt grundsätzlich ein virtuelles Bild.

**f) Funktionsprinzip Beschleunigungssensor (MEMS)**

Ein kapazitiver MEMS-Beschleunigungssensor besteht aus einer kleinen **seismischen Masse**, die über feine, elastische Federstege (Biegebalken) am starren Chip-Rahmen aufgehängt ist. Bei einer Beschleunigung $a$ des gesamten Gehäuses wirkt auf die trägere Masse (Trägheitswirkung, 2. Newtonsches Axiom $F = m \cdot a$) eine Kraft, die sie relativ zum Rahmen minimal auslenkt (Auslenkung $x$, mit der Rückstellkraft der Federn $F = D \cdot x$ im Gleichgewicht: $x = \dfrac{m \cdot a}{D}$). Diese winzige Auslenkung (typischerweise im Nanometer- bis Mikrometerbereich) wird kapazitiv gemessen: Die Masse trägt kammartige Elektroden, die zusammen mit feststehenden Gegenelektroden am Rahmen mehrere kleine Plattenkondensatoren bilden. Die Auslenkung verändert den Elektrodenabstand $d$ (oder die überlappende Fläche) und damit die Kapazität $C = \varepsilon_0 \varepsilon_r A / d$. Eine integrierte Auswerteelektronik misst diese Kapazitätsänderung (meist differentiell zwischen zwei Kondensatoren) und wandelt sie in ein zur Beschleunigung proportionales elektrisches Signal um.

Skizze (Prinzip):

```
        Rahmen (chipfest) ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
                          ▓             ▓
        Feder ~~~~~~~~~~~~▓   [Masse]   ▓~~~~~~~~~~~~ Feder
                          ▓  ↔  (m)     ▓
        Elektrode 1 ══════▓             ▓══════ Elektrode 2
                          ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
        C1 = ε·A/d1   ←── a (Beschleunigung) ──→   C2 = ε·A/d2
```

Bei Beschleunigung nach links wird $d_1$ kleiner und $d_2$ größer (oder umgekehrt) → $C_1 \neq C_2$ → Differenzsignal proportional zu $a$.

**g) Schaltkreise — Lampe leuchtet oder nicht**

Ohne die konkret abgebildeten Schaltbilder lässt sich diese Teilaufgabe nicht numerisch nachvollziehen; das allgemeine Lösungsverfahren ist jedoch: Für jede abgebildete Schaltung wird geprüft, ob zwischen den beiden Polen der Spannungsquelle über die Lampe ein **geschlossener, stromdurchgängiger Pfad** existiert (Maschenregel/Kirchhoffsche Regeln). Dazu wird verfolgt, welche Schalter offen bzw. geschlossen sind und ob die Lampe auf mindestens einem Pfad in Reihe mit der Quelle liegt, ohne durch einen offenen Schalter unterbrochen zu sein. Bei Parallelschaltungen von Schaltern genügt ein einziger geschlossener Schalter im jeweiligen Zweig, bei Reihenschaltungen müssen alle Schalter im Pfad geschlossen sein, damit die Lampe leuchtet.

**h) v-t-Diagramm zu gegebenem x-t-Verhalten**

Die Aufgabenstellung beschreibt eine Bewegung, bei der die Position $x$ linear proportional mit der Zeit $t$ wächst ("Pos x als Faktor der Zeit t", d. h. $x(t) = k \cdot t$ mit konstantem Faktor $k$), wobei gleiche Zeitintervalle betrachtet werden. Eine solche linear ansteigende Ortsfunktion beschreibt eine **gleichförmige (geradlinige) Bewegung mit konstanter Geschwindigkeit** $v = k = \text{const.}$ Das zugehörige v-t-Diagramm ist daher **keine Gerade mit Steigung, sondern eine horizontale Linie** (konstanter Wert $v=k$, unabhängig von $t$) — im Gegensatz zu z. B. einer quadratisch wachsenden Ortsfunktion, die im v-t-Diagramm eine ansteigende Gerade ergäbe (gleichmäßig beschleunigte Bewegung). Von den typischerweise als Auswahlmöglichkeiten gegebenen Diagrammen ist also dasjenige richtig, das eine konstante, zeitunabhängige Geschwindigkeit ($v$ = horizontale Linie ungleich Null) zeigt.

---

### Aufgabe 2: Rotation / Trägheitsmoment

> [!info] Aufgabenstellung
> **2. Rotation/ Trägheitsmoment**
>
> **2.1** Umdrehung in 0,5s. Drehzahl berechnen, wenn sich Trägheitsmoment um 25% verringert
>
> **2.2 LED-Rotor (12+2P)**
> - homogene Massenverteilung, Luftwiderstand des Stabes vernachlässigbar
>
> a) innere LED 5cm, äußere 2cm von Zentrum entfernt- für beide Geschwindigkeit und Winkelgeschwindigkeit berechnen, wenn Stab 50x pro Sekunde rotiert
>
> b) Trägheitsmoment für Stab mit Masse 10g berechnen
>
> c) Rotationsenergie des Stabes (für 50 UmdrehungenxSekunde- Notfallwert 0,001kg/m^2). Berechnen sie näherungsweise die notwendige Leistung eines Elektromotors n=100%, wenn End-Drehzahl in einer Sekunde erreicht sein soll
>
> Z: Bestätigung der Formel des dünnen Stabes (ist gegeben) durch Integration

**2.1 Neue Drehzahl bei Verringerung des Trägheitsmoments um 25 % (Drehimpulserhaltung)**

Aus "1 Umdrehung in 0,5 s" folgt die Anfangsdrehzahl $n_1 = \dfrac{1}{0{,}5\,\text{s}} = 2\,\text{s}^{-1}$. Ohne äußeres Drehmoment (z. B. beim Zusammenziehen einer rotierenden Masse) bleibt der Drehimpuls $L = J \cdot \omega$ erhalten:

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Anfangsdrehzahl | `n1` | `2` 1/s |
| | Trägheitsmoment (neu) | `J2` | `0.75·J1` |
| Gesucht | Neue Drehzahl | `n2` | |

$$
\begin{align*}
\text{Gegeben:} \\
n_1 &= \frac{1}{0.5\,\text{s}} = 2 \text{ s}^{-1} \\
J_2 &= 0.75 \cdot J_1 \\
\text{Weg (Drehimpulserhaltung } J_1\omega_1 = J_2\omega_2\text{):} \\
n_2 &= n_1 \cdot \frac{J_1}{J_2} \\
&= 2 \cdot \frac{1}{0.75} \\
&= 2.667 \text{ s}^{-1} \\
\text{ERG:} \quad n_2 &= 2.667 \text{ s}^{-1} \; (=160 \text{ 1/min})
\end{align*}
$$

Verringert sich das Trägheitsmoment um 25 %, steigt die Drehzahl im gleichen Verhältnis um den Faktor $1/0{,}75 \approx 1{,}33$ auf **≈ 2,67 Umdrehungen/s (160 1/min)**.

**2.2 a) Geschwindigkeit und Winkelgeschwindigkeit der beiden LEDs** (Stab rotiert mit $n=50\,\text{s}^{-1}$; die Winkelgeschwindigkeit ist für beide LEDs gleich, da starrer Körper — nur die Bahngeschwindigkeit unterscheidet sich mit dem Radius)

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Drehzahl | `n` | `50` 1/s |
| | Radius LED 1 | `r1` | `0.02` m |
| | Radius LED 2 | `r2` | `0.05` m |
| Gesucht | Winkelgeschw., Bahngeschw. | `omega`, `v1`, `v2` | |

$$
\begin{align*}
\text{Gegeben:} \\
n &= 50 \text{ s}^{-1} \\
r_1 &= 0.02 \text{ m}, \quad r_2 = 0.05 \text{ m} \\
\text{Weg:} \\
\omega &= 2\pi n \\
&= 2\pi \cdot 50 \\
&= 314.2 \text{ rad/s} \\
v_1 &= \omega \cdot r_1 \\
&= 314.2 \cdot 0.02 \\
&= 6.283 \text{ m/s} \\
v_2 &= \omega \cdot r_2 \\
&= 314.2 \cdot 0.05 \\
&= 15.71 \text{ m/s} \\
\text{ERG:} \quad \omega &= 314.2 \text{ rad/s}, \quad v_1 = 6.283 \text{ m/s}, \quad v_2 = 15.71 \text{ m/s}
\end{align*}
$$

$\omega$ = Winkelgeschwindigkeit (für beide LEDs identisch, starrer Körper)

Beide LEDs haben die **gleiche Winkelgeschwindigkeit** $\omega \approx 314{,}2\,\text{rad/s}$; ihre Bahngeschwindigkeiten unterscheiden sich proportional zum Radius: die LED im Abstand 2 cm hat $v \approx 6{,}28\,\text{m/s}$, die LED im Abstand 5 cm hat $v \approx 15{,}71\,\text{m/s}$.

**2.2 b) Trägheitsmoment des Stabes** (homogener dünner Stab, Rotation um die Achse durch das Zentrum senkrecht zum Stab; Stablänge $l = 2 \cdot 5\,\text{cm} = 10\,\text{cm}$, da die äußere LED am Stabende sitzt)

Die Formel für den dünnen Stab ist im Solver nicht hinterlegt (nur Vollzylinder, Ring, Vollkugel, Hohlzylinder) und wird daher direkt verwendet: $J = \dfrac{1}{12} m l^2$ (siehe Herleitung in der Zusatzaufgabe Z unten).

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Masse Stab | `m` | `10` g |
| | Länge Stab | `l` | `10` cm |
| Gesucht | Trägheitsmoment | `J` | |

$$
\begin{align*}
\text{Gegeben:} \\
m &= 0.01 \text{ kg} \\
l &= 0.1 \text{ m} \\
\text{Weg:} \\
J &= \frac{1}{12} m l^2 \\
&= \frac{1}{12} \cdot 0.01 \cdot 0.1^2 \\
&= 8.333 \times 10^{-6} \text{ kg} \cdot \text{m}^2 \\
\text{ERG:} \quad J &= 8.333 \times 10^{-6} \text{ kg} \cdot \text{m}^2
\end{align*}
$$

**2.2 c) Rotationsenergie und notwendige Motorleistung**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Trägheitsmoment | `J` | `8.333e-6` kg·m² (aus b) |
| | Winkelgeschwindigkeit (Enddrehzahl) | `omega` | `314.2` rad/s |
| Gesucht | Rotationsenergie | `Erot` | |

$$
\begin{align*}
\text{Gegeben:} \\
J &= 8.333 \times 10^{-6} \text{ kg} \cdot \text{m}^2 \\
\omega &= 314.2 \text{ rad/s} \\
\text{Weg:} \\
E_{\text{rot}} &= \frac{1}{2} J \omega^2 \\
&= \frac{1}{2} \cdot 8.333 \times 10^{-6} \cdot 314.2^2 \\
&= 0.4112 \text{ J} \\
\text{ERG:} \quad E_{\text{rot}} &= 0.4112 \text{ J}
\end{align*}
$$

Bei Wirkungsgrad $\eta = 100\,\%$ muss der Motor diese Rotationsenergie innerhalb der geforderten Beschleunigungszeit von $t=1\,\text{s}$ näherungsweise bereitstellen (mittlere Leistung = Energie/Zeit):

$$
\begin{align*}
P &= \frac{E_{\text{rot}}}{t} \\
&= \frac{0.4112}{1} \\
&= 0.4112 \text{ W} \\
\text{ERG:} \quad P &\approx 0.411 \text{ W}
\end{align*}
$$

*Hinweis zum in der Aufgabe angegebenen "Notfallwert" $J = 0{,}001\,\text{kg}\cdot\text{m}^2$:* Falls a)/b) nicht gelöst werden konnten, sollte stattdessen mit diesem vorgegebenen Wert weitergerechnet werden. Zur Vollständigkeit hier auch dieser Fall:

$$
\begin{align*}
E_{\text{rot,Notfall}} &= \frac{1}{2} \cdot 0.001 \cdot 314.2^2 = 49.35 \text{ J} \\
P_{\text{Notfall}} &= \frac{49.35}{1} = 49.35 \text{ W}
\end{align*}
$$

Mit dem selbst berechneten (physikalisch korrekten) Trägheitsmoment des Stabes ergibt sich also $P \approx 0{,}41\,\text{W}$, mit dem in der Aufgabe angegebenen Notfallwert $P \approx 49{,}35\,\text{W}$.

**Z) Bestätigung der Stabformel $J=\frac{1}{12}ml^2$ durch Integration**

Der Stab habe die Länge $l$, die Masse $m$ und eine homogene (konstante) Massenbelegung $\mu = \dfrac{m}{l}$ (Masse pro Länge). Die Rotationsachse liegt durch den Mittelpunkt des Stabes senkrecht zu seiner Längsachse. Ein Massenelement im Abstand $x$ vom Zentrum hat die Masse $dm = \mu \, dx$ und trägt zum Trägheitsmoment den Beitrag $dJ = x^2 \, dm$ bei. Integration über die gesamte Stablänge von $-l/2$ bis $+l/2$:

$$
\begin{align*}
J &= \int_{-l/2}^{l/2} x^2 \, \mu \, dx \\
&= \mu \left[\frac{x^3}{3}\right]_{-l/2}^{l/2} \\
&= \mu \left(\frac{(l/2)^3}{3} - \frac{(-l/2)^3}{3}\right) \\
&= \mu \cdot \frac{2 \cdot (l/2)^3}{3} \\
&= \mu \cdot \frac{l^3}{12} \\
&= \frac{m}{l} \cdot \frac{l^3}{12} \\
&= \frac{m \, l^2}{12}
\end{align*}
$$

Damit ist $J = \dfrac{1}{12} m l^2$ für den dünnen homogenen Stab bei Rotation um die Achse durch seinen Mittelpunkt bestätigt.

---

### Aufgabe 3: Optik

> [!info] Aufgabenstellung
> **3. Optik (10P)**
>
> a) Beleuchtungsstärke: 500Lux, LED-Strahler 600Lumen, Abstrahlwinkel 35 Grad, Lichtkegel senkrecht zur Arbeitsfläche. Berechne den max Abstand des LED-Strahlers von der Arbeitsfläche, für den die Regel noch eingehalten wird
>
> b) Brennweite 50,00mm, Gegenstandsweite 300cm. Berechne den Entferungsbereich, in dem Gegenstände scharf abgebildet werden, wenn max. Abstand zwischen Bild- und Aufnahmeebenen +/- 0,20mm toleriert

**a) Maximaler Abstand des LED-Strahlers**

Der LED-Strahler mit Öffnungswinkel (Vollwinkel des Lichtkegels) $\theta = 35°$ strahlt seinen Lichtstrom $\Phi_v = 600\,\text{lm}$ gleichmäßig in den zugehörigen Raumwinkel $\Omega$ ab. Die Lichtstärke im Kegel ist $I_v = \Phi_v/\Omega$; senkrecht unter dem Strahler (Zentrum der Arbeitsfläche) gilt das photometrische Abstandsgesetz $E_v = I_v/d^2$. Diese Formeln sind im PhyCalc-Solver nicht hinterlegt (photometrischer Block fehlt) und werden daher direkt angesetzt:

$$
\begin{align*}
\text{Gegeben:} \\
\Phi_v &= 600 \text{ lm} \\
\theta &= 35° = 0.6109 \text{ rad} \\
E_v &= 500 \text{ lx} \\
\text{Weg (Raumwinkel des Kegels mit Öffnungs-Vollwinkel } \theta\text{):} \\
\Omega &= 2\pi \left(1-\cos\left(\frac{\theta}{2}\right)\right) \\
&= 2\pi \left(1-\cos(17.5°)\right) \\
&= 0.2908 \text{ sr} \\
I_v &= \frac{\Phi_v}{\Omega} \\
&= \frac{600}{0.2908} \\
&= 2063 \text{ cd} \\
d &= \sqrt{\frac{I_v}{E_v}} \\
&= \sqrt{\frac{2063}{500}} \\
&= 2.031 \text{ m} \\
\text{ERG:} \quad d &= 2.031 \text{ m}
\end{align*}
$$

$\Omega$ = Raumwinkel des Lichtkegels
$I_v$ = Lichtstärke

Der LED-Strahler darf maximal **≈ 2,03 m** von der Arbeitsfläche entfernt sein, damit die vorgeschriebene Beleuchtungsstärke von 500 Lux im Zentrum des Lichtkegels noch erreicht wird.

**b) Entfernungsbereich scharfer Abbildung (Tiefenschärfe im Bildraum)**

Die Kamera ist auf $g=300\,\text{cm}=3000\,\text{mm}$ fokussiert; die zugehörige (feste) Bildweite $b$ ergibt sich aus der Abbildungsgleichung $\frac{1}{f}=\frac{1}{g}+\frac{1}{b}$. Wird stattdessen ein Gegenstand in einer anderen Entfernung $g'$ scharf auf dieselbe (feste) Sensor-/Filmebene abgebildet, entsteht dort eigentlich eine leicht andere Bildweite $b'$; solange $|b'-b|$ innerhalb der Toleranz $\pm 0{,}20\,\text{mm}$ bleibt, gilt das Bild noch als "scharf genug".

$$
\begin{align*}
\text{Gegeben:} \\
f &= 50.00 \text{ mm} \\
g &= 3000 \text{ mm} \\
\Delta b &= 0.20 \text{ mm} \\
\text{Weg — Bildweite bei Fokus auf } g\text{:} \\
b &= \frac{f \cdot g}{g-f} \\
&= \frac{50 \cdot 3000}{3000-50} \\
&= 50.85 \text{ mm} \\
\text{Toleranzbereich der Bildweite:} \\
b_{\min} &= b - \Delta b = 50.65 \text{ mm} \\
b_{\max} &= b + \Delta b = 51.05 \text{ mm} \\
\text{Zugehörige Gegenstandsweiten (}g' = \frac{f \cdot b'}{b'-f}\text{):} \\
g_{\text{fern}} &= \frac{f \cdot b_{\min}}{b_{\min}-f} \\
&= \frac{50 \cdot 50.65}{50.65-50} \\
&= 3911 \text{ mm} \approx 3.911 \text{ m} \\
g_{\text{nah}} &= \frac{f \cdot b_{\max}}{b_{\max}-f} \\
&= \frac{50 \cdot 51.05}{51.05-50} \\
&= 2437 \text{ mm} \approx 2.437 \text{ m} \\
\text{ERG:} \quad g_{\text{nah}} &\approx 2.44 \text{ m}, \quad g_{\text{fern}} \approx 3.91 \text{ m}
\end{align*}
$$

Gegenstände zwischen **≈ 2,44 m (Nahpunkt) und ≈ 3,91 m (Fernpunkt)** werden bei dieser Einstellung noch innerhalb der Toleranz scharf abgebildet.

---

### Aufgabe 4: Elektrotechnik

> [!info] Aufgabenstellung
> **4. Etech (12P)**
>
> a) Berechne R eines 7m langen Kupferdrahtes mit 0,2mm Durchmesser (spez.R 1.7*10^-2 Ohm*mm^2/m)
>
> b) Gleichung Rges für Ersatzwiderstände der abgebildeten Schaltung erstellen
>
> c) Schaltung aus b) an 5V-Spannungsquelle. Berechne die Ströme durch die 3 Widerstände für folgende Zahlenwerte: 1000/470/100 Ohm
>
> d) Kondensatorkapazität 4700Mikrofarat, Spannung 3,0V, angelegte Spannung zwischen 1,5-3,0V leuchtet Diode mit mittlerer Leistung von 2,0mW, bei weniger nicht. Berechne die mittlere Leuchtdauer

**a) Widerstand des Kupferdrahtes**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | spez. Widerstand | `rho` | `1.7e-2` Ω·mm²/m |
| | Länge | `l` | `7` m |
| | Durchmesser | `d` | `0.2` mm |
| Gesucht | Widerstand | `R` | |

$$
\begin{align*}
\text{Gegeben:} \\
\rho &= 1.7 \times 10^{-2} \text{ } \Omega \cdot \text{mm}^2/\text{m} \\
l &= 7 \text{ m} \\
d &= 0.2 \text{ mm} \\
\text{Weg:} \\
A &= \pi \left(\frac{d}{2}\right)^2 \\
&= \pi \cdot 0.1^2 \\
&= 0.03142 \text{ mm}^2 \\
R &= \frac{\rho \cdot l}{A} \\
&= \frac{1.7 \times 10^{-2} \cdot 7}{0.03142} \\
&= 3.788 \text{ } \Omega \\
\text{ERG:} \quad R &= 3.788 \text{ } \Omega
\end{align*}
$$

$A$ = Querschnittsfläche des Drahtes

**b) Gleichung für den Ersatzwiderstand** (das Original-Schaltbild liegt nicht digital vor; die in c) genannten drei Widerstände legen jedoch die typischste Klausur-Topologie nahe: ein Widerstand $R_1$ in Reihe zur Quelle, die anderen beiden $R_2$, $R_3$ dazu parallel geschaltet)

$$
R_{\text{ges}} = R_1 + \frac{R_2 \cdot R_3}{R_2+R_3}
$$

Allgemeines Verfahren zur Aufstellung der Ersatzwiderstandsgleichung, unabhängig von der konkreten Schaltung: Zunächst werden alle unmittelbar in Reihe liegenden Widerstände zu Teilsummen ($R=R_a+R_b$) zusammengefasst, danach alle parallel liegenden Teilzweige über den Kehrwert ($\frac{1}{R}=\frac{1}{R_a}+\frac{1}{R_b}$ bzw. $R = \frac{R_a R_b}{R_a+R_b}$ für zwei Widerstände) zu einem Ersatzwiderstand reduziert; dies wird iteriert (von den "Blättern" der Schaltung zur Quelle hin), bis nur noch ein einziger Ersatzwiderstand $R_{\text{ges}}$ übrig bleibt.

**c) Ströme durch die drei Widerstände** ($R_1=1000\,\Omega$ in Reihe, $R_2=470\,\Omega \parallel R_3=100\,\Omega$, $U=5\,\text{V}$)

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Widerstand 1 (Reihe) | `R1` | `1000` Ω |
| | Widerstand 2 (parallel) | `R2` | `470` Ω |
| | Widerstand 3 (parallel) | `R3` | `100` Ω |
| | Spannung | `U` | `5` V |
| Gesucht | Ströme | `I1`, `I2`, `I3` | |

$$
\begin{align*}
\text{Gegeben:} \\
R_1 &= 1000 \text{ } \Omega, \quad R_2 = 470 \text{ } \Omega, \quad R_3 = 100 \text{ } \Omega \\
U &= 5 \text{ V} \\
\text{Weg:} \\
R_{23} &= \frac{R_2 \cdot R_3}{R_2+R_3} \\
&= \frac{470 \cdot 100}{470+100} \\
&= 82.46 \text{ } \Omega \\
R_{\text{ges}} &= R_1 + R_{23} \\
&= 1000+82.46 \\
&= 1082.5 \text{ } \Omega \\
I_1 &= \frac{U}{R_{\text{ges}}} \\
&= \frac{5}{1082.5} \\
&= 4.619 \text{ mA} \\
U_{23} &= I_1 \cdot R_{23} \\
&= 4.619 \times 10^{-3} \cdot 82.46 \\
&= 0.3809 \text{ V} \\
I_2 &= \frac{U_{23}}{R_2} \\
&= \frac{0.3809}{470} \\
&= 0.8104 \text{ mA} \\
I_3 &= \frac{U_{23}}{R_3} \\
&= \frac{0.3809}{100} \\
&= 3.809 \text{ mA} \\
\text{ERG:} \quad I_1 &= 4.619 \text{ mA}, \quad I_2 = 0.8104 \text{ mA}, \quad I_3 = 3.809 \text{ mA}
\end{align*}
$$

Kontrolle: $I_2 + I_3 = 0{,}8104 + 3{,}809 = 4{,}619\,\text{mA} = I_1$ ✓ (Kirchhoffsche Knotenregel erfüllt).

**d) Mittlere Leuchtdauer der Diode**

Der Kondensator ($C=4700\,\mu\text{F}$) wird von $U_0=3{,}0\,\text{V}$ ausgehend entladen. Die Diode leuchtet nur, solange die Kondensatorspannung zwischen $1{,}5\,\text{V}$ und $3{,}0\,\text{V}$ liegt; in diesem Bereich wird eine mittlere Leistung von $\bar P = 2{,}0\,\text{mW}$ umgesetzt. Über den Energieerhaltungssatz lässt sich die mittlere mit der Leuchtdauer verknüpfen, ohne den exakten (exponentiellen) Entladeverlauf im Detail lösen zu müssen: Die im relevanten Spannungsbereich aus dem Kondensator entnehmbare Energie ist die Differenz der gespeicherten Energien bei $U_0$ und bei $U_1$:

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Kapazität | `C` | `4700` µF |
| | Anfangsspannung | `U0` | `3.0` V |
| | Schwellspannung (Diode aus) | `U1` | `1.5` V |
| | mittlere Leistung | `Pm` | `2.0` mW |
| Gesucht | mittlere Leuchtdauer | `t` | |

$$
\begin{align*}
\text{Gegeben:} \\
C &= 4700 \times 10^{-6} \text{ F} \\
U_0 &= 3.0 \text{ V}, \quad U_1 = 1.5 \text{ V} \\
\bar P &= 2.0 \times 10^{-3} \text{ W} \\
\text{Weg (Energiebilanz):} \\
W_{\text{verfügbar}} &= \frac{1}{2}C\left(U_0^2-U_1^2\right) \\
&= \frac{1}{2} \cdot 4700 \times 10^{-6} \cdot (3.0^2-1.5^2) \\
&= \frac{1}{2} \cdot 4700 \times 10^{-6} \cdot 6.75 \\
&= 0.01586 \text{ J} \\
t &= \frac{W_{\text{verfügbar}}}{\bar P} \\
&= \frac{0.01586}{2.0 \times 10^{-3}} \\
&= 7.931 \text{ s} \\
\text{ERG:} \quad t &= 7.931 \text{ s}
\end{align*}
$$

Die Diode leuchtet im Mittel etwa **7,93 s** lang, solange die Kondensatorspannung von 3,0 V auf 1,5 V absinkt.

---

### Zusatzaufgabe: Orts- und v-t-Diagramme

> [!info] Aufgabenstellung
> **Zusatz: Orts- und v-t-Diagramme (6P)**
>
> i) Berechnen Sie, inwieweit der Schlitten am Ende der Aufzeichnung von der ursprünglichen Position entfernt ist
>
> ii) Zeichne das Weg-Zeit-Diagramm
>
> iii) Erläutern Sie die Bedeutung des Flächeninhaltes zwischen dem v(t)-graphn und der t-Achse

**i) Entfernung von der Ausgangsposition am Ende der Aufzeichnung**

Diese Teilaufgabe bezieht sich auf ein in der Klausur mitgeliefertes v-t-Diagramm eines Schlittens (z. B. aus einem Praktikumsversuch mit einer Luftkissenbahn), das in der vorliegenden Transkription nicht als Zahlenwerte, sondern nur als Grafik vorlag und daher hier nicht mit den Original-Messwerten nachgerechnet werden kann. Das allgemeine Lösungsverfahren ist jedoch eindeutig: Die zurückgelegte Verschiebung (Ortsänderung) des Schlittens zwischen Start und Ende der Aufzeichnung entspricht exakt dem **Flächeninhalt unter der $v(t)$-Kurve** zwischen den entsprechenden Zeitpunkten, wobei Flächenanteile *unterhalb* der $t$-Achse (negative Geschwindigkeit, Bewegung in die entgegengesetzte Richtung) **subtrahiert** werden müssen:

$$
\Delta x = \int_{t_0}^{t_{\text{Ende}}} v(t)\, dt = \sum_i (\text{Fläche}_i)_{v>0} - \sum_j (\text{Fläche}_j)_{v<0}
$$

Praktisch wird das v-t-Diagramm dazu in einzelne geometrische Teilflächen (Rechtecke für Abschnitte konstanter Geschwindigkeit, Dreiecke/Trapeze für Abschnitte konstanter Beschleunigung) zerlegt, deren Flächeninhalte einzeln berechnet und mit korrektem Vorzeichen (je nachdem, ob $v$ oberhalb oder unterhalb der $t$-Achse liegt) aufsummiert werden. Das Ergebnis ist die **Netto-Verschiebung** (Endposition minus Anfangsposition), nicht der insgesamt zurückgelegte Weg (bei dem alle Teilflächen positiv gezählt würden).

**ii) Weg-Zeit-Diagramm**

Das zugehörige $x(t)$-Diagramm ergibt sich durch abschnittsweise Integration des $v(t)$-Verlaufs: In Zeitabschnitten mit konstanter positiver Geschwindigkeit steigt $x(t)$ linear an (Steigung = $v$), in Abschnitten mit konstanter negativer Geschwindigkeit fällt $x(t)$ linear ab, in Abschnitten mit konstanter Beschleunigung ($v(t)$ linear ansteigend/abfallend) verläuft $x(t)$ parabelförmig (quadratisch), und in Ruhephasen ($v=0$) bleibt $x(t)$ horizontal (Steigung Null). Der Wert von $x(t)$ zu jedem Zeitpunkt entspricht dabei stets der bis dahin aufgelaufenen (vorzeichenrichtigen) Fläche unter dem $v(t)$-Graphen gemäß der Formel aus i).

**iii) Bedeutung des Flächeninhaltes zwischen v(t)-Graph und t-Achse**

Der Flächeninhalt zwischen dem $v(t)$-Graphen und der $t$-Achse in einem Zeitintervall $[t_1,t_2]$ entspricht physikalisch der in diesem Intervall zurückgelegten **Strecke bzw. Verschiebung** $\Delta x = \int_{t_1}^{t_2} v(t)\,dt$. Das folgt direkt daraus, dass die Geschwindigkeit die zeitliche Ableitung des Ortes ist ($v=\dot x$) — die Fläche unter der Ableitungsfunktion ist nach dem Hauptsatz der Differential- und Integralrechnung gerade die Änderung der ursprünglichen Funktion. Liegt der Graph oberhalb der $t$-Achse ($v>0$), wird die Fläche positiv gezählt (Bewegung in positive Richtung); liegt er unterhalb ($v<0$), wird die Fläche negativ gezählt (Bewegung in negative Richtung). Die **Gesamtverschiebung** ergibt sich aus der Summe aller vorzeichenbehafteten Teilflächen, während die **gesamte zurückgelegte Wegstrecke** (unabhängig von der Richtung) die Summe der Beträge aller Teilflächen ist.
