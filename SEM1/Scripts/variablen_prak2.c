#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 100

char input[MAX];
char delimiter[] = " ";

void main() {
    signed int my_si;
    unsigned int my_ui;
    float my_f;
    char my_ci;
    char my_cz;
    char my_s[MAX];
    char my_s1[MAX];
    char my_s2[MAX];

    fgets(input, MAX, stdin); my_si = (signed int)atoi(input);
    fgets(input, MAX, stdin); my_ui = (unsigned int)atoi(input);
    fgets(input, MAX, stdin); my_f = (float)atof(input);
    fgets(input, MAX, stdin); my_ci = (char)atoi(input);
    fgets(input, MAX, stdin); my_cz = (char)input[0];
    fgets(input, MAX, stdin);
    input[strcspn(input, "\n")] = '\0';
    strcpy(my_s, input);
    fgets(input, MAX, stdin);
    input[strcspn(input, "\n")] = '\0';
    char *token = strtok(input, delimiter); strcpy(my_s1, token);
    token = strtok(NULL, delimiter); strcpy(my_s2, token);

    printf("signed int: %-10p %-10d\n", &my_si, my_si);
    printf("unsigned int: %-10p %-10u\n", &my_ui, my_ui);
    printf("float: %-10p %.02f\n", &my_f, my_f);
    printf("char (int): %-10p %-10d '%c'\n", &my_ci, my_ci, my_ci);
    printf("char (zeichen): %-10p %-10d '%c'\n", &my_cz, my_cz, my_cz);
    printf("string: %-10p %s\n", &my_s, my_s);
    printf("string 1: %-10p %s\n", &my_s1, my_s1);
    printf("string 2: %-10p %s", &my_s2, my_s2);
}