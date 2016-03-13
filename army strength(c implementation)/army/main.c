#include <stdio.h>
#include <stdlib.h>

int main()
{
    int t;
    scanf("%d",&t);
    while(t--)
    {
        int max,max2,i,godzilla,mechagodzilla;
        printf("\n");
        scanf("%d %d",&godzilla,&mechagodzilla);

        scanf("%d",&max);
        for(i=1;i<godzilla;i++)
        {
            int temp;
            scanf("%d",&temp);
            if(temp>max)
            {
                max=temp;
            }
        }
         scanf("%d",&max2);
        for(i=1;i<mechagodzilla;i++)
        {
            int temp;
            scanf("%d",&temp);
            if(temp>max2)
            {
                max2=temp;
            }
        }
        if(max2>max)
        {
            printf("MechaGodzilla\n");
        }
        else
        {
            printf("Godzilla\n");
        }

    }
    return 0;
}
