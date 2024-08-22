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
    public static ArrayList<ArrayList<Integer>> zigZag(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        int i;
        boolean flag=true;
        q.add(root);
        ArrayList<ArrayList<Integer>> a=new ArrayList<>();
        while(!q.isEmpty())
        {   int n=q.size();
           ArrayList<Integer> k=new ArrayList<>();
                for(i=0;i<n;i++)
                {
                    
                    Node temp=q.poll();
                    
                    k.add(temp.data);
                    if(temp.left!=null)
                        q.add(temp.left);
                    if(temp.right!=null)
                        q.add(temp.right);
                    
                }
        
         a.add(k);
      
        }
        return a;
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
            //inOrder(root);
            ArrayList<ArrayList<Integer>> res=zigZag(root);
            Collections.reverse(res);
            for(ArrayList<Integer> i:res){
                for(int j:i)
                System.out.print(j+" ");
                System.out.println();
            }
            System.out.println();
            t--;
        }
    }
}
