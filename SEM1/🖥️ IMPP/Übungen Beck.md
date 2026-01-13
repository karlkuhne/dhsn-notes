## Durchschnitt

```run-js
const noten = [3, 1, 5, 5, 2, 0]
let akku = 0;
let count = 0;
while (noten[count] !== 0) {
	akku += noten[count]
	count++
}

akku /= noten.length;
console.log(akku)
```

```run-c
#include <stdio.h>
#include <stdlib.h>

int noten[] = {3, 1, 5, 5, 2, 0};

int main() {
    float akku = 0;
    int count = 0;

    while (noten[count] != 0) {
        akku += noten[count];
        count++;
    }
	
	akku /= count + 1;
	printf("Durchschnitt: %.2f\n", akku);
	return 0;
}
```

## Bit-Sizes

```run-c
#include <stdio.h>
#include <stdlib.h>

int main() {
	long i = 99;
	printf("Sizeof long int: %zu\n", sizeof(long));
	return 0;
}
```


## Ausdrücke

```run-c
#include <stdio.h>
#include <stdlib.h>

int j = 5, k = 1;

int main() {
	k = j&&k;
	printf("%d", k);
}
```

```run-c
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int c = 99;
bool b;

int main() {
	b = (c == 99);
	printf("%d", b);
}
```

```run-c
#include <stdio.h>
#include <stdlib.h>

char c = 'C', x;

int main() {
	x = c + 32;
	printf("%c", x);
}
```

```run-c
#include <stdio.h>
#include <stdlib.h>

int i = 13, j = 108;

int main() {
	i = i^j; // 01100001
	j = j^i; // 00001101
	i = i^j; // 01101100
	printf("i: %3d j: %3d\n", i,j);
}
```

## Exponentialfunktion

$$e^x = \sum_{n=0}^{\infty} \frac{x^n}{n!} \\
= \frac{x^0}{0!} + \frac{x^1}{1!} + \frac{x^2}{2!} + \frac{x^3}{3!} + \dots \\
= 1 + x + \frac{x^2}{2} + \frac{x^3}{6} + \dots$$

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

__Bedingung__

- die Summanden (abs. Betrag) werden immer kleiner (die Reihe konvergiert) und beeinflussen so die Genauigkeit des Ergebnisses immer weniger
- ist der abs. Betrag des Summanden kleiner als 0.000005, so kann die Berechnung abgebrochen werden oder anders formuliert, solange der abs. Betrag des Summanden größer als 0.000005 ist, wird die Schleife erneut ausgeführt
- summand ist mit 1.0 initialisiert, das ist größer als 0.000005, somit ist die Bedingung true und die eingebettete Anweisung wird ausgeführt

## String Länge

```c
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
char vBuf[128];

int main() {
	int i;
	printf("Eingabe:");
	fgets(vBuf,128,stdin); // Eingabe der Zeichenkette
	for (i=0; vBuf[i]; i++); // Schleife ermittelt die Länge der Zeichenkette
	vBuf[i-1]=0; // entfernt den Zeilenwechsel \n am Ende
	i--; // Korrektur der Länge
	printf("Length of %s: %d\n",vBuf,i);
	return 0;
}
```

## Tage seit 01.01.1900

Bsp.: zur Berechnung der Tage seit dem 01.01.1900 unter der Annahme, dass im Zeitraum 1901-2099 jedes durch 4 teilbare Jahr ein Schaltjahr ist. Die Variablen d, m und y enthalten die Datumswerte für Tag, Monat und Jahr.

```c
days=(y-1900)*365+(y-1900)/4;
switch(m)
{
	case 12: days+=30;
	case 11: days+=31;
	case 10: days+=30;
	case 9: days+=31;
	case 8: days+=31;
	case 7: days+=30;
	case 6: days+=31;
	case 5: days+=30;
	case 4: days+=31;
	case 3: days+=28;
	case 2: days+=31;
	case 1: days+=d;
}
if (y>1900 && (y%4)==0 && m<3) days--;
```

* Nebenstehende switch-Konstruktion enthält 12 case-Labels
* Je nach Monat wird am CaseLabel in die Anweisungsliste hineingesprungen (im Juli bei case 7)
* von dort wird die Anweisungsliste sequenziell nach unten ausgeführt
* dabei werden die Anzahl der Tage der vollständig vergangenen Monate aufsummiert
* im Januar wird der aktuelle Tag addiert oder 0, weil im Januar noch kein Monat vollständig vergangen ist, falls man den Tag nicht bereits in Zeile 17 addiert hat

## Kettenrechner

```c
#include <stdio.h>
#include <stdlib.h>
char buf[128];
char ErrDivZero[]="Divide by zero - no operation performed\n";
char ErrWrongOp[]="wrong operator - no operation performed\n";
int main()
{
	int result;
	char operator;
	int value;
	result=0;
	while(1)
	{
		printf("result:%d\n", result);
		printf("enter operator and number:");
		fgets(buf,sizeof(buf),stdin);
		sscanf(buf, "%c %d",&operator,&value);
		switch (operator)
		{
			case 'Q':
			case 'q':exit(0);		break;
			case '+':result+=value; break;
			case '-':result-=value; break;
			case '*':result*=value; break;
			case '/':
			case '%':if (value==0)
					puts(ErrDivZero);
				else
					if (operator=='/') result/=value;
					else             result%=value; break;
			default: puts(ErrWrongOp);
		}
	}
	return 0;
}
```

* Das Bsp. zeigt ein kleines Rechenprogramm ohne Berücksichtigung der Operatorpriorität
* Es wird immer eine Operation und ein Operand eingegeben
* Der Anfangswert ist 0, es ist also sinnvoll, mit einer additiven Operation zu beginnen
* In der Switchkonstruktion wird ausgewertet, welche Operation eingegeben worden ist und entsprechend gerechnet
* Für die Operationen Division und Modulo wird zunächst geprüft, ob der Divisor ungleich 0 ist, und danach mit einer if-Anweisung die eingegebene Operation ausgeführt