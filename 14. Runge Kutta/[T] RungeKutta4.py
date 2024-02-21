# RK-4 method python program 2nd derivative

# function to be solved
def f(x,y,z):
    return z

def g(x,y,z):
    return ((-0.5)*z) + ((-14)*y)

# RK-4 method
def rk4(x0,y0,z0,xn,h):
    
    # Calculating step size
    n = int((xn-x0)/h)
      
    print('x0\ty0\tyn\tz0\tzn')

    for i in range(n):
        k1 = h * (f(x0, y0, z0))
        l1 = h * (g(x0, y0, z0))
        k2 = h * (f((x0+h/2), (y0+k1/2), (z0 + l1/2)))
        l2 = h * (g((x0+h/2), (y0+k1/2), (z0 + l1/2)))
        k3 = h * (f((x0+h/2), (y0+k2/2), (z0 + l2/2)))
        l3 = h * (g((x0+h/2), (y0+k2/2), (z0 + l2/2)))
        k4 = h * (f((x0+h), (y0+k3), (z0 + l3)))
        l4 = h * (g((x0+h), (y0+k3), (z0 + l3)))
        k = (k1+2*k2+2*k3+k4)/6
        l = (l1+2*l2+2*l3+l4)/6
        yn = y0 + k
        zn = z0 + l
        print('\n%.4f\t%.4f\t%.4f\t%.4f\t%.4f'% (x0,y0,yn,z0,zn) )
        print('--------------------------------------')
        y0 = yn
        z0 = zn
        x0 = x0+h
    
    print('\nAt x=%.4f, y=%.4f, z=%.4f' %(xn,yn,zn))

# Inputs
print('Enter initial conditions:')
x0 = float(input('x0 = '))
y0 = float(input('y0 = '))
z0 = float(input('z0 = '))

print('Enter calculation point: ')
xn = float(input('xn = '))

print('Enter number of steps:')
interval = float(input('Number of interval = '))

# RK4 method call
rk4(x0, y0, z0, xn, interval)