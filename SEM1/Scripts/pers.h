#ifndef PERS_H
#define PERS_H

typedef struct {
  char *name;
  char *surname;
  char *phone;
} tpers;

tpers* readPers(FILE *fp);
void putPers(const tpers *person);
void freePers(tpers *person);

#endif