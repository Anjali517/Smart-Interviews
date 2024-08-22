import java.io.*;
import java.util.*;

public class Solution {
   
    public static int countZeros(long a[],int n)
    {
        int i,count=0;
        for(i=0;i<n;i++)
        {
            if(a[i]==0)
                count++;
        }
        return count;
    }
  
    public static void main(String[] args) {
        
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        
        while(t>0)
        {
            int n=sc.nextInt();
            int i;
            long a[]=new long[n];
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextLong();
            }
            int z=countZeros(a,n);
        int mod=1000000000+7;
        long pp[]=new long[n];
        long sp[]=new long[n];
        pp[0]=a[0];
        sp[n-1]=a[n-1];
        for(i=1;i<n;i++)
        {
            pp[i]=(pp[i-1]*a[i])%mod;
        }
        for(i=n-2;i>=0;i--)
        {
            sp[i]=(sp[i+1]*a[i])%mod;
        }
            a[0]=sp[1];
            a[n-1]=pp[n-2];
            
            //long product=1;
            
            if(z==1)
            {
               for(i=1;i<n-1;i++)
               {   if(a[i]!=0)
                   a[i]=(sp[i+1]*pp[i-1])%mod;
                else
                    a[i]=0;
               }
            }
            else if(z==0)
            {
                for(i=1;i<n-1;i++)
                {
                        a[i]=(sp[i+1]*pp[i-1])%mod;
                    }
                
                }
            
            else
            {
                for(i=0;i<n;i++)
               {
                   a[i]=0;
               }
            }
            for(i=0;i<n;i++)
               {
                   System.out.print(a[i]+" ");
               }
            System.out.println();
                
            
            

            t--;
        }
    }
}
