#include <stdio.h>
#include <stdlib.h>

int main()
{
   int n;
   scanf("%d",&n);

   while(n--)
   {

      long long int k,n1,n2,sum=0;
       printf("\n");
       scanf("%lld",&n1);
       n2=n1;
       while(n1--)
       {

           scanf("%lld",&k);
           sum=(sum+k)%n2;
       }
       if(sum%n2==0)
       {
           printf("YES\n");
       }
       else
       {
           printf("NO\n");
       }
   }
   return 0;
}
