#include <stdio.h>
#include <ctype.h>
#include <windows.h>

void main() {
    int i, j;
    
    printf("|dec hex Char |dec hex Char |dec hex Char |dec hex Char |\n");
    Sleep(500);
    
    for (i = 0; i < 128 / 4; i++) {
        printf("|");
        Sleep(200);
        
        for (j = 0; j < 4; j++) {
            int code = i + j * (128 / 4);
            printf("%3d %2X ", code, code);
            if (isgraph(code)) {
                printf("  %c  ", code);
            } else {
                printf("  .  ");
            }
            printf(" |");
            Sleep(100);
        }
        printf("\n");
        Sleep(150);
    }
}