#include <stdio.h>
#include <stdlib.h>
#include<string.h>
int check(char * a)
{
    int i,sum=0;
    for(i=0;a[i];i++)
    {
        if(a[i]=='m')
            return -1;
        else
        {
            sum=sum*10+(a[i]-'0');
        }
    }
    return sum;
}
int main()
{
    int t;
    scanf("%d",&t);
    while(t--)
    {
        char a[500],*b,*c;
        int x,y,z;
       scanf("\n");
        gets(a);
        b=strchr(a,' ');
        b=b+1;
        b[-1]=0;
        x=check(a);
        c=strchr(b,'=');
        c[-1]=0;
      //*(c-1)=0;
        y=check(b+2);
        z=check(c+2);
        if(x==-1)
            printf("%d + %d = %d\n",z-y,y,z);
        if(y==-1)
            printf("%d + %d = %d\n",x,z-x,z);
        if(z==-1)
            printf("%d + %d = %d\n",x,y,x+y);



    }
    return 0;
}
