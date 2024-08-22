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
            int i,j,temp;
            for(i=0;i<n;i++)
             a[i]=sc.nextInt();
            
            for(i=1;i<n;i++)
            {
                temp=a[i];
                j=i-1;
                while(j>=0 && a[j]>temp)
                {
                    a[j+1]=a[j];
                    j-=1;
                }
                a[j+1]=temp;
                System.out.print((j+1)+" ");
            }
            /*for(i=0;i<n;i++)
         System.out.print(a[i]+" ");*/
            System.out.println();
            
            t--;
        }
    }
}
