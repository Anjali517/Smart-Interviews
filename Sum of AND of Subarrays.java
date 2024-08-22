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
            long ans=0;
            for(i=0;i<n;i++)
            {
                long or=a[i];
                for(j=i;j<n;j++)
                {
                    or=or&a[j];
                    ans=ans+or;
                }
            }
            System.out.println(ans);
            t--;
        }
        
        
    }
}
