## 1.1 Minimum dreier Zahlen

```run-c
#include <stdio.h>
#include <stdlib.h>

int main() {
	int a = 1, b = 2, c = 3;
	int min = a;
	
	if (b < min) {
		min = b;
	}
	
	if (c < min) {
		min = c;
	}
	
	printf("%d ist die kleinste Zahl", min);
	return 0;
}
```

## 1.2 Konstruierbarkeit eines Dreiecks

```run-c
#include <stdio.h>
#include <stdlib.h>

int main() {
	int a = 12, b = 7, c = 7;

	printf("Konstruierbarkeit Dreieck\n");

	// Konstruierbarkeit
	if((b+c)<a) {
		puts("Dreieck ist nicht konstruierbar!");
		return -1;
	}
	
	// gleichschenklig / gleichseitig
	if (a == b && b == c) {
	    puts("Dreieck ist gleichseitig");
	} else if (b == c) {
	    puts("Dreieck ist gleichschenklig");
	}
	
	// rechtwinklig
	if ((a*a)==(b*b + c*c)) {
		puts("Dreieck ist rechtwinklig");
	}
	return 0;
}
```

## 1.3 Zufallsermittlung und Würfelfunktion


```run-c
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int zahl = 0, seed, count = 1;
int Wuerfel();

int main() {
	seed = time(NULL);
	srand(seed);
	
	while (zahl != 4) {
		zahl = Wuerfel();
		printf("%d. Wurf: %d\n", count, zahl);
		count++;
	};
	
    return 0;
}

int Wuerfel() {
	return 1 + rand() % 6;
}
```

## 1.4 Ermittlung ggT

```run-c
#include <stdio.h>
#include <stdlib.h>

int x = 304, y = 28;

int ggT(int x, int y) {
    int r = x % y;
    printf("%d mod %d = %d\n", x, y, r);
    if (r == 0) {
        return y;
    } else {
        return ggT(y, r);
    }
}

int main() {
	int ergebnis = ggT(x, y);
    printf("ggT von %d und %d ist %d\n", x, y, ergebnis);
    return 0;
}
```

## 1.5 pq-Formel mit heron-Wurzelberechnung

```run-c
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define accuracy 0.000001
#define ABS(x) ((x) < 0 ? -(x) : (x))

// sqrt()
double heron(double a) {
	double x, y, xneu, yneu;
	x=a;
	y=1; //Startwert
	
	while(ABS(x*x - a) > accuracy) {
		xneu = (x+y)/2;
		yneu = a/xneu;
		x = xneu;
		y = yneu;
	}
	
	return x;
}

int main() {
	double p = 3.7, q = 2.1, D, x1, x2;
	
	puts("Loesung von quadratischen pq-Gleichungen");
	puts("Die Gleichung sieht aus:");
	printf("x*x + %.2lf*x + %.2lf = 0\n", p, q);
	
	// Diskriminante
	D = (p * p)/4 - q;
	
	if (D < 0) {
		puts("Keine reelen Nullstellen!");
		return -1;
	}
	
	if (D == 0) {
		puts("Eine reelle Nullstelle!");
		x1 = -(p/2);
		printf("x1 = x2 = %.2lf\n", x1);
		return 1;
	}
	
	x1 = -(p/2) + heron(D);
	x2 = -(p/2) - heron(D);
	
	puts("Zwei reelle Nullstellen!");
	printf("x1 = %.2lf | x2 = %.2lf\n", x1, x2);
	
	return 0;
}
```
![[pq.PAP.png]]
![[Heron.PAP.png]]
## 1.6 6er Würfeln


```run-c
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int times = 6, seed, count = 0;

int Wuerfel() {
	return 1 + rand() % 6;
}

int main() {
	// Solange würfeln, bis vorgegebene Anzahl 6er gewürfelt wird
	while (count < times) {
		int zahl = Wuerfel();
		printf("Es wurde %d gewuerfelt\n", zahl);
		if (zahl == 6) {
			count++;
		}
	}
}
```

## 1.7 Verbalprädikat zur Klausurbewertung

```run-c
#include <stdio.h>

int main() {
    int punkte;

    while (1) {
        printf("Punkte eingeben (-1 zum Beenden): ");
        scanf("%d", &punkte);

        if (punkte == -1) {
            break;
        }

        if (punkte >= 97) {
            printf("Bewertung: Sehr gut\n");
        } else if (punkte >= 76) {
            printf("Bewertung: Gut\n");
        } else if (punkte >= 61) {
            printf("Bewertung: Befriedigend\n");
        } else if (punkte >= 50) {
            printf("Bewertung: Ausreichend\n");
        } else {
            printf("Bewertung: Ungenügend\n");
        }
    }

    return 0;
}

```

## 1.8 Summenformel und Reihenentwicklung

```run-c
#include <stdio.h>

int main() {
	double n = 11, a, b, c;
	
	for (int i = 1; i <= n; i++) {
		a += 1.0/i;
	}
	
	printf("%.2f \n", a);
	
	for (int j = 1; j <= n; j+=2) {
		b += 1.0 / j;
	}
	
	printf("%.2f \n", b);
	
	for (int k = 1; k <= n; k++) {
		if (k % 2 == 0) {
			c -= 1.0/k;
		} else {
			c += 1.0/k;
		}
	}
	
	printf("%.2f \n", c);
}
```

## 1.9 Summe der geometrischen Folge

```run-c
#include <stdio.h>
#include <math.h>

int main() {
	int a = 1, q = 2, n = 10, erg = 0;
	
	for (int i = 0; i <= n; i++) {
		erg += a * pow(q, i);
		
	}

	printf("%d", erg);
}
```

## 1.10 Maclaurinsche Reihen

### 1.10.1 Exponentialfunktion

$$
e^x = \exp(x) = \sum_{n=0}^{\infty} \frac{x^n}{n!}
= \frac{x^0}{0!} + \frac{x^1}{1!} + \frac{x^2}{2!} + \frac{x^3}{3!} + \dots
\text{ für alle } x \in \mathbb{R}
$$

```run-c
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main() {
	double erg=1.0, summand=1.0, x = 5.0;
	int i=1;
	
	printf("x: %lf\n",x);
	
	while (fabs(summand)>0.000005) { // Genauigkeit
		summand=summand*x/i;
		erg+=summand;
		printf("i: %2d, Summand: %8.6lf, Erg: %8.6lf \n",i,summand,erg);
		i++;
	}
	
	printf("Ergebnis: y=%lf\n",erg);
	return 0;
}
````

### 1.10.2 Sinus

$$
\sin(x)
= \sum_{n=0}^{\infty} (-1)^n \frac{x^{2n+1}}{(2n+1)!}
= \frac{x}{1!} - \frac{x^3}{3!} + \frac{x^5}{5!} - \dots
\text{ für alle } x \in \mathbb{R}
$$

```run-c
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main() {
	double erg = 0.0, x = 5.0, summand = x;
	int i=1;
	
	printf("x: %lf\n",x);
	
	while (fabs(summand)>0.000005) { // Genauigkeit
		erg += summand;
		printf("i: %2d, Summand: %8.6lf, Erg: %8.6lf \n",i,summand,erg);
		// Vorzeichenwechsel, Exponent um 2 erhöhen, Fakultät um 2 erhöhen
		summand *= -1 * x * x / ((i + 1) * (i + 2));
		i+=2;
	}
	
	printf("Ergebnis: y=%lf\n",erg);
	return 0;
}
````

### 1.10.3 Kosinus

$$
\cos(x)
= \sum_{n=0}^{\infty} (-1)^n \frac{x^{2n}}{(2n)!}
= \frac{x^0}{0!} - \frac{x^2}{2!} + \frac{x^4}{4!} - \dots
\text{ für alle } x \in \mathbb{R}
$$

```run-c
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main() {
	double erg = 0.0, x = 5.0, summand = 1;
	int i=0;
	
	printf("x: %lf\n",x);
	
	while (fabs(summand)>0.000005) { // Genauigkeit
		erg += summand;
		printf("i: %2d, Summand: %8.6lf, Erg: %8.6lf \n",i,summand,erg);
		// Vorzeichenwechsel, Exponent um 2 erhöhen, Fakultät um 2 erhöhen
		summand *= -1 * x * x / ((i + 1) * (i + 2));
		i+=2;
	}
	
	printf("Ergebnis: y=%lf\n",erg);
	return 0;
}
````

### 1.10.4 Logarithmus

$$
\ln(1+x)
= \sum_{k=1}^{\infty} (-1)^{k+1} \frac{x^k}{k} \\
= x - \frac{x^2}{2} + \frac{x^3}{3} - \frac{x^4}{4} + \dots,
\text{ für } -1 < x \le 1
$$

```run-c
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main() {
	double erg = 0.0, x = 1.0, summand = x;
	int i=1;
	
	printf("x: %lf\n",x);
	
	while (fabs(summand)>0.000005) { // Genauigkeit
		erg += summand;
		printf("i: %2d, Summand: %8.6lf, Erg: %8.6lf \n",i,summand,erg);
		// Vorzeichenwechsel, Exponent um 1 erhöhen, Nenner um 1 erhöhen
		summand *= -1 * x / (i + 1);
		i++;
	}
	
	printf("Ergebnis: y=%lf\n",erg);
	return 0;
}
````

### 1.10.5 Wurzelfunktion

$$
\sqrt{1+x}
= 1
+ \frac{1}{2}x
- \frac{1}{2\cdot 4}x^2
+ \frac{1\cdot 3}{2\cdot 4\cdot 6}x^3
- \frac{1\cdot 3\cdot 5}{2\cdot 4\cdot 6\cdot 8}x^4
+ \frac{1\cdot 3\cdot 5\cdot 7}{2\cdot 4\cdot 6\cdot 8\cdot 10}x^5
+ \dots
\text{ für } -1 \le x \le 1
$$

```run-c
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main() {
	double erg = 0.0, x = 1.0, summand = 1.0;
	int i=0;
	
	printf("x: %lf\n",x);
	
	while (fabs(summand)>0.000005) { // Genauigkeit
		erg += summand;
		printf("i: %2d, Summand: %8.6lf, Erg: %8.6lf \n",i,summand,erg);
		summand *= (-1) * x * (2*i - 1) / (2*i + 2);
		i++;
	}
	
	printf("Ergebnis: y=%lf\n",erg);
	return 0;
}
````

# 2.1 Ostern-Formel nach O Beirne

```run-c
#include <stdio.h>
#include <stdlib.h>

// Prototypen
void OBeirne(int);
void Gauss(int);
void Karfreitag(int, int, int);
void Himmelfahrt(int, int, int);
void Pfingsten(int, int, int);
void Fastnacht(int, int, int);
unsigned int leapyear(unsigned int);

int main() {
    int Jahr, Wahl;
    puts("Berechnung des Ostersonntags und der beweglichen Feiertage");
    puts("Autor: Karl Kuhne");
    puts("Bitte Jahr eingeben: ");
    scanf("%d", &Jahr);
    printf("Welchen Algorithmus moechten Sie verwenden? \n 1: O-Beirne \n 2: Gauss \n");
    scanf("%d", &Wahl);
    if (Wahl == 1) {
        puts("Einfacher Algorithmus von T. H. O-Beirne (1965)");
        puts("gueltig fuer 1900... 2099");
        OBeirne(Jahr);
    } else {
        puts("Algorithmus von C. F. Gauss (1800)");
        puts("gueltig fuer 1583... 2499");
        Gauss(Jahr);
    }
    return 0;
}

// Ostersonntag
void OBeirne(int Jahr) {
    int N, A, B, M, Q, W, P;
    N = Jahr - 1900;
    A = N % 19;
    B = (7*A + 1) / 19;
    M = (11*A + 4 - B) % 29;
    Q = N / 4;
    W = (N + Q + 31 - M) % 7;
    P = 25 - M - W;
    if(P<0) {
        P = P + 31;
        printf("Ostersonntag ist der %d. Maerz %4d.\n", P, Jahr);
        Karfreitag(P, 3, Jahr);
        Himmelfahrt(P, 3, Jahr);
        Pfingsten(P, 3, Jahr);
        Fastnacht(P, 3, Jahr);
    } else {
        printf("Ostersonntag ist der %d. April %4d.\n", P, Jahr);
        Karfreitag(P, 4, Jahr);
        Himmelfahrt(P, 4, Jahr);
        Pfingsten(P, 4, Jahr);
        Fastnacht(P, 4, Jahr);
    }
}

void Gauss(int Jahr) {
    int k, m, s, a, d, r, og, sz, oe, os, tag, monat;
    k = Jahr / 100;
    m = 15 + (3*k + 3) / 4 - (8*k + 13) / 25;
    s = 2 - (3*k + 3) / 4;
    a = Jahr % 19;
    d = (19*a + m) % 30;
    r = d / 29 + (d / 28 - d / 29) * (a / 11);
    og = 21 + d - r;
    sz = 7 - (Jahr + Jahr / 4 + s) % 7;
    oe = 7 - (og - sz) % 7;
    os = og + oe;
    if(os <= 31) {
        tag = os;
        monat = 3;
        printf("Ostersonntag ist der %02d.03.%04d faelig.\n", tag, Jahr);
        Karfreitag(tag, monat, Jahr);
        Himmelfahrt(tag, monat, Jahr);
        Pfingsten(tag, monat, Jahr);
        Fastnacht(tag, monat, Jahr);
    } else {
        tag = os - 31;
        monat = 4;
        printf("Ostersonntag ist der %02d.04.%04d faelig.\n", tag, Jahr);
        Karfreitag(tag, monat, Jahr);
        Himmelfahrt(tag, monat, Jahr);
        Pfingsten(tag, monat, Jahr);
        Fastnacht(tag, monat, Jahr);
    }
}

// 2 Tage vor Ostern
void Karfreitag(int t, int m, int j) {
    t -= 2;
    if(t <= 0) {
        t += 31;  
        m -= 1;
    }
    printf("Karfreitag ist am %02d.%02d.%04d faelig.\n", t, m, j );
}

// 39 Tage nach Ostern
void Himmelfahrt(int t, int m, int j) {
        t += 9;
        m += 1;
        if(t > 31) {
            t -= 31;
            m += 1;
        }
        printf("Himmelfahrt ist am %02d.%02d.%04d faelig.\n", t, m, j );
}

// 49 Tage nach Ostern
void Pfingsten(int t, int m, int j) {
    t += 19;
    m += 1;
    if(t > 31) {
        t -= 31;
        m += 1;
    }
    printf("Pfingesten ist am %02d.%02d.%04d faelig.\n", t, m, j );
}

unsigned int leapyear(unsigned int year) {
    unsigned int divisible_by_4 =   (year % 4 == 0);
    unsigned int not_century =      (year % 100 != 0);
    unsigned int divisible_by_400 = (year % 400 == 0);
    if (year < 0)
        puts("Jahr darf nicht negativ sein.");
    return (divisible_by_4 && (not_century || divisible_by_400));
}

void Fastnacht(int t, int m, int j) {
    //Fastnacht: 47 Tage vor Ostersonntag
    //April => Februar, März => Januar
     t -= 16;
     m -= 2;
     if(t < 0) {
        t += 28;
        m -= 1;
        if (leapyear(j)) t++;
    }
    printf("Die Fastnacht ist am %02d.%02d.%04d faelig.\n", t, m, j );
}
```

