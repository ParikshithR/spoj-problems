#include <stdio.h>
#include <stdlib.h>
#include<string.h>

int main()
{
    int i,T,j,n=0;
    scanf("%d",&T);
    while(T--){
   char a[1000005];
   scanf("%s",a);


   n=strlen(a);
   //check if the no is a palindrome
   for(i=0,j=n-1;i<j;i++,j--)
   {
       if(a[i]!=a[j])
        break;
   }
   if(i>=j)//palindrome
   {
       //if the middle no is less than 9 then increase it by 1
       if(n&1)//odd
       {
           if(a[n/2]<'9')
           {
               a[n/2]++;
               printf("%s\n",a);
           }
           else
           {
               a[n/2]='0';
               for(i=n/2-1,j=n/2+1;i>=0;i--,j++)
               {
                   if(a[i]<'9')
                   {
                       a[i]++;
                       a[j]++;
                       break;
                   }
                   else
                   {
                       a[i]='0';
                       a[j]='0';
                   }


               }
               if(i<0)
               {
                   printf("1");
                   a[n-1]='1';
                   //a[0]='1';
                   a[n]=0;

               }
                 printf("%s\n",a);
           }
       }
       else//even length
       {
           i=n/2-1;
           j=n/2;
           while(i>=0)
           {
               if(a[i]<'9')
               {
                   a[i]++;
                   a[j]++;
                   break;
               }
               else
               {
                   a[i]=a[j]='0';

               }
               i--;
               j++;
           }
           if(i<0)
           {
               a[n-1]='1';
               printf("1");
               a[n]=0;
            }
            printf("%s\n",a);

       }
   }
   else//not a palindrome
   {
       if(n&1)//odd
       {
           j=n/2+1;
           i=n/2-1;
           for(;i>=0;i--,j++)
           {
               if(a[j]>a[i])
               {
                   if(a[n/2]<'9')
                        a[n/2]++;
                    else
                    {
                        int carry;
                        int k=n/2-1;
                        carry=1;
                        a[n/2]='0';
                        while(k>=0&&carry)
                        {

                            int t=carry;
                            carry=((a[k]-'0')+carry)/10;

                            a[k]=(((a[k]-'0')+t)%10)+'0';
                            k--;

                        }
                    }
                   break;
               }
           }
           i=n/2-1;
           j=n/2+1;
           while(j<n)
            {
                a[j]=a[i];
                j++;
                i--;
            }
            printf("%s\n",a);

       }
       else//even
       {
           i=n/2-1;
           j=n/2;
           for(;i>=0;i--,j++)
           {
               if(a[j]>a[i])
               {
                   if(a[n/2-1]<'9')
                   {
                       a[n/2-1]++;

                   }
                   else
                   {
                       int carry;
                        int k=n/2-2;
                        carry=1;
                        a[n/2-1]='0';
                        while(k>=0&&carry)
                        {

                            int t=carry;
                            carry=((a[k]-'0')+carry)/10;

                            a[k]=(((a[k]-'0')+t)%10)+'0';
                            k--;

                        }
                   }
                   break;
               }
           }
           i=n/2-1;
           j=n/2;
           while(j<n)
            {
                a[j]=a[i];
                j++;
                i--;
            }
            printf("%s\n",a);

       }
   }
    }
    return 0;

}
