try:
    a=5/0
except Exception as e:
    print(e)
    
    
    ############except more###########
    
    
try:
    a=5/1
    b=a+"10" # if it provided number it will execute nothing error occur it is ok
    
except ZeroDivisionError as e:
    print(e)
except TypeError as e:
    print(e)
else:
    print("nothing error occur it is ok")
finally:
    print("always print whether error occur or not")