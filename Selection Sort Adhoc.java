#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int t;
    scanf("%d",&t);
    while(t--)
    {
        int n;
        scanf("%d",&n);
        int a[100];
        for(int i=0;i<n;i++)
            scanf("%d",&a[i]);
        int i,j,min;
        for(i=n-1;i>0;i--)
        {
            min=i;
            for(j=i-1;j>=0;j--)
            {
                if(a[j]>=a[min])
                  min=j;
            }
            printf("%d ",min);
            int t=a[i];
            a[i]=a[min];
            a[min]=t;
            
        }
        printf("\n");
    }
    
    return 0;
}
