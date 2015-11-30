class inplaceQuick{
	
	static void swap(int[] a , int i , int j){
		int temp = a[i];
		a[i]=a[j];
		a[j]= temp;
			}
	static int partition(int[] a, int start, int end ){
		int v = a[start];
		int i=start;
		int j=end+1;
		while(true){
			while(a[++i]<v)
				if(i>=end)
					break;
				
			while(a[--j]>v)
				if(j<=start)
					break;
			if(i>=j)
				break;
			swap(a,i,j);
		}
		swap(a,start,j);
		return j;
	}
	static void quicksort(int[] a, int start, int end){
		if(start>=end)
			return;
			int pivot = partition(a,start,end);
			quicksort(a,start,pivot);
			quicksort(a,pivot+1,end);
		}
	
	public static void main(String[] args) {
		int a[] = new int[10];
		int i=0;
		i=10;
		for(int j=9; j>=0;j--){
			a[j]=i++;
		}


		for(int j=0;j<10;j++){
	
			System.out.println(a[j]);
		}
		quicksort(a,0,a.length-1);
			System.out.println();
	
	for(int j=0;j<10;j++){
	
			System.out.println(a[j]);
		}
	}
}