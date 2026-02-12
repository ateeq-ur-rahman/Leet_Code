x=input()

c=0

d={'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000,'IV': 4, 'IX': 9, 'XL': 40, 'XC': 90, 'CD': 400, 'CM': 900}

i=0
while i<len(x):
    if x[i:i+2] in d:
        c+=d[x[i:i+2]]
        i+=2
    else:
        c+=d[x[i]]
        i+=1
print(c)