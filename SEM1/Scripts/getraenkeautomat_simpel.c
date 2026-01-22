#include <stdio.h>
#include <stdlib.h>

int main (void)
{
	int zustand= 0;
	char eingabe;

	while(eingabe != '0')
	{
		do
		{
			printf("\n Bitte passend mit 1 EUR zahlen; jedes Getraenk kostet 1 EUR");
			printf("\n Was tun [a - 1 EUR einwerfen/b - Getraenkewahl/e - Exit]? ");
			fflush(stdin);
			eingabe= getchar();
		} while(eingabe!='a' && eingabe!='b' && eingabe!='e');

		switch (zustand)
		{
			case 0:	// Zustand 0 (Startzustand)
				switch(eingabe)
				{
					case 'a':
						zustand= 1;
						printf("\n 1,00 EUR Guthaben");
						getchar();
						fflush(stdin);
						break;
					case 'b':
						printf("\n 0,00 EUR Guthaben, Guthaben reicht nicht");
						getchar();
						fflush(stdin);
						break;
					case 'e':
						exit(0);
						break;
					default :
							printf("\n\nFalsche Eingabe!");
				}
				break;
				case 1: // Zustand mit 1,00 EUR Guthaben
					switch(eingabe)
					{
						case 'a':
							zustand= 1;
							printf("\n 1,00 EUR Guthaben, 1,00-Euro-Stueck faelt durch");
							getchar();
							fflush(stdin);
							break;
						case 'b':
							zustand= 0;
							printf("\n 0,00 EUR Guthaben, Getraenk wird ausgegeben");
							getchar();
							fflush(stdin);
							break;
						case 'e':
							exit(0); // Programm wird beendet
						default :
							printf("\n\nFalsche Eingabe!");
					}
					break;
				default :
					printf("\n\nFalsche Eingabe!");
					getchar();
			}
	}
	return 0;
}


