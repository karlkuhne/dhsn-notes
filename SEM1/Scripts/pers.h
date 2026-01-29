#ifndef PERS_H
#define PERS_H

typedef struct {
  char *name;
  char *surname;
  char *phone;
} tpers;

tpers* readPers(FILE *file);
void putPers(const tpers *person);
void freePers(tpers *person);

// Erweiterung Aufg 2
tpers** readAllPers(FILE *file, int *count);
void putAllPers(tpers **allPers, int count);
void freeAllPers(tpers **allPers, int count);

#endif