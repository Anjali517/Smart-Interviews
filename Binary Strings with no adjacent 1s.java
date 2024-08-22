import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int dp0[]=new int[100001];
        int dp1[]=new int[100001];
        dp0[0]=0;
        dp1[0]=0;
        dp0[1]=1;
        dp1[1]=1;
        int i;
        for(i=2;i<100001;i++)
        {
            dp0[i]=(dp0[i-1]+dp1[i-1])%1000000007;
            dp1[i]=dp0[i-1];
        }
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            
            System.out.println((dp0[n]+dp1[n])%1000000007);
            t--;
        }
    }
}
