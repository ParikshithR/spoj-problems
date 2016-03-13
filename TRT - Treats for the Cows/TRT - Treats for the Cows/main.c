#include <stdio.h>
#include <stdlib.h>
long long memo[2000][2000];
int n;
long long max(long long a,long long b)
{
    return a>b?a:b;
}
long long calProfit(int a[],int b,int e)
{
    int year;
    if(b>e)
        return 0;
    if(memo[b][e]!=-1)
        return memo[b][e];
    year=n-(e-b);
    memo[b][e]=max(calProfit(a,b+1,e)+(year*a[b]),calProfit(a,b,e-1)+(year*a[e]));

    return memo[b][e];

}
int main()
{
    int i,j,t;
    int values[2000];
    scanf("%d",&n);
    for(i=0;i<n;i++)
        for(j=0;j<n;j++)
            memo[i][j]=-1;
    t=n;
    i=0;
    while(t--)
    {
        scanf("%d",values+i);
        i++;

    }
    printf("%lld",calProfit(values,0,n-1));

    return 0;
}
