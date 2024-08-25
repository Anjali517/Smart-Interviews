import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int i;
            int a[]=new int[n];
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]==0)
                    a[i]=-1;
            }
            HashMap<Integer,Integer> h=new HashMap<>();
            int p[]=new int[n];
            p[0]=a[0];
            for(i=1;i<n;i++)
            {
                p[i]=p[i-1]+a[i];
                
            }
            /*for(i=0;i<n;i++)
                System.out.print(p[i]+" ");*/
            int maxLen=0;
            h.put(0,-1);
            for(i=0;i<n;i++)
            {
                if(h.containsKey(p[i]))
                {   
                    int len=i-h.get(p[i]);
                 maxLen=Math.max(maxLen,len);
                }
                 else
                 {   
                     h.put(p[i],i);
                 }
                
                }
                
                
            if(n==1)
            System.out.println(0);
            else
                System.out.println(maxLen);
            
           // System.out.println();
            t--;
        }
    }
}
