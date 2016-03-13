#include <stdio.h>
#include <stdlib.h>

int main()
{
    int attackers,defenders;
    scanf("%d %d",&attackers,&defenders);
    while(attackers!=0&&defenders!=0)
    {
        int a1[defenders],j;
        int temp,lastd,secondlastd,a,i;
        scanf("%d",&a);
        for(i=1;i<attackers;i++)
        {

            scanf("%d",&temp);
            if(temp<a)
            {
                a=temp;
            }
        }
        for(i=0;i<defenders;i++)
        {
            scanf("%d",a1+i);
        }
        for(i=1;i<defenders;i++)
        {
            for(j=0;j<defenders-i;j++)
            {
                if(a1[j]>a1[j+1])
                {
                  int temp=a1[j];
                  a1[j]=a1[j+1];
                  a1[j+1]=temp;

                }
            }
        }

        secondlastd=a1[1];
        if(a<secondlastd)
        {
            printf("Y\n");
        }
        else
        {
            printf("N\n");
        }
        scanf("%d %d",&attackers,&defenders);



    }
     return 0;
}
