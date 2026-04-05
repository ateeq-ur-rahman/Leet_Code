a=set(list(map(int,input().split())))
a=list(a)
a.sort()
if len(a)<3:
    print(a[-1])
else:
    print(a[-3])

