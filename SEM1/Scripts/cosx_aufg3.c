#include <stdio.h>
#include <stdlib.h>
#include <math.h> 

int main(int argc, char *argv[]) {
    double x=atof(argv[1]), term=1, sum=term;
    int n=0;
    while (fabs(term) >= 0.000005) {
        n++;
        term = term * (-1.0) * x * x / ((2*n-1) * (2*n));
        sum += term;
    }
    printf("%.4f", sum);
    return 0;
}