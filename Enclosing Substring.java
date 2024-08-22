import java.io.*;
import java.util.*;

public class Solution {
    public static boolean valid(int ca[],int cb[])
    {
        int i;
        /*for(i=0;i<26;i++)
                 System.out.print(ca[i]+" ");
        System.out.println();*/
        
        for(i=0;i<26;i++)
        {   
            if(ca[i]<cb[i])
                return false;
        }
        return true;
    }
    public static boolean check(int cb[],String s,int mid)
    {
        int i,n=s.length();
        int ca[]=new int[26];
        for(i=0;i<mid;i++)
        {
            ca[s.charAt(i)-97]++;
        }
            if(valid(ca,cb))
                return true;
            for(i=mid;i<n;i++)
            {
                ca[(s.charAt(i-mid))-97]--;
                
                ca[s.charAt(i)-97]++;
                if(valid(ca,cb))
                    return true;
            }
        return false;
                
            
        
    }
    public static int solve(String s,String b,int n,int m)
    {
        int cb[]=new int[26];
        int i;
        
        for(i=0;i<m;i++)
            cb[b.charAt(i)-97]++;
        
       /*  for(i=0;i<26;i++)
             System.out.print(cb[i]+" ");
             System.out.println();*/
             
        int l=0,h=n-1;
        int mid,minlen=-1;
        while(l<=h)
        {
            mid=l+(h-l)/2;
           // System.out.println(mid);
            if(check(cb,s,mid))
            {
                minlen=mid;
               // System.out.println(minlen);
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }}
         return minlen;
        }
               
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t>0)
        {
            String b,a;
            int i,j,m,n;
            b=sc.next();
            a=sc.next();
            
            m=b.length();
            n=a.length();
            //System.out.println(n);
            System.out.println(solve(a,b,n,m));
            
            
            
            
            
           
            t--;
            
        }
    
}}
