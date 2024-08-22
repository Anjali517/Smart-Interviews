import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static boolean pairsDiff(int a[],int k)
    {   if(k<0)
        k*=-1;
        int p=0,q=1;
            while(q<a.length)
            {  
                if(Math.abs(a[p]-a[q])==k && p!=q)
                    return true;
                else if(Math.abs(a[p]-a[q])<k)
                    q++;
                else 
                    p++;
            }
            return false;
            
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n,k,i,j,temp;
            n=sc.nextInt();
            k=sc.nextInt();
            int a[]=new int[n];
            for(i=0;i<n;i++)
                a[i]=sc.nextInt();
            for(i=1;i<n;i++)
            {
                j=i-1;
                 temp=a[i];
                while(j>=0 && a[j]>temp)
                {
                    a[j+1]=a[j];
                    j--;
                }
                a[j+1]=temp;
            }
            if(pairsDiff(a,k))
                System.out.println("true");
            else
                System.out.println("false");
            
            t--;
        }
        
        
    }
}
