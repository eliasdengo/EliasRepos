point2d=[(1,2),(3,4),(5,6),(7,8),(9,10),(5,-1)]

pointed2d_sorted=sorted(point2d,key=lambda x :x[0] + x[1])

print(point2d)
print(pointed2d_sorted)