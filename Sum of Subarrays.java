import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static long solve(int a[],int l,int k,int n)
    {   int i;
        long h[]=new long[n];
            h[0]=a[0];
            for(i=1;i<n;i++)
                h[i]=a[i]+h[i-1];
            if(l==0)
            return h[k];
            else
                return (h[k]-h[l-1]);
            
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i;
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        int q;
        q=sc.nextInt();
        while(q>0)
        {
            int l,k;
            l=sc.nextInt();
            k=sc.nextInt();
            System.out.println(solve(a,l,k,n));
            
            q--;
        }
        
    }
}
