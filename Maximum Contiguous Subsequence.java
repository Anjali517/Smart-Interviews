import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i =0 ;i<n ;i++){
                a[i] =sc.nextInt();
            }
            HashSet<Integer> set = new HashSet<>();
            for(int i = 0 ;i < n ; i++){
                set.add(a[i]);
            }
            int maxCount = 0;
            for(int i = 0 ; i < n ;i++){
                if(!set.contains(a[i]-1)){
                    int count = 0;
                    int num = a[i];
                    while(set.contains(num)){
                        count++;
                        num++;
                    }
                    maxCount = Math.max(maxCount,count);
                }
            }
            System.out.println(maxCount);
            t--;
        }
    }
}
