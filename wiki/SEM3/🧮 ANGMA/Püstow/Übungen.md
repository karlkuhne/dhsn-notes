**09.11.25**

a)

| $k$ | 0 | 1 | 2 | 3 |
|---|---|---|---|---|
| $p_k$ | 0,1 | 0,3 | 0,4 | 0,2 |

$$E(X) = 0 \cdot 0{,}1 + 1 \cdot 0{,}3 + 2 \cdot 0{,}4 + 3 \cdot 0{,}2 = 0 + 0{,}3 + 0{,}8 + 0{,}6 = 1{,}7$$

$$\mathrm{Var}(X) = (0-1{,}7)^2 \cdot 0{,}1 + (1-1{,}7)^2 \cdot 0{,}3 + (2-1{,}7)^2 \cdot 0{,}4 + (3-1{,}7)^2 \cdot 0{,}2$$
$$= 0{,}289 + 0{,}147 + 0{,}036 + 0{,}338 = 0{,}81$$

b)

$$P(X = x_k) = \begin{cases} \frac{1}{8}, & x_k \in \{-2, 2\} \\ \frac{1}{4}, & x_k \in \{-1, 0, 1\} \\ 0, & \text{sonst} \end{cases}$$

| $k$ | -2 | -1 | 0 | 1 | 2 |
|---|---|---|---|---|---|
| $p_k$ | $\frac{1}{8}$ | $\frac{1}{4}$ | $\frac{1}{4}$ | $\frac{1}{4}$ | $\frac{1}{8}$ |

$$E(X) = -2 \cdot \tfrac{1}{8} + (-1) \cdot \tfrac{1}{4} + 0 \cdot \tfrac{1}{4} + 1 \cdot \tfrac{1}{4} + 2 \cdot \tfrac{1}{8} = -\tfrac{1}{4} - \tfrac{1}{4} + 0 + \tfrac{1}{4} + \tfrac{1}{4} = 0$$

$$\mathrm{Var}(X) = (-2-0)^2 \cdot \tfrac{1}{8} + (-1-0)^2 \cdot \tfrac{1}{4} + (0-0)^2 \cdot \tfrac{1}{4} + (1-0)^2 \cdot \tfrac{1}{4} + (2-0)^2 \cdot \tfrac{1}{8}$$
$$= \tfrac{1}{2} + \tfrac{1}{4} + 0 + \tfrac{1}{4} + \tfrac{1}{2} = 1{,}5$$

c)

$X$ sei diskret gleichverteilt auf $\{1, \dots, n\}$.

$$P(X = x_k) = \frac{1}{n}$$

$$E(X) = \sum_{k=1}^{n} k \cdot \frac{1}{n} = \frac{1}{n} \sum_{k=1}^{n} k = \frac{1}{n} \cdot n = 1$$

$$\mathrm{Var}(X) = \sum_{k=1}^{n} (k-1)^2 \cdot \frac{1}{n} = \frac{1}{n} \sum_{k=1}^{n} (k-1)^2$$

$$\mathrm{Var}(X) = E(X^2) - E(X)^2$$

$$E(X^2) = \sum_{k=1}^{n} k^2 \cdot \frac{1}{n} = \frac{1}{n} \sum_{k=1}^{n} k^2 = \frac{1}{n} \cdot \frac{n(n+1)(2n+1)}{6} = \frac{(n+1)(2n+1)}{6}$$

$$\Rightarrow \mathrm{Var}(X) = \frac{(n+1)(2n+1)}{6} - 1$$

> [!warning] Fehler in der Tafelrechnung
> Die Rechnung oben ist so von der Tafel übernommen, aber $E(X) = 1$ und damit auch die Varianz sind falsch. Der Fehler steckt im Schritt $\sum_{k=1}^{n} k = n$. Richtig ist $\sum_{k=1}^{n} k = \frac{n(n+1)}{2}$. Die Summe $\sum_{k=1}^{n} 1$ wäre $n$.
>
> Richtig ist:
> $$E(X) = \frac{1}{n} \cdot \frac{n(n+1)}{2} = \frac{n+1}{2}$$
> $$\mathrm{Var}(X) = \frac{(n+1)(2n+1)}{6} - \frac{(n+1)^2}{4} = \frac{n^2 - 1}{12}$$
>
> Probe mit $n = 2$, also $X \in \{1, 2\}$ mit je $\frac{1}{2}$: Es gilt $E(X) = 1{,}5$ und $\mathrm{Var}(X) = \frac{(1-1{,}5)^2 + (2-1{,}5)^2}{2} = 0{,}25$. Die Tafelwerte wären $1$ und $1{,}5$.
