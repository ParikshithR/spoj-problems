#include <stdio.h>
#include <stdlib.h>

int main()
{
    int t;
    scanf("%d",&t);
    while(t--)
    {
        int p;
        long long n;
        scanf("%lld %d",&n,&p);
        if(p==0)
            printf("Airborne wins.\n");
        else
            printf("Pagfloyd wins.\n");
    }
    return 0;
}
