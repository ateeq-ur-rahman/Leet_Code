timeseries=list(map(int,input().split()))
duration=int(input())

t=0

for i in range(len(timeseries)-1):
    g=timeseries[i+1]-timeseries[i]
    t+=min(g,duration)
print(t+duration )