import java.io.*;
import java.util.*;

public class Solution {
    static int checkBit(int a,int i)
  {
      if(((a>>i)&1)==1)
          return 1;
      return 0;
  }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        int a,b;
        while(t>0)
        {  int i,j=0;
         
            a=sc.nextInt();
            long s=0;
            for(i=31;i>=0;i--)
            {   
                if(checkBit(a,i)==1)
                    s=s+(1l<<j);
                j++;
            }
         System.out.println(s);
            t--;
        }
    }
}
