#include <stdio.h>
#include <stdlib.h>
#include<string.h>

int main()
{
    int t;
    char a[1002];
    char results[10][5]={{0,0,0,0,1},{1,0,0,0,1},{6,2,4,8,4},{1,3,9,7,4},{6,4,0,0,2},{5,0,0,0,1},{6,0,0,0,1},{1,7,9,3,4},{6,8,4,2,4},{1,9,0,0,2}};
    scanf("%d",&t);
    while(t--)
    {
        char l,last;
        unsigned long long b;
        scanf("%s",a);
        scanf("%llu",&b);
        l=strlen(a);
        last=a[l-1]-'0';
        if(b==0)
            printf("1\n");
else{
                            l=b%results[last][4];
                            printf("%d\n",results[last][l]);
                            }
    }
    return 0;
}
