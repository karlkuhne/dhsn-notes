#include <stdio.h>
#include <string.h>
#define MAX_LENGTH 256

void qsort (void *base, // Adresse der zu sortierenden Daten
            size_t nitems, // Anzahl der Elemente
            size_t size, // Größe eines Elements
            int (*compar)(const void *, const void *)); // Vergleichsfunktion

int compareStrings(const void *a, const void *b) {
    return strcmp((const char *)a, (const char *)b);
}

void main(int argc, char *argv[]) {
    char arrayStrings[argc - 1][MAX_LENGTH];
    
    puts("Eingegebene Zeichenketten:");
    for (int i = 1; i < argc; i++) {
        printf("%s\n", argv[i]);
        strcpy(arrayStrings[i - 1], argv[i]);
    }

    // Anzahl der Elemente alternativ auch mit argc - 1
    qsort(arrayStrings, sizeof(arrayStrings) / sizeof(arrayStrings[0]), sizeof(arrayStrings[0]), compareStrings);

    puts("Alphabetisch sortiert:");
    for (int i = 0; i < argc - 1; i++) {
        printf("%s\n", arrayStrings[i]);
    }
}