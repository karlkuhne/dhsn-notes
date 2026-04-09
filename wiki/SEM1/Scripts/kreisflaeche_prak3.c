#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define M_PI 3.14159265358979323846

int main() {
    char eingabe[100];
    double d, r, A;

    puts("Berechnung der Kreisflaeche");
    puts("Eingabe des Durchmessers in mm: ");

    // Zielpuffer (kein & nötig, denn Arrays sind bereits Adressen), maximale Größe, standard input (Tastatureingabe)
    fgets(eingabe, sizeof(eingabe), stdin);

    // string in double konvertieren
    d = atof(eingabe);

    r = (d / 2.0) / 10.0;
    A = M_PI * r * r;

    printf("Flaecheninhalt in cm2: %.4f\n", A);

    return 0;
}