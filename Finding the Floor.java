import java.io.*;
import java.util.*;

public class Solution {
    static int floorVal(int a[],int x)
    {
        int ans=Integer.MIN_VALUE;
        
        
            int l=0,h=a.length-1,mid=0;
            while(l<=h)
            {
                mid=(l+h)/2;
                if(a[mid]==x)
                {
                    ans=a[mid];
                    return ans;
                }
                else if(a[mid]<x)
                {
                    ans=a[mid];
                    l=mid+1;
                }
                else
                    h=mid-1;
            
    }
    return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        
        int i;
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(i=1;i<n;i++)
        {
            int temp=a[i];
            int j=i-1;
            while(j>=0 && a[j]>temp)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
        int q=sc.nextInt();
        while(q>0)
        {
            int x=sc.nextInt();
            System.out.println(floorVal(a,x));
            q--;
            }
        
    }
}
