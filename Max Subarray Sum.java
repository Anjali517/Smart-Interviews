import java.io.*;
import java.util.*;

public class Solution {
    public static void subSum(int a[],int n)
    {
        int maxi=Integer.MIN_VALUE;
        int i,j,z,sa=0,sb=0;
        int sum;
        for(i=0;i<n;i++)
        {
            sum=0;
            for(j=i;j<n;j++)
            {
                sum+=a[j];
                if(sum>maxi){
                    maxi=sum;
                    sa=i;
                    sb=j;
                    
            }}
        }
        System.out.print(maxi+" "+sa+" "+sb);
        System.out.println();
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n,i;
            
            n=sc.nextInt();
            int a[]=new int[n];
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            
        subSum(a,n);
            t--;
        }
    }
}
