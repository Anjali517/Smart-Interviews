import java.io.*;
import java.util.*;

public class Solution {
    public static boolean checkBit(int n,int i)
    {
      
        if(((n>>i)&1)==1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
                  int i,j;
            int n=sc.nextInt();
            int a[]=new int[n];
            for(i=0;i<n;i++)
                a[i]=sc.nextInt();
      
            int c=0;
            long ans=0;
            for(i=0;i<32;i++)
            {   c=0;
                for(j=0;j<n;j++)
                {
                    if(checkBit(a[j],i)){
                        ans+=(n-j)*(c+1)*(1l<<i);
                        
                    }
            }}
            System.out.println(ans);
            t--;
        }
        
        
    }
}
