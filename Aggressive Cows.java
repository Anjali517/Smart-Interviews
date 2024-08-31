import java.io.*;
import java.util.*;

public class Solution {
    static int solve(int a[],int n,int k)
    {
        int l=1;
        int h=a[n-1]-a[0];
        int ans=0;
        while(l<=h)
        {
            int mid=l+(h-l)/2; 
            if(valid(a,n,k,mid))
            {
                ans=mid;
                l=mid+1;
            }
            else
                h=mid-1;
        }
        return ans;
    }
    static boolean valid(int a[],int n,int k,int mid)
    {   int cnt=1;
        int prev=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]-prev>=mid)
            {
                cnt+=1;
                prev=a[i];
            }
        }
     return cnt>=k;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t>0)
        {  
            int i,j;
            int n=sc.nextInt();
            int k=sc.nextInt();
         int a[]=new int[n];
            for(i=0;i<n;i++)
                a[i]=sc.nextInt();
         for(i=1;i<n;i++)
         {
             int temp=a[i];
             j=i-1;
             while(j>=0 && a[j]>temp)
             {
                 a[j+1]=a[j];
                 j--;
             }
             a[j+1]=temp;
         }
         
         System.out.println(solve(a,n,k));
         
         
         
         
         
            t--;
        }
    }
}
