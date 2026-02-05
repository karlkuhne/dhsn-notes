#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 100

typedef struct {
    char name[MAX];
    int mn;
    float note;
} Student;

int main() {
    Student students[] = {{"Max", 302301, 1.3}, {"Sofie", 302302, 2.6}, {"Meggie", 302303, 1.6}};
    char primus[MAX];
    float bestnote = 6.0, akku = 0;
    int numStudents = sizeof(students) / sizeof(students[0]);
    for (int i=0; i < numStudents; i++) {
        if (students[i].note < bestnote) {
            bestnote = students[i].note;
            strcpy(primus, students[i].name);
        }
        akku += students[i].note;
    }
    float ds=akku/numStudents;
    printf("Der Durchschnitt aller Noten ist %.1f und der Primus ist %s.", ds, primus);
    return 0;
}