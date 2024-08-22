import java.io.*;
import java.util.*;
class Solution{
      static boolean checkBit(int n,int i)
    {
        if(((n>>i)&1)==1)
            return true;
        return false;
    }
    static int compute(int n,int a[])
    {
        int res=0;
        for(int i=0;i<=31;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(checkBit(a[j],i))
                    count+=1;
            }
            if(count%3!=0)
                res+=(1<<i);
    }
    return res;}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n,i;
        int t;
        t=sc.nextInt();
        while(t>0){
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
            }
            System.out.println(compute(n,a));
        
            
        
            
            
        t--;
        
    }
    }
}
