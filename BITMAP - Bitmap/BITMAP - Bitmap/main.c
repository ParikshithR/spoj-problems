#include <stdio.h>
#include <stdlib.h>
int r,c;
int bfs(char ** a,int i,int j)
{
    int x,y,k,m;
    //printf("%d %d",r,c);
    if(a[i][j]=='1')
        return 0;
    int **visited=(int **)calloc(sizeof(int*),r);
    for(k=0;k<r;k++)
    {
        visited[k]=(int *)calloc(sizeof(int),c);
    }
    //for(k=0;k<r;k++)
      //  for(m=0;m<c;m++)
      //  printf("%d",visited[k][m]);
    int * queueX=(int *)malloc(sizeof(int )*r*c);
    int * queueY=(int *)malloc(sizeof(int )*r*c);
    int front=-1,rear=-1;
    queueX[++rear]=i;
    queueY[rear]=j;
    visited[i][j]=1;

    do{
    x=queueX[++front];
    y=queueY[front];

    if(x>0&&!visited[x-1][y])
    {
        if(a[x-1][y]=='1')
           {

             return abs(y-j)+abs(x-1-i);
           }
        visited[x-1][y]=1;
         queueX[++rear]=x-1;
         queueY[rear]=y;
    }
    if(y>0&&!visited[x][y-1])
    {    if(a[x][y-1]=='1')
                {
                    return abs(y-1-j)+abs(x-i);
                }
        visited[x][y-1]=1;
            queueX[++rear]=x;
            queueY[rear]=y-1;
    }
    if(x+1<r&&!visited[x+1][y])
    {
                if(a[x+1][y]=='1'){

            return abs(y-j)+abs(x+1-i);
                }
        visited[x+1][y]=1;
        queueX[++rear]=x+1;
        queueY[rear]=y;
    }
    if(y+1<c&&!visited[x][y+1])
    {
        if(a[x][y+1]=='1'){

            return abs(y+1-j)+abs(x-i);
        }
        visited[x][y+1]=1;
        queueX[++rear]=x;
        queueY[rear]=y+1;
    }
    }while(rear!=front);

    return -1;


}
int main()
{
   int t;
   scanf("%d",&t);
   while(t--)
   {
       int i,j;
        scanf("%d %d",&r,&c);
        int **result=(int **)calloc(sizeof(int*),r);//store the result
        for(i=0;i<r;i++)
            result[i]=(int *)calloc(sizeof(int),c);

       char ** a;

        a=(char **)malloc(sizeof(char*)*r);//stores the input
        for(i=0;i<r;i++)
            a[i]=(char *)malloc(sizeof(char)*c);
        //char *aa=(char *)malloc(sizeof(char)*4);
        //scanf("%s",aa);
        for( i=0;i<r;i++)
            scanf("%s",a[i]);

        for( i=0;i<r;i++)
            for(j=0;j<c;j++)
        {
            result[i][j]=bfs(a,i,j);

        }
        for(i=0;i<r;i++)
        {
            for( j=0;j<c;j++)
        {
            printf("%d ",result[i][j]);
        }
        printf("\n");
        }
        scanf("\n");


   }
    return 0;
}
