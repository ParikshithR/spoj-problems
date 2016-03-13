#include <stdio.h>
#include <stdlib.h>
#define ll long long
int main()
{
   ll t;
   scanf("%lld",&t);
   while(t--)
   {
       ll temp,a;
       int x;
       x=0;
       char c;
       scanf("\n");
       scanf("%lld",&temp);
       while(1)
       {
           scanf(" %c",&c);
           switch(c)
           {
               case '*': scanf(" %lld",&a);
                         temp*=a;
                         break;
               case '/': scanf(" %lld",&a);
                         temp/=a;
                         break;
                case '+': scanf(" %lld",&a);
                         temp+=a;
                         break;
                 case '-': scanf(" %lld",&a);
                         temp-=a;
                         break;
                case '%': scanf(" %lld",&a);
                         temp%=a;
                         break;
                case '=': printf("%lld\n",temp);
                         x=1;
                         break;
            }
            if(x==1)
                break;
       }
   }
    return 0;
}
