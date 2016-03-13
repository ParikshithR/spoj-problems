#include <stdio.h>
#include <stdlib.h>
#define INF -10000
int main()
{
    int t,r,c;
     scanf("%d",&t);
    while(t--)
    {
        int max1,**matrix,**costMat,i,j;

        scanf("%d %d",&r,&c);
        matrix=(int **)malloc(sizeof(int *)*r);
        costMat=(int **)malloc(sizeof(int *)*r);
        for(i=0;i<r;i++)
        {
           matrix[i]=(int *)malloc(sizeof(int)*c);
           costMat[i] =(int *)malloc(sizeof(int)*c);
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                scanf("%d",&matrix[i][j]);
            }
        }

        for(i=0;i<r-1;i++)
        {
            for(j=0;j<c;j++)
            {
                costMat[i][j]=INF;
            }
        }
        for(i=0;i<c;i++)
        {
            costMat[r-1][i]=matrix[r-1][i];
        }
        max1=0;
        for(i=0;i<c;i++)
        {
            max(0,i,costMat,r,c,matrix);
            if(max1<costMat[0][i])
            {
                max1=costMat[0][i];
            }
        }
        printf("%d\n",max1);

    }
}
void max(int row,int col,int **costMat,int r,int c,int ** matrix)
{
    int i,j;
    if(costMat[row][col]!=INF)
    {
        return ;
    }
    else
    {
        int a,b,c1;
        if(col!=0)
        {

            max(row+1,col-1,costMat,r,c,matrix);
            a=costMat[row+1][col-1];
        }
        else
        {
            a=INF;
        }

        if(col!=c-1)
        {
            max(row+1,col+1,costMat,r,c,matrix);
            b=costMat[row+1][col+1];
        }
        else
            b=INF;
        max(row+1,col,costMat,r,c,matrix);
        c1=costMat[row+1][col];
        c1=a>b?(a>c1?a:c1):(b>c1?b:c1);

        costMat[row][col]=matrix[row][col]+c1;

    }

}
