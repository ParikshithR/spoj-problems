#include <stdio.h>
#include <stdlib.h>
void merge(int *a,int l,int n,int h)
{
    int i,j,k;
    int *temp=(int *)malloc(sizeof(int)*(h-l+1));
    i=l,j=n+1,k=0;
    while(i<=n&&j<=h)
    {
        if(a[i]<a[j])
        {
            temp[k++]=a[i++];
        }
        else
        {
            temp[k++]=a[j++];
        }
    }
    if(i<=n)
    {
        while(i<=n)
            temp[k++]=a[i++];
    }
    else
    {
        while(j<=h)
            temp[k++]=a[j++];
    }
    j=l;
    for(i=0;i<=h-l;i++)
    {
        a[j++]=temp[i];
    }
    free(temp);

}
void mergeSort(int *a,int l,int h)
{
    if(l<h)
    {
        int n1=(l+h)/2;
        mergeSort(a,l,n1);
        mergeSort(a,n1+1,h);
        merge(a,l,n1,h);
    }
}
int main()
{
   int n,i;
   scanf("%d",&n);
   while(n--!=0)
   {
       int n1,sum;
       scanf("%d",&n1);
       if(n1<1||n1>1000)
        continue;
       int *men=(int *)malloc(sizeof(int)*n1);
       int *lad=(int *)malloc(sizeof(int)*n1);
       for(i=0;i<n1;i++)
       {
           scanf("%d",men+i);

       }
       for(i=0;i<n1;i++)
       {
           scanf("%d",lad+i);

       }
       sum=0;
       mergeSort(men,0,n1-1);
       mergeSort(lad,0,n1-1);
       for(i=0;i<n1;i++)
       {
           sum+=(men[i]*lad[i]);
       }
       printf("%d\n",sum);

   }
    return 0;
}
