Karl Kuhne, 29.6.2026, Dresden, Untersuchung Widerstände

__Ausrüstung:__
- Spannungsquelle
- Spannungsmessgerät
- Ohmsche Widerstände
- Kabel

__Skizze:__
![[Versuchsprotokoll-1782715160744.webp|432|449x217]]

__Widerstände:__
- $R_1: 180 \Omega$
- $R_2: 470 \Omega$
- $R_3: 560 \Omega$

__Durchführung:__
(Spannungsquelle auf 15V)
- $I_1: 35 \text{ mA}$
- $I_2: 19 \text{ mA}$
- $I_3: 16 \text{ mA}$
- $U_1: 6.2 \text{ V}$
- $U_2 = U_3: 8.8 \text{ V}$


__Versuchauswertung:__

Widerstände aus Messwerten:
$$R=\frac{U}{I}$$
$$R_1 = \frac{6.2 \text{ V}}{0.035 \text{ A}} = 177 \Omega$$
$$R_2 = \frac{8.8 \text{ V}}{0.019 \text{ A}} = 463 \Omega$$ $$R_2 = \frac{8.8 \text{ V}}{0.012 \text{ A}} = 550 \Omega$$

Abweichungen:
$$\Delta R_1 = 3 \Omega \Rightarrow 1.6 \%$$
$$\Delta R_2 = 7 \Omega \Rightarrow 1.4 \%$$
$$\Delta R_3 = 10 \Omega \Rightarrow 1.7 \%$$


__Theoretische Berechnungen:__

$$U = R \cdot I \quad \quad I = \dfrac{U}{R}$$

Parallelwiderstand $R_{23}$:
$$\frac{1}{R_{23}} = \frac{1}{470} + \frac{1}{560} = 256 \, \Omega$$

Gesamtwiderstand:
$$R_{ges} = R_1 + R_{23} = 180 + 256 = 436 \, \Omega$$

Gesamtstrom:
$$I = \frac{U}{R_{ges}} = \frac{15 \text{ V}}{636 \, \Omega} = 0{,}034 \text{ A}$$

Teilspannungen:
$$U_1 = R_1 \cdot I = 180 \cdot 0{,}034 = 6{,}12 \text{ V}$$
$$U_{23} = 15 \text{ V} - 6{,}12 \text{ V} = 8{,}88 \text{ V}$$

Teilströme:
$$I_2 = \frac{U_{23}}{R_2} = \frac{8{,}88}{470} = 0{,}019 \text{ A}$$
$$I_3 = \frac{U_{23}}{R_3} = \frac{8{,}88}{560} = 0{,}016 \text{ A}$$
