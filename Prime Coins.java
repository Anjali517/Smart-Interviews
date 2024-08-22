import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        
        while(t>0)
        {
            int n=sc.nextInt();
            if(n%6==0)
                System.out.println("Banta");
            else
                System.out.println("Santa");
        
        t--;
        }
    }
}
