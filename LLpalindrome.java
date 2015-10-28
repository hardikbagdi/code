import java.util.*;
class Node{
	int data;Node next=null;
	public Node(int x){
		data=x;
	}
}

class LLpalindrome{

public static void main(String[] args) {
	Node head1= null;
	Node last1=null;
	for (int i=0;i<6 ; i++) {
		Node n = new Node(i);
		if(head1==null){
			head1=n;
			last1=head1;
		}
		else {
			last1.next=n;
			last1=n;
		}
	
	}

	Node head2=null;
	Node last2=null;
	for (int i=5;i>=0 ; i--) {
		Node n = new Node(i);
		if(head2==null){
			head2=n;
			last2=head2;
		}
		else {
			last2.next=n;
			last2=n;
		}
	
	}
		System.out.println("last1 "+last1.data);
		System.out.println("head2 "+head2.data);
	last1.next=head2;
	
	Node current=head1;
	while(current!=null){
		System.out.println("n2  "+current.data);
		current=current.next;
	}


	Stack<Integer> s= new Stack<>();

	Node head=head1;
	Node slow=head,fast=head;
	while(fast!=null  && head!=null){
		s.push(slow.data);

		slow=slow.next;
		fast=fast.next.next;
	}
	if(fast!=null){
		System.out.println("odd");
		slow=slow.next;

	}else {
	}


	
	while(slow!=null){
		int top= (int)s.pop();
		System.out.println("Stack val"+top+"Pointer val:"+slow.data);
		if(slow.data!=top){

		System.out.println("no");

			return ;}
			slow=slow.next;
	}
		System.out.println("yes");

	
}
}