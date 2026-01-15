# 1. Aussagenlogik

$\land$ - AND
$\lor$ - OR
$\lnot A$ oder $\overline{A}$ - Negatiom
$\Leftrightarrow$ - Äquivalenz (beide Aussagen haben den gleichen Wahrheitswert)
$\Rightarrow$ - Implikation (beachte: Aus etwas wahrem kann nichts falsches folgen)

$\overline{A \land B} = \overline{A} \lor \overline{B}$
$\overline{A \lor B} = \overline{A} \land \overline{B}$
$A \land (B \land C) \Leftrightarrow (A \land B) \land C$
$A \lor (B \lor C) \Leftrightarrow (A \lor B) \lor C$
$A \land (B \lor C) \Leftrightarrow (A \land B) \lor (A \land C)$ Ausklammern
$A \lor (B \land C) \Leftrightarrow (A \lor B) \land (A \lor C)$ Ausklammern
$A \land (A \lor B) \Leftrightarrow A$
$A \lor (A \land B) \Leftrightarrow A$

# 2. Mengenlehre

$\cup$ - Vereinigung $\forall x_. x \in (A \cup B) \Leftrightarrow (x \in A) \lor (x \in B)$
$\cap$ - Schnittmenge $\forall x_. x \in (A \cap B) \Leftrightarrow (x \in A) \land (x \in B)$
$\setminus$ - Mengendifferenz $\forall x_.(x \in A \setminus B) \Leftrightarrow (x \in A) \land (x \notin B)$
$\subseteq$ - Teilmenge $A \subseteq B \Leftrightarrow (\forall x_.(x \in A) \implies (x \in B))$

$A \cap (B \cap C) = (A \cap B) \cap C$
$(A \cap B) \cup A = A$
$(A \cup B) \cap A = A$

disjunkt - zwei Mengen haben kein gemeinsames Element $A \cap B = \varnothing$

Potenzmenge: $M = \{ 2, 4, 6 \} \quad P(M) = \{ \varnothing, \{2\}, \{4\}, \{6\}, \{2, 4\}, \{2, 6\}, \{4, 6\}, M \}$
$$| P(M) | = 2^{|M|}$$

Obere Schranke: $\exists \ b \in \mathbb{R} : x \le b \ \forall \ x \in M$
Supremum: kleinste obere Schranke

Untere Schranke: $\exists \ a \in \mathbb{R}: x \ge a \ \forall \ x \in M$
Infimum: kleinste obere Schranke

# 3. Vollständige Induktion

Es soll bewiesen werden:
$$z_n = 1^2 + 2^2 + 3^2 + \dots + n^2= \frac{n(n+1)(2n+1)}{6}$$
__1. Induktionsanfang:__
$$n = 1$$
$$z_1 = \frac{1(1+1)(2 \cdot 1 +1)}{6} = 1$$
__2. Induktionsvoraussetzung:__
$$z_n = \frac{n(n+1)(2n+1)}{6}$$
__3. Induktionsschritt__
$$z_n \to z_{n+1}$$
Zu zeigen:
$$z_{n+1} = \frac{(n+1)((n+1)+1)(2(n+1)+1}{6} = \frac{(n+1)(n+2)(2n+3)}{6} = \underline{\frac{2n^3 + 9n^2 + 13n + 6}{6}}$$
Beweis:
$$z_{n+1} = \underbrace{1^2 + 2^2 + 3^2 + \dots + n^2}_{z_n} + (n+1)^2$$
$$z_{n+1} = \frac{n(n+1)(2n+1)}{6} + (n+1)^2$$
$$z_{n+1} = \frac{n(n+1)(2n+1)}{6} + \frac{6(n+1)^2}{6}$$$$z_{n+1} = \underline{\frac{2n^3 + 9n^2 + 13n + 6}{6}}$$
__4. Induktionsschlussfolgerung__
Passt

# 6. Binomische Formeln

__1. Binomische Formel__ $(a + b)^2 = a^2 + 2ab + b^2$
__2. Binomische Formel__ $(a - b)^2 = a^2 - 2ab + b^2$
__3. Binomische Formel__ $(a-b)(a+b) = a^2 - b^2$

>$$(a+b)^n = \sum_{k=0}^{n} \binom{n}{k} a^{n-k} b^k \quad \text{ mit } \binom{n}{k} = \frac{n!}{k!(n-k)!}$$

```
Zeile 0:            1
Zeile 1:          1   1
Zeile 2:        1   2   1
Zeile 3:      1   3   3   1
Zeile 4:    1   4   6   4   1  
Zeile 5:  1   5   10  10  5   1
```

- Für $n=0$: $(a+b)^0 = 1$
- Für $n=1$: $(a+b)^1 = a + b$
- Für $n=2$: $(a+b)^2 = a^2 + 2ab + b^2$
- Für $n=3$: $(a+b)^3 = a^3 + 3a^2b + 3ab^2 + b^3$
- Für $n=4$: $(a+b)^4 = a^4 + 4a^3b + 6a^2b^2 + 4ab^3 + b^4$
- Für $n=5$: $(a+b)^5 = a^5 + 5a^4b + 10a^3b^2 + 10a^2b^3 + 5ab^4 + b^5$

# Dreiecksungleichung

>$|a+b| \le |a| + |b|$

# Zahlenfolgen und Grenzwerte

Obere Schranke: $\exists \ k: a_n \le k \ \forall \ n \in \mathbb{N}$
Untere Schranke: $\exists \ k: a_n \ge k \ \forall \ n \in \mathbb{N}$

Eine Folge konvergiert gegen einen Grenzwert, wenn gilt
$$\forall \ \epsilon > 0  \ \exists \ n_0 : |a_n - a| < \epsilon \ \forall \ n \in \mathbb{N}$$
Für alle $\epsilon > 0$ existiert ein bestimmtes $n_0$ ab welchem alle Folgeglieder $a_{n, \ n > n_0}$ einen kleineren Abstand zum Grenzwert haben als der durch $\epsilon$ vorgegebene Abstand.

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

# Rechenregeln für Grenzwerte

$$\lim_{n \to \infty} a_n= a, \lim_{n \to \infty} b_n= b$$
$$1. \lim_{n \to \infty} (a_n + b_n) = \lim_{n \to \infty} (a_n) + \lim_{n \to \infty} (b_n)$$
$$2. \lim_{n \to \infty} (a_n \cdot b_n) = (\lim_{n \to \infty} (a_n)) \cdot (\lim_{n \to \infty} (b_n))$$
$$3. \lim_{n \to \infty} (\frac{a_n}{b_n}) = \frac{\lim_{n \to \infty} (a_n)}{\lim_{n \to \infty} (b_n)} \quad \text{ für } b_n \neq 0 \forall n \in \mathbb{N}, b \neq 0$$

# Satz der Intervallschachtelung

Es sei $[a_n, b_n] n \in \mathbb{N}$ eine Folge mit ineinander geschachtelten, abgeschlossenen Intervallen.

Das bedeutet, dass die Intervalle mit wachsendem Index nicht größer werden, sondern im vorherigen enthalten sind:
$$[a_{n+1}, b_{n+1}] \subseteq [a_n, b_n] \quad , \quad [a_{n+2}, b_{n+2}] \subseteq [a_{n+1}, b_{n+1}] \quad ,\quad [a_{n+2}, b_{n+2}] \subseteq [a_n, b_n]$$
Das größte $a$ ist immer noch kleiner als jedes $b$
$$a \le b_n \ \forall \ n \in \mathbb{N}$$

__Schwacher Teil:__ Die Schnittmenge der Intervalle ist nicht leer:
$$\bigcap_{n=1}^\infty [a_n, b_n] \neq \emptyset = \{ x \in \mathbb{R} \mid \forall n \in \mathbb{N}: a_n \le x \le b_n \}$$
dabei gilt: $a_n \le b_n \ \forall \ n \in \mathbb{N}$
$$\Rightarrow a_1 \le a_2 \le a_3 \dots \Rightarrow a_n \text{ monoton steigend }$$
$$\Rightarrow b_1 \ge b_2 \ge b_3 \dots \Rightarrow b_n \text{ monoton fallend }$$

>Jede monoton steigende, nach oben beschränkte Folge ist konvergent.
>Jede monoton fallende, nach unten beschränkte Folge ist konvergent.

__Starker Teil:__ Die Breite der Intervalle konvergiert gegen 0:
$$\lim_{n \to \infty} (b_n - a_n) = 0$$
# Teilfolgen

$a_n = (a_1, a_2, a_3, \dots)$
Die Teilfolge $(a_{n_k})$ soll nur jedes zweite Element der Ursprungsfolge enthalten.
$(a_{n_k}) = (a_2, a_4, a_6, \dots)$
$(n_k) = (2, 4, 6, 8, \dots)$
$n_k = 2k$

# Bolzano-Weierstraß

>Jede beschränkte Folge reeller Zahlen besitzt wenigstens eine konvergente Teilfolge.

$a_n = \sin{(n \frac{\pi}{2})} = (0, 1, 0, -1, 0, 1, 0, -1, \dots)$
$\lim_{k \to \infty} (a_{4k+1}) = 1$
$\lim_{k \to \infty} (a_{4k+3}) = -1$

# Cauchy

>Jede Cauchy-Folge ist in den reellen Zahlen konvergent
$$\forall \epsilon > 0 \exists n_0, \forall m, n \ge n_0: |a_m - a_n| < \epsilon$$

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

# Das Monotonie-Kriterium (monotone Konvergenz)

>__Satz:__ Eine Folge konvergiert, wenn...
>1) sie monoton wachsend und nach oben beschränkt ist.
>2) wenn sie monoton fallend und nach unten beschränkt ist.

# Sandwich-Kriterium

$$\lim_{n \to \infty} a_n = \lim_{n \to \infty} c_n = L$$
für
$$a_n \le b_n \le c_n \forall n \ge n_0$$
gilt:
$$\lim_{n \to \infty} b_n = L$$__Beispiel 2__
$$b_n = \sqrt{n +1} -\sqrt{n}$$
$$\lim_{n \to \infty} b_n = 0$$
$$a_n = \sqrt{n +1} -\sqrt{n} - \frac{1}{n}$$
$$\lim_{n \to \infty} a_n = 0$$
$$c_n = \sqrt{n +1} -\sqrt{n} + \frac{1}{n}$$
$$\lim_{n \to \infty} c_n = 0$$
$$\Rightarrow a_n < b_n < c_n$$

# Reihen

## Gaußsche Summenformel

$$\sum_{k+1}^{n} k = 1 + 2 + \dots + n = \frac{n(n+1)}{2}$$

## Konvergenz

$$\sum_{k=0}^{\infty} a_k$$
Für die Konvergenz der Reihe ist es notwendig, dass $a_k$ eine Nullfolge ist (mit Grenzwert $0$).

**Wichtig:** Diese Bedingung ist notwendig, aber **nicht hinreichend**!
- Wenn $\sum a_k$ konvergiert, dann muss $a_k \to 0$ gelten
- Aber aus $a_k \to 0$ folgt **nicht**, dass $\sum a_k$ konvergiert

Die Terme müssen **schnell genug** gegen Null gehen: exponent

## Leibnitz Kriterium

__Beispiel:__
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

## Majorantenkriterium

>Wenn die Majorante $S_b$ konvergiert, dann konvergiert auch die kleinere Reihe $S_a$.
>Der Grenzwert von $S_a$ kann höchstens so groß wie der von $S_b$ sein.


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
$$b_k = \frac{1}{k^2} \ge 0 \quad \forall k \in \mathbb{N}$$
3 ) Konvergenz der Majorante
$$\sum_{k=1}^{\infty} \frac{1}{k^2} \quad \text{konvergiert}$$
$\Rightarrow$ nach dem Majorantenkriterium konvergiert $\sum_{k=1}^{\infty} \frac{\sin{k}}{k^2}$ ebenfalls

## Minorantenkriterium

>Wenn die Minorante $S_b$ gegen $\infty$ divergiert, dann divergiert die größere Reihe $S_a$ (erst Recht).

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

# Funktionen


$$(\frac{(n+1)((n+1)+1)}{2})^2$$
$$(\frac{n(n+1)}{2})^2 + (n+1)^3$$