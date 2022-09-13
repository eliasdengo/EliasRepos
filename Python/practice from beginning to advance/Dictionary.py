
#dictionary is not order,changable,index

human={
    "eye":"2",
    "teath":"32",
    "nose":"2",
    "bodysize":"54",
    "hieght":"1.55"   
}

print(human);
#access single data from dictionary by key
x=human.get("eye");
y=human["bodysize"];

print(x)
print(y)

#we can change value of dictionary at particular position
human["hieght"]="1.60";
print(human)

#looping using for to execute each value from dictionary

for x in human:
    print(x);
    
for x in human.values():
        print(x);
        
for x in human.items():
        print(x);

print(len(human)); #length of dictionary


#removing ,deleting ,clearing ,pop.......
#human.remove("height")
#print(human)
del human["hieght"]
print(human)
human.popitem();
print(human);

human.pop("nose")  #pop particular postiion
#print(human)

human.clear()
print(human)


human=dict(eye="2",
    teath="32",
    nose="2",
    bodysize="54",
    hieght="1.55"   )     #constructer indictionary creation

print(human);


del human
print(human)