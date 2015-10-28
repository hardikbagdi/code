#include<stdio.h>
#include<stdlib.h>
void * allocate(unsigned int size){

return malloc(size);
}
void * deallocate(void *p, int size){
free(p);
return p;
}
int main(){

char *p=(char*)allocate(8);
deallocate(p,8);

return 0;}



