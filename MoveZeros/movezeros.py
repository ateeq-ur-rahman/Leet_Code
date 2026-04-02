a=list(map(int,input().split()))

s=0
for i in range(len(a)):
    if a[i]!=0 and a[s]==0:
        a[i],a[s]=a[s],a[i]
    if a[s]!=0:
        s+=1
print(a)