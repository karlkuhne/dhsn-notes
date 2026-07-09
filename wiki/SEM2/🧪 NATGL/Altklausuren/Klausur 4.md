---
tags:
  - sem2
  - natgl
type: exam
---
# Klausur 4 — Altklausur

> [!info] Kontext
> Klausur zu Mechanik, Optik und Elektrotechnik. Themen: Resonanzphänomen/Powerbank (verbal + Rechnung), Kugel auf Looping-Bahn (Energieerhaltung/Rotation), Auto auf ansteigender Straße (Kräfte/Kinematik/DGL), Totalreflexion & dünne Linsen (Optik), Vorwiderstand/Drahtlänge/Wechselstromimpedanz/Gleichrichtwert (Elektrotechnik). Naturkonstanten und eine kleine Formelsammlung waren auf Seite 2 der Klausur vorgegeben.

## Inhaltsverzeichnis

- [[#Aufgabe 1: Erläuterung physikalischer Sachverhalte]]
- [[#Aufgabe 2: Kugel auf einer Looping-Bahn]]
- [[#Aufgabe 3: Auto auf ansteigender Straße]]
- [[#Aufgabe 4: Optik]]
- [[#Aufgabe 5: Elektrizitätslehre]]

---

### Aufgabe 1: Erläuterung physikalischer Sachverhalte

> [!info] Aufgabenstellung
> **(17 P)**
>
> a) Erläutern Sie die Abbildungen zum Resonanzphänomen. Gehen Sie dabei auf die dargestellten Größen ein (Achsenbeschriftung, Einheiten, Bedeutung von D in diesem Zusammenhang) und die Lage des Maximums der Kurven in der oberen Abbildung ein. (13P)
>
> *Abb. 1 zeigt mehrere Resonanzkurven (Amplitude über Frequenzverhältnis, Kurvenscharparameter D = 0,12 / 0,2 / 0,3 / 0,5 / 1 / 2) mit einem ausgeprägten Maximum bei kleinem D, das mit wachsendem D abflacht. Abb. 2 zeigt zwei Phasenkurven (Phasenwinkel 0° bis 180° über Frequenzverhältnis), die für unterschiedliche Dämpfung unterschiedlich steil durch 90° verlaufen.*
>
> b) In der Beschreibung der Powerbank Mobile Energy finden Sie die Angabe 10.500 mAh. Berechnen Sie, wie lange Sie Ihr Smartphone mit einer mittleren Leistungsaufnahme von 2 W an der Powerbank betreiben können, wenn diese vollständig geladen war. Der Anschluss erfolgt über ein USB-Kabel (5 V Spannung). (4P)

**a) Resonanzdiagramme — Erläuterung**

*Abbildung 1 (Amplituden-Resonanzkurve):*
Die Abszisse zeigt das (dimensionslose) Frequenzverhältnis $\eta = \omega/\omega_0$ (Erregerkreisfrequenz zu Eigenkreisfrequenz des ungedämpften Systems), die Ordinate die (ebenfalls normierte) Schwingungsamplitude $A/x_0$ des erzwungenen, gedämpften Schwingers. Der Kurvenscharparameter $D$ ist der **Dämpfungsgrad** (dimensionslose, auf den aperiodischen Grenzfall normierte Dämpfungskonstante, $D = \delta/\omega_0$) — **nicht** die Federkonstante. Für kleine Dämpfungsgrade ($D=0{,}12$) bildet sich ein scharfes, hohes Maximum nahe $\eta=1$ (Resonanzkatastrophe bei verschwindender Dämpfung); mit wachsendem $D$ wird das Maximum flacher und verschiebt sich zu kleineren $\eta$, bis es für $D \geq 1/\sqrt2$ (aperiodischer Grenzfall bzw. Kriechfall) ganz verschwindet und die Kurve monoton fällt. Die Lage des Maximums folgt aus $\eta_{res} = \sqrt{1-2D^2}$ — je größer $D$, desto weiter verschiebt sich (bzw. verschwindet) die Resonanzstelle.

*Abbildung 2 (Phasenkurve):*
Die Abszisse ist ebenfalls das Frequenzverhältnis $\eta=\omega/\omega_0$, die Ordinate der Phasenverschiebungswinkel $\varphi$ zwischen Erreger- und Schwingungsauslenkung (0° bis 180°). Bei sehr kleiner Erregerfrequenz schwingt das System nahezu in Phase ($\varphi\to 0°$), bei $\eta=1$ (Resonanz) beträgt die Phasenverschiebung unabhängig von der Dämpfung exakt 90°, und für sehr hohe Erregerfrequenzen läuft die Schwingung dem Erreger um 180° nach (Gegenphase). Die steilere der beiden Kurven gehört zur schwächer gedämpften Schwingung (schnellerer Phasenübergang um die Resonanzstelle), die flachere Kurve zur stärker gedämpften Schwingung.

**b) Betriebsdauer Smartphone an Powerbank**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Ladungskapazität | $Q$ | $10{,}5$ Ah |
| | Leistung Smartphone | $P$ | $2$ W |
| | Spannung USB | $U$ | $5$ V |
| Gesucht | Betriebsdauer | $t$ | |

$$
\begin{align*}
\text{Gegeben:} \\
Q &= 10{,}5 \text{ Ah} \\
P &= 2 \text{ W} \\
U &= 5 \text{ V} \\
\text{Weg:} \\
I &= \frac{P}{U} \\
&= \frac{2}{5} \\
&= 0{,}4 \text{ A} \\
t &= \frac{Q}{I} \\
&= \frac{10{,}5}{0{,}4} \\
&= 26{,}25 \text{ h} \\
\text{ERG:} \quad t &= 26{,}25 \text{ h}
\end{align*}
$$

Das Smartphone kann ca. **26,25 Stunden** an der Powerbank betrieben werden.

---

### Aufgabe 2: Kugel auf einer Looping-Bahn

> [!info] Aufgabenstellung
> **(7 P)**
>
> Berechnen Sie die minimale Höhe $h$, aus der eine Kugel reibungsfrei herunterrollen muss, damit sie in einer senkrecht orientierten Kreisbahn nicht herunterfällt. Rechnen Sie zunächst allgemein, dann mit dem Wert $r = 10$ m für den Radius der Kreisbahn.
>
> Das Trägheitsmoment einer Kugel mit dem Radius $R$ beträgt $J = \frac{2}{5}mR^2$.
>
> *Hinweise:*
> - *Energieerhaltung*
> - *Welche Bedingung muss im obersten Punkt der Kreisbahn erfüllt sein?*

**Lösung**

Die Kugel rollt reibungsfrei (ohne zu rutschen) von der Höhe $h$ (gemessen ab dem tiefsten Punkt der Bahn) herunter und muss am obersten Punkt der Kreisbahn (Höhe $2r$ über dem tiefsten Punkt) gerade noch Kontakt zur Bahn halten.

**Schritt 1 — Grenzbedingung im obersten Punkt**

Im obersten Punkt muss die Zentripetalbeschleunigung mindestens der Erdbeschleunigung entsprechen (Normalkraft $\geq 0$); im Grenzfall gilt Gleichheit:

$$
\begin{align*}
a_{\text{zen}} &= \frac{v_{\text{top}}^2}{r} \overset{!}{=} g \\
\Rightarrow \quad v_{\text{top}}^2 &= g \cdot r
\end{align*}
$$

**Schritt 2 — Energieerhaltung (Rollen ohne Rutschen)**

Beim Rollen ohne Rutschen gilt die Rollbedingung $\omega = v/R$ (mit $R$ = Kugelradius, nicht zu verwechseln mit dem Bahnradius $r$). Damit ergibt sich die Rotationsenergie zu:

$$
\begin{align*}
E_{\text{rot}} &= \frac12 J \omega^2 = \frac12 \cdot \frac25 mR^2 \cdot \left(\frac{v}{R}\right)^2 = \frac15 m v^2
\end{align*}
$$

Die gesamte kinetische Energie am obersten Punkt (Translation + Rotation) beträgt also:

$$
\begin{align*}
E_{\text{kin,ges}} &= \frac12 m v_{\text{top}}^2 + \frac15 m v_{\text{top}}^2 = \frac{7}{10} m v_{\text{top}}^2
\end{align*}
$$

Energieerhaltung zwischen Startpunkt (Höhe $h$) und oberstem Punkt der Bahn (Höhe $2r$):

$$
\begin{align*}
\text{Gegeben:} \\
v_{\text{top}}^2 &= g \cdot r \\
\text{Weg:} \\
m g h &= m g (2r) + \frac{7}{10} m v_{\text{top}}^2 \\
g h &= 2gr + \frac{7}{10} g r \\
h &= 2r + \frac{7}{10} r \\
&= \frac{27}{10} r \\
\text{ERG:} \quad h &= 2{,}7 \cdot r
\end{align*}
$$

**Schritt 3 — Zahlenwert mit $r = 10$ m**

$$
\begin{align*}
h &= 2{,}7 \cdot 10 \text{ m} \\
&= 27 \text{ m}
\end{align*}
$$

Die minimale Höhe (gemessen ab dem tiefsten Punkt der Bahn) beträgt allgemein $h=2{,}7\,r$ und mit $r=10$ m: **$h = 27$ m**. Das Ergebnis ist unabhängig vom Kugelradius $R$ (kürzt sich heraus) — nur das Verhältnis von Rotations- zu Translationsenergie ($1/5$ zu $1/2$, bestimmt durch das Trägheitsmoment der Vollkugel) geht ein.

---

### Aufgabe 3: Auto auf ansteigender Straße

> [!info] Aufgabenstellung
> **(11 P)**
>
> Ein Auto mit einer Masse von 1300 kg fährt mit konstanter Geschwindigkeit eine Straße mit 10% Steigung herauf. Reibung soll zunächst vernachlässigt werden.
>
> a) Berechnen Sie die Motorkraft und die notwendige Bremskraft, wenn das Auto auf dieser Straße abgestellt werden soll. (4P)
>
> b) Das Auto soll mit $a = 0{,}5\,\text{m/s}^2$ bergauf beschleunigen. Berechnen Sie die dafür erforderliche Kraft. (2P)
>
> c) Berechnen Sie die Geschwindigkeit des Autos nach einer Strecke von 20 m, wenn es konstant mit $a=0{,}5\,\text{m/s}^2$ beschleunigt. (2P)
>
> d) Stellen Sie eine Differentialgleichung für die Geschwindigkeit des antriebslos den Hang herunterrollenden Autos auf. Die relevanten Reibungskräfte sind zu berücksichtigen. Berechnen Sie daraus die Grenzgeschwindigkeit des Autos (Geschwindigkeit nach beliebig langer Zeit). (3P)
>
> *Hinweis: Formelsammlung auf Seite 2 beachten.*

**Vorüberlegung — Steigungswinkel**

Eine Steigung von 10 % bedeutet $\tan\alpha = 0{,}1$:

$$
\begin{align*}
\text{Gegeben:} \\
\mu_H &= 0{,}1 \\
\text{Weg:} \\
\alpha &= \arctan(\mu_H) \\
&= \arctan(0{,}1) \\
&= 5{,}711° \\
\text{ERG:} \quad \alpha &= 5{,}711°
\end{align*}
$$

**a) Motorkraft und Bremskraft im Stand (konstante Geschwindigkeit / Stillstand am Hang)**

Bei konstanter Geschwindigkeit bergauf muss die Motorkraft genau den Hangabtrieb (die zur Fahrbahn parallele Komponente der Gewichtskraft) kompensieren; reibungsfrei ist keine zusätzliche Kraft nötig. Soll das abgestellte Auto nicht wegrollen, muss die Bremse ebenfalls exakt den Hangabtrieb aufnehmen — Motorkraft und notwendige Bremskraft sind betragsmäßig gleich.

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Masse | $m$ | $1300$ kg |
| | Neigungswinkel | $\alpha$ | $5{,}711°$ |
| Gesucht | Hangabtriebskraft (= Motor-/Bremskraft) | $F_H$ | |

$$
\begin{align*}
\text{Gegeben:} \\
m &= 1300 \text{ kg} \\
\alpha &= 5{,}711° \\
\text{Weg:} \\
F_G &= m \cdot g \\
&= 1300 \cdot 9{,}81 \\
&= 12753 \text{ N} \\
F_H &= F_G \cdot \sin(\alpha) \\
&= 12753 \cdot \sin(5{,}711°) \\
&= 1268{,}97 \text{ N} \\
\text{ERG:} \quad F_H &= 1268{,}97 \text{ N}
\end{align*}
$$

Die Motorkraft muss mindestens **1269 N** betragen (konstante Fahrt bergauf), und ebenso muss die Bremskraft mindestens **1269 N** betragen, damit das abgestellte Auto nicht zurückrollt.

**b) Kraft für Beschleunigung $a=0{,}5\,\text{m/s}^2$ bergauf**

Zusätzlich zur Hangabtriebskraft aus a) muss die zusätzliche Beschleunigungskraft $F=m\cdot a$ aufgebracht werden.

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Masse | $m$ | $1300$ kg |
| | Beschleunigung | $a$ | $0{,}5$ m/s² |
| Gesucht | (zusätzliche) Kraft | $F$ | |

$$
\begin{align*}
\text{Gegeben:} \\
m &= 1300 \text{ kg} \\
a &= 0{,}5 \text{ m/s}^2 \\
\text{Weg:} \\
F &= m \cdot a \\
&= 1300 \cdot 0{,}5 \\
&= 650 \text{ N} \\
\text{ERG:} \quad F &= 650 \text{ N}
\end{align*}
$$

Zusätzlich zur Hangabtriebskraft ($\approx 1269$ N aus a)) ist eine Kraft von **650 N** nötig; die gesamte Motorkraft beträgt somit $1268{,}97 + 650 = 1918{,}97$ N.

**c) Geschwindigkeit nach 20 m (aus dem Stand, $a=0{,}5\,\text{m/s}^2$)**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Anfangsgeschwindigkeit | $v_0$ | $0$ m/s |
| | Beschleunigung | $a$ | $0{,}5$ m/s² |
| | Strecke | $s$ | $20$ m |
| Gesucht | Endgeschwindigkeit | $v$ | |

$$
\begin{align*}
\text{Gegeben:} \\
a &= 0{,}5 \text{ m/s}^2 \\
s &= 20 \text{ m} \\
v_0 &= 0 \text{ m/s} \\
\text{Weg:} \\
v &= \sqrt{v_0^2+2as} \\
&= \sqrt{0^2+2 \cdot 0{,}5 \cdot 20} \\
&= 4{,}472 \text{ m/s} \\
\text{ERG:} \quad v &= 4{,}472 \text{ m/s}
\end{align*}
$$

Nach 20 m hat das Auto eine Geschwindigkeit von **4,472 m/s** (≈ 16,1 km/h) erreicht.

**d) Differentialgleichung für die Geschwindigkeit beim antriebslosen Herunterrollen und Grenzgeschwindigkeit**

Beim antriebslosen (motorlosen) Herunterrollen wirken auf das Auto drei Kräfte parallel zur Fahrbahn: der Hangabtrieb $F_H = mg\sin\alpha$ (beschleunigend), die geschwindigkeitsunabhängige Rollreibung $F_{RRo}=\mu_R \cdot mg\cos\alpha$ (bremsend) und die geschwindigkeitsabhängige Luftreibung $F_W = \frac{\rho c_w A v^2}{2}$ (bremsend, quadratisch in $v$). Mit dem Kraftgesetz $F=ma=m\dot v$ ergibt sich die Bewegungsgleichung (DGL):

$$
\begin{align*}
m\dot v &= mg\sin\alpha - \mu_R m g\cos\alpha - \frac{\rho c_w A}{2} v^2 \\
\dot v &= g(\sin\alpha - \mu_R\cos\alpha) - \frac{\rho c_w A}{2m} v^2
\end{align*}
$$

Dies ist eine nichtlineare (Riccati-artige) DGL 1. Ordnung für $v(t)$ mit den Konstanten $\rho$ (Luftdichte), $c_w$ (Widerstandsbeiwert), $A$ (Querschnittsfläche) und $\mu_R$ (Rollreibungszahl).

Die **Grenzgeschwindigkeit** $v_\infty$ (Geschwindigkeit nach beliebig langer Zeit) ist erreicht, wenn sich Antrieb und Bremsung genau kompensieren, also $\dot v = 0$:

$$
\begin{align*}
0 &= g(\sin\alpha - \mu_R\cos\alpha) - \frac{\rho c_w A}{2m} v_\infty^2 \\
v_\infty^2 &= \frac{2mg(\sin\alpha - \mu_R\cos\alpha)}{\rho c_w A} \\
v_\infty &= \sqrt{\frac{2mg(\sin\alpha - \mu_R\cos\alpha)}{\rho c_w A}}
\end{align*}
$$

**Ein Zahlenwert lässt sich hier nicht angeben**, da die Klausuraufgabe keine Werte für $\mu_R$ (Rollreibungszahl), $\rho$ (Luftdichte), $c_w$ (Widerstandsbeiwert) und $A$ (Stirnfläche) vorgibt — die Aufgabe verlangt an dieser Stelle nur das Aufstellen der DGL und den allgemeinen (algebraischen) Ausdruck für $v_\infty$.

---

### Aufgabe 4: Optik

> [!info] Aufgabenstellung
> **(14 P)**
>
> **4.1)** *(Skizze: Ein mit Wasser gefülltes zylindrisches Glasgefäß wird von unten mit einer mittig positionierten Lichtquelle beleuchtet; ein zweites Teilbild zeigt schematisch den Strahlengang mit den Winkeln α, β, γ, δ, ε an den Grenzflächen.)*
>
> Ein mit Wasser gefülltes zylindrisches Glasgefäß wird von unten mit einer mittig positionierten Lichtquelle beleuchtet. Berechnen Sie den maximalen Öffnungswinkel des Lichtkegels, so dass von der Lichtquelle kein Licht auf direktem Weg durch das Glas nach außen tritt. Wenn sich bei der Rechnung eine Größe herauskürzt, interpretieren Sie dies physikalisch. (9P) *Hinweis: Totalreflexion*
>
> Brechungsindizes: $n_W = 1{,}33$; $n_G = 1{,}61$; $n_L = 1$
>
> **4.2) Dünne Linsen:**
> Mit einer Linse der Brennweite 110 mm wird ein Dia mit den Abmessungen 36 mm × 24 mm auf einer Projektionswand, die 3 m von der Linse entfernt ist, scharf abgebildet. Berechnen Sie die Abmessungen des Bildes — zunächst allgemein, dann für die angegebenen Werte! (5 P)

**4.1) Maximaler Öffnungswinkel des Lichtkegels (Totalreflexion durch die Zylinderwand)**

Das Licht der mittig positionierten Quelle durchläuft auf dem Weg nach außen zwei Grenzflächen mit **parallelen** (radial gerichteten) Flächennormalen: zunächst Wasser→Glas, danach Glas→Luft. Nach dem Snelliusschen Brechungsgesetz gilt an beiden Grenzflächen (Winkel jeweils zur radialen Flächennormalen gemessen):

$$
\begin{align*}
n_W \sin\beta_W &= n_G \sin\beta_G \qquad \text{(Wasser} \to \text{Glas)} \\
n_G \sin\beta_G &= n_L \sin\beta_L \qquad \text{(Glas} \to \text{Luft)}
\end{align*}
$$

Setzt man beide Gleichungen ineinander ein, so **kürzt sich $n_G$ (der Brechungsindex des Glases) vollständig heraus**:

$$
\begin{align*}
n_W \sin\beta_W &= n_L \sin\beta_L
\end{align*}
$$

**Physikalische Interpretation:** Der Grenzwinkel der Totalreflexion an einer aus mehreren planparallelen (bzw. hier: konzentrisch-zylindrischen) Schichten bestehenden Grenzfläche hängt nur von den Brechungsindizes der beiden äußersten Medien ab — die Brechzahl jeder dazwischenliegenden Schicht (hier: das Glas) ist irrelevant für die Frage, ob Totalreflexion eintritt oder nicht. Das Licht "merkt" beim Grenzfall der Totalreflexion nichts von der Glasschicht dazwischen.

Totalreflexion an der äußeren (Glas–Luft-) Grenzfläche tritt ein, sobald $\beta_L=90°$ erreicht wird. Der zugehörige Grenzwinkel $\beta_{W,\text{grenz}}$ im Wasser (zur radialen Flächennormalen) ergibt sich damit direkt aus $n_W$ und $n_L$:

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Brechungsindex Wasser | $n_1$ | $1{,}33$ |
| | Brechungsindex Luft | $n_2$ | $1$ |
| Gesucht | Grenzwinkel (zur radialen Normalen) | $\beta_{W,\text{grenz}}$ | |

$$
\begin{align*}
\text{Gegeben:} \\
n_1 &= 1{,}33 \\
n_2 &= 1 \\
\text{Weg:} \\
\beta_{W,\text{grenz}} &= \arcsin\left(\frac{n_2}{n_1}\right) \\
&= \arcsin\left(\frac{1}{1{,}33}\right) \\
&= 48{,}75° \\
\text{ERG:} \quad \beta_{W,\text{grenz}} &= 48{,}75°
\end{align*}
$$

Der Öffnungswinkel $\alpha$ des Lichtkegels wird von der Symmetrieachse (senkrecht, in Richtung der Zylinderachse) aus gemessen; da die radiale Flächennormale senkrecht zur Zylinderachse steht, gilt $\alpha + \beta_W = 90°$. Der **halbe** maximale Öffnungswinkel beträgt daher:

$$
\begin{align*}
\alpha &= 90° - \beta_{W,\text{grenz}} \\
&= 90° - 48{,}75° \\
&= 41{,}25°
\end{align*}
$$

Der **volle** Öffnungswinkel des Lichtkegels (symmetrisch um die Achse) beträgt somit **$2\alpha \approx 82{,}5°$**. Für alle Lichtstrahlen, die innerhalb dieses Kegels (also näher an der vertikalen Achse) verlaufen, tritt an der Zylinderwand Totalreflexion ein und kein Licht verlässt das Glas auf direktem Weg.

**4.2) Dünne Linse — Bildgröße**

**Allgemeine Herleitung:**

Aus der Abbildungsgleichung $\frac1f = \frac1g+\frac1b$ folgt die Gegenstandsweite $g$, und der Abbildungsmaßstab ist $V = \frac{b}{g} = \frac{B}{G}$, also $B = V \cdot G = \frac{b}{g}\cdot G$.

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Brennweite | $f$ | $110$ mm $= 0{,}11$ m |
| | Bildweite | $b$ | $3$ m |
| Gesucht | Gegenstandsweite | $g$ | |

$$
\begin{align*}
\text{Gegeben:} \\
f &= 0{,}11 \text{ m} \\
b &= 3 \text{ m} \\
\text{Weg:} \\
g &= \frac{1}{\frac1f-\frac1b} \\
&= \frac{1}{\frac{1}{0{,}11}-\frac{1}{3}} \\
&= 0{,}1142 \text{ m} \\
\text{ERG:} \quad g &= 0{,}1142 \text{ m}
\end{align*}
$$

Abbildungsmaßstab:

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Bildweite | $b$ | $3$ m |
| | Gegenstandsweite | $g$ | $0{,}1142$ m |
| Gesucht | Abbildungsmaßstab | $V$ | |

$$
\begin{align*}
\text{Gegeben:} \\
b &= 3 \text{ m} \\
g &= 0{,}1142 \text{ m} \\
\text{Weg:} \\
V &= \frac{b}{g} \\
&= \frac{3}{0{,}1142} \\
&= 26{,}27 \\
\text{ERG:} \quad V &= 26{,}27
\end{align*}
$$

Bildabmessungen (Dia $36\,\text{mm}\times 24\,\text{mm}$, allgemein $B=V\cdot G$):

$$
\begin{align*}
B_x &= V \cdot G_x = 26{,}27 \cdot 36 \text{ mm} = 946 \text{ mm} \\
B_y &= V \cdot G_y = 26{,}27 \cdot 24 \text{ mm} = 631 \text{ mm}
\end{align*}
$$

**Das projizierte Bild ist ca. 946 mm × 631 mm groß** (rund 0,95 m × 0,63 m).

---

### Aufgabe 5: Elektrizitätslehre

> [!info] Aufgabenstellung
> **(18 P)**
>
> **5.1)** Eine kleine Glühlampe mit 1,5 V und 2 W soll an eine 9-V-Spannungsquelle angeschlossen werden. Die Ergebnisse sind auf zwei Nachkommastellen genau anzugeben.
>
> a) Berechnen Sie den notwendigen Vorwiderstand. (2 P)
>
> b) Berechnen Sie die am Widerstand aus a) abgegebene Leistung. (Notfallwert für Vorwiderstand: 6 Ω) (1P)
>
> c) Berechnen Sie notwendige Länge eines runden Messingdrahtes mit einem Durchmesser von 0,6 mm, um den Vorwiderstand aus a) (Notfallwert: 6 Ω) zu realisieren (3P)
>
> $\left(\rho_s = 0{,}0655\,\dfrac{\Omega\,\text{mm}^2}{\text{m}}\right)$
>
> **5.2)** Ein Widerstand R, eine Spule mit der Induktivität L und ein Kondensator mit der Kapazität C werden in Reihe an das Stromnetz ($U_{eff}=230$ V, $f=50$ Hz) angeschlossen.
>
> a) Berechnen Sie den Betrag und die Phase der Impedanz dieser Schaltung. (5P)
>
> b) Berechnen Sie die Resonanzfrequenz. (2P)
>
> Rechnen Sie erst allgemein, dann mit den Zahlenwerten $R=1000\,\Omega$, $L=20$ mH und $C=1\,\mu\text{F}$.
>
> **5.3) Sinusfunktion mit Amplitudenbegrenzung (5P)**
>
> Berechnen Sie den Gleichrichtwert für die in der Abbildung dargestellte Wechselspannung.
>
> *(Abbildung: eine Sinuskurve $u=\hat u \sin(\omega t)$, deren Amplitude bei $\pm\hat u/2$ hart abgeschnitten/begrenzt ist — es entsteht ein trapezförmiger Verlauf.)*
>
> (maximale Spannung: $\hat u/2$ als Begrenzungswert)

**5.1a) Vorwiderstand**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Nennleistung Lampe | $P$ | $2$ W |
| | Nennspannung Lampe | $U_L$ | $1{,}5$ V |
| | Quellspannung | $U_0$ | $9$ V |
| Gesucht | Vorwiderstand | $R_{Vor}$ | |

$$
\begin{align*}
\text{Gegeben:} \\
P &= 2 \text{ W} \\
U_L &= 1{,}5 \text{ V} \\
U_0 &= 9 \text{ V} \\
\text{Weg:} \\
I &= \frac{P}{U_L} \\
&= \frac{2}{1{,}5} \\
&= 1{,}33 \text{ A} \\
U_{Vor} &= U_0-U_L \\
&= 9-1{,}5 \\
&= 7{,}5 \text{ V} \\
R_{Vor} &= \frac{U_{Vor}}{I} \\
&= \frac{7{,}5}{1{,}33} \\
&= 5{,}63 \text{ } \Omega \\
\text{ERG:} \quad R_{Vor} &= 5{,}63\ \Omega
\end{align*}
$$

**5.1b) Leistung am Vorwiderstand**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Spannung am Vorwiderstand | $U_{Vor}$ | $7{,}5$ V |
| | Strom | $I$ | $1{,}33$ A |
| Gesucht | Leistung | $P_{Vor}$ | |

$$
\begin{align*}
\text{Gegeben:} \\
U_{Vor} &= 7{,}5 \text{ V} \\
I &= 1{,}33 \text{ A} \\
\text{Weg:} \\
P_{Vor} &= U_{Vor} \cdot I \\
&= 7{,}5 \cdot 1{,}33 \\
&= 10{,}00 \text{ W} \\
\text{ERG:} \quad P_{Vor} &= 10{,}00 \text{ W}
\end{align*}
$$

*(Mit dem Notfallwert $R_{Vor}=6\,\Omega$ ergäbe sich äquivalent $P_{Vor}=U_{Vor}\cdot I = 7{,}5\cdot 1{,}25=9{,}38$ W — hier wird jedoch mit dem in a) selbst berechneten, exakten Wert weitergerechnet.)*

**5.1c) Länge des Messingdrahtes**

Querschnittsfläche des runden Drahtes mit $d=0{,}6$ mm:

$$
\begin{align*}
A &= \pi \left(\frac{d}{2}\right)^2 = \pi \cdot (0{,}3\text{ mm})^2 = 0{,}2827 \text{ mm}^2
\end{align*}
$$

Aus $R = \rho_s \cdot \dfrac{l}{A}$ folgt $l = \dfrac{R\cdot A}{\rho_s}$:

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Vorwiderstand | $R_{Vor}$ | $5{,}625$ Ω (exaktes Ergebnis aus a)) |
| | Querschnittsfläche | $A$ | $0{,}2827$ mm² |
| | spez. Widerstand Messing | $\rho_s$ | $0{,}0655\ \Omega\text{mm}^2/\text{m}$ |
| Gesucht | Drahtlänge | $l$ | |

$$
\begin{align*}
\text{Gegeben:} \\
R_{Vor} &= 5{,}625\ \Omega \\
A &= 0{,}2827 \text{ mm}^2 \\
\rho_s &= 0{,}0655\ \frac{\Omega\text{mm}^2}{\text{m}} \\
\text{Weg:} \\
l &= \frac{R_{Vor} \cdot A}{\rho_s} \\
&= \frac{5{,}625 \cdot 0{,}2827}{0{,}0655} \\
&= 24{,}28 \text{ m} \\
\text{ERG:} \quad l &= 24{,}28 \text{ m}
\end{align*}
$$

Es wird ein Messingdraht von **ca. 24,28 m Länge** benötigt. *(Mit dem in der Aufgabe angegebenen Notfallwert $R_{Vor}=6\,\Omega$ ergäbe sich stattdessen $l = 6\cdot 0{,}2827/0{,}0655 = 25{,}90$ m.)*

**5.2a) Betrag und Phase der Impedanz**

Bei der Reihenschaltung aus $R$, $L$ und $C$ addieren sich die komplexen Widerstände (Impedanzen):

$$
\begin{align*}
\underline{Z}_{ges} &= R + \underline{Z}_L + \underline{Z}_C = R + j\omega L - \frac{j}{\omega C}
\end{align*}
$$

Allgemein für Betrag und Phase:

$$
\begin{align*}
|\underline{Z}_{ges}| &= \sqrt{R^2+\left(\omega L-\frac{1}{\omega C}\right)^2} \\
\varphi &= \arctan\!\left(\frac{\omega L-\frac{1}{\omega C}}{R}\right)
\end{align*}
$$

Mit den Zahlenwerten $R=1000\,\Omega$, $L=0{,}02$ H, $C=1\cdot10^{-6}$ F, $f=50$ Hz:

$$
\begin{align*}
\text{Gegeben:} \\
R &= 1000\ \Omega \\
L &= 0{,}02 \text{ H} \\
C &= 1\cdot 10^{-6} \text{ F} \\
f &= 50 \text{ Hz} \\
\text{Weg:} \\
\omega &= 2\pi f \\
&= 2\pi \cdot 50 \\
&= 314{,}16 \text{ rad/s} \\
X_L &= \omega L \\
&= 314{,}16 \cdot 0{,}02 \\
&= 6{,}283\ \Omega \\
X_C &= \frac{1}{\omega C} \\
&= \frac{1}{314{,}16 \cdot 10^{-6}} \\
&= 3183{,}1\ \Omega \\
|\underline{Z}_{ges}| &= \sqrt{R^2+(X_L-X_C)^2} \\
&= \sqrt{1000^2+(6{,}283-3183{,}1)^2} \\
&= 3330{,}5\ \Omega \\
\varphi &= \arctan\!\left(\frac{X_L-X_C}{R}\right) \\
&= \arctan\!\left(\frac{6{,}283-3183{,}1}{1000}\right) \\
&= -72{,}53° \\
\text{ERG:} \quad |\underline{Z}_{ges}| &= 3330{,}5\ \Omega, \quad \varphi = -72{,}53°
\end{align*}
$$

Der Betrag der Impedanz beträgt **3330,5 Ω**, die Phase **−72,53°** (der Strom eilt der Spannung voraus — die Schaltung wirkt insgesamt kapazitiv, da $X_C > X_L$).

**5.2b) Resonanzfrequenz**

Reihenresonanz (Serienschwingkreis) liegt vor, wenn sich $X_L$ und $X_C$ gerade kompensieren, also $\omega L = \dfrac{1}{\omega C}$:

$$
\begin{align*}
\omega_{res} &= \frac{1}{\sqrt{LC}} \\
f_{res} &= \frac{\omega_{res}}{2\pi} = \frac{1}{2\pi\sqrt{LC}}
\end{align*}
$$

$$
\begin{align*}
\text{Gegeben:} \\
L &= 0{,}02 \text{ H} \\
C &= 1\cdot 10^{-6} \text{ F} \\
\text{Weg:} \\
\omega_{res} &= \frac{1}{\sqrt{LC}} \\
&= \frac{1}{\sqrt{0{,}02\cdot 10^{-6}}} \\
&= 7071{,}07 \text{ rad/s} \\
f_{res} &= \frac{\omega_{res}}{2\pi} \\
&= \frac{7071{,}07}{2\pi} \\
&= 1125{,}40 \text{ Hz} \\
\text{ERG:} \quad f_{res} &= 1125{,}40 \text{ Hz}
\end{align*}
$$

Die Resonanzfrequenz der Reihenschaltung beträgt **ca. 1125,4 Hz** (deutlich oberhalb der Netzfrequenz von 50 Hz — bei 50 Hz überwiegt daher, wie in a) gezeigt, deutlich der kapazitive Blindwiderstand).

**5.3) Gleichrichtwert der amplitudenbegrenzten Sinusspannung**

Die Spannung folgt $u(t)=\hat u\sin(\omega t)$, wird jedoch bei $|u|=\hat u/2$ hart begrenzt (Clipping), sodass ein trapezförmiger Verlauf entsteht: Anstieg gemäß Sinus bis zum Erreichen von $\hat u/2$, dann konstantes Plateau bei $\hat u/2$, danach wieder sinusförmiger Abfall — und spiegelbildlich in der negativen Halbwelle.

Der Sinus erreicht den Begrenzungswert $\hat u/2$ bei

$$
\begin{align*}
\hat u \sin(\omega t_1) &= \frac{\hat u}{2} \quad \Rightarrow \quad \omega t_1 = \arcsin\!\left(\frac12\right) = \frac{\pi}{6}
\end{align*}
$$

Wegen der Halbwellensymmetrie ($|u(t+T/2)|=|u(t)|$) genügt es, das Integral über eine Halbperiode ($0$ bis $\pi$ in $\omega t$) zu bilden und durch $\pi$ (statt $2\pi$) zu teilen. Die Halbperiode zerfällt in drei Abschnitte:

$$
\begin{align*}
|\bar u| &= \frac{1}{\pi}\left[\int_0^{\omega t_1} \hat u\sin(\omega t)\,d(\omega t) + \int_{\omega t_1}^{\pi-\omega t_1} \frac{\hat u}{2}\,d(\omega t) + \int_{\pi-\omega t_1}^{\pi} \hat u\sin(\omega t)\,d(\omega t)\right]
\end{align*}
$$

Die beiden Sinus-Teilintegrale sind wegen der Symmetrie gleich groß:

$$
\begin{align*}
\int_0^{\omega t_1}\hat u \sin(\omega t)\,d(\omega t) &= \hat u\left[-\cos(\omega t)\right]_0^{\pi/6} = \hat u\left(1-\cos\frac{\pi}{6}\right) = \hat u\left(1-\frac{\sqrt3}{2}\right)
\end{align*}
$$

Das Plateau-Integral:

$$
\begin{align*}
\int_{\pi/6}^{5\pi/6} \frac{\hat u}{2}\,d(\omega t) &= \frac{\hat u}{2}\left(\pi-2\cdot\frac{\pi}{6}\right) = \frac{\hat u}{2}\cdot\frac{2\pi}{3} = \frac{\pi \hat u}{3}
\end{align*}
$$

Zusammengefasst (zwei gleiche Sinus-Anteile + Plateau):

$$
\begin{align*}
|\bar u| &= \frac{1}{\pi}\left[2\hat u\left(1-\frac{\sqrt3}{2}\right) + \frac{\pi \hat u}{3}\right] \\
&= \frac{\hat u}{\pi}\left(2-\sqrt3+\frac{\pi}{3}\right) \\
&\approx 0{,}4186\,\hat u
\end{align*}
$$

**Der Gleichrichtwert beträgt $|\bar u| = \dfrac{\hat u}{\pi}\left(2-\sqrt3+\dfrac{\pi}{3}\right) \approx 0{,}4186\cdot\hat u$**, also rund 41,9 % der Scheitelspannung (zum Vergleich: eine unbegrenzte Sinusspannung hätte den Gleichrichtwert $\frac{2}{\pi}\hat u\approx 0{,}637\,\hat u$ — durch die Kappung bei $\hat u/2$ sinkt der Gleichrichtwert deutlich, da die hohen Momentanwerte fehlen).
