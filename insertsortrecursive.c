#include<stdio.h>
#include<stdlib.h>
void printar(int a[],int n){
int i=0;
printf("\n \n");printf("\n \n %d",n);
for(i=0;i<n;i++){
printf("\t %d",a[i]);
}
printf("\n \n");
}

void insertsort(int A[],int n){
	printf("insertsort called with array: \n");
	printar(A,n);
int i,temp;
	if (n>1)
	{
		insertsort(A,n-1);
		/* code */
	}
	for (i = 0; i < n-1; i++)
	{
		if(A[n-1]<A[i]){
			temp=A[i];
			A[i]=A[n-1];
			A[n-1]=temp;
		}
		/* code */
	}
	printf("insertsort ending  with array: \n");
		printar(A,n);
}

void main(){

int *a;
int n,i;printf("\n \n Enter size:");
scanf("%d",&n);
a= (int*)malloc(sizeof(int)*n);
if(a==NULL){printf("memory allocation failed\n" );
exit(0);}
printf("\n \n Enter numbers");
for(i=0;i<n;i++)
	scanf("%d",&a[i]);
printar(a,n);
insertsort(a,n);
printar(a,n);
}
