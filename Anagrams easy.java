import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        //sc.nextLine();
        while(t>0)
        {
            String a=sc.next();
            String b=sc.next();
            int i,j;
            int c1[]=new int[26];
            int c2[]=new int[26];
            for(i=0;i<26;i++)
            {
                for(j=0;j<a.length();j++)
                c1[a.charAt(j)-'a']++;
            }
            for(i=0;i<26;i++)
            {
                for(j=0;j<b.length();j++)
                c2[b.charAt(j)-'a']++;
            }
            for(i=0;i<26;i++)
            {
                if(c1[i]!=c2[i])
                    break;
            }
            if(i==26)
                System.out.println("True");
            else
                System.out.println("False");
             t--;
        }
       
        
    }
}
