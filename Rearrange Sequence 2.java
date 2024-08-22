import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int rearrange(int ar[],int n)
    {
        int i,j;
        int ans=0,a,b;
        for(i=0;i<n;i++)
        {   a=ar[i];
            b=ar[i];
         HashSet<Integer> h=new HashSet<>();
            for(j=i;j<n;j++)
            {   if(ar[j]>a)
                a=ar[j];
                if(ar[j]<b)
                b=ar[j];
                
                h.add(ar[j]);
             if(a-b==j-i){
                if(h.size()==j-i+1)
                    if(j-i+1>ans)
                        ans=j-i+1;
            }}
        }
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n,i;
            n=sc.nextInt();
            int ar[]=new int[n];
            for(i=0;i<n;i++)
            {
                ar[i]=sc.nextInt();
            }
            System.out.println(rearrange(ar,n));
            t--;
        }
    }
}
