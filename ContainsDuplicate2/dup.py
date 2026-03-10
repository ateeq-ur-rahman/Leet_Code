a=list(map(int,input().split()))
k=int(input())

d={}

for i in range(len(a)):
    if a[i] in d:
        if i-d[a[i]]<=k:
            print("true")
            break
        else:
            d[a[i]]=i
    else:
        d[a[i]]=i
else:    print("false")

#Optmized solution

