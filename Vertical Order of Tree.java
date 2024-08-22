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
    public static void verticalOrder(Node root)
    {
        TreeMap<Integer,List<Integer>> hm=new TreeMap<>();
        helper(root,0,hm);
        for (Map.Entry<Integer, List<Integer>> entry : hm.entrySet()) {
            List<Integer> values = entry.getValue();
            Collections.sort(values);
            for (int val : values) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        
    }
    
    public static void helper(Node root,int level,TreeMap<Integer,List<Integer>> hm)
    {
        if(root==null)
            return;
       
        if(!hm.containsKey(level))
        hm.put(level,new ArrayList<>());
        
        hm.get(level).add(root.data);
        helper(root.left,level-1,hm);
        helper(root.right,level+1,hm);
        
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
            verticalOrder(root);
            System.out.println();
            t--;
        }
    }
}
