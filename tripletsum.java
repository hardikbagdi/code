import java.util.*;
class tripletsum {
	public static void main(String[] args) {
		int[] a = new int[20];
		Random r = new Random();
		for (int i=0;i<20 ;i++ ) {
			a[i]=r.nextInt(20);
		}
		for (int i=0; i<20; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		Arrays.sort(a);
				for (int i=0; i<20; i++) {
			System.out.println(a[i]);
		}
	int j =0;
	int n= 10;
	int k=0;
	int ans=0;
	int sum =10;
		for(int i =0 ; i < 20 ; i++){
			j= i+1;
			k=9;
			while(j<k){
				if(a[i]+a[j]+a[k]<= sum ){
					ans+=(k-j);
					j++;
				}
				else{
					k--;
				}
			}
		}

		System.out.println("triplets: "+ans);
	}

}