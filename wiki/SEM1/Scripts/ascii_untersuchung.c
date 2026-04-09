#include <stdio.h>

int main() {
    char buf[3];

    while (!(buf[0] == 'q' && buf[1] == 'q')) {
        puts("Geben Sie ein Zeichen ein: ");
        fgets(buf, sizeof(buf), stdin);
        
        if(buf[0] >= 'A' && buf[0] <= 'Z') {
            puts("Grossbuchstabe");
        } else if (buf[0] >= 'a' && buf[0] <= 'z') {
            puts("Kleinbuchstabe");
        } else if (buf[0] >= '0' && buf[0] <= '9') {
            puts("Zahl");
        } else puts("Sonderzeichen");
    }
    
    return 0;
}