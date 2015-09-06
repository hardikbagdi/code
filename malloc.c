#include<stdio.h>
#include<stdlib.h>
void main(){

int n;
int *a;
printf("Enter size:");
scanf("%d",&n);
printf("size of pointer a is %d \n", sizeof(*a));
printf("allocating memeory to a pointer");

a= (int*)malloc(n*sizeof(*a));
int asize= sizeof(*a);
printf("size of a is %d \n", asize);


}
