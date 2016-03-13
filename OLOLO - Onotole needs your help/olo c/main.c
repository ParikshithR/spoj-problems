#include <stdio.h>
#include <stdlib.h>

int main()
{
  long long int n,sum;
   scanf("%lli",&n);
   n--;
   scanf("%lli",&sum);
   while(n--)
   {
       long long int n1;
       scanf("%lli",&n1);
       sum=sum^n1;
   }
   printf("%lli",sum);
   //printf("%d %d %d %d",sizeof(int),sizeof(long long int),sizeof(unsigned int),sizeof(unsigned long));
}
