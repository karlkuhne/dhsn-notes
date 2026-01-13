# Collatz-Problem

Schleife über diese Funktion mit beliebigem Startwert x
Funktion(x) := $x/2$ wenn x gerade, $3 \cdot x+1$ wenn x ungerade
Schleife endet, wenn x == 1

```run-c
#include <stdio.h>

int Collatz(int x) {
	if (x % 2 == 0) {
		return x / 2;
	} else {
		return x = 3 * x + 1;
	}
}

int main(void) {
	int x = 0;
	
	do {
        printf("Bitte natürliche Zahl größer 1 eingeben: ");
        if (scanf("%d", &x) != 1) { // prüft ob eine Zahl eingegeben wurde
            printf("Eingabefehler!\n");
            while (getchar() != '\n'); // Cache leeren
            x = 0;
        }
    } while (x < 1);

	do {
		x = Collatz(x);
		printf("%d\n", x);
	} while (x != 1);
}
```


# Goldbach-Vermutung

Jede gerade Zahl >2 lässt sich als Summe zweier Primzahlen schreiben.
4 = 2 + 2;
6 = 3 + 3;
8 = 3 + 5;
10 = 3 + 7 | 5 + 5;

Teilaufgaben:
a) Funktion isPrim() prüft auf Primzahl
b) Zerlegung einer geraden Zahl in alle möglichen Summanden

```run-c
#include <stdio.h>
#include <math.h>

int isPrim(int x) {
	int end;
	
	if (x < 2) return 0;
	if (x == 2) return 1; // 2 ist einzige gerade Primzahl
	if (!(x%2)) return 0;
	
	end = sqrt(x);
	
	for (int i=3; i <= end; i+=2) {
		if (!(x%i)) {
			return 0;
		}
	}
	
	return 1;
}

int main() {
	int x = 88;
	
	for (int i=2; i <= x/2; i++) {
		if(isPrim(i)) {       // Test ob 1. Summand prim ist
			if(isPrim(x-i)) { // Test ob 2. Summand prim ist
				printf("\n %d = %d + %d", x, i, x-i);
			}
		}
	}
	
	return 0;
}
```


# Primfaktorzerlegung

```run-c
#include <stdio.h>
#include <math.h>

void prime(int n, int teiler) {
	if (n == 1) return;
	if (n % teiler == 0) {
		printf("%d ", teiler);
		prime(n / teiler, teiler);
	} else {
	prime(n, teiler + 1);
	}
}

int main() {
	int n = 21;
	prime(n, 2); // wir starten mit 2
	return 0;
}
```

# Zustandsautomat


```c
#include <stdio.h>

int main(void) {

    int zustand = 0;   // 0 = 0€, 1 = 0,50€, 2 = 1,00€, 3 = 1,50€
    int eingabe = 0;

    do {
        printf("\nAktueller Zustand: %d (0=0€,1=0,50€,2=1€,3=1,50€)\n", zustand);
        printf("Geld einwerfen (1=0,50€, 2=1€, 3=Abbrechen, 4=Getränk wählen): ");

        if (scanf("%d", &eingabe) != 1) {
            printf("Eingabefehler!\n");
            return 1;
        }

        switch (zustand) {

            case 0:
                switch (eingabe) {
                    case 1: zustand = 1; printf("0,50€ Guthaben\n"); break;
                    case 2: zustand = 2; printf("1,00€ Guthaben\n"); break;
                    case 3: zustand = 0; printf("Abbruch, Geld zurück\n"); break;
                    case 4: printf("Nicht genug Guthaben!\n"); break;
                }
                break;

            case 1:
                switch (eingabe) {
                    case 1: zustand = 2; printf("1,00€ Guthaben\n"); break;
                    case 2: zustand = 3; printf("1,50€ Guthaben\n"); break;
                    case 3: zustand = 0; printf("Abbruch, Geld zurück\n"); break;
                    case 4: printf("Nicht genug Guthaben!\n"); break;
                }
                break;

            case 2:
                switch (eingabe) {
                    case 1: zustand = 3; printf("1,50€ Guthaben\n"); break;
                    case 2: printf("Zu viel eingeworfen!\n"); break;
                    case 3: zustand = 0; printf("Abbruch, Geld zurück\n"); break;
                    case 4: printf("Nicht genug Guthaben! :(\n"); break;
                }
                break;

            case 3:
                switch (eingabe) {
                    case 1: printf("Zu viel eingeworfen!\n"); break;
                    case 2: printf("Zu viel eingeworfen!\n"); break;
                    case 3: zustand = 0; printf("Abbruch, Geld zurück\n"); break;
                    case 4: printf("Bitte, Ihre Limo! :)\n"); zustand = 0; break;
                }
                break;

            default:
                printf("Unbekannter Zustand!\n");
                zustand = 0;
        }

    } while (1);  // Endlosschleife, weil Zustand 0 nur Start ist

    return 0;
}
```

# Zustandsautomat

Konstruieren Sie einen Zustandsautomaten für einen Fahrkartenautomaten als Mealy-Automaten, d.h. Ausgaben des Automaten werden beim Übergang in den neuen Zustand notiert.
Es werden nur Einzelfahrscheine für 3,00 € und Fahrscheine Kurzstrecke für 2,00 € ausgegeben.
Es können nur 2 €-, 1,- € und 50 Cent-Münzen eingeworfen werden.
Wird beim Einwurf einer Münze der Betrag von 3,00 € überschritten, dann fällt die Münze in das Geldausgabefach.
Es wird passend gezahlt, d.h. die Ausgabe des Fahrscheins erfolgt nur, wenn 2,- € bzw. 3,- € gezahlt wurden.
Das Betätigen der Korrekturtaste führt zur Ausgabe des bisher eingeworfenen Geldes.
Es gibt für die Fahrscheine zwei Ausgabetasten: Einzelfahrschein und Fahrschein Kurzstrecke.

| E\Z     | $Z_0$ (0,0 €) | $Z_1$ (0,50 €)        | $Z_2$ (1,00 €)        | $Z_3$ (1,50 €)        | $Z_4$ (2,00 €)        | $Z_5$ (2,50 €)        | $Z_6$ (3,00 €)        |
| ------- | ------------- | --------------------- | --------------------- | --------------------- | --------------------- | --------------------- | --------------------- |
| 0,50€   | $Z_1$<br>-    | $Z_2$<br>-            | $Z_3$<br>-            | $Z_4$<br>-            | $Z_5$<br>-            | $Z_6$<br>-            | $Z_6$ <br>0,50 zurück |
| 1,00€   | $Z_2$<br>-    | $Z_3$<br>-            | $Z_4$<br>-            | $Z_5$<br>-            | $Z_6$<br>-            | $Z_5$ <br>1,00 zurück | $Z_6$ <br>1,00 zurück |
| 2,00€   | $Z_4$<br>-    | $Z_5$<br>-            | $Z_6$<br>-            | $Z_3$ <br>2,00 zurück | $Z_4$ <br>2,00 zurück | $Z_5$ <br>2,00 zurück | $Z_6$ <br>2,00 zurück |
| K       | $Z_0$<br>-    | $Z_0$ <br>0,50 zurück | $Z_0$ <br>1,00 zurück | $Z_0$ <br>1,50 zurück | $Z_0$ <br>2,00 zurück | $Z_0$ <br>2,50 zurück | $Z_0$ <br>3,00 zurück |
| Kurz    | $Z_0$<br>-    | $Z_1$<br>-            | $Z_2$<br>-            | $Z_3$<br>-            | $Z_0$ <br> Ausg.      | $Z_5$<br>-            | $Z_6$<br>-            |
| Fahrsch | $Z_0$<br>-    | $Z_1$<br>-            | $Z_2$<br>-            | $Z_3$<br>-            | $Z_4$<br>-            | $Z_5$<br>-            | $Z_0$ <br> Ausg.      |

![[Pasted image 20260113080712.png]]


