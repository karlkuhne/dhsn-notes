# 11.11.25

a) $\frac{1}{2} + \frac{1}{3} = \frac{5}{6}$
b) $\frac{x}{y} + \frac{a}{b} = \frac{xb + ya}{yb}$
c) $\frac{1}{a} \cdot \frac{1}{a^2} \cdot a^3 + \frac{a}{b} = \frac{a}{b} + 1$
d)$\frac{1}{1 + \frac{1}{1 - \frac{1}{1+x}}}= \frac{x}{1+2x}$
e) $\frac{a}{b} - \frac{b}{a} = \frac{a^2 - b^2}{ab}$

# 24.11.25

a)
$(A \cup B) \cap (A \cup \overline{B})$
$= (A \cap A) \cup (A \cap \overline{B}) \cup (B \cap A) \cup (B \cap \overline{B})$
$= A \cup (A \cap \overline{B}) \cup (B \cap A)$ Absorptionsgesetz
$= A \cup (A \cap B)$
$=A$


b)
$(A \cap B) \cup (A \cap \overline{B})$
$= ((A \cap B) \cup A) \cap ((A \cap B) \cup \overline{B})$
$= A \cap ((A \cap B) \cup \overline{B})$
$= (A \cap (A \cap B) \cup (A \cap \overline{B}))$
$= (A \cap A \cap B) \cup (A \cap \overline{B})$
$= (A \cap B) \cup (A \cap \overline{B})$
$= (A \cup A) \cap (A \cup \overline{B}) \cap (B \cup A) \cap (B \cup \overline{B})$ ab hier
$= A \cap (A \cup \overline{B}) \cup (B \cup A)$
$= A \cup (B \cup A)$
$= A$

c)
$\overline{\overline{A} \cup B}$
$=A \cup \overline{B}$
$= A$

d) Hilfe
$= (A \cup B) \cap (\overline{A} \cup C)$
$= (A \cap \overline{A}) \cup (A \cap C) \cup (B \cap \overline{A}) \cup (B \cap C)$
$= (A \cap C) \cup (B \cap \overline{A}) \cup (B \cap C)$
$= (A \cap C) \cup (B \cap C)$
$= (A \cup B) \cap (A \cup C) \cap (C \cup B) \cap C$
$= (A \cap B \cap C) \cap (A \cap B \cap C)$
$= A \cap B \cap C$


e)
$(A \cup B) \cap (A \cap \overline{A})$
$= (A \cup B) \cap \varnothing$
$= \varnothing$

f)
$\overline{A \cap B} \cup (A \cup B)$
$= (\overline{A} \cup \overline{B}) \cup (A \cup B)$
$= \overline{A} \cup A \cup B \cup \overline{B}$
$= \Omega$

g)
$A \cap ((B \cup C) \cup \overline{B})$
$= A \cap \Omega$
$= A$

h)
$(A \cap B) \cup (A \cap \overline{B}) \cup (\overline{A} \cap B)$
$=(A \cap (A \cup \overline{B}) \cap (B \cup A) \cap \Omega) \cup (\overline{A} \cap B)$
$=(A \cap (B \cup A)) \cup (\overline{A} \cap B)$
$=A \cup (\overline{A} \cap B)$
$= A \cup B$

i)
$(A \cap B) \cap (\overline{A} \cup \overline{B})$
$(A \cap B) \cap \overline{A \cap B}$
$= \varnothing$

j)
$\overline{\overline{(A \cup B)} \cup C}$
$=(A \cup B) \cap \overline{C}$

k) hilfe
$(A \cap (B \cup C)) \cup (\overline{A} \cap B \cap C)$
$=((A \cap B) \cup (A \cap C)) \cup (\overline{A} \cap B \cap C)$
$=(A \cap (A \cup C) \cap (B \cup A) \cap (B \cup C)) \cup (\overline{A} \cap B \cap C)$
$=(A \cap B \cap C) \cup (\overline{A} \cap B \cap C)$


# 8.12.25

a) Absorptionsgesetz
$$(A \cap B) \cup B = B$$

b) Distributivgesetz
$$(A \cup B) \cap (A \cup \overline{B}) = ((A \cup B) \cap A) \cup ((A \cup B) \cap \overline{B})$$
$$= A \cup ((A \cup B) \cap \overline{B}) = (A \cup (A \cup B)) \cap (A \cup \overline{B})$$
$$= (A \cup B) \cap (A \cup \overline{B}) = A \cup (B \cap \overline{B}) = A$$

c)
$$(A \cap B) \cup (\overline{A} \cap B) = B$$

d)
$$\overline{A \cup B} = \overline{A} \cap \overline{B}$$

e)
$$\overline{\overline{A} \cap \overline{B}} = A \cup B$$

f) Merken! (rückwärts)
$$(A \cap B) \cup (A \cap \overline{B}) = A \cap (B \cup \overline{B}) = A$$


g)
$$(\overline{A} \cup B) \cap (\overline{A} \cup \overline{B}) = \overline{A}$$

h)
$$(A \cup \overline{B}) \cap B = (B \cap A) \cup (B \cap \overline{B}) = B \cap A$$

i)
$$(A \cup (B \cap C)) \cap (\overline{A} \cup B)$$
$$= B \cap (A \cup C)$$

k)
$$\overline{((A \cup B) \cap \overline{C}) \cup ((A \cap B) \cup \overline{C})}$$
$$\overline{((A \cup B) \cap \overline{C}) \cup \overline{C} \cup (A \cap B)}$$
$$= \overline{\overline{C} \cup (A \cap B)}$$
$$= C \cap \overline{A \cup B}$$


# 10.12.25

m)

$$\overline{\overline{(A \cap B) \cup \overline{C}} \cap \overline{\overline{D} \cup \overline{C}} \cap \overline{D}}$$
$$= \overline{(\overline{A \cap B}) \cap C \cap D \cap C \cap \overline{D}}$$
$$= \overline{(\overline{A \cap B}) \cap C \cap \varnothing}$$
$$= \overline{\varnothing} = \Omega$$


n)
$$\overline{A \cup (B \cap C) \cup (B \cap C)} \cup \overline{C}$$
$$= \overline{A} \cap (\overline{B} \cup \overline{C}) \cap (\overline{B} \cup \overline{C}) \cup \overline{C}$$
$$= (\overline{A} \cap (\overline{B} \cup \overline{C}) ) \cup \overline{C}$$
$$(\overline{A} \cap \overline{B}) \cup (\overline{A} \cap \overline{C}) \cup \overline{C}$$
$$(\overline{A} \cap \overline{B}) \cup \overline{C}$$



o)
$$\overline{(A \cap (B \cup C)) \cup \overline{(A \cup B) \cap C}}$$
p)
$$\overline{\overline{(A \cap B) \cup B} \cup \overline{(C \cap D) \cup \overline{D}}} \cup (B \cap ((C \cap D) \cup \overline{D}))$$


# 11.12.25

d)
$$\frac{n^2 + n}{2n} = \frac{n(n+1)}{2n} = \frac{n+1}{2} \text{ für } n \neq 0$$
$$\lim_{n \to \infty} \frac{n+1}{2} = \infty$$
>Es gibt keinen Grenzwert



e)
$$a_n = \frac{n^2 + 2n + 1}{(n^2 - 1)^2}$$
Zuerst vereinfachen wir den Ausdruck.

Der Zähler ist ein Binom:
$$n^2 + 2n + 1 = (n+1)^2$$

Der Nenner kann ebenfalls faktorisiert werden:
$$(n^2 - 1)^2 = ((n-1)(n+1))^2 = (n-1)^2 (n+1)^2$$

Setzen wir dies wieder in $a_n$ ein:
$$a_n = \frac{(n+1)^2}{(n-1)^2 (n+1)^2}$$
Für $n \neq -1$ (und $n \neq 1$) können wir $(n+1)^2$ kürzen:
$$a_n = \frac{1}{(n-1)^2} \quad \text{für } n \neq 1, n \neq -1$$

Nun bestimmen wir den Grenzwert für $n \to \infty$:
$$\lim_{n \to \infty} a_n = \lim_{n \to \infty} \frac{1}{(n-1)^2} = 0$$

Um dies mit der $\epsilon$-Definition zu beweisen, müssen wir zeigen:
Für jedes $\epsilon > 0$ existiert ein $N \in \mathbb{N}$, sodass für alle $n > N$ gilt:
$$|a_n - 0| < \epsilon$$
$$|\frac{1}{(n-1)^2}| < \epsilon$$
Da $(n-1)^2$ für $n > 1$ immer positiv ist, können wir die Betragsstriche weglassen:
$$\frac{1}{(n-1)^2} < \epsilon$$
Forme die Ungleichung nach $n$ um:
$$1 < \epsilon (n-1)^2$$
$$\frac{1}{\epsilon} < (n-1)^2$$
$$\sqrt{\frac{1}{\epsilon}} < |n-1|$$
Da wir $n \to \infty$ betrachten, können wir annehmen, dass $n > 1$, sodass $n-1 > 0$ und somit $|n-1| = n-1$ gilt:
$$\sqrt{\frac{1}{\epsilon}} < n-1$$
$$1 + \sqrt{\frac{1}{\epsilon}} < n$$
Wir wählen $N = \lceil 1 + \sqrt{\frac{1}{\epsilon}} \rceil$.
Für alle $n > N$ ist die Bedingung $|a_n - 0| < \epsilon$ erfüllt, was beweist, dass der Grenzwert 0 ist.


h)
$$a_n = \frac{n^3 + n^2 + n}{n^4}$$
$$= \frac{n(n^2 + n + 1)}{n^4}$$
$$= \frac{n^2 + n + 1}{n^3}$$
$$\lim_{n \to \infty} a_n = 0$$
$$| \frac{n^2 + n + 1}{n^3} | < \epsilon$$


i)
$$a_n = \frac{n^4 + n^3 + n^2 + n}{\sqrt{1 - n^2}}$$
$$\lim_{n \to \infty} a_n= \infty$$
j)
$$\frac{1}{\sqrt{n}+\frac{1}{\sqrt{n}+\sqrt{n}}}-\sqrt[3]{n}$$
$$\lim_{n \to \infty} a_n= -\infty$$

k)
$$\frac{e^n}{\ln(n)}$$
$$\lim_{n \to \infty} a_n= \infty$$

l)
$$\frac{\ln(n)}{e^n}$$
$$\lim_{n \to \infty} a_n= 0$$
$$|\frac{\ln(n)}{e^n}| < \epsilon$$
Bei einer Folge gilt $n > 1$
$$\frac{\ln(n)}{e^n} < \epsilon$$

m)
$$\frac{5n}{3an^2} \text{ mit } a \in \mathbb{R}, a > 0$$
$/n$
$$= \frac{5}{3an}$$
$$\lim_{n \to \infty} a_n= 0$$
$$|\frac{5}{3an}| < \epsilon$$
$$= \frac{5}{3an} < \epsilon$$
$\cdot n, / \epsilon$
$$= \frac{5}{3a \epsilon} < n_0$$

n)
$$e^{-2n^2}$$
$$\lim_{n \to \infty} a_n= 0$$
$$|e^{-2n^2}| < \epsilon$$
$$e^{-2n^2} < \epsilon$$
$\ln$
$$-2n^2 < \ln( \epsilon)$$
$/(-2)$ Das Relationszeichen dreht sich um, wenn man mit negativen Zahlen dividiert/multipliziert
$$n^2 > -\frac{1}{2} \ln (\epsilon)$$
$\sqrt{}$


# 15.12.25

Erstellen Sie eine Indexfolge $(n_k)$ so, dass die Teilfolge $(a_{n_k})$ konvergiert und bestimmen Sie den Grenzwert der Teilfolge.

$$a_n = (-1)^n$$
$$a_n = -1, 1, -1, 1, \dots $$
$$n_k = 2k - 1$$
$$a_{n_k} =-1, -1, -1, \dots $$
$$\lim_{n \to \infty} a_{n_k}= -1$$

Eigentlich nicht nötig, weil konvergiert schon
$$a_n = \frac{(-1)^n}{n}$$
$$n_k = 2k - 1$$
$$\lim_{n \to \infty} a_{n_k}= 0$$


$$a_n = n$$
$$a_n = (1, 2, 3, \dots)$$
$$n_k = k^2$$
$$n_k = (1, 4, 9, 16, \dots)$$
$$\lim_{n \to \infty} a_{n_k}= \infty$$

# 17.12.25

a)
$$a_n = \sqrt{n^2 + 3n} -n$$
$$\lim_{n \to \infty} a_n= \infty$$

b)
$$a_n = \frac{3n^2 - 5n + 7}{-6n^2 + n - 1}$$
Um den Term zu kürzen, dividieren wir Zähler und Nenner durch $n^2$:
$$a_n = \frac{\frac{3n^2}{n^2} - \frac{5n}{n^2} + \frac{7}{n^2}}{\frac{-6n^2}{n^2} + \frac{n}{n^2} - \frac{1}{n^2}} = \frac{3 - \frac{5}{n} + \frac{7}{n^2}}{-6 + \frac{1}{n} - \frac{1}{n^2}}$$
$$\lim_{n \to \infty} a_n= \lim_{n \to \infty} \frac{3 - \frac{5}{n} + \frac{7}{n^2}}{-6 + \frac{1}{n} - \frac{1}{n^2}} = \frac{3 - 0 + 0}{-6 + 0 - 0} = -\frac{3}{6} = -\frac{1}{2}$$

c)
$$a_n = n(\sqrt{1+\frac{4}{n}} -1)$$
$$\lim_{n \to \infty} a_n= $$

# 6.1.26

a)
$$a_n = 3 + \frac{1}{n}$$
$$\lim_{n \to \infty} a_n= 3$$
$$|3 + \frac{1}{n} - 3| < \epsilon$$
$$|\frac{1}{n}| < \epsilon$$
Weil n nicht negativ sein kann
$$\frac{1}{n} < \epsilon$$
$$n_0 > \frac{1}{\epsilon}$$

b)
$$a_n = \frac{n^2}{n^2 + 5}$$
$$\lim_{n \to \infty} a_n= 1$$
$$|\frac{n^2}{n^2 + 5} - 1|< \epsilon$$
Auf gemeinsamen Nenner bringen
$$|\frac{n^2 - (n^2 + 5)}{n^2 + 5}| < \epsilon$$
$$|\frac{-5}{n^2 + 5}| < \epsilon$$
Betragsstriche entfernen
$$\frac{5}{n^2 + 5} < \epsilon$$
$$5 < \epsilon(n^2 + 5)$$
$$\frac{5}{\epsilon} - 5< n^2$$
$$\sqrt{\frac{5}{\epsilon} - 5}< n_0$$


c)
$$a_n = \sqrt{n+1} - \sqrt{n}$$
$$\lim_{n \to \infty} a_n= 0$$
$$|\sqrt{n+1} - \sqrt{n}| < \epsilon$$
Weil $\sqrt{n+1} > \sqrt{n}$
$$\sqrt{n+1} - \sqrt{n} < \epsilon$$
$$\sqrt{n+1} < \epsilon + \sqrt{n}$$
$$n+1 < (\epsilon + \sqrt{n})^2$$
$$n+1 < \epsilon^2 + 2\epsilon\sqrt{n} + n$$
$-n$
$$1 < \epsilon^2 + 2\epsilon\sqrt{n}$$
$-\epsilon^2$
$$1 -\epsilon^2< 2\epsilon\sqrt{n}$$
$/2\epsilon$
$$\frac{1 -\epsilon^2}{2\epsilon}< \sqrt{n}$$
$$(\frac{1 -\epsilon^2}{2\epsilon})^2< n_0$$

d)
$$a_n = (\frac{2}{3})^n$$
$$\lim_{n \to \infty} a_n= 0$$
$$|(\frac{2}{3})^n| < \epsilon$$
$$(\frac{2}{3})^n < \epsilon$$
$\log_{\frac{2}{3}}()$
$$n_0 < \log_{\frac{2}{3}}(\epsilon)$$

e)
$$a_n = \frac{n}{n^2 + 1}$$
$$\lim_{n \to \infty} a_n= 0$$
$$|\frac{n}{n^2 + 1}| < \epsilon$$
$$\frac{n}{n^2 + 1} < \epsilon$$
$$n < \epsilon (n^2 + 1)$$
$$n < \epsilon n^2 + \epsilon$$
$-n$
$$0 < \epsilon n^2 - n + \epsilon$$
$/ \epsilon$
$$0 < n^2 - \frac{1}{\epsilon}n + 1$$
$$n_0 = \frac{1}{2\epsilon} \pm \sqrt{\frac{1}{4\epsilon^2} -n}$$

# 7.1.26

a)
$$M = \{ 1, 3, 5, 7 \}$$
$$\inf M = 1$$
$$\sup M = 7$$


b) alles >0 und <1
$$M = ] 0, 1 [$$
$$\inf M = 0$$
$$\sup M = 1$$


c) (5 ist nicht mehr drin aber alles <5)
$$M = [2, 5[$$
$$\inf M = 2$$
$$\sup M = 5$$


d)
$$M = \{ x \in \mathbb{R} \mid x \ge 3 \}$$
$$\inf M = 3$$
$$\sup M = \not$$


e) entspricht $]0, 1]$
$$M = \{ \frac{1}{n} \mid n \in \mathbb{N} \}$$
$$\inf M = 0$$
$$\sup M = 1$$


f) entspricht $]- \sqrt{2}, \sqrt{2}[$
$$M = \{ x \in \mathbb{R} \mid x^2 < 2 \}$$
$$\inf M = - \sqrt{2}$$
$$\sup M = \sqrt{2}$$

<iframe title="Sind die Mengen beschränkt? Supremum? Infimum? Maximum? Minimum? 4 Beispiele Übung Beweis Analysis" src="https://www.youtube.com/embed/jQHR7B99WX0?feature=oembed" height="113" width="200" allowfullscreen="" allow="fullscreen" style="aspect-ratio: 1.76991 / 1; width: 100%; height: 100%;"></iframe>
# 8.1.26

__Beispiel 3__
$$b_n = \frac{\sqrt{n}}{n+1}$$
$$\lim_{n \to \infty} b_n = 0$$
$$a_n = \frac{\sqrt{n}}{n+1} - \frac{1}{n}$$
$$\lim_{n \to \infty} a_n = 0$$
$$a_n = \frac{\sqrt{n}}{n+1} + \frac{1}{n}$$
$$\lim_{n \to \infty} c_n = 0$$
$$\Rightarrow a_n < b_n < c_n$$

__Beispiel 4__
$$b_n = (-1)^n \frac{2n}{3n+1}$$
$$\Rightarrow b_n = (-1)^n \frac{2n}{n(3+\frac{1}{n})} = (-1)^n \frac{2}{3}$$
$$\lim_{n \to \infty} b_n \rightarrow \pm \frac{2}{3}$$
$\Rightarrow$ im klassischen Sinne nicht konvergent

__Beispiel 5__
$$b_n = \frac{\sin{(5n)} +2}{n} \Rightarrow \frac{1}{n} / \frac{3}{n}$$
$$\lim_{n \to \infty} b_n = 0$$
$$1 \le \frac{\sin{(5n)} +2}{n} \le 3$$
$/n$
$$\Rightarrow \underbrace{\frac{1}{n}}_{a_n} \le \frac{\sin{(5n)} +2}{n} \le \underbrace{\frac{3}{n}}_{c_n}$$

__Beispiel 6__
$$b_n = \frac{\sqrt{n+7}}{n}$$
$$\lim_{n \to \infty} b_n = 0$$
$$a_n = \frac{\sqrt{n+7}}{n} - \frac{1}{n}$$
$$\lim_{n \to \infty} a_n = 0$$
$$c_n = \frac{\sqrt{n+7}}{n} + \frac{1}{n}$$
$$\lim_{n \to \infty} c_n = 0$$
$$\Rightarrow a_n < b_n < c_n$$

Überprüfen sie folgende Reihen mit Hilfe des Leibnitz-Kriteriums auf Konvergenz

a)
$$\sum_{k+1}^{\infty} \frac{1}{k^2}(-1)^k$$
alternierend: ja

$\lim_{k \to \infty} \frac{1}{k^2} = 0$

$\frac{1}{k^2} > \frac{1}{(k+1)^2}$
$\frac{(k+1)^2}{k^2} >1$
$\Rightarrow a_n > a_{n+1}$ also monoton fallend

Die Reihe ist also konvergent

b)
$$\sum_{k=1}^{\infty} k(-1)^k$$

alternierend: ja

$\lim_{k \to \infty} k = \infty$
Da der Grenzwert der Folgenglieder nicht 0 ist, ist die Reihe nicht konvergent.

c)
$$\sum_{k=1}^{\infty} \frac{1}{\sqrt{k}}(-1)^{k+1}$$

alternierend: ja

$\lim_{k \to \infty} \frac{1}{\sqrt{k}} = 0$

$\frac{1}{\sqrt{k}} > \frac{1}{\sqrt{k+1}}$
$\Leftrightarrow \sqrt{k+1} > \sqrt{k}$
$\Leftrightarrow k+1 > k$
$\Rightarrow$ $a_k > a_{k+1}$ also monoton fallend

Die Reihe ist also konvergent

d)
$$\sum_{k=1}^{\infty} 3(1+\frac{1}{k})(-1)^{k+1}$$

alternierend: ja

$\lim_{k \to \infty} 3(1+\frac{1}{k}) = 3 \neq 0$
Da der Grenzwert der Folgenglieder nicht 0 ist, ist die Reihe nicht konvergent.

e)
$$\sum_{k=1}^{\infty} \frac{1}{k^2}$$

alternierend: nein
Das Leibniz-Kriterium ist nicht anwendbar, da es sich nicht um eine alternierende Reihe handelt.

f)
$$\sum_{k=1}^{\infty} (-1)^k (-1)^{k+1}$$

Vereinfachen der Terme: $(-1)^k (-1)^{k+1} = (-1)^{2k+1} = -1$.
Die Reihe ist $\sum_{k=1}^{\infty} (-1)$.

alternierend: nein
$\lim_{k \to \infty} |-1| = 1 \neq 0$
Da der Grenzwert der Folgenglieder nicht 0 ist, ist die Reihe nicht konvergent.

g)
$$\sum_{k=1}^{\infty} \frac{1}{\sin(k)} \frac{1}{(-1)^k} = \sum_{k=1}^{\infty} \frac{(-1)^k}{\sin(k)}$$

alternierend: ja

$\lim_{k \to \infty} \frac{1}{\sin(k)}$ existiert nicht, da $\sin(k)$ für ganze Zahlen $k$ nicht konvergiert und Werte nahe Null annehmen kann. Daher ist der Grenzwert der Folgenglieder nicht 0.
Die Reihe ist nicht konvergent.

h)
$$\sum_{k=1}^{\infty} \ln(k)(-1)^{2k}$$

Vereinfachen der Terme: $(-1)^{2k} = 1$.
Die Reihe ist $\sum_{k=1}^{\infty} \ln(k)$.

alternierend: nein

$\lim_{k \to \infty} \ln(k) = \infty \neq 0$
Da der Grenzwert der Folgenglieder nicht 0 ist, ist die Reihe nicht konvergent.

# 9.1.25

Berechnen Sie aus $P_1$ und $P_2$ die Geradengleichung und überprüfen sie, ob $P_3$ auch auf der Geraden liegt
