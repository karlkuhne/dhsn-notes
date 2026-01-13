# 1.  Zahlen

- Natürliche Zahlen $\mathbb{N}$
- Ganze Zahlen $\mathbb{Z}$
- Rationale Zahlen $\mathbb{Q}$
  Die Menge aller gemeinen Brüche bzw. endlicher dezimaler Brüche oder unendlich dezimaler aber periodischer Brüche
- Reelle Zahlen $\mathbb{R}$
  $\sqrt{2}, \pi$ sind rationale Zahlen

# 2. Aussagenlogik

>In der Aussagenlogik werden Aussagen miteinander verglichen. Eine Aussage ist eine Behauptung die eindeutig mit WAHR oder FALSCH beantwortet werden

Beispiele für Aussagen:
- $a = b$
- $1 > 2$

Beispiele für Nichtaussagen
- $a \ ! \ b$
- $a \land b$

## 2.1 Junktoren
### 2.1.1 Die Konjunktion $\land$

Die Konjunktion ist das logische UND. Es seien A und B zwei Aussagen.
Logischer Ausdruck $A \land B$

| $A$ | $B$ | $A \land B$ |
| :-: | :-: | :---------: |
|  1  |  1  |      1      |
|  1  |  0  |      0      |
|  0  |  1  |      0      |
|  0  |  0  |      0      |
### 2.1.2 Die Disjunktion $\lor$

Logisches ODER
Logischer Ausdfruck: $A \land B$
Die Disjunktion ist wahr, wenn wenigstens eine der beiden Aussagen wahr ist

| $A$ | $B$ | $A \lor b$ |
| :-: | :-: | :--------: |
|  1  |  1  |     1      |
|  1  |  0  |     1      |
|  0  |  1  |     1      |
|  0  |  0  |     0      |
### 2.1.3 Die Negation $\lnot$

Alternativ schreibt man auch $\overline A$

| $A$ | $\overline A$ |
| :-: | :-----------: |
|  1  |       0       |
|  0  |       1       |
### 2.1.4 Die doppelte Negation

| $A$ | $\overline{A}$ | $\overline{\overline{A}}$ |
| :-: | :------------: | :-----------------------: |
|  1  |       0        |             1             |
|  0  |       1        |             0             |
### 2.1.5 Die Äquivalenz

$A \Leftrightarrow B$

| $A$ | $B$ | $A \Leftrightarrow B$ |
| :-: | :-: | :-------------------: |
|  1  |  1  |           1           |
|  1  |  0  |           0           |
|  0  |  1  |           0           |
|  0  |  0  |           1           |
### 2.1.6 Die Implikation

A impliziert B (umgangssprachlich: daraus folgt)
$A \Rightarrow B$

Bsp: A = "Es regnet", B = "Die Straße ist nass"

| $A$ | $B$ | $A \Rightarrow B$ |
| :-: | :-: | :---------------: |
|  1  |  1  |         1         |
|  1  |  0  |         0         |
|  0  |  1  |         1         |
|  0  |  0  |         1         |
Bsp. 2: A = "Ich trinke ein Bier", B="In Paris scheint die Sonne"
D.h. A und B müssen nicht zwingend einen kausalen Zusammenhang haben

### 2.1.7 De  Morgansche Gesetze

__1. De Morgansches Gesetz__
$\overline{A \land B} = \overline{A} \lor \overline{B}$

__2. De Morgansches Gesetz__
$\overline{A \lor B} = \overline{A} \land \overline{B}$

__Beweis 1.__

| $A$ | $B$ | $\overline{A}$ | $\overline{B}$ | $A \land B$ | $\overline{A} \lor \overline{B}$ | $\overline{A \land B}$ |
| :-: | :-: | :------------: | :------------: | :---------: | :------------------------------: | :--------------------: |
|  1  |  1  |       0        |       0        |      1      |                0                 |           0            |
|  1  |  0  |       0        |       1        |      0      |                1                 |           0            |
|  0  |  1  |       1        |       0        |      0      |                1                 |           0            |
|  0  |  0  |       1        |       1        |      0      |                1                 |           1            |

__Beweis 2.__

| $A$ | $B$ | $\overline{A}$ | $\overline{B}$ | $A \lor B$ | $\overline{A} \land \overline{B}$ | $\overline{A \lor B}$ |
| :-: | :-: | :------------: | :------------: | :--------: | :-------------------------------: | :-------------------: |
|  1  |  1  |       0        |       0        |     1      |                 0                 |           0           |
|  1  |  0  |       0        |       1        |     1      |                 0                 |           0           |
|  0  |  1  |       1        |       0        |     1      |                 0                 |           0           |
|  0  |  0  |       1        |       1        |     f      |                 1                 |           1           |
Die beiden letzten Spalten sind jedes Mal identisch

### 2.1.8 Kommutativgesetz

__1. Kommutativgesetz__

$A \land B \Leftrightarrow B \land A$
| $A$ | $B$ | $A \land B$ | $B \land A$ |
| :-: | :-: | :---------: | :---------: |
|  1  |  1  |      1      |      1      |
|  1  |  0  |      0      |      0      |
|  0  |  1  |      0      |      0      |
|  0  |  0  |      0      |      0      |

__2. Kommutativgesetz__

$A \lor B \Leftrightarrow B \lor A$

| $A$ | $B$ | $A \lor B$ | $B \lor A$ |
| :-: | :-: | :--------: | :--------: |
|  1  |  1  |     1      |     1      |
|  1  |  0  |     1      |     1      |
|  0  |  1  |     1      |     1      |
|  0  |  0  |     0      |     0      |
### 2.1.9 Assoziativgesetz

__1. Assoziativgesetz__

$A \land (B \land C) \Leftrightarrow (A \land B) \land C$
| $A$ | $B$ | $C$ | $B \land C$ | $A \land B$ | $A \land (B \land C)$ | $(A \land B) \land C$ |
| :-: | :-: | :-: | :---------: | :---------: | :-------------------: | :-------------------: |
|  1  |  1  |  1  |      1      |      1      |           1           |           1           |
|  1  |  1  |  0  |      0      |      1      |           0           |           0           |
|  1  |  0  |  1  |      0      |      0      |           0           |           0           |
|  1  |  0  |  0  |      0      |      0      |           0           |           0           |
|  0  |  1  |  1  |      1      |      0      |           0           |           0           |
|  0  |  1  |  0  |      0      |      0      |           0           |           0           |
|  0  |  0  |  1  |      0      |      0      |           0           |           0           |
|  0  |  0  |  0  |      0      |      0      |           0           |           0           |

__2.  Assoziativgesetz__

$A \lor (B \lor C) \Leftrightarrow (A \lor B) \lor C$
| $A$ | $B$ | $C$ | $B \lor C$ | $A \lor B$ | $A \lor (B \lor C)$ | $(A \lor B) \lor C$ |
| :-: | :-: | :-: | :--------: | :--------: | :-----------------: | :-----------------: |
|  1  |  1  |  1  |     1      |     1      |          1          |          1          |
|  1  |  1  |  0  |     1      |     1      |          1          |          1          |
|  1  |  0  |  1  |     1      |     1      |          1          |          1          |
|  1  |  0  |  0  |     0      |     1      |          1          |          1          |
|  0  |  1  |  1  |     1      |     1      |          1          |          1          |
|  0  |  1  |  0  |     1      |     1      |          1          |          1          |
|  0  |  0  |  1  |     1      |     0      |          1          |          1          |
|  0  |  0  |  0  |     0      |     0      |          0          |          0          |
Die beiden letzten Spalten sind jedes Mal identisch

### 2.1.10 Distributivgesetz

__1. Distributivgesetz__

$A \land (B \lor C) \Leftrightarrow (A \land B) \lor (A \land C)$
| $A$ | $B$ | $C$ | $B \lor C$ | $A \land B$ | $A \land C$ | $A \land (B \lor C)$ | $(A \land B) \lor (A \land C)$ |
| :-: | :-: | :-: | :--------: | :---------: | :---------: | :------------------: | :----------------------------: |
|  1  |  1  |  1  |     1      |      1      |      1      |          1           |               1                |
|  1  |  1  |  0  |     1      |      1      |      0      |          1           |               1                |
|  1  |  0  |  1  |     1      |      0      |      1      |          1           |               1                |
|  1  |  0  |  0  |     0      |      0      |      0      |          0           |               0                |
|  0  |  1  |  1  |     1      |      0      |      0      |          0           |               0                |
|  0  |  1  |  0  |     1      |      0      |      0      |          0           |               0                |
|  0  |  0  |  1  |     1      |      0      |      0      |          0           |               0                |
|  0  |  0  |  0  |     0      |      0      |      0      |          0           |               0                |
__2. Distributivgesetz__

$A \lor (B \land C) \Leftrightarrow (A \lor B) \land (A \lor C)$
| $A$ | $B$ | $C$ | $B \land C$ | $A \lor B$ | $A \lor C$ | $A \lor (B \land C)$ | $(A \lor B) \land (A \lor C)$ |
|:-:|:-:|:-:|:-----------:|:----------:|:----------:|:-------------------:|:----------------------------:|
| 1 | 1 | 1 | 1           | 1          | 1          | 1                   | 1                            |
| 1 | 1 | 0 | 0           | 1          | 1          | 1                   | 1                            |
| 1 | 0 | 1 | 0           | 1          | 1          | 1                   | 1                            |
| 1 | 0 | 0 | 0           | 1          | 1          | 1                   | 1                            |
| 0 | 1 | 1 | 1           | 1          | 1          | 1                   | 1                            |
| 0 | 1 | 0 | 0           | 1          | 0          | 0                   | 0                            |
| 0 | 0 | 1 | 0           | 0          | 1          | 0                   | 0                            |
| 0 | 0 | 0 | 0           | 0          | 0          | 0                   | 0                            |
Die beiden letzten Spalten sind jedes Mal identisch

### 2.1.11 Idempotenzgesetze

__1. Idempotenzgesetz__

$A \land A \Leftrightarrow A$

__2. Idempotenzgesetz__

$A \lor A \Leftrightarrow A$

### 2.1.12 Absorptionsgesetze

__1. Absorptionsgesetz__

$A \Leftrightarrow A \land (A \lor B)$
| $A$ | $B$ | $A \lor B$ | $A \land (A \lor B)$ |
|:-:|:-:|:-----------:|:-------------------:|
| 1 | 1 | 1           | 1                   |
| 1 | 0 | 1           | 1                   |
| 0 | 1 | 1           | 0                   |
| 0 | 0 | 0           | 0                   |
Erste und letzte Spalte identisch

__2. Absorptionsgesetz__

$A \Leftrightarrow A \lor (A \land B)$
| $A$ | $B$ | $A \land B$ | $A \lor (A \land B)$ |
|:-:|:-:|:-----------:|:-------------------:|
| 1 | 1 | 1           | 1                   |
| 1 | 0 | 0           | 1                   |
| 0 | 1 | 0           | 0                   |
| 0 | 0 | 0           | 0                   |
Erste und letzte Spalte identisch

### 2.1.13 Neutralitätsgesetze

__1. Neutralitätsgesetz__

$A \land W \Leftrightarrow A$
| $A$ | $W$ | $A \land W$ |
|:-:|:-:|:-----------:|
| 1 | 1 | 1           |
| 0 | 1 | 0           |

__2. Neutralitätsgesetz__

$A \lor f \Leftrightarrow A$
| $A$ | $F$ | $A \lor F$ |
|:-:|:-:|:-----------:|
| 1 | 0 | 1           |
| 0 | 0 | 0           |

### 2.1.14 Extremalgesetze

__1. Extremalgesetz__

$A \land F \Leftrightarrow F$
| $A$ | $F$ | $A \land F$ |
|:-:|:-:|:-----------:|
| 1 | 0 | 0           |
| 0 | 0 | 0           |

__2. Extremalgesetz__

$A \lor W \Leftrightarrow W$
| $A$ | $W$ | $A \lor W$ |
|:-:|:-:|:-----------:|
| 1 | 1 | 1           |
| 0 | 1 | 1           |

### 2.1.15 Komplementärgesetze

__1. Komplementärgesetz__

$A \land \overline{A} \Leftrightarrow F$
| $A$ | $\overline{A}$ | $A \land \overline{A}$ |
|:-:|:-:|:-------------------:|
| 1 | 0 | 0                   |
| 0 | 1 | 0                   |

__2. Komplementärgesetz__

$A \lor \overline{A} \Leftrightarrow F$

| $A$ | $\overline{A}$ | $A \lor \overline{A}$ |
|:-:|:-:|:-------------------:|
| 1 | 0 | 1                   |
| 0 | 1 | 1                   |

### 2.1.16 Dualitätsgesetze

$\overline{W} \Leftrightarrow F$
$\overline{F} \Leftrightarrow W$

# 3. Mengenlehre

>Unter einer Menge verstehen wir jede Zusammenfassung M von bestimmten wohl unterscheidbaren Objekten unserer Anschauung und unseres Denkens (Cantor)

Beispiele:

1) M = {linker Schuh, rechter Schuh, Hose, Shirt}
2) M = {1, 2, 3}

## 3.1 Elemente einer Menge

Weiterhin gilt für ein beliebiges Element $m_k$ mit
$m_k \ne m_1, m_k \ne m_2, \dots, m_k \ne m_n$
$\Rightarrow m_k \notin M$

Logische Schreibweise: $m_k \notin M$ bzw. $\overline{m_k \in M}$

## 3.2 Darstellung einer Menge mit unendlich vielen Elementen

Es sei A eine Menge deren Elemente natürliche Zahlen sind.

$A = \{ m \in \mathbb{N}_0 \mid \dots \}$

__Gegenbeispiele:__

$A = \{  n \in \mathbb{Z} | n^2\}$
$n^2$ alleine ist keine Aussage

$A = \{ n \in \mathbb{Q} | 5 \}$

## 3.3 Die leere Menge

$\varnothing = \{ \}$

Die Menge enthält keine Elemente

## 3.4 Die Mächtigkeit endlicher Mengen

Eine Menge heißt endlich, wenn sie endlich viele Elemente besitzt.

$$A = \{ m_1, m_2, \dots, m_n \} \Leftrightarrow | A | = n$$

__Beispiel:__

$A = \{ 1, 2, 3 \}$
$|A| = 3$

## 3.5 Mengenoperationen

### 3.5.1 Vereinigung zweier Mengen A und B

$A = \{ 1, 2, 3 \}$
$B = \{3, 4, 5\}$
$\Rightarrow A \cup B = \{1, 2, 3, 3, 4, 5 \}$


__Logische Formulierung der Vereinigung__
$$\forall x_. x \in (A \cup B) \Leftrightarrow (x \in A) \lor (x \in B)$$

### 3.5.2 Schnitt/Durchschnitt zweier Mengen A und B

$A = \{ 1, 2, 3 \}$
$B = \{3, 4, 5\}$
$\Leftrightarrow A \cap B = \{ 3 \}$

$A = \{ 2, 4, 6 \}$
$B = \{1, 3, 5\}$
$\Leftrightarrow A \cap B = \varnothing$

__Logische Formulierung__
$$\forall x_. x \in (A \cap B) \Leftrightarrow (x \in A) \land (x \in B)$$

### 3.5.3 Differenz zweier Mengen A und B

$A = \{ 1, 2, 3 \}$
$B = \{3, 4, 5\}$
$A \setminus B = \{ 1, 2 \}$

__Logische Formulierung__
$$\forall x_.(x \in A \setminus B) \Leftrightarrow (x \in A) \land (x \notin B)$$

### 3.5.4 Äquivalenz zweier  Mengen A und B

__Logische Formulierung__
$$\forall x_. x \in (x \in A) \Leftrightarrow (x \in B)$$

## 3.6 Teilmengenrelation

A ist Teilmenge von B $(A \subseteq B)$

__Logische Formulierung__
$$A \subseteq B \Leftrightarrow (\forall x_.(x \in A) \implies (x \in B))$$
A ist echte Teilmenge von B ($A \subset B$)

### 3.6.1 Durchschnitt von Mengen A, B und C

$$A \cap (B \cap C) = (A \cap B) \cap C$$
### 3.6.2 Absorptionsgesetze

$$(A \cap B) \cup A = A$$
$$(A \cup B) \cap A = A$$

### 3.6.3 Noch eine Beziehung

$(A \setminus B) \cup B = (A \cap \overline{B}) \cup B = B \cup (A \cap \overline{B})$
$=(B \cup A) \cap (B \cup \overline{B})$ (letzteres ist die Grundmenge)
$= A \cup B$

## 3.7 Mächtigkeit und Abzählbarkeit unendlicher Mengen

Beispiele: $\mathbb{N, R, Q, Z}$

Problem: Eine konkrete Anzahl von Elementen einer unendlichen Menge kann nicht angegeben werden.

$A = \{ m_1, m_2, m_3 \}$

### 3.7.1 Abzählbarkeit von $\mathbb{N_0}$

Abzählen beginnend mit 1 bei der 0

### 3.7.2 Abzählbarkeit von $\mathbb{Z}$

Abzählen mit der 1 bei der 0, dann gerade Zahlen für negative und ungerade für positive

### 3.7.3 Abzählbarkeit von $\mathbb{Q}$

Ist auch möglich

### 3.8.4 Abzählbarkeit von $\mathbb{R}$

$\mathbb{R}$ ist überabzählbar im Gegensatz zu $\mathbb{N_0, Q, Z}$

# 4. Die vollständige Induktion

>Ein Verfahren zum Beweisen, dass die mathematische Aussage $f(n)$ für alle
>$n \in \mathbb{N}, \mathbb{N}_0$ wahr ist

__1. Induktionsanfang:__
Stimmt die Behauptung fürs $n = 0$ oder $n = 1$.

__2. Induktionsvoraussetzung/-annahme:__
Es wird angenommen, dass die Annahme $f(n)$ korrekt ist.

__3. Induktionsschritt:__
Es ist zu zeigen, dass $f(n)$ auch für $n + 1$ statt $n$ gilt.
D.h. überall wo $n$ steht, wird $n + 1$ eingesetzt.

__4. Schlussfolgerung:__
Da die Aussage für $n = 0$ bzw. $n = 1$ gilt und aus der Gültigkeit von $f(n)$ auch die Gültigkeit von $f(n + 1)$ folgt, gilt die Annahme für alle folgenden Schritt: $n + 2, n + 3, \dots$


__Bsp.: Addition von $n$ Zahlen von 1 bis $n$__
$$z_n = 1 + 2 + 3 + \dots + n, n \in \mathbb{N} = \frac{n(n + 1)}{2}$$
bzw.
$$\sum_{k=1}^{n} k = \frac{n(n+1)}{2}, n \in \mathbb{N}$$

__1. Induktionsanfang__
$$n = 1$$
$$z_1 = \frac{1(1 + 1)}{2} = 1$$

__2. Induktionsvoraussetzung__
$$z_n = \frac{n(n + 1)}{2}$$

__3. Induktionsschritt__
Ersetzen $n$ durch $n + 1$
$$z_n \to z_{n + 1}$$
$$z_{n + 1} = \frac{(n + 1)(n + 1 + 1)}{2}$$
$$\Rightarrow \frac{(n + 1)(n + 2)}{2}$$
Daraus ergibt sich ausgeschrieben
$$z_{n + 1}= \underbrace{1 + 2 + 3 + \dots + n}_{z_n} + (n + 1), n \in \mathbb(N)$$
Term einsetzen
$$z_{n+1} = \frac{n(n + 1)}{2} + (n+1)$$
Auf einen Nenner bringen
$$z_{n+1} = \frac{n(n + 1)}{2} + \frac{2(n+1)}{2}$$
$$= \frac{n(n +  1) + 2(n + 1)}{2}$$
Daraus ergibt sich wiederum der ursprüngliche Term
$$= \frac{(n + 1)(n + 2)}{2}$$

__4. Induktionsschlussfolgerung__
Passt!

# 5. Die Potenzmenge

Die Potenzmenge ist die Menge aller Teilmengen einer beliebigen Menge $M$.
Dann ist $P(M)$ die Potenzmenge von $M$.

Bsp.:
$M = \{ 2, 4, 6 \}$
$P(M) = \{ \varnothing, \{2\}, \{4\}, \{6\}, \{2, 4\}, \{2, 6\}, \{4, 6\}, M \}$

Potenzmenge der leeren Menge: $P( \varnothing ) = \{ \varnothing \}$

> Die Mächtigkeit der Potenzmenge der Menge $M$ ergibt sich aus $| P(M) | = 2^{|M|}$

## 5.1 Beweis
$$|M| \in \mathbb{N} \quad |M| = n \quad M = \{ m_1, m_2, m_3, \dots, m_n \}$$

__1. Induktionsanfang:__
$$n = 0 \quad M = \{  \} = \varnothing$$
$$P(M) = \{ \varnothing \}$$
$$|P(M)| = 2^0 = 1$$

__2. Induktionsvoraussetzung:__
$$|P(M)| = 2^n$$

__3. Induktionsschritt__

$n$ durch $n + 1$ ersetzen:
$$\Rightarrow M = \{ m_1, m_2, m_3, \dots, m_n, m_{n+1} \}$$
$$\Rightarrow |P(M)| = 2^{n + 1}$$

Betrachten für beliebige Teilmenge $x \in M$. Für $x$ gibt es zwei Möglichkeiten:

__Fall 1:__
Die Teilmenge $x$ enthält das Element $m_{n+1}$ nicht
$$m_{n + 1} \notin x$$
Entsprechend ist $x$ eine Teilmenge der Menge $M' = \{ m_1, m_2, m_3, \dots, m_n \}$ die nur $n$ Elemente hat.

Alle diese Teilmengen definieren wir in
$$A = \{ x \subseteq M \mid m_{n + 1} \notin x \}$$

Nach Induktionsvoraussetzung ist die Anzahl dieser Teilmengen:
$$|A| = |P(M')| = 2^n$$

__Fall 2:__
Die Teilmenge $x$ enthält das Element $m_{n+1}$
$$m_{m + 1} \in x$$
Entsprechend kann man $x$ als $\{ m_{n+1} \} \cup x'$ schreiben, wobei $x'$ eine beliebige Teilmenge aus $M'$ ist.

Alle diese Teilmengen definieren wir in
$$B = \{ x \subseteq M \mid m_{n + 1} \in x \}$$
Da jede Teilmenge von $M'$ mit hinzugefügtem $m_{n+1}$ in $B$ steht, ist die Anzahl gleich
$$|B| = |P(M')| = 2^n$$

__Gesamtanzahl der Teilmengen__
Die Mengen $A$ und $B$ sind disjunkt und ihre Vereinigung ergibt die gesamte Potenzmenge von $M$
$$P(M) = A \cup B$$
Die Mächtigkeit der Potenzmenge von $M$ ist somit die Summe der Mächtigkeiten von $A$ und $B$:
$$|P(M) = |A| + |B|$$
$$= 2^n + 2^n = 2 \cdot 2^n = 2^{n+1}$$
Somit wurde der Induktionsschritt erfolgreich durchgeführt und die Formel $|P(M)| = 2^n$ bewiesen.

# 6. Der binomische Lehrsatz

## 6.1 Die binomischen Formeln

__1. Binomische Formel__

$(a + b)^2 = a^2 + 2ab + b^2$

__2. Binomische Formel__

$(a - b)^2 = a^2 - 2ab + b^2$

__3. Binomische Formel__

$(a-b)(a+b) = a^2 - b^2$

## 6.2 Der Binomische Lehrsatz

Der binomische Lehrsatz verallgemeinert die binomischen Formeln für beliebige Potenzen $n \in \mathbb{N}_0$.

Der Binomische Lehrsatz lautet allgemein:
$$(a+b)^n = \sum_{k=0}^{n} \binom{n}{k} a^{n-k} b^k$$
Das gilt $\binom{n}{k} = \frac{n!}{k!(n-k)!}$
$$\Rightarrow (a+b)^n = \sum_{k=0}^{n} \frac{n!}{k!(n-k)!} a^{n-k} b^k$$
__Beispiel:__
$$(a+b)^3 = \sum_{k=0}^3 \binom{3}{k} a^{3-k} b^k$$
$$= \binom{3}{0} a^3 + \binom{3}{1} a^2b + \binom{3}{2} ab^2 + \binom{3}{3}b^3$$
$$= \frac{3!}{0!(3-0)!} a^3 + \frac{3!}{1!(3-1)!} a^2b + \frac{3!}{2!(3-2)!} ab^2 + \frac{3!}{3!(3-3)!}b^3$$
$$= \underline{\underline{a^3 + 3a^2b + 3ab^2 + b^3}}$$

__Weitere Betrachtungen der Expansion von $(a+b)^n$ für kleine $n$:__

- Für $n=0$: $(a+b)^0 = 1$
- Für $n=1$: $(a+b)^1 = a + b$
- Für $n=2$: $(a+b)^2 = a^2 + 2ab + b^2$
- Für $n=3$: $(a+b)^3 = a^3 + 3a^2b + 3ab^2 + b^3$
- Für $n=4$: $(a+b)^4 = a^4 + 4a^3b + 6a^2b^2 + 4ab^3 + b^4$
- Für $n=5$: $(a+b)^5 = a^5 + 5a^4b + 10a^3b^2 + 10a^2b^3 + 5ab^4 + b^5$


### 6.2.1 Beweis

__Hilfsbeziehung:__
$$\binom{n + 1}{k} = \binom{n}{k}+\binom{n}{k-1}$$

__Beweis der Hilfsbeziehung:__
$$\binom{n}{k} + \binom{n}{k-1} = \frac{n!}{k!(n-k)!} + \frac{n!}{(k-1)!(n-(k-1))!}$$

Linken Bruch mit $(n-k+1)$ erweitern:
$$= \frac{n!(n-k+1)}{k!(n-k)!(n-k+1)} + \frac{n!}{(k-1)!(n-(k-1))!}$$
Der Nenner des linken Bruchs wird vereinfacht, da $(n-k)!(n-k+1) = (n-k+1)!$ gilt:
$$= \frac{n!(n-k+1)}{k!(n-k+1)!} + \frac{n!}{(k-1)!(n-k+1)!}$$
Rechten Bruch mit $k$ erweitern:
$$= \frac{n!(n-k+1)}{k!(n-k+1)!} + \frac{n!k}{k(k-1)!(n-k+1)!}$$
Der Nenner des rechten Bruchs wird vereinfacht, da $k(k-1)! = k!$ gilt:
$$= \frac{n!(n-k+1)}{k!(n-k+1)!} + \frac{n!k}{k!(n-k+1)!}$$
Die beiden Brüche werden addiert:
$$= \frac{n!(n-k+1) + n!k}{k!(n-k+1)!}$$
$n!$ wird ausgeklammert:
$$= \frac{n!(n-k+1+k)}{k!(n-k+1)!}$$
Der Term in der Klammer im Zähler wird vereinfacht:
$$= \frac{n!(n+1)}{k!(n-k+1)!}$$
Dies kann als $(n+1)!$ im Zähler geschrieben werden:
$$= \frac{(n+1)!}{k!(n-k+1)!}$$
Dies entspricht der Definition des Binomialkoeffizienten $\binom{n+1}{k}$:
$$= \binom{n+1}{k}$$
$\Rightarrow$ Hilfsbeziehung bewiesen


__Weiter mit dem Beweis des binomischen Leersatzes:__

__1. Induktionsvoraussetzung:__
$$(a+b)^n = \sum_{k=0}^{n} \binom{n}{k} a^{n-k} b^k$$

__2. Induktionsanfang:__
bis zur 2. binomischen Formel bekannt

Für $n = 0$ gilt
$$(a+b)^0 = \sum_{k=0}^{0} \binom{0}{k} a^{0-k} b^k = \binom{0}{0} a^0 b^0 = \binom{0}{0} \cdot 1 \cdot 1 = \frac{0!}{0!(0-0)!} = 0! = 1$$

Für $n = 1$ gilt
$$(a+b)^1 = \sum_{k=0}^{1} \binom{1}{k} a^{1-k} b^k = \binom{1}{0} a^{1-0} b^0 + \binom{1}{1} a^{1-1} b^1 = (1)a^1 b^0 + (1)a^0 b^1 = a + b$$

Für $n = 2$ gilt
$$(a+b)^2 = \sum_{k=0}^{2} \binom{2}{k} a^{2-k} b^k = \binom{2}{0} a^{2-0} b^0 + \binom{2}{1} a^{2-1} b^1 + \binom{2}{2} a^{2-2} b^2 = (1)a^2 + (2)a^1 b^1 + (1)b^2 = a^2 + 2ab + b^2$$

__3. Induktionssschritt:__
$$n \rightarrow n + 1$$
Die zu zeigende Form ist:
$$(a+b)^{n+1} = \sum_{k=0}^{n+1} \binom{n+1}{k} a^{n+1-k} b^k$$
Der Startpunkt ist die Umformung von $(a+b)^{n+1}$:
$$(a+b)^{n+1} = (a+b)(a+b)^n$$
Das Produkt wird ausmultipliziert:
$$= a(a+b)^n + b(a+b)^n$$
Die Induktionsvoraussetzung $(a+b)^n = \sum_{k=0}^{n} \binom{n}{k} a^{n-k} b^k$ wird eingesetzt:
$$(a+b)^{n+1} = a \sum_{k=0}^{n} \binom{n}{k} a^{n-k} b^k + b \sum_{k=0}^{n} \binom{n}{k} a^{n-k} b^k$$
Die Terme $a$ und $b$ werden jeweils in die Summen gezogen, indem die Exponenten angepasst werden:
$$= \sum_{k=0}^{n} \binom{n}{k} a^{n-k+1} b^k + \sum_{k=0}^{n} \binom{n}{k} a^{n-k} b^{k+1}$$
Der erste Term der ersten Summe (für $k=0$) wird abgespalten:
$$= \binom{n}{0}a^{n-0+1}b^0 + \sum_{k=1}^n \binom{n}{k} a^{n-k+1} b^k + \sum_{k = 0}^n \binom{n}{k} a^{n-k} b^{k+1}$$
$\binom{n}{0} = 1$ und $b^0 = 1$ werden eingesetzt:
$$= a^{n+1} + \sum_{k = 1}^n \binom{n}{k}a^{n-k+1} b^k + \sum_{k = 0}^n \binom{n}{k} a^{n - k} b^{k + 1}$$
Der letzte Term der zweiten Summe (für $k=n$) wird abgespalten:
$$= a^{n+1} + \sum_{k=1}^{n} \binom{n}{k} a^{n-k+1} b^k + \sum_{k=0}^{n-1} \binom{n}{k} a^{n-k} b^{k+1} + \binom{n}{n} a^{n-n} b^{n+1}$$
$\binom{n}{n} = 1$ und $a^{n-n} = a^0 = 1$ werden eingesetzt:
$$= a^{n+1} + \sum_{k=1}^n \binom{n}{k} a^{n-k+1} b^k + \sum_{k=0}^{n-1} \binom{n}{k} a^{n-k} b^{k+1} + b^{n+1}$$
Bei der zweiten Summe wird die Indexverschiebung $j = k + 1$ angewendet. Dies bedeutet $k = j - 1$
Wenn $k=0$, dann $j=1$. Wenn $k=n-1$, dann $j=(n-1)+1=n$.
Der Index $j$ wird anschließend wieder in $k$ umbenannt:
$$= a^{n+1} + \sum_{k=1}^n \binom{n}{k} a^{n-k+1} b^k + \sum_{k=1}^n \binom{n}{k-1} a^{n-(k-1)} b^{(k-1)+1} + b^{n+1}$$
Die Exponenten in der zweiten Summe werden vereinfacht:
$$= a^{n+1} + \sum_{k=1}^n \binom{n}{k} a^{n-k+1} b^k + \sum_{k=1}^n \binom{n}{k-1} a^{n-k+1} b^k + b^{n+1}$$
Da beide Summen über den gleichen Bereich laufen und den gemeinsamen Faktor $a^{n-k+1}b^k$ haben, können sie zusammengefasst werden:
$$= a^{n+1} + \sum_{k=1}^n \left[\binom{n}{k} + \binom{n}{k-1}\right] a^{n-k+1} b^k + b^{n+1}$$
Die Hilfsbeziehung $\binom{n+1}{k} = \binom{n}{k}+\binom{n}{k-1}$ wird angewendet:
$$= a^{n+1} + \sum_{k=1}^n \binom{n+1}{k} a^{n-k+1} b^k + b^{n+1}$$
Der Term $a^{n+1}$ kann als der Summenterm für $k=0$ geschrieben werden:
$$\binom{n+1}{0} a^{n+1-0} b^0 = 1 \cdot a^{n+1} \cdot 1 = a^{n+1}$$
Der Term $b^{n+1}$ kann als der Summenterm für $k=n+1$ geschrieben werden
$$\binom{n+1}{n+1} a^{n+1-(n+1)} b^{n+1} = 1 \cdot a^0 \cdot b^{n+1} = b^{n+1}$$
Die einzelnen Terme werden in die Summe integriert:
$$= \sum_{k=0}^{n+1} \binom{n+1}{k} a^{(n+1)-k} b^k$$
Damit ist der Induktionsschritt erfolgreich gezeigt, da dies genau der Form des binomischen Lehrsatzes für $n+1$ entspricht.

$\Rightarrow$ binomischer Lehrsatz nachgewiesen

## 6.3 Das Pascalsche Dreieck

Statt der Formel $\binom{n}{k} = \frac{n!}{k!(n-k)!}$ kann man auch das Pascalsche Dreieck benutzen:

```
Zeile 0:            1
Zeile 1:          1   1
Zeile 2:        1   2   1
Zeile 3:      1   3   3   1
Zeile 4:    1   4   6   4   1  
Zeile 5:  1   5   10  10  5   1
```

Dabei diktiert $n$ die Zeile und $k$ die Zelle, jeweils beginnend beim Index $0$.

__Beispiel:__ $\binom{3}{2} = 3$

### 6.3.1 Beweis

Es soll nachgewiesen werden, dass ein Eintrag im Pascalschen Dreieck die Summe der beiden Einträge direkt darüber ist.

Es gilt:
$$\binom{n+1}{k+1} = \binom{n}{k} + \binom{n}{k+1}$$

__linke Seite:__
Der Binomialkoeffizient $\binom{n+1}{k+1}$ wird gemäß Definition erweitert:
$$=\frac{(n+1)!}{(k+1)!(n+1-(k+1))!}$$
Der Term im Nenner wird vereinfacht:
$$= \frac{(n+1)!}{(k+1)!(n-k)!}$$
$(n+1)!$ wird als $(n+1)n!$ geschrieben:
$$= \frac{(n+1)n!}{(k+1)!(n-k)!}$$
$(k+1)!$ wird als $(k+1)k!$ geschrieben:
$$= \frac{(n+1)n!}{(k+1)k!(n-k)!}$$
Die Terme werden so umgruppiert, dass $\binom{n}{k}$ isoliert wird:
$$= \frac{n+1}{k+1} \cdot \frac{n!}{k!(n-k)!}$$
Der Binomialkoeffizient $\binom{n}{k}$ wird eingesetzt:
$$= \frac{n+1}{k+1} \binom{n}{k}$$

__rechte Seite:__
Ausgangspunkt: $\binom{n}{k} + \binom{n}{k+1}$
Der zweite Term wird gemäß Definition erweitert:
$$= \binom{n}{k} + \frac{n!}{(k+1)!(n-(k+1))!}$$
Der Zähler und Nenner des zweiten Bruchs werden mit $(n-k)$ multipliziert:
$$= \binom{n}{k} + \frac{n!(n-k)}{(k+1)!(n-k)(n-k-1)!}$$
Der Nenner des zweiten Bruchs wird vereinfacht, da $(n-k)(n-k-1)! = (n-k)!$ gilt:
$$= \binom{n}{k} + \frac{n!(n-k)}{(k+1)!(n-k)!}$$
Der zweite Bruch wird umgeschrieben, indem $(k+1)! = (k+1)k!$ verwendet wird, um den Binomialkoeffizienten $\binom{n}{k}$ zu isolieren:
$$= \binom{n}{k} + \frac{n-k}{k+1} \cdot \frac{n!}{k!(n-k)!}$$
Der Binomialkoeffizient $\binom{n}{k}$ wird im zweiten Term eingesetzt:
$$= \binom{n}{k} + \frac{n-k}{k+1} \binom{n}{k}$$
$\binom{n}{k}$ wird ausgeklammert:
$$= \binom{n}{k} \left(1+ \frac{n-k}{k+1}\right)$$
Die Terme in der Klammer werden auf den gemeinsamen Nenner $k+1$ gebracht und addiert:
$$= \binom{n}{k} \cdot \frac{k+1+n-k}{k+1}$$
Der Term im Zähler wird vereinfacht:
$$= \binom{n}{k} \cdot \frac{n+1}{k+1}$$
$\Rightarrow$ Da die linke und rechte Seite übereinstimmen, ist die Beziehung bewiesen.

# 7. Die Dreiecksungleichung für reelle Zahlen

Es seien $a$ und $b$ zwei reelle Zahlen. Dann gilt:
$$|a+b| \le |a| + |b|$$

__Beweis:__
$$|a+b|^2 \le (|a| + |b|)^2$$
Binomische Formeln auflösen
$$a^2 + 2ab + b^2 \le a^2 + 2|a||b| + b^2$$
$-a^2, -b^2$
$$ab \le |a| \cdot |b|$$

## 7.1 Supremum, Infimum, Maximum, Minimum

__Definition: Beschränktheit einer Menge in $\mathbb{R}$__

Eine Menge $M \subseteq \mathbb{R}$ heißt beschränkt, wenn es eine positive Zahl $K$ gibt, wo kein Element einen größeren Abstand zu einem bestimmten Fixpunkt als diese hat.

Dies lässt sich im Reellen für einen $K > 0, K \in \mathbb{R}$ wie folgt formulieren:
$$x_m \in M$$
$$|x| \le K$$
Bsp.: $M = \{ -3, -1, 2, 4 \} \Rightarrow K = 4$

äquivalente Formulierung für $a$ und $b$, $a, b \in \mathbb{R}$
$$a \le |x| \le b$$

__Definition: Supremum__

$M \subseteq \mathbb{R}$ heißt nach oben beschränkt, wenn gilt:
$$\exists b \in \mathbb{R} : x \le b \forall x \in M$$
$b$ ist obere Schranke von $M$.
Die kleinste obere Schranke ist das Supremum.

Bemerkung: Ist das Supremum Element der Menge selbst,  ist es das Maximum der Menge.

Bsp.: $M = \lceil -\infty, 2 \rceil$
M ist nach unten unbeschränkt.
M ist durch 2 nach oben beschränkt, aber auch durch 100, 1000, ...
2 ist die kleinste Zahl, die nicht überschritten wird $\Rightarrow$ 2 ist die kleinste obere Schranke $\Rightarrow \sup(M) = 2$


__Definition: Infinum__

Eine Menge $M \subseteq \mathbb{R}$ heißt nach unten beschränkt, wenn gilt:
$$\exists a \in \mathbb{R}: x \ge a \forall x \in M$$
$a$ heißt untere Schranke von $M$.
Die größte untere Schranke von $M$ ist das Infimum.

Bemerkung: Ist das Infimum Element der Menge selbst, ist es auch ihr Minimum.

# 8. Zahlenfolgen und Grenzwerte

__Definition: Minimum__

Unter einer Folge versteht man eine geordnete Auflistung von endlich oder unendlich vielen aufeinanderfolgenden Elementen (z.B. Zahlen). Eine Folge $a(n)$ ist somit eine Abbildung von den natürlichen Zahlen ($\mathbb{N}, \mathbb{N}_0$) auf eine beliebige Menge (z.B. $\mathbb{R}$).

$a: \mathbb{N} \rightarrow \mathbb{R}$

Bsp.: Endliche Folge $(5, 2, 8)$
Bsp.: Unendliche Folge $(2, 3, 5, 7, 11, 13, \dots)$


__Definition: Reelle Zahlenfolge__

Eine reelle Zahlenfolge ist eine eindeutige Funktion, die der Menge der natürlichen Zahlen eine reelle Zahl zugeordnet.

## 8.1 Schreibweise von Folgen

$(a_n)_{n \in \mathbb{N}}$
$(a_n)_{n \in \{ 1, \dots, N \} }$
$(a_n)_{n \in 1, \dots, N}$

## 8.2 Folgen als Abbildungen

$a: \mathbb{N} \rightarrow \mathbb{X}, n \mapsto a_n$
als Funktion: $a_n = f(n)$

Bsp.: $a_n = \frac{1}{n}$

## 8.3 Beschränktheit von Zahlenfolgen

__Definition: Beschränkte Zahlenfolge__

Eine Folge $(a_n)$ heißt
nach oben beschränkt, wenn gilt:
$$\exists k: a_n \le k \forall n \in \mathbb{N}$$
nach unten beschränkt, wenn gilt:
$$\exists k: a_n \ge k \forall n \in \mathbb{N}$$


## 8.4 Monotonie von Zahlenfolgen

__Definition: Monotonie__

Eine Folge $(a_n)$ heißt
monoton wachsend $\quad a_n \le a_{n+1}$
streng monoton wachsend $\quad a_n < a_{n+1}$
monoton fallend $\quad a_n \ge a_{n+1}$
streng monoton fallend $\quad a_n > a_{n+1}$


__Definition: Grenzwert und konvergente Folgen__

Eine Folge $(a_n)$ konvergiert, wenn es eine Zahl $a$ gibt, so dass Folgendes gilt:
$$\forall \epsilon > 0  \exists n_0 : |a_n - a| < \epsilon \forall n \in \mathbb{N}$$
- **$\epsilon$ (Epsilon)**: Eine beliebig kleine, positive Zahl, die den gewünschten maximalen Abstand der Folgenglieder zum Grenzwert $a$ angibt
- $|a_n -a| < \epsilon$ - Abstand zwischen einem Folgeglied $a_n$ und dem Grenzwert $a$. Wenn dieser kleiner als $\epsilon$ ist, befindet sich $a_n$ in der $\epsilon$-Umgebung

>Ab einem bestimmten $n_0$ liegen alle folgenden Glieder $a_{n, \ n > n_0}$ in der $\epsilon$-Umgebung
>(näher am Grenzwert $a$ als der durch $\epsilon$ vorgegebene Abstand)
>
>**Konvergenz bedeutet**: Egal wie klein man $\epsilon$ wählt, man findet immer einen Index $n_0$ (eine "Stelle" in der Folge)

<iframe title="Grenzwert einer Folge, Limes (Epsilon-Definition)" src="https://www.youtube.com/embed/Z1fJrLwmybo?feature=oembed" height="113" width="200" allowfullscreen="" allow="fullscreen" style="aspect-ratio: 1.76991 / 1; width: 100%; height: 100%;"></iframe>


**Beweis mittels $\epsilon$-Definition**

Um zu beweisen, dass $a$ der Grenzwert von $a_n$ ist, geht man wie folgt vor:
1. Man nimmt die Ungleichung $|a_n - a| < \epsilon$
2. Man formt diese Ungleichung nach $n$ um
3. Man zeigt, dass man für jedes gegebene $\epsilon$ einen Index $n_0$ finden kann, sodass die Ungleichung für alle $n > n_0$ erfüllt ist


__Beispiel:__

Es soll gezeigt werden dass für $a_n = \frac{1}{n^2}$ der Grenzwert $a = 0$ ist.

Ungleichung aufstellen
$$|a_n - 0| < \epsilon$$
$$|\frac{1}{n^2}| < \epsilon$$
Da $n^2$ immer positiv ist, kann der Betrag weggelassen werden
$$= \frac{1}{n^2} < \epsilon$$
$$=1 < n^2 \epsilon$$
$$= \frac{1}{\epsilon} < n^2$$
$$= \sqrt{\frac{1}{\epsilon}} < n$$
$\Rightarrow$ die Bedingung $|a_n - 0| < \epsilon$ ist erfüllt, wenn $= n > \sqrt{\frac{1}{\epsilon}}$ gilt
Problem: $\sqrt{\frac{1}{\epsilon}}$ ist oft keine ganze Zahl, aber $n$ muss eine natürliche Zahl sein

Daher muss auf die nächste ganze Zahl aufgerundet werden:
$$n_0 = \lceil \sqrt{\frac{1}{\epsilon}} \rceil$$
Angenommen:
- $\epsilon = 0.01$
- dann ist $\sqrt{\frac{1}{\epsilon}} = \sqrt{100} = 10$
- also $n_0 =\lceil 10 \rceil = 10$
- also liegen für alle $n \ge 11$ alle Folgeglieder im $\epsilon$-Schlauch der Genauigkeit $0.01$

#### 8.4.0.1 Eindeutigkeit des Grenzwerts

>Zahlenfolgen die in $\mathbb{N}$ definiert sind haben im klassischen Fall $n \to \infty$ __einen__ Grenzwert
>Im Fall von $n \in \mathbb{Z}$ gilt $n \rightarrow \infty$ und $n \rightarrow - \infty$, somit können diese __zwei__ Grenzwerte haben

##### 8.4.0.1.1 Beweis

__Beweis mit Widerspruch:__

Wir nehmen an, es existieren zwei verschiedene Grenzwerte $a$ und $b$ aus den reellen Zahlen mit $a \neq$ b.
$$\Rightarrow \forall \epsilon > 0 \exists n_1: \forall n \ge n_1: |a_n - a| < \epsilon$$
$$\Rightarrow \forall \delta > 0 \exists n_2: \forall n \ge n_2: |a_n - b| < \delta$$
Weil $\epsilon$ beliebig gewählt werden kann, kann statt $\delta$ auch $\epsilon$ verwendet werden.
$$ \forall \epsilon > 0 \exists n_1: \forall n \ge n_1: |a_n - a| < \epsilon$$
$$ \forall \epsilon > 0 \exists n_2: \forall n \ge n_2: |a_n - b| < \epsilon$$
Wähle ein $n_0$ so, dass die Folge gleichzeitig in den $\epsilon$-Umgebungen der jeweiligen Grenzwerte liegt.
$$n_0 = max(n_1, n_2)$$
Das Maximum zu wählen stellt sicher, dass so lange "gewartet wird", bis beide $\epsilon$-Umgebungen betreten wurden.

Jetzt soll der Abstand zwischen den beiden Grenzwerten $a$ und $b$ ermittelt werden

Es wird clever in einer andere Form gebracht
$$|a-b| = |a-b +a_n - a_n| = |(a_n - a) + (b - a_n)|$$
nach Dreiecksungleichung
$$|(a_n - a) + (b - a_n)| \le |a_n - a| + |a_n - b|$$
Umgeformt ergibt das
$$\Rightarrow |a-b| \le |a_n - a| + |a_n - b|$$
Dadurch, dass $\epsilon$ beliebig gewählt werden kann, wird speziell angenommen:
$$\epsilon = \frac{|a-b|}{2}$$
Da $|a_n - a| < \epsilon$ und $|a_n - b| < \epsilon$ gilt
$$\Rightarrow |a-b| < \epsilon + \epsilon$$
$$\Rightarrow |a-b| < 2\epsilon$$
Setzen wir nun die spezielle Wahl von $\epsilon$ ein:
$$\Rightarrow |a-b| < 2 \left(\frac{|a-b|}{2}\right)$$
$$|a-b| < |a-b|$$
Widerspruch!
Also: Der Grenzwert einer Folge für $n \rightarrow \infty$ ist eindeutig bestimmt.

#### 8.4.0.2 Beschränkung konvergenter Folgen

>Jede konvergente Folge ist beschränkt

##### 8.4.0.2.1 Beweis

Eine Folge $(a_n)$ konvergiere für $n \rightarrow \infty$ gegen $a$.
$$\Rightarrow \forall \epsilon > 0 \exists n_0: |a_n -a| < \epsilon$$
Betrachten $|a_n|$ und addiere eine Null.
$$|a_n| = |a_n - a + a|$$
Dreiecksungleichung
$$|(a_n - a) + a| \le |a_n - a| + |a|$$
$$\Rightarrow |a_n| < \epsilon + |a|$$
$|a_{n_0 -1}|$ ist das letze $a_n$, das außerhalb der $\epsilon$-Umgebung liegt.

Somit ist $M_1$ eine Schranke für die ersten Glieder:
$$M_1: = \text{max} \{ |a_1|, |a_2|, |a_3|, \dots, |a_{n_0 -1}| \}$$
$\epsilon + a$ ist eine Schranke für die späteren Glieder weil $\epsilon$ beliebig is, also z.B. 1000000.

Also ist $(a_n)$ durch $N$ beschränkt:
$$M := \{ M_1, \epsilon + a \}$$
$$\Rightarrow |a_n| < \epsilon + |a|$$
$\Rightarrow$ jede konvergente Folge ist beschränkt

> [!info]- Zusammenfassung
> Somit wurde gezeigt, dass jede konvergente Folge beschränkt ist. Dies wurde durch die Epsilon-Definition der Konvergenz belegt, indem gezeigt werden konnte, dass ab einem bestimmten Index $n_0$ alle Folgenglieder innerhalb einer $\epsilon$-Umgebung des Grenzwertes $a$ liegen und somit durch $|a|+\epsilon$ nach oben beschränkt sind. Die endlich vielen Glieder vor $n_0$ können durch ein Maximum separat beschränkt werden, wodurch eine globale Schranke für die gesamte Folge existiert.

#### 8.4.0.3 Rechenregeln für Grenzwerte

Es seien $(a_n)$ und $(b_n)$ zwei jeweils konvergente Folgen, die gegen $a$ bzw. $b$ konvergieren.
$$\lim_{n \to \infty} a_n= a, \lim_{n \to \infty} b_n= b$$
$$1. \lim_{n \to \infty} (a_n + b_n) = \lim_{n \to \infty} (a_n) + \lim_{n \to \infty} (b_n)$$
$$2. \lim_{n \to \infty} (a_n \cdot b_n) = (\lim_{n \to \infty} (a_n)) \cdot (\lim_{n \to \infty} (b_n))$$
$$3. \lim_{n \to \infty} (\frac{a_n}{b_n}) = \frac{\lim_{n \to \infty} (a_n)}{\lim_{n \to \infty} (b_n)} \quad \text{ für } b_n \neq 0 \forall n \in \mathbb{N}, b \neq 0$$
##### 8.4.0.3 Beweise

__Beweis zu 1.__
$$1. \lim_{n \to \infty} (a_n + b_n) = \lim_{n \to \infty} (a_n) + \lim_{n \to \infty} (b_n) = a + b$$
$$\forall epsilon > 0 \exists n_1: \forall n \ge n_1: |a_n -a| < \epsilon$$
$$\forall \epsilon > 0 \exists n_2: \forall n \ge n_2: |b_n - b| < \epsilon$$
Betrachten $(a_n + b_n)$ als Gesamtfolge, die gegen $a+b$ für $n \rightarrow \infty$ konvergiert.
$$\Rightarrow |(a_n + b+n) - (a+b)|$$
$$= |a_n + b_n - a - b|$$
$$= |a_n - a| + |b_n -b| \le |a_n - a| + |b_n - b|$$
$$\Rightarrow |(a_n - a) + (b_n - b)| < 2 \epsilon$$
$$n_0 = \text{max} \{ n_1, n_2 \}$$
$$\Rightarrow \forall \epsilon > 0 \exists n_0: \forall n \ge n_0: |(a_n + b_n) - (a-b) < 2 \epsilon$$

> [!info]- Zusammenfassung
>Somit wurde gezeigt, dass die Summenregel für Grenzwerte von Folgen gilt. Durch Anwendung der Epsilon-Definition der Konvergenz für die einzelnen Folgen $(a_n)$ und $(b_n)$ konnte mit Hilfe der Dreiecksungleichung und einer geeigneten Wahl von $\epsilon$ (nämlich $\frac{\epsilon}{2}$ für jeden Term) bewiesen werden, dass die Summenfolge $(a_n + b_n)$ ebenfalls gegen die Summe der einzelnen Grenzwerte $(a+b)$ konvergiert. Es existiert ein Index $n_0$, ab dem alle Glieder der Summenfolge innerhalb einer beliebig kleinen $\epsilon$-Umgebung des Grenzwerts $a+b$ liegen.

__Beweis zu 2.__
$$2. \lim_{n \to \infty} (a_n \cdot b_n) = (\lim_{n \to \infty} (a_n)) \cdot (\lim_{n \to \infty} (b_n))$$
$$\forall \epsilon > 0 \exists n_1: \forall n \ge n_1: |a_n -a| < \epsilon$$
$$\forall \epsilon > 0 \exists n_2: \forall n \ge n_2: |b_n - b| < \epsilon$$
$$|a_n \cdot b_n - ab| = |a_nb_n -ab + a_nb -a_nb|$$
$$= |(a_nb_n - a_nb) + (ba_n - ab)|$$
$a_n$ und $b$ ausklammern
$$= |a_n(b_n -b) + b(a_n-a)|$$
Dreiecksungleichung
$$\Rightarrow |a_n(b_n-b) + b(a_n-a)| \le |a_n(b_n-b)+b(a_n-a)|$$
Faktoren aus den Beträgen rausziehen
$$\Rightarrow |a_n(b_n-b) + b(a_n-a)| \le |a_n| \cdot |b_n-b| + |b| \cdot |a_n -a|$$
aus dem $\le$ wird ein <
$$\Rightarrow |a_n(b_n-b) + b(a_n-a)| < |a_n|\epsilon + |b| \epsilon$$
Wir wissen, dass $(a_n)$ konvergent ist.
$\Rightarrow (a_n)$ ist auch beschränkt $\Rightarrow |a_n| < K$
$\Rightarrow$ Schranke = $K > 0$
$$\Rightarrow |a_n(b_n-b) + b(a_n-a)| < K\epsilon + |b|\epsilon$$
$$\Rightarrow |a_n(b_n-b) + b(a_n-a)| < (K + |b|)\cdot \epsilon$$
$$\Rightarrow |a_nb_n - ab| < (K + |b|)\cdot \epsilon \forall n \ge n_0 \text{ wobei } n_0 = max \{ n_1, n_2 \}$$

> [!info]- Zusammenfassung
>Somit wurde bewiesen, dass die Produktregel für Grenzwerte von Folgen gilt. Durch eine geschickte algebraische Umformung des Ausdrucks $|a_n b_n - ab|$ und der Anwendung der Dreiecksungleichung konnte die Konvergenz der Produktfolge $(a_n b_n)$ gegen das Produkt der Grenzwerte $(ab)$ nachgewiesen werden.
>
>Dabei war die Beschränktheit der konvergenten Folge $(a_n)$ – die $|a_n|$ durch eine Konstante $K$ nach oben abschätzte – sowie die Epsilon-Definition der Konvergenz für $(a_n)$ und $(b_n)$ entscheidend, um die Terme $|a_n| \cdot |b_n-b|$ und $|b| \cdot |a_n-a|$ durch eine geeignete Wahl von $\epsilon'$ und $K$ so zu kontrollieren, dass ihre Summe unterhalb eines beliebig kleinen $\epsilon$ lag.

__Beweis zu 3.__

$$3. \lim_{n \to \infty} (\frac{a_n}{b_n}) = \frac{\lim_{n \to \infty} (a_n)}{\lim_{n \to \infty} (b_n)} = \frac{a}{b} \text{ für } b_n \neq 0 \forall n \in \mathbb{N}, b \neq 0$$

Wir beweisen zunächst folgenden Zusammenhang:
$$\lim_{n \to \infty} (\frac{1}{b_n}) = \frac{1}{b} \text{ für } b_n \neq 0 \forall n \in \mathbb{N}, b \neq 0$$
Wir wissen, dass $b_n$ konvergent ist.
$$|b_n -b| < \epsilon \forall n \ge n_1$$
Definieren für $b_n$ eine untere Schranke, damit $b_n$ nicht zu dicht an die Null rutscht und Singularitäten entstehen.

Da eine untere Schranke beliebig gewählt werden kann:
$$|b_n| > \frac{|b|}{2}$$
Da $\epsilon$ auch beliebig gewählt werden kann:
$$\Rightarrow \epsilon = \frac{|b|}{2}$$
Wir betrachten die Konvergenz von $\frac{1}{b_n}$:
$$\Rightarrow |\frac{1}{b_n} - \frac{1}{b}| = |\frac{b-b_n}{b \cdot b_n}| = \frac{|b - b_n|}{|b| \cdot |b_n|}$$
$$\Rightarrow |\frac{1}{b_n} - \frac{1}{b}|< \frac{|b - b_n|}{|b| \cdot \frac{|b|}{2}}$$
$$\Rightarrow | \frac{1}{b_n} - \frac{1}{b}| < \frac{2|b-b_n|}{|b|^2}$$
$$\Rightarrow | \frac{1}{b_n} - \frac{1}{b}| < \frac{1}{|b|}$$
$$\Rightarrow | \frac{1}{b_n} - \frac{1}{b}| < \epsilon$$
$\Rightarrow$ Wir haben gezeigt, dass $\frac{1}{b}$ für $n \rightarrow \infty$ der Grenzwert zu $(\frac{1}{b_n})$ ist.
Grenzwert für ein Produkt wurde unter 2. schon bewiesen
$$\Rightarrow |a_n \cdot \frac{1}{b_n} - a \cdot \frac{1}{b}| = |\frac{a_n}{b_n} - \frac{a}{b}| < \epsilon$$

> [!info]- Zusammenfassung
>Somit wurde die Quotientenregel für Grenzwerte von Folgen bewiesen. Der Beweis erfolgte in zwei Hauptschritten. Zuerst wurde gezeigt, dass der Grenzwert des Kehrwertes einer Folge dem Kehrwert des Grenzwertes entspricht, unter der Bedingung, dass der Grenzwert und die Folgenglieder selbst ungleich Null sind. Dies erforderte eine sorgfältige Abschätzung, um zu gewährleisten, dass die Folgenglieder $|b_n|$ eine untere Schranke (nämlich $|b|/2$) besitzen, was die Division durch Null vermeidet. Im zweiten Schritt wurde die bereits bewiesene Produktregel angewendet, um die Konvergenz der Quotientenfolge $(a_n/b_n)$ gegen den Quotienten der Grenzwerte $(a/b)$ zu demonstrieren.

### 8.4.1 Satz der Intervallschachtelung

In einigen mathematischen Anwendungen und Beweisen findet sich das Konzept der Intervallschachtelung.

>Es sei $[a_n, b_n] n \in \mathbb{N}$ eine Folge mit ineinander geschachtelten, abgeschlossenen Intervallen.

Das bedeutet, dass die Intervalle mit wachsendem Index nicht größer werden, sondern im vorherigen enthalten sind:
$$[a_{n+1}, b_{n+1}] \subseteq [a_n, b_n]$$
Daraus folgt auch, dass:
$$[a_{n+2}, b_{n+2}] \subseteq [a_{n+1}, b_{n+1}]$$
Und auch:
$$[a_{n+2}, b_{n+2}] \subseteq [a_n, b_n]$$

__Schwache Version des Satzes__

Die Schnittmenge aller Intervalle ist nicht leer:
$$\bigcap_{n=1}^\infty [a_n, b_n] \neq \emptyset \quad \Rightarrow \{ x \in \mathbb{R} \mid \forall n \in \mathbb{N}: a_n \le x \le b_n \}$$
dabei gilt: $a_n \le b_n \forall n \in \mathbb{N}$

__Starke Version des Satzes__

Die Breite der Intervalle konvergiert gegen 0:
$$\lim_{n \to \infty} (b_n - a_n) = 0$$

Dann existiert genau ein Punkt $x \in \mathbb{R}$, sodass Folgendes gilt:
$$x \in [a_n, b_n] \forall n \in \mathbb{N}$$
$$\bigcap_{n=1}^\infty [a_n, b_n] = \{x\}$$
#### 8.4.1.1 Beweis des schwachen Teils

Für den Beweis wird die Vollständigkeit der reellen Zahlen verwendet. Damit ist gemeint, dass für jede, nicht leere, nach oben beschränkte Teilmenge der reellen Zahlen ein Supremum besitzt.
Daraus folgt, dass jede, nach unten Beschränkte, nicht leere Teilmenge auch ein Infimum besitzt.
$$[a_{n+1}, b_{n+1}] \subseteq [a_n, b_n]$$
weiterhin gilt: $a_n \le b_n \forall n \in \mathbb{N}$
$$\Rightarrow a_1 \le a_2 \le a_3 \dots \Rightarrow a_n \text{ monoton steigend }$$
$$\Rightarrow b_1 \ge b_2 \ge b_3 \dots \Rightarrow b_n \text{ monoton fallend }$$
$\Rightarrow a_n$ sind nach oben durch $b_1$ beschränkt
$\Rightarrow b_n$ sind nach unten durch $a_1$ beschränkt

>Jede monoton steigende, nach oben beschränkte Folge ist konvergent.
>Jede monoton fallende, nach unten beschränkte Folge ist konvergent.

Jetzt wissen wir, dass $a_n$ und $b_n$ konvergieren, allerdings noch nicht wogegen.

Möglicher Kandidat für $a_n$:
$$a:= \sup(\{ a_n \mid n \in \mathbb{N} \} )$$
$$\Rightarrow a \ge a_n \forall n \in \mathbb{N}$$
$$\Rightarrow a \le b_n \forall n \in \mathbb{N}$$

$$a_m \le b_n \forall m \ge n$$
Somit ist $b_n$ eine obere Schranke der Menge $\{ a_m \mid m \in \mathbb{N} \}$

__Zwischenbeweis durch Widerspruch:__

Annahme: $a > b_n$

Nach der Definition des Supremums ist $a$ die kleinste obere Schranke. Nach der Annahme wäre $b_n$ eine noch kleinere Schranke
$\rightarrow$ Widerspruch!
$$\Rightarrow a \le b_n \forall n \in \mathbb{N}$$
$$\Rightarrow a \in [a_n, b_n] \forall n \in \mathbb{N}$$
$$\Rightarrow \bigcap_{n=1}^\infty [a_n, b_n] \neq \emptyset$$

> [!info]- Zusammenfassung
>Somit wurde der schwache Teil des Satzes der Intervallschachtelung bewiesen. Es wurde gezeigt, dass eine Folge von ineinander geschachtelten, abgeschlossenen Intervallen, unter Nutzung der Vollständigkeit der reellen Zahlen, stets einen nicht leeren Schnitt besitzt. Dies geschieht, indem die Folge der unteren Intervallgrenzen $(a_n)$ als monoton steigend und nach oben beschränkt und die Folge der oberen Intervallgrenzen $(b_n)$ als monoton fallend und nach unten beschränkt identifiziert wird. Durch die Existenz des Supremums der $a_n$ konnte gezeigt werden, dass dieses Supremum $a$ in allen Intervallen $[a_n, b_n]$ liegt, was die Nichtleere des Schnitts beweist.

#### 8.4.1.2 Beweis des starken Teils

Es gibt genau einen Punkt $x \in [a_n, b_n], \ n \in \mathbb{N}$
$$\lim_{n \to \infty} (b_n - a_n) = 0$$
Nach dem Beweis des schwachen Teils wissen wir, dass es wenigstens ein $x$ gibt, das in allen Intervallen gleichzeitig liegt. Nun wollen wir zeigen, dass es auch höchstens ein Element gibt, dass in allen Intervallen gleichzeitig liegt.

__Beweis durch Widerspruch:__

Annahme: Es gibt zwei Punkte $x, y$, die in allen Intervallen gleichzeitig liegen.
$$\lim_{n \to \infty} (b_n - a_n) = 0$$
$$\Rightarrow \forall \epsilon > 0 \exists N: |b_n - a_n| < \epsilon$$
Da wir angenommen haben, dass $x$ und $y$ gleichzeitig in $[a_n, b_n]$ liegen, gilt:
$$\Rightarrow a_N \le x \le b_N$$
$$\Rightarrow a_N \le y \le b_N$$
Der Abstand zwischen $x$ und $y$ kann maximal der Intervallbreite entsprechen.
$$\Rightarrow |x-y| \le b_N - a_N$$
Aus der Grenzwertbetrachtung hatten wir noch herausgefunden, dass $b_n - a_n < |x-y|$
$$\Rightarrow |x-y| < |x-y|$$
$\Rightarrow$ Widerspruch
$\Rightarrow$ Es gibt ausschließlich einen Punkt $x$, der in allen Intervallen gleichzeitig liegt.

> [!info]- Zusammenfassung
>Somit wurde der starke Teil des Satzes der Intervallschachtelung bewiesen. Es wurde gezeigt, dass unter der zusätzlichen Bedingung, dass die Längen der geschachtelten Intervalle gegen Null konvergieren ($\lim_{n \to \infty} (b_n - a_n) = 0$), der Schnitt aller Intervalle nicht nur nicht leer ist, sondern genau einen einzigen Punkt $x \in \mathbb{R}$ enthält. 
>Der Beweis erfolgte durch einen Widerspruch, indem die Annahme zweier verschiedener Punkte $x$ und $y$ im Schnitt dazu führt, dass ihr Abstand $|x-y|$ kleiner oder gleich der Intervalllänge $|b_n - a_n|$ sein müsste. Da die Intervalllänge gegen Null konvergiert, würde dies implizieren, dass $|x-y| = 0$, was $x=y$ bedeutet und der Annahme zweier *verschiedener* Punkte widerspricht.

### 8.4.2 Satz von Bolzano-Weierstraß

#### 8.4.2.0 Teilfolgen


>Eine Teilfolge $(a_{n_k})$ einer Ursprungsfolge $(a_n)$ ist eine neue Folge, die durch das Weglassen einiger Glieder von $(a_n)$ gebildet wird.
>
>Die Indizes $n_k$ bilden dabei eine streng monoton wachsende Indexfolge, die angibt, welche Elemente der ursprünglichen Folge in der Teilfolge enthalten sind.

Eine Teilfolge wird häufig so dargestellt:
$$(a_{n_k})$$
$(n_k)$ ist die Bildungsvorschrift für die Indizes, deren Beiträge aus der Ursprungsfolge erhalten bleiben sollen.

$(n_k) \ k \in \mathbb{N}$ ist eine Indexfolge für $a_n = (a_1, a_2, a_3, \dots)$

__Beispiel 1:__
$a_n = (a_1, a_2, a_3, \dots)$
Die Teilfolge $(a_{n_k})$ soll nur jedes zweite Element der Ursprungsfolge enthalten.
$(a_{n_k}) = (a_2, a_4, a_6, \dots)$
$(n_k) = (2, 4, 6, 8, \dots)$
$n_k = 2k$

__Beispiel 2:__
$a_n = \sin{(n \frac{\pi}{2})} = (0, 1, 0, -1, 0, 1, 0, -1, \dots)$
$a_{2k} = (0, 0, 0, \dots)$
$a_{2k+1} = (1, -1, 1, \dots)$
#### 8.4.2.1 Aussage

>Jede beschränkte Folge reeller Zahlen besitzt wenigstens eine konvergente Teilfolge.
>(Eine Teilfolge entsteht, wenn einige Glieder einer Ursprungsfolge weggelassen werden.)

<iframe title="Satz von Bolzano-Weierstrass (EINFACH erklärt!)" src="https://www.youtube.com/embed/Y1ewawP-v-w?feature=oembed" height="113" width="200" allowfullscreen="" allow="fullscreen" style="aspect-ratio: 1.76991 / 1; width: 100%; height: 100%;"></iframe>

__Beispiel:__
$a_n = \sin{(n \frac{\pi}{2})} = (0, 1, 0, -1, 0, 1, 0, -1, \dots)$
$\lim_{k \to \infty} (a_{4k+1}) = 1$
$\lim_{k \to \infty} (a_{4k+3}) = -1$

#### 8.4.2.2 Beweis

Es sei $(a_n)$ eine in den reellen Zahlen beschränkte Folge. Unter "beschränkt" verstehen wir, dass die Folge nach oben als auch nach unten beschränkt ist (hat eine untere Schranke $m$ und eine obere Schranke $M$).
$$\Rightarrow m \le a_n \le M \forall n \in \mathbb{N}$$
D.h. alle Folgeglieder von $(a_n)$ liegen im Intervall $[m, M]$.

Intervallschachtelung: Halbierungsverfahren
$$[m, M] \rightarrow [m, \frac{M-m}{2}], [\frac{M-m}{2}, M]$$
Da $(a_n)$ nach Voraussetzung eine unendliche Folge ist, also unendlich viele Folgeglieder hat, enthält wenigstens eines der beiden Intervalle unendlich viele Folgeglieder.
$$I_1=[m_1, M_1]$$
Die Länge von $I_1$ entspricht der halben Länge des ursprünglichen Intervalls
$$M_1 - m_1 = \frac{M-m}{2}$$
$I_1$ kann wiederum auch halbiert werden
$$I_1 \rightarrow [m_1, \frac{M_1 - m_1}{2}], [\frac{M_1 - m_1}{2}, M_1]$$
$$I_2=[m_2, M_2]$$
Daraus ergibt sich allgemein
$$\Rightarrow I_k = [m_k, M_k]$$
$$I_1 \supset I_2 \subset I_3 \subset I_4 \subset \dots$$
Da sich die Intervalllänge bei jedem Schritt halbiert, gilt
(Da die Länge bei jedem Schritt halbiert wird, teilt man durch $2^k$ (für den $k$-ten Schritt)
$$M_k - m_k=\frac{M-m}{2^k}$$
Da $M-m$ eine konstante Zahl ist, aber der Nenner unendlich groß wird, wird der gesamte Bruch extrem klein und nähert sich $0$ an.
$$\lim_{k \to \infty} (M_k - m_k) = 0$$

__Konstruktion einer konvergenten Teilfolge:__

Es stellt sich die Frage, wie die konvergente Teilfolge konstruiert wird, die gegen das eine $x$, das in allen Intervallen gleichzeitig liegt (Satz der Intervallschachteltung), gegen eben dieses $x$ konvergiert.

Wissen: In jedem Intervall liegen unendlich viele Folgeglieder.
Wir konstruieren zunächst eine streng monoton wachsende Indexfolge $(n_k)$.

In $I_1$ liegen unendlich viele Folgeglieder.
Von denen Elementen wählen wir eins aus.
$$a_{n_1} \in I_1$$
auch in $I_2$ liegen unendlich viele Folgeglieder, von denen wir eins auswählen
$$a_{n_2} \in I_2$$

Dieser Prozess wird fortgesetzt: Für jedes Intervall $I_k$ wählen wir ein Glied $a_{n_k}$ aus, wobei der Index $n_k$ immer größer ist als der vorherige Index $n_{k-1}$. Dadurch entsteht eine streng monoton wachsende Indexfolge $(n_k)$.

Damit haben wir eine Teilfolge erzeugt, die aus dem jedem neuen Intervall nur ein einzelnes Element auswählt. Durch diese Auswahlmethode haben wir die Teilfolge $(a_{n_k})$ konstruiert, bei der jedes Glied $a_{n_k}$ aus dem entsprechenden Intervall $I_k$ stammt.


__Konvergenz gegen x:__
In jedem Intervall $I_k$ liegt gleichzeitig das eine $x$, dass von der Intervallschachtelung bekannt ist.

Da sowohl das ausgewählte Teilfolgenglied $a_{n_k}$ als auch der Punkt $x$ im Intervall $I_k = [m_k, M_k]$ liegen, ist der Abstand zwischen $a_{n_k}$ und $x$ höchstens so groß wie die Länge des Intervalls $I_k$.
$$|a_{n_k} - x| \le |M_k - m_k|$$
Vorher wurde gezeigt
$$\lim_{k \to \infty} (M_k - m_k) = 0$$

Da der Abstand $|a_{n_k} - x|$ kleiner oder gleich der Intervalllänge $M_k - m_k$ ist, und die Intervalllänge gegen Null konvergiert, muss auch der Abstand zwischen $a_{n_k}$ und $x$ gegen Null konvergieren.

$$\lim_{k \to \infty} |a_{n_k} -x| = 0$$
$$= \lim_{k \to \infty} (a_{n_k}) - \lim_{k \to \infty} |x|= 0$$
Der Grenzwert einer Konstanten ist die Konstante selbst
$$= \lim_{k \to \infty} (a_{n_k}) - x = 0$$
$$\Rightarrow \lim_{k \to \infty} (a_{n_k}) = x$$

> [!info]- Zusammenfassung
> Somit wurde gezeigt, dass jede beschränkte Folge reeller Zahlen eine konvergente Teilfolge besitzt. Durch das Halbierungsverfahren der Intervallschachtelung konnten wir eine Folge von geschachtelten Intervallen $I_k = [m_k, M_k]$ konstruieren, deren Längen gegen Null konvergieren und die einen eindeutigen Punkt $x \in \mathbb{R}$ gemeinsam haben. Anschließend wurde eine Teilfolge $(a_{n_k})$ so gebildet, dass jedes Glied $a_{n_k}$ in dem entsprechenden Intervall $I_k$ liegt. Da der Abstand zwischen $a_{n_k}$ und $x$ durch die Intervalllänge $|M_k - m_k|$ begrenzt ist und diese gegen Null geht, konvergiert die konstruierte Teilfolge $(a_{n_k})$ gegen eben diesen eindeutigen Punkt $x$. Damit ist der Satz von Bolzano-Weierstraß bewiesen.
## 8.5 Die Cauchy-Folge

>Bei einer Cauchy-Folge liegen bei einer beliebigen Toleranz von $\epsilon > 0$ ab einem bestimmten Index $n_0$ alle Folgegliede beieinander,  dass ihre paarweisen Abstände kleiner als $\epsilon$ sind.

$$\forall \epsilon > 0 \exists n_0, \forall m, n \ge n_0: |a_m - a_n| < \epsilon$$

- $\epsilon$ (Epsilon): Eine beliebig kleine, positive Zahl, die den gewünschten maximalen Abstand der Folgenglieder zueinander angibt
- $|a_m - a_n| < \epsilon$: Abstand zwischen zwei beliebigen Folgengliedern $a_m$ und $a_n$, wobei beide Indizes $m$ und $n$ größer oder gleich $n_0$ sind. Wenn dieser kleiner als $\epsilon$ ist, sind die Folgenglieder nah beieinander

Um eine Folge auf Konvergenz zu überprüfen, benötigt man die Kenntnis des Grenzwerts. Ist dieser nicht sofort erkennbar, die Konvergenz soll aber trotzdem erkannt werden, kann man das Cauchy-Kriterium verwenden:
Man zeigt, dass die Abstände zwischen den Folgengliedern beliebig klein werden, ohne den Grenzwert explizit bestimmen zu müssen.

>In den reellen Zahlen ist jede Cauchy-Folge konvergent.

<iframe title="Cauchy Folgen, Cauchy Kriterium, Konvergenz (Beispiel)" src="https://www.youtube.com/embed/jjve9o5PZTw?feature=oembed" height="113" width="200" allowfullscreen="" allow="fullscreen" style="aspect-ratio: 1.76991 / 1; width: 100%; height: 100%;"></iframe>

__Beispiel:__
$$a_n := \frac{1}{n}$$
Wir betrachten den Abstand zwischen $a_n$ und $a_m$
$$|a_m - a_n| = |\frac{1}{m} - \frac{1}{n}|$$
Da $m > n$ ist, gilt $\frac{1}{m} < \frac{1}{n}$.
Demnach ist $\frac{1}{m} - \frac{1}{n}$ negativ und wir können den Betrag auflösen:
$$= \frac{1}{n} - \frac{1}{m}$$
Da gilt $\frac{1}{m} > 0$
$$\Rightarrow \frac{1}{n} - \frac{1}{m} < \frac{1}{n}$$
Also ist der Abstand zwischen den Folgegliedern kleiner als $\frac{1}{n}$

Wir wollen nun eine Stelle $n_0$ finden, ab welcher gilt:
$$|a_m - a_n| < \epsilon$$
hier spezifisch:
$$\frac{1}{n} < \epsilon$$
Formel nach $n$ umstellen:
$$1 < \epsilon \cdot n$$
$$\frac{1}{\epsilon} < n \quad \text{ bzw. } \quad n > \frac{1}{\epsilon}$$
Also wählen wir
$$n_0 = \lceil \frac{1}{\epsilon} \rceil + 1$$

Überprüfung der Lösung:
$\epsilon = \frac{1}{10}$
$\Rightarrow n_0 = \lceil \frac{1}{0.1} \rceil + 1= 10 + 1 = 11$
Bedingung $\frac{1}{n} < \epsilon \ \rightarrow \ \frac{1}{11} < \frac{1}{10} \quad \checkmark$

### 8.5.1 Beweis

Für eine gegen den Grenzwert $a$ konvergente Folge $(a_n)$ galt folgende Beziehung:
$$\forall \epsilon > 0 \exists n_0: \forall n \ge n_0 |a_n-a| < \epsilon$$
__Beschränktheit:__
Im Bezug auf die Definition der Cauchy-Folge setzen wir zunächst $n = n_0$
$$|a_m-a_n| < \epsilon$$
$$\Rightarrow \forall m \ge n_0: | a_m - a_{n_0}| < \epsilon$$
$$|a_m| = |a_m - a_{n_0} + a_{n_0}|$$

__Dreiecksungleichung:__
$$|a_m - a_{n_0} + a_{n_0}| \le |a_m - a_{n_0}| + |a_{n_0}|$$
auf der linken Seite die addierte $0$ wieder weglassen
$$|a_m| \le |a_m - a_{n_0}| + |a_{n_0}|$$
$$\Rightarrow |a_m| < \epsilon + |a_{n_0}|$$
$M_0 := max\{ |a_1|, |a_2|, |a_3|, \dots |a_{n_{0-1}}| \}$
Für alle endlich vielen Folgeglieder außerhalb des $\epsilon$-Streifens.

$M_0 := max\{ M_0, \epsilon + |a n_0| \}$
$$\Rightarrow |a_m| \forall m \ge n_0, m \in \mathbb{N}$$

> [!info]- Zusammenfassung Teil 1: Beschränktheit
> Zuerst wurde bewiesen, dass jede Cauchy-Folge in $\mathbb{R}$ beschränkt ist. Aus der Definition einer Cauchy-Folge, $\forall \epsilon > 0 \exists n_0, \forall m, n \ge n_0: |a_m - a_n| < \epsilon$, folgt, dass für ein gewähltes $\epsilon$ ab einem Index $n_0$ alle Folgenglieder $a_m$ (für $m \ge n_0$) nur einen Abstand von weniger als $\epsilon$ zu $a_{n_0}$ haben. Durch die Dreiecksungleichung $|a_m| < \epsilon + |a_{n_0}|$ sind diese Glieder nach oben beschränkt.
>
> Die endlich vielen ersten Glieder der Folge, $\{a_1, a_2, \dots, a_{n_0-1}\}$, können ebenfalls beschränkt werden. Man wählt $M_0 := \max\{ |a_1|, |a_2|, \dots, |a_{n_0-1}| \}$ als die maximale Betragsgröße dieser ersten Glieder.
>Um eine globale obere Schranke $M$ für die *gesamte* Folge zu erhalten, wird das Maximum dieser beiden Teil-Schranken genommen: $M := \max\{ M_0, \epsilon + |a_{n_0}| \}$. 

Da sie beschränkt ist, ist nach dem Satz von Bolzano-Weierstraß bekannt, dass sie in $\mathbb{R}$ wenigstens eine konvergente Teilfolge enthält.
Es sei $t$ der Grenzwert einer konvergenten Teilfolge.
Dann ist noch zu zeigen, dass mit der Cauchy-Eigenschaft bewiesen werden kann, dass $t$ gleichzeitig der Grenzwert der gesamten Folge ist. Es sei $\epsilon > 0$ beliebig, aber fest.
Weiterhin sei $(a_{n_k})$ eine Teilfolge von $(a_n)$, die gegen $t$ konvergiert.

$(a_n)$ besitzt die Couchy Eigenschaft:
$$\forall \epsilon > 0 \exists n_1, \forall m,n \ge n_1: |a_m-a_n|<\frac{\epsilon}{2}$$
$$\lim_{k \to \infty} a_{n_k}= t$$
$$\Rightarrow \forall \epsilon > 0 \exists k_1, \forall k \ge k_1: |a_{n_k} -t| < \frac{\epsilon}{2}$$
Wir wollen nun ein einziges $k$ finden, das gleichzeitig zwei Bedingungen erfüllt.
1. $k \ge k_1$ Damit wegen $|a_{n_k} - t| < \frac{\epsilon}{2}$ möglichst klein wird.
2. $n_k \ge n_1$ Damit die Cauchy-Bedingung erfüllt ist.
Weiterhin: $\lim_{k \to \infty} n_k= \infty$
Diese Bedingung ist notwendig, damit die $n_k$ möglichst groß werden, um so ein $k$ finden zu können. Da $n_k$ streng monoton wachsend ist, gilt
$$\forall M \in \mathbb{N}, \exists k: (n_k) > M$$
Die Aussage bedeutet, dass die Folgeglieder der Teilfolge immer weiter nach rechts in der ursprünglichen Folge liegen.
Da die Folge die Cauchy-Eigenschaft besitzen soll, können wir ein beliebiges $m$ und $n$ wählen.
$$|a_m - a_n| < \frac{\epsilon}{2}$$
$$\Rightarrow |a_n - a_{n_k}| \le \frac{\epsilon}{2} \text{ weil } n, n_k \ge N_1$$
Betrachten speziell $|a_n -t|$ und addieren eine $0$.
$$\Rightarrow |a_n -t| = |a_n -t -a_{n_k} + a_{n_k}|$$
$$\Rightarrow |a_n -t| = |(a_n - a_{n_k}|+(a_{n_k} -t)|$$
Dreiecksungleichung
$$\Rightarrow |(a_n - a_{n_k}|+(a_{n_k} -t)| \le |a_n - a_{n_k}| +|a_{n_k} -t|$$
$$\Rightarrow |a_n -t| < \epsilon \forall n \ge N_1$$
$$N := 1$$
$$\Rightarrow |a_n -t| < \epsilon \forall n \ge N$$

> [!info]- Zusammenfassung Teil 2: Konvergenz
> Für ein beliebig kleines $\epsilon > 0$ gibt es aufgrund der Cauchy-Eigenschaft einen Index $n_1$, ab dem für alle $n, m \ge n_1$ gilt: $|a_m - a_n| < \frac{\epsilon}{2}$. Da die Teilfolge $(a_{n_k})$ gegen $t$ konvergiert, existiert ein Index $K$ (groß genug gewählt, sodass $n_K \ge n_1$) ab dem $|a_{n_K} - t| < \frac{\epsilon}{2}$ ist.
>
> Für beliebige $n \ge n_1$ betrachten wir den Abstand $|a_n - t|$. Durch Hinzufügen und Abziehen von $a_{n_K}$ und Anwendung der Dreiecksungleichung erhalten wir $|a_n - t| = |a_n - a_{n_K} + a_{n_K} - t| \le |a_n - a_{n_K}| + |a_{n_K} - t|$.
> Da sowohl $|a_n - a_{n_K}|$ (wegen der Cauchy-Eigenschaft) als auch $|a_{n_K} - t|$ (wegen der Konvergenz der Teilfolge) kleiner als $\frac{\epsilon}{2}$ sind, folgt $|a_n - t| < \frac{\epsilon}{2} + \frac{\epsilon}{2} = \epsilon$.
>
> Dies beweist, dass die gesamte Folge $(a_n)$ gegen $t$ konvergiert. Somit ist jede Cauchy-Folge in den reellen Zahlen konvergent.
## 8.6 Das Monotonie-Kriterium (monotone Konvergenz)

>__Satz:__ Eine Folge konvergiert, wenn...
>1) sie monoton wachsend und nach oben beschränkt ist.
>2) wenn sie monoton fallend und nach unten beschränkt ist.


### 8.6.1 Beweis

__Beweis zu 1:__
Es sei $(a_n)$ eine nach oben beschränkte unendliche Zahlenfolge.
$$A := \{ a_n \mid n \in \mathbb{N} \}$$
Jede nicht leere Menge in den reellen Zahlen besitzt ein Supremum.
$$s := \sup A$$
Nun muss noch gezeigt werden, dass $(a_n)$ für $n \rightarrow \infty$ gegen $s$ konvergiert. Es sei $\epsilon > 0$ beliebig. Da $s$ die kleinste obere Schranke ist, kann $s- \epsilon$ keine obere Schranke sein. D.h. es gibt kein Folgenglied $a_N$, ab dem die Folge den Wert $s -\epsilon$ überschreitet.
$$\Rightarrow a_n > s -\epsilon$$
Da $a_n$ nach Voraussetzung monoton wachsend sein soll, gilt
$$a_n \ge a_N \forall n \ge N$$
$$\Rightarrow a_n \ge a_N > s - \epsilon$$
Da $s$ eine obere Schranke von $(a_n)$ ist, gilt $a_n \le s \forall n \in \mathbb{N}$
$$\Rightarrow s - \epsilon < a_n$$
$+\epsilon$
$$s < a_n + \epsilon$$
$-a_n$
$$s - a_n < \epsilon$$
Da $s$ eine obere Schranke von $(a_n)$ ist, gilt
$$s - a_n \ge 0 \forall n \in \mathbb{N}$$
$$\Rightarrow s -a_n = |a_n -s|$$
$$\Rightarrow |a_n -s| < \epsilon \forall n \ge N$$

> [!info]- Zusammenfassung
> Ist eine Folge $(a_n)$ monoton wachsend und nach oben beschränkt, so existiert aufgrund der Vollständigkeit der reellen Zahlen ihr Supremum $s = \sup(\{ a_n \mid n \in \mathbb{N} \})$. Um die Konvergenz gegen $s$ zu zeigen, wird die Epsilon-Definition verwendet: Für jedes $\epsilon > 0$ ist $s - \epsilon$ keine obere Schranke mehr (da $s$ die *kleinste* obere Schranke ist). Das bedeutet, es existiert ein Folgenglied $a_N$ mit $a_N > s - \epsilon$. Da $(a_n)$ monoton wachsend ist, gilt $a_n \ge a_N$ für alle $n \ge N$. Gleichzeitig ist $s$ eine obere Schranke, also $a_n \le s$. Aus $s - \epsilon < a_N \le a_n \le s$ folgt $s - \epsilon < a_n \le s$, was äquivalent zu $|a_n - s| < \epsilon$ ist. Damit konvergiert $(a_n)$ gegen $s$.

__Beweis zu 2:__
Analog zu 1 mit dem Infimum

## 8.7 Das Einschließungs- / Sandwich-Kriterium

>Es seien $(a_n), (b_n), (c_n)$ drei Folgen, wobei $(a_n)$ und $(c_n)$ als konvergent angenommen werden.

$$\lim_{n \to \infty} a_n = \lim_{n \to \infty} c_n = L$$
Dann gilt
$$\lim_{n \to \infty} b_n = L$$
$$\text{ für } a_n \le b_n \le c_n \forall n \ge n_0$$
$$\forall \epsilon > 0 \exists n_1: |a_n -L| < \epsilon \quad \forall n \ge n_0$$
Aufteilen des Betrags per Fallunterscheidung
$$L - \epsilon < a_n < L + \epsilon \quad \forall n \ge n_1$$
Daraus geht hervor, dass $a_n$ im Intervall $(L - e, L + e)$ liegt.
Da auch $(c_n)$ für $n \rightarrow \infty$ gegen $L$ konvergiert
$$c_n < L + \epsilon \quad \forall n \ge n_2$$
$$N: \max \{ n_0, n_1, n_2 \}$$
$$\Rightarrow a_n \le b_n \le c_n$$
$$L - \epsilon < a_n$$
$$c_n < L + \epsilon$$
$$\Rightarrow L -\epsilon < b_n < L +\epsilon \quad \forall n \ge N$$
$$\Rightarrow |b_n -L| < \epsilon \quad \forall n \ge N$$

__Beispiel 1__
$$b_n = \frac{\sin{n}}{n}$$
Behauptung:
$$\lim_{n \to \infty} b_n = 0$$
allgemein gilt:
$$-1 \le \sin{n} \le 1$$
$/n$
$$\Rightarrow \underbrace{-\frac{1}{n}}_{a_n} \le \underbrace{\frac{\sin{n}}{n}}_{b_n} \le \underbrace{\frac{1}{n}}_{c_n}$$
$$\lim_{n \to \infty} a_n = \lim_{n \to \infty} (-\frac{1}{n}) = 0$$
$$\lim_{n \to \infty} a_n = \lim_{n \to \infty} (-\frac{1}{n}) = 0$$
$$\lim_{n \to \infty} c_n = \lim_{n \to \infty} (\frac{1}{n}) = 0$$
Da $(b_n)$ zwischen den beiden Folgen liegt, geht sie auch gegen $0$.


__Beispiel 2__
$$b_n = \sqrt{n +1} -\sqrt{n}$$
$$\lim_{n \to \infty} b_n = 0$$
$$a_n = \sqrt{n +1} -\sqrt{n} - \frac{1}{n}$$
$$\lim_{n \to \infty} a_n = 0$$
$$c_n = \sqrt{n +1} -\sqrt{n} + \frac{1}{n}$$
$$\lim_{n \to \infty} c_n = 0$$
$$\Rightarrow a_n < b_n < c_n$$

# 9. Reihen

>Definition: Eine Reihe ist eine Folge von Partialsummen

$$\sum_{k=0}^{n} s_k = s_0 + s_1 + s_2 + s_3 + \dots + s_n$$

__Partialsummen:__
$p_0 = s_0$
$p_1 = s_0 + s_1$
$p_2 = s_0 + s_1 + s_2$
$p_n = s_0 + s_1 + s_2 + \dots + s_n$

## 9.1 Endliche Reihen

>Bei endlichen Reihen handelt es sich um eine Summation von endlich vielen Termen.


__Bsp.: Gaußsche Summenformel__
$$\sum_{k+1}^{n} k = 1 + 2 + \dots + n = \frac{n(n+1)}{2}$$

## 9.2 Unendliche Reihen

>Bei unendlichen Reihen ist die Folge der Partialsummen auch unendlich. Die obere Summationsgrenze ist $\infty \Rightarrow \sum^{\infty}$

__Beispiel: Die geometrische Reihe__
$$\sum_{k=1}^{\infty} q^k = q^0 + q^1 + q^2 + \dots$$
Betrachten der ersten $n$ Summanden
$$G_n = \sum_{k=0}^{n-1} q^k = q^0 + q^1 + q^2 + \dots + q^{n-1}$$
$\cdot q$
$$\Rightarrow qG_n = q + q^2 + \dots + q^n$$
$$\Rightarrow qG_n = -1 \underbrace{+1 + q + q^2 + \dots + q^{n-1}}_{G_n} + q^n$$
$$\Rightarrow qG_n = -1 + G_n + q^n$$
$-G_n$
$$\Rightarrow qG_n - G_n = g^n - 1$$
$$\Rightarrow G_n(q-1) = q^n - 1$$
$$\Rightarrow G_n = \frac{q^n -1}{q -1}$$
Die Gn wurden nun die Folgeglieder der Zahlenfolge Gn. Daher können wir für diese Folge das Verhalten für $n \rightarrow \infty$ untersuchen.
Das Konvergenzverhalten dieser Folge hängt vom Wert von $q$ ab.

__1. Fall__
$|q| = 1$
$G_n = \frac{q^n -1}{q-1}$
Dieser Fall funktioniert nicht, wegen Division durch $0$.

__2. Fall__
$|q| > 1$
$\lim_{n \to \infty} (\frac{q^n -1}{q-1})= \infty$
$\Rightarrow G_n$ besitzt keinen Grenzwert

__2. Fall__
$|q| < 1$
$\lim_{n \to \infty} (\frac{q^n -1}{q-1})= \frac{0-1}{q-1} = \frac{-1}{q-1} = \frac{1}{1-q}$
$\Rightarrow$ Der Grenzwert der Partialsumme ist der Grenzwert der Reihe, wenn er existiert.

## 9.3 Konvergenz und Divergenz unendlicher Reihen

Der Wert einer unendliche Reihe ist der Grenzwert der Partialsummen. Dabei spielt es keine Rolle, ob die Reihe bei $0$ oder $1$ startet. Für die Darstellung starten wir o.B.d.A. bei $0$.

$$\sum_{k=0}^{\infty} a_k = \lim_{n \to \infty} \sum_{k=0}^{n} a_k = \lim_{n \to \infty} s_n$$

$s_n$ = Folge der Partialsummen
$s_0 = a_0$
$s_1 = a_0 + a_1$
$s_2 = a_0 + a_1 + a_2$
$s_n = a_0 + a_1 + a_2 + \dots + a_n$


Für eine unendliche Reihe gibt es verschiedene Verhalten im Unendlichen.

__Bestimmte Divergenz__
$$\lim_{n \to \infty} (s_n) = \pm \infty$$

__Konvergenz__
$$\lim_{n \to \infty} (s_n) = s \ \ (|s| < \infty)$$

__Unbestimmte Divergenz__
(Weder bestimmt divergent noch konvergent.)
$$\text{Bsp.:} \sum_{k=0}^{n} (-1)^k \cdot k$$

## 9.4 Konvergenz unendlicher Reihen

Im Allgemeinen lässt sich nicht immer sofort erkennen, ob eine Reihe konvergiert oder nicht, da der Grenzwert der Folge der Folge der Partialsummen nicht immer sofort erkennbar ist. Daher ist es praktikabler, Konvergenzkriterien anzuwenden, die es einfacher machen, unendliche Reihen auf Konvergenz zu prüfen.

### 9.4.1 Notwendige Bedingungen für Konvergenz

Für die Konvergenz der Reihe ist es **notwendig**, dass $a_k$ eine Nullfolge ist (mit Grenzwert $0$).
$$\sum_{k=0}^{\infty} a_k$$$$\lim_{k \to \infty} (a_k) = 0$$
**Wichtig:** Diese Bedingung ist notwendig, aber **nicht hinreichend**!
- Wenn $\sum a_k$ konvergiert, dann muss $a_k \to 0$ gelten
- Aber aus $a_k \to 0$ folgt **nicht**, dass $\sum a_k$ konvergiert

Die Terme müssen **schnell genug** gegen Null gehen.


__Bsp. 1: Geometrische Reihe (konvergent)__

$$\sum_{k=0}^{\infty} q^k, \quad |q| < 1$$

$$\lim_{k \to \infty} q^k = 0$$

Die Terme werden **exponentiell schnell** kleiner (jeder Term ist um Faktor $q$ kleiner als der vorherige).

**Ergebnis:** Die Reihe **konvergiert** mit Grenzwert: $$\sum_{k=0}^{\infty} q^k = \frac{1}{1-q}$$

Beispiel für $q = \frac{1}{2}$: $1 + \frac{1}{2} + \frac{1}{4} + \frac{1}{8} + \cdots = 2$


__Bsp. 2: Harmonische Reihe (divergent)__

$$\sum_{k=1}^{\infty} \frac{1}{k}$$

$$\lim_{k \to \infty} \left(\frac{1}{k}\right) = 0$$

Die Terme werden **zu langsam** kleiner (nur linear, nicht exponentiell).

**Nachweis der Divergenz durch Gruppenbildung:**

$= 1 + \frac{1}{2} \quad (> \frac{1}{2})$

$+ \frac{1}{3} + \frac{1}{4} \quad (> \frac{1}{2})$

$+ \frac{1}{5} + \frac{1}{6} + \frac{1}{7} + \frac{1}{8} \quad (> \frac{1}{2})$

$+ \cdots$

$$\Rightarrow \sum_{k=1}^{\infty} \frac{1}{k} > \frac{1}{2} + \frac{1}{2} + \frac{1}{2} + \cdots = \infty$$

**Ergebnis:** Die harmonische Reihe ist **divergent**, obwohl $\frac{1}{k} \to 0$!

### 9.4.3 Alternierende Reihen

Eine unendliche Reihe heißt alternierend, wenn direkt aufeinanderfolgende Summanden unterschiedliche Vorzeichen haben.

__Beispiel:__

$$\sum_{k=1}^{\infty} k(-1)^k = -1 + 2 -3 +4 -5 +6 - \dots$$

### 9.4.4 Das Leibnitz-Kriterium

>Eine alternierende Reihe $\sum_{k=0}^{\infty} a_k(-1)^k$ konvergiert, wenn folgende zwei Bedingungen erfüllt sind:
>Die Folge $a_n$ ist eine Nullfolge, d.h. $\lim_{n \to \infty} a_n = 0$ und monoton fallend, d.h. $a_n \ge a_{n+1}$.


__Beispiel:___
$$\sum_{k=1}^{\infty} \frac{1}{k}(-1)^{k+1}$$
1 ) alternierend? $\checkmark$

2 ) ist $a_k$ nicht negativ?
$$\frac{1}{k} > 1$$
$$a_k \ge 0 \quad \forall k \in \mathbb{N} \quad \checkmark$$
3 ) ist $a_k$ eine Nullfolge?
$$a_k = \frac{1}{k}$$
$$\lim_{k \to \infty} a_k = 0 \quad \checkmark$$


4 ) ist $a_k$ monoton fallend?
$$a_{k+1} = \frac{1}{k+1}$$
$$a_k > a_{k+1}$$
$$\Rightarrow \frac{1}{k} > \frac{1}{k+1}$$
$\cdot (k +)$
$$\frac{k+1}{k} > 1 \quad \checkmark$$
$\Rightarrow (a_k)$ ist monoton fallend
$\Rightarrow (a_k)$ konvergiert

#### 9.4.4.1 Herleitung

Allgemeine Darstellung einer alternierenden Reihe:
$$\sum_{k=0}^{\infty} a_k(-1)^k = -a_0 + a_1 -a_2 + a_3 - \dots$$

Um das Leibnitz-Kriterium anwenden zu können, müssen wir uns zunächst folgende Bedingungen setzen, die über die gesamte Herleitung ihre Gültigkeit behalten.

$$1) \ a_k \ge 0 \quad \forall k \in \mathbb{N}$$
$$2) \ (a_k) \text{ ist monoton fallend } \Rightarrow a_{k+1} \le a_k$$
$$3) \lim_{k \to \infty} (a_k) = 0$$

Gerade Partialsummen:
$$s_{2n} = a_1 - a_2 +a_3 -a_4 + \dots +a_{2n-1} - a_{2n}$$

Dieser Ausdruck lässt ich in paaren Anordnen:
$$\Rightarrow s_{2n} = \underbrace{(a_1 -a_2)}_{\ge 0} + \underbrace{(a_3 -a_4)}_{\ge 0} + \dots + \underbrace{(a_{2n-1} - a_{2n})}_{\ge 0}$$

Die Anwendung des Leibnitz-Kriteriums setzt voraus, dass die $a_k$ monoton fallend sind.
$$\Rightarrow s_{2n} \ge 0$$

__Monotonie von $s_{2n}$__

Wir vergleichen zwei aufeinanderfolgende gerade Partialsummen.
Wir wissen:
$$a_{2n+2} \le a_{2n+1} \Rightarrow a_{2n+1} - a_{2n+2} \ge 0$$
$$\Rightarrow s_{2n+2} \ge s_{2n}$$
Somit ist die Folge der geraden Partialsummen monoton wachsend.

__Beschränktheit von $s_{2n}$__
$$s_{2n+1} = s_{2n} + a_{2n+1}$$
Damit das Leibnitz-Kriterium funktioniert, wurde Folgendes vorausgesetzt:
$$a_{2n+1} \ge 0$$
$$\Rightarrow s_{2n+1} \ge s_{2n}$$
$$s_{2n} = a_1 - a_2 +a_3 -a_4 + \dots +a_{2n-1} - a_{2n}$$
$$= \underbrace{a_1}_{\ge 0} - \underbrace{(a_2 -a_3)}_{\ge 0} - \underbrace{(a_4 - a_5)}_{\ge 0} - \dots - \underbrace{(a_{2n-2} -a_{2n-1})}_{\ge 0} - \underbrace{a_{2n}}_{\ge 0}$$
$$\Rightarrow s_{2n} \ge 0 \Rightarrow s_{2n} \le a_1$$
Da $a_1$ eine Konstante ist, haben wir gezeigt, dass $s_{2n}$ durch $a_1$ nach oben beschränkt ist.


__Beschränktheit von $s_{2n+1}$__

$$s_1 - s_{2n} = a_1 -(a_1-a_2 +a_3 -a_4 + \dots -a_{2n}) $$
$$= a_1 - a_1 + a_2 - a_3 +a_4 - \dots + a_{2n}$$
$$\Rightarrow s_1 - s_{2n} = \underbrace{(a_2 - a_3)}_{\ge 0} + \underbrace{(a_4 -a_5)}_{\ge 0} + \dots + \underbrace{a_{2n}}_{\ge 0}$$
$$\Rightarrow s_1 -s_{2n} \ge 0$$
$$\Rightarrow s_1 - s_{2n} \ge a_{2n}$$
Da $(a_k)$ monoton fallend ist, gilt
$$a_{2n} \ge a_{2n+1}$$
$$\Rightarrow a_{2n+1} = s_{2n+1} - s_{2n}$$
$$s_1 \ge s_{2n+1}$$
$$\Rightarrow s_{2n+1} \le a_1$$
$\Rightarrow$ Die Folge der ungeraden Partialsummen ist durch $a_1$ nach oben beschränkt.

$$s_{2n+1} = s_{2n} + a_{2n+1}$$
$$a_{2n+1} \ge 0$$
$$\Rightarrow s_{2n_1} \ge s_{2n}$$
bekannt: $s_{2n}$ ist nach unten beschränkt und somit ist auch $s_{2n+1}$ nach unten beschränkt.


__Monotonie von $s_{2n+1}$__

$$s_{2n+3} - s_{2n+1} - a_{2n+1} + a_{2n+3}$$
$$\Rightarrow s_{2n+3} - s_{2n+1} = \underbrace{a_{2n+3} - a_{2n+1}}_{\ge 0}$$
$$\Rightarrow s_{2n_3} - s_{2n+1} \ge 0$$
$+s_{2n_1}$
$$\Rightarrow s_{2n_3} \ge s_{2n_1}$$
$\Rightarrow s_{2n+1}$ ist monoton fallend

Zusammenfassend:
$(s_{2n})$ ist monoton fallend
$(s_{2n})$ ist nach unten beschränkt

$$\Rightarrow \lim_{n \to \infty} (s_{2n}) := s$$
$(s_{2n+1})$ ist monoton fallend
$(s_{2n+1})$ ist nach unten beschränkt
$$\Rightarrow \lim_{n \to \infty} (s_{2n+1}) := T$$

Ende der Zusammenfassung:
$$s_{2n+1} = s_{2n} + a_{2n+1}$$
$-s_{2n}$
$$\Rightarrow s_{2n+1} - s_{2n} = a_{2n_1}$$
$\lim_{n \to \infty}$
$$\Rightarrow \lim_{n \to \infty} (s_{2n+1} - s_{2n}) = \lim_{n \to \infty} (a_{2n+1})$$
fehlt:
$$\lim_{n \to \infty}$$
$$\Rightarrow T - s = 0$$
$+s$
$$\Rightarrow T = s$$
$\Rightarrow$ gerade und ungerade Partialsummen konvergieren gegen den selben Grenzwert $s$.

### 9.4.5 Das Majoranten-Kriterium

<iframe title="Majorantenkriterium und Minorantenkriterium (Konvergenz von Reihen)" src="https://www.youtube.com/embed/lMPWumuADdc?feature=oembed" height="113" width="200" allowfullscreen="" allow="fullscreen" style="aspect-ratio: 1.76991 / 1; width: 100%; height: 100%;"></iframe>

Es seien zwei Summen $S_a$ und $S_b$ gegeben:
$$S_a = \sum_{k=1}^{\infty} a_k \quad \text{mit} \quad a_k \ge 0 \quad \forall k \in \mathbb{N}$$
$$S_b = \sum_{k=1}^{\infty} b_k \quad \text{mit} \quad b_k \ge 0 \quad \forall k \in \mathbb{N}$$
Die Summe $S_b$ heißt __Majorante__ (Oberreihe) von $S_a$, falls folgendes gilt:
$$|a_k| \le b_k \quad \forall k \in \mathbb{N}$$

Jedes Glied $a_k$ wird durch das entsprechende Glied $b_k$ nach oben beschränkt
$$0 \le a_k \le b_k \quad \forall k$$
>Wenn die Majorante $S_b$ konvergiert, dann konvergiert auch die kleinere Reihe $S_a$.
>Der Grenzwert von $S_a$ kann höchstens so groß wie der von $S_b$ sein.

#### 9.4.5.1 Beweis
$$S_a = \sum_{k=1}^{\infty} a_k \text{ wird zu } A_n = \sum_{k=1}^n a_k$$
$$S_b = \sum_{k=1}^{\infty} b_k \text{ wird zu } B_n = \sum_{k=1}^n b_k$$
Ziel ist, zu zeigen, dass $(A_n)$ das Cauchy-Kriterium erfüllt, d.h.
$$\forall \epsilon > 0 \quad \exists N: |A_n - A_m| < \epsilon \quad \forall n, m \ge N$$
weiterhin gilt:
$$m>n$$
$$\Rightarrow A_n=\sum_{k=1}^n a_k, \ \ \ \ \ A_m=\sum_{k=1}^m a_k$$
Partialsummen ausschreiben:
$$A_n - A_m = a_1 + a_2 + a_3 + \dots + a_{n-1} + a_n - (a_1 + a_2 + a_3 + \dots + a_{m-1} + a_nm)$$
$$=\sum_{k=n+1}^m a_k$$
Durch Dreicksungleichung
$$|A_n - A_m| = |\sum_{k=n+1}^m a_k| \le \sum_{k=n+1}^m |a_k|$$
$$\Rightarrow |A_n-A_m| = \le \sum_{l=n+1}^m |a_k| \underbrace{\le}_{\text{wegen Voraussetzung } |a_k| \le b_k \forall k} \sum_{k=n+1}^m b_k = B_m - B_n$$
$$b_k \ge 0 \forall k \Rightarrow B_n \text{ monoton wachsend }$$
$$B_{n+_1} - B_n = b_{n+1} \ge 0 \Rightarrow B_{n+1} \ge B_n$$
Wir hatten angenommen, dass $B_n$ eine Cauchy-Folge ist.
$$\Rightarrow \forall \epsilon > 0 \exists N: B_n - B_m < \epsilon \forall m,n \ge N$$
hatten gesehen:
$$|A_n -A_m| \le B_n - B_m < \epsilon$$
$$\Rightarrow |A_n-A_m| < \epsilon \forall m, n \ge N$$
$\Rightarrow A_n$ konvergiert

> [!info]- Zusammenfassung
> Der Beweis des Majoranten-Kriteriums stützt sich darauf, zu zeigen, dass die Partialsummenfolge $(A_n)$ der kleineren Reihe $\sum a_k$ eine Cauchy-Folge ist. Betrachtet man die Differenz $|A_m - A_n|$ für $m > n$, lässt sich diese mithilfe der Dreiecksungleichung und der Voraussetzung $|a_k| \le b_k$ nach oben durch die Differenz der Partialsummen der Majorante $B_m - B_n$ abschätzen. Da die Majorante $\sum b_k$ konvergiert, bilden ihre Partialsummen $(B_n)$ eine Cauchy-Folge. Folglich kann $B_m - B_n$ für hinreichend große Indizes beliebig klein gemacht werden. Dies impliziert direkt, dass auch $|A_m - A_n|$ beliebig klein wird, was die Cauchy-Eigenschaft von $(A_n)$ beweist und somit die Konvergenz der Reihe $\sum a_k$ in den reellen Zahlen sicherstellt.

### 9.4.6 Das Minoranten-Kriterium

Es seien zwei Summen $S_a$ und $S_b$ gegeben:
$$S_a = \sum_{k=1}^{\infty} a_k \quad \text{mit} \quad a_k \ge 0 \quad \forall k \in \mathbb{N}$$
$$S_b = \sum_{k=1}^{\infty} b_k \quad \text{mit} \quad b_k \ge 0 \quad \forall k \in \mathbb{N}$$
Weiterhin existiere ein $N$, ab dem gilt, dass jedes Glied $b_k$ durch das entsprechende Glied $a_k$ nach oben beschränkt wird
$$a_k \ge b_k \ge 0 \quad \forall k \ge N$$

>Wenn die Minorante $S_b$ gegen $\infty$ divergiert, dann divergiert die größere Reihe $S_a$ (erst Recht).

#### 9.4.6.1 Beweis
$$S_a = \sum_{k=1}^{\infty} a_k \text{ wird zu } A_n = \sum_{k=1}^{\infty} a_k$$$$S_b = \sum_{k=1}^{\infty} b_k \text{ wird zu } B_n = \sum_{k=1}^{\infty} b_k$$
$$a_k \ge b_k \forall k \in \mathbb{N}$$
$$\Rightarrow \sum_{k=1N}^n a_k \ge \sum_{k=N}^n b_k$$
$$\Rightarrow A_n = \sum_{k=1}^n a_k = \sum_{k=1}^{N-1} a_k + \underbrace{\sum_{k=N}^n a_k}_{\le \sum_{k=N}^n b_k}$$
$$\Rightarrow B_n = \sum_{k=1}^n b_k = \sum_{k=1}^{N-1} b_k + \sum_{k=N}^{n} b_k$$
Für die Summe der ersten Gleichung lässt sich eine Ungleichung einbauen
$$\Rightarrow A_n \ge \sum_{k=1}^{N-1} + \sum_{k=1}^n b_k$$
$$\Rightarrow \sum_{k=N}^n b_k = B_n - \sum_{k=1}^{N-1} b_k$$
Die Anfangsausdrücke fassen wir, weil es sich jeweils nur um endlich viele Zahlen handelt, zu einer Konstanten $C$ zusammen.
$$C := \sum_{k=1}^{N-1} a_k - \sum_{k=1}^{N-1} b_k$$
$$\Rightarrow A_n \ge B_n + C$$
Annahme: $S_b$, also $(B_n)$ divergiert
$$\lim_{n \to \infty} (B_n) = \infty$$
Da $C$ eine Konstante ist, die positiv, negativ oder $0$ sein kann, und $A_n > B_n$ gilt, folgt
$$\lim_{n \to \infty} (A_n) = \infty$$

__Beispiel:__ Harmonische Reihe als Minorante
$$S_b = \sum_{k=1}^{\infty} \frac{1}{k} \text{ wissen, dass Reihe divergiert}$$
$$S_a = \sum_{k=1}^{\infty} \frac{1}{\sqrt{k}}$$
$$\Rightarrow a_k \ge b_k \forall k$$
Prüfung der Voraussetzungen:
1 ) Nichtnegativität:
$$k \ge 1 \Rightarrow \frac{1}{k} > 0 , \ b_k > 0$$
2 ) Gliedweiser Vergleich ab einem bestimmten Index:
$$\frac{1}{\sqrt{k}} \ge \frac{1}{k} \forall k \ge 1 \Rightarrow N  =1$$
$$\Rightarrow a_k \ge b_k$$
Weil bereits bekannt ist, dass $\sum_{k=1}^{\infty} \frac{1}{k}$ divergiert und sie die Minorante zu $\sum_{k=1}^{\infty} \frac{1}{\sqrt{k}}$ ist, gilt
$$\lim_{n \to \infty} \sum_{k=1}^n \frac{1}{k} = \infty$$
Da die Minorante $\sum_{k=1}^{\infty} \frac{1}{k}$ divergiert, divergiert auch die Reihe $\sum_{k=1}^{\infty} \frac{1}{\sqrt{k}}$.

> [!info]- Zusammenfassung
> Für die Partialsummen $(A_n)$ der Reihe $\sum a_k$ und $(B_n)$ der Reihe $\sum b_k$ lässt sich die Beziehung $A_n \ge B_n + C$ herstellen. Hierbei ist $C$ eine Konstante, die die Differenz der ersten Glieder (bis $N-1$) berücksichtigt. Da die Minorante $\sum b_k$ gegen unendlich divergiert, d.h. $\lim_{n \to \infty} B_n = \infty$, und die Partialsummen $A_n$ stets größer oder gleich den Partialsummen $B_n$ (plus einer Konstante) sind, muss auch die Majorante $\sum a_k$ gegen unendlich divergieren.

### 9.4.7 Zusammenfassung

#### 9.4.7.1 Leibnitz-Kriterium
1 ) Gilt nur für alternierende Reihen
$$\sum_{k=1}^{\infty} a_k(-1)^k$$
2 ) Nichtnegativität
$$a_k \ge 0 \quad \forall k \in \mathbb{N}$$
3 ) $(a_k)$ muss monoton fallend sein
$$a_{k+1} \le a_k \quad \forall k \in \mathbb{N}$$
4 ) $(a_k)$ muss eine Nullfolge sein
$$\Rightarrow \lim_{k \to \infty} (a_k) = 0$$

#### 9.4.7.2 Majorantenkriterium

$$\text{Zu} \quad\sum_{k=1}^{\infty} a_k \quad \text{ist} \quad \sum_{k=1}^{\infty} b_k \quad \text{die konvergente Majorante}$$

1 ) Finden einer Majorante
$$|a_k| \le b_k \quad \forall k \in \mathbb{N}$$
2 ) Nichtnegativität der Majorante
$$b_k \ge 0 \quad \forall k \in \mathbb{N}$$
3 ) Konvergenz der Majorante
$$\sum_{k=1}^{\infty} b_k \text { konvergiert}$$

__Beispiel:__

Betrachten der Reihe
$$ \sum_{k=1}^{\infty} \frac{\sin{k}}{k^2}$$
1 ) Finden einer Majorante
$$|\sin{k}| \le 1$$
$/k^2$
$$\Rightarrow \frac{|\sin{k}|}{k^2} \le \frac{1}{k^2}$$
$$\Rightarrow | \frac{\sin{k}}{k^2} | \le \frac{1}{k^2}$$
2 ) Nichtnegativität der Majorante
$$b_k = \frac{1}{k^2} \quad \text{ mit } \quad k \ge 0 \quad \forall \in \mathbb{N}$$
3 ) Konvergenz der Majorante
$$\sum_{k=1}^{\infty} \frac{1}{k^2} \quad \text{konvergiert}$$
$\Rightarrow$ nach dem Majorantenkriterium konvergiert $\sum_{k=1}^{\infty} \frac{\sin{k}}{k^2}$ ebenfalls

#### 9.4.7.3 Minoranten-Kriterium

$$\text{Zu} \quad\sum_{k=1}^{\infty} a_k \quad \text{ist} \quad \sum_{k=1}^{\infty} b_k \quad \text{die divergente Minorante}$$

1 ) Gliedweiser Vergleich
$$a_k \ge b_k \quad \forall k \in \mathbb{N}$$
2 ) Nichtnegativität
$$a_k, b_k \ge 0 \quad \forall k \in \mathbb{N}$$
3 ) Divergenz der Minorante
$$\sum_{k=1}^{\infty} b_k \text { divergiert}$$

__Beispiel:__

Betrachten der Reihe
$$\sum_{k=1}^{\infty} \frac{1 + \sqrt{k}}{k}$$

1 ) Gliedweiser Vergleich
$$\sum_{k=1}^{\infty} \frac{1 + \sqrt{k}}{k} \ge \frac{1}{k}$$
2 ) Nichtnegativität
$$b_k = \frac{1}{k} \ge 0 \quad \forall k \in \mathbb{N}$$
3 ) Divergenz der Minorante
$$\sum_{k=1}^{\infty} \frac{1}{k} \quad \text{divergiert}$$
$\Rightarrow$ nach dem Majorantenkriterium konvergiert $\sum_{k=1}^{\infty} \frac{1 + \sqrt{k}}{k}$ ebenfalls

# 10. Reellwertige Funktionen einer Variablen mit reellem Definitionsbereich

$$f: \mathbb{R} \rightarrow \mathbb{R}$$
$$f: x \mapsto f(x)$$
Bsp.: $f(x) = x^2$

## 10.1 Lineare Funktionen

![[Pasted image 20260109085413.png]]

$$y = f(x) = mx +n$$
m = Anstieg
n = Schnittpunkt mit der y-Achse

$$P_1(x_1, y_1), \ \ P_2(x_1, y_2)$$
$$m = \frac{\Delta y}{\Delta x} = \frac{y_2 - y_1}{x_2 - x_1} = \tan(\alpha)$$

__Bestimmung von $n$:__

$$y = mx + n$$
$$\Rightarrow n = y - mx$$
Beliebigen Punkt auf der Geraden einsetzen, z.B. $P_1(x_1, y_1)$
$$\Rightarrow n = y_1 - mx_1$$
$$\Rightarrow y = f(x) = \underbrace{\frac{y_2 - y_1}{x_2 - x_1}}_{m} x + \underbrace{y_1 - mx_1}_{n}$$
### 10.1.1 Horizontale Geraden/Konstanten

![[Pasted image 20260109091124.png]]

$$\Rightarrow y = f(x) = c$$
hier gilt $m=1$

### 10.1.2 Vertikale Geraden

![[Pasted image 20260109091241.png]]

$y = f(x) = mx+n$ kann nicht zur Beschreibung verwendet werden, weil $m=\infty$ wäre

Richtige Darstellung:
$$x = x_0$$