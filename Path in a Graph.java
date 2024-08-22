import java.util.*;
class Solution
{
    public static void addEdge(ArrayList<Integer> adj[],int u,int v)
    {
        adj[u].add(v);
        adj[v].add(u);
    }
    /*public static boolean bfs(ArrayList<Integer> adj[],boolean visited[],int x,int y)
    {
        if(x==y)
            return true;
        Queue<Integer> q=new LinkedList<>();
        q.add(x);
        visited[x]=true;
        while(!q.isEmpty())
        {
            int temp=q.poll();
            if(temp==y)
                return true;
            for(int it:adj[temp])
            {
                if(it==y)
                    return true;
                if(visited[it]==false)
                {
                    visited[it]=true;
                    q.add(it);
                }
            }
        }
        return false;
    }*/
    
    public static boolean dfs(ArrayList<Integer> adj[],boolean visited[],int x,int y)
    {
        
        visited[x]=true;
        if(x==y)
            return true;
        for(int it:adj[x])
        {
            
            if(visited[it]==false)
            if(dfs(adj,visited,it,y))
                return true;
        }
        
        
        return false;
        
    }
    
    
    
    
        public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=1;k<=t;k++)
        {
            System.out.println("Test Case #"+k+":");
            int n=sc.nextInt();
            int e=sc.nextInt();
            ArrayList<Integer> adj[]=new ArrayList[n+1];
            int i;
            for(i=1;i<=n;i++)
            {
                adj[i]=new ArrayList<Integer>();
            }
            for(int j=1;j<=e;j++)
            {
                addEdge(adj,sc.nextInt(),sc.nextInt());
            }
            
          /*  for(int z:adj[2])
                System.out.println(z+" ");
                */
                
            int q=sc.nextInt();
            
            
            for(i=1;i<=q;i++)
            {
            boolean visited[]=new boolean[n+1];
            int u=sc.nextInt();
            int v=sc.nextInt();
            if(dfs(adj,visited,u,v))
               System.out.println("Yes");
            else
               System.out.println("No");
                
            
            }
            
            
        }
    }
}
