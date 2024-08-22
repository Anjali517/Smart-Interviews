import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(int z=1;z<=t;z++)
        {
            System.out.println("Case #"+z+":");
            int n=sc.nextInt();
            int sp;
            int i,j;
            for(i=0;i<n/2;i++)
            {
                for(sp=n/2-i;sp>0;sp--)
                    System.out.print(" ");
                for(j=0;j<2*i+1;j++){
                    if(j==0 || j==2*i)
                    System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
            
            for(i=n/2;i>=0;i--)
            {
                for(sp=n/2-i;sp>0;sp--)
                    System.out.print(" ");
                for(j=0;j<2*i+1;j++){
                    if(j==0 || j==2*i)
                    System.out.print("*");
                    else
                        System.out.print(" ");
                }
                    System.out.println();
            }
            //System.out.println();
            
        }
    }
}
