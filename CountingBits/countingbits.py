n=int(input())
a=[]
for i in range(n+1):
    j=bin(i).count("1")
    a.append(j)
print(a)

#Optimal Solution
