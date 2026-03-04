n=int(input())

b=bin(n)[2:]

c=0

for i in b:
    if i=='1':
        c+=1
print(c)