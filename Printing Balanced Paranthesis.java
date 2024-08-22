import java.io.*;
import java.util.*;

public class Solution {
    
    public static void genParanthesis(char a[],int N,int idx,int oc,int cc)
    {    
     
        if(N==idx)
        {   
            // for(char i=0;i<N;i++)
            // {
            //     System.out.print(a[i]);
            // }
            System.out.println(a);
            return;
        }
        if(oc<N/2){
            a[idx]='{';
            genParanthesis(a,N,idx+1,oc+1,cc);
            
        }
        if(cc<oc){
            a[idx]='}';
            genParanthesis(a,N,idx+1,oc,cc+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        int z=1;
        while(t>0){
            int n=sc.nextInt();
            n=2*n;
        char a[]=new char[n];
            
            System.out.println("Test Case #"+z+":");
            z=z+1;
        genParanthesis(a,n,0,0,0);
        t--;
        }
        
        
    }
}
