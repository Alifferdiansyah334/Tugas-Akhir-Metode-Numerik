# Table Method
# Author : @Alifferdyansyah

import numpy as np

#Define function F(x) // Line 21 - 23 Can be Modified for Function Defining
print(" x+e^x ") 

#User Input [ X1 Lower Bound ] - [ X2 Upper Bound ] - [ N Max_iter ]
x1 = float(input("Masukkan Batas Bawah : "))
x2 = float(input("Masukkan Batas Atas : "))
N = float(input("Masukkan Banyaknya iterasi yang terjadi : "))

h = (x2 - x1) / N
i = 0

hasil = 0
print("i     x       f(x)")

while (i <= N and x1 < x2):
  x = x1 + (i * h)
  fx1 = (x + (np.exp(1) ** x)) #Inserting x1 Value to function of f(x) Or Simply ( x1 + exponent value ^ x1 ) // np.exp exporting exponent value
  fx2 = ((x+1) + (np.exp(1) ** (x+1))) #Incrementing Value of 1 per Iter_happen

  if (fx1 == 0) :
    hasil = x
  elif (fx1 * fx2) < 0 :
    if abs(fx1) < abs(fx2):
      hasil = x
    else:
      hasil = (x + 1)
  print(i,round(x,2)," "," ",round(fx1,7))
  i = i + 1

if x1 > x2:
  print("Batas atas harus lebih kecil dari batas bawah")
else:
  print("Hasil berada diantara ",round(hasil,2)," dan ",round(hasil + 0.01,2))

  