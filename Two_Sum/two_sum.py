a=list(map(int,input().split()))
target=int(input())
seen={}

for i,num in enumerate(a):
    diff=target-num
    if diff in seen:
        print([seen[diff],i])
        break
    seen[num]=i
    
