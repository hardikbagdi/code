public class BinarySearch{
	public static boolean doSearch(int x,int[] a,int l,int r)
	{
		
		if(l<=r){
			int mid= l+(r-l)/2;
			System.out.println("Comparing("+l+":"+r+") with");
			System.out.println("middle:"+a[mid]);
			if(a[mid]==x) return true;
			else if(a[mid]>x) return doSearch(x,a,l,mid-1);
			else return doSearch(x,a,mid+1,r);
		}

		return false;
	}
	public static void main(String[] args) {
		int a[] = {5,8,12,18,46,50};
		System.out.println(BinarySearch.doSearch(3,a,0,a.length-1));
	}
}
