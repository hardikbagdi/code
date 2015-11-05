import java.util.*;
public class SortStack{
	


	public static void main(String[] args) {
		Stack<Integer> mainStack = new Stack<Integer>();	
		Stack<Integer> additional = new Stack<Integer>();
		int N=4;
		while(N>-1){
			mainStack.push(N);
			N--;

		}

		//System.out.println(mainStack);
		System.out.println("Main"+mainStack);
		while(!mainStack.isEmpty()){
			additional.push(mainStack.pop());
		}
		System.out.println("Main"+mainStack);
		System.out.println("additional"+additional);
		mainStack.push(additional.pop());
		while(!mainStack.isEmpty()){
			int current = mainStack.pop();
			while(!additional.isEmpty() && current<=additional.peek())
			{
				mainStack.push(additional.pop());
			}
			additional.push(current);
		}
		System.out.println("Main"+mainStack);
		System.out.println("additional"+additional);


	}
}