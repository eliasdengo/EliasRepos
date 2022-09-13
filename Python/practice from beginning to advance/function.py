def giveyourname():
    print("Elias")
    
def add():
    a = 4
    b = 9
    c = a + b
    print(c)
def addinput():
    a = int(input("enter the first number :"))
    b = int(input("enter the second number :"))
    c = a + b
    print(c)
    
    #pass parameter to the function
def print_name(name):
    print("your name is :"+name)
def area():
    l = float(input("enter the length:"))
    w = float(input("enter the width :"))
    a=l*w
    print("area is "+str(a))
    
    #return type in function or send data from function
def arear(l,w):
    a=l*w
    return a

def speed(d,t):
    s=d/t
    return s

#default aregument
def mycountry(country="Ethiopia"):
    print("your nationality is " + country)
    
def average(a,b=20,c=30,d=40,e=50):
   ava = (a+b+c+d+e)/5
   print(ava)
    
    
giveyourname()
add()
addinput() 
print_name("Elias")
area()

len=int(input("enter length:"))
width=int(input("enter width:"))
ar=arear(len,width)
print("the area of rectangle is:"+ str(ar))
sped=float(input("enter length:"))
time=float(input("enter width:"))
sp=arear(sped,time)
print("the speed is:"+ str(sp)) 
mycountry("Eritria")
mycountry("Isreal")
mycountry("Japan")
mycountry()

average(20)
average(20,30)
average(20,30,40)
average(20,30,40,50)
average(20,30,40,50,60)




