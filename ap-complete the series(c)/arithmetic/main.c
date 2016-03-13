
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int t;
    scanf("%d",&t);
    while(t--)
    {
        int j=1;
        long long third,thirdlast,sum,d,firstTerm,n;
        scanf("%lld %lld %lld",&third,&thirdlast,&sum);
        n=(2*sum)/(thirdlast+third);
        d=(thirdlast-third)/(n-5);
        firstTerm=third-2*d;
        printf("%lld\n",n);
        for(;j<=n;j++)
        {
            printf("%lld ",firstTerm+(j-1)*d);
        }
        printf("\n");
    }
}


