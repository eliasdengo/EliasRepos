#collection :counter,namedtuple,orderDict,defaultdict,deque

from collections import Counter, defaultdict, deque
a="bbbaaaaaadsddsdsdsd"
my_counter=Counter(a)
print(my_counter)
print(my_counter.most_common(1))

d=defaultdict(int)
d["a"]=1
d["b"]=2
d["c"]=3

print(d)

d=deque()
d.append(1)
d.append(2)
d.append(3)
d.appendleft(4)
print(d)
d.pop()
print(d)
d.popleft()
print(d)
d.clear()
print(d)
d.extendleft([4,5,6,7])
print(d)
d.rotate(2)
print(d)