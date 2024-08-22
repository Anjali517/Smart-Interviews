import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int a[];
        int n,t,i,j;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {  int c=0;
            n=sc.nextInt();
            a=new int[n];
         for(i=0;i<n;i++)
             a[i]=sc.nextInt();
            for(i=0;i<n-1;i++)
            {
                for(j=0;j<n-i-1;j++)
                {
                    if(a[j]>a[j+1])
                    {  
                        int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                        c+=1;
                    }
                }
            }
            System.out.println(c);
         t--;
        }
        
    }
}
