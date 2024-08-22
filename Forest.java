import java.io.*;
import java.util.*;

public class Solution {
    public static boolean detectCycle(ArrayList<Integer> adj[],boolean visited[],int cn,int pn)
    {
        visited[cn]=true;
        for(int it:adj[cn])
        {
            if(visited[it]==false)
            {
                if(detectCycle(adj,visited,it,cn))
                    return true;
            }
            else
            {
                if(it!=pn)
                    return true;
            }
        }
        return false;
    }
    public static boolean checkForest(ArrayList<Integer> adj[],boolean visited[])
    {
        int n=adj.length-1;
        for(int i=1;i<=n;i++)
            {
            if(!visited[i]){
                if(detectCycle(adj,visited,i,-1))
                    return false;
            }
        }
        return true;
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
        while(t>0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int i,j;
            ArrayList<Integer> adj[]=new ArrayList[n+1];
            for(i=1;i<=n;i++)
            {
                adj[i]=new ArrayList<Integer>();
            }
            for(i=0;i<m;i++)
            {
                addEdge(adj,sc.nextInt(),sc.nextInt());
            }
            boolean visited[]=new boolean[n+1];
            System.out.println(checkForest(adj,visited)?"Yes":"No");
            
            
            t--;
        }
        
        
        
    }
}
