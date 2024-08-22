import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int r=sc.nextInt();
            
            int a[]=new int[n];
            int temp[]=new int[n];
            int i;
            
            for(i=0;i<n;i++)
                a[i]=sc.nextInt();
            
            for(i=0;i<n;i++)
                temp[(i+r)%n]=a[i];
            for(i=0;i<n;i++)
                System.out.print(temp[i]+" ");
            System.out.println();
            t--;
        }
    }
}
