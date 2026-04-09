#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>

typedef struct {
    char data[44];
} MatRecord;

int main() {
    long fileLength;
    long numRecords;
    
    FILE *file = fopen("C:\\Users\\karlk\\Dokumente\\DHSN\\dhsn-notes\\SEM1\\Scripts\\Files\\mat.dat", "rb");
    if (file == NULL) {
        fprintf(stderr, "Ich kann die Quell-Datei nicht oeffnen.\n");
        return -1;
    }

    // springt zum Dateiende, return 0 wenn erfolgreich
    if (fseek(file, 0, SEEK_END) != 0) {
        fprintf(stderr, "Error: Cannot seek to end of file\n");
        fclose(file);
        return -1;
    }
    
    // liest die aktuelle Position im File, da am Ende ist dies die Dateilänge
    fileLength = ftell(file);
    if (fileLength == -1) {
        fprintf(stderr, "Error: Cannot determine file length\n");
        fclose(file);
        return -1;
    }
    
    // ermittelt die Anzahl der Datensätze
    numRecords = fileLength / sizeof(MatRecord);
    
    printf("Dateilaenge: %ld Bytes\n", fileLength);
    printf("Anzahl der Datensaetze: %ld\n", numRecords);
    
    // Verify that file length is exactly divisible by record size
    if (fileLength % sizeof(MatRecord) != 0) {
        printf("Warnung: Dateilaenge ist nicht durch Strukturgroesse teilbar!\n");
        printf("Rest: %ld Bytes\n", fileLength % sizeof(MatRecord));
    }
    
    rewind(file);
    fclose(file);
    
    return 0;
}

//26