#include <stdio.h>
#include <string.h>
#define MAX_LENGTH 256

typedef struct {
    char name[31]; // +1 for null terminator
    char id[4];
    char currency[4];
    double convFacBuy;
    double convFacSell;
} Country;

void swapStrings(char *str1, char *str2) {
    char temp[MAX_LENGTH];
    strcpy(temp, str1);
    strcpy(str1, str2);
    strcpy(str2, temp);
}

int main() {
    Country countries[] = {
        {"Vereinigte Staaten von Amerika", "US", "USD", 0.7093, 0},
        {"Euroland", "EU", "EUR", 0.8192, 0},
        {"Schweiz", "CH", "CHF", 0.6053, 0},
        {"Grossbritanien", "GB", "GBP", 1.4355, 0},
        {"Japan", "JP", "JPY", 0.0062, 0},
        {"Kanada", "CA", "CAD", 0.7090, 0},
        {"Australien", "AU", "AUD", 0.6154, 0},
        {"Russland", "RU", "RUR", 0.0283, 0},
        {"China", "CH", "CHY", 0.0941, 0},
        {"Schweden", "S", "SMK", 0.1086, 0},
        {"Indien", "IN", "INR", 0.0179, 0}
    };

    int numCountries = sizeof(countries) / sizeof(countries[0]);

    for (int i = 0; i < numCountries - 1; i++) {
        for (int j = i + 1; j < numCountries; j++) {
            if (strcmp(countries[i].currency, countries[j].currency) > 0) {
                Country temp = countries[i];
                countries[i] = countries[j];
                countries[j] = temp;
            }
        }
    }

    printf("%-40s %-15s %-15s %-15s %s\n", "Land", "ID", "Waehrung", "Ankaufsfaktor", "Verkaufsfaktor");

    for (int i = 0; i < numCountries; i++)
    {
        countries[i].convFacSell = 1 / countries[i].convFacBuy;
        printf("%-40s %-15s %-15s %-15.4f %.4f\n",
            countries[i].name,
            countries[i].id,
            countries[i].currency,
            countries[i].convFacBuy,
            countries[i].convFacSell);
    }
    

    return 0;
}