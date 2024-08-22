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
            int k=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            int i;
            for(i=0;i<n;i++)
                a[i]=sc.nextInt();
            for(i=0;i<n;i++)
                b[i]=sc.nextInt();
            int dpa[]=new int[n];
            int dpb[]=new int[n];
            dpa[0]=a[0];
            dpb[0]=b[0];
            for(i=1;i<n;i++)
            {
                //dpa[i]=Math.min(dpa[i-1],dpb[i-1])+a[i]+k; 
                if(dpa[i-1]>dpb[i-1]){
                    dpa[i]=Math.min(dpa[i-1],dpb[i-1])+a[i]+k;
                    dpb[i]=Math.min(dpa[i-1],dpb[i-1])+b[i];
                }
                else if(dpa[i-1]<dpb[i-1])
                {
                    dpa[i]=Math.min(dpa[i-1],dpb[i-1])+a[i];
                dpb[i]=Math.min(dpa[i-1],dpb[i-1])+b[i]+k;
            }
                else
                {
                 dpa[i]=Math.min(dpa[i-1],dpb[i-1])+a[i];
                dpb[i]=Math.min(dpa[i-1],dpb[i-1])+b[i];                     
                }
            }
            System.out.println(Math.min(dpa[n-1],dpb[n-1]));
            t--;
        }
    }
}
