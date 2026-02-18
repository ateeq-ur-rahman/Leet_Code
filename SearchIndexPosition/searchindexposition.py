a=list(map(int,input().split()))
b=int(input())

if b in a:
    print(a.index(b))
else:
    for i in range(len(a)+1):
        if i == len(a) or a[i]>b:
            print(i)
            break
        