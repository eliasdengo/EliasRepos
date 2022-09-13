# lambda argument:expression

x= lambda a:a+10
print(x(5))


y = lambda a , b : a * b
print(y(5,6))


z = lambda a , b , c : a + b + c
print(z(3,4,5))

# lambda inside the function

def product(n):
    return lambda a:a*n

pro = product(5)
res = product(10)

print(pro(6))
print(res(6))