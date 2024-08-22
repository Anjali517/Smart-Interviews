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
    public static int height(Node root)
    {
        if(root==null)
            return -1;
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static boolean isBalanced(Node root)
    {
        if(root==null)
            return true; 
        int lh=height(root.left);
        int rh=height(root.right);
        if(Math.abs(lh-rh)>1)
            return false;
        return isBalanced(root.left)&&isBalanced(root.right);
        
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
            if(isBalanced(root))
            System.out.println("Yes");
            else
            System.out.println("No");
            //System.out.println();
            t--;
        }
    }
}
