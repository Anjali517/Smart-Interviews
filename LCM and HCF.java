import java.io.*;
import java.util.*;

public class Solution {
   
    static int hcf(int a,int b)
    {
        
        if(b==0)
            return a;
        return hcf(b,a%b);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t;
        int a,b;
        t=sc.nextInt();
        while(t>0)
        {   a=sc.nextInt();
            b=sc.nextInt();
         int h=hcf(a,b);
         long l=((long)a*b)/h;
         
         System.out.print(l+" "+h);
         System.out.println();
         
           
            
            t--;
        }
        
        
        
    }
}
