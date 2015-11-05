import java.util.*;
public class uniquestring{
	public static boolean uniquechars(String string){

char[] c= string.toCharArray();
		Arrays.sort(c);
		string=String.valueOf(c);
		for(int i=0;i<string.length()-1;i++){

			if(string.charAt(i)==string.charAt(i+1)){return false;}

		}
return true;

	}

	public static void main(String[] args) {
		System.out.println(uniquechars("qwee"));
	}
}