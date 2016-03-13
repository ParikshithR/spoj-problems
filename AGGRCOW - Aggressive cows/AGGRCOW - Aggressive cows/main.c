#include <stdio.h>
#include <stdlib.h>

int main()
{
    int t;
    scanf("%d",&t);
    while(t--)
    {
        int n,c;
        unsigned int *a;
        scanf("%d %d",&n,&c);
        a=(unsigned int *)malloc(sizeof(unsigned int )*n);
        for(i=0;i<n;i++)
        {
            scanf("%u",a+i);
        }
        sort(a);

    }
    return 0;
}
