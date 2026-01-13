#include <stdio.h>
#include <stdlib.h>

/* 
Ostern-Formel nach O’Beirne 
Schreiben Sie das Programm in der Sprache C zum Berechnen von Osterdatum unter Nutzung von 
vereinfachten Algorithmus nach O’Beirne (1965) basierend auf dem VL-Skript. 
Hinweis: 
Nutzen Sie den folgenden Pseudocode: 
# Einfacher Algorithmus von T. H. O’Beirne (1965) 
# gültig für 1900... 2099 
- N = Jahr – 1900 
- A = N mod 19 
- B = [(7A + 1) / 19] 
- M = (11A + 4 – B) mod 29 
- Q = [N / 4] 
- W = (N + Q + 31 – M) mod 7 
- P = 25 – M – W 
- Ostersonntag ist der P. April bzw. der (P + 31). März 
Ergänzen Sie das Programm um die Funktionen für Berechnung von beweglichen Feiertagen!
*/
 
// Prototypen
void Karfreitag(int, int, int);
void Himmelfahrt(int, int, int);
void Pfingsten(int, int, int);
void Fastnacht(int, int, int);
unsigned int leapyear(unsigned int);

int main() {
	puts("Einfacher Algorithmus von T. H. O-Beirne (1965)");
	puts("gueltig fuer 1900... 2099");
	puts("Autor: Karl Kuhne");

	int N, Jahr = 1989, A, B, M, Q, W, P;	
	printf("Bitte Jahr eingeben: ");
	fflush(stdin);
	scanf("%d", &Jahr);
	
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
	
	return 0;
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

unsigned int leapyear(unsigned int year) 
{ 
	unsigned int divisible_by_4 = 	(year % 4 == 0);
    unsigned int not_century = 		(year % 100 != 0);
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



//Erweiterung void Fastnacht(int t, int m, int j) 
//Alg. nach Gauß
