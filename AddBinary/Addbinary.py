a=input()
b=input()
a=a[::-1]
b=b[::-1]
carry=0
r=""
for i in range(max(len(a),len(b))):
    x=0
    y=0
    if i<len(a):
        x=int(a[i])
    if i<len(b):
        y=int(b[i])
    s=x+y+carry
    r+=str(s%2)
    carry=s//2
if carry:
    r+=str(carry)
print(r[::-1])