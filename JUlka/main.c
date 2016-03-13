#include <stdio.h>
#include <stdlib.h>
#include<string.h>
#include<math.h>

/*void add(char *a,char *b)
{
    int carry=0,sum=0;
    int n1=strlen(a)-1;
    int n2=strlen(b)-1;
    for(;n2>=0;n2--,n1--)
    {
        int x=a[n1]-'0';
        int y=b[n2]-'0';
        sum=(x+y+carry)%10;
        carry=(x+y+carry)/10;
        a[n1]=sum;

    }
}
*/
int addn;
int n22;
char * add(char *a ,char *b)
{
    char *add=(char *)malloc(sizeof(char)*105);
    int n1,n2,sum=0,carry=0,i=0,j;
    n1=strlen(a)-1;
    n2=strlen(b)-1;
    n22=n2+1;
    for(;n2>=0;n1--,n2--)
    {
        int x=a[n1]-'0';
        int y=b[n2]-'0';
        sum=(x+y+carry)%10;
        carry=(x+y+carry)/10;
        add[i++]=sum;

    }
    while(n1>=0)
    {
        sum=a[n1--]-'0';
        sum+=carry;
        carry=sum/10;
        sum=sum%10;

        add[i++]=sum;
    }
    if(carry!=0)
    {
        add[i++]=carry;
    }
    addn=i;

    return add;
}
char * divide(char*a,int n)
{
    int i=0,carry=0,sum=0,p=0;
    for(i=addn-1;i>=0;i--)
    {
        int x=(a[i]);
        if(carry!=0)
        x+=10;


        sum=x/n;
        carry=x%n;
      //  printf("%d\n",sum);
        if(sum==0&&p==0)
        {
            a[i]='\0';
            addn=i;
        }
        else
        {
            a[i]=sum;
            p=1;
        }
    }
    return a;



}
void subtract(char * a,char *b)
{
    int borrow=0,sum=0,i,j=n22-1;
    for(i=0;i<addn&&j>=0;i++,j--)
    {
        int x,y;
        x=a[i];
        y=(b[j]-'0')+borrow;
        if(x<y)
        {
            borrow=1;
            x+=10;
            sum=x-y;
            a[i]=sum;
        }
        else
        {
            sum=x-y;
            a[i]=sum;
            borrow=0;
        }
    }
    while(i<addn)
    {
        int x=a[i];
        if(x<borrow)
        {

            x+=10;
            sum=x-borrow;
            borrow=1;
            a[i]=sum;
        }
        else
        {
            sum=x-borrow;
            borrow=0;
            a[i]=sum;
        }
        i++;
    }
    j=0;
    for(i=addn-1;i>=0;i--)
    {
        if(a[i]!=0)
            j=1;
        if(j)
            printf("%d",a[i]);


    }
    if(j==0)
        printf("0");
    printf("\n");

}
int main()
{
    int i,j=1;
    char a[102],b[102],*addition;

    while(j<=10)
    {
        scanf("%s",a);
        scanf("%s",b);
         addition=add(a,b);
        addition=divide(addition,2);
         for(i=addn-1;i>=0;i--)
        {
            printf("%d",addition[i]);
        }
        printf("\n");
         subtract(addition,b);
         j++;
    }

    return 0;
}
