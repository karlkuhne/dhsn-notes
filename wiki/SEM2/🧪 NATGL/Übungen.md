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

Gegeben:
- Masse der Person $m = 70 \text{ kg}$
- Fallbeschleunigung $g \approx 9,81 \text{ m/s}^2$

Gesucht:
- Kraft des Bodens $F$ in vier verschiedenen Fällen

**Lösungsansatz:**
Nach dem 2. Newtonschen Axiom gilt für die resultierende Kraft: $F_{\text{res}} = m \cdot a$
Auf die Person wirken zwei Kräfte entlang der vertikalen Achse:
1. Die Gewichtskraft $F_G = m \cdot g$ (wirkt stets nach unten)
2. Die Normalkraft / Kraft des Bodens $F$ (wirkt nach oben)

Die Kräftebilanz lautet: (Gewichtskraft negativ weil diese nach unten wirkt)
$F_{\text{res}} = F - F_G$

Wir setzen dies in das Newtonsche Axiom ein und stellen nach der gesuchten Kraft $F$ um:

1. $F_{\text{res}} = F - F_G$ einsetzen in $F_{\text{res}} = m \cdot a$
   $$F - F_G = m \cdot a$$$$F = F_G + m \cdot a$$
2. $F_G = m \cdot g$ einsetzen
   $$F = m \cdot g + m \cdot a$$
   $$F = m \cdot (g + a)$$

**a) Aufzug stillsteht:**
- Die Beschleunigung ist $a = 0 \text{ m/s}^2$.
- $F = m \cdot (g + 0) = 70 \text{ kg} \cdot 9,81 \text{ m/s}^2 = 686,7 \text{ N}$

**b) Aufzug beschleunigt mit $2 \text{ m/s}^2$ nach oben:**
- Die Beschleunigung ist $a = +2 \text{ m/s}^2$.
- $F = 70 \text{ kg} \cdot (9,81 \text{ m/s}^2 + 2 \text{ m/s}^2) = 70 \text{ kg} \cdot 11,81 \text{ m/s}^2 = 826,7 \text{ N}$
- *(Tipp: Die Person drückt stärker auf den Boden und fühlt sich "schwerer")*

**c) Aufzug beschleunigt mit $2 \text{ m/s}^2$ nach unten:**
- Die Beschleunigung ist $a = -2 \text{ m/s}^2$.
- $F = 70 \text{ kg} \cdot (9,81 \text{ m/s}^2 - 2 \text{ m/s}^2) = 70 \text{ kg} \cdot 7,81 \text{ m/s}^2 = 546,7 \text{ N}$
- *(Tipp: Die Person fühlt sich "leichter")*

**d) Aufzug fällt frei:**
- Im freien Fall ist die Beschleunigung des Aufzugs gleich der Fallbeschleunigung nach unten, also $a = -g = -9,81 \text{ m/s}^2$.
- $F = 70 \text{ kg} \cdot (9,81 \text{ m/s}^2 - 9,81 \text{ m/s}^2) = 70 \text{ kg} \cdot 0 \text{ m/s}^2 = 0 \text{ N}$
- *(Die Person hebt vom Boden ab bzw. ist schwerelos)*


### Aufgabe 3: Newtonsche Axiome

> [!info] Aufgabenstellung
> Die beiden durch einen Faden verbundenen Gewichte werden mit 20 N nach oben gezogen. Berechnen Sie die Beschleunigung und die Fadenkräfte im oberen und im unteren Faden (unter Vernachlässigung der Gewichtskraft).
> 
>![[Pasted image 20260505094435.png]]

Gegeben (aus Bildinformationen im Dokument):
- Zugkraft $F_{zug} = 20 \text{ N}$ nach oben
- Masse 1 (oben) $m_1 = 6 \text{ kg}$
- Masse 2 (unten) $m_2 = 4 \text{ kg}$
- Gewichtskraft wird vernachlässigt ($g = 0$)

Gesucht: 
- Beschleunigung $a$
- Kraft im oberen Faden $F_{oben}$
- Kraft im unteren Faden $F_{unten}$

**Lösung:**

1. **Beschleunigung berechnen:**

Da die Gewichtskraft vernachlässigt wird, ist die einzige von außen wirkende Kraft die Zugkraft von $20 \text{ N}$. Diese Kraft beschleunigt das gesamte System, also beide Massen zusammen ($m_{ges} = m_1 + m_2 = 6 \text{ kg} + 4 \text{ kg} = 10 \text{ kg}$).

Nach dem 2. Newtonschen Axiom ($F = m \cdot a$) gilt:
$$a = \frac{F_{zug}}{m_{ges}} = \frac{20 \text{ N}}{10 \text{ kg}} = 2 \text{ m/s}^2$$
Die Massen werden mit $2 \text{ m/s}^2$ nach oben beschleunigt.

2. **Fadenkraft im oberen Faden:**
Der obere Faden greift am gesamten System an und überträgt die vorgegebene Zugkraft.
$$F_{oben} = F_{zug} = 20 \text{ N}$$

3. **Fadenkraft im unteren Faden:**
Der untere Faden verbindet die beiden Massen. Er muss nur die Kraft aufbringen, um die untere Masse ($m_2 = 4 \text{ kg}$) mit der Systembeschleunigung ($a = 2 \text{ m/s}^2$) zu bewegen.
Nach dem 2. Newtonschen Axiom für die untere Masse gilt:
$$F_{unten} = m_2 \cdot a = 4 \text{ kg} \cdot 2 \text{ m/s}^2 = 8 \text{ N}$$


### Aufgabe 4: Newtonsche Axiome

> [!info] Aufgabenstellung
> Berechnen Sie jeweils die Beschleunigung der beiden reibungsfrei gelagerten und über eine Schnur auf einer ebenfalls reibungsfreien Rolle verbundenen Körper, wenn sie sich unter dem Einfluss der Gravitationskraft anfangen zu bewegen.
> 
> ![[Pasted image 20260505094522.png]]

**Lösung:**

In beiden Fällen (a und b) verwenden wir das 2. Newtonsche Axiom ($F_{res} = m_{ges} \cdot a$) für das Gesamtsystem, um die Beschleunigung zu berechnen. Die zu beschleunigende Gesamtmasse ist jeweils $m_{ges} = m_1 + m_2$. Wir nehmen die Erdbeschleunigung $g \approx 9,81 \text{ m/s}^2$ an.

**Fall a) Tisch und hängende Masse**
- Masse auf dem Tisch: $m_1 = 15 \text{ kg}$
- Hängende Masse: $m_2 = 5 \text{ kg}$

Da die Auflagefläche reibungsfrei ist, ist die einzige antreibende Kraft für das Gesamtsystem die Gewichtskraft der hängenden Masse $m_2$.
$F_{res} = m_2 \cdot g$

Die resultierende Beschleunigung ist:
$$a = \frac{F_{res}}{m_{ges}} = \frac{m_2 \cdot g}{m_1 + m_2}$$
$$a = \frac{5 \text{ kg} \cdot 9,81 \text{ m/s}^2}{15 \text{ kg} + 5 \text{ kg}} = \frac{49,05 \text{ N}}{20 \text{ kg}} = 2,4525 \text{ m/s}^2 \approx 2,45 \text{ m/s}^2$$

**Fall b) Atwoodsche Fallmaschine (zwei hängende Massen)**
- Linke Masse: $m_1 = 5 \text{ kg}$
- Rechte Masse: $m_2 = 15 \text{ kg}$

Hier wirken die Gewichtskräfte beider Massen in entgegengesetzte Richtungen bezogen auf die Seilbewegung. Die resultierende antreibende Kraft ist die Differenz der beiden Gewichtskräfte.
$F_{res} = m_2 \cdot g - m_1 \cdot g = (m_2 - m_1) \cdot g$

Die resultierende Beschleunigung ist:
$$a = \frac{F_{res}}{m_{ges}} = \frac{(m_2 - m_1) \cdot g}{m_1 + m_2}$$
$$a = \frac{(15 \text{ kg} - 5 \text{ kg}) \cdot 9,81 \text{ m/s}^2}{15 \text{ kg} + 5 \text{ kg}} = \frac{10 \text{ kg} \cdot 9,81 \text{ m/s}^2}{20 \text{ kg}} = \frac{98,1 \text{ N}}{20 \text{ kg}} = 4,905 \text{ m/s}^2 \approx 4,91 \text{ m/s}^2$$

### Aufgabe 5: Schiefe Ebene

> [!info] Aufgabenstellung
> Auf dem einen Ende eines 1 m langen Brettes liegt ein Holzklotz mit Haftreibungszahl $\mu_{HR}$ = 0,8 und Gleitreibungszahl $\mu_{GR}$ = 0,6. Berechnen Sie, wie hoch man das Brett auf der Seite anheben kann, bis der Klotz ins Rutschen gerät und welche Geschwindigkeit er dann am unteren Ende besitzt.
> 
> ![[Pasted image 20260505102326.png]]

Gegeben:
- Länge der schiefen Ebene $l = 1 \text{ m}$
- Haftreibungszahl $\mu_{HR} = 0,8$
- Gleitreibungszahl $\mu_{GR} = 0,6$
- Erdbeschleunigung $g = 9,81 \text{ m/s}^2$

Gesucht:
- Höhe $h$ des Brettendes, bei der der Klotz zu rutschen beginnt
- Geschwindigkeit $v$ am unteren Ende

**Lösung:**

**1. Höhe bestimmen (Grenzfall Haftung)**

Der Klotz beginnt genau dann zu rutschen, wenn die Hangabtriebskraft $F_H$ gleich der maximalen Haftreibungskraft $F_{HR}$ ist.
- Hangabtriebskraft: $F_H = m \cdot g \cdot \sin(\alpha)$
- Haftreibungskraft: $F_{HR} = \mu_{HR} \cdot F_N = \mu_{HR} \cdot m \cdot g \cdot \cos(\alpha)$

Gleichsetzen:
$$m \cdot g \cdot \sin(\alpha) = \mu_{HR} \cdot m \cdot g \cdot \cos(\alpha)$$

Durch $m \cdot g$ und $\cos(\alpha)$ teilen ergibt:
$$\tan(\alpha) = \mu_{HR}$$

Den kritischen Winkel $\alpha$ berechnen:
$$\alpha = \arctan(0,8) \approx 38,66^\circ$$

Nun können wir mit der Länge des Brettes ($l = 1 \text{ m}$) und dem Winkel die Höhe $h$ berechnen. Im rechtwinkligen Dreieck gilt: $\sin(\alpha) = \frac{h}{l}$
$$h = l \cdot \sin(\alpha) = 1 \text{ m} \cdot \sin(38,66^\circ) \approx 0,625 \text{ m}$$

Man kann das Brett also ca. **$62,5 \text{ cm}$** anheben, bevor der Klotz ins Rutschen gerät.

```tikz
\begin{document}
\begin{tikzpicture}

  \draw[thick] (0,0) -- (4,0) -- (4,3) -- cycle;

  \draw (3.8,0) -- (3.8,0.2) -- (4,0.2);

  \draw (1,0) arc[start angle=0, end angle=36.87, radius=1];

  \node[above left] at (2,1.5) {$l = 1$ m};
  \node[right] at (4,1.5) {$h \approx 62.5$ cm};
  \node[below] at (2,0) {Boden};
  \node[above right] at (4,3) {Angehobenes Ende};
  \node[below] at (0.5,0) {$\alpha \approx 38.7^\circ$};

\end{tikzpicture}
\end{document}
```


**2. Endgeschwindigkeit bestimmen**

Sobald der Klotz rutscht, wirkt die Gleitreibung. Wir berechnen die resultierende Kraft parallel zur schiefen Ebene:
$$F_{res} = F_H - F_{GR} = m \cdot g \cdot \sin(\alpha) - \mu_{GR} \cdot m \cdot g \cdot \cos(\alpha)$$

Daraus ergibt sich die Beschleunigung $a = \frac{F_{res}}{m}$:
$$a = g \cdot (\sin(\alpha) - \mu_{GR} \cdot \cos(\alpha))$$

Werte einsetzen ($\alpha \approx 38,66^\circ$):
$$a = 9,81 \text{ m/s}^2 \cdot (\sin(38,66^\circ) - 0,6 \cdot \cos(38,66^\circ))$$
Da wir wissen, dass $\sin(\alpha) = 0,625$ und $\cos(\alpha) = \sqrt{1 - \sin^2(\alpha)} = \sqrt{1 - 0,625^2} \approx 0,781$:
$$a = 9,81 \cdot (0,625 - 0,6 \cdot 0,781) = 9,81 \cdot (0,625 - 0,4686) = 9,81 \cdot 0,1564 \approx 1,53 \text{ m/s}^2$$

Der Klotz bewegt sich gleichmäßig beschleunigt aus der Ruhe ($v_0 = 0$). Wir nutzen die Formel $v^2 = 2 \cdot a \cdot s$, wobei der zurückgelegte Weg $s$ der Länge des Brettes $l = 1 \text{ m}$ entspricht:
$$v = \sqrt{2 \cdot a \cdot l}$$
$$v = \sqrt{2 \cdot 1,53 \text{ m/s}^2 \cdot 1 \text{ m}} = \sqrt{3,06 \text{ m}^2/\text{s}^2} \approx 1,75 \text{ m/s}$$

Die Geschwindigkeit des Klotzes am unteren Ende beträgt ca. **$1,75 \text{ m/s}$**.

### Aufgabe 6: Schiefe Ebene (6)

> [!info] Aufgabenstellung
> Die beiden rechts abgebildeten Körper sind mit einem Seil über eine feste Rolle miteinander verbunden. Der rechte Körper sitzt mit der Gleitreibungszahl $\mu$ = 0,3 auf der um $\alpha$ = 30° geneigten Ebene und ist fünfmal so schwer wie der linke. Berechnen Sie die Beschleunigung, mit der sich der rechte Körper nach unten bewegt.
> 
>![[Pasted image 20260505094701.png]]
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

Gegeben:
- Masse Flugzeug $m = 40 \text{ t} = 40.000 \text{ kg}$
- Nötige Startgeschwindigkeit (Airspeed) $v_{start} = 216 \text{ km/h} = 60 \text{ m/s}$
- Länge des Katapults $s = 100 \text{ m}$
- Windgeschwindigkeit (absolut) $v_{wind} = 36 \text{ km/h} = 10 \text{ m/s}$
- Schiffsgeschwindigkeit (absolut) $v_{schiff} = 54 \text{ km/h} = 15 \text{ m/s}$ *(Anmerkung: Im Text fehlt " /h", was aber logisch ist)*

**Lösung:**

**a) Windgeschwindigkeit auf dem Flugdeck (relativ)**
Das Schiff fährt direkt gegen den Wind. Aus Sicht eines Beobachters auf dem Deck addieren sich daher die Geschwindigkeiten.
$$v_{deckwind} = v_{wind} + v_{schiff} = 36 \text{ km/h} + 54 \text{ km/h} = 90 \text{ km/h} = 25 \text{ m/s}$$
Die relative Windgeschwindigkeit auf dem Flugdeck beträgt **$90 \text{ km/h}$** (bzw. $25 \text{ m/s}$).

**b) Geschwindigkeit des Flugzeugs relativ zum Flugdeck**
Um abzuheben, braucht das Flugzeug eine Geschwindigkeit relativ zur umgebenden Luft von $216 \text{ km/h}$. Da der Wind bereits mit $90 \text{ km/h}$ über das Deck weht, muss das Katapult nur noch die Differenz aufbringen.
$$v_{relativ} = v_{start} - v_{deckwind} = 216 \text{ km/h} - 90 \text{ km/h} = 126 \text{ km/h} = 35 \text{ m/s}$$
Das Flugzeug muss relativ zum Deck eine Geschwindigkeit von **$126 \text{ km/h}$** (bzw. $35 \text{ m/s}$) erreichen.

**c) Notwendige Beschleunigung auf dem Katapult**
Das Flugzeug wird aus dem Stillstand ($v_0 = 0$) über die Strecke $s = 100 \text{ m}$ auf $v_{relativ} = 35 \text{ m/s}$ (vgl. b) beschleunigt. Wir nutzen die Formel der gleichmäßig beschleunigten Bewegung ohne Anfangsgeschwindigkeit: $v^2 = 2 \cdot a \cdot s$.
Nach $a$ umgestellt:
$$a = \frac{v^2}{2 \cdot s}$$
$$a = \frac{(35 \text{ m/s})^2}{2 \cdot 100 \text{ m}} = \frac{1225 \text{ m}^2/\text{s}^2}{200 \text{ m}} = 6,125 \text{ m/s}^2$$
Die notwendige Beschleunigung auf dem Katapult beträgt **$6,125 \text{ m/s}^2$**.

**d) Kraft am Vorderrad**
Die benötigte Kraft berechnet sich aus dem 2. Newtonschen Axiom ($F = m \cdot a$).
$$F = 40.000 \text{ kg} \cdot 6,125 \text{ m/s}^2 = 245.000 \text{ N} = 245 \text{ kN}$$
Der Katapultschlitten muss eine Kraft von **$245 \text{ kN}$** auf das Vorderrad übertragen.

## Kinematik (AB3)

### Aufgabe 1: Winkelbeschleunigung

> [!info] Aufgabenstellung
> Ein Elektromotor beschleunigt während der ersten 40 Umdrehungen gleichmäßig aus dem Stillstand auf eine Drehzahl von 2000 Umdrehungen pro Minute.
> 
> a) Berechnen Sie die Winkelbeschleunigung des Elektromotors!
> b) Berechnen Sie die Zeit, die der Elektromotor benötigt, um die o.g. Drehzahl zu erreichen!

**Lösung a) Winkelbeschleunigung:**

Gegeben:
- Anfangswinkelgeschwindigkeit $\omega_0 = 0 \text{ s}^{-1}$ (Da der Motor aus dem *Stillstand* anläuft)
- Anzahl Umdrehungen $N = 40$
- Enddrehzahl $n = 2000 \text{ min}^{-1}$ (Das ist die Frequenz der Drehung am Ende der Beschleunigungsphase)

Gesucht: Winkelbeschleunigung $\alpha$ (Gibt an, wie schnell die Drehgeschwindigkeit zunimmt, Einheit $\text{s}^{-2}$)

**Schritt 1: Alle Werte in das physikalische Standardsystem (SI-Einheiten) und ins Bogenmaß (Radiant) umrechnen.**
Um mit den physikalischen Formeln rechnen zu können, müssen wir Umdrehungen in Winkel und Minuten in Sekunden umwandeln.

- **Zurückgelegter Drehwinkel $\varphi$:** 
  Ein Vollkreis (eine Umdrehung) entspricht einem Winkel von $360^\circ$ oder im Bogenmaß $2\pi$ Radiant. Bei 40 Umdrehungen ist der Gesamtwinkel also das 40-fache von $2\pi$.
  $$\varphi = N \cdot 2\pi = 40 \cdot 2\pi = 80\pi \text{ rad}$$
  
- **Endwinkelgeschwindigkeit $\omega$:**
  Zuerst rechnen wir die Drehzahl $n$ von Umdrehungen pro Minute in Umdrehungen pro Sekunde um (durch 60 teilen):
  $$n = \frac{2000}{60} \text{ s}^{-1} = \frac{100}{3} \text{ s}^{-1}$$
  Da jede Umdrehung einem Winkel von $2\pi$ entspricht, multiplizieren wir diese Frequenz mit $2\pi$, um die Winkelgeschwindigkeit $\omega$ (Winkel pro Sekunde) zu erhalten:
  $$\omega = 2\pi \cdot n = 2\pi \cdot \frac{100}{3} \text{ s}^{-1} = \frac{200\pi}{3} \text{ s}^{-1} \approx 209,44 \text{ s}^{-1}$$

**Schritt 2: Die passende Formel auswählen.**
Wir suchen die Winkelbeschleunigung $\alpha$, kennen aber die Zeit nicht. Dafür kennen wir den Weg (den Winkel $\varphi$). Hier hilft uns eine Formel, die aus der linearen Bewegung bekannt ist (Weg-Geschwindigkeit-Gesetz: $v^2 - v_0^2 = 2 \cdot a \cdot s$).

>Der Winkel $\varphi$ ist der Weg, wie weit sich ein Punkt auf einem Kreisbogen bewegt

Für die *Drehbewegung* lautet die exakt analoge Formel:
$$\omega^2 - \omega_0^2 = 2 \cdot \alpha \cdot \varphi$$
Da der Motor aus dem Stillstand startet ($\omega_0 = 0$), vereinfacht sich die Formel zu:
$$\omega^2 = 2 \cdot \alpha \cdot \varphi$$

**Schritt 3: Formel umstellen und ausrechnen.**
$$\alpha = \frac{\omega^2}{2 \cdot \varphi}$$
$$\alpha = \frac{\left(\frac{200\pi}{3} \text{ s}^{-1}\right)^2}{2 \cdot 80\pi \text{ rad}}$$
$$\alpha = \frac{\frac{40000\pi^2}{9} \text{ s}^{-2}}{160\pi}$$
$$\alpha = \frac{40000\pi^2}{9 \cdot 160\pi} \text{ s}^{-2} = \frac{40000\pi}{1440} \text{ s}^{-2}$$
$$\alpha = \frac{250\pi}{9} \text{ s}^{-2}$$
$$\alpha \approx 87,266 \text{ s}^{-2}$$

Die Winkelbeschleunigung des Elektromotors beträgt also ca. **$87,27 \text{ s}^{-2}$**.


**Lösung b) Zeitdauer der Beschleunigung:**

Gegeben (aus Aufgabenteil a):
- Anfangswinkelgeschwindigkeit $\omega_0 = 0 \text{ s}^{-1}$
- Endwinkelgeschwindigkeit $\omega = \frac{200\pi}{3} \text{ s}^{-1}$
- Winkelbeschleunigung $\alpha = \frac{250\pi}{9} \text{ s}^{-2}$

Gesucht: Zeitdauer $t$ (Gibt an, wie lange der Motor braucht, um auf die Enddrehzahl zu kommen, Einheit $\text{s}$)

**Schritt 1: Die passende Formel auswählen.**
Wir suchen die Zeit $t$, kennen die Anfangs- und Endwinkelgeschwindigkeit sowie die Winkelbeschleunigung. 
Die grundlegende Formel für die Beschleunigung gibt an, wie sich die Geschwindigkeit in einer bestimmten Zeit ändert: 
$$\alpha = \frac{\Delta\omega}{\Delta t} = \frac{\omega - \omega_0}{t}$$
Da der Motor aus dem Stillstand startet ($\omega_0 = 0$), vereinfacht sich das zu:
$$\alpha = \frac{\omega}{t}$$

**Schritt 2: Formel umstellen und ausrechnen.**
Wir wollen $t$ berechnen. Dazu multiplizieren wir die Gleichung mit $t$ und teilen durch $\alpha$:
$$t = \frac{\omega}{\alpha}$$

Nun setzen wir unsere genauen Werte (als Brüche) aus Teil a) ein:
$$t = \frac{\frac{200\pi}{3} \text{ s}^{-1}}{\frac{250\pi}{9} \text{ s}^{-2}}$$
$$t = \frac{200\pi}{3} \cdot \frac{9}{250\pi} \text{ s}$$
$$t = \frac{200 \cdot 3}{250} \text{ s} = \frac{600}{250} \text{ s}$$
$$t = \frac{12}{5} \text{ s} = 2,4 \text{ s}$$

Der Elektromotor benötigt also genau **$2,4 \text{ s}$**, um diese Drehzahl zu erreichen.

### Aufgabe 2: Beschleunigung und Reibung

> [!info] Aufgabenstellung
> Ein Kraftfahrzeug mit einer Masse von 1200 kg beschleunigt gleichmäßig mit $1,1 \text{ m/s}^2$ von $0 \text{ km/h}$ auf $96 \text{ km/h}$ (Frage: gelingt dies mit einer festen Einstellung des Gaspedals?). Die Rollreibungskraft beträgt $240 \text{ N}$. Für die Luftreibungskraft (turbulente Reibung) gilt die Gleichung $|\vec{F}_{Luft}| = \frac{1}{2} \cdot \rho_{Luft} \cdot c_w \cdot A \cdot v^2$ (mit einer Luftdichte $\rho_{Luft} = 1,293 \text{ kg/m}^3$, einem Luftwiderstandsbeiwert $c_w = 0,29$ und $A = 1,9 \text{ m}^2$, der Frontfläche des Fahrzeugs). Berechnen Sie:
> 
> a) die Zeitdauer des Beschleunigungsvorgangs!
> b) die während des Beschleunigungsvorgangs zurückgelegte Strecke!
> c) die während des Beschleunigungsvorgangs verrichtete Reibungsarbeit (für Rollreibung und turbulente Reibung)!

### Aufgabe 3: Kreisbewegung und Haftreibung

> [!info] Aufgabenstellung
> Auf einer sich drehenden Scheibe liegt im Abstand von $50 \text{ cm}$ von der Drehachse (=Symmetrieachse) eine (punktförmige) Masse von $1 \text{ kg}$. Berechnen Sie die Drehzahl, bis zu welcher die Masse im o.g. Abstand auf der Scheibe unverändert liegen bleibt, wenn die Haftreibungszahl $0,3$ beträgt!

Gegeben:
- Abstand (Radius) $r = 50 \text{ cm} = 0,5 \text{ m}$
- Masse $m = 1 \text{ kg}$
- Haftreibungszahl $\mu = 0,3$
- Erdbeschleunigung $g \approx 9,81 \text{ m/s}^2$

Gesucht: Maximale Drehzahl $n$

**Lösung:**

1. **Physikalisches Gleichgewicht:**
Damit die Masse nicht rutscht, muss die Zentripetalkraft $F_Z$ durch die Haftreibungskraft $F_{HR}$ aufgebracht werden.
$$F_Z = F_{HR}$$
$$m \cdot \omega^2 \cdot r = \mu \cdot m \cdot g$$

2. **Winkelgeschwindigkeit $\omega$ berechnen:**
$$\omega = \sqrt{\frac{\mu \cdot g}{r}} = \sqrt{\frac{0,3 \cdot 9,81 \text{ m/s}^2}{0,5 \text{ m}}} \approx 2,426 \text{ s}^{-1}$$

3. **Drehzahl $n$ berechnen:**
$$n = \frac{\omega \cdot 60}{2\pi} = \frac{2,426 \cdot 60}{2\pi} \approx 23,17 \text{ min}^{-1}$$

Die maximale Drehzahl beträgt ca. **$23,17 \text{ min}^{-1}$**.


### Aufgabe 4: Bremsweg

> [!info] Aufgabenstellung
> In der Fahrschule lernt man folgende Formel für den Bremsweg in Metern bei einer normalen Bremsung:
> 
> $$s_{Brems} = \left(\frac{\text{Geschwindigkeit in km/h}}{10}\right) \times \left(\frac{\text{Geschwindigkeit in km/h}}{10}\right)$$
> 
> Berechnen Sie den zugrundeliegenden Reibungskoeffizienten, der als konstant angenommen wird, und interpretieren Sie das Ergebnis.

TODO
### Aufgabe 5: Impuls und Raketenantrieb

> [!info] Aufgabenstellung
> Eine Rakete mit einer Masse von $200 \text{ t}$ soll von der Erdoberfläche aus senkrecht starten.
> 
> a) Berechnen Sie die Schubkraft, die auf die Rakete wirken muss, damit sie gerade abhebt.
> b) In einer Sekunde werden Verbrennungsgase der Masse $0,74 \text{ t}$ mit der Geschwindigkeit $4,0 \text{ km/s}$ ausgestoßen. Berechnen Sie die mittlere Schubkraft, die dadurch hervorgerufen wird.
> c) Berechnen Sie die mittlere Beschleunigung, mit der die Rakete gehoben wird.

**a) Schubkraft zum Abheben**

Gegeben:
- Masse $m = 200 \text{ t} = 200.000 \text{ kg}$
- Erdbeschleunigung $g = 9,81 \text{ m/s}^2$

Gesucht: Schubkraft $F_S$

Damit die Rakete abhebt, muss die Schubkraft $F_S$ mindestens so groß sein wie die Gewichtskraft $F_G$.
$$F_G = m \cdot g$$
$$F_G = 200.000 \text{ kg} \cdot 9,81 \text{ m/s}^2 = 1.962.000 \text{ N} = 1,962 \text{ MN}$$

Die Schubkraft muss also **größer als $1,962 \text{ MN}$** sein.

**b) Mittlere Schubkraft durch Gasausstoß**

Gegeben:
- Massenstrom $\dot{m} = \frac{\Delta m}{\Delta t} = 0,74 \text{ t/s} = 740 \text{ kg/s}$
- Austrittsgeschwindigkeit $v_e = 4,0 \text{ km/s} = 4000 \text{ m/s}$

Gesucht: mittlere Schubkraft $F_S$

Die Schubkraft ergibt sich aus der Impulsänderung der ausgestoßenen Gase (Raketengleichung):
$$F_S = \dot{m} \cdot v_e$$
$$F_S = 740 \text{ kg/s} \cdot 4000 \text{ m/s} = 2.960.000 \text{ N} = 2,96 \text{ MN}$$

Die mittlere Schubkraft beträgt **$2,96 \text{ MN}$**.

**c) Mittlere Beschleunigung**

Gegeben:
- Schubkraft $F_S = 2,96 \text{ MN} = 2.960.000 \text{ N}$
- Gewichtskraft $F_G = 1,962 \text{ MN} = 1.962.000 \text{ N}$
- Masse $m = 200.000 \text{ kg}$

Gesucht: Beschleunigung $a$

Die resultierende Kraft $F_{res}$ ist die Differenz aus Schubkraft und Gewichtskraft:
$$F_{res} = F_S - F_G$$
$$F_{res} = 2.960.000 \text{ N} - 1.962.000 \text{ N} = 998.000 \text{ N}$$

Nach dem 2. Newtonschen Axiom ($F = m \cdot a$) gilt für die Beschleunigung:
$$a = \frac{F_{res}}{m}$$
$$a = \frac{998.000 \text{ N}}{200.000 \text{ kg}} = 4,99 \text{ m/s}^2$$

Die Rakete wird mit einer mittleren Beschleunigung von **$4,99 \text{ m/s}^2$** gehoben.


## Energie (AB4)

### Aufgabe 1: Federspannarbeit

> [!info] Aufgabenstellung
> Zum weiteren Dehnen einer vorgespannten Feder auf 4 cm Gesamtverlängerung wird die Spannarbeit 0,06 J aufgebracht. Die Federkonstante beträgt 1 N/cm. Berechnen Sie, um welche Länge gegenüber ihrer Ruhelage die Feder anfangs gespannt war.

Gegeben:
- $W = 0,06 \text{ J}$
- $D = 1 \text{ N/cm} = 100 \text{ N/m}$
- $x_2 = 4 \text{ cm} = 0,04 \text{ m}$

Gesucht: $x_1$

Lösung:
$$W = W_2 - W_1 = \frac{1}{2} \cdot D \cdot x_2^2 - \frac{1}{2} \cdot D \cdot x_1^2$$
$$W = \frac{1}{2} D (x_2^2 - x_1^2)$$
$$0,06 \text{ J} = 0,06 \text{ Nm} \quad = \quad 50 \text{ N/m} \cdot (0,0016 \text{ m}^2 - x_1^2)$$
$/ \  50 \text{ N/m}$
$$0,0012 \text{ m}^2 = 0,0016 \text{ m}^2 - x_1^2$$
$$x_1^2 = 0,0004 \text{ m}^2 \implies x_1 = 0,02 \text{ m} = \underline{\underline{2 \text{ cm}}}$$


Es gilt: Da $1 \text{ J} = 1 \text{ Nm}$ ist, ergibt sich:
$$\frac{\text{Nm}}{\text{N/m}} = \text{Nm} \cdot \frac{\text{m}}{\text{N}} = \text{m}^2$$

### Aufgabe 2: Federspannarbeit

> [!info] Aufgabenstellung
> Eine Feder ist durch die Kraft $F_1 = 1.5$ N vorgespannt. Berechnen Sie die Endkraft, wenn für ein weiteres Spannen um 10 cm die Arbeit 0,25 J erforderlich ist.
>
Zur Kontrolle: $F_2 = 3.5$ N.

**Gegeben:**
- Vorspannkraft: $F_1 = 1{,}5\,\text{N}$
- Zusätzlicher Weg: $\Delta x = 10\,\text{cm} = 0{,}1\,\text{m}$
- Verrichtete Spannarbeit: $W = 0{,}25\,\text{J}$

**Gesucht:** $F_2$

**Lösung:**

Da die Feder bereits vorgespannt ist, gilt für die Spannarbeit:

$$W = \frac{F_1 + F_2}{2} \cdot \Delta x$$
Umformen nach $F_2$:
$$F_1 + F_2 = \frac{2W}{\Delta x}$$
$$\frac{2 \cdot 0{,}25\,\text{J}}{0{,}1\,\text{m}} = 5\,\text{N}$$

$$F_2 = 5\,\text{N} - F_1 = 5\,\text{N} - 1{,}5\,\text{N} = 3{,}5\,\text{N}$$
### Aufgabe 3: Jo-jo

> [!info] Aufgabenstellung
> Ein Jo-Jo besteht aus zwei Scheiben (Radius R<sub>s</sub> = 2,5 cm, Masse jeweils m<sub>s</sub> = 10 g) und einer Achse aus einem dünnwandigen Hohlzylinder ( $R_A = 0.5$ cm, $m_A = 2.5$ g). Die Schnur ist $L = 1$ m lang.
>
> a) Berechnen Sie das Trägheitsmoment des Jo-jo.
>
> b) Berechnen Sie die Geschwindigkeit des dünnwandigen Hohlzylinders und die Drehzahl, wenn sich die Schnur (fast) vollständig abgewickelt hat, d.h. kurz vor dem Umkehrpunkt.
>
Zur Kontrolle: a) $J_{ges} = 6{,}3125 \cdot 10^{-6}$ kg · m<sup>2</sup>b) $v \approx 1{,}3\frac{\text{m}}{\text{s}}$ ; $n \approx 2530 \frac{1}{\text{min}}$

**Gegeben:**
- Radien: $R_s = 2,5 \text{ cm}$, $R_A = 0,5 \text{ cm}$
- Massen: $m_s = 10 \text{ g}$ (pro Scheibe), $m_A = 2,5 \text{ g}$
- Schnurlänge: $L = 1 \text{ m}$

**Gesucht:**
- a) Trägheitsmoment $J_{ges}$
- b) Endgeschwindigkeit $v$ und Drehzahl $n$

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

**Lösung:**
a)
Das Gesamtträgheitsmoment setzt sich aus den beiden Scheiben (Vollzylinder) und der Achse (dünnwandiger Hohlzylinder) zusammen:
$$J_{ges} = 2 \cdot J_s + J_A$$

1. **Trägheitsmoment der Scheiben (Vollzylinder):**
$$J_s = \frac{1}{2} m_s \cdot R_s^2$$
$$J_s = \frac{1}{2} \cdot 0,01 \text{ kg} \cdot (0,025 \text{ m})^2 = 3,125 \cdot 10^{-6} \text{ kg}\cdot\text{m}^2$$

2. **Trägheitsmoment der Achse (dünnwandiger Hohlzylinder):**
$$J_A = m_A \cdot R_A^2$$
$$J_A = 0,0025 \text{ kg} \cdot (0,005 \text{ m})^2 = 0,0625 \cdot 10^{-6} \text{ kg}\cdot\text{m}^2$$

3. **Gesamtträgheitsmoment:**
$$J_{ges} = 2 \cdot (3,125 \cdot 10^{-6} \text{ kg}\cdot\text{m}^2) + 0,0625 \cdot 10^{-6} \text{ kg}\cdot\text{m}^2$$
$$J_{ges} = 6,25 \cdot 10^{-6} \text{ kg}\cdot\text{m}^2 + 0,0625 \cdot 10^{-6} \text{ kg}\cdot\text{m}^2 = \underline{\underline{6,3125 \cdot 10^{-6} \text{ kg}\cdot\text{m}^2}}$$

b)

**Energieerhaltungssatz:** Die potentielle Energie am Start wird in kinetische Energie (Translation) und Rotationsenergie umgewandelt.
$$E_{pot} = E_{kin} + E_{rot}$$
$$m_{ges} \cdot g \cdot L = \frac{1}{2} m_{ges} v^2 + \frac{1}{2} J_{ges} \omega^2$$

Da die Schnur auf der Achse abrollt, gilt der Zusammenhang zwischen Bahngeschwindigkeit $v$ und Winkelgeschwindigkeit $\omega$:
$$v = \omega \cdot R_A \implies \omega = \frac{v}{R_A}$$

Einsetzen in die Energiegleichung:
$$m_{ges} \cdot g \cdot L = \frac{1}{2} m_{ges} v^2 + \frac{1}{2} J_{ges} \left(\frac{v}{R_A}\right)^2$$
$$m_{ges} \cdot g \cdot L = \frac{1}{2} v^2 \left(m_{ges} + \frac{J_{ges}}{R_A^2}\right)$$

**1. Geschwindigkeit $v$ berechnen:**
$$v = \sqrt{\frac{2 \cdot m_{ges} \cdot g \cdot L}{m_{ges} + \frac{J_{ges}}{R_A^2}}}$$
Mit $m_{ges} = 22,5 \text{ g} = 0,0225 \text{ kg}$ und $g = 9,81 \text{ m/s}^2$:
$$v = \sqrt{\frac{2 \cdot 0,0225 \text{ kg} \cdot 9,81 \text{ m/s}^2 \cdot 1 \text{ m}}{0,0225 \text{ kg} + \frac{6,3125 \cdot 10^{-6} \text{ kg}\cdot\text{m}^2}{(0,005 \text{ m})^2}}}$$
$$v = \sqrt{\frac{0,44145 \text{ J}}{0,0225 \text{ kg} + 0,2525 \text{ kg}}} = \sqrt{\frac{0,44145}{0,275}} \approx \underline{\underline{1,27 \text{ m/s}}}$$

**2. Drehzahl $n$ berechnen:**
$$\omega = \frac{v}{R_A} = \frac{1,27 \text{ m/s}}{0,005 \text{ m}} = 254 \text{ rad/s}$$
$$n = \frac{\omega}{2\pi} = \frac{254}{2\pi} \approx 40,4 \text{ s}^{-1}$$
$$n_{min} = 40,4 \cdot 60 \approx \underline{\underline{2424 \text{ min}^{-1}}}$$

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

**Lösung:**

**1. Was ist gegeben?**
- **Federhärte ($D$)** = $20 \text{ N/m}$ (Wie stark die Feder zieht)
- **Masse ($m$)** = $100 \text{ g} = 0,1 \text{ kg}$ (Das Gewicht an der Feder)
- **Amplitude ($A$)** = $10 \text{ cm} = 0,1 \text{ m}$ (Wie weit wir am Anfang ziehen)

**2. Wichtige Hilfsgröße berechnen: $\omega$ (Omega)**
In der Physik nutzt man $\omega$ (die "Kreisfrequenz"), um zu beschreiben, wie schnell die Schwingung abläuft. Sie verbindet die Federkraft mit der Masse:
$$\omega = \sqrt{\frac{D}{m}} = \sqrt{\frac{20}{0,1}} = \sqrt{200} \approx 14,14 \text{ s}^{-1}$$

**a) Schwingungsdauer ($T$) und Ort ($x(t)$)**
- **Schwingungsdauer ($T$):** Das ist die Zeit für ein Mal hin und her.
  $$T = \frac{2\pi}{\omega} = \frac{2\pi}{14,14} \approx 0,444 \text{ s}$$
- **Ortsfunktion ($x(t)$):** Eine Formel, die uns sagt, wo die Kugel zu jedem Zeitpunkt $t$ ist. Da wir sie zum Start ($t=0$) loslassen, nutzen wir den Cosinus:
  $$x(t) = A \cdot \cos(\omega \cdot t) = 0,1 \cdot \cos(14,14 \cdot t)$$

**b) Geschwindigkeit und Beschleunigung (über Ableitungen)**
Um die Geschwindigkeit $v(t)$ und die Beschleunigung $a(t)$ zu finden, leiten wir den Ort $x(t)$ nach der Zeit $t$ ab:

1. **Geschwindigkeit $v(t)$:** (1. Ableitung des Ortes)
   $$v(t) = \dot{x}(t) = \frac{d}{dt} [A \cdot \cos(\omega \cdot t)] = -A \cdot \omega \cdot \sin(\omega \cdot t)$$
   Einsetzen der Werte ($0,1 \cdot 14,14$):
   $$v(t) \approx -1,41 \cdot \sin(14,14 \cdot t) \text{ m/s}$$
   Der maximale Wert (**$v_{max}$**) ist einfach der Faktor vor dem Sinus: **$1,41 \text{ m/s}$**.

2. **Beschleunigung $a(t)$:** (2. Ableitung des Ortes)
   $$a(t) = \dot{v}(t) = \frac{d}{dt} [-A \cdot \omega \cdot \sin(\omega \cdot t)] = -A \cdot \omega^2 \cdot \cos(\omega \cdot t)$$
   Einsetzen der Werte ($0,1 \cdot 14,14^2$ bzw. $0,1 \cdot 200$):
   $$a(t) = -20 \cdot \cos(14,14 \cdot t) \text{ m/s}^2$$
   Der maximale Wert (**$a_{max}$**) ist der Faktor vor dem Cosinus: **$20 \text{ m/s}^2$**.

**c) Energieverlust und neue Amplitude**

Hier müssen wir in drei einfachen Schritten denken:

1. **Wie schrumpft die Amplitude ($A$)?**
   Die Energie ($E$) einer Feder hängt vom **Quadrat** der Auslenkung ab ($E \sim A^2$). 
   - Wenn wir $5\%$ Energie verlieren, bleiben $95\%$ ($0,95$) übrig.
   - Weil $A$ im Quadrat steht, müssen wir die **Wurzel ziehen**, um zu wissen, wie die Amplitude schrumpft:
   $$\text{Schrumpf-Faktor} = \sqrt{0,95} \approx 0,975$$
   *(Das heißt: Nach jeder Schwingung ist die Amplitude noch $97,5\%$ vom vorherigen Wert.)*

2. **Wie viele Schwingungen passieren in 10 Sekunden?**
   Wir wissen aus Teil a), dass eine Schwingung $T \approx 0,444 \text{ s}$ dauert.
   $$n = \frac{10 \text{ s}}{0,444 \text{ s}} \approx 22,5 \text{ Schwingungen}$$

3. **Berechnung der End-Amplitude nach 10 Sekunden:**
   Wir nehmen die Start-Amplitude ($0,1 \text{ m}$) und lassen sie $22,5$-mal schrumpfen:
   $$A_{10s} = A_{Start} \cdot 0,975^{22,5} = 0,1 \text{ m} \cdot 0,56 \approx \mathbf{5,6 \text{ cm}}$$

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

> [!abstract] Erklärung zur Sammellinse
> Um ein Bild auf einem **Schirm** zu sehen, muss es **reell** sein. Das bedeutet, die Lichtstrahlen müssen sich hinter der Linse tatsächlich in einem Punkt treffen.
>
> Hier ist die einfache Logik dahinter:
>
> **1. Warum muss der Gegenstand dort stehen?**
> Es gibt bei einer Sammellinse (Konvexlinse) drei wichtige Bereiche für den Gegenstand:
> * **Weit weg ($g > 2f$):** Das Bild wird klein (wie bei einer Kamera oder im Auge).
> * **Sehr nah ($g < f$):** Das Bild wird riesig, aber **virtuell**. Man kann es nur *durch* die Linse sehen (wie bei einer Lupe), aber nicht auf eine Wand projizieren.
> * **Dazwischen ($f < g < 2f$):** Das ist unser Fall! Hier wird das Bild **größer als das Original** und bleibt **reell** (projektionsfähig).
>
> **2. Die drei Strahlen in der Zeichnung**
> Um zu zeigen, wo das Bild entsteht, nutzt man drei Standard-Strahlen, die vom Kopf des Gegenstands ausgehen:
> 1. **Parallelstrahl (rot):** Läuft gerade zur Linse und wird dort so gebrochen, dass er auf der anderen Seite genau durch den **Brennpunkt** geht.
> 2. **Mittelpunktstrahl (grün):** Läuft genau durch die Mitte der Linse. Da die Linse dort "flach" wirkt, geht dieser Strahl einfach schnurgerade weiter.
> 3. **Brennpunktstrahl (orange):** Läuft erst durch den vorderen Brennpunkt zur Linse und wird dort so gebrochen, dass er danach **parallel** zur Achse weiterläuft.
>
> **Das Ergebnis:** Dort, wo sich diese drei Strahlen hinter der Linse kreuzen, entsteht das Bild. In diesem Fall ist es weiter entfernt (Bildweite > $2f$) und deutlich größer als der ursprüngliche Gegenstand.
>
> **Zusammenfassung der Begriffe:**
> * **Gegenstandsweite ($g$):** Abstand vom Ding zur Linse.
> * **Bildweite ($b$):** Abstand von der Linse zum Schirm.
> * **Brennpunkt ($f$):** Der Punkt, an dem die Linse paralleles Licht sammelt.
> * **Reell:** "Echt" – die Strahlen treffen sich wirklich (Schirm-tauglich).
> * **Umgekehrt:** Das Bild steht auf dem Kopf (sieht man in der Grafik an der Pfeilspitze, die nach unten zeigt).


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

**1. Gegeben und Gesucht:**
- Brennweite $f = 120 \text{ mm} = 0,12 \text{ m}$
- Bildweite $b = 2,5 \text{ m}$ (Abstand zum Schirm)
- Gegenstandsgröße $G = 6,0 \text{ cm} = 0,06 \text{ m}$
- Gesucht: Bildgröße $B$

**2. Gegenstandsweite $g$ berechnen:**
Mit der Abbildungsgleichung $\frac{1}{f} = \frac{1}{g} + \frac{1}{b}$ stellen wir nach $\frac{1}{g}$ um:
$$\frac{1}{g} = \frac{1}{f} - \frac{1}{b}$$
$$\frac{1}{g} = \frac{1}{0,12 \text{ m}} - \frac{1}{2,5 \text{ m}} \approx 8,333 \text{ m}^{-1} - 0,4 \text{ m}^{-1} = 7,933 \text{ m}^{-1}$$
$$g = \frac{1}{7,933 \text{ m}^{-1}} \approx 0,126 \text{ m} = 126 \text{ mm}$$

**3. Abbildungsmaßstab $A$ und Bildgröße $B$ berechnen:**
Der Abbildungsmaßstab ergibt sich aus dem Verhältnis von Bild- zu Gegenstandsweite:
$$A = \frac{b}{g} = \frac{2,5 \text{ m}}{0,126 \text{ m}} \approx 19,84$$
Das Bild ist also fast 20-mal so groß wie das Original.

Die Bildgröße $B$ berechnet sich nun durch:
$$B = G \cdot A = 6,0 \text{ cm} \cdot 19,84 \approx 119 \text{ cm} = 1,19 \text{ m}$$

**Ergebnis:**
Das Bild auf der Projektionswand hat die Abmessungen **$1,19 \text{ m} \times 1,19 \text{ m}$**.


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

**1. Reflexionswinkel $\alpha'$ bestimmen:**
Nach dem Reflexionsgesetz ist der Einfallswinkel gleich dem Reflexionswinkel:
$$\alpha' = \alpha = 55^\circ$$

**2. Brechungswinkel $\beta$ berechnen:**
Wir nutzen das Brechungsgesetz von Snellius ($n_1 \cdot \sin \alpha = n_2 \cdot \sin \beta$). Wir nehmen Luft als erstes Medium an ($n_1 \approx 1,0$):
$$1,0 \cdot \sin(55^\circ) = 1,5 \cdot \sin(\beta)$$
$$\sin(\beta) = \frac{\sin(55^\circ)}{1,5} \approx \frac{0,8192}{1,5} \approx 0,5461$$
$$\beta = \arcsin(0,5461) \approx 33,1^\circ$$

**3. Winkel $\gamma$ zwischen den Strahlen berechnen:**
Der reflektierte Strahl befindet sich oberhalb der Grenzfläche (Winkel $\alpha'$ zum Lot), der gebrochene Strahl unterhalb (Winkel $\beta$ zum Lot). Da das Lot eine gerade Linie (180°) bildet, berechnet sich der Winkel dazwischen wie folgt:
$$\gamma = 180^\circ - \alpha' - \beta$$
$$\gamma = 180^\circ - 55^\circ - 33,1^\circ = 91,9^\circ$$

**Ergebnis:**
Der Winkel zwischen dem reflektierten und dem gebrochenen Strahl beträgt **$91,9^\circ$**.


### Aufgabe 4: Parallelplatte

> [!info] Aufgabenstellung
> Wie groß ist die Querverschiebung $q$ eines schräg durch eine Parallelplatte von der Dicke $d$ laufenden Lichtstrahls?
>
> a) Geben Sie eine allgemeine Formel an ($q$ als Funktion von $d$, $\alpha$ und $\beta$; $q = f(d, \alpha, \beta)$).
>
> b) Berechnen Sie $q$ für $d = 6$ mm, $\alpha = 40^{\circ}$ und $n = 1,5$.

![[Übungen/Übungen-_page_10_Figure_10.jpeg]]

### Aufgabe 5: Auge

> [!info] Aufgabenstellung
> Die Empfindlichkeitsschwelle des menschlichen Auges liegt im günstigsten Fall bei etwa 100 Photonen/s. Das Auge ist bei einer Wellenlänge von etwa 550 nm am empfindlichsten. Welche minimale Lichtleistung kann das Auge demnach detektieren?


![[Übungen/Übungen-_page_10_Figure_10.jpeg]]

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
