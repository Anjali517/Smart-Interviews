import java.io.*;
import java.util.*;

public class Solution {
    public static boolean checkPair(int a[],int k,int n)
    {   int i,j;
         
            for(i=0;i<n-2;i++)
            { 
                HashMap <Integer,Integer> h=new HashMap<>();
                int z=k-a[i];
                for(j=i+1;j<n;j++)
                {
                if(h.containsKey(z-a[j]))
                    return true;
                else
                    h.put(a[j],1);
                }
            }
            
        return false;}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            int n,k,i,j,z,c=0;
            n=sc.nextInt();
            z=sc.nextInt();
            int a[]=new int[n];
            for(i=0;i<n;i++)
                a[i]=sc.nextInt();
            if(checkPair(a,z,n))
               System.out.println("true");
            else
                System.out.println("false");
            
            t--;
        }
        
        
        
    }
}
