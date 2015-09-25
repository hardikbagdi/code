#include<stdio.h>
#include<stdlib.h>
#include<limits.h>


int main(int argc, char *argv[]){
int i=0;
int rn;
srand(time(0));
while(i<10){
i++;
rn=rand() %INT_MAX+INT_MIN;
printf("\n%d",rn);
}
}

