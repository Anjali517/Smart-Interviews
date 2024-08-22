import java.io.*;
import java.util.*;

class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class Solution {

    
    public static boolean checkBst(Node root)
    {
        
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int i;
            Node[] nodes=new Node[n+1];
            for(i=1;i<n;i++)
            {
                nodes[i]=new Node(sc.nextInt());
            }
            for(i=1;i<=n/2;i++)
            {
                nodes[i].left=nodes[2*i];
                nodes[i].right=if(2*i+1<=n)?nodes[2*i+1]:null;
            }
            
            System.out.println();
            t--;
        }
    }
}
