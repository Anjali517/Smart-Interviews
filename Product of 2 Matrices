import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t,i,j,a[][],b[][],c[][];
        //Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            int m,n,p,q,k;
            m=sc.nextInt();
            n=sc.nextInt();
            a=new int[m][n];
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                a[i][j]=sc.nextInt();
            }
            p=sc.nextInt();
            q=sc.nextInt();
            b=new int[p][q];
            c=new int[m][q];
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                b[i][j]=sc.nextInt();
            }
            for(i=0;i<m;i++)
            {
                for(j=0;j<q;j++)
                { c[i][j]=0;
                    for(k=0;k<n;k++)
                    {
                        c[i][j]=c[i][j]+a[i][k]*a[k][j];
                    }
                    System.out.print(c[i][j]+" ");
                }
             System.out.println();
            }
            t--;
        }
    }
}
