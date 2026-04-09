#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

char* createBitString(unsigned int x) {
    printf("dez: %u\n", x);
    printf("hex: %X\n", x);

    int bitCount = sizeof(x) * 8;
    char *bitString = (char*)malloc(bitCount + 1); // +1 für Nullterminator
    
    // Maske initialisieren: eine 1 gefolgt von (bitCount - 1) Nullen
    unsigned int mask = 1 << (bitCount - 1);
    
    for (int i = 0; i < bitCount; i++) {
        // prüft ob an der Stelle der Maske das entsprechende Bit unserer Zahl x gesetzt ist
        // setzt entsprechend bitString an der Stelle i auf '1' oder '0'
        bitString[i] = (x & mask) ? '1' : '0';
        mask >>= 1; // Maske um 1 Bit nach rechts verschieben
    }
    
    bitString[bitCount] = '\0'; // Null-terminate
    printf("bin: %s\n", bitString);
    return bitString;
}

// argc: Argument Count, *argv: Argument Vector (Array of Strings)
void main(int argc, char *argv[]) {
    for (int i=1; i<argc; i++) {
        char *result = createBitString((unsigned int)atoi(argv[i]));
        free(result);
        putchar('\n');
    }
}