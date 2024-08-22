import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long a[]=new long[1000001];
        a[0]=1;
        int M=(int)1e9+7;
        for(int i=1;i<=1000000;i++)
            a[i]=(a[i-1]*i)%M;
        while(t>0)
        {
            int n;
            n=sc.nextInt();
            System.out.println(a[n]);
            t--;
        }
        
        
    }
}
