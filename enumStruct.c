#include<stdio.h>
enum type{IS_INT,IS_CHAR};
struct mystruct{
enum type tag;
union{
int i;
char c;
}data;


};

int main(){
struct mystruct s;
s.data.i=2;

//s.data.c='2';
s.tag=IS_CHAR;

if(s.tag==IS_INT) printf("is int");
else printf("is char");

s.tag=IS_INT;

if(s.tag==IS_INT) printf("is int");
else printf("is char");

}

