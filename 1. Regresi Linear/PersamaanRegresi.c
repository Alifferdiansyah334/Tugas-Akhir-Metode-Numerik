#include<stdio.h>
#include<conio.h>

int main()
{
 int n, i;
 float x[100];
 float y[100];
 float sumX=0, sumX2=0, sumY=0, sumXY=0;
 float a, b;
 
 /* Input data */
 printf("Berapa jumlah data? ");
 scanf("%d", &n);
 printf("Masukkan data:\n");
 
 for(i=1;i<=n;i++)
 {
  printf("\nMasukkan nilai x[%d]=",i);
  scanf("%f", &x[i]);
  
  printf("Masukkan nilai y[%d]=",i);
  scanf("%f", &y[i]);
 }
 
 /* Menghitung jumlah data yang diperlukan */
 for(i=1;i<=n;i++)
 {
  sumX = sumX + x[i];
  sumX2 = sumX2 + x[i]*x[i];
  sumY = sumY + y[i];
  sumXY = sumXY + x[i]*y[i];
 }
 
 /* Menghitung nilai a dan b */
 b = (n*sumXY-sumX*sumY)/(n*sumX2-sumX*sumX);
 a = (sumY - b*sumX)/n;
 
 
 /* Menampilkan nilai dari a dan b */
 printf("\nNilai XY adalah: xy = %0.2f", sumXY);
 printf("\nNilai X2 adalah: x2 = %0.2f", sumX2);
 printf("\nNilainya adalah: a=%0.2f and b = %0.2f",a,b);
 printf("\nPersamaan regresinya adalah: y = %0.2f + %0.2fx",a,b);
 getch();
 
 return(0);
 
}
