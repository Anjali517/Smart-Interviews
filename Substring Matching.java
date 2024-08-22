import java.io.*;
import java.util.*;

public class Solution {
    public static boolean solve(String a,String b,int i,int j,int k,int l,long ha[],long hb[],long pwr[])
    {
        int m=b.length(),n=a.length(),z;
        long mod=(long)(1e9+7);

       
        long hashA=0,hashB=0;
        if(i!=0)
        hashA=((ha[j]-ha[i-1]+mod)%mod);
        else
        hashA=ha[j]%mod;
        if(k!=0)
        hashB=((hb[l]-hb[k-1]+mod)%mod);
        else
            hashB=hb[l]%mod;
        
        if(i>k)
            hashB=(hashB*pwr[i-k])%mod;
        else
            hashA=(hashA*pwr[k-i]%mod);
        if(hashA==hashB)
            return true;
        return false;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            String a,b;
            int m,n;
            a=sc.next();
            b=sc.next();
            int q=sc.nextInt();
            
               int z;
        long mod=(long)(1e9+7);
                m=b.length();
                n=a.length();
         int limit=(Math.max(m,n))+1;
        long pwr[]=new long[limit];
        pwr[0]=1;
        int pr=31;
        for(z=1;z<limit;z++)
        {
            pwr[z]=(pwr[z-1]*pr)%mod;
        }
                
                
                
        long ha[]=new long[n];
        long hb[]=new long[m];
        ha[0]=a.charAt(0)*pwr[1]%mod;
        hb[0]=b.charAt(0)*pwr[1]%mod;
                 for(z=1;z<n;z++)
        {
            ha[z]=(ha[z-1]+(a.charAt(z)*pwr[z+1])%mod)%mod;
        }
        for(z=1;z<m;z++)
        {
            hb[z]=(hb[z-1]+(b.charAt(z)*pwr[z+1])%mod)%mod;
        }
                
                for(m=0;m<q;m++)
            {
                int i,j,k,l;
                i=sc.nextInt();
                j=sc.nextInt();
                k=sc.nextInt();
                l=sc.nextInt();
                
                if(solve(a,b,i,j,k,l,ha,hb,pwr))
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
            
            
            t--;
        }
        
        
    }
}
