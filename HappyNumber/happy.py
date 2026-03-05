

n=int(input())
s=set()
while n!=1 and n not in s:
    s.add(n)
    n=sum(int(i)**2 for i in str(n))
if n==1:
    print('true')
else:    print('false')