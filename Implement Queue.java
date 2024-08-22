import java.io.*;
import java.util.*;

public class Queue{
     int rear;
     int front;
     int a[];
     Queue(int size)
    {
        a=new int[size];
        rear=-1;
        front=-1;
    }
    public void enqueue(int data)
    {
      
        
            a[++rear]=data;
        
    }
      
    public void dequeue()
    {
        
        if(rear==front)
            System.out.println("Empty");  
        else
        System.out.println(a[++front]);    
       
   
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc=new Scanner(System.in);
        int t;
       // sc.nextLine();
        Queue stk=new Queue(100000);
    
       
        t=sc.nextInt();
        sc.nextLine();
        while(t>0)
        {
            
           String s[]=sc.nextLine().split(" ");
             
            String s1="Enqueue",s2="Dequeue";
            
            if((s[0].equals(s1))){
                
            int x=Integer.parseInt(s[1]);
                stk.enqueue(x);
                
            }
            
            else
            {
                stk.dequeue();
                
            }
            
            
            t--;
        }
      
        
        
        
        
        
        
        
        
        
        
    }
}
