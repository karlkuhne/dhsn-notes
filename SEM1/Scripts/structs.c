#include <stdio.h>

typedef struct {
    char name[30];
    char id[3];
    char currency[3];
    double convFacBuy;
    double convFacSell;
} Country;

int main() {
    Country countries[] = {
        {"Vereinigte Staaten von Amerika", "USA", "USD", 0.7093, 0},
        {"Euroland", "EU ", "EUR", 0.8192, 0},
        {"Schweiz", "CH ", "CHF", 0.6053, 0},
        {"Grossbritanien", "GB ", "GBP", 1.4355, 0},
        {"Japan", "JP ", "JPY", 0.006165, 0},
        {"Kanada", "CA ", "CAD", 0.7090, 0},
        {"Australien", "AU ", "AUD", 0.6154, 0},
        {"Russland", "RU ", "RUR", 0.02830, 0},
        {"China", "CHI", "CHY", 0.09414, 0},
        {"Schweden", "S ", "SWK", 0.10858, 0},
        {"Indien", "IN ", "INR", 0.01787, 0}
    };

    int numCountries = sizeof(countries) / sizeof(countries[0]);
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