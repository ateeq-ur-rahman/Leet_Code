n=int(input())
b=bin(n)[2:]
b=b[::-1]
b=b.ljust(32,'0')
print(int(b,2))