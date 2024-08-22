import java.io.*;
import java.util.*;

public class Solution {
    
   
    public static void solve(int a[],int idx,List<Integer> l)
    {
        if(!l.isEmpty() && l!=null)
        {
            for(int j:l)
            {
            System.out.print(j+" ");
            }
            System.out.println();
        }
        
        for(int i=idx;i<a.length;i++)
        {
            l.add(a[i]);
            solve(a,i+1,l);
            l.remove(l.size()-1);
            
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n;
            n=sc.nextInt();
            int i;
            int a[]=new int[n];
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
           //Arrays.sort(a);
            List<Integer> l=new LinkedList<>();
            
           solve(a,0,l);
             
            System.out.println();
            
            t--;
        }
    }
}
