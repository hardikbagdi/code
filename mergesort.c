#include<stdio.h>
#include<stdlib.h>

int merge(int A[],int p, int q, int r){
	int i,j,k;
	int n1,n2;
	int inversions=0;
	int n= r+1;
	n1=q-p+1;
	n2=r-q;
	int L[n1] ;int R[n2] ;
	printf("\n \n merge called. array is\n");
	for(i=0;i<n;i++)
	printf("%d\t",A[i] );
	for ( i = 0; i < n1; i++)
	{
		L[i]=A[p+i];
		/* code */
	}	
	for ( i = 0; i < n2; i++)
	{
		R[i]=A[q+1+i];
		/* code */
	}
	i=0;j=0;
	k=p;
	while(i<n1 && j<n2){
	printf("\n \t inv:%d",inversions);
		if(L[i]<=R[j]){
			A[k]=L[i];
			i++;
		}
		else{
			if(i<n1)
			{printf("\nn1=%d,i=%d",n1,i);inversions=inversions+n1-i;
			printf("\ninv:%d",inversions);}
			A[k]=R[j];
			j++;
		}
		k++;
	}
		while(i<n1){
				A[k]=L[i];
				i++;
				k++;
		}

		while(j<n2){
				A[k]=R[j];
				j++;
				k++;
		}

return inversions;


}

int mergesort(int A[],int p,int r)
{
int inversions=0;
int inversionsB=0;
int inversionC=0;
	int q,i;
	int n= r-p+1;
	printf("\n inside merge sort. array is\n");
for(i=0;i<n;i++)
	printf("%d\t",A[i] );
if(p!=(r-1)){
q= (p+r)/2;
inversionsB=mergesort(A,p,q);
inversionC=mergesort(A,q+1,r);
inversions=merge(A,p,q,r);
printf("\n\n Inversions before add: %d", inversions);
inversions=inversions+inversionC+inversionsB;
printf("\n\n Inversions: %d, InvB: %d, InvC: %d",inversions,inversionsB,inversionC);

return inversions;
}

}
void main(){

int n,i;
int *a;
int inversions=0;
printf("\n \n Enter size:");
scanf("%d",&n);
printf("size of pointer a is %d \n", sizeof(*a));
printf("allocating %d memeory to a pointer",n);

a= (int*)malloc(sizeof(int)*n);
if(a==NULL){printf("memory allocation failed\n" );
exit(0);}
int asize= sizeof(*a);
//printf("size of a is %d \n", asize);
printf("\n \n Enter numbers");
for(i=0;i<n;i++)
	scanf("%d",&a[i]);

printf("\n \nArray before sort \n");
for(i=0;i<n;i++)
	printf("%d\t",a[i] );

inversions=mergesort(a,0,n-1);

printf("\n \nArray after sort");
for(i=0;i<n;i++)
	printf("%d\t",a[i] );


printf("\n\n Inversions: %d",inversions);

}
