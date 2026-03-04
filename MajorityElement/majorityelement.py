# a=list(map(int,input().split()))

# d={}

# for i in a:
#     if i in d:
#         d[i]+=1
#     else:
#         d[i]=1

# for i in d:
#     if d[i]>len(a)//2:
#         print(i)
#         break

#Optimize
a=list(map(int,input().split()))
d={}
for i in a:
    if i in d:
        d[i]+=1
    else:
        d[i]=1

    if d[i]>len(a)//2:
        print(i)
        break