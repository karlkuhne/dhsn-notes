#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 100

typedef struct {
    char *name;
    char *category;
    float *price;
    int *times;
} Product;

typedef struct {
    char *name;
    int *times;
} Category;


Product **readAllProducts(FILE *file, int *count) {
    Product **allProducts = NULL;
    *count = 0;
    char buffer[MAX], delimiter[] = ";", *token;
    while(fgets(buffer, MAX, file) != NULL) {
        allProducts = realloc(allProducts, sizeof(Product *) * (*count + 1));
        allProducts[*count] = malloc(sizeof(Product));
        
        token = strtok(buffer, delimiter);
        allProducts[*count]->name = malloc(strlen(token) + 1);
        strcpy(allProducts[*count]->name, token);
        
        token = strtok(NULL, delimiter);
        allProducts[*count]->category = malloc(strlen(token) + 1);
        strcpy(allProducts[*count]->category, token);

        token = strtok(NULL, delimiter);
        allProducts[*count]->price = malloc(sizeof(float));
        *(allProducts[*count]->price) = atof(token);

        token = strtok(NULL, delimiter);
        allProducts[*count]->times = malloc(sizeof(int));
        *(allProducts[*count]->times) = atof(token);

        (*count)++;
    }
    return allProducts;
}

Category **getAllCategories(Product **allProducts, int *count, int *numCategories) {
    Category **allCategories = NULL;
    *numCategories = 0;

    for(int i=0; i<*count; i++) {
        char *currentCat = allProducts[i]->category;

        int found = -1;
        for (int j=0; j<*numCategories; j++) {
            if (strcmp(allCategories[j]->name, currentCat) == 0) {
                found = j;
                break;
            }
        }

        if (found != -1) {
            (*(allCategories[found]->times))++;
        } else {
            allCategories = realloc(allCategories, sizeof(Category *) * (*numCategories + 1));
            allCategories[*numCategories] = malloc(sizeof(Category));
                
            allCategories[*numCategories]->name = malloc(strlen(currentCat) + 1);
            strcpy(allCategories[*numCategories]->name, currentCat);
            
            allCategories[*numCategories]->times = malloc(sizeof(int));
            *(allCategories[*numCategories]->times) = 1;
                
            (*numCategories)++;
        }
    }
    return allCategories;
}

void freeProduct(Product *Product) {
    free(Product->name);
    free(Product->category);
    free(Product->price);
    free(Product->times);
}

void freeAllProducts(Product **allProducts, int count) {
    for(int i=0; i<count; i++) freeProduct(allProducts[i]);
    free(allProducts);
}

void freeCategory(Category *Category) {
    free(Category->name);
    free(Category->times);
}

void freeAllCategories(Category **allCategories, int numcategories) {
    for(int i=0; i<numcategories; i++) freeCategory(allCategories[i]);
    free(allCategories);
}

int main() {
    FILE *file = fopen("C:\\Users\\karlk\\Dokumente\\DHSN\\dhsn-notes\\SEM1\\Scripts\\Files\\produkte.csv", "r");
    int count, numIndividualProducts = 0, numcategories;
    float total=0, mostExpensivePrice=0;
    char mostExpensiveName[MAX];
    Product **allProducts = readAllProducts(file, &count);

    // Produktliste
    puts("Folgende Produkte wurden eingelesen:");
    for(int i=0; i<count; i++) {
        printf("%s (%s) kostet $%.2f - %d mal auf Lager\n", allProducts[i]->name, allProducts[i]->category, *(allProducts[i]->price), *(allProducts[i]->times));
        total+=(*(allProducts[i]->price) * *(allProducts[i]->times));
        numIndividualProducts += *(allProducts[i]->times);
        if (*(allProducts[i]->price) > mostExpensivePrice) {
            strcpy(mostExpensiveName, allProducts[i]->name);
            mostExpensivePrice = *(allProducts[i]->price);
        }
    }

    Category **allCategories = getAllCategories(allProducts, &count, &numcategories);

    // Kategorieliste
    puts("");
    puts("Folgende Kategorien wurden eingelesen:");
    for(int i=0; i<numcategories; i++) {
        printf("%s - %d Produkte\n", allCategories[i]->name, *(allCategories[i]->times));
    }

    fclose(file);

    file = fopen("C:\\Users\\karlk\\Dokumente\\DHSN\\dhsn-notes\\SEM1\\Scripts\\Files\\statistik.txt", "w");
    fprintf(file, "Der Gesamtwert aller Produkte betraegt %.2f\n", total);
    fprintf(file, "Das teuerste Produkt ist %s (kostet $%.2f)\n", mostExpensiveName, mostExpensivePrice);
    fprintf(file, "Der Durchschnittpreis aller %d Produkte betraegt %.2f", numIndividualProducts, total/numIndividualProducts);

    freeAllProducts(allProducts, count);
    freeAllCategories(allCategories, numcategories);

    fclose(file);
    return 0;
}