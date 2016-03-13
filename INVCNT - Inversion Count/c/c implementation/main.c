#include <stdio.h>
#include <stdlib.h>
#define ll long long
/*long long sort(long long *a,long long l,long long h)
{
    long long pivot=l,t;
    l=l+1;
    while(1)
    {
        while(a[l]<a[pivot])
            l++;
        while(a[h]>a[pivot])
            h--;
        if(h<=l)
        {
            long long t=a[pivot];
            a[pivot]=a[h];
            a[h]=t;
            return h;
        }
        t=a[l];
        a[l]=a[h];
        a[h]=t;

    }
}
void quickSort(long long *a,long long l,long long h)
{
    if(l<h)
    {
        long long n=sort(a,l,h);
        quickSort(a,l,n-1);
        quickSort(a,n+1,h);
    }
}*/
int merge(ll *a,ll l,ll h,ll invl,ll invr)
{
    ll z,i,j,n=(h-l)+1,*temp,mid=(h+l)/2,inv=0,k=0;
    temp=(ll *)malloc(sizeof(ll)*n);
    i=l;

    j=mid+1;



    while(i<=mid&&j<=h)
    {
        if(a[i]>a[j])
        {
                z=a[i];
            inv+=(mid-i)+1;
            temp[k++]=a[j];
            j++;
        }
        else
        {
            temp[k++]=a[i];
            i++;
        }
    }

    while(i<=mid)
    {
        temp[k++]=a[i];
        i++;
    }
    while(j<=h)
    {
        temp[k++]=a[j];
        j++;
    }
    k=0;
    for(i=l;i<=h;i++,k++)
    {
        a[i]=temp[k];
    }
    return invr+invl+inv;

}
int mergeSort(ll *a,ll l,ll h)
{
    if(l<h)
    {
       int n=(l+h)/2,invl,invr;
       invl= mergeSort(a,l,n);
        invr=mergeSort(a,n+1,h);
        return merge(a,l,h,invl,invr);
    }
    return 0;
}
int main()
{
    long long int t;
    scanf("%lld",&t);

    while(t--)
    {
        ll a[200000];
        long long int n,i,j,count;

       scanf("\n");
       scanf("%lld",&n);
       //a=(long long *)malloc(sizeof(long long)*n);
       for(i=0;i<n;i++)
       {
           scanf("%lld",a+i);
       }

       count=mergeSort(a,0,n-1);
       printf("%d\n",count);
       //quickSort(a,0,n-1);
       /*count=0L;
       for(i=0;i<n-1;i++)
       {
           for(j=i+1;j<n;j++)
           {
               if(a[i]>a[j])
                count++;
           }
       }
       printf("%lld\n",count);
        */

    }
    return 0;
}
