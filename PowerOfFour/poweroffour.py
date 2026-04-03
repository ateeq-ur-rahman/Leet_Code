n=int(input())
i=0

while 4**i<n:
    i+=1
if 4**i==n:
    print("True")
else:
    print("False")