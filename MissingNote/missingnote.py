from collections import Counter

a=input()
b=input()

c=Counter(a)
d=Counter(b)

if c&d==c:
    print("True")
else:
    print("False")
