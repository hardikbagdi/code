import java.util.*;
class queueusingstacks{

	private Stack stackmain;
	private Stack togetTail;
	boolean change=false;
	public queueusingstacks(){
		stackmain= new Stack<Integer>();
		togetTail= new Stack<Integer>();
	}
	public void push(int data){
		stackmain.push(data);
		

	}
	public void transfer(){
		while(!stackmain.isEmpty()){
			togetTail.push(stackmain.pop());
		}
	}
	public int pop(){

		if(!togetTail.isEmpty()){
			
			return (int)togetTail.pop();
		}
		else
		{
			transfer();
			return (int)togetTail.pop();
		}
	}


	public static void main(String[] args) {
		queueusingstacks q = new queueusingstacks();
		q.push(3);
		q.push(4);
		q.push(5);
		q.push(6);
		System.out.println(q.pop());	
		System.out.println(q.pop());	
		System.out.println(q.pop());	
		System.out.println(q.pop());	
	}
}
