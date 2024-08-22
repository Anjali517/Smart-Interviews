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
        {  int i;
         int c=0;
            a=sc.nextInt();
            b=sc.nextInt();
            for(i=0;i<32;i++)
            {
                if(checkBit(a,i)!=checkBit(b,i))
                    c+=1;
            }
         System.out.println(c);
            t--;
        }
    }
}
