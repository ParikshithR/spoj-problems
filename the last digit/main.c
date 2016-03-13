#include <stdio.h>
#include <stdlib.h>
int main()
{
    char n;
    char a[]={0,1,4,4,2,1,1,4,4,2};
    scanf("%d",&n);
    while(n--)
    {
        int x,y,sum;
        scanf("%d %d",&x,&y);
        if(y==0)
        {
            printf("1\n");
        }
        else
        {
            x=x%10;
            if(x==0)
            {
                printf("0\n");
                continue;
            }
            y=(y-1)%a[x];
            sum=x;
            while(y>0)
            {
                sum=(x*sum)%10;
                y--;
            }
            printf("%d\n",sum);
        }
    }
}
