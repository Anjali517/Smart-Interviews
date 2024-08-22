import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int mod=(int)1e9+7;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            long dp[][]=new long[n][m];
            int f=sc.nextInt();
            int a=0,b=0;
            for(int k=0;k<f;k++)
            {
                
                a=sc.nextInt();
                b=sc.nextInt();
                dp[a][b]=-1;
            }
            int i,j,s=1;
            for(i=0;i<n;i++)
            {
                if(dp[i][0]==-1)
                {
                    s=-1;
                }
                dp[i][0]=s;
            }
            s=1;
            for(j=0;j<m;j++)
            {
                if(dp[0][j]==-1)
                {
                    s=-1;
                }
                dp[0][j]=s;
            }
            
           
            
            
            for(i=1;i<n;i++)
            {
                for(j=1;j<m;j++)
                {
                    if(dp[i][j]!=-1)
                    {
                        dp[i][j]=(((dp[i-1][j]==-1)?0:dp[i-1][j])+((dp[i][j-1]==-1)?0:dp[i][j-1])+((dp[i-1][j-1]==-1)?0:dp[i-1][j-1]))%mod;
                    }
                    
                    }
                }
            
            //matrix
            /*for(i=0;i<n;i++)
            {
                for(j=0;j<m;j++)
                    System.out.print(dp[i][j]+" ");
                System.out.println();
            }*/
            
            if(dp[n-1][m-1]==-1)
                System.out.println(0);
            else
            System.out.println(dp[n-1][m-1]);
            
            t--;
        }
        
        
    }
}
