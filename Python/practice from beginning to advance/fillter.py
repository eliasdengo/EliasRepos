a=[1,2,3,4,5,6,7,8]

b=filter(lambda x:x%2==0,a)
print(list(b))

print("-----------------------------------------------------")

c=[x for x in a if x%2==0]
print(c)