#include <stdio.h>
#include <stdlib.h>

int main()
{
    int t;
    scanf("%d",&t);
    while(t--)
    {
        int result,n,i;
        scanf("%d",&n);
        //if n=p1^a1*p2^a2*p3^a3...*pn^an then
        //fi(n)=n*(1-1/p1)*(1-1/p2)*....*(1-1/pn)
        result=n;
        for(i=2;i*i<=n;i++)
        {
            //if i is a factor
            if(n%i==0)
            {
                result-=result/i;
                //we have to consider 1 factor only once
                //so divide until the no is divisible by that factor
                while(n%i==0)
                    n=n/i;
            }

        }
        //if n has a factor greater than square root
        //only one such factor will be there
        if(n>1)
        {
            result-=result/n;
        }
        printf("%d\n",result);
    }
    return 0;
}
