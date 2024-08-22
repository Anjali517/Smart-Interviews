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
            int n=sc.nextInt();
            int a[]=new int[n];
            int i;
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int j;
            for(i=0;i<n;i++)
            {
                if(a[i]<=0 || a[i]>=n+1)
                {
                    a[i]=n+2;
                }
                
            }
            for(i=0;i<n;i++)
            {
                int v=Math.abs(a[i]);
                if(v!=n+2 && a[v-1]>0)
                    a[v-1]=-1*a[v-1];
            }
         /*   for(i=0;i<n;i++)
       {
  
               System.out.print(a[i]+" ");
    
       }
            System.out.println();*/
            
       for(i=0;i<n;i++)
       {
           if(a[i]>0){
               System.out.println(i+1);
               break;
       }}
            t--;
        }
    }
}
