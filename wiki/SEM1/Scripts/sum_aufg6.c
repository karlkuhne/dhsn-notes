#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 100

int main() {
    FILE *file = fopen("C:\\Users\\karlk\\Dokumente\\DHSN\\dhsn-notes\\SEM1\\Scripts\\Files\\zahlen.txt", "r");
    char buffer[MAX];
    int count = 0;
    while(fgets(buffer, MAX, file) != NULL) {
        count += atoi(buffer);
    }
    printf("%d", count);
    return 0;
}