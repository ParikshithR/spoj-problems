#include <stdio.h>
#include <stdlib.h>

int main()
{
    float n,sum=0;
    float a=2;
    scanf("%f",&n);
    do{
    sum=0;
    a=2;
    while(sum<n)
    {
       // printf("%f ",a);
        sum=sum+(1/a);
        a++;
    }
    a--;
    printf("%d card(s)\n",(int)--a);
    scanf("%f",&n);
    }while(n!=0.00);
    return 0;
}
