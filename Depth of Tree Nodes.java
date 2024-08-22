import java.io.*;
import java.util.*;

class Node
{
    int data;
    int depth;
    Node left;
    Node right;
    Node(int data)
    {
        this.left=null;
        this.data=data;
        this.right=null;
    }
    Node(int data,int depth)
    {
        this.left=null;
        this.data=data;
        this.depth=depth;
        this.right=null;
    }
}
public class Solution {
    public static void inOrder(Node root) {
        if(root==null)
        return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }
    
    public static void printDepth(Node root,HashMap<Integer,Integer> h) {
        
        if(root==null)
        return;
        printDepth(root.left,h);
        
            h.put(root.data,root.depth);
        
        printDepth(root.right,h);
        
    }
    
   
    
    public static void fillDepth(Node root,int d)
    {
        if(root==null)
        {
            return;
        }
        root.depth=d;
        fillDepth(root.left,d+1);
        fillDepth(root.right,d+1);
        
    }
    
    public static Node insert(Node root,int k)
    {
       
        if(root==null)
            return new Node(k);
        if(root.data>k)
            root.left=insert(root.left,k);
        if(root.data<k)
            root.right=insert(root.right,k);
        return root;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
       
        while(t>0)
        {
            int n=sc.nextInt();
            
            int i;   
            Node root=null;
            int a[]=new int[n];
            for(i=0;i<n;i++)
                a[i]=sc.nextInt();
            for(i=0;i<n;i++)
            {   
                root=insert(root,a[i]);
            }
            //inOrder(root);
            fillDepth(root,0);
            //level(root);
            HashMap<Integer,Integer> h=new HashMap<>();
            printDepth(root,h);
            
            for(i=0;i<n;i++)
            {
                System.out.print(h.get(a[i])+" ");
            }
            
            System.out.println();
            t--;
        }
        
        
        
    }
}
