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
     public static void leftView(Node root)
    {
        if(root==null)
            return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {  int n=q.size();
           for(int i=0;i<n;i++)
           {
            Node temp=q.poll();
             if(i==0)
            System.out.print(temp.data+" ");
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
       
           }
             //System.out.println();
        }
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
            leftView(root);
            System.out.println();
            t--;
        }
    }
}
