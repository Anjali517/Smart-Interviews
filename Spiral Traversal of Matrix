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
            int a[][]=new int[n][n];
            int i,j;
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            int tr=0,tc=0,br=n-1,bc=n-1;
            while(tr<=br && tc<=bc)
            {
                
                for(j=tc;j<=bc;j++){
                    System.out.print(a[tr][j]+" ");
                }
                tr++;
                for(i=tr;i<=br;i++)
                {
                    System.out.print(a[i][bc]+" ");
                }
                bc--;
                for(j=bc;j>=tc;j--)
                {
                    System.out.print(a[br][j]+" ");
                }
                br--;
                for(i=br;i>=tr;i--)
                {
                    System.out.print(a[i][tc]+" ");
                }
                tc++;
            }
            System.out.println();
            
            t--;
        }
    }
}
