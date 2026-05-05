---
tags: [sem2, natgl]
type: lecture
sources: ["Aufgaben_Sammlung_Medieninformatik_Stud.pdf"]
date: 2026-05-05
updated: 2026-05-05
---
> [!abstract] Übungsaufgaben zu den Themen aus: [[0. Physik Einführung]], [[1. Mechanik]]

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

Weitere Aufgaben zur Kinematik: http://www.poenitz-net.de/Physik/ 1.Mechanik/1.2.A.Kinematik.pdf


**05.05.26**
## Dynamik (AB2)

### Aufgabe 1: 2. Newtonsches Axiom

> [!info] Aufgabenstellung
> a) Berechnen Sie die Kraft, die benötigt wird, um einen 1 kg schweren Körper in 3 Sekunden von 0 auf 2 m/s zu beschleunigen.

**Gegeben & Gesucht**
Gegeben:
- Masse $m = 1 \text{ kg}$
- Zeit $\Delta t = 3 \text{ s}$
- Geschwindigkeitsänderung $\Delta v = 2 \text{ m/s} - 0 \text{ m/s} = 2 \text{ m/s}$

Gesucht: Kraft $F$

1. Beschleunigung berechnen:
$$a = \frac{\Delta v}{\Delta t} = \frac{2 \text{ m/s}}{3 \text{ s}}$$

2. Kraft berechnen (2. Newtonsches Axiom):
$$F = m \cdot a = 1 \text{ kg} \cdot \frac{2}{3} \text{ m/s}^2 = \frac{2}{3} \text{ N} \approx 0,667 \text{ N}$$

> [!info] Aufgabenstellung
> b) Berechnen Sie, wie schnell wird 1,5 t schweres Auto nach 10 Sekunden ist, wenn seine Reifen jede Sekunde eine Kraft von 2 kN auf die Straße übertragen.

**Gegeben & Gesucht**
Gegeben:
- Masse $m=1.5 \text{ t} = 1500 \text{ kg}$
- Zeit $\Delta t = 10 \text{ s}$
- Kraft $F = 2 \text{ kN}$

Gesucht: Geschwindigkeit $v$ nach $10 \text { s}$

1. Formel aufstellen und umstellen:
$$F = m \cdot \frac{\Delta v}{\Delta t}$$

2. Multipliziert man beide Seiten mit $\Delta t$, erhält man:
$$F \cdot \Delta t = m \cdot \Delta v$$

3. Teilt man nun durch $m$, erhält man die Formel für $\Delta v$:
$$\Delta v = \frac{F \cdot \Delta t}{m}$$

4. Werte einsetzen:
$$\Delta v = \frac{2000 \text{ N} \cdot 10 \text{ s}}{1500 \text{ kg}} = \frac{20000}{1500} \text{ m/s} = \frac{40}{3} \text{ m/s} \approx 13,33 \text{ m/s}$$

Das Auto ist nach 10 Sekunden also $13,33 \text{ m/s}$ (das entspricht etwa $48 \text{ km/h}$) schnell.


> [!info] Aufgabenstellung
> c) Berechnen Sie die Kraft, die auf ein 2 t schweres Fahrzeug wirkt, das mit 54 km/h auf einen Brückenpfeiler prallt und dabei in 0,1 s zum Stillstand kommt.

**Gegeben & Gesucht**
Gegeben:
- Masse $m = 2 \text{ t} = 2000 \text{ kg}$
- Anfangsgeschwindigkeit $v_0 = 54 \text{ km/h} = \frac{54}{3,6} \text{ m/s} = 15 \text{ m/s}$
- Endgeschwindigkeit $v_1 = 0 \text{ m/s}$ (Stillstand)
- Zeitdauer $\Delta t = 0,1 \text{ s}$

Gesucht: Kraft $F$


 1. Geschwindigkeitsänderung und Beschleunigung berechnen:
$$\Delta v = v_1 - v_0 = 0 \text{ m/s} - 15 \text{ m/s} = -15 \text{ m/s}$$
$$a = \frac{\Delta v}{\Delta t} = \frac{-15 \text{ m/s}}{0,1 \text{ s}} = -150 \text{ m/s}^2$$
(Das Minuszeichen gibt an, dass es sich um eine Abbremsung handelt.)*

2. Kraft berechnen (2. Newtonsches Axiom):
$$F = m \cdot a = 2000 \text{ kg} \cdot (-150 \text{ m/s}^2) = -300.000 \text{ N}$$

Die auf das Fahrzeug wirkende Kraft hat also einen Betrag von **$300.000 \text{ N}$** (oder **$300 \text{ kN}$**). Sie wirkt der ursprünglichen Fahrtrichtung entgegen.


> [!info] Aufgabenstellung
> d) Berechnen Sie die Masse eines Körpers, der durch eine konstante Kraft von 10 N gleichmäßig aus der Ruhe heraus beschleunigt wird und dabei in 20 Sekunden eine Strecke von 200 m zurücklegt.

**Gegeben & Gesucht**
Gegeben:
- Kraft $F = 10 \text{ N}$
- Zeit $t = 20 \text{ s}$
- Strecke $s = 200 \text{ m}$
- Anfangsgeschwindigkeit $v_0 = 0 \text{ m/s}$ (aus der Ruhe)

Gesucht: Masse $m$

1. Beschleunigung über das Weg-Zeit-Gesetz berechnen:

Da der Körper aus der Ruhe startet ($s_0=0, v_0=0$), gilt für die gleichmäßig beschleunigte Bewegung:
$$s = \frac{1}{2} \cdot a \cdot t^2$$

Nach $a$ umstellen:
$$a = \frac{2 \cdot s}{t^2}$$

Werte einsetzen:
$$a = \frac{2 \cdot 200 \text{ m}}{(20 \text{ s})^2} = \frac{400 \text{ m}}{400 \text{ s}^2} = 1 \text{ m/s}^2$$

2. Masse über das 2. Newtonsche Axiom berechnen:
$$F = m \cdot a$$

Nach $m$ umstellen:
$$m = \frac{F}{a}$$

Werte einsetzen:
$$m = \frac{10 \text{ N}}{1 \text{ m/s}^2} = \frac{10 \text{ kg} \cdot \text{m/s}^2}{1 \text{ m/s}^2} = 10 \text{ kg}$$

Der Körper hat eine Masse von **$10 \text{ kg}$**.

### Aufgabe 2: Newtonsche Axiome

> [!info] Aufgabenstellung
> In einem Aufzug wirken auf eine 70 kg schwere Person die Gewichtskraft $F_G$ und die Kraft F des Bodens, auf dem die Person steht. Berechnen Sie den Betrag von F für den Fall, dass der Aufzug
>
> a) stillsteht, b) mit 2 m/s<sup>2</sup> nach oben beschleunigt, c) mit 2 m/s<sup>2</sup> nach unten beschleunigt, d) frei fällt.
>
### Aufgabe 3: Newtonsche Axiome

> [!info] Aufgabenstellung
> Die beiden durch einen Faden verbundenen Gewichte rechts werden mit 20 N nach oben gezogen. Berechnen Sie die Beschleunigung und die Fadenkräfte im oberen und im unteren Faden (unter Vernachlässigung der Gewichtskraft).
>
### Aufgabe 4: Newtonsche Axiome

> [!info] Aufgabenstellung
> Berechnen Sie jeweils die Beschleunigung der beiden reibungsfrei gelagerten und über eine Schnur auf einer ebenfalls reibungsfreien Rolle verbundenen Körper, wenn sie sich unter dem Einfluss der Gravitationskraft anfangen zu bewegen.
>
![[Übungen/Übungen-_page_2_Figure_14.jpeg]]

### Aufgabe 5: Schiefe Ebene

> [!info] Aufgabenstellung
> Auf dem einen Ende eines 1 m langen Brettes liegt ein Holzklotz mit Haftreibungszahl $\mu_{HR}$ = 0,8 und Gleitreibungszahl $\mu_{GR}$ = 0,6. Berechnen Sie, wie hoch man das Brett auf der Seite anheben kann, bis der Klotz ins Rutschen gerät und welche Geschwindigkeit er dann am unteren Ende besitzt.
>
### Aufgabe 6: Schiefe Ebene (6)

> [!info] Aufgabenstellung
> Die beiden rechts abgebildeten Körper sind mit einem Seil über eine feste Rolle miteinander verbunden. Der rechte Körper sitzt mit der Gleitreibungszahl $\mu$ = 0,3 auf der um $\alpha$ = 30° geneigten Ebene und ist fünfmal so schwer wie der linke. Berechnen Sie die Beschleunigung, mit der sich der rechte Körper nach unten bewegt.
>
### Aufgabe 7: Bremsweg

> [!info] Aufgabenstellung
> a) Berechnen Sie den Bremsweg bei einer Geschwindigkeit von 126 km/h,
>
> einer Reaktionszeit von einer Sekunde und einer Haftreibungszahl $\mu_{HR}$ = 0,5? Zeichnen Sie ein v-t-Diagramm. b) Berechnen Sie, wie schnell darf ein Zug fahren darf, wenn der Gleitreibungskoeffizient $\mu_{GR}$ = 0,06 beträgt und eine Bremsstrecke von höchstens 500 m vorgeschrieben ist.
>
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
>
![[Übungen/Übungen-_page_2_Figure_28.jpeg]]

20 N

6 kg

4 kg

![[Übungen/Übungen-_page_2_Picture_29.jpeg]]

![[Übungen/Übungen-_page_2_Picture_30.jpeg]]

## Kinematik (AB3)

> [!info] Aufgabenstellung
> - 1. Ein Elektromotor beschleunigt während der ersten 40 Umdrehungen gleichmäßig aus dem Stillstand auf eine Drehzahl von 2000 Umdrehungen pro Minute.
> - a. Berechnen Sie die Winkelbeschleunigung des Elektromotors!
> - b. Berechnen Sie die Zeit, die der Elektromotor benötigt, um die o.g. Drehzahl zu erreichen!
> - 2. Ein Kraftfahrzeug mit einer Masse von 1200 kg beschleunigt gleichmäßig mit 1,1 m/s<sup>2</sup> von 0 km/h auf 96 km/h (Frage: gelingt dies mit einer festen Einstellung des Gaspedals?). Die Rollreibungskraft beträgt 240 N. Für die Luftreibungskraft (turbulente Reibung) gilt die Gleichung $|\vec{F}_{Luff}| = \frac{1}{2} \cdot \rho_{Luff} \cdot c_w \cdot A \cdot v^2$ (mit einer Luftdichte $\rho_{Luff} = 1,293$ kg/m<sup>3</sup>, einem Luftwiderstandsbeiwert $c_w$ = 0,29 und A = 1,9m<sup>2</sup>, der Frontfläche des Fahrzeugs). Berechnen Sie..
> - a. .. die Zeitdauer des Beschleunigungsvorgangs!
> - b. .. die während des Beschleunigungsvorgangs zurückgelegte Strecke!
> - c. .. die während des Beschleunigungsvorgangs verrichtete Reibungsarbeit (für Rollreibung und turbulente Reibung)!
> - 3. Auf einer sich drehenden Schreibe liegt im Abstand von 50 cm von der Drehachse (=Symmetrieachse) eine (punktförmige) Masse von 1 kg. Berechnen Sie die Drehzahl, bis zu welcher die Masse im o.g. Abstand auf der Scheibe unverändert liegen bleibt, wenn die Haftreibungszahl 0,3 beträgt!
>
> 4. In der Fahrschule lernt man folgende Formel für den Bremsweg in Metern bei einer normalen Bremsung:
>
> $\frac{\text{Geschwindigkeit in km/h}}{10} \times \frac{\text{Geschwindigkeit in km/h}}{10}$
>
> Berechnen Sie den zugrundeliegenden Reibungskoeffizienten, der als konstant angenommen wird, und interpretieren Sie das Ergebnis
>
> 5. Impuls: Eine Rakete mit einer Masse von 200 t soll von der Erdoberfläche aus senkrecht starten.
>
> a) Berechnen Sie die Schubkraft, die auf die Rakete wirken muss, damit sie gerade abhebt.
>
> b) In einer Sekunde werden Verbrennungsgase der Masse 0,74 t mit der Geschwindigkeit
>
> 4.0 km/s ausgestoßen. Berechnen Sie die mittlere Schubkraft, die dadurch hervorgerufen wird.
>
> c) Berechnen Sie die mittlere Beschleunigung, mit der die Rakete gehoben wird.
>
> D. Gembris, BA Dresden
>
Ergebnisse:

| LIKEDIIISSE. | 3 $n < 23,17 \cdot 1/min$ |
|----------------------------------------|-------------------------------|
| 1 a. $\alpha$ = 87,27 s <sup>-2</sup> | |
| b. $t_{\text{Ende}} = 2.4$ s | $4 \mu = 0.39$ |
| 2 a. $t = 24,24$ s | 5 a. $F_{min}$ = 1.96 MN |
| | b. $F = 3.0$ MN |
| b. $s = 323.23$ m | c. $a = 5.0$ m/s <sup>2</sup> |
| C. $W_{\text{Reibung}} = 118.515.24$ J | |

## Energie (AB4)

> [!info] Aufgabenstellung
> Informationstechnologie-Medieninformatik; BA Dresden, D. Gembris
>
### Aufgabe 1: Federspannarbeit

> [!info] Aufgabenstellung
> Zum weiteren Dehnen einer vorgespannten Feder auf 4 cm Gesamtverlängerung wird die Spannarbeit 0,06 J aufgebracht. Die Federkonstante beträgt 1 N/cm. Berechnen Sie, um welche Länge gegenüber ihrer Ruhelage die Feder anfangs gespannt war.
>
Zur Kontrolle: $\Delta x_1 = 2$ cm

### Aufgabe 2: Federspannarbeit

> [!info] Aufgabenstellung
> Eine Feder ist durch die Kraft $F_1 = 1.5$ N vorgespannt. Berechnen Sie die Endkraft, wenn für ein weiteres Spannen um 10 cm die Arbeit 0,25 J erforderlich ist.
>
Zur Kontrolle: $F_2 = 3.5$ N.

### Aufgabe 3: Jo-jo

> [!info] Aufgabenstellung
> Ein Jo-Jo besteht aus zwei Scheiben (Radius R<sub>s</sub> = 2,5 cm, Masse jeweils m<sub>s</sub> = 10 g) und einer Achse aus einem dünnwandigen Hohlzylinder ( $R_A = 0.5$ cm, $m_A = 2.5$ g). Die Schnur ist $L = 1$ m lang.
>
> a) Berechnen Sie das Trägheitsmoment des Jo-jo.
>
> b) Berechnen Sie die Geschwindigkeit des dünnwandigen Hohlzylinders und die Drehzahl, wenn sich die Schnur (fast) vollständig abgewickelt hat, d.h. kurz vor dem Umkehrpunkt.
>
Zur Kontrolle: a) $J_{ges} = 6{,}3125 \cdot 10^{-6}$ kg · m<sup>2</sup>b) $v \approx 1{,}3\frac{\text{m}}{\text{s}}$ ; $n \approx 2530 \frac{1}{\text{min}}$

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
>
> Weitere Aufgaben zu den Themen Arbeit, Energie: http://www.mathe-physik-aufgaben.de/aufgaben\_physik1/Arb\_energ\_01A.pdf
>
## Schwingungen (AB5)

> [!info] Aufgabenstellung
> Informationstechnologie-Medieninformatik; BA Dresden, D. Gembris
>
### Aufgabe 1: Gedämpfte Schwingung

> [!info] Aufgabenstellung
> An einer Feder mit der Federhärte 20 N/m hängt eine Kugel der Masse 100 g. Die Kugel wird um 10 cm nach unten ausgelenkt und dann losgelassen. Reibungseffekte sollen zunächst vernachlässigt werden.
>
> a) Berechnen Sie die Schwingungsdauer der auftretenden harmonischen Schwingung und geben Sie für die Kugel die Ortsfunktion $x(t)$ an.
>
> b) Bestimmen Sie die maximale Geschwindigkeit und die maximale Beschleunigung der Kugel und geben Sie dann die Geschwindigkeit v(t) und die Beschleunigung $a(t)$ in Abhängigkeit von der Zeit an.
>
> c) Pro Schwingungsdauer gehen etwa 5% der mechanischen Energie auf Grund von Reibungseffekten verloren. Bestimmen Sie die Abnahme der Amplitude pro Schwingungsdauer und berechnen Sie, wie groß die Amplitude nach 10 Sekunden ist.
>
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
>
### Zusatzaufgabe: Effektive Federmasse eines Federpendels (zum Praktikumsexperiment)

> [!info] Aufgabenstellung
> Die Formel für die Schwingungsdauer eines Federpendels, $T=2\pi\sqrt{\frac{m}{D}}$ , gilt für den Fall, dass die Masse der Feder vernachlässigbar klein ist. Wenn sie berücksichtigt wird, erfolgt dies in der Regel durch eine effektive Federmasse, die einen Bruchteil der tatsächlichen Federmasse ausmacht: $(m_F)_{eff} = b \cdot m_F$ . Mit der Schwingungsfrequenz $f = \omega_0/2\pi$ und der Schwingungsdauer $T = 2\pi/\omega_0$ ergibt sich bei Einbeziehung der effektiven Federmasse:
>
$$
> [!info] Aufgabenstellung
> (1) T = 2\pi \sqrt{\frac{m + b \cdot m_f}{D}}
$$

> [!info] Aufgabenstellung
> Fall 1: Masse Pendelkörper >>Federmasse $m_f$
>
> Für die Gesamtenergie einer harmonischen Schwingung mit der Amplitude A gilt generell: $W = 1/2 \cdot m \cdot \omega_0^2 \cdot A^2$ (Aufgabe: Herleitung)
>
> Die Masse, die gleichmäßig über die Feder verteilt ist, wird gedanklich in Massenelemente der Größe dm unterteilt. Diese schwingen mit gleicher Frequenz, aber unterschiedlicher Amplitude, die (nur) von der Position x abhängt. Damit gilt:
>
> (2) $dW = 1/2 \cdot dm \cdot \omega_0^2 A^2(x)$
>
> Wenn die Masse m deutlich größer ist als die Federmasse, ist die Dehnung pro Windung gleich und die Amplitude wächst dann linear mit der Position x: $(3)A(x) = \frac{x}{l}A$ . Die Masse sei gleichmäßig entlang der Feder verteilt. Bezeichnet man mit $\mu$ die Masse pro Längeneinheit ergibt sich: $dm = \mu \cdot dx$ . Damit wird Gleichung (2) zu: d $W = 1/2 \cdot \mu \cdot dx \cdot \omega_0^2 \frac{x^2}{l^2} A^2$
>
![[Übungen/Übungen-_page_9_Figure_8.jpeg]]

> [!info] Aufgabenstellung
> Für die gesamte in der Feder befindlichen Energie gilt dann:
>
> (4)
$$
> [!info] Aufgabenstellung
> W_F = \frac{1}{2} \frac{\mu L}{3} \omega_0^2 A^2
$$
> [!info] Aufgabenstellung
> (Augabe: Herleitung) und da $\mu L$ die Masse der Feder ist:
> (5) $W_F = \frac{1}{2} \frac{m_f}{3} \omega_0^2 A^2$
>
> Die Gesamtenergie setzt sich aus der Energie der Feder und des Pendelkörpers zusammen:
>
$$
> [!info] Aufgabenstellung
> (6)W = \frac{1}{2}\left(m + \frac{m_F}{3}\right)\omega_0^2 A^2
$$

> [!info] Aufgabenstellung
> Die Energie der Feder lässt sich auch mit der Federkonstanten D in dieser Form ausdrücken:
>
$$
> [!info] Aufgabenstellung
> (7)W=\frac{1}{2}D\cdot A^2
$$

> [!info] Aufgabenstellung
> Daraus folgt (Aufgabe: Nachrechnen):
>
$$
\omega_0^2 = D / \left( m + \frac{m_F}{3} \right)
$$

> [!info] Aufgabenstellung
> Mit $\omega_0 = 2\pi / T$ ergibt sich:
> (8) $T = 2\pi \sqrt{\frac{m + \frac{1}{3} \cdot m_f}{D}}$
>
> Im Fall einer sehr kleinen Federmasse geht sie also mit einem Drittel ihres Wertes in Die Schwingungsdauer ein.
>
> Fall 2: Masse Pendelkörper <<Federmasse $m_f$ Für den Fall m=0 lässt sich zeigen, dass die effektive Masse gegeben ist durch $(m_F)_{eff} = \frac{4}{\pi^2} \cdot m_F \approx 0.405 ...$ (Annahme: Schwingungsknoten am oberen Ende, Schwingungsbauch am unteren Ende)
>
> Quelle: http://theissenonline.de/Physik/Federpendel\_Effektive\_Federmasse.pdf
>
## Optik (AB6)

> [!info] Aufgabenstellung
> Medieninformatik, BA Dresden, D. Gembris
>
> A1) Mit einer dünnen Sammellinse soll ein Gegenstand auf einem Schirm vergrößert abgebildet werden.
>
> - Skizzieren Sie den Strahlenverlauf! $\sim$
> - Wo muss sich der Gegenstand befinden?
> - Geben Sie Art, Lage und Ort des entstehenden Bildes an! $\omega_{\rm{max}}$
>
> A2) dünne Linsen: Mit einer Linse der Brennweite 120 mm wird ein Dia mit den Abmessungen 6,0 cm × 6,0 cm auf einer Projektionswand, die 2,5 m von der Linse entfernt ist, scharf abgebildet. Berechnen Sie die Abmessungen des Bildes!
>
> A3) Der Einfallswinkel eines Lichtstrahls auf eine ebene Grenzfläche beträgt 55°. Wie groß ist der Winkel zwischen dem reflektierten und dem gebrochenen Strahl, wenn die Brechzahl n = 1,5 ist?
>
> A4) Wie groß ist die Querverschiebung q eines schräg durch eine Parallelplatte von der Dicke d laufenden Lichtstrahls?
>
> a) Geben Sie eine allgemeine Formel an (q als Funktion von d, $\alpha$ und $\beta$ ; $q = f(d, \alpha, \beta)$ ) b) Berechnen Sie q für $d = 6$ mm, $\alpha = 40^{\circ}$ und $n = 1.5$ .
>
![[Übungen/Übungen-_page_10_Figure_10.jpeg]]

> [!info] Aufgabenstellung
> A5) Die Empfindlichkeitsschwelle des menschlichen Auges liegt im günstigsten Fall bei etwa 100 Photonen/s. Das Auge ist bei einer Wellenlänge von etwa 550 nm am empfindlichsten. Welche minimale Lichtleistung kann das Auge demnach detektieren?
>
> Weitere Aufgaben zur Optik: https://physikaufgaben.de/index.php?&tab=7
>
## Elektrotechnik (AB7)

> [!info] Aufgabenstellung
> Medieninformatik, BA Dresden, D. Gembris
>
> **Aufgaben zur elektrischen Ladung und elektrischem Strom**
>
> **E1)** Berechnen die Ladungsmenge Q, die in 3 cm<sup>3</sup> Cu in Form frei verschiebbarer Elektronen vorhanden ist, wenn die Elektronendichte $n = 8.6 \cdot 10^{22}$ cm<sup>-3</sup> beträgt. (Elementarladung: $q_e = 1,602 \cdot 10^{-19}$ C)
>
> E2) Bestimmen Sie die Strömungsgeschwindigkeit der Elementarladungen nach 1), wenn der Strom 30 A und der Leiterquerschnitt 3 mm<sup>2</sup> beträgt. (Elektronendichte aus 1); fertigen Sie eine Skizze an.)
>
> E3) Berechnen Sie die Ladungsmenge Q, die durch einen Leiter fließt:
>
> - E3.1) bei konstantem Strom von 36 mA innerhalb von 2 s,
> - **E3.2)** bei quadratisch zunehmendem Strom ( $l = 0$ mA für $t = 0$ s; $l = 9$ mA für $t = 1$ s; $l = 36$ mA für $t = 2$ s) innerhalb von 2 s und
> - **E3.3**) bei mit der dritten Potenz zunehmendem Strom ( $l = 0$ mA für $t = 0$ s; $l = 36$ mA für $t = 2$ s) innerhalb von 2 s. Stellen Sie zunächst den Strom als Funktion der Zeit grafisch dar!
>
> **Aufgaben zu Strom, Spannung und elektrischem Widerstand**
>
> A1) Berechnen Sie sie die Länge eines Messingdrahts sein, wenn er bei einem Durchmesser von 0,08 mm einen Widerstand von R = 20 $\Omega$ haben soll. ( $\rho_{Ms} = 0.0655 \frac{\Omega \text{mm}^2}{m}$ ).
>
> A2) Berechnen sie den Spannungsabfall zwischen zwei 40 cm voneinander entfernten Punkten einer Cu-Leitung von 1 mm Durchmesser, durch welche ein Strom von 2 A fließt.
>
$$
> [!info] Aufgabenstellung
> (\rho_{Cu} = 0.01786 \frac{\Omega \text{mm}^2}{\text{m}})
$$

> [!info] Aufgabenstellung
> A3) Durch theoretische Überlegungen ergebe sich die folgende Abhängigkeit zwischen dem Spannungsabfall über einem passiven Bauelement (z.B. nichtlinearer Widerstand) und dem Strom durch das Bauelement: $U = U(I) = 10 \frac{V}{A^2} \cdot I^2$
>
> A3.1) Stellen Sie diese Abhängigkeit grafisch dar ( $0 A \le I \le 6 A$ !
>
> A3.2) Stellen Sie den Gleichstromwiderstand grafisch dar!
>
> A3.3) Stellen Sie den differentiellen Widerstand grafisch dar!
>
> - A4) Der Wolframfaden einer Glühlampe nimmt bei 230 V einen Strom von 340 mA auf (Fadentemperatur 2500°C). Berechnen Sie ..
> - A4.1) ..die Leistung, die die Lampe aufnimmt,
> - A4.2) ..dessen Widerstand bei der Arbeitstemperatur und
>
> **A4.3**) ..den Widerstand bei 20 °C? ( $\alpha_{20}$ = 0,0041K<sup>-1</sup>; $\beta_{20}$ = 10<sup>-6</sup>K<sup>-2</sup>)
>
> **A5**) Ein zweiadriges Kupferkabel ( $\rho$ = 17,8 m $\Omega$ mm<sup>2</sup> / m, d = 0,8 mm) befindet sich aufgewickelt auf einer Rolle, wobei die vier Anschlussklemmen zugängig sind. Zwischen den Adern hat das Kabel an einer Stelle einen Kurzschluss. Die Widerstandsmessung an den Klemmen AB ergibt $R_{AB}$ = 3,55 $\Omega$ , an den Klemmen CD hingegen $R_{CD}$ = 13,45 $\Omega$ . Berechnen Sie zunächst allgemein, dann für die Zahlenwerte
>
![[Übungen/Übungen-_page_12_Figure_22.jpeg]]

> [!info] Aufgabenstellung
> A5.1) die gesamte Kabellänge,
>
> A5.2) den Abstand des Kurzschlusses von den Klemmen AB.
>
> A6) Ein Verbraucher wird über eine 100 m lange zweiadrige Cu- Leitung
>
> $(\rho_{Cu} = 17.86 \cdot 10^{-3} \frac{\Omega \text{mm}^2}{m})$ an das Netz (U<sub>N</sub> = 230 V) angeschlossen. Berechnen Sie
>
> - A6.1) .. den Leitungswiderstand, wenn in der Leitung maximal ein Strom von 10 A fließen soll und dabei der Spannungsabfall über der Leitung nicht mehr als 2,5% der Nennspannung von 230 V sein soll.
> - A6.2) .. den erforderlichen Drahtdurchmesser.
> - A6.3) .., welche Stromdichte daraus bei I=10 A folgt.
> - A6.4) .. die elektrische Feldstärke, die sich bei diesem Strom im Leiter ausbildet.
> - A6.5) .. die Leistung, die im Leiter umgesetzt wird.
> - A6.6) .. das Verhältnis der im Verbraucher umgesetzten Leistung zur Verlustleistung in der Cu-Leitung.
>
> A7) Die Energieversorgung eines Grundstückes erfolgt über eine 200 m lange Doppelleitung von der Verteilerstelle aus (U=230 V). Bei einem maximalen Strom von I = 15 A soll der Spannungsabfall über der Leitung 4% der Netzspannung nicht überschreiten. Berechnen Sie den erforderlichen Mindestquerschnitt und die Gesamtmasse der Leitung, wenn diese
>
> **A7.1**) aus Kupfer (
$$
\rho_{Cu}
$$
> [!info] Aufgabenstellung
> = 17,86 · 10<sup>-3</sup> $\frac{\Omega \text{mm}^2}{\text{m}}$ , $d_{Cu}$ = 8,9 $\frac{\text{g}}{\text{cm}^3}$ )
>
> **A7.2**) aus Aluminium ( $\rho_{Al} = 30 \cdot 10^{-3} \frac{\Omega \text{mm}^2}{\text{m}}$ , $d_{Al} = 2.7 \frac{\text{g}}{\text{cm}^3}$ ) hergestellt wird.
>
## Elektrotechnik (AB8)

> [!info] Aufgabenstellung
> Medieninformatik, BA Dresden, D. Gembris
>
> A1) Ein geladenes Staubteilchen mit einer Masse von $1.5 \cdot 10^{-8}$ g schwebt im Feld eines Plattenkondensators, an dem eine Spannung von 500 V angelegt wird. Die Platten sind horizontal in einem Abstand von 5,0 mm angeordnet. Berechnen Sie die Ladung des Staubteilchens.
>
> A2) Ein Elektron tritt mit einer Anfangsgeschwindigkeit v<sub>0</sub> > 0 in ein homogenes elektrisches Feld ein.
>
> Formulieren Sie jeweils eine Aussage über Bahnform und Bewegungsart dieses Elektrons für folgende Fälle:
>
> Der Eintritt des Elektrons in das elektrische Feld erfolgt
>
> - parallel zu den Feldlinien,
>
> - senkrecht zu den Feldlinien.
>
> Begründen Sie Ihre Aussagen.
>
> Hilfe: Gleichung der Bahnkurve für den Fall "senkrecht zu den Feldlinien":
>
$$
> [!info] Aufgabenstellung
> y = \frac{Q \cdot U}{2mdv^2}x^2
$$

> [!info] Aufgabenstellung
> A3) Die in einem Kondensator bei einer Ladespannung von 6,0 V gespeicherte elektrische Feldenergie soll für die Zündung einer Blitzlichtlampe genutzt werden. Die während der Zeitdauer eines Lichtblitzes von 100 µs abgegebene elektrische Leistung beträgt 200 W.
>
> Berechnen Sie die Kapazität des Kondensators.
>
> A4) An einen Plattenkondensator mit der Plattenfläche $A = 500$ cm<sup>2</sup> und dem Plattenabstand d = 4 mm im Vakuum wird die Spannung $U = 400$ V angelegt.
>
> a) Berechnen Sie die Ladung, die der Kondensator aufnimmt.
>
> b) Berechnen Sie die Feldstärke des elektrischen Feldes im Kondensator.
>
> c) Geben Sie mit Begründung die Werte für Ladung und Feldstärke an, wenn der Plattenabstand bei Beibehaltung der Verbindung zur Spannungsquelle auf 6 mm vergrößert wird.
>
> d) Erläutern Sie, wie die Ladung, die Feldstärke und die Spannung ändert, wenn die Vergrößerung des Plattenabstandes nach Abklemmen der Spannungsquelle erfolgt.
>
## Magnetische Felder (AB9)

> [!info] Aufgabenstellung
> A1) (\*/\*\*\*) Geben Sie die Eigenschaften eines auf einer schlanken Spule basierenden Elektromagneten an, damit er ein möglichst starkes Magnetfeld erzeugt
>
> A2) (\*/\*\*\*) Geben Sie die Voraussetzungen an, unter denen ein Strahl positiver Ionen in einem homogenen Magnetfeld eine ablenkende Kraft erfährt und geben Sie den Betrag dieser Kraft an.
>
> **A3**) (\*\*/\*\*\*) Ein Elektronenstrahl tritt mit einer Geschwindigkeit von $v_0$ = 1,96·10<sup>6</sup> ms<sup>-1</sup> senkrecht zu den Feldlinien in ein homogenes Magnetfeld mit der magnetischen Flussdichte $B = 1.6 \cdot 10^{-3}$ T ein.
>
> a) Erklären Sie, warum sich der Elektronenstrahl auf einer Kreisbahn weiterbewegt.
>
> b) Berechnen Sie den Radius der Kreisbahn.
>
> c) Beschreiben Sie mit Hilfe der in b) hergeleiteten Gleichung, wie sich der Radius ändern würde, wenn an Stelle der Elektronen Protonen in das Magnetfeld fliegen (qualitativ)
>
> A4) (\*\*\*/\*\*\*) Elektronen treten mit der Geschwindigkeit $2.0 \cdot 10^5$ m/s in ein homogenes elektrisches Feld ein (dort kein Magnetfeld) und durchlaufen es auf einer Strecke von s = 20 cm. Die Polung der Platten bewirkt, dass die Elektronen beschleunigt werden.
>
> Am Ende der Beschleunigungsstrecke sollen die Elektronen eine Geschwindigkeit von 8,0·10<sup>6</sup> m/s haben.
>
> Anschließend treten die Elektronen senkrecht zu den Feldlinien in ein homogenes Magnetfeld ein (dort kein elektrisches Feld), in der sie um $\alpha$ = 25° zu
>
> $\times$ $\times$ $\times$ $\times$ $\times$ $\times$ $\times$ $\times$ $\times$ ×Х ◒ $\alpha$ Ś
>
> ihrer Bewegungsrichtung abgelenkt werden sollen. Das Magnetfeld ist $b = 3.0$ cm breit.
>
> a) Berechnen Sie die elektrische Feldstärke des Feldes im Kondensator.
>
> b) Berechnen Sie die erforderliche magnetische Flussdichte.
>
> A5) (\*\*\*/\*\*\*) Eine Leiterschleife rotiert gleichförmig in einem homogenen und zeitlich konstanten Magnetfeld. Die Rotationsachse ist senkrecht zu den Feldlinien gerichtet.
>
> Begründen Sie formelmäßig, dass mit dieser Anordnung eine Wechselspannung erzeugt werden kann.
>
> Quelle: https://physikaufgaben.de
>
## Übungsblatt (AB10)

MI, BA Dresden, D. Gembris

> [!info] Aufgabenstellung
> A1) Ein Spannungsmesser soll den Messbereich 10 V erhalten. Das zur Verfügung stehende Drehspulmesswerk benötigt einen Messwerksstrom von 100µA für Vollausschlag. Der Widerstand der Drehspule beträgt 1300 $\Omega$ . Berechnen Sie den erforderlichen Vorwiderstand R<sub>v</sub>.
>
> A2) Ein Strommesser mit dem Innenwiderstand 0,1 $\Omega$ soll ein um den Faktor 10 größeren Messbereich erhalten. Erläutern Sie die Vorgehensweise.
>
> A3) Ein freies Elektron durchlaufe im Vakuum eine Spannung von 1 V. Berechnen Sie dessen Geschwindigkeit.
>
> A4) Berechnen Sie die Gesamtkapazitäten C<sub>AB</sub> für die folgenden Schaltungen. Für a) und b): $C_1 = 1$ nF, $C_2 = 2$ nF, $C_3 = 5$ nF.
>
![[Übungen/Übungen-_page_18_Figure_6.jpeg]]

> [!info] Aufgabenstellung
> Zusätzlich: s. Arbeitsblatt "Netzwerk-Berechnung\_Aufgaben.pdf"
>
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

---
## Review & Learning
[!summary] Zusammenfassung
Sammlung von Übungsaufgaben aus den Bereichen Kinematik, Dynamik, Energie, Schwingungen, Optik und Elektrotechnik (Naturwissenschaftliche Grundlagen).

[!question] Mögliche Prüfungsfragen
- Wie berechnet sich die Meerestiefe per Echolot?
- Wie lautet das 2. Newtonsche Axiom und wie wird es angewendet?
- Wie löst man Aufgaben zur Federspannarbeit?
