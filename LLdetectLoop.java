
class Node{
	int data;Node next=null;
	public Node(int x){
		data=x;
	}
}

class LLdetectLoop{

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
	for (int i=6;i<9 ; i++) {
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
	Node current=head1;
	while(current!=null){
		System.out.println("n1  "+current.data);
		current=current.next;
	}
	current=head2;
	while(current!=null){
		System.out.println("n2  "+current.data);
		current=current.next;
	}

	last1.next=head2;
	last2.next=last1;

	current=head1;
	// while(current!=null){
	// 	System.out.println("n"+current.data);
	// 	current=current.next;
	// }

	Node head=head1;
	Node slow= head;
	Node fast=head;

	while(fast!=null || fast.next!=null){

		if(fast==slow)break;
		fast=fast.next.next;
		slow=slow.next;
		
	}
	
		System.out.println("n"+slow.data);

}}