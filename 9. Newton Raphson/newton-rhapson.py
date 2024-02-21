## Defining Function f(x)
def f(x):
    return 4*x**3 - 15*x**2 + 17*x - 6

# Defining derivative of function f'(x) or g(x)
def g(x):
    return 12*x**2 - 30 * x + 17

# Implementing Newton Raphson Method
def newtonRaphson(x0,e,N):
    print('\n\n** NEWTON RAPHSON METHOD IMPLEMENTATION **')
    step = 1
    flag = 1
    condition = True
    while condition:
        if g(x0) == 0.0:
            print('Divide by zero error!')
            break
        
        x1 = x0 - f(x0)/g(x0)
        print('Iterasi ke-%d, x1 = %0.6f and f(x1) = %0.6f' % (step, x1, f(x1)))
        x0 = x1
        step = step + 1
        
        if step > N:
            flag = 0
            break
        
        condition = abs(f(x1)) > e
    
    if flag==1:
        print('\nAkar persamaan yang dicari adalah : %0.8f' % x1)
    else:
        print('\nTidak Konvergent.')


# Input Section
x0 = input('Masukkan Nilai Guess (Xn) : ')
e = input('Masukan Nilai Epsilon : ')
N = input('Maksimum iterasi : ')

# Converting x0 and e to float
x0 = float(x0)
e = float(e)

# Converting N to integer
N = int(N)


#Note: You can combine above three section like this
# x0 = float(input('Enter Guess: '))
# e = float(input('Tolerable Error: '))
# N = int(input('Maximum Step: '))

# Starting Newton Raphson Method
newtonRaphson(x0,e,N)