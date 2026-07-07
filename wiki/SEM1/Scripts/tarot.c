#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#define MAX 100

void shuffleDeck(char deck[78][MAX]) {
    for (int i = 77; i > 0; i--) {
        int j = rand() % (i + 1);
        if (j == i) continue;
        char temp[MAX];
        strcpy(temp, deck[i]);
        strcpy(deck[i], deck[j]);
        strcpy(deck[j], temp);
    }
}

int main() {
    srand(time(NULL));

    char deck[78][MAX], input[MAX];
    FILE *file = fopen("Files/tarot.txt", "r");
    if (file == NULL) {
        printf("Datei konnte nicht geoeffnet werden!\n");
        return 1;
    }
    
    for (int i = 0; i < 78; i++) {
        fgets(deck[i], MAX, file);
        deck[i][strcspn(deck[i], "\n")] = '\0';
    }
    fclose(file);

    puts("===Willkommen beim Tarotkartenlegesymulator!===");
    puts("Schreiben Sie 'neu', um eine Karte zu ziehen. Schreiben Sie 'exit' um das Programm zu verlassen.");
    
    while(1) {
        fgets(input, MAX, stdin);
        if (strcmp(input, "neu\n") == 0) {
            shuffleDeck(deck);
            int card = rand() % 78;
            printf("Die neue Karte ist: %s\n", deck[card]);
        } else if (strcmp(input, "exit\n") == 0) {
            break;
        } else {
            puts("Ungueltige Eingabe. Bitte versuchen Sie es erneut.");
        }
    }
    return 0;
}