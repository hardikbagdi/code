import java.util.*;
public class SortingStack{
	public static Stack sort(Stack<Integer> s){

		Stack<Integer> temp = new Stack<Integer>();

		while(!s.isEmpty()){
			int x= s.pop();

				while(!temp.isEmpty() && x<temp.peek()){
					s.push(temp.pop());
				}
				temp.push(x);


		}
		return  temp;
	}
	public static void main(String[] args) {
		Stack<Integer> s = new Stack();
		for(int i=0;i<10;i++){
			s.push((int)(Math.random()*10));
		}
	
		System.out.println(s);
		s= sort(s);
		System.out.println(s);
	}
}