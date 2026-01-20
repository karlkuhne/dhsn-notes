#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc, char *argv[]) {
    double x = atof(argv[1]), term = x, sum = term;
    int n = 0;
    
    while (fabs(term) >= 0.00005) {
        n++;
        term = term * (-1.0) * x * x / ((2.0 * n) * (2.0 * n + 1.0));
        sum += term;
    }

    printf("%.4f", sum);
    return 0;
}