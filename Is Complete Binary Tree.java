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
    public static boolean isComplete(Node root)
    {
        if(root==null)
            return false;
        boolean flag=false;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {   int n=q.size();
            for(int i=0;i<n;i++){
            Node temp=q.poll();
                if(temp.right!=null)
            {
                    if(flag)
                    return false;
                q.add(temp.right);
            }
                else
                    flag=true;
            
        }
            if(temp.left!=null)
            {
                if(flag)
                    return false;
                q.add(temp.left);
            }
                else
                    flag=true;
                }
        return true;
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
            boolean res=true;
            for(int i=0;i<n;i++)
            {
             root=insert(root,sc.nextInt());   
            }
            //inOrder(root);
            if(isComplete(root))
            System.out.println("Yes");
            else
            System.out.println("No");
            //System.out.println();
            t--;
        }
    }
}
