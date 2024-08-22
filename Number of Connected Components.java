import java.io.*;
import java.util.*;

public class Solution {

   /* public static void bfs(ArrayList<Integer> adj[],int i,boolean visited[])
    {
        visited[i]=true;
        for(int k:adj[i])
        {
            if(!visited[k]){
                bfs(adj,k,visited);
                
            }
        }
    }*/
    
    public static void bfs(ArrayList<Integer> adj[],int i,boolean visited[])
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        visited[i]=true;
        while(!q.isEmpty())
        {
            int temp=q.poll();
            for(int it:adj[temp])
                if(visited[it]==false)
                {
                    visited[it]=true;
                    q.add(it);
                }
        }
    }
    
    public static void addEdge(ArrayList<Integer> adj[],int u,int v)
    {
        adj[u].add(v);
        adj[v].add(u);
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        
       for(int k=1;k<=t;k++)
        {
           
            int n=sc.nextInt();
            int m=sc.nextInt();
            ArrayList<Integer>[] adj=new ArrayList[n+1];
            for(int i=1;i<=n;i++)
            {
                adj[i]=new ArrayList<Integer>();
            }
            int res=0;
            
            for(int i=0;i<m;i++)
                addEdge(adj,sc.nextInt(),sc.nextInt());
           boolean visited[]=new boolean[n+1];
           for(int i=1;i<=n;i++)
           {
               if(visited[i]==false){
                   bfs(adj,i,visited);
                   res++;
               }
           }
            System.out.println(res);
            
            
        }
    }
}
