#include <stdio.h>
#include <stdlib.h>

int main()
{
  int t;
  scanf("%d",&t);
  while(t--)
  {
      unsigned int n;
     // printf("%d\n",sizeof( long long unsigned));
     scanf("%u",&n);
      printf("%u\n",((((long long unsigned)n*(2*3+(n-1)*3))/2)-n)%1000007);
   // printf("%lu\n",(long long unsigned)500000*3000003);
  }
    return 0;
}
