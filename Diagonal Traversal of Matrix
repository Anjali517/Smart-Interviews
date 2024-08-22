import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t,n,i,j,a[][];
        t=sc.nextInt();
        while(t>0)
        {
            n=sc.nextInt();
            a=new int[n][n];
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                    a[i][j]=sc.nextInt();
            }
            int sum1[]=new int[n];
            int sum2[]=new int[n];
            int dsum=0;
            Arrays.fill(sum1,0);
            Arrays.fill(sum2,0);
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(i==j)
                        dsum=dsum+a[i][j];
                    else if(i<j)
                        sum1[j-i]+=a[i][j];
                    else
                        sum2[i-j]+=a[i][j];
                        
                }
               
            }
             for(i=sum1.length-1;i>=1;i--)
                    System.out.print(sum1[i]+" ");
                System.out.print(dsum+" ");
                for(i=1;i<sum2.length;i++)
                    System.out.print(sum2[i]+" ");
                System.out.println();
            t--;
        }
        
    }
}
