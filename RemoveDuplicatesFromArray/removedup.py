a=list(map(int,input().split()))
a.sort()

d=0
for  i in range(1,len(a)):
    if a[i]==a[i-1]:
        d+=1 
    else:
        a[i-d]=a[i]
print(a[:len(a)-d])