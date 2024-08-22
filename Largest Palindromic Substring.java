import java.io.*;
import java.util.*;

public class Solution {
    
    
    public static int oddsolve(String s)
    {
        int n=s.length(),i,maxi=0,l,r;
       for(i=0;i<n;i++){
       l=i;
       r=i;
        while(l>=0 && r<n && s.charAt(l)==s.charAt(r))
        {
           l--;
           r++;
            if(maxi<r-l-1)
                maxi=r-l-1;
            }}
            
        
        return maxi;
    }
    
    public static int evensolve(String s)
    {
        int n=s.length(),i,maxi=0,l,r;
       for(i=0;i<n;i++){
       l=i;
       r=i+1;
        while(l>=0 && r<n && s.charAt(l)==s.charAt(r))
        {
           l--;
           r++;
            if(maxi<r-l-1)
                maxi=r-l-1;
            }}
            
        
        return maxi;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt(),i;
            String s=sc.next();
            int even=0,odd=0,len=0;
            
            even=evensolve(s);
            odd=oddsolve(s);
            
            
            if(even>odd)
              len=even;
            else
              len=odd;
            System.out.println(len);
            
            t--;
        }
        
        
        
    }
}
