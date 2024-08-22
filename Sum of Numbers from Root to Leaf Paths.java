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
    static int mod=(int)1e9+7;
    public static Node insert(Node root,int k)
    {
        if(root==null)
        {
            return new Node(k);
        }
        if(k<root.data)
            root.left=insert(root.left,k);
        else if(k>root.data)
            root.right=insert(root.right,k);
        return root;
    }
    public static long getdigits(long n)
    {   long digits=0;
        while(n>0)
        {
            digits+=1;
            n=n/10;
        }
        return digits;
        
    }
    public static void helper(Node root,long sum,ArrayList<Long> ar)
    {
        
        if(root==null)
            return;
        long digits=getdigits(root.data);
        sum=(sum*(long)Math.pow(10,digits)+root.data)%1000000007;
        if(root.left==null && root.right==null)
        {
           
            ar.add(sum);
            return;
        }
        
        helper(root.left,sum,ar);
        helper(root.right,sum,ar);
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
            ArrayList<Long> ar=new ArrayList<>();
            String path="";
            long sum=0;
            helper(root,sum,ar);
            long res=0;
            for(long j:ar)
            {
                res=(res+j)%mod;
            }
            System.out.println(res);
            t--;
        }
        
    }
}
