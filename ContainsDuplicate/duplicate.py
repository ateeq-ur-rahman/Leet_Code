# a=list(map(int,input().split()))

# d={}

# for i in a:
#     if i in d:
#         d[i]+=1
#     else:
#         d[i]=1

# for i,j in d.items():
#     if j>1:
#         print("True")
#         break
# else:    print("False")

#Optimized Solution

a=list(map(int,input().split()))
s=set()
for i in a:
    if i in s:
        print("True")
        break
    s.add(i)
else:
    print("False")