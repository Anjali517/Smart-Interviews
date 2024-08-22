import java.io.*;
import java.util.*;

public class Solution {
    static boolean checkBit(int n,int i)
    {
        if(((n>>i)&1)==1)
            return true;
        return false;
    }
    static long compute(int a,int b)
    {
        if(b==0)
            return 1;
        long half=compute(a,b/2)%1000000007;
        long res=(half*half)%1000000007;
        if(b%2==0)
            return res;
            return (a*res)%1000000007;
        
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0){
            int a;
            int b;
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println(compute(a,b));
        
            t--;
        }
    }
}
