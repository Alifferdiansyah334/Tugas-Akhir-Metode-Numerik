# Regula Falsi Method
# Author : @Alifferdyansyah

import numpy as np

#Function Defining
#Line 9 Can Be Modified for function Defining
def fx(x):
  return x**3 - 7*x + 1

# ( User Input [a = LowerBound], [b = UpperBound], [e = epsilon Value], [N = Max_iter] ) 
a = float(input("Masukkan Batas Bawah : "))
b = float(input("Masukkan Batas Atas : "))
e = float(input("Masukkan Toleransi Error : "))
N = float(input("Masukkan jumlah Iterasi : "))

# iter_counter
it = 0
# function inserting
y1 = fx(a)
y2 = fx(b)
# Regula falsi Method for finding [ x Value ]
xr = ((fx(b)*a) - (fx(a)*b)) / (fx(b)-fx(a))

if(y1 * y2 > 0):
  print("\nf(a) x f(b) > 0, akar tidak ditemukan")
else:
  print("\nIt\t a\t\t xr \t\t b \t\t f(a)\t\t f(b)\t\t f(xr)")
  while (it<=N and abs((fx(xr)))>e):
    it = it + 1
    xr = ((fx(b)*a) - (fx(a)*b)) / (fx(b) - fx(a))
    y3 = fx(xr)
    print("%d\t%f\t%f\t%f\t%f\t%f\t%f" %(it,a,xr,b,fx(a),fx(b), abs(fx(xr))))
    if(fx(xr) * fx(a) < 0):
      b = xr
      y2 = y3
    else:
      a = xr
      y1 = y3
  if(it <= N):
    print("\npenyelesaian adalah x=%f dengan error %f" %(xr,abs(fx(xr))))
  else:
    print("\npenyelesaian tidak ditemukan")