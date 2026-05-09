n=int(input())
c=0
i=1
while n>=i:
    n-=c
    c+=1
    i+=1
print(c-1)