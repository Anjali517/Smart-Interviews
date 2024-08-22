import java.io.*;
import java.util.*;

public class Solution {
    static Boolean dp[][];
    public static boolean lis(int a[],int idx,int sum,int k)
    {
        
        
        if(idx==a.length && sum!=0)
        {
            return sum%k==0;
        }
        if(idx==a.length && sum==0)
        {
            return false;
        }
        if(dp[idx][sum]!=null){
            return dp[idx][sum];
        }
        
        boolean nt=lis(a,idx+1,sum,k);
        boolean t=lis(a,idx+1,sum+a[idx],k);
        dp[idx][sum]=(nt||t);
        return dp[idx][sum];
            
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int i;
          
            int a[]=new int[n];
            int cnt=0;
            for(i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]==0)
                    cnt++;
            }
            dp=new Boolean[n][5000];
            
            if(cnt>0)
                System.out.println("Yes");
            else
            System.out.println(lis(a,0,0,k)?"Yes":"No");
        }
    }
}
