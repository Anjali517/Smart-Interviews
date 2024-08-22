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

    public static Node findMin(Node root)
    {
        if(root.left==null)
            return root;
        return findMin(root.left);
    }
    public static Node deleteNode(Node root,int k)
    {
        if(root==null)
            return root;
        if(k<root.data)
            root.left=deleteNode(root.left,k);
        else if(k>root.data)
            root.right=deleteNode(root.right,k);
        else
        {
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            else
            {
                Node temp=findMin(root.right);
                root.data=temp.data;
                root.right=deleteNode(root.right,root.data);
            }
        }
        return root;
    }
    
    
    public static Node insert(Node root,int k)
    {
        if(root==null)
            return new Node(k);
        if(k<root.data)
            root.left=insert(root.left,k);
        if(k>root.data)
            root.right=insert(root.right,k);
        return root;
    }
    public static void preOrder(Node root)
    {
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
           
    }
    public static boolean search(Node root,int k)
    {
        if(root==null)
            return false;
        if(root.data==k)
            return true;
        if(k<root.data)
            return search(root.left,k);
        if(k>root.data)
            return search(root.right,k);
        return false;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        int j=1;
        while(j<=t)
        {
            int q=sc.nextInt();
            sc.nextLine();
            int i;
            Node root=null;
            System.out.println("Case #"+(j)+":");
            for(i=0;i<q;i++)
            {
                
                String s[]=sc.nextLine().split(" ");
                /*for(String str:s)
                System.out.print(str+" ");*/
                if(s[0].equals("1"))
                {
                    int k=Integer.parseInt(s[1]);
                    root=insert(root,k);
                }
                else if(s[0].equals("2"))
                {
                    int k=Integer.parseInt(s[1]);
                    root=deleteNode(root,k);
                }
                else if(s[0].equals("3"))
                {
                    int k=Integer.parseInt(s[1]);
                    boolean res=search(root,k);
                    if(res==true)
                    System.out.println("Yes");
                    else
                    System.out.println("No");
                    
                }
                else
                {
                    preOrder(root);
                    System.out.println();
                }
                
                
                
            }
          
            
            
            
            j++;
        }
        
        
    }
}
