#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n,n1,i=0,sum=0;
    int *a;
   while(1)
   {
           i=0;
           sum=0;
            scanf("%d",&n);
            if(n==-1)
                break;
            n1=n;


            a=(int *)malloc(sizeof(int)*n);
            while(n1!=0)
            {
                scanf("%d",a+(i++));
                sum+=a[i-1];
                n1--;
            }
            if(sum%n==0)
            {

                n1=sum/n;
                sum=0;  //for calculating moves
                for(i=0;i<n;i++)
                {
                    if(a[i]>n1)
                    {
                        sum+=(a[i]-n1);
                    }
                }
                printf("%d\n",sum);
            }
            else
            {
                printf("-1\n");
            }
   }

    return 0;
}
