a=list(map(int,input().split()))
b=[]
for i in range(len(a)):
    for j in range(i+1,len(a)):
        if a[i]<a[j]:
           b.append(a[j]-a[i])
if len(b)==0:
    print(0)
else:    print(max(b))


#Optimize above coee
a=list(map(int,input().split()))
min_price=a[0]
max_profit=0
for i in range(1,len(a)):
    if a[i]<min_price:
        min_price=a[i]
    elif a[i]-min_price>max_profit:
        max_profit=a[i]-min_price
print(max_profit)