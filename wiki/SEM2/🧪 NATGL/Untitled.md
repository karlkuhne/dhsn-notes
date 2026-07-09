Sehr gute Frage — genau da lohnt sich das genauer hinschauen, weil sich in 7 Klausuren fast identische Subpatterns wiederholen. Ich hab jetzt alle Aufgabenstellungen der Rechen-Familien nochmal im Detail verglichen. Hier die Musterkarte mit **Erkennungsmerkmal → Formelkette**, sortiert nach Häufigkeit (wie oft von 7 Klausuren dieses genaue Muster vorkam):

## Familie A: Rotation/Trägheitsmoment (Aufgabe 2, in 7/7 Klausuren!)

**A1 — Reine Rotationskinematik-Umrechnung** (DVD, Töpferscheibe — 2×) _Erkennungsmerkmal:_ Drehzahl in U/min gegeben, "aus dem Stillstand in t Sekunden beschleunigt". $$\omega=2\pi n \quad\to\quad v=\omega r \quad\to\quad \alpha_W=\frac{\omega}{t} \quad\to\quad \varphi=\tfrac12\alpha_W t^2 \quad\to\quad N=\frac{\varphi}{2\pi}$$ Kette geht immer in dieser Reihenfolge: Drehzahl → ω → v (Randgeschwindigkeit) → α (aus ω und t) → Winkel φ → Anzahl Umdrehungen N.

**A2 — Rollender Körper (schiefe Ebene / Looping)** (3×) _Erkennungsmerkmal:_ "rollt reibungsfrei herunter", Vergleich Voll-/Hohlzylinder, oder "darf nicht herunterfallen" (Looping). $$v=\sqrt{\dfrac{2gh}{1+J/(mr^2)}}$$ Der Bruch $J/(mr^2)$ ist die Formkonstante: Vollzylinder $=\tfrac12$, Hohlzylinder $=1$, Kugel $=\tfrac25$ → **je "hohler", desto langsamer unten** (mehr Energie steckt in der Rotation statt in der Translation). Bei Looping kommt eine zweite Bedingung dazu: am höchsten Punkt muss $mg \geq \frac{mv^2}{r}$ gelten (Mindestgeschwindigkeit) — das gibst du in die Energiegleichung ein, um die Mindesthöhe h zu finden.

**A3 — Zusammengesetztes Trägheitsmoment** (Jo-Jo, LED-Rotor — 2×) _Erkennungsmerkmal:_ Körper besteht aus mehreren Teilen (Scheiben+Achse, oder Massepunkte auf einem Stab).

- Trägheitsmomente **addieren sich einfach**, wenn alle Teile um dieselbe Achse rotieren: $J_{ges}=\sum J_i$.
- Standard-Bausteine zum Auswendiglernen: Vollzylinder/Scheibe $\tfrac12mr^2$, Hohlzylinder/Ring $mr^2$, Kugel $\tfrac25mr^2$, dünner Stab um Mittelpunkt $\tfrac{1}{12}ml^2$, Punktmasse im Abstand r $mr^2$.
- Wenn danach noch eine Bewegung reinspielt (abrollende Schnur): Energieerhaltung mit **beiden** Termen: $mgh=\tfrac12mv^2+\tfrac12J\omega^2$, dazu die Zwangsbedingung $v=\omega r$.

**A4 — Kreisbewegung als Punktmasse, Seil/Faden reißt** (Jo-Jo als Massepunkt — 1×, aber wichtiges Prinzip) _Erkennungsmerkmal:_ "im Kreis geschleudert", "bei welcher Kraft reißt die Schnur". Am **untersten** Punkt der Kreisbahn ist die Fadenspannung am größten: $F_{Faden}=\frac{mv^2}{r}+mg$ (Zentripetalkraft UND Gewichtskraft ziehen in dieselbe Richtung, der Faden muss beides tragen). Am **obersten** Punkt: $F_{Faden}=\frac{mv^2}{r}-mg$. Wenn nach "wo reißt es zuerst" gefragt ist → immer der unterste Punkt.

**A5 — Leistungsbedarf zum Beschleunigen** (Töpferscheibe, LED-Rotor — 2×) _Erkennungsmerkmal:_ "Leitung/Motor mit X Watt, reicht das um in t Sekunden zu beschleunigen?" $$P=\frac{dE_{Rot}}{dt} = J\cdot\omega\cdot\alpha_W \quad\text{oder als Näherung:}\quad \bar P=\frac{\Delta E_{Rot}}{\Delta t}=\frac{\frac12 J\omega^2}{t}$$ Einfach: Rotationsenergie am Ende berechnen, durch die Zeit teilen, mit der verfügbaren Leistung vergleichen (reicht/reicht nicht).

**A6 — Drehimpulserhaltung** (1×, aber sauberes eigenständiges Prinzip) _Erkennungsmerkmal:_ "Trägheitsmoment ändert sich" (Eiskunstläufer-Effekt), keine äußeren Drehmomente. $$L=J\omega=\text{const.} \quad\Rightarrow\quad J_1\omega_1=J_2\omega_2$$ Wenn J um 25% sinkt → ω steigt automatisch um den Kehrwert-Faktor.

## Familie B: Optik (Aufgabe 3/4)

**B1 — Diaprojektor/dünne Linse Bildgröße** (3× fast wortgleich!) _Erkennungsmerkmal:_ "Dia der Größe G wird mit Brennweite f auf eine b Meter entfernte Wand projiziert." Das ist die mit Abstand zuverlässigste Aufgabe im ganzen Datensatz. Merk dir direkt die kombinierte Formel (spart einen Schritt): $$B = G\cdot\frac{b-f}{f}$$ (Herleitung falls du sie brauchst: $g=\frac{bf}{b-f}$ aus der Linsengleichung, dann $B=G\cdot\frac{b}{g}$ einsetzen.) b ist praktisch immer die Wandentfernung (in Metern, f meist in mm — **Einheiten angleichen, das ist die häufigste Fehlerquelle hier**).

**B2 — reelles vs. virtuelles Bild erklären/skizzieren** (3×) — schon in der letzten Nachricht, aber hier nochmal der Trigger: kommt praktisch **immer zusammen mit** B1 in derselben Teilaufgabe.

**B3 — Totalreflexion/Grenzwinkel** (1-2×) _Erkennungsmerkmal:_ "kein Licht tritt aus", "maximaler Öffnungswinkel", mehrere Brechzahlen $n_1,n_2$ gegeben. $$\sin\alpha_{grenz}=\frac{n_{d\ddot u nn}}{n_{dick}}$$ Wichtiger Trick, der in einer Klausur explizit verlangt wurde: bei **drei Schichten** (z.B. Wasser→Glas→Luft) kürzt sich die mittlere Brechzahl (Glas) beim Grenzwinkel zur Totalreflexion an der äußersten Grenzfläche komplett raus — nur die äußersten beiden Medien zählen. Wenn bei dir eine Größe wegkürzt: das ist kein Fehler, das ist die Pointe der Aufgabe.

**B4 — Brechungsgeometrie/Schattenlänge** (1×) _Erkennungsmerkmal:_ Lichtstrahl trifft schräg auf Wasseroberfläche, nach Schattenlänge am Grund gefragt. Reines Snellius ($n_1\sin\alpha=n_2\sin\beta$) + Trigonometrie (tan für die Streckenanteile), keine neue Formel — nur sorgfältig zeichnen/Strecken zusammensetzen.

## Familie C: Elektrotechnik (Aufgabe 4/5)

**C1 — Drahtwiderstand/-länge** ($R=\rho l/A$) (4× — die zuverlässigste E-Technik-Aufgabe überhaupt!) _Erkennungsmerkmal:_ "Draht mit Durchmesser d aus Material X, welcher Widerstand/welche Länge". $$R=\rho\frac{l}{A}, \quad A=\pi\left(\frac{d}{2}\right)^2$$ Fallstrick: $\rho$ oft in $\Omega\text{mm}^2/\text{m}$ gegeben — dann Durchmesser in **mm** und Länge in **m** einsetzen, nicht auf SI umrechnen, sonst verrechnest du dich um Zehnerpotenzen.

**C2 — Vorwiderstand für Glühlampe** (2×) _Erkennungsmerkmal:_ "Lampe mit U_Lampe/P_Lampe soll an höhere Spannung U_Quelle angeschlossen werden." $$I_{Lampe}=\frac{P_{Lampe}}{U_{Lampe}} \quad\to\quad R_{vor}=\frac{U_{Quelle}-U_{Lampe}}{I_{Lampe}}$$ (Reihenschaltung: gleicher Strom fließt durch Lampe und Vorwiderstand, die Spannungsdifferenz muss der Vorwiderstand "aufbrauchen".)

**C3 — Widerstandsnetzwerk "eine Reihe + Parallelblock"** (3×) _Erkennungsmerkmal:_ Skizze zeigt R1 in Reihe, danach 2-3 Widerstände parallel zueinander. $$R_{ges}=R_1+\left(\frac1{R_2}+\frac1{R_3}(+\frac1{R_4})\right)^{-1}$$ Wenn nach den **Strömen durch die einzelnen Zweige** gefragt ist: erst Gesamtstrom über $I=U/R_{ges}$, dann Spannung am Parallelblock $U_{par}=I\cdot R_{par}$, dann pro Zweig $I_i=U_{par}/R_i$ (Stromteiler — an allen parallelen Widerständen liegt dieselbe Spannung).

**C4 — Impedanz/Wechselstrom (Real-/Imaginärteil, Grenzwerte, Resonanz)** (5× — DAS ist das am häufigsten wiederkehrende E-Technik-Thema überhaupt!) _Erkennungsmerkmal:_ R, L, C in einer Schaltung, Kreisfrequenz ω gegeben, gefragt nach Real-/Imaginärteil, Betrag/Phase, Grenzwertbetrachtung oder Resonanzfrequenz. Baustein-Impedanzen: $Z_R=R$ (rein reell), $Z_L=j\omega L$ (rein imaginär, wächst mit ω), $Z_C=\frac{1}{j\omega C}=-\frac{j}{\omega C}$ (rein imaginär, fällt mit ω). Reihe → addieren, Parallel → Kehrwerte addieren (wie bei Widerständen, nur komplex). **Grenzwert-Trick ohne Rechnung:** für $\omega\to0$ wirkt eine Spule wie ein Kurzschluss (0Ω) und ein Kondensator wie eine Unterbrechung (∞Ω); für $\omega\to\infty$ ist es genau umgekehrt. Damit kannst du die Grenzwertbetrachtung fast ohne Formel beantworten. Resonanzfrequenz bei Reihenschwingkreis (R-L-C in Reihe): $\omega_0=\frac1{\sqrt{LC}}$ (bei Resonanz heben sich $Z_L$ und $Z_C$ exakt auf, nur R bleibt übrig).

**C5 — RC-Auf-/Entladung: DGL aufstellen** (2×) _Erkennungsmerkmal:_ "Stellen Sie eine Differentialgleichung auf" für Q(t) an einem Kondensator. Entladen: $\frac{dQ}{dt}=-\frac{Q}{RC}$, Lösung $Q(t)=Q_0e^{-t/RC}$ (Nachweis: einfach ableiten und einsetzen, stimmt immer exakt). Aufladen: $\frac{dQ}{dt}=\frac{U}{R}-\frac{Q}{RC}$, Lösung $Q(t)=CU(1-e^{-t/RC})$. Bei $t=RC$ (Zeitkonstante τ): Entladung auf 37%, Aufladung auf 63%.

## Fazit — worauf du deine Zeit heute Abend konzentrieren solltest

Wenn du nur 3 Dinge aus dieser Liste tief verinnerlichst: **C4 (Impedanz-Grundbausteine + Grenzwert-Trick)**, **B1 (Diaprojektor-Formel $B=G(b-f)/f$)** und **C1/C3 (Draht-R + Netzwerk-Formel)** — die decken zusammen über die Hälfte aller Elektro/Optik-Rechenaufgaben in den 7 Klausuren ab. Bei Familie A (Rotation) reicht es, die 5 Standard-Trägheitsmomente auswendig zu haben und zu wissen, dass Energieerhaltung + ggf. Zwangsbedingung $v=\omega r$ fast immer der Weg ist.

Soll ich dich jetzt anhand von leicht abgewandelten Zahlenwerten zu einem dieser Muster durchrechnen lassen (ich geb dir die Werte, du rechnest, ich check gegen)?



