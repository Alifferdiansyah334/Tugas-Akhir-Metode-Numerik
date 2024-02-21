#include <stdio.h>
#include <stdlib.h>
#include <math.h>

float f(float x){
  return exp(x) + x * x - 3 * x - 2;
}
float g(float x){
  return (x * x + exp(x) - 2) / 3;
}

int main () {

  float a, e;
  double b, c;
  int i_maks, iterasi;

  printf("First Guess : ");
  scanf("%f",&a);
  
  printf("Masukkan Toleransi Error : ");
  scanf("%f",&e);

  printf("Iterasi Maksimum : ");
  scanf("%d",&i_maks);

  printf("\n\t\t\t\tTabel Metode Iterasi Sederhana\n");
  printf("-------------------------------------------------------------------------------------\n");
  printf("i\t\tx\t\t\tg(x)\t\t\tf(x)\n");
  
  iterasi = 0;
  
  do {
    b = g(a);
    c = f(a);
    printf("%i\t\t%lf\t\t%lf\t\t%lf\n",iterasi,a,b,c);
    a = b;
    iterasi ++;
  }

  while ( (fabs(c)>e) && (iterasi<i_maks));
  {
    if(iterasi<i_maks) {
      printf("\n Ditemukan Penyelesaian x adalah %lf\n",a);
    }
    else {
      printf("\ntidak bisa memenuhi toleransi(iterasi tidak cukup)\n");
    }
  }
    return 0;
}
