import java.util.*;
	class Node{int data;Node next=null; public Node(int x){data=x;}}
 class linkedlist{
	public static void main(String[] args) {
		Node head;
		Node prev=null;

		Node x= new Node(8);
		head= x;
		
		for (int i=0;i<10 ;i++ ) {
			x = new Node(i);
			x.next=head;
			head=x;
			}
	Node current;
	current=head;
	while(current!=null){
		System.out.println("Data:"+current.data);
		current=current.next;

	}
	System.out.println("Qw");
	Hashtable hs = new Hashtable();
	current=head;
	Node runner,prevRunner;
	while(current!=null){
	//System.out.println(current.data);

		runner=current;
		
		while(runner.next!=null){
			if(current.data==runner.next.data){
				runner.next=runner.next.next;
			}
			else{
			runner=runner.next;}
		}
		current=current.next;
	}
	System.out.println("22Qw");
	current=head;
while(current!=null){
		System.out.println("Datax:"+current.data);
		current=current.next;

	}



	while(current!=null){
	//System.out.println(current.data);
		if(!hs.containsKey(current.data))
		{
		hs.put(current.data,true);
		System.out.println("Data:"+current.data);
		prev=current;
		current=current.next;
		}
		else{
		System.out.println("matched");
			prev.next=current.next;
			prev=current;
			current=current.next;
		}
	}
	System.out.println("Qw");
	System.out.println(hs);
	current=head;

	while(current!=null){
		System.out.println("Datax:"+current.data);
		current=current.next;

	}
	}
}