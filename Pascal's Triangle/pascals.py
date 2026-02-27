x=int(input())

p=[]

for i in range(x):
    if i==0:
        p.append([1])
    else:
        p.append([1]+[p[i-1][j]+p[i-1][j-1] for j in range(1,i)]+[1])
print(p)