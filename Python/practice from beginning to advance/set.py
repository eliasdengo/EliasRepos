#collection element it is unordered

setoffruit={"banana","orange","ananaus","mango"}
print(setoffruit);

for x in setoffruit:
    print(x)
    
print("banana" in setoffruit);

setoffruit.add("tomato");
print(setoffruit);

setoffruit.discard("mango")
setoffruit.remove("banana")
setoffruit.pop();
print(setoffruit);

setoffruit.clear();
print(setoffruit);

#constructor
setoffruit= set(("banana","orange","ananaus","mango"))
print(setoffruit);