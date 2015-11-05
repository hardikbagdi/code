#include<stdio.h>
int cq=0;
int mergesort(int A[], int low,int high){
printf("mergesort called: %d: %d\n",low,high);
int inv=0,inv1=0,inv2=0;
int mid=(high+low)/2;
cq++;
//if (cq>10) exit(0);
if(high-1==low) return 0;
inv1=mergesort(A,low,mid);
inv2=mergesort(A,mid,high);
inv=merge(A,low,mid,high);
return inv1+inv2+inv;
}

int merge(int a[],int low,int mid,int high){
printf("merge called:%d:%d:%d\n",low,mid,high);
int temp[high-low];
int i,j,k;
int inv=0;
printf("unsorted");
for(i=low,j=0;j<high-low;i++,j++){
temp[j]=a[i];
printf("\n%d",temp[j]);
}
//for(i=0;i<high-low;i++){printf("\n%d",temp[i]);}printf("\n");
i=0;
j=(high-low)/2;
k=low;
mid=(high-low)/2;
 for ( k = low; k < high; k++)
 {
 if (i >= mid) {a[k] = temp[j++];break;}
 else if (j >= high) {a[k] = temp[i++];break;}
 else if (temp[j] < temp[i]){ a[k] = temp[j++];inv=inv+(mid-i);}
 else a[k] = temp[i++];
 }


printf("sorted");
for(i=0;i<high;i++){printf("\n%d",a[i]);};printf("\n");
return inv;
}

int main(){
int inv;
int i;
int size=7;
int A[]={4,2,1,3,0,6,-1};

for(i=0;i<size;i++){printf("%d\n",A[i]);}
inv=mergesort(A,0,size);
printf("\n\nInversions: %d",inv);
for(i=0;i<size;i++){printf("\n%d",A[i]);}
return 0;
}
