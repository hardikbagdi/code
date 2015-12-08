import java.util.*;
class count{
	public static void main(String[] args) {
		int[] a;
		int n=10;
		Random r = new Random();
		a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = r.nextInt(n+1);
			if(a[i]==0){
				a[i]++;
			}
		}


		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}

		for(int i=0;i<n;i++){
			--a[i];
		}

		for(int i=0;i<n;i++){
			a[a[i]%n] +=n;
		}
		for(int i=0;i<n;i++){
			System.out.println((i+1)+"->"+(a[i]/n));
		}
	}
}