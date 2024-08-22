import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int i,val=0;
            int a[]=new int[n];
            for(i=0;i<n;i++)
                a[i]=sc.nextInt();
            HashMap<Integer,Integer> h=new HashMap<>();
            for(i=0;i<k;i++)
            {
                if(h.containsKey(a[i]))
                {
                    val=h.get(a[i])+1;
                    h.put(a[i],val);
                }
                else
                h.put(a[i],1);
            }
            System.out.print(h.size()+" ");
            for(i=k;i<n;i++)
            {
                val=h.get(a[i-k])-1;
                h.put(a[i-k],val);
                if(h.containsKey(a[i]))
                {
                    val=h.get(a[i])+1;
                    h.put(a[i],val);
                }
                else
                {
                    h.put(a[i],1);
                }
                if(h.get(a[i-k])==0)
                    h.remove(a[i-k]);
                
                System.out.print(h.size()+" ");
                //System.out.println();
            }
            System.out.println();
           // System.out.println(h.size());
            t--;
        }
    }
}
