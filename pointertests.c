#include<stdio.h>
int main(){
int ar[10];
int x=10;
char str[100]="HELLO";
int a = sizeof(ar)/sizeof(float);
int ars = sizeof(ar);
printf("%d\n",a);
printf("%d\n",ars);
printf("%ld\n",sizeof(int));
printf("%ld\n",sizeof(int*));
printf("%ld\n",sizeof(float));
printf("%ld\n",sizeof(float*));
printf("%ld\n",sizeof(char));
printf("%ld\n",sizeof(char*));
printf("%ld\n",sizeof(str));
void* voidp;
printf("\n%d\n",voidp); 
voidp= &x;
printf("\n%d\n",voidp); 
printf("%d",*(int*)voidp);
return 0;}
