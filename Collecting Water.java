import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n;
            n=sc.nextInt();
            int i;
            long ans=0;
            int a[]=new int[n];
            for(i=0;i<n;i++)
                a[i]=sc.nextInt();
        int preMax[]=new int[n];
        int sufMax[]=new int[n];
            preMax[0]=a[0];
            for(i=1;i<n;i++)
                preMax[i]=Math.max(preMax[i-1],a[i]);
            sufMax[n-1]=a[n-1];
            for(i=n-2;i>=0;i--)
                sufMax[i]=Math.max(sufMax[i+1],a[i]);
            for(i=0;i<n;i++)
                a[i]=Math.min(preMax[i],sufMax[i])-a[i];
            for(i=0;i<n;i++)
                ans+=a[i];
            System.out.println(ans);
            
            t--;
    }}
}
