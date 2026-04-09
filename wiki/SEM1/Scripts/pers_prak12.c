#include <stdio.h>
#include <stdlib.h>
#include <string.h>
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

// Erweiterung Aufg 2
tpers** readAllPers(FILE *file, int *count) {
    tpers **allPers = NULL;
    tpers *pers;
    *count = 0;

    while ((pers = readPers(file)) != NULL) { 
        allPers = realloc(allPers, (*count + 1) * sizeof(tpers*));
        allPers[*count] = pers;
        (*count)++;
    }

    return allPers;
}

void putAllPers(tpers **allPers, int count) {
    for (int i = 0; i < count; i++) {
        putPers(allPers[i]);
    }
}

void freeAllPers(tpers **allPers, int count) {
    for (int i = 0; i < count; i++) {
        freePers(allPers[i]);
    }
    free(allPers);
}

void qsort (void *base, size_t nitems, size_t size, int (*compar)(const void *, const void *));

int comparePers(const void *a, const void *b) {
    // ((tpers*)a) bei normalen Arrays
    // (*((tpers**)a) bei Pointer-Arrays, da erst dereferenziert werden muss
    return strcmp((*((tpers**)a))->name, (*((tpers**)b))->name);
}

void writePers(FILE *file, const tpers *pers) {
    int len = strlen(pers->name);
    fputc(len, file); // schreibt ein Byte (Länge des Strings)
    fwrite(pers->name, 1, len, file); // schreibt den String selbst

    len = strlen(pers->surname);
    fputc(len, file);
    fwrite(pers->surname, 1, len, file);

    len = strlen(pers->phone);
    fputc(len, file);
    fwrite(pers->phone, 1, len, file);
}

int main() {
    FILE *file = fopen("C:\\Users\\karlk\\Dokumente\\DHSN\\dhsn-notes\\SEM1\\Scripts\\Files\\phone.dat", "r");
    int count;
    tpers **allPers = readAllPers(file, &count);
    
    char input[128];

    puts("Personendaten erfolgreich eingelesen.");
    
    while (1) {
        puts("Neue Personendaten eingeben (Format: Name Nachname Telefonnummer) oder 'exit' zum Beenden:");
        fgets(input, sizeof(input), stdin);
        if (strcmp(input, "exit\n") == 0) break;

        input[strcspn(input, "\n")] = '\0';

        // strtok gibt Adresse zurück, daher chars als pointer definieren
        char *newName = strtok(input, " ");
        char *newSurname = strtok(NULL, " ");
        char *newPhone = strtok(NULL, "");

        if (!newName || !newSurname || !newPhone) {
            puts("Ungültiges Format. Bitte erneut versuchen.");
            continue;
        }

        tpers *newPers = malloc(sizeof(tpers));
        newPers->name = strdup(newName);
        newPers->surname = strdup(newSurname);
        newPers->phone = strdup(newPhone);

        file = fopen("C:\\Users\\karlk\\Dokumente\\DHSN\\dhsn-notes\\SEM1\\Scripts\\Files\\phone.dat", "ab");
        writePers(file, newPers);
        fclose(file);

        allPers = realloc(allPers, (count + 1) * sizeof(tpers*));
        allPers[count] = newPers;
        count++;
    }

    qsort(allPers, count, sizeof(tpers*), comparePers);
    putAllPers(allPers, count);
    freeAllPers(allPers, count);

    fclose(file);
    return 0;
}