import java.io.*;
import java.util.*;

public class Solution {
    static boolean check(int i,long n)
    {
        if((1&(n>>i))==1)
           return true;
          return false;
    }
    static int count(long n){
        int c=0;
        
        int i=0;
        while(i<64)
        {
            if(check(i,n))
                c+=1;
            //n=n>>i;
             i++;
        }
        return c;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t>0){
        long n;
        n=sc.nextLong();
        System.out.println(count(n));
            t--;
    }}
}
