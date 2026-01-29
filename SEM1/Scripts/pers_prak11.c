#include <stdio.h>
#include <stdlib.h>
#include "pers.h"

static char* readStr(FILE *file) {
    int len = fgetc(file); // ließt an der aktuellen Position ein Byte ein
    if (len == EOF || len == 0) return NULL;

    char *str = (char*)malloc(len + 1); // Speicher für den String wird allokiert
    fread(str, 1, len, file); // String wird in den Speicher geschrieben
    str[len] = '\0'; // Nullterminator wird in den Speicher geschrieben
    return str; // gibt Adresse zurück
}

tpers* readPers(FILE *file) {
    tpers *pers = malloc(sizeof(tpers)); // Speicher für die Struktur wird allokiert
    if ((pers->name = readStr(file)) == NULL || (pers->surname = readStr(file)) == NULL || (pers->phone = readStr(file)) == NULL) {
        freePers(pers);
        return NULL;
    }
    return pers;
}

void putPers(const tpers *pers) {
    printf("%s %s %s\n", pers->name, pers->surname, pers->phone);
}

void freePers(tpers *pers) {
    if (pers) {
        free(pers->name);
        free(pers->surname);
        free(pers->phone);
        free(pers);
    }
}

int main() {
    FILE *file = fopen("C:\\Users\\karlk\\Dokumente\\DHSN\\dhsn-notes\\SEM1\\Scripts\\Files\\phone.dat", "r");
    tpers *pers; // Pointer für Struktur

    while((pers = readPers(file)) != NULL) {
        putPers(pers);
        freePers(pers);
    }

    fclose(file);
    return 0;
}