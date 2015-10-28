public class urlspace{
	public static void main(String[] args) {
		String s1= "Har dik Bag di      ";
		char[] s= s1.toCharArray();
		System.out.println(s.length);
		int osize= 14;
		int finalsize=s.length-1;
		for(int i=osize-1;i>=0;i--,finalsize--){
			if(s[i]!=' '){
				s[finalsize]=s[i];

			}
			else{
				s[finalsize--]='0';
				s[finalsize--]='2';
				s[finalsize]='%';
			}

		}
		System.out.println(s);
		}

	
}