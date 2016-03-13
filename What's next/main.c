#include <stdio.h>
#include <stdlib.h>

int main()
{
    int x,y,z;

    while(1)
    {
        scanf("%d %d %d",&x,&y,&z);
        if(x==0&&y==0&&z==0)
            break;
        else
        {
            if(z-y==y-x)
                printf("AP %d\n",z+(z-y));
           else
                if((z/y)==(y/x))
                    printf("GP %d\n",z*(z/y));
        }


    }
    return 0;
}
