import java.io.*;
import java.util.*;

public class Stack{
     int top;
     int a[];
     Stack(int size)
    {
        a=new int[size];
        top=-1;
    }
    public void push(int data)
    {
      
        if(top<a.length)
        {
            a[++top]=data;
        }
    }
      
    public void pop()
    {
        if(top==-1){
                System.out.println("Empty");    
        }
        else{
            System.out.println(a[top--]);   
        }
   
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc=new Scanner(System.in);
        int t;
       // sc.nextLine();
        Stack stk=new Stack(100);
    
       
        t=sc.nextInt();
        sc.nextLine();
        while(t>0)
        {
            
           String s[]=sc.nextLine().split(" ");
             
            String s1="push",s2="pop";
            
            if((s[0].equals(s1))){
                
            int x=Integer.parseInt(s[1]);
                stk.push(x);
                
            }
            
            else
            {
                stk.pop();
                
            }
            
            
            t--;
        }
      
        
        
        
        
        
        
        
        
        
        
    }
}
