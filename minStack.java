import java.util.*;
class minStack{
	Stack<Integer> s = new Stack<>();
	Stack<Integer> min = new Stack<>();
	public minStack(){min.push(Integer.MAX_VALUE);}
	int pop(){int d=s.pop();
		if(d==min.peek())min.pop();
		return d;
	}
	void push(int data){
		if(data<min.peek())min.push(data);
		s.push(data);
	}
	int min(){return min.peek();}
}
class minStackTest{
	public static void main(String[] args) {
		minStack s = new minStack();
		s.push(2);
		s.push(1);
		s.push(3);
		s.pop();
		s.pop();
		System.out.println(s.min());
	}
}