"""a=list(map(str,input().split()))

s=""

for i in range(len(a[0])):
    for j in range(1,len(a)):
        if i>=len(a[j]) or a[j][i]!=a[0][i]:
            print(s)
            exit()
    s+=a[0][i]"""
s=input()
if s==None:
    print("")