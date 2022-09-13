#list,set,array,dictionary -collection

listofcollection=["abebe","alemu","zeleke","yakob",1,2,3,4];
print(listofcollection);
print(listofcollection[2]);
listofcollection[1]="Elias";   #to change value of list
print(listofcollection);

for x in listofcollection:
    print(x);   #for printing each of list
    
print(len(listofcollection)); #to determine length of list 

listofcollection.append("yabi"); #to append data into list
print(listofcollection); 

listofcollection.insert(2,"alex"); #insert into specific position
print(listofcollection); 

listofcollection.remove("alex"); #toremove specific value from list
print(listofcollection); 

listofcollection.pop(); #remove from the last item
print(listofcollection);

listofcollection.pop(0);
print(listofcollection);

del listofcollection[0]; #delete from list at specific position
print(listofcollection);

print(listofcollection[::2])

#list sclicing 
print(listofcollection[2:5]);
print(listofcollection[0:2]);


listofcollection.clear(); #to  remove data from the list
print(listofcollection);
"""del listofcollection; #totally delete from memory space so we can't find data
print(listofcollection);"""