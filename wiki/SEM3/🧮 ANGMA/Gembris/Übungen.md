---
tags: [sem3, angma]
type: exercise
sources: ["Übungsblatt Deskriptive Statistik"]
date: 2026-10-08
updated: 2026-10-08
---
Übungen zu [[1. Deskriptive Statistik]]

## A2 – Reaktionszeiten zweier Systeme

Aufgabe: Zwei Systeme führen denselben Algorithmus aus. Gemessen wurden je 10 Reaktionszeiten in ms. Welches System ist für Echtzeit besser?

Die Daten stehen schon **sortiert** da ($x_{(1)}$ = kleinster Wert, $x_{(10)}$ = größter):

| Platz | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |
|---|---|---|---|---|---|---|---|---|---|---|
| **A** | 45 | 50 | 52 | 53 | 60 | 62 | 70 | 75 | 80 | 90 |
| **B** | 40 | 42 | 50 | 55 | 58 | 60 | 61 | 65 | 68 | 75 |

### a) Quartile und Boxplot

Ein Quartil teilt die sortierte Liste: 25 % der Werte liegen darunter ($Q_1$), 50 % ($Q_2$ = Median), 75 % ($Q_3$).

Berechnung nach [[1. Deskriptive Statistik#1.7.4 Methode 2|Methode 2]]: erst $n \cdot p$ ausrechnen, dann
- **keine ganze Zahl** → aufrunden, den Wert auf diesem Platz nehmen
- **ganze Zahl** → Mittel aus dem Wert auf diesem Platz und dem nächsten

**$Q_1$** ($p = 0{,}25$): $10 \cdot 0{,}25 = 2{,}5$ → keine ganze Zahl → aufrunden auf Platz 3
- A: Platz 3 = **52**
- B: Platz 3 = **50**

**Median** ($p = 0{,}5$): $10 \cdot 0{,}5 = 5$ → ganze Zahl → Mittel aus Platz 5 und 6
- A: $(60 + 62)/2 =$ **61**
- B: $(58 + 60)/2 =$ **59**

**$Q_3$** ($p = 0{,}75$): $10 \cdot 0{,}75 = 7{,}5$ → aufrunden auf Platz 8

- A: Platz 8 = **75**
- B: Platz 8 = **65**

**Boxplot zeichnen:** Man braucht fünf Werte: Min, $Q_1$, Median, $Q_3$, Max.

| | Min | $Q_1$ | Median | $Q_3$ | Max |
|---|---|---|---|---|---|
| A | 45 | 52 | 61 | 75 | 90 |
| B | 40 | 50 | 59 | 65 | 75 |

Die **Box** geht von $Q_1$ bis $Q_3$, der **Strich** darin ist der Median, die **Whisker** gehen bis Min bzw. Max – *sofern* es keine Ausreißer gibt (siehe b).

```
ˆ
| au
| 
|      40   45   50   55   60   65   70   75   80   85   90
| A:        |-----[=====52====|61|======75]---------------|
| B:   |----------[====50====|59|==65]------|
| 
--------------------------------------------------------------------> t in m/s
```

### b) Verteilung beschreiben

**Ausreißer:** Ein Wert ist Ausreißer, wenn er mehr als $1{,}5 \cdot \mathrm{IQR}$ außerhalb der Box liegt.
Dabei ist $\mathrm{IQR} = Q_3 - Q_1$ (Boxbreite).

- A: $\mathrm{IQR} = 75 - 52 = 23$ → Grenzen $52 - 34{,}5 = 17{,}5$ und $75 + 34{,}5 = 109{,}5$. Alle Werte liegen zwischen 45 und 90 → **keine Ausreißer**
- B: $\mathrm{IQR} = 65 - 50 = 15$ → Grenzen $27{,}5$ und $87{,}5$. Werte liegen zwischen 40 und 75 → **keine Ausreißer**

**Streuung:** Je breiter die Box, desto größer die Streuung. A: $\mathrm{IQR} = 23$, B: $\mathrm{IQR} = 15$ → **A streut mehr**. Das passt zur Spannweite (A: 45, B: 35).

**Symmetrie:** Bei einer symmetrischen Verteilung liegt der Median in der Mitte der Box (Durchschnitt Min/Max) und beide Whisker sind gleich lang.
- A: Median 61 liegt näher an $Q_1$ (Abstand 9) als an $Q_3$ (Abstand 14). Der obere Whisker ist länger (90 − 61 = 29 gegenüber 61 − 45 = 16). Der Mittelwert $\bar x = 63{,}7$ liegt über dem Median → **rechtsschief** (ein „Schwanz“ zu großen Werten)
- B: Abstände zum Median ungefähr gleich ($59 - 50 = 9$, $65 - 59 = 6$), $\bar x = 57{,}4$ nur knapp unter dem Median → **annähernd symmetrisch**

### c) Q-Q-Plot

Idee: Man vergleicht die **Verteilungen** der beiden Systeme, indem man gleich platzierte Werte als Punkt aufträgt: x = Platz $k$ von B, y = Platz $k$ von A.

Also Platz 1 → Punkt (40 | 45), Platz 2 → (42 | 50) usw.:

```desmos-graph
left=35; right=95; bottom=35; top=95;
---
y=x
([40,42,50,55,58,60,61,65,68,75],[45,50,52,53,60,62,70,75,80,90])
```

Dazu zeichnet man die Winkelhalbierende $y = x$ ein. Sie wäre die Linie, auf der die Punkte lägen, wenn A und B **gleich** verteilt wären.

Was man abliest:
- Die Punkte liegen **über** der Linie → A hat bei gleichem Platz meist größere Zeiten, also ist A langsamer.
- Die Punkte sind **steiler** als die Linie (Anstieg von (40\|45) bis (75\|90) ca. $45/35 \approx 1{,}3$) → A streut stärker.
- Am oberen Ende geht die Punktwolke weiter nach oben weg → langer oberer Schwanz bei A (Rechtsschiefe).

### d) Entscheidung

**System B.** Bei Echtzeit zählt, dass die Zeit **verlässlich klein** bleibt, nicht nur im Durchschnitt:

- Der Median ist ähnlich (59 gegenüber 61 ms) – das allein entscheidet es nicht.
- B streut weniger (IQR 15 gegenüber 23) → die Zeit ist besser vorhersagbar.
- B hat den besseren Worst Case: Max 75 gegenüber 90 ms, $Q_3$ 65 gegenüber 75 ms. Bei A dauert jede vierte Messung 75 ms oder länger.
