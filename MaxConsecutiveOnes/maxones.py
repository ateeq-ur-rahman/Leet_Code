a=list(map(int,input().split()))
count=0

for i in range(len(a)):
    if a[i]==1:
        count+=1
    else:
        count=0
    a[i]=count
print(max(a))