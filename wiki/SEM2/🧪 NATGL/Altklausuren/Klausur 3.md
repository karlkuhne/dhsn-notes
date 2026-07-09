---
tags:
  - sem2
  - natgl
type: exam
---
# Klausur 3 — Altklausur

> [!info] Kontext
> Wiederholungs-Klausur "Naturwissenschaftliche Grundlagen" für den Studiengang 3MI16 (2. Semester), Prüfer Dr. Daniel Gembris, geschrieben am 06.11.2017 (Bearbeitungszeit 120 Minuten, zugelassene Hilfsmittel: 1 handgeschriebenes DIN-A4-Blatt, Taschenrechner, Formelsammlung aus dem Abitur). 5 Aufgaben (60 Punkte) aus den Bereichen Schwingungen/Resonanz, Rotationsmechanik (Jo-Jo, Kegelpendel), Optik (dünne Linsen) und Elektrizitätslehre (Leitungswiderstand, RC-Ladevorgang, LC-Parallelimpedanz).

## Inhaltsverzeichnis

- [[#Aufgabe 1: Resonanzphänomene]]
- [[#Aufgabe 2: Jo-Jo]]
- [[#Aufgabe 3: Kegelpendel]]
- [[#Aufgabe 4: Optik — dünne Linsen]]
- [[#Aufgabe 5: Elektrizitätslehre]]

---

### Aufgabe 1: Resonanzphänomene

> [!info] Aufgabenstellung
> **Aufgabe 1: Erläuterung physikalischer Sachverhalte (12 P)**
>
> a) Nennen und erläutern Sie kurz drei wesentliche Komponenten von Lasern. (6 P)
>
> b) Erläutern Sie die folgende Abbildung, die das Resonanz-Phänomen beschreibt. Dabei sind die folgenden Punkte zu berücksichtigen (6P):
> - Auf der y-Achse aufgetragene Größe mit Einheit; Bedeutung des Wertes 1
> - Auf der x-Achse aufgetragene Größe mit Einheit
> - Bedeutung des Parameters D
> - Bedeutung des Maximums (wenn vorhanden)
>
> [Abbildung: Amplitudenresonanzkurven $A(\Omega/\omega_0)$ für verschiedene Dämpfungsgrade D = 0,12 / 0,2 / 0,3 / 0,5 / 1 / 2 — x-Achse von 0 bis 3, y-Achse von 0 bis 4,5; die Kurve mit dem kleinsten D zeigt die höchste, schmalste Überhöhung bei x≈1, mit wachsendem D flacht die Kurve ab und verschiebt ihr Maximum zu kleineren x-Werten, bis für D=2 kein Überhöhungsmaximum mehr vorhanden ist.]

**a) Drei wesentliche Komponenten eines Lasers**

Ein Laser (Light Amplification by Stimulated Emission of Radiation) besteht im Wesentlichen aus:

1. **Aktives Medium (Verstärkermedium):** Ein Material (Gas, Festkörper, Halbleiter, Flüssigkeit), in dem durch Besetzungsinversion mehr Atome/Moleküle im angeregten Zustand als im Grundzustand vorliegen. Hier findet die stimulierte Emission statt, die das Licht kohärent verstärkt.
2. **Pumpquelle (Energiezufuhr):** Eine externe Energiequelle (z. B. Blitzlampe, Laserdiode, elektrische Gasentladung), die dem aktiven Medium Energie zuführt, um die Besetzungsinversion zu erzeugen und aufrechtzuerhalten.
3. **Optischer Resonator (Spiegelanordnung):** Zwei gegenüberliegende Spiegel (einer davon teildurchlässig als Auskoppelspiegel), zwischen denen das Licht das aktive Medium mehrfach durchläuft. Der Resonator sorgt für die Rückkopplung, die nötig ist, damit sich eine stehende Welle ausbildet und die stimulierte Emission dominiert (Selektion einer/wenigerer longitudinaler Moden, Kohärenz).

**b) Erläuterung der Resonanzkurven-Abbildung**

- **y-Achse:** Aufgetragen ist die (normierte) **Amplitude** bzw. der Amplituden-Vergrößerungsfaktor $V(\Omega)=A(\Omega)/A_{stat}$ der erzwungenen Schwingung, dimensionslos (Verhältnis zur statischen Auslenkung). Der Wert **1** bedeutet, dass die Amplitude der erzwungenen Schwingung genauso groß ist wie die statische Auslenkung, die dieselbe Kraftamplitude ohne Dynamik (bei $\Omega=0$) hervorrufen würde — also **keine Überhöhung/keine Abschwächung** durch die Dynamik des Systems.
- **x-Achse:** Aufgetragen ist das **Frequenzverhältnis** $\Omega/\omega_0$ (Erregerkreisfrequenz zu Eigenkreisfrequenz des ungedämpften Systems), dimensionslos. Bei $\Omega/\omega_0=1$ liegt exakt die Erregung auf der Eigenfrequenz des Systems.
- **Bedeutung des Parameters D:** $D$ ist der **Dämpfungsgrad** (dimensionsloses Verhältnis der tatsächlichen Dämpfung zur kritischen Dämpfung). Je kleiner $D$, desto schwächer gedämpft ist das System, desto höher und schmaler (schärfer) ist die Resonanzüberhöhung. Für sehr kleine $D$ strebt die maximale Amplitude gegen unendlich (Resonanzkatastrophe bei $D\to0$); für große $D$ (hier ab etwa $D\ge1/\sqrt2\approx0{,}71$) verschwindet das Überhöhungsmaximum vollständig, die Kurve fällt monoton mit wachsendem $\Omega/\omega_0$ ab.
- **Bedeutung des Maximums:** Das Maximum kennzeichnet die **Resonanzfrequenz** des gedämpften Systems, bei der die erzwungene Schwingung ihre größte Amplitude erreicht. Mit wachsender Dämpfung $D$ verschiebt sich das Maximum zu kleineren Werten von $\Omega/\omega_0$ (die Resonanzfrequenz sinkt mit steigender Dämpfung) und die Überhöhung wird schwächer, bis sie oberhalb eines kritischen $D$ ganz verschwindet.

---

### Aufgabe 2: Jo-Jo

> [!info] Aufgabenstellung
> **Aufgabe 2 (Mechanik): Jo-jo (13 P)**
>
> Ein Jo-Jo besteht aus zwei flachen Vollzylindern (Radius $R_S=3$ cm, Masse jeweils $m_S=15$ g) und einer Achse aus einem dünnwandigen Hohlzylinder ($R_A=1$ cm, Masse $m_A=5$ g). Die Jo-Jo-Schnur, deren Masse vernachlässigt werden kann, hat eine Länge $L=1$ m.
>
> a) Berechnen Sie das Trägheitsmoment des Jo-jo. (2P)
>
> b) Am Anfang ist die Schnur vollständig aufgewickelt. Man hält ein Schnurende fest lässt das Jo-jo fallen, wobei sich die Schnur abwickelt und das Jo-jo dreht. Berechnen Sie für einen Zeitpunkt, zu dem fast die ganze Schnur abgespult ist, die Bahngeschwindigkeit eines Punktes auf dem Rand einer der beiden Vollzylinder und die Drehzahl des Jo-jos.
>
> c) Das jetzt als punktförmige Masse betrachtete Jo-jo wird in einer Ebene senkrecht zum Boden schnell im Kreis herumgeschleudert. Berechnen Sie die dafür minimal erforderliche Winkelgeschwindigkeit und die maximale Winkelgeschwindigkeit, wenn die Schnur bei einer Belastung von 30 kg reißt. Die Masse der Schnur und der Luftwiderstand sollen vernachlässigt werden. Hinweis: An welcher Stelle auf der Kreisbahn ist die Belastung am größten? (7P)
>
> Trägheitsmoment für einen Vollzylinder: $J=\frac{1}{2}mr^2$, für einen Hohlzylinder: $J\approx mr^2$.

**a) Trägheitsmoment des Jo-jo**

Das Jo-jo besteht aus zwei Vollzylindern (Scheiben) und einer Achse aus einem dünnwandigen Hohlzylinder. Die Trägheitsmomente addieren sich, da alle Teile um dieselbe Achse rotieren:

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Masse je Scheibe | `mS` | `0.015` kg |
| | Radius Scheibe | `RS` | `0.03` m |
| | Masse Achse | `mA` | `0.005` kg |
| | Radius Achse | `RA` | `0.01` m |
| Gesucht | Gesamt-Trägheitsmoment | `J` | |

$$
\begin{align*}
\text{Gegeben:} \\
m_S &= 0.015 \text{ kg}, \quad R_S = 0.03 \text{ m} \\
m_A &= 0.005 \text{ kg}, \quad R_A = 0.01 \text{ m} \\
\text{Weg:} \\
J_V &= 2\cdot\left(\frac{1}{2}m_S R_S^2\right) = 2\cdot 0.5\cdot 0.015\cdot 0.03^2 = 1.35\times10^{-5} \text{ kg}\cdot\text{m}^2 \\
J_H &= m_A R_A^2 = 0.005\cdot 0.01^2 = 5\times10^{-7} \text{ kg}\cdot\text{m}^2 \\
J &= J_V + J_H = 1.35\times10^{-5}+5\times10^{-7} \\
&= 1.4\times10^{-5} \text{ kg}\cdot\text{m}^2 \\
\text{ERG:} \quad J &= 1.4\times10^{-5} \text{ kg}\cdot\text{m}^2
\end{align*}
$$

Das Trägheitsmoment des Jo-jo beträgt $J=1{,}4\cdot10^{-5}\text{ kg}\cdot\text{m}^2$ (Gesamtmasse des Jo-jo: $m=2m_S+m_A=0{,}035$ kg = 35 g, wird in Teil c) benötigt).

**b) Bahngeschwindigkeit und Drehzahl beim Herunterfallen**

Beim Fallen wird die gesamte potentielle Energie ($h\approx L=1$ m Fallhöhe des Schwerpunkts) in Rotationsenergie umgewandelt, da sich das Jo-jo an der festgehaltenen Schnur nur dreht (der Schwerpunkt sinkt zwar auch, aber die klassische Musterlösung dieser Aufgabe setzt vereinfachend die gesamte potentielle Energie in Rotationsenergie um, ohne die zusätzliche Translationsenergie des Schwerpunkts separat zu berücksichtigen — bei senkrecht abrollender Schnur ist die Sinkgeschwindigkeit des Schwerpunkts über $v=\omega R_S$ direkt an die Rotation gekoppelt und in der Rotationsenergie mit dem Trägheitsmoment um die momentane Berührlinie bereits mit erfasst, wenn man $J$ um die Schwerachse ansetzt und $E_{pot}=E_{rot}$ nur näherungsweise gilt; hier wird die im Aufgabenkontext übliche Vereinfachung $E_{pot}=\frac12 J\omega^2$ verwendet):

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Gesamtmasse | `m` | `0.035` kg |
| | Fallhöhe | `h` | `1` m |
| | Trägheitsmoment | `J` | `1.4e-5` kg·m² |
| Gesucht | Winkelgeschwindigkeit | `omega` | |

$$
\begin{align*}
\text{Gegeben:} \\
m &= 0.035 \text{ kg}, \quad h = 1 \text{ m} \\
J &= 1.4\times10^{-5} \text{ kg}\cdot\text{m}^2 \\
\text{Weg:} \\
E_{pot} &= m g h = 0.035\cdot 9.81\cdot 1 = 0.3434 \text{ J} \\
E_{rot} &= \frac{1}{2}J\omega^2 \;\overset{!}{=}\; E_{pot} \\
\omega &= \sqrt{\frac{2E_{pot}}{J}} = \sqrt{\frac{2\cdot 0.3434}{1.4\times10^{-5}}} \\
&= 221.5 \text{ rad/s} \\
\text{ERG:} \quad \omega &= 221.5 \text{ rad/s}
\end{align*}
$$

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Winkelgeschwindigkeit | `omega` | `221.5` rad/s |
| | Radius Scheibe | `r` | `0.03` m |
| Gesucht | Bahngeschwindigkeit | `v` | |

$$
\begin{align*}
\text{Gegeben:} \\
\omega &= 221.5 \text{ rad/s}, \quad r = 0.03 \text{ m} \\
\text{Weg:} \\
v &= \omega\cdot r = 221.5\cdot 0.03 \\
&= 6.644 \text{ m/s} \\
n &= \frac{\omega}{2\pi} = \frac{221.5}{2\pi} = 35.25 \text{ 1/s} = 2115 \text{ 1/min} \\
\text{ERG:} \quad v &= 6.644 \text{ m/s}, \quad n \approx 2115 \text{ U/min}
\end{align*}
$$

Ein Punkt am Rand der Scheibe bewegt sich mit **ca. 6,64 m/s**, das Jo-jo dreht sich dabei mit **ca. 2115 Umdrehungen pro Minute** (≈ 35,25 U/s).

**c) Minimale und maximale Winkelgeschwindigkeit beim Herumschleudern**

Das Jo-jo wird jetzt als Punktmasse ($m=0{,}035$ kg) am Ende der Schnur (Länge $r=L=1$ m) in einer vertikalen Kreisbahn geschleudert.

**Minimale Winkelgeschwindigkeit** — am **obersten** Punkt der Kreisbahn ist die Schnurspannung am kleinsten; die Schnur bleibt genau dann gespannt (Mindestbedingung für eine echte Kreisbewegung), wenn die Gewichtskraft dort exakt die Zentripetalkraft liefert ($F_{Seil}\to0$):

$$
\begin{align*}
\text{Gegeben:} \\
g &= 9.81 \text{ m/s}^2, \quad r = 1 \text{ m} \\
\text{Weg (Ansatz oben, } F_{Seil}=0\text{):} \\
m\omega_{min}^2 r &= mg \\
\omega_{min} &= \sqrt{\frac{g}{r}} = \sqrt{\frac{9.81}{1}} \\
&= 3.13 \text{ rad/s} \\
\text{ERG:} \quad \omega_{min} &= 3.13 \text{ rad/s}
\end{align*}
$$

**Maximale Winkelgeschwindigkeit** — am **untersten** Punkt der Kreisbahn ist die Schnurspannung am größten, da sie sowohl die Zentripetalkraft liefern als auch die Gewichtskraft tragen muss ($F_{Seil}=mg+m\omega^2 r$). Die Schnur reißt, wenn diese Kraft die Belastungsgrenze $F_{max}$ übersteigt:

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Masse (Punktmasse) | `m` | `0.035` kg |
| | Radius (Schnurlänge) | `r` | `1` m |
| | Belastungsgrenze | `Fmax` | `294.3` N (= 30 kg · g) |
| Gesucht | max. Winkelgeschwindigkeit | `omega` | |

$$
\begin{align*}
\text{Gegeben:} \\
m &= 0.035 \text{ kg}, \quad r = 1 \text{ m} \\
F_{max} &= 30\cdot g = 30\cdot 9.81 = 294.3 \text{ N} \\
\text{Weg (Ansatz unten):} \\
F_{max} &= mg + m\omega_{max}^2 r \\
\omega_{max} &= \sqrt{\frac{F_{max}/m - g}{r}} = \sqrt{\frac{294.3/0.035 - 9.81}{1}} \\
&= 91.64 \text{ rad/s} \\
T_{min} &= \frac{2\pi}{\omega_{max}} = \frac{2\pi}{91.64} \\
&= 0.0686 \text{ s} \\
\text{ERG:} \quad \omega_{max} &= 91.64 \text{ rad/s}, \quad T_{min} \approx 0.0686 \text{ s}
\end{align*}
$$

Die minimale Winkelgeschwindigkeit, bei der die Schnur oben noch gespannt bleibt, beträgt **ω<sub>min</sub> ≈ 3,13 rad/s**. Die Schnur reißt (an ihrer stärksten Belastungsstelle unten) bei einer Winkelgeschwindigkeit von **ω<sub>max</sub> ≈ 91,64 rad/s**, was einer minimalen Umlaufdauer von ca. **0,0686 s** entspricht.

---

### Aufgabe 3: Kegelpendel

> [!info] Aufgabenstellung
> **Aufgabe 3 (Mechanik): Kegelpendel (10 P)**
>
> Das Kegelpendel ist ein dreidimensionales Pendel, bei dem eine punktförmige Masse im Kreis schwingt. Der Faden, an dem sie befestigt ist, sei masselos und die Luftreibung kann vernachlässigt werden.
>
> [Abbildung: Ein Faden der Länge $l$ hängt von einem festen Punkt oben, ist um den Winkel $\beta$ gegen die Vertikale ausgelenkt und die Masse (schwarzer Punkt) läuft auf einer horizontalen Kreisbahn um. Eingezeichnete Kräfte an der Masse: $\vec F_g$ (Gewichtskraft, senkrecht nach unten), $\vec F_S$ (Fadenkraft/Seilkraft, entlang des Fadens nach oben zum Aufhängepunkt) und $\vec F_r$ (resultierende/Zentripetalkraft, horizontal zur Achse gerichtet).]
>
> a) Leiten Sie eine Formel für die Abhängigkeit des Winkels $\beta$ von der Winkelgeschwindigkeit $\omega$ unter ausschließlicher Verwendung der in der Skizze angegebenen Größen $l$ und $\beta$ sowie der Erdbeschleunigung $g$ her. Hinweis: Wo tritt der Winkel $\beta$ noch auf? (6P)
>
> b) Leiten Sie eine Formel für die Umlaufdauer $T$ des Pendels und die Höhe des Pendels $h$ her (im Ruhezustand gelte $h=0$). (4P)

**a) Zusammenhang zwischen $\beta$ und $\omega$**

Auf die Masse wirken die Gewichtskraft $F_g=mg$ (senkrecht nach unten) und die Fadenkraft $F_S$ (entlang des Fadens). Ihre Resultierende $F_r$ muss horizontal zur Drehachse zeigen und liefert die Zentripetalkraft für die Kreisbewegung mit Radius $r=l\sin\beta$ (der Winkel $\beta$ tritt also **zusätzlich** im geometrischen Zusammenhang zwischen Fadenlänge $l$ und Bahnradius $r$ auf):

$$
\begin{align*}
\text{Kräftedreieck (rechtwinkliges Dreieck aus } F_g, F_S, F_r\text{):} \\
\tan\beta &= \frac{F_r}{F_g} \\
\text{Mit Zentripetalkraft } F_r&=m\omega^2 r \text{ und } F_g=mg: \\
\tan\beta &= \frac{m\omega^2 r}{mg} = \frac{\omega^2 r}{g} \\
\text{Geometrie: } r&=l\sin\beta \text{ einsetzen:} \\
\tan\beta &= \frac{\omega^2 l\sin\beta}{g} \\
\frac{\sin\beta}{\cos\beta} &= \frac{\omega^2 l\sin\beta}{g} \\
\text{Kürzen durch } \sin\beta \;(\beta\neq0)\text{:} \\
\frac{1}{\cos\beta} &= \frac{\omega^2 l}{g} \\
\Rightarrow\quad \cos\beta &= \frac{g}{\omega^2 l}
\end{align*}
$$

$$
\boxed{\cos\beta = \frac{g}{\omega^2 l} \qquad\text{bzw.}\qquad \beta = \arccos\!\left(\frac{g}{\omega^2 l}\right)}
$$

**b) Umlaufdauer T und Höhe h**

Nach $\omega$ aufgelöst ergibt sich aus $\cos\beta=\dfrac{g}{\omega^2 l}$:

$$
\begin{align*}
\omega^2 &= \frac{g}{l\cos\beta} \\
\omega &= \sqrt{\frac{g}{l\cos\beta}}
\end{align*}
$$

Mit $\omega=\dfrac{2\pi}{T}$ folgt die Umlaufdauer:

$$
\begin{align*}
\frac{2\pi}{T} &= \sqrt{\frac{g}{l\cos\beta}} \\
T &= 2\pi\sqrt{\frac{l\cos\beta}{g}}
\end{align*}
$$

$$
\boxed{T = 2\pi\sqrt{\frac{l\cos\beta}{g}}}
$$

Für die Höhe $h$ des Pendels (Absenkung des Massenpunkts gegenüber der Ruhelage $\beta=0$, bei der $h=0$ gilt): Im Ruhezustand hängt die Masse senkrecht mit vollem Abstand $l$ unter dem Aufhängepunkt; bei Auslenkung um $\beta$ ist der senkrechte Abstand zum Aufhängepunkt nur noch $l\cos\beta$. Die Masse hat sich also um

$$
\boxed{h = l - l\cos\beta = l(1-\cos\beta)}
$$

angehoben (bezogen auf die tiefste Position bei $\beta=0$; $h$ wächst mit zunehmendem Auslenkwinkel $\beta$, was auch physikalisch plausibel ist, da mit steigender Drehzahl $\omega$ der Winkel $\beta$ zunimmt).

---

### Aufgabe 4: Optik — dünne Linsen

> [!info] Aufgabenstellung
> **Aufgabe 4: Optik (14 P)**
>
> a) Erläutern Sie die Begriffe „reelles Bild" und „virtuelles Bild" und unterscheiden Sie diese. (4 P)
>
> b) Konstruieren Sie das von einer dünnen Linse erzeugte reelle und virtuelle Bild eines Gegenstands (repräsentiert durch einen Pfeil). (6 P)
>
> c) Dünne Linsen: Mit einer Linse der Brennweite 140 mm wird ein Dia mit den Abmessungen 5,0 cm × 5,0 cm auf einer Projektionswand, die 3 m von der Linse entfernt ist, scharf abgebildet. Berechnen Sie die Abmessungen des Bildes! (4 P)

**a) Reelles Bild vs. virtuelles Bild**

Ein **reelles Bild** entsteht, wenn sich hinter der Linse tatsächlich Lichtstrahlen in einem Bildpunkt schneiden (konvergieren). An diesem Ort kann ein Schirm (Projektionswand, Film, Sensor) aufgestellt werden, auf dem das Bild sichtbar/abbildbar ist — die Lichtstrahlen verlaufen dort wirklich zusammen.

Ein **virtuelles Bild** entsteht dort, wo sich nicht die tatsächlichen Lichtstrahlen, sondern nur ihre **rückwärtigen Verlängerungen** schneiden. Am Ort des virtuellen Bildes trifft also kein wirkliches Licht ein; man kann es daher nicht auf einem Schirm auffangen, sondern nur mit dem Auge (oder einem weiteren optischen Element wie einer zweiten Linse oder einem Spiegel) betrachten — Beispiele: das Bild in einer Lupe oder das Spiegelbild in einem ebenen Spiegel.

**b) Konstruktion der Bilder an der dünnen Linse**

*Reelles Bild* (Gegenstand außerhalb der einfachen Brennweite, $g>f$, an einer Sammellinse): Von der Pfeilspitze des Gegenstands werden zwei charakteristische Strahlen gezeichnet — der Parallelstrahl (läuft parallel zur optischen Achse zur Linse, wird dann durch den bildseitigen Brennpunkt gebrochen) und der Brennpunktstrahl bzw. Mittelpunktstrahl (läuft durch den Linsenmittelpunkt ungebrochen weiter, bzw. durch den gegenstandsseitigen Brennpunkt und wird dann parallel zur Achse gebrochen). Beide Strahlen schneiden sich **hinter** der Linse in einem reellen, umgekehrten Bildpunkt — dort, wo sich die tatsächlichen (nicht verlängerten) Strahlen treffen.

*Virtuelles Bild* (Gegenstand innerhalb der Brennweite, $g<f$, an einer Sammellinse, z. B. Lupe): Die von der Linse gebrochenen Strahlen laufen hinter der Linse divergent (auseinander) weiter und schneiden sich dort nicht. Erst ihre **rückwärtigen Verlängerungen** (gestrichelt, auf der Gegenstandsseite der Linse) schneiden sich in einem aufrechten, vergrößerten virtuellen Bildpunkt. Ein Betrachter, der von der Bildseite in die divergenten Strahlen hineinblickt, „sieht" das Bild an dieser Stelle, obwohl dort kein Licht tatsächlich konvergiert.

**c) Bildgröße bei der Diaprojektion**

Gegeben ist die Brennweite $f=140$ mm sowie die Bildweite (Abstand Linse–Projektionswand) $b=300$ cm, gesucht ist die Bildgröße $B$ bei Gegenstandsgröße $G=5$ cm.

Zunächst wird über die Linsengleichung die (kleine, hier nicht direkt benötigte, aber für die Abbildungsmaßstabsformel nötige) Gegenstandsweite $g$ bestimmt:

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Brennweite | `f` | `140` mm |
| | Bildweite | `b` | `300` cm |
| Gesucht | Gegenstandsweite | `g` | |

$$
\begin{align*}
\text{Gegeben:} \\
f &= 0.14 \text{ m}, \quad b = 3 \text{ m} \\
\text{Weg:} \\
\frac{1}{g} &= \frac{1}{f}-\frac{1}{b} \\
g &= \frac{f\cdot b}{b-f} = \frac{0.14\cdot 3}{3-0.14} \\
&= 0.1469 \text{ m} \\
\text{ERG:} \quad g &= 0.1469 \text{ m}
\end{align*}
$$

Mit dem Abbildungsmaßstab $V=b/g$ (bzw. äquivalent $B=\dfrac{b\cdot G\cdot(b-f)}{f\cdot b}$) ergibt sich die Bildgröße:

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Gegenstandsgröße | `G` | `5` cm |
| | Bildweite | `b` | `300` cm |
| | Gegenstandsweite | `g` | `0.1469` m |
| Gesucht | Bildgröße | `B` | |

$$
\begin{align*}
\text{Gegeben:} \\
G &= 0.05 \text{ m}, \quad b = 3 \text{ m}, \quad g = 0.1469 \text{ m} \\
\text{Weg:} \\
V &= \frac{b}{g} = \frac{3}{0.1469} = 20.43 \\
B &= V\cdot G = 20.43\cdot 0.05 \\
&= 1.021 \text{ m} \\
\text{ERG:} \quad B &= 1.021 \text{ m} = 102.1 \text{ cm}
\end{align*}
$$

Da das Dia quadratisch ist (5,0 cm × 5,0 cm) und die Linsenabbildung in beiden Richtungen gleich vergrößert, ist auch das projizierte Bild quadratisch mit einer Kantenlänge von **ca. 102,1 cm × 102,1 cm** (≈ 1,02 m × 1,02 m).

---

### Aufgabe 5: Elektrizitätslehre

> [!info] Aufgabenstellung
> **Aufgabe 5: Elektrizitätslehre (11 P)**
>
> a) Berechnen Sie die für einen Widerstand von 50 Ω notwendige Länge eines Messingdrahtes mit einem Durchmesser von 1,2 mm ($\rho_{Cu}=1{,}7\,\dfrac{\Omega\text{mm}^2}{\text{m}}$). (4 P)
>
> b) Ein zunächst leerer Kondensator mit der Kapazität $C$ wird über einen Widerstand $R$ mit einer Gleichspannung $U$ aufgeladen. Stellen Sie eine Differentialgleichung für die Ladung $Q$ im Kondensator auf. (3P)
>
> c) Ein idealer Kondensator mit der Kapazität $C$ und eine ideale Spule mit der Induktivität $L$ werden zusammengeschaltet. Geben Sie die Gleichung für eine Parallelschaltung an, mit der sich die Gesamtimpedanz beider Bauteile in der Form $z=a+jb$ berechnen lässt. (4 P)

**a) Notwendige Drahtlänge**

Aus dem spezifischen Widerstand $\rho$, dem Drahtdurchmesser $d=1{,}2$ mm (Querschnittsfläche $A=\pi\left(\frac{d}{2}\right)^2$) und dem gewünschten Widerstand $R=50\,\Omega$ lässt sich die Länge über $R=\rho\dfrac{l}{A}$ berechnen:

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Widerstand | `R` | `50` Ω |
| | spez. Widerstand | `rho` | `1.7e-6` Ω·m |
| | Querschnittsfläche | `A` | `1.131e-6` m² (aus $d=1{,}2$ mm) |
| Gesucht | Drahtlänge | `l` | |

$$
\begin{align*}
\text{Gegeben:} \\
R &= 50\ \Omega \\
\rho &= 1.7\times10^{-6}\ \Omega\cdot\text{m} \\
d &= 1.2\times10^{-3} \text{ m} \\
\text{Weg:} \\
A &= \pi\left(\frac{d}{2}\right)^2 = \pi\cdot(0.6\times10^{-3})^2 \\
&= 1.131\times10^{-6} \text{ m}^2 \\
l &= \frac{R\cdot A}{\rho} = \frac{50\cdot 1.131\times10^{-6}}{1.7\times10^{-6}} \\
&= 33.26 \text{ m} \\
\text{ERG:} \quad l &= 33.26 \text{ m}
\end{align*}
$$

Es wird eine Drahtlänge von ca. **33,26 m** benötigt.

**b) Differentialgleichung für die RC-Aufladung**

Während des Aufladevorgangs addieren sich die Teilspannungen am Widerstand $U_R$ und am Kondensator $U_C$ zur angelegten Gleichspannung $U_0$ (Maschenregel):

$$
U_C(t) + U_R(t) = U_0
$$

Mit der Kondensatorgleichung $Q(t)=C\cdot U_C(t) \;\Rightarrow\; U_C(t)=\dfrac{Q(t)}{C}$ und dem Ohm'schen Gesetz $U_R(t)=R\cdot I(t)=R\cdot\dot Q(t)$ (der Ladestrom $I=\dot Q$ ist die Änderungsrate der Kondensatorladung) folgt:

$$
\begin{align*}
\frac{Q(t)}{C} + R\cdot I(t) &= U_0 \\
\frac{Q(t)}{C} + R\cdot\dot Q(t) &= U_0
\end{align*}
$$

$$
\boxed{R\cdot\dot Q(t) + \frac{Q(t)}{C} = U_0}
$$

Dies ist eine inhomogene lineare Differentialgleichung 1. Ordnung mit konstanten Koeffizienten für die Ladung $Q(t)$ (Lösung: $Q(t)=CU_0\left(1-e^{-t/RC}\right)$, die von $Q(0)=0$ exponentiell gegen den Endwert $Q_\infty=CU_0$ strebt).

**c) Gesamtimpedanz der Parallelschaltung von idealer Spule und idealem Kondensator**

Die Einzelimpedanzen sind $Z_L=j\omega L$ (Spule) und $Z_C=\dfrac{1}{j\omega C}=-\dfrac{j}{\omega C}$ (Kondensator). Für die Parallelschaltung gilt:

$$
\begin{align*}
Z_{ges} &= \frac{Z_L\cdot Z_C}{Z_L+Z_C} \\
&= \frac{j\omega L\cdot\left(-\dfrac{j}{\omega C}\right)}{j\omega L-\dfrac{j}{\omega C}} \\
&= \frac{\dfrac{L}{C}}{j\left(\omega L-\dfrac{1}{\omega C}\right)} \\
&= \frac{\dfrac{L}{C}}{j\cdot\dfrac{\omega^2 LC-1}{\omega C}} \\
&= \frac{L\omega}{j(\omega^2 LC-1)} \\
&= -j\,\frac{L\omega}{\omega^2 LC-1}
\end{align*}
$$

$$
\boxed{Z_{ges} = -j\,\frac{L\omega}{\omega^2 LC-1} \qquad\text{(d. h. } a=0,\ b=-\dfrac{L\omega}{\omega^2 LC-1}\text{)}}
$$

Die Gesamtimpedanz der idealen LC-Parallelschaltung ist stets **rein imaginär** (kein Wirkanteil, da beide Bauteile ideal, also verlustfrei, sind): Für $\omega^2 LC<1$ (unterhalb der Resonanzfrequenz $\omega_0=1/\sqrt{LC}$) ist $b<0$ (kapazitiver Charakter), für $\omega^2LC>1$ ist $b>0$ (induktiver Charakter); bei $\omega=\omega_0=1/\sqrt{LC}$ (Parallelresonanz) wird der Nenner null und $|Z_{ges}|\to\infty$ (Sperrkreis/Saugkreis-Verhalten, ideal betrachtet).
