#include <stdio.h>
#include <stdlib.h>
#include<string.h>

int main()
{
   int t,k=1;
   scanf("%d",&t);
   char test [][3]={"TTT","TTH","THT","THH","HTT","HTH","HHT","HHH"};

   while(t--)
   {
       int result [8]={0};
       int n,i,j;
       char a[40];
       scanf("%d",&n);
       scanf("%s",a);
       for(i=0;i<38;i++)
       {
          //char p[3]=substr(a,i,a[])
          for(j=0;j<8;j++)
          {
              if(strncmp(a+i,test[j],3)==0)
              {
                  result[j]++;
                  break;
              }
          }
       }

       printf("%d ",k++);
       for(i=0;i<8;i++)
       {
           printf("%d ",result[i]);
       }
       printf("\n");


   }
   return 0;
}
