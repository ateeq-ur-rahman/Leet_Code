a=input()
c=0
for i in range(len(a)):
    if a[i] not in a[i+1:] and a[i] not in a[:i]:
        print(i)
        break

