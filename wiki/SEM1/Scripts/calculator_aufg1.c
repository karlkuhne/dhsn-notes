#include <stdio.h>
#include <stdlib.h>
#define MAX 100

typedef int (*opfunc)(int, int);

int add(int a, int b) {
    return a+b;
}

int sub(int a, int b) {
    return a-b;
}

int mult(int a, int b) {
    return a*b;
}

opfunc choose(int num) {
    opfunc of[] = {add, sub, mult};
    return of[num];
}

int main(int argc, char *argv[]) {
    int a = atoi(argv[1]);
    int b = atoi(argv[2]);
    char input[MAX];
    int mode, erg;

    while(1) {
        puts("0 fuer Addition, 1 fuer Subtraktion, 2 fuer Multiplikation");
        fgets(input, MAX, stdin);
        mode = atoi(input);
        erg = choose(mode)(a, b);
        printf("Das Ergebnis ergibt %d\n", erg);
    }

    return 0;
}