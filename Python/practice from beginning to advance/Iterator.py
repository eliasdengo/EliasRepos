#iterator:peoduct,permutation,combination,accumulate,groupby,and infinite iterator

#from ast import operator
from audioop import mul
from itertools import accumulate, combinations, combinations_with_replacement, groupby, permutations, product,count,cycle,repeat
#import operator
a=[2,3]
b=[4,5]

pro=product(a,b,repeat=2)
print(list(pro))
print("................................................")
c=[1,2,3]
per=permutations(c,2) #number of letter specify number which means length
print(list(per))
print("................................................")

d=[1,2,3,4]
com=combinations(d,2)
print(list(com))
print("................................................")

com_wr=combinations_with_replacement(d,2)
print(list(com_wr))

print("................................................")

e=[6,7,8,9]
acc=accumulate(e)
print(e)
print(list(acc))

print("................................................")

f=[1,2,3,4,5]

def smaller_than_3(x):
    return x<4
group_obj=groupby(f,key=lambda x:x<4) # we can use  -smaller_than_3- function or lambda function -lambda x:x<4-

for key,value in group_obj:
    print(key,list(value))
    
print("................................................")

person=[{"name":"Elias","age":25,"cgp":3.89},{"name":"zekarias","age":25,"cgp":3.87},{"name":"dave","age":24,"cgp":3.76},{"name":"Abedi","age":26,"cgp":3.89}]

g_by=groupby(person, key=lambda x:x["age"])

for key,values in g_by:
    print(key,list(values))

print("................................................")
for i in count(10):
    print(i)
    if i==20:  # with out if and breAK statement it will provide infinite loop
        break
print("................................................")

a=[1,2,3,4]

for i in cycle(a):
    print(i)
    
print("................................................")

for i in repeat(2,4): # if not has 4 it will be infinite repeat but ,4 means four time only repeat
    print(i)
    
    

