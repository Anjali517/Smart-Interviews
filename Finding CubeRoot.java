import java.io.*;
import java.util.*;

public class Solution {
    static long cubeRoot(long n)
    { int m=1;
        if(n<0)
            {
                m=-1;
                n=n*-1;
                
            }
            long i=1,j=1000000;
          long mid=0;
            while(i<=j)
            {   mid=(i+j)/2;
                long c=mid*mid*mid;
                if(c==n)
                    return mid*m;
                else if(c>n)
                    j=mid-1;
                else
                    i=mid+1;
            }
     return mid*m;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            long n;
            n=sc.nextLong();
            System.out.println(cubeRoot(n));
            t--;
        }
    }
}
