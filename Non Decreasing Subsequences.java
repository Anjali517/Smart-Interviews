import java.io.*;
import java.util.*;

public class Solution {
    static int dp[][];
    public static int solve(int a[],int n,int idx,int prev)
    {
        if(idx==n)
            return 1;
        if(dp[idx][prev+1]!=-1){
            System.out.println("im at "+idx+" "+prev);
            return dp[idx][prev+1];
        }
        int x=solve(a,n,idx+1,prev);
        int y=0;
        if(prev==-1 || a[idx]>=a[prev])
        {
            y=solve(a,n,idx+1,idx);
        }
        return dp[idx][prev+1]=(x+y)%1000000007;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            int n;
            n=sc.nextInt();
            int i,j;
            int a[]=new int[n];
            for(i=0;i<n;i++)
                a[i]=sc.nextInt();
            dp=new int[n][n];
            for(int[] s:dp)
                Arrays.fill(s,-1);
            System.out.println(solve(a,n,0,-1)-1);
            for(int b=0;b<n;b++)
            {
                for(int c=0;c<n;c++)
                    System.out.print(dp[b][c]+" ");
                System.out.println();
            }
            
             
            t--;
        }
    }
}
