a=list(map(int,input().split()))
a[-1]=a[-1]+1
for i in range(len(a)-1,-1,-1):
    if a[i]==10:
        a[i]=0
        if i-1>=0:
            a[i-1]=a[i-1]+1
    else:
        break
if a[0]==0:
    a.insert(0,1)
print(a)