import java.io.*;
import java.util.*;

public class Solution {

    public void towerHanoi(int n,char src,char aux,char dest)
    {   
        if(n==1)
        {
            
            System.out.println("Move 1 from"+" "+src+" to "+dest);
            return;
        }
        towerHanoi(n-1,src,dest,aux);
        
        //towerHanoi(1,src,aux,dest);
       System.out.println("Move "+n+" "+"from "+src+" to "+dest);
        
        towerHanoi(n-1,aux,src,dest);
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
       int n;
            n=sc.nextInt();
       Solution s=new Solution(); 
       
            System.out.println((int)Math.pow(2,n)-1);
            s.towerHanoi(n,'A','B','C');
           // System.out.println();
            t--;
    }}
}
