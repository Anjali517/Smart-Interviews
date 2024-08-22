import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node left=null;
    Node right=null;
    
    Node(int data)
    {
        this.data=data;
        
    }
}
public class Solution {

    public static Node lca(Node root,int x,int y)
    {
        if(root==null)
            return null;
        if(root.data>x && root.data>y)
            return lca(root.left,x,y);
        if(root.data<x && root.data<y)
            return lca(root.right,x,y);
        return root;
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
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int q=sc.nextInt();
            Node root=null;
            for(int i=0;i<n;i++)
            {
             root=insert(root,sc.nextInt());   
            }
            for(int j=0;j<q;j++)
            {
                int u,v;
                u=sc.nextInt();
                v=sc.nextInt();
                Node temp=lca(root,u,v);
                if(temp!=null)
                System.out.print(temp.data+" ");
            }
            
            System.out.println();
            t--;
        }
    }
}
