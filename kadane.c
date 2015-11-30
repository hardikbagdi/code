#include <stdio.h>
int main(int argc, char const *argv[])
{
	int start =0;
	int end=0;
	int a[10]= {-11,-2,-2,3,5,2,-12,-1,2,4};
	int max_till_here= a[0];
	int global_max=a[0];
	int i=1;
	int istart;
	for(i=1;i<10;i++){

		
		if(a[i]> (a[i]+max_till_here)){
			max_till_here=a[i];
			istart=i;
			end=i;
			// max_till_here=max_till_here;
		}
		else{
			max_till_here+=a[i];
			 // start=i;
			 // end=i;

		}
		if(global_max < max_till_here ){
			start = istart;
			global_max = max_till_here;
			end=i;
		}
	printf("\nglobal_max:%d\nmax-tillhere:%d\n",global_max,max_till_here );
	printf("\nstart:%d\nmax-end:%d\n----",start,end );
	}
	printf("\nstart:%d\nmax-end:%d\n",start,end );
	return 0;
}