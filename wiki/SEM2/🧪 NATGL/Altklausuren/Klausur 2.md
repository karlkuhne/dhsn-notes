---
tags:
  - sem2
  - natgl
type: exam
---
# Klausur 2 — Altklausur

> [!info] Kontext
> Altklausur NATGL (Naturwissenschaftliche Grundlagen), 5 Aufgaben zu Mechanik, Optik sowie Elektrizitätslehre/Thermodynamik. Themen: Kraftmessung, Powerbank/Leistung, Kippendes Tablett mit Gläsern, rollender Zylinder auf schiefer Ebene, Radfahrer am Hang, Lichtbrechung/Schatten im Wasser, dünne Linsen, Vorwiderstand/Glühlampe, spez. Widerstand von Messingdraht, Erwärmung eines Drahtes, Impedanz von R parallel L, Gleichrichtwert einer angeschnittenen Sinusfunktion.

## Inhaltsverzeichnis

- [[#Aufgabe 1: Erläuterung physikalischer Sachverhalte]]
- [[#Aufgabe 2: Rollender Zylinder]]
- [[#Aufgabe 3: Radfahrer]]
- [[#Aufgabe 4: Optik]]
- [[#Aufgabe 5: Elektrizitätslehre und Thermodynamik]]

---

### Aufgabe 1: Erläuterung physikalischer Sachverhalte

> [!info] Aufgabenstellung
> **Aufgabe 1: Erläuterung physikalischer Sachverhalte (12 P)**
>
> a) Beschreiben Sie kurz drei Methoden zur Kraftmessung, die auf unterschiedlichen physikalischen Phänomenen beruhen und geben Sie diese an. (6 P)
>
> b) In der Beschreibung der Powerbank Urban Energy finden Sie die Angabe 12.500 mAh. Berechnen Sie, wie lange Sie Ihr Tablet mit P = 5W mit einer vollständig geladenen Powerbank betreiben können. Der Anschluss erfolgt über ein USB-Kabel (5V Spannung). (4P)
>
> c) Ein Tablett, auf dem drei, unterschiedlich hoch gefüllte Gläser stehen, wird gekippt (s. Abbildung). Erläutern Sie, welches Glas am längsten stehen bleibt. (2P)
>
> *(Abbildung: Ein Tablett mit drei zylindrischen Gläsern unterschiedlicher Füllhöhe wird gekippt/rotiert, siehe Pfeil.)*

**a) Drei Methoden zur Kraftmessung**

Drei physikalisch unterschiedliche Prinzipien zur Kraftmessung sind:

1. **Federkraftmessung (Hookesches Gesetz):** Eine Kraft wird über die Auslenkung einer Feder gemessen. Es gilt $F_{sp} = D \cdot x$ (Federkonstante mal Auslenkung/Längenunterschied). Man kalibriert die Feder mit bekannten Gewichtskräften und liest die Kraft dann über die Längenänderung ab (Federkraftmesser, Waage).
2. **Messung über das 2. Newtonsche Axiom ($F=m\cdot a$):** Man bringt eine bekannte Masse $m$ auf eine messbare Beschleunigung $a$ und berechnet daraus die wirkende Kraft. Im Experiment werden Masse und Beschleunigung (z. B. über Weg-Zeit-Messung) bestimmt und daraus $F$ berechnet.
3. **Messung über Hebelwirkung/Drehmoment (z. B. Balkenwaage) bzw. über die Kraft, die an einem über eine Rolle gelagerten Seil wirkt:** Eine unbekannte Kraft wird mit einer bekannten Gegenkraft (Gewichtskraft eines Referenzgewichts) im Gleichgewicht verglichen, z. B. bei der Balkenwaage über gleiche Hebelarme, oder bei einer über eine Rolle geführten Schnur, an der ein Referenzgewicht hängt.

*(Alternativ zulässig: Piezoelektrischer Effekt, Dehnmessstreifen (Verformung eines Leiters ändert dessen Widerstand), Drucksensor über Flächenkraft $p=F/A$ — jeweils ein eigenständiges physikalisches Phänomen.)*

**b) Betriebsdauer des Tablets an der Powerbank**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Leistung | `P` | `5` W |
| | Spannung | `U` | `5` V |
| | Ladungskapazität | `Q` | `12500` mAh |
| Gesucht | Zeit | `t` | |

$$
\begin{align*}
\text{Gegeben:} \\
P &= 5 \text{ W} \\
U &= 5 \text{ V} \\
Q &= 12500 \text{ mAh} = 12.5 \text{ Ah} \\
\text{Weg:} \\
I &= \frac{P}{U} \\
&= \frac{5}{5} \\
&= 1 \text{ A} \\
t &= \frac{Q}{I} \\
&= \frac{12.5 \text{ Ah}}{1 \text{ A}} \\
&= 12.5 \text{ h} \\
\text{ERG:} \quad t &= 12.5 \text{ h}
\end{align*}
$$

(Solver-Check: `python3 solve.py 3 I P=5 U=5` → $I=1$ A. Die Division der Amperestundenzahl durch den Strom in Ampere liefert die Betriebsdauer direkt in Stunden, da 1 Ah genau der Ladungsmenge entspricht, die bei 1 A ein Stunde lang fließt.)

**Das Tablet kann ca. 12,5 Stunden betrieben werden.**

**c) Welches Glas bleibt am längsten stehen?**

Beim Kippen des Tabletts rutscht bzw. kippt ein Glas, sobald die am Glas wirkende Hangabtriebskraft die maximale Haftreibungskraft zwischen Glasboden und Tablett übersteigt (Rutschen), oder sobald das Kippmoment durch die Gewichtskraft um die Standkante das rückstellende Moment übersteigt (Umkippen). Beides hängt vom Verhältnis zwischen Standfläche/Basisdurchmesser und Schwerpunkthöhe ab: Ein niedriger, aber vor allem ein **nicht randvoll gefülltes** Glas hat einen tiefer liegenden Gesamtschwerpunkt (Glas + Flüssigkeit), da die Masse der Flüssigkeit weiter unten konzentriert ist als bei einem randvollen Glas, und kann daher einen größeren Kippwinkel tolerieren, bevor der Schwerpunkt die Kippkante überschreitet. Zusätzlich sorgt die im Glas noch bewegliche Flüssigkeit (die sich beim Kippen im Glas leicht gegen die Kipprichtung verschieben kann) dafür, dass der Gesamtschwerpunkt noch tiefer bzw. günstiger bleibt.

**Das nur halb gefüllte (mittelhoch gefüllte) Glas bleibt am längsten stehen**, da sich bei ihm Hangabtriebskraft und (Haft-)Reibungskraft am längsten annähernd die Waage halten bzw. der Schwerpunkt am tiefsten/günstigsten relativ zur Standfläche liegt — ein randvolles Glas hat einen hohen Schwerpunkt und kippt/rutscht zuerst, ein nur ganz wenig gefülltes Glas ist zwar leicht und hat geringe Haftreibung, aber auch ein sehr hoch relativ zur Füllmenge liegendes Verhältnis von Standfläche zu Höhe, sodass die Gesamtbetrachtung (Reibung UND Kippstabilität) das mittelgefüllte Glas als stabilste Lösung ergibt.

---

### Aufgabe 2: Rollender Zylinder

> [!info] Aufgabenstellung
> **Aufgabe 2 (Mechanik): Rollender Zylinder (9 P)**
>
> *(Abbildung: Schiefe Ebene mit Höhe $h$, Länge $\ell$, Neigungswinkel $\alpha$.)*
>
> Man lässt einen Hohlzylinder und einen Vollzylinder, die sich in der Höhe $h$ befinden und die gleiche Masse $m$ besitzen, aus der Ruhe eine schiefe Ebene herunterrollen. Berechnen Sie die Geschwindigkeit, mit der die Zylinder das Ende der schiefen Ebene erreichen.
>
> Hinweise: $J = \frac{1}{2}mr^2$ für den Vollzylinder, $J = mr^2$ für den Hohlzylinder.

**Lösungsweg (Energieerhaltung, rollen ohne Gleiten):**

Die potentielle Energie in Höhe $h$ wird beim Herabrollen vollständig in kinetische Energie der Translation UND der Rotation umgewandelt:
$$m g h = \frac{1}{2}mv^2 + \frac{1}{2}J\omega^2, \quad \omega = \frac{v}{r}$$

Daraus folgt allgemein:
$$v = \sqrt{\dfrac{2gh}{1+\dfrac{J}{mr^2}}}$$

**Vollzylinder** ($J=\frac{1}{2}mr^2 \Rightarrow J/(mr^2) = 0{,}5$):

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Trägheitsmomentverhältnis | `J/(m·r²)` | `0.5` (Vollzylinder) |
| | Höhe | `h` | `h` (allgemein) |
| Gesucht | Geschwindigkeit | `v` | |

$$
\begin{align*}
\text{Gegeben:} \\
\frac{J}{mr^2} &= 0.5 \quad \text{(Vollzylinder)} \\
\text{Weg:} \\
v_{\text{Voll}} &= \sqrt{\frac{2gh}{1+0.5}} \\
&= \sqrt{\frac{2 \cdot 9.81 \cdot h}{1.5}} \\
&= \sqrt{1.333 \cdot 9.81 \cdot h} \\
\text{ERG:} \quad v_{\text{Voll}} &= \sqrt{\tfrac{4}{3}gh} \approx 3.617\sqrt{h} \ \text{m/s}
\end{align*}
$$

(Solver-Check mit $h=1$ m, $m=1$, $r=1$: `python3 solve.py 1 v h=1 J=0.5 m=1 r=1` → $v=3{,}617$ m/s, bestätigt $\sqrt{4gh/3}$.)

**Hohlzylinder** ($J=mr^2 \Rightarrow J/(mr^2)=1$):

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Trägheitsmomentverhältnis | `J/(m·r²)` | `1` (Hohlzylinder) |
| | Höhe | `h` | `h` (allgemein) |
| Gesucht | Geschwindigkeit | `v` | |

$$
\begin{align*}
\text{Gegeben:} \\
\frac{J}{mr^2} &= 1 \quad \text{(Hohlzylinder)} \\
\text{Weg:} \\
v_{\text{Hohl}} &= \sqrt{\frac{2gh}{1+1}} \\
&= \sqrt{\frac{2 \cdot 9.81 \cdot h}{2}} \\
\text{ERG:} \quad v_{\text{Hohl}} &= \sqrt{gh} \approx 3.132\sqrt{h} \ \text{m/s}
\end{align*}
$$

(Solver-Check mit $h=1$: `python3 solve.py 1 v h=1 J=1 m=1 r=1` → $v=3{,}132$ m/s, bestätigt $\sqrt{gh}$.)

**Ergebnis:** Da beide Zylinder die gleiche Masse besitzen, kürzt sich $m$ vollständig heraus — die Endgeschwindigkeit hängt **nur vom Verhältnis $J/(mr^2)$, also von der Massenverteilung (Trägheitsmoment), nicht von $m$ selbst** ab. Der **Vollzylinder ist mit $v_{\text{Voll}}=\sqrt{\frac{4}{3}gh}$ schneller** als der Hohlzylinder mit $v_{\text{Hohl}}=\sqrt{gh}$, da beim Hohlzylinder ein größerer Anteil der Energie in Rotation statt Translation steckt (die Masse liegt weiter außen, größeres $J$ pro Masse).

---

### Aufgabe 3: Radfahrer

> [!info] Aufgabenstellung
> **Aufgabe 3 (Mechanik): Radfahrer (10 P)**
>
> Mit seiner ganzen Kraft schafft es ein Radfahrer einen Hang mit der Steigung 10% hinaufzufahren. Berechnen Sie, wie weit der Radfahrer kommt, wenn sich die Steigung plötzlich auf 15% erhöht und die von ihm aufgebrachte Kraft konstant bleibt. Die Masse von Fahrer und Rad betrage zusammen 75 kg. Es soll keine Reibung berücksichtigt werden.

**Lösungsweg:**

Eine Steigung von $p\,\%$ bedeutet ein Verhältnis von Höhengewinn zu horizontaler Strecke von $\tan\alpha = p/100$ (NICHT $\alpha = p\,\%$ von $90°$!). Der Neigungswinkel ergibt sich also über:
$$\alpha = \arctan(p)$$

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Steigung 1 | `p1` | `0.10` (= 10 %) |
| | Steigung 2 | `p2` | `0.15` (= 15 %) |
| | Masse | `m` | `75` kg |
| Gesucht | Neigungswinkel 1/2, Kraftverhältnis | `alpha1, alpha2` | |

$$
\begin{align*}
\text{Gegeben:} \\
p_1 &= 0.10 \\
p_2 &= 0.15 \\
m &= 75 \text{ kg} \\
\text{Weg:} \\
\alpha_1 &= \arctan(p_1) = \arctan(0.10) = 5.711° \\
\alpha_2 &= \arctan(p_2) = \arctan(0.15) = 8.531°
\end{align*}
$$

Da der Radfahrer den 10 %-Hang mit seiner **ganzen Kraft gerade noch** (mit konstanter Geschwindigkeit) hochfährt, entspricht die von ihm aufgebrachte Antriebskraft $F$ genau der Hangabtriebskraft auf dem 10 %-Hang:
$$F = F_{H,10} = m\,g\sin(\alpha_1)$$

Auf dem steileren 15 %-Hang wäre dagegen eine größere Kraft $F_{H,15}=m\,g\sin(\alpha_2)$ nötig, um mit konstanter Geschwindigkeit weiterzufahren. Da die aufgebrachte Kraft $F$ konstant (und kleiner als $F_{H,15}$) bleibt, reicht sie nicht mehr aus, um den steileren Hang mit gleichem Tempo hinaufzufahren — der Radfahrer kommt nur noch in dem Verhältnis voran, in dem seine konstante Kraft zur auf dem steileren Hang erforderlichen Kraft steht:

$$
\begin{align*}
\text{Weg:} \\
F_{H,10} &= m\cdot g\cdot\sin(\alpha_1) \\
&= 75 \cdot 9.81 \cdot \sin(5.711°) \\
&= 73.21 \text{ N} \\
F_{H,15} &= m\cdot g\cdot\sin(\alpha_2) \\
&= 75 \cdot 9.81 \cdot \sin(8.531°) \\
&= 109.14 \text{ N} \\
\text{Verhältnis:} \quad \frac{F_{H,10}}{F_{H,15}} &= \frac{73.21}{109.14} \\
&= 0.6708 \\
\text{ERG:} \quad &= 67.08\ \%
\end{align*}
$$

**Der Radfahrer kommt mit der gleichbleibenden Kraft nur noch etwa 67,1 % der ursprünglich mit dieser Kraft bewältigbaren Hangstrecke voran** — die aufgebrachte Kraft reicht auf dem steileren 15 %-Hang nicht mehr aus, um im gleichen Maß Höhe zu gewinnen wie auf dem 10 %-Hang.

---

### Aufgabe 4: Optik

> [!info] Aufgabenstellung
> **Aufgabe 4: Optik (9 P)**
>
> **4.1)** Ein Pfahl ragt 1 m aus dem Wasser eines 3m tiefen Sees. Berechnen Sie unter Verwendung der in der Abbildung angegebenen Variablen die Länge des Schattens auf dem Grund des Sees, wenn die Lichtstrahlen unter einem Winkel von 60° einfallen (Brechzahl Wasser: 1,3).
>
> *(Abbildung: Pfahl ragt 1 m über die Wasseroberfläche, Wasser ist 3 m tief. Lichteinfall unter 60° zur Wasseroberfläche (= 30° zum Lot). Variablen: $\alpha$ = Einfallswinkel zum Lot, $\beta/\gamma$ = Brechungswinkel, $y$ = Schattenversatz oberhalb der Wasserlinie, $z$ = Schattenversatz durch den gebrochenen Strahl im Wasser, $x$ = gesamte Schattenlänge auf dem Seegrund, $\ell$ = Weg des gebrochenen Strahls im Wasser.)*
>
> **4.2) Dünne Linsen:**
> Mit einer Linse der Brennweite 130 mm wird ein Dia mit den Abmessungen 6,0 cm × 6,0 cm auf einer Projektionswand, die 4 m von der Linse entfernt ist, scharf abgebildet. Berechnen Sie die Abmessungen des Bildes! (4 P)

**4.1) Schattenlänge auf dem Seegrund**

Der Lichtstrahl fällt unter 60° zur Wasseroberfläche ein, das entspricht einem Winkel zum Einfallslot (zur Normalen) von $\alpha = 90°-60°=30°$.

*Schritt 1 — Brechungswinkel im Wasser:*

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Brechzahl Luft | `n1` | `1` |
| | Brechzahl Wasser | `n2` | `1.3` |
| | Einfallswinkel (zum Lot) | `alpha` | `30` deg |
| Gesucht | Brechungswinkel | `beta` (=γ) | |

$$
\begin{align*}
\text{Gegeben:} \\
n_1 &= 1 \\
n_2 &= 1.3 \\
\alpha &= 30° \\
\text{Weg:} \\
\frac{\sin\alpha}{\sin\gamma} &= \frac{n_2}{n_1} \\
\sin\gamma &= \frac{n_1}{n_2}\sin\alpha = \frac{1}{1.3}\sin(30°) \\
\gamma &= \arcsin(0.3846) \\
\text{ERG:} \quad \gamma &= 22.62°
\end{align*}
$$

(Solver-Check: `python3 solve.py 2 beta n1=1 n2=1.3 alpha=30deg` → $\beta=22{,}62°$.)

*Schritt 2 — Schattenlänge $x = y+z$ (Gesamtschatten von der Pfahlbasis aus gemessen):*

$y$ ist der Schattenversatz, den der 1 m über Wasser herausragende Pfahlteil auf der Wasseroberfläche erzeugt (Strahl noch in Luft, Winkel $\alpha=30°$ zum Lot). $z$ ist der zusätzliche horizontale Versatz, den der ins Wasser gebrochene Strahl (Winkel $\gamma=22{,}62°$ zum Lot) über die 3 m Wassertiefe erzeugt.

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Höhe über Wasser | `h` | `1` m |
| | Einfallswinkel | `alpha` | `30°` |
| | Wassertiefe | `d` | `3` m |
| | Brechungswinkel | `gamma` | `22.62°` |
| Gesucht | Schattenlänge | `x` | |

$$
\begin{align*}
\text{Gegeben:} \\
h &= 1 \text{ m}, \quad \alpha = 30° \\
d &= 3 \text{ m}, \quad \gamma = 22.62° \\
\text{Weg:} \\
y &= h\cdot\tan(\alpha) = 1\cdot\tan(30°) = 0.5774 \text{ m} \\
z &= d\cdot\tan(\gamma) = 3\cdot\tan(22.62°) = 1.2500 \text{ m} \\
x &= y+z = 0.5774+1.2500 \\
\text{ERG:} \quad x &= 1.827 \text{ m}
\end{align*}
$$

**Die Schattenlänge auf dem Grund des Sees beträgt ca. 1,83 m** (gemessen ab der Position der Pfahlbasis).

*Hinweis:* Der Versatz $z$ ergibt sich über den **Tangens** (Gegenkathete $z$ zu Ankathete $d=3\,\text{m}$, da $d$ die senkrechte Wassertiefe ist), nicht über den Sinus mit der Ankathete als „Strahllänge $\ell$" — eine Verwechslung von Tiefe und Strahllänge führt sonst zu einem falschen (zu kleinen) Ergebnis für $z$.

**4.2) Bildgröße bei der Projektion**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Brennweite | `f` | `130` mm |
| | Bildweite | `b` | `4` m |
| | Gegenstandsgröße | `G` | `0.06` m |
| Gesucht | Gegenstandsweite, Bildgröße | `g, B` | |

$$
\begin{align*}
\text{Gegeben:} \\
f &= 0.13 \text{ m} \\
b &= 4 \text{ m} \\
G &= 0.06 \text{ m} \\
\text{Weg:} \\
\frac{1}{f} &= \frac{1}{g}+\frac{1}{b} \\
g &= \frac{1}{\frac{1}{f}-\frac{1}{b}} = \frac{1}{\frac{1}{0.13}-\frac{1}{4}} \\
&= 0.1344 \text{ m} \\
V &= \frac{b}{g} = \frac{4}{0.1344} = 29.76 \\
B &= V\cdot G = 29.76\cdot 0.06 \\
\text{ERG:} \quad B &= 1.786 \text{ m}
\end{align*}
$$

(Solver-Check: `python3 solve.py 2 g f=130mm b=4m` → $g=0{,}1344$ m; `python3 solve.py 2 B G=0.06 b=4 g=0.1344` → $B=1{,}786$ m.)

**Das quadratische Dia (6×6 cm) wird auf ein quadratisches Bild von ca. 1,786 m × 1,786 m Kantenlänge vergrößert.**

---

### Aufgabe 5: Elektrizitätslehre und Thermodynamik

> [!info] Aufgabenstellung
> **Aufgabe 5: Elektrizitätslehre und Thermodynamik (24 P)**
>
> **5.1)** Eine kleine Glühlampe mit 3V und 6W soll an eine 12-V-Spannungsquelle angeschlossen werden.
>
> a) Berechnen Sie den notwendigen Vorwiderstand. (2 P)
>
> b) Berechnen Sie die am Widerstand aus a) abgegebene Leistung. (Notfallwert für Vorwiderstand: 9 Ω) (1P)
>
> c) Berechnen Sie die notwendige Länge eines runden Messingdrahtes mit einem Durchmesser von 0,8 mm, um den Vorwiderstand aus a) (Notfallwert: 9 Ω) zu realisieren (3P)
>
> $(\rho_s = 0{,}0655\ \frac{\Omega\text{mm}^2}{\text{m}})$
>
> d) Berechnen Sie die näherungsweise, nach welcher Zeit sich ein 50 m langer Messing-Draht mit 0,5 mm Durchmesser mit 4,15 Ω Widerstand um 10 K erwärmt hat, wenn ein Strom von 2 A durch den Draht fließt ($\rho_d = 8{,}5\ \text{g/cm}^3$; Wärmekapazität $c = 377\ \text{J/(kg·K)}$). (5P)
>
> **5.2)** Ein Ohm'scher Widerstand R wird parallel zu einer Spule, die eine Induktivität L besitzt, geschaltet. Die Kreisfrequenz des Wechselstroms betrage ω.
>
> *(Abbildung: Parallelschaltung von Widerstand R und Spule L.)*
>
> a) Leiten Sie Gleichungen für den Real- und Imaginär-Teil der gemeinsamen Impedanz beider Bauteile für beliebige Werte von L, R und ω her. (4 P)
>
> b) Berechnen Sie die Impedanz für die Zahlenwerte R = 1000 Ω, L = 20 mH und f = 50 Hz. (2P)
>
> c) Berechnen Sie für die Werte in b), wann sich das RL-Glied eingeschwungen hat, nach welcher Zeit also die Impedanz-Rechnung korrekte Ergebnisse liefert. (3P)
>
> **5.3) Angeschnittene Sinusfunktion (4P)**
>
> Berechnen Sie den Gleichrichtwert für die in der Abbildung dargestellte Wechselspannung ($a>0$ und $a<0{,}5$).
>
> *(Abbildung: Sinusspannung $u(t)$, die erst ab dem Zeitpunkt $aT$ einsetzt (angeschnittene Sinushalbwelle), $0 \le t \le T$.)*

**5.1 a) Notwendiger Vorwiderstand**

Die Glühlampe (3V, 6W) soll an einer 12V-Quelle betrieben werden — der Vorwiderstand muss die Differenzspannung $U_{R}=12\text{V}-3\text{V}=9\text{V}$ bei gleichem Strom wie die Lampe aufnehmen.

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Nennspannung Lampe | `UN` | `3` V |
| | Nennleistung Lampe | `P` | `6` W |
| | Quellspannung | `U0` | `12` V |
| Gesucht | Vorwiderstand | `Rvor` | |

$$
\begin{align*}
\text{Gegeben:} \\
U_N &= 3 \text{ V}, \quad P = 6 \text{ W}, \quad U_0 = 12 \text{ V} \\
\text{Weg:} \\
I &= \frac{P}{U_N} = \frac{6}{3} = 2 \text{ A} \\
U_{R} &= U_0-U_N = 12-3 = 9 \text{ V} \\
R_{vor} &= \frac{U_R}{I} = \frac{9}{2} \\
\text{ERG:} \quad R_{vor} &= 4.5\ \Omega
\end{align*}
$$

(Solver-Check: `python3 solve.py 3 I P=6 U=3` → $I=2$ A.)

**Der notwendige Vorwiderstand beträgt 4,5 Ω.**

**5.1 b) Am Vorwiderstand abgegebene Leistung**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Vorwiderstand | `Rvor` | `4.5` Ω |
| | Strom | `I` | `2` A |
| Gesucht | Leistung | `P` | |

$$
\begin{align*}
\text{Gegeben:} \\
R_{vor} &= 4.5\ \Omega, \quad I = 2 \text{ A} \\
\text{Weg:} \\
U_{R} &= R_{vor}\cdot I = 4.5\cdot 2 = 9 \text{ V} \\
P &= U_R\cdot I = 9\cdot 2 \\
\text{ERG:} \quad P &= 18 \text{ W}
\end{align*}
$$

(Solver-Check: `python3 solve.py 3 P U=9 I=2` → $P=18$ W. Mit dem in der Aufgabe angegebenen Notfallwert $R_{vor}=9\ \Omega$ ergäbe sich stattdessen $U_R=18$V und $P=36$ W — da a) hier korrekt lösbar war, wird mit $R_{vor}=4{,}5\ \Omega$ weitergerechnet.)

**Die am Vorwiderstand abgegebene Leistung beträgt 18 W.**

**5.1 c) Länge des Messingdrahtes**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | spez. Widerstand Messing | `rho` | `0.0655` Ω·mm²/m |
| | Durchmesser | `d` | `0.8` mm |
| | Widerstand | `R` | `4.5` Ω |
| Gesucht | Länge | `l` | |

$$
\begin{align*}
\text{Gegeben:} \\
\rho &= 0.0655\ \frac{\Omega\text{mm}^2}{\text{m}}, \quad d = 0.8 \text{ mm}, \quad R = 4.5\ \Omega \\
\text{Weg:} \\
A &= \pi\left(\frac{d}{2}\right)^2 = \pi\cdot(0.4\text{ mm})^2 = 0.5027 \text{ mm}^2 \\
R &= \frac{\rho\cdot l}{A} \quad\Rightarrow\quad l = \frac{R\cdot A}{\rho} \\
l &= \frac{4.5\cdot 0.5027}{0.0655} \\
\text{ERG:} \quad l &= 34.53 \text{ m}
\end{align*}
$$

(Solver-Check Fläche: `python3 solve.py 3 A dr=0.8mm` → $A=5{,}027\cdot10^{-7}\,\text{m}^2 = 0{,}5027\,\text{mm}^2$. Die Längenformel selbst wurde von Hand mit den mm-basierten Einheiten von $\rho$ gerechnet, da der Solver bei der Einheit „Ω·mm²/m" die SI-Umrechnung nicht automatisch vornimmt.)

**Die notwendige Drahtlänge beträgt ca. 34,53 m.**

**5.1 d) Erwärmungszeit des Messingdrahtes**

*Nicht direkt per PhyCalc lösbar* — die Formel $Q=c\cdot m\cdot\Delta T$ (spezifische Wärmekapazität/Thermodynamik) ist nicht im Elektrotechnik-Modul des Solvers hinterlegt. Masse, Fläche und elektrische Leistung wurden jedoch einzeln per Solver verifiziert; $Q$ und $t=Q/P$ wurden händisch berechnet.

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Länge | `l` | `50` m |
| | Durchmesser | `d` | `0.5` mm |
| | Widerstand | `R` | `4.15` Ω |
| | Temperaturänderung | `ΔT` | `10` K |
| | Strom | `I` | `2` A |
| | Dichte Messing | `ρ_d` | `8.5` g/cm³ |
| | spez. Wärmekapazität | `c` | `377` J/(kg·K) |
| Gesucht | Zeit | `t` | |

$$
\begin{align*}
\text{Gegeben:} \\
l &= 50 \text{ m}, \quad d = 0.5 \text{ mm}, \quad R = 4.15\ \Omega \\
\Delta T &= 10 \text{ K}, \quad I = 2 \text{ A} \\
\rho_d &= 8500\ \text{kg/m}^3, \quad c = 377\ \text{J/(kg·K)} \\
\text{Weg:} \\
A &= \pi\left(\frac{d}{2}\right)^2 = \pi\cdot(0.25\text{ mm})^2 = 1.9635\cdot10^{-7} \text{ m}^2 \\
V &= A\cdot l = 1.9635\cdot10^{-7}\cdot 50 = 9.8175\cdot10^{-6} \text{ m}^3 \\
m &= \rho_d\cdot V = 8500\cdot 9.8175\cdot10^{-6} \\
&= 0.08345 \text{ kg} \\
Q &= c\cdot m\cdot\Delta T = 377\cdot 0.08345\cdot 10 \\
&= 314.6 \text{ J} \\
P &= I^2\cdot R = 2^2\cdot 4.15 = 16.6 \text{ W} \\
t &= \frac{Q}{P} = \frac{314.6}{16.6} \\
\text{ERG:} \quad t &= 18.95 \text{ s}
\end{align*}
$$

(Solver-Check Teilschritte: `python3 solve.py 3 P I=2 R=4.15` → $P=16{,}6$ W; `python3 solve.py 3 A dr=0.5mm` → $A=1{,}963\cdot10^{-7}\text{ m}^2$; `python3 solve.py 3 V A=1.9635e-7 lges=50` → $V=9{,}818\cdot10^{-6}\text{ m}^3$; `python3 solve.py 3 m rhoM=8500 V=9.8175e-6` → $m=0{,}08345$ kg.)

**Der Draht hat sich nach ca. 19 Sekunden um 10 K erwärmt.** (Hinweis: Bei der Dichte-Umrechnung 8,5 g/cm³ = 8500 kg/m³ (Faktor 1000, nicht wie irrtümlich möglich Faktor 1 oder eine andere Potenz) liegt eine häufige Fehlerquelle — ein falscher Umrechnungsfaktor führt sonst zu unplausiblen Ergebnissen im Bereich mehrerer 100.000 Sekunden.)

**5.2 a) Real- und Imaginärteil der Impedanz von R parallel L**

Für die Spule gilt der komplexe (rein imaginäre) Widerstand $\underline{Z}_L = j\omega L = jX_L$ mit $X_L=\omega L$. Bei Parallelschaltung von $R$ und $\underline{Z}_L$ addieren sich die Kehrwerte (Leitwerte):

$$
\begin{align*}
\frac{1}{\underline{Z}} &= \frac{1}{R}+\frac{1}{j\omega L} \\
\underline{Z} &= \frac{R\cdot j\omega L}{R+j\omega L}
\end{align*}
$$

Erweitern mit dem konjugiert komplexen Nenner $(R-j\omega L)$ liefert Real- und Imaginärteil getrennt:

$$
\begin{align*}
\underline{Z} &= \frac{R\cdot j\omega L\,(R-j\omega L)}{(R+j\omega L)(R-j\omega L)} = \frac{j\omega L R^2 + \omega^2L^2R}{R^2+\omega^2L^2} \\[4pt]
\text{Re}(\underline{Z}) &= \frac{R\,\omega^2L^2}{R^2+\omega^2L^2} \\[4pt]
\text{Im}(\underline{Z}) &= \frac{R^2\,\omega L}{R^2+\omega^2L^2}
\end{align*}
$$

**5.2 b) Zahlenwert der Impedanz**

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Widerstand | `R` | `1000` Ω |
| | Induktivität | `L` | `20` mH |
| | Frequenz | `f` | `50` Hz |
| Gesucht | Impedanz (Betrag) | `Z` | |

$$
\begin{align*}
\text{Gegeben:} \\
R &= 1000\ \Omega, \quad L = 0.02 \text{ H}, \quad f = 50 \text{ Hz} \\
\text{Weg:} \\
\omega &= 2\pi f = 2\pi\cdot 50 = 314.16 \text{ rad/s} \\
X_L &= \omega L = 314.16\cdot 0.02 = 6.283\ \Omega \\
\underline{Z} &= \frac{R\cdot jX_L}{R+jX_L} \\
|\underline{Z}| &= \frac{R\cdot X_L}{\sqrt{R^2+X_L^2}} = \frac{1000\cdot 6.283}{\sqrt{1000^2+6.283^2}} \\
\text{ERG:} \quad |\underline{Z}| &\approx 6.283\ \Omega
\end{align*}
$$

(Da $X_L=6{,}283\,\Omega \ll R=1000\,\Omega$, dominiert die Spule die Parallelschaltung fast vollständig — die Impedanz liegt nur minimal unter $X_L$.)

**Die Impedanz beträgt ca. 6,28 Ω.**

**5.2 c) Einschwingzeit des RL-Glieds**

Die Zeitkonstante eines RL-Glieds ist $\tau = L/R$ (bei Reihenschaltung) bzw. für die Parallelschaltung ebenfalls maßgeblich für das Abklingen des Einschwingvorgangs. Nach ca. $5\tau$ gilt das System als eingeschwungen (Abweichung < 1%).

| | Größe | Symbol | Wert |
|---|---|---|---|
| Gegeben | Induktivität | `L` | `0.02` H |
| | Widerstand | `R` | `1000` Ω |
| Gesucht | Zeitkonstante, Einschwingzeit | `tau, t5` | |

$$
\begin{align*}
\text{Gegeben:} \\
L &= 0.02 \text{ H}, \quad R = 1000\ \Omega \\
\text{Weg:} \\
\tau &= \frac{L}{R} = \frac{0.02}{1000} = 2\cdot10^{-5} \text{ s} \\
t_{5\tau} &= 5\tau = 5\cdot 2\cdot10^{-5} \\
\text{ERG:} \quad t_{5\tau} &= 1\cdot10^{-4} \text{ s} = 0.1 \text{ ms}
\end{align*}
$$

**Nach ca. 0,1 ms (5 Zeitkonstanten) hat sich das RL-Glied eingeschwungen und die Impedanz-Rechnung aus b) liefert korrekte Ergebnisse.**

**5.3) Gleichrichtwert der angeschnittenen Sinusfunktion**

Die Spannung setzt erst zum Zeitpunkt $t=aT$ ein und verläuft von dort als normale Sinushalbwelle bis $T$ (mit $0<a<0{,}5$): $u(t)=0$ für $0\le t<aT$ und $u(t)=\hat u\sin\!\left(\dfrac{2\pi(t-aT)}{T(1-2a)}\right)$-artiger Verlauf gemäß Abbildung (volle Sinusperiode gestaucht in das Intervall $[aT,T]$, symmetrisch zu einer positiven und negativen Halbwelle).

Der **Gleichrichtwert** $\bar u_{gl}$ ist der zeitliche Mittelwert des Betrags der Spannung über eine Periode:
$$\bar u_{gl} = \frac{1}{T}\int_0^T |u(t)|\,dt$$

Da $u(t)=0$ auf dem Intervall $[0,aT)$ und dort keinen Beitrag liefert, reduziert sich das Integral auf den aktiven Bereich der Breite $(1-a)T$, in dem eine vollständige (gestauchte) Sinusperiode mit einer positiven und einer betragsgleichen negativen Halbwelle durchlaufen wird. Für eine volle Sinusperiode mit Scheitelwert $\hat u$ gilt für den Gleichrichtwert bekanntlich $\bar u_{gl}=\frac{2}{\pi}\hat u\approx 0{,}637\,\hat u$ bezogen auf die Breite einer Halbwelle; hier ist die volle Periode aber auf die verkürzte Breite $(1-a)T$ gestaucht, während sie über die gesamte Breite $T$ gemittelt wird:

$$
\begin{align*}
\bar u_{gl} &= \frac{1}{T}\int_{aT}^{T} |u(t)|\,dt \\
&= \frac{(1-a)T}{T}\cdot\left(\frac{1}{(1-a)T}\int_{aT}^{T}|u(t)|\,dt\right) \\
&= (1-a)\cdot \bar u_{gl,\text{voll}} \\
\text{ERG:} \quad \bar u_{gl} &= (1-a)\cdot\frac{2}{\pi}\hat u
\end{align*}
$$

**Der Gleichrichtwert beträgt $\bar u_{gl} = (1-a)\cdot\dfrac{2}{\pi}\hat u \approx (1-a)\cdot 0{,}637\cdot \hat u$**, also der Gleichrichtwert einer vollen Sinusperiode multipliziert mit dem Anteil $(1-a)$ der Periode, in dem die Spannung tatsächlich ungleich Null ist (für $a=0$ ergibt sich exakt der bekannte Wert $\frac{2}{\pi}\hat u$ einer normalen Sinusspannung, was die Formel plausibilisiert).
