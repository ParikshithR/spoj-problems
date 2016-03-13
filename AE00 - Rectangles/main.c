#include <stdio.h>
#include <stdlib.h>
#include<math.h>
int main()
{
    int n,count=0,i,j;
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=sqrt(i);j++)
        {

            if(i%j==0)
                count++;
        }

    }
    printf("%d",count);
    return 0;
}
