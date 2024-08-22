import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n;
            n=sc.nextInt();
            int r[]=new int[n+1];
            int b[]=new int[n+1];
            int g[]=new int[n+1];
            int i;
            for(i=0;i<n;i++)
                r[i]=sc.nextInt();
            for(i=0;i<n;i++)
                g[i]=sc.nextInt();
            for(i=0;i<n;i++)
                b[i]=sc.nextInt();
            int dpr[]=new int[n+1];
            int dpg[]=new int[n+1];
            int dpb[]=new int[n+1];
            dpr[0]=r[0];
            dpg[0]=g[0];
            dpb[0]=b[0];
            for(i=1;i<=n;i++)
            {
                dpr[i]=Math.min(dpb[i-1],dpg[i-1])+r[i];
                dpg[i]=Math.min(dpr[i-1],dpb[i-1])+g[i];
                dpb[i]=Math.min(dpr[i-1],dpg[i-1])+b[i];
            }
            System.out.println(Math.min(Math.min(dpr[n],dpg[n]),dpb[n]));
            t--;
        }
        
    }
}
