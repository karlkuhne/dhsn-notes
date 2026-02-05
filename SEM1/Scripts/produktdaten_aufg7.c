#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 100

typedef struct {
    char *name;
    char *category;
    float *price;
    int *times;
} product;

product **readAllProducts(FILE *file, int *count) {
    product **allProducts = NULL;
    *count = 0;
    char buffer[MAX], delimiter[] = ";", *token;
    while(fgets(buffer, MAX, file) != NULL) {
        allProducts = realloc(allProducts, sizeof(product *) * (*count + 1));
        allProducts[*count] = malloc(sizeof(product));
        
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

void freeProduct(product *product) {
    free(product->name);
    free(product->category);
    free(product->price);
    free(product->times);
}

void freeAllProducts(product **allProducts, int count) {
    for(int i=0; i<count; i++) freeProduct(allProducts[i]);
    free(allProducts);
}

int main() {
    FILE *file = fopen("C:\\Users\\karlk\\Dokumente\\DHSN\\dhsn-notes\\SEM1\\Scripts\\Files\\produkte.csv", "r");
    int count;
    float total=0, mostExpensivePrice=0;
    char mostExpensiveName[MAX];
    product **allProducts = readAllProducts(file, &count);
    puts("");
    puts("Folgende Produkte wurden eingelesen:");
    for(int i=0; i<count; i++) {
        printf("%s (%s) kostet $%.2f - %d mal auf Lager\n", allProducts[i]->name, allProducts[i]->category, *(allProducts[i]->price), *(allProducts[i]->times));
        total+=(*(allProducts[i]->price) * *(allProducts[i]->times));
        if (*(allProducts[i]->price) > mostExpensivePrice) {
            strcpy(mostExpensiveName, allProducts[i]->name);
            mostExpensivePrice = *(allProducts[i]->price);
        }
    }
    puts("");
    printf("Der Gesamtwert aller Produkte betraegt %.2f\n", total);
    printf("Das teuerste Produkt ist %s (kostet $%.2f)", mostExpensiveName, mostExpensivePrice);
    puts("");
    freeAllProducts(allProducts, count);
    fclose(file);
    return 0;
}