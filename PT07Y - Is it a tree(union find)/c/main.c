#include <stdio.h>
#include <stdlib.h>

void union1(int *a,int n,int i,int p)
{
    int k=a[i],j;
    for(j=0;j<n;j++)
    {
        if(a[j]==k)
        {
            a[j]=p;
        }
    }
}
int find(int *p,int a,int b)
{
    if(p[a]==p[b])
        return 1;
    return 0;
}
int main()
{
    int *a,n,e,i,u,v;
    scanf("%d %d",&n,&e);
    if(n!=(e+1))
    {
        printf("NO");
        exit(0);
    }
    a=(int *)malloc(sizeof(int)*n);
    for(i=0;i<n;i++)
    {
        a[i]=i;
    }
    while(e--)
    {
        scanf("%d %d",&u,&v);
        u--;v--;
        if(find(a,u,v))
        {
            printf("NO");
            exit(0);
        }
        else
        {
            union1(a,n,u,v);
        }

    }
    printf("YES");
    return 0;
}
