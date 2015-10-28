public class CompressString{
	public static void main(String[] args) {
		String s= "qqqqaa";
		String s2="";
		int j=1;
		for(int i=0;i<s.length()-1;i++){
			j=0;
			char current=s.charAt(i);
			System.out.println(i);
			while ((i+1 <=s.length())&&current==s.charAt(i)) {
				j++;i++;
			}
			s2+=current;
			s2+=j;--i;
			//i--;
		}
		System.out.println(s2);
	}
}