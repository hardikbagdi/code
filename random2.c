
#include<stdio.h>
#include<stdlib.h>
#include<limits.h>

int main(){

unsigned int mask=1<<31; // 
int a,b,c,d,i,f,g,e;
c=1;
srand(time(0));
//i=rand();
//srand(i);

//printf(" %d\n%d",INT_MAX,RAND_MAX);
//printf("%d",i);
for(i=0;i<300;i++){

a=rand();
b=rand();
//b=(b%7);
b=b%12;
//f=(a%5);
//g=b+f-1;
c=1;
//printf("a= %d, b= %d",a,b);
printf("\nG= %2d",b);
while(b>0){c=10*c;b--;}
mask=1<<31;
d=a/c;
printf("\t Actual no:%13d",d);
e=INT_MAX-d;
printf("\t Difference: %13d\n",e);
for(;mask>0;mask=mask>>1){
if(d & mask){
//printf("1");
}
else{
//printf("0");
}
}
}

return 0;}
