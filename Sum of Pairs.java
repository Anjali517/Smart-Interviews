import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean checkPair(int a[],int k,int n)
    {   int i;
         HashMap <Integer,Integer> h=new HashMap<>();
            for(i=0;i<n;i++)
            {
                if(h.containsKey(k-a[i]))
                    return true;
                else
                    h.put(a[i],1);
                    
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
           if(checkPair(a,k,n))
               System.out.println("True");
            else
                System.out.println("False");
                
            
            
            t--;
        }
        
        
    }
}
