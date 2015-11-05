#include<stdio.h>
#include<string.h>
union myStruct{

//char c2[17];//2
//char c[4];
//int x[3];//4
long y;//8
char c3[25];//8


//int a[3];//12

};

void inc(){
int num=1;
printf("%d",num++);
}
int main(){
printf("%d",&inc);
}
