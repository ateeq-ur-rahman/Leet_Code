n=int(input())

for i in range(31):
    if n==2**i:
        print("True")
        break
else:    print("False")