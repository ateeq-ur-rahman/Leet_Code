# n=int(input())
# a=[]
# for i in range(n+1):
#     j=bin(i).count("1")
#     a.append(j)
# print(a)

# #Optimal Solution

n=int(input())
a=[]
a.append(0)
for i in range(1, n+1):
    a.append(a[i//2] + (i % 2))
print(a)