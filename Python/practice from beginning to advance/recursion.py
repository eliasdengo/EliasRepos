def fact(n):
    if n > 1:
       n = n * fact(n-1)
    else:1
    return n

n=int(input("enter the number:"))
result=fact(n)
print("the result is "+ str(result))
    
    