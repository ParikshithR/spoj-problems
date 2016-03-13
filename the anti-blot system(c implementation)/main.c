#include <stdio.h>
#include <stdlib.h>

int check ( char * a)
{
    int i=0,sum=0;
    for(i=0;a[i];i++)
    {
        if(a[i]=='m')
        {
            return -1;
        }
        else
        {
            sum=sum*10+(a[i]-'0');
        }
    }
    return sum;
}
int main()
{
    int n;
    scanf("%d",&n);
   // printf("%d",sizeof(int));
    while(n--)
    {
        int i,j=1,x,y,z;

        char exp[50],*a[3];
        printf("\n");
        fflush(stdin);

        gets(exp);

        a[0]=exp;

        for(i=1;exp[i];i++)
        {
            if(exp[i]==' '||exp[i]=='+'||exp[i]=='=')
            {
                if(exp[i]=='+'||exp[i]=='=')
                {
                    exp[i]='\0';
                    if(exp[i+1]!=' ')
                    i+=1;
                    else
                        i+=2;
                }
                else{
                        exp[i]='\0';
                    if(exp[i+2]!=' ')
                        i+=2;
                    else
                        i+=3;
                }



                a[j++]=exp+i;
            }
        }
        x=check(a[0]);
        y=check(a[1]);
        z=check(a[2]);
        if(x==-1)
        {
            x=z-y;
        }
        if(y==-1)
        {
            y=z-x;
        }
        if(z==-1)
        {
            z=x+y;
        }
        printf("%d + %d = %d\n",x,y,z);

    }
}
