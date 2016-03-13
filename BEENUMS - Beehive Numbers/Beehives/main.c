#include <stdio.h>
#include <stdlib.h>

int main()
{

   while(1)
   {
       int j=1,no,i;
       scanf("%d",&no);
       if(no==-1)
        break;

        for( i=1;i<=no;i+=(6*j++))
        {

            if(i==no)
            {
                printf("Y\n");
                break;
            }

        }
        if(i>no)
        printf("N\n");


   }
   return 0;
}
