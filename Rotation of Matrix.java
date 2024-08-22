import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t,i,j;
        int k;
        t=sc.nextInt();
        k=1;
        while(k<=t)
        {
            int m,n;
      
            n=sc.nextInt();
            int a[][]=new int[n][n];
            int b[][]=new int[n][n];
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                a[i][j]=sc.nextInt();
                
            }
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                b[i][j]=a[j][i];
            }
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    a[i][j]=b[j][n-i-1];
                }
            }
            System.out.println("Test Case #"+k+":");
            
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                    System.out.print(a[j][i]+" ");
                    System.out.println();
                
            }
            
            //System.out.println();
            k++;
            
        }
    }
}
