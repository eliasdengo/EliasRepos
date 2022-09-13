import datetime
x=datetime.datetime.now()
print(x)
print(x.year)
print(x.strftime("%H"))

y=datetime.datetime(2015,1,2)  #we can provide as we want formate of date
print(y)
print(y.year)
print(y.strftime("%a")) #we can date assign in the form of "%a" or "%A"