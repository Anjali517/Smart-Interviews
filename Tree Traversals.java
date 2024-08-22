import java.io.*;
import java.util.*;
class Node
{
    Node left,right;
    int data;
    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class Solution {
    public static void preOrder(Node root) {
        if(root==null)
        return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        
        preOrder(root.right);

    }
    public static void inOrder(Node root) {
        if(root==null)
        return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }
    public static void postOrder(Node root) {
        if(root==null)
        return;
        postOrder(root.left);
        
        postOrder(root.right);
        System.out.print(root.data+" ");

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
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            Node root=null;
            for(int i=0;i<n;i++)
            {
             root=insert(root,sc.nextInt());   
            }
             preOrder(root);
            System.out.println();
            inOrder(root);
           System.out.println();
            postOrder(root);
            System.out.println();
            System.out.println();
            t--;
        }
    }
}
