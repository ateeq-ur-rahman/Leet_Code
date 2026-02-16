a=list(map(int,input().split()))
val=int(input())

i=0
while i<len(a):
    if a[i]==val:
        a.remove(a[i])
    else:
        i+=1
print(len(a))