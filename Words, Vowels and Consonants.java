t=int(input())
for j in range(t):
    n=input()
    w=0
    v=0
    c=0
    w=len(n.split())
    for i in range(len(n)):
        if (n[i]>='A' and n[i]<='Z') or (n[i]>='a' and n[i]<='z'):
            if n[i]=='A' or n[i]=='E' or n[i]=='I' or n[i]=='O' or n[i]=='U' or n[i]=='a' or n[i]=='e' or n[i]=='i' or n[i]=='o' or n[i]=='u':
                v+=1
            else:
                c+=1
    
    print(w,v,c)
