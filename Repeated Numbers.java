import java.io.*;
import java.util.*;

public class Solution {
        void mergeSort(int ar[],int low,int high,int n)
        {
            if(low==high)
            {
                    return;
            }
                int mid=(low+high)/2;
                mergeSort(ar,low,mid,n);
                mergeSort(ar,mid+1,high,n);
                merge(ar,low,mid,high);
        }
        void merge(int ar[],int low,int mid,int high)
        {
                int temp[]=new int[high-low+1];
                int x=mid+1,k=0,low1=low;
                while(low<=mid && x<=high)
                {
                        if(ar[low]<=ar[x])
                                temp[k++]=ar[low++];
                        else
                                temp[k++]=ar[x++];
                }
                while(low<=mid)
                {
                        temp[k++]=ar[low++];
                }
                while(x<=high)
                {
                        temp[k++]=ar[x++];
                }
                for(int i=0;i<high-low1+1;i++)
                {
                        ar[low1+i]=temp[i];
                }
        }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            for(int l=0;l<t;l++)
            {
                    int n=sc.nextInt();
                    int ar[]=new int[n];
                    for(int i=0;i<n;i++)
                    {
                            ar[i]=sc.nextInt();
                    }
                    Solution s=new Solution();
                    s.mergeSort(ar,0,n-1,n);
                    for(int i=0;i<n-1;i++)
                    {
                            if(ar[i]==ar[i+1])
                            {
                             System.out.print(ar[i]+" ");
                              i++;
                            }
                    } 
                    System.out.println();
            }
    }
}
