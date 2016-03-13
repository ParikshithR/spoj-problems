#include <stdio.h>
#include <stdlib.h>
#include<math.h>

int main()
{
    int t,i=1;
    scanf("%d",&t);
    while(t--)
    {
        int d;

        scanf("%d",&d);
       d+=d;
        printf("Case %d: %.2lf\n",i++,pow(d,2)-pow(0.5,2)+0.5);
    }
}
