#Library Import
import numpy as np
import matplotlib.pyplot as plt

#User Input [y = function defining], [a = Lower Bounds], [b = Upper Bounds]
y = input('Masukkan persamaan fungsi x : ')

a = float((input('Masukkan nilai a : ')))
b = float((input('Masukkan nilai b : ')))

print('Akar persamaan adalah ', a, ' dan ', b)

#Importing User Input for Function Defining
def f(x):
  z = y.replace('x', str(x))
  return eval(z)

def biseksi(a, b, tot):
  n = 1
  if f(a) * f(b) > 0:
    print('Tidak Memiliki akar persamaan')
  else:
    while abs(b-a) > tot:
      x = (a + b)/2 
      print(n,'  \t', round(a, 4),'  \t', round(b, 4),'  \t', round(x, 4),'  \t', round(f(a), 4),'  \t', round(f(b), 4),'  \t', round(f(x), 4))

      if f(x) == 0:
       print('Akar Persamaan nya adalah ', x)
       break
      elif f(a) * f(x) < 0:
        b = x
      else:
        a = x
      n += 1
    
    print('Akar persamaanya adalah = ', round(a,11), ' dan ', round(b,11))

print('n\t a \t\t b \t\t xn \t\t f(a) \t\t f(b) \t\t f(xn)')
print('                                                   ')
biseksi(a, b, 0.0001)

#Graph
x = np.linspace(a, b)
plt.plot(x, eval(y))
plt.grid()
plt.show()

input('Tekan enter untuk keluar')


