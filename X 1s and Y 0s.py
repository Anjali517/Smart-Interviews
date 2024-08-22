t=int(input())
for i in range(t):
    x,y=map(int,input().split())
    print((((1<<x)-1)<<y)%1000000007)
    
