#include <stdio.h>
#include <string.h>
#define MAX_LENGTH 256

// durch die Zeiger werden die eigentlichen Strings modifiziert
void swapStrings(char *str1, char *str2) {
    char temp[MAX_LENGTH];
    strcpy(temp, str1);
    strcpy(str1, str2);
    strcpy(str2, temp);
}

void main(int argc, char *argv[]) {
    char longestString[MAX_LENGTH] = "";
    char arrayStrings[argc - 1][MAX_LENGTH];
    
    for (int i = 1; i < argc; i++) {
        printf("%s\n", argv[i]);
        if (strlen(argv[i]) > strlen(longestString)) {
            strcpy(longestString, argv[i]);
        }
        strcpy(arrayStrings[i - 1], argv[i]);
    }

    printf("Laengste Zeichenkette: %s\n", longestString);
    
    // geht durch jeden Eintrag im Array
    for (int i = 0; i < argc - 2; i++) {
        // vergleicht den aktuellen Eintrag mit allen folgenden Einträgen
        for (int j = i + 1; j < argc - 1; j++) {
            // wenn der aktuelle Eintrag lexikographisch größer ist, tausche sie
            if (strcmp(arrayStrings[i], arrayStrings[j]) > 0) {
                swapStrings(arrayStrings[i], arrayStrings[j]);
            }
        }
    }

    puts("Alphabetisch sortiert:");
    for (int i = 0; i < argc - 1; i++) {
        printf("%s\n", arrayStrings[i]);
    }
}