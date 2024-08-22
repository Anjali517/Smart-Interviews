import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            int n,m;
            n=sc.nextInt();
            m=sc.nextInt();
            int i,j;
            int cost[][]=new int[n][m];
            for(i=0;i<n;i++)
            {
                for(j=0;j<m;j++)
                    cost[i][j]=sc.nextInt();
            }
            int dp[][]=new int[n][m];
            dp[0][0]=cost[0][0];
            for(j=1;j<m;j++)
                dp[0][j]=cost[0][j]+dp[0][j-1];
            for(i=1;i<n;i++)
                dp[i][0]=cost[i][0]+dp[i-1][0];
                
            for(i=1;i<n;i++)
            {
                for(j=1;j<m;j++)
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1])+cost[i][j];
                }
            }
            
            
            System.out.println(dp[n-1][m-1]);
            t--;
        }
        
        
    }
}
