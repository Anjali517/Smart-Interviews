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
            int k;
            int n=sc.nextInt();
            int a[]=new int[n];
            int temp[]=new int[n];
         for(k=0;k<n;k++)
             temp[k]=0;
            for(k=0;k<n;k++)
            {
                a[k]=sc.nextInt();
            }
         int q=sc.nextInt();
        
         for(k=0;k<q;k++)
         {
             int i,j,x;
             i=sc.nextInt();
             j=sc.nextInt();
             x=sc.nextInt();
             temp[i]=temp[i]+x;
             if(j<n-1)
             temp[j+1]=temp[j+1]+(x*-1);
         }
         
        
             
             for(k=0;k<n;k++)
             {   
                 if(k!=0)
                     temp[k]=temp[k]+temp[k-1];
             }
         
        
         int max=Integer.MIN_VALUE;
         for(k=0;k<n;k++){
                 a[k]=a[k]+temp[k];
                 if(a[k]>max)
                     max=a[k];
         }
         System.out.println(max);
         t--;
        }
    }
}
