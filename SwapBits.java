import java.io.*;
import java.util.*;

public class Solution {

    public static String toBinary(int n)
    {
        int i;
        String s="";
        while(n>0 || s.length()<=31)
        {
            int r=n%2;
            s=r+s;
            n=n/2;
        }
        return s;
        
    }
    public static int result(String b)
    {   int i,sum=0;
        for(i=0;i<32;i++)
            if(b.charAt(i)=='1')
                sum=sum+(1<<(b.length()-i-1));
        return sum;
    }
    public static void swap(char c[],int p1,int p2)
    {
        char temp=c[p1];
        c[p1]=c[p2];
        c[p2]=temp;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        Scanner sc=new Scanner(System.in);
        int n;
        t=sc.nextInt();
        while(t>0)
        {   int i;
            n=sc.nextInt();
            String b=toBinary(n);
            
            
         char c[]=b.toCharArray();
           int p1=0,p2=1;
         while(p2<c.length && p1<c.length)
         {
             swap(c,p1,p2);
             p1+=2;
             p2+=2;
         }
         String k=new String(c);
         System.out.println(result(k));
            
            t--;
        }
    }
}
