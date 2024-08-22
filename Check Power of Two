import java.io.*;
import java.util.*;

public class Solution {
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t;
        long n;
        t=sc.nextInt();
        while(t>0)
        {  int c=0;
            n=sc.nextLong();
         if(n==1L)
             System.out.println("True");
         else{
             
            while(n>0L)
            {
                if((1&(n>>1))==1)
                    c=c+1;
                n=n>>1;
            }
         if(c==1)
             System.out.println("True");
         else
              System.out.println("False");}
            t--;
        }
       
    }}
