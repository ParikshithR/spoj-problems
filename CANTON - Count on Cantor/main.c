#include <stdio.h>
#include <stdlib.h>

int main()
{
    int t;
    scanf("%d",&t);
    while(t--)
    {
       unsigned int n,i,count,num,den;
        scanf("%d",&n);
        for(i=1;(i*(i+1)/2)<n;i++);
        i--;
        count=i*(i+1)/2;
        count++;
        if((i+1)%2==0)
        {   num=0;
            den=i+2;
        }
        else
        {
            num=i+2;
            den=0;
        }
        while(count<=n)
        {
            if((i+1)%2==0)
                {
                    num++;
                    den--;
                }
            else
            {
                num--;
                den++;
            }
            count++;
        }
        printf("TERM %d IS %d/%d\n",n,num,den);
    }
    return 0;
}
