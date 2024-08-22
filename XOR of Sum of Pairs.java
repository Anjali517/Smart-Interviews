import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int k=0;k<n;k++)
                a[k]=sc.nextInt();
            int i,j;
            int s=0;
            for(i=0;i<n;i++)
            {
                s=s^(a[i]+a[i]);
            }
            System.out.println(s);
            t--;
        }
        
        
    }
}
