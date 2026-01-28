#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 128

int main(int argc, char *argv[]) {
    FILE *file;
    char wort[MAX];
    char fullPath[256];
    // // Index 0 ungenutzt, 1-10 für Längen, 11 für sonstige
    int laengen[128] = {0}; // alle auf 0 initialisieren

    // Vollständigen Pfad zusammenbauen
    snprintf(fullPath, sizeof(fullPath), "C:\\Users\\karlk\\Dokumente\\DHSN\\dhsn-notes\\SEM1\\Scripts\\Files\\%s", argv[1]);

    file = fopen(fullPath, "r");
    if (file == NULL) {
        printf("Fehler beim Oeffnen der Datei: %s\n", fullPath);
        return -1;
    }

    // wortweise
    while (fscanf(file, "%s", wort) == 1) {
        laengen[strlen(wort)]++;
    }

    fclose(file);

    printf("Woerter der Laenge:\n");
    for (int i = 1; i <= 10; i++) {
        printf("%d: %d gefunden\n", i, laengen[i]);
    }
    printf("11: %d sonstige Woerter\n", laengen[11]);

    return 0;
}