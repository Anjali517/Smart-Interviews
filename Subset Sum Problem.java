import java.io.*;
import java.util.*;

public class Solution {
    static int gsum=0;
    
    public static boolean check(int a[],int idx,int sum,Boolean dp[][])
    {
        
        if(idx==a.length && sum==gsum)
        {
            return true;
        }
        if(idx==a.length && sum!=gsum)
        {
            return false;
        }
        if(dp[idx][sum]!=null)
            return dp[idx][sum];
            
        //exclude
        boolean nt=check(a,idx+1,sum,dp);
        //include
        boolean t=check(a,idx+1,sum+a[idx],dp);
        return dp[idx][sum]=nt||t;
        
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t>0)
        {
            
            int n=sc.nextInt();
            gsum=sc.nextInt();
            Boolean dp[][]=new Boolean[n][100001];
            int i;
            int a[]=new int[n];
            for(i=0;i<n;i++)
                a[i]=sc.nextInt();
            System.out.println(check(a,0,0,dp)?"YES":"NO"); 
            t--;
        }
        
        
    }
}
