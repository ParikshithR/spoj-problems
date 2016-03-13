#include<stdio.h>
#include<math.h>
int main()
{
printf("135=");
cal(137);
printf("\n");
printf("1315=");
cal(1315);
printf("\n");
printf("73=");
cal(73);
printf("\n");
printf("136=");
cal(136);
printf("\n");
printf("255=");
cal(255);
printf("\n");
printf("1384=");
cal(1384);
printf("\n");
printf("16385=");
cal(16385);



}
void cal(int n)
{
    if(n==1)
    {
        printf("2(0)");
    }
    else
    if(n==2)
    {
        printf("2");
    }
    else
    if(n==4)
    {
        printf("2(2)");
    }
    else
    {
        int i=0;
        while(pow(2,i)<=n)
        {
            i++;
        }
        i--;
        if(i==1)
            printf("2+");
        else{
        printf("2(");
        cal(i);
        if(pow(2,i)!=n)
        printf(")+");
        else
            printf(")");
        }
        if(pow(2,i)!=n)
        cal(n-pow(2,i));


    }

   /*
    printf("2(")*/
}
