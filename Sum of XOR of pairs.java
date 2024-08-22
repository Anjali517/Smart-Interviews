import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int i,j;
            for(i=0;i<n;i++)
                a[i]=sc.nextInt();
            long sum=0;
            for(i=0;i<n;i++)
            {
                for(j=i+1;j<n;j++)
                {
                    sum=sum+((long)a[i]^a[j]);
                }
            }
            System.out.println(sum*2);
        }
    }
}
