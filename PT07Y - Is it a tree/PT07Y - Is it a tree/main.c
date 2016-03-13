#include <stdio.h>
#include <stdlib.h>

int main()
{
    int x=0,i,j,n,m**connected,*visited,*s/*,connected[10000][10000]={{0}},visited[10000]={0},s[10000]={0}*/,top=-1,start;
    scanf("%d%d",&n,&m);
    if(m!=n-1)
    {
        printf("NO\n");

    }
    else
    {
        connected=(int **)malloc(sizeof(int *)*n);
        visited=(int *)malloc(sizeof(int)*n);
        s=(int *)malloc(sizeof(int)*n);

        for(i=0;i<n;i++)
           connected[i]=(int *)malloc(sizeof(int)*n);
           for(i=0;i<n;i++)
        {
            visited[i]=0;
            for(j=0;j<n;j++)
                connected[i][j]=0;
        }
            for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                printf("%d",connected[i][j]);
            printf("\n");
        }
        for(i=0;i<m;i++)
        {
            int a,b;
            scanf("%d%d",&a,&b);
            connected[a-1][b-1]=1;
            connected[b-1][a-1]=1;
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                printf("%d",connected[i][j]);
            printf("\n");
        }
        start=0;
        visited[start]=1;
        s[++top]=start;
        while(top!=-1)
       {
           start=s[top];
            for(i=0;i<n;i++)
            {
                if(connected[start][i]&&!visited[i])
                {
                    s[++top]=i;
                    visited[i]=1;
                    break;
                }

            }
            if(i==n)
                top--;
       }
       for(i=0;i<n;i++)
       {
           if(visited[i]==0)
                x=1;
             printf("%d ",visited[i]);
       }
       if(x==1)
        printf("NO\n");
       else
        printf("YES\n");





    }
    return 0;
}
