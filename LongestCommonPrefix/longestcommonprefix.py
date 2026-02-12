"""a=list(map(str,input().split()))

s=""

for i in range(len(a[0])):
    for j in range(1,len(a)):
        if i>=len(a[j]) or a[j][i]!=a[0][i]:
            print(s)
            exit()
    s+=a[0][i]"""


#Optimized code

a=list(map(str,input().split()))

res=""
for i in range(len(a[0])):
    for s in a:
        if i==len(s) or s[i]!=a[0][i]:
            print(res)
            exit()
    res+=a[0][i]
print(res)