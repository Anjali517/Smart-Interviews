import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void helper(int a[][],int i,int j,boolean visited[][])
    {
        if(i<0 || i>=a.length || j<0 || j>=a[0].length || a[i][j]==0 || visited[i][j]==true)
            return;
        
        visited[i][j]=true;
        helper(a,i+1,j,visited);
        helper(a,i-1,j,visited);
        helper(a,i,j+1,visited);
        helper(a,i,j-1,visited);
        helper(a,i-1,j-1,visited);
        helper(a,i-1,j+1,visited);
        helper(a,i+1,j-1,visited);
        helper(a,i+1,j+1,visited);
        
        
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int m=sc.nextInt();
            int n=sc.nextInt();
            int a[][]=new int[m][n];
            int i,j;
            boolean visited[][]=new boolean[m][n];
            
            for(i=0;i<m;i++)
            {
                String row=sc.next();
                for(j=0;j<n;j++)
                    a[i][j]=row.charAt(j)-'0';
            }
            
            int count=0;
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(a[i][j]==1 && visited[i][j]==false)
                    {
                        count++;
                        helper(a,i,j,visited);
                    }
                }
            }
            System.out.println(count);
                            
        }
    }
}
