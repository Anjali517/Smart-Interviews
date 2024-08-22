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
    public static void inOrder(Node root) {
        if(root==null)
        return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static boolean isLeaf(Node root)
    {
        if(root.left==null && root.right==null)
            return true;
        return false;
    }
    public static boolean twoNodes(Node root)
    {
        if(root.left!=null && root.right!=null)
            return true;
        return false;
    }
    public static Node insert(Node root,int k)
    {
        if(root==null)
        {
            return new Node(k);
        }
        if(k<root.data)
            root.left=insert(root.left,k);
        if(k>root.data)
            root.right=insert(root.right,k);
        return root;
    }
    
    /*public static void isFull(Node root,boolean res)
    {
        if(root==null)
            return;
        isFull(root.left,res);
        if(!twoNodes(root) || !isLeaf(root))
            res=false;
        isFull(root.right,res);
        
    }*/
    public static boolean isFull(Node root)
    {
        if(root==null)
            return true;
        
        if(!twoNodes(root) && !isLeaf(root))
            return false;
        return isFull(root.left)&&isFull(root.right);
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            Node root=null;
            boolean res=true;
            for(int i=0;i<n;i++)
            {
             root=insert(root,sc.nextInt());   
            }
            //inOrder(root);
            if(isFull(root))
            System.out.println("True");
            else
            System.out.println("False");
            t--;
        }
    }
}
