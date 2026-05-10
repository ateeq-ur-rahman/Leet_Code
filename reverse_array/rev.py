a=list(map(str,input().split()))
for i in range(len(a)//2):
    j=len(a)-1-i
    a[i],a[j]=a[j],a[i]
print(*a)