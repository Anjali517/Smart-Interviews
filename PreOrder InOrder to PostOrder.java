import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
    }
}
public class Solution {
     int idx=0;
    public Node solve(int[] in,int[] pre,int start,int end)
    {
        int i;
        if(start>end)
            return null;
        int rootval=pre[idx];
        
        idx++;
        Node root=new Node(rootval);
        for(i=start;i<=end;i++)
            if(rootval==in[i])
                break;
        root.left=solve(in,pre,start,i-1);
        root.right=solve(in,pre,i+1,end);
        return root;
            
    }
    public static void post(Node root)
    {
        if(root==null)
            return;
        post(root.left);
        post(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int pre[]=new int[n];
            int in[]=new int[n];
            int i;
            for(i=0;i<n;i++)
                pre[i]=sc.nextInt();
            for(i=0;i<n;i++)
                in[i]=sc.nextInt();
            
           /* for(i=0;i<n;i++)
                System.out.print(in[i]+" ");
            System.out.println();  */
            
            Solution s=new Solution();
            Node res=s.solve(in,pre,0,n-1);
            post(res);
            System.out.println();
            t--;
        }
    }
}
