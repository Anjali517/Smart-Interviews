import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n,val;
        n=sc.nextInt();
        int a[]=new int[n];
        int i,j,temp;
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        int q;
        q=sc.nextInt();
        int b[]=new int[q];
        for(i=0;i<q;i++)
            b[i]=sc.nextInt();
        HashMap<Integer,Integer> h=new HashMap<>();
        for(i=0;i<n;i++)
        {
            h.put(a[i],0);
        }
        for(i=0;i<n;i++)
        {   
            if(h.containsKey(a[i]))
        {
            val=h.get(a[i])+1;
            h.put(a[i],val);
        }
        
        }
        //System.out.println(h);
        for(i=0;i<q;i++)
        {   if(h.containsKey(b[i]))
            System.out.println(h.get(b[i]));
            else
            System.out.println(0);
        }
        
        
        
        }
        
        
        
    
}
