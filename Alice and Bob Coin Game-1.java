import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        sc.nextLine();
        int i=1;
        while(i<=t)
        {
           System.out.println("Test-Case #"+(i)+":");
             String s[]=sc.nextLine().split(" ");
            long n=Long.parseLong(s[0]);
            long m=Long.parseLong(s[1]);
            String first=s[2];
            String second;
            if(first.equals("Alice"))
                second="Bob";
            else
                second="Alice";
            
            //optimal vs optimal
            if(n%(m+1)==0)
             System.out.println("G1: "+second);
            else
                System.out.println("G1: "+first); 
            
            
            
            
            //greedy vs optimal
            if(first.equals("Alice"))
            {
               if(n==(int)(m+1))
                   System.out.println("G2: "+second);
                else
                    System.out.println("G2: "+first);
            }
            else
            {
                 if(n<=m||n==(int)(m+m+1))
                    System.out.println("G2: "+first);
                else
                    System.out.println("G2: "+second);
            }
           
            
            //greedy vs greedy
           if(n%(int)(m+m)<=m)
            System.out.println("G3: "+first);
            else
               System.out.println("G3: "+second); 
            
            
            if(i!=t)
            System.out.println();
            i++;
        }
                     
    }
}
