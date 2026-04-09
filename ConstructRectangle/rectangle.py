area=int(input())
w=int(area**0.5)

while w>0:
    if area%w==0:
        l=area//w
        print([l,w])
        break
    w-=1
