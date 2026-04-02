n=int(input())

i=0
while 3**i<n:
    i+=1
if 3**i==n:
    print("True")
else:
    print("False")