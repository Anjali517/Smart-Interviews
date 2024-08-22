import java.io.*;
import java.util.*;

public class Solution {
    static int maxAr(int a[])
    {
        int max=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        return max;
    }
     static int sumAr(int a[])
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            
                sum+=a[i];
        }
        return sum;
    }
    static boolean valid(int a[],int n,int k,int mid)
    {
        int sum=0,cnt=1;
        for(int i=0;i<n;i++)
        {
            if(a[i]>mid)
                return false;
            sum+=a[i];
            if(sum>mid)
            {
                cnt+=1;
                sum=a[i];
                
            }
        }
        return cnt<=k;
    }
    static int solve(int a[],int n,int k)
    {
        int l=maxAr(a);
        int h=sumAr(a);
        int ans=0;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(valid(a,n,k,mid))
            {
                ans=mid;
                h=mid-1;
            }
            else
                l=mid+1;
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
            int n,k;
            n=sc.nextInt();
            int a[]=new int[n];
            k=sc.nextInt();
            int i;
            for(i=0;i<n;i++)
                a[i]=sc.nextInt();
            System.out.println(solve(a,n,k));
            
            
            
            t--;
        }
    }
}
