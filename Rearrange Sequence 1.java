import java.io.*;
import java.util.*;

public class Solution {
    public static int rearrange(int a[],int n)
    {
        int c,b,i,j;
        int ans=0;
        for(i=0;i<n;i++)
        {
            c=a[i];
            b=a[i];
            for(j=i;j<n;j++)
            {
                if(a[j]>c)
                    c=a[j];
                if(a[j]<b)
                    b=a[j];
                if(j-i==c-b)
                    if(ans<c-b+1)
                        ans=c-b+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            int n,i;
            n=sc.nextInt();
            int a[]=new int[n];
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.println(rearrange(a,n));
            t--;
        }
        
    }
}
