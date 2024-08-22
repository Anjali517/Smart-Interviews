import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.left=left;
        this.right=right;
        this.data=data;
    }
}
class Pair
{
    int hd;
    Node curr;
    Pair(int hd,Node curr)
    {
        this.hd=hd;
        this.curr=curr;
    }
}
public class Solution {
    public static void levelOrder(Node root,int level,TreeMap<Integer,Integer> hm)
    {
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(level,root));
        int i;
        while(!q.isEmpty())
        {   int n=q.size();
            for(i=0;i<n;i++)
            {
                Pair temp=q.poll();
                Node current=temp.curr;
                if(!hm.containsKey(temp.hd))
                    hm.put(temp.hd,current.data);
                if(current.left!=null)
                    q.add(new Pair(temp.hd-1,current.left));
                if(current.right!=null)
                    q.add(new Pair(temp.hd+1,current.right));
                
            }
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
            TreeMap<Integer,Integer> hm=new TreeMap<>();
            
            levelOrder(root,0,hm);
            for(int i:hm.keySet())
            {
                System.out.print(hm.get(i)+" ");
            }
            
            
            
            System.out.println();
            t--;
        }
    }
}
