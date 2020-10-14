#include <stdio.h>
#include <pthread.h>

int varT = 0;

void *soma(void *arg)
{
 printf("Somando 1 em %d\n", varT);
 varT += 1;
 printf("Valor atual de varT é %d\n", varT);
}

void *subtracao(void *arg)
{
 printf("Subtraindo 1 em %d\n", varT);
 varT -= 1;
 printf("Valor atual de varT é %d\n", varT);
}

int main(int argc, char *argv[])
{
 pthread_t somaThread[4];

 pthread_t subtracaoThread[3];
 int i;

 for (i = 0; i < 4; i++)
 {
  printf("Criando thread de soma %d\n", i + 1);
  pthread_create(&somaThread[i], NULL, soma, NULL);
 }

 for (i = 0; i < 3; i++)
 {
  printf("Criando %d thread de subtracao\n", i);
  pthread_create(&subtracaoThread[i], NULL, subtracao, NULL);
 }

 printf("AGUARDANDO TERMINO DAS THREADS\n");

 for (i = 0; i < 4; i++)
 {
  pthread_join(somaThread[i], NULL);
 }

 for (i = 0; i < 3; i++)
 {
  pthread_join(subtracaoThread[i], NULL);
 }

 printf("TERMINO TODAS AS THREADS\n");

 return 0;
}
