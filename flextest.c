%{

#include<stdio.h>
%}


%%
[0-9]+	{printf("found int%d",atoi(yytext)*2);}
[0-9]+"."[0-9]+	{printf("found float%f",atof(yytext)*2);}
%%

int main(){
yylex();

return 0;}
