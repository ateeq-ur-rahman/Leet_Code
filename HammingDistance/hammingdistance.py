x=int(input())
y=int(input())
# a=bin(x)[2:]
# b=bin(y)[2:]
# a=a.zfill(max(len(a),len(b)))
# b=b.zfill(max(len(a),len(b)))
# count=0
# for i in range(len(a)):
#     if a[i]!=b[i]:
#         count+=1
# print(count)

c=0
while(x!=y):
    if((x&1)!=(y&1)):
        c+=1
    x=x>>1
    y=y>>1
print(c)