import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            int X1=sc.nextInt();
            int Y1=sc.nextInt();
            int X2=sc.nextInt();
            int Y2=sc.nextInt();
            int ow=Math.max(0,Math.min(X2,x2)-Math.max(X1,x1));
            int oh=Math.max(0,Math.min(Y2,y2)-Math.max(Y1,y1));
            
            System.out.println((long)(x2-x1)*(y2-y1)+(long)(Y2-Y1)*(X2-X1)-(long)ow*oh);
            t--;
        }
        
    }
}
