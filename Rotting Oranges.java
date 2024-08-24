import java.io.*;
import java.util.*;
class Pair
{
    int t;
    int x;
    int y;
    Pair(int t,int x,int y)
    {
        this.t=t;
        this.x=x;
        this.y=y;
    }
}
public class Solution {
    static Queue<Pair> q;
    static int min=0;
    public static int bfs(int a[][])
    {
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                Pair z=q.poll();
        if(z.x+1<a.length && a[z.x+1][z.y]==1)
        {
            a[z.x+1][z.y]=2;
            q.add(new Pair(z.t+1,z.x+1,z.y));
        }
                
        if(z.x-1>=0 && a[z.x-1][z.y]==1)
        {
            a[z.x-1][z.y]=2;
            q.add(new Pair(z.t+1,z.x-1,z.y));
        }
                
        if(z.y+1<a[0].length && a[z.x][z.y+1]==1)
        {
            a[z.x][z.y+1]=2;
            q.add(new Pair(z.t+1,z.x,z.y+1));
        }
        if(z.y-1>=0 && a[z.x][z.y-1]==1)
        {
            a[z.x][z.y-1]=2;
            q.add(new Pair(z.t+1,z.x,z.y-1));
        }
                if(min<z.t)
                    min=z.t;
                
            }
            
    }
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]==1){
                    min=-1;
                    break;
            }}
        }
        return min;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int a[][]=new int[n][n];
            int i,j;
            min=0;
            for(i=0;i<n;i++)
            {
                String s=sc.next();
                for(j=0;j<n;j++)
                    a[i][j]=s.charAt(j)-'0';
            }
            q=new LinkedList<>();
            
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(a[i][j]==2)
                    {
                        q.add(new Pair(0,i,j));
                    }
                }
            }
            System.out.println(bfs(a));
            
            
            
            t--;
        }
    }
}
