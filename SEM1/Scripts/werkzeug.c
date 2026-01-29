#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 100
#define FILEPATH "C:\\Users\\karlk\\Dokumente\\DHSN\\dhsn-notes\\SEM1\\Scripts\\Files\\werkzeug.txt"

typedef struct {
    char *name;
    char *marke;
    float *preis;
} ttool;

ttool **readAllTools(FILE *datei, int *count) {
    ttool **allTools = NULL;
    char buffer[MAX], delimiter[] = " ,;", *token;
    *count = 0;
    
    while (fgets(buffer, MAX, datei) != NULL) {
        allTools = realloc(allTools, sizeof(ttool *) * (*count + 1));
        allTools[*count] = malloc(sizeof(ttool));

        token = strtok(buffer, delimiter);
        allTools[*count]->name = malloc(strlen(token) + 1);
        strcpy(allTools[*count]->name, token);
        
        token = strtok(NULL, delimiter);
        allTools[*count]->marke = malloc(strlen(token) + 1);
        strcpy(allTools[*count]->marke, token);

        token = strtok(NULL, delimiter);
        allTools[*count]->preis = malloc(sizeof(float));
        *(allTools[*count]->preis) = atof(token);

        (*count)++;
    }

    return allTools;
}

void addTools(ttool ***allTools, int *count) {
    FILE *file;
    char input[MAX];
    while(1) {
        puts("Neue Werkzeugdaten eingeben (Format: Name Marke Preis) oder 'exit' zum Beenden:");
        fgets(input, MAX, stdin);
        if (strcmp(input, "exit\n") == 0) break;
        input[strcspn(input, "\n")] = '\0';
        char *newName = strtok(input, " ");
        char *newMarke = strtok(NULL, " ");
        char *newPreis = strtok(NULL, "");
        if(!newName || !newMarke || !newPreis) {
            puts("Ungültiges Format. Bitte erneut versuchen.");
            continue;
        }
        ttool *newTool = malloc(sizeof(ttool));
        newTool->name = malloc(strlen(newName) + 1);
        strcpy(newTool->name, newName);
        newTool->marke = malloc(strlen(newMarke) + 1);
        strcpy(newTool->marke, newMarke);
        newTool->preis = malloc(sizeof(float));
        *(newTool->preis) = atof(newPreis);
        file = fopen(FILEPATH, "a");
        fprintf(file, "%s %s %.2f\n", newTool->name, newTool->marke, *(newTool->preis));
        fclose(file);
        *allTools = realloc(*allTools, sizeof(ttool *) * (*count + 1));
        (*allTools)[*count] = newTool;
        (*count)++;
    }
}

void qsort (void *base, size_t nitems, size_t size, int (*compar)(const void *, const void *));

int compareTools(const void *a, const void *b) {
    // ((tpers*)a) bei normalen Arrays | (*((tpers**)a) bei Pointer-Arrays
    return strcmp((*(ttool**)a)->name, (*(ttool**)b)->name);
}

void freeTool(ttool *tool) {
    free(tool->name);
    free(tool->marke);
    free(tool->preis);
    free(tool);
}

void freeAllTools(ttool **allTools, int count) {
    for (int i = 0; i < count; i++) {
        freeTool(allTools[i]);
    }
    free(allTools);
}

int main() {
    FILE *datei = fopen(FILEPATH, "r");
    int count;
    ttool **allTools = readAllTools(datei, &count);
    puts("Werkzeugdaten erfolgreich eingelesen.");
    addTools(&allTools, &count);
    qsort(allTools, count, sizeof(ttool *), compareTools);
    for (int i = 0; i < count; i++) {
        printf("%s von %s kostet %.2f\n", allTools[i]->name, allTools[i]->marke, *(allTools[i]->preis));
    }
    freeAllTools(allTools, count);
    fclose(datei);
    return 0;
}