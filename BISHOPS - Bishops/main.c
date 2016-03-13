#include <stdio.h>
#include <stdlib.h>
#include<string.h>
int main()
{

    char a[102];
    while(scanf("%s",a)!=EOF)
    {
        int l,sum,carry=0,i,borrow=0,t;
        l=strlen(a);
        if(strcmp(a,"0")==0||strcmp(a,"1")==0)
            printf("%s\n",a);
        else
        {
            for(i=l-1;i>=0;i--)
            {
                sum=(a[i]-'0')*2+carry;
                carry=sum/10;
                sum=(sum%10)+'0';
                a[i]=sum;

            }
            //if(carry)
              //  printf("1");
            //printf("%s\n",a);
            t=a[l-1]-'0';
            if(t<2)
            {
                borrow=1;
                t+=10;
            }
            t=t-2;
            a[l-1]=t+'0';

            for(i=l-2;i>=0;i--)
            {
                    t=a[i]-'0';
                    if(t==0)
                    {
                        if(borrow==1)
                            a[i]='9';

                    }
                    else
                    {
                        if(borrow==1)
                            a[i]--;
                        borrow=0;
                    }
            }
            if(carry==1&&borrow==1)
            {
                carry=0;
                borrow=0;
            }
            if(carry)
                printf("1");
            printf("%s\n",a);

        }
    }
    return 0;
}
