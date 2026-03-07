s=input()
t=input()
if len(s)!=len(t):
    print("False")
else:
    d={}
    for i in range(len(s)):
        if s[i] in d:
            if d[s[i]]!=t[i]:
                print("False")
                break
            else:
                continue
        else:
            if t[i] in d.values():
                print("False")
                break
            else:
                d[s[i]]=t[i]
    else:
        print("True")