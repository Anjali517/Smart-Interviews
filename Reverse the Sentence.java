import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0)
        {
           
            String s[]=sc.nextLine().split(" ");
            /*for(int i=0;i<s.length;i++)
            {
                System.out.print(s[i]+" ");
            }*/
            Stack<String> stk=new Stack<>();
            for(int i=0;i<s.length;i++)
            {
                stk.push(s[i]);
            }
            for(int i=0;i<s.length;i++)
            {
                System.out.print(stk.pop()+" ");
            }
            System.out.println();
            
            t--;
        }
        
    }
}
