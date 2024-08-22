import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {   int k;
         long sum=0;
            int n=sc.nextInt();
            int a[]=new int[n];
            for(k=0;k<n;k++)
            {
                a[k]=sc.nextInt();
                sum+=a[k];
            }
         int q=sc.nextInt();
        
         for(k=0;k<q;k++)
         {
             long i,j;
             int x;
             i=sc.nextLong();
             j=sc.nextLong();
             x=sc.nextInt();
             
             sum=sum+(j-i+1)*x;
             //System.out.println("m="+m);
                          
         }
         System.out.println(sum);
         t--;
        }
    }
}
