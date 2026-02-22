# a=int(input())
# b=1
# while b*b<=a:
#     b+=1
# print(b-1)


# Fastes

a=int(input())

r=a

while r*r>a:
    r=(r+a/r)/2
print(int(r))