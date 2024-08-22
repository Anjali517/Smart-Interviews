import java.io.*;
import java.util.*;

public class Solution {
    public static char repeat(String n)
    { int i;
     int c[]=new int[26];
     for(i=0;i<26;i++)
         c[i]=0;
        for(i=0;i<n.length();i++)
            {
                c[n.charAt(i)-97]++;
            }
     for(i=0;i<n.length();i++)
     {
         if(c[n.charAt(i)-97]>1)
                    return (char)n.charAt(i);
     }
           return '.';
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            String n=sc.next();
            int i;
            
            System.out.println(repeat(n));
            
            t--;
        }
    }
}
