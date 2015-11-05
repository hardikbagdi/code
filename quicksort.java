import java.util.*;
public class quicksort{
	public static void swap(int[] a, int x ,int  y){
		// a[x]=a[x]+a[y];
		// a[y]=a[x]-a[y];
		// a[x]=a[x]-a[y];
		int temp =a [x];
		a[x]=a[y];
		a[y]=temp;
	}
	public static int quickHelper(int a[],int lo,int hi){
			int cur= a[lo];
			int i=lo;
			int j=hi+1;
			while(true){
				while(a[++i]<cur)
					if(i==hi)break;
				while(cur<a[--j])
					 if(j==lo)break;
				if(i>=j) break;
				swap(a,i,j);
			}
	swap(a,lo,j);
	return j;


//


// other try
		// int i= lo+1;
		// int j=lo+1;
		// int cur= a[lo];
		// while(i!=hi){
		// 	if(a[i]<=cur){i++;}
		// 	else{
		// 		swap(a,i,j);


		// 	}
		

	}
	public static void qsort(int a[],int lo,int hi){
		// System.out.println("called");
		if(hi<=lo) return;
		int pivot= quickHelper(a,lo,hi);
		qsort(a,lo,pivot-1);
		qsort(a,pivot+1,hi);
	}

	public static void main(String[] args) {
		int[] a = new int[10];
		Random r = new Random();
		for(int i=0;i<10;i++){
			a[i]=r.nextInt(10);
		}
		for(int i=0;i<10;i++){
			//a[i]=r.nextInt(10);
		System.out.print("  "+a[i]);
		}
		qsort(a,0,a.length-1);
		System.out.print(" \n ");
for(int i=0;i<10;i++){
			//a[i]=r.nextInt(10);
		System.out.print("  "+a[i]);
		}
	}
}