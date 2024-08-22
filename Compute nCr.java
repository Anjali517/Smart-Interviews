import java.io.*;
import java.util.*;

public class Solution {

    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        long dp[][]=new long[2001][2001];
        int i,j;
        //dp[0][0]=1;
        for(i=0;i<2001;i++)
            dp[i][0]=1;
        for(j=1;i<2001;j++)
            dp[0][j]=0;
        for(i=1;i<2001;i++)
        {
            for(j=1;j<2001;j++)
            {
                dp[i][j]=(dp[i-1][j]+dp[i-1][j-1])%1000000007;
            }
        }
        while(t>0)
        {
            System.out.println(dp[sc.nextInt()][sc.nextInt()]);
            t--;
        }
        
        
        
        
    }
}
