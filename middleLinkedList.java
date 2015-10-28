class Node{int data;Node next=null; public Node(int x){data=x;}}
class middleLinkedList{
public static void main(String[] args) {
	Node head,current;
	Node nodetoDelete;
	Node n= new Node(1);
	head=n;
	 n= new Node(2);
	n.next=head;
	head=n;
	 n= new Node(3);
	 n.next=head;
	 nodetoDelete=n;
	head=n;
	 n= new Node(4);
	 n.next=head;
	head=n;
	 n= new Node(5);
	 n.next=head;
	head=n;
	current=head;
	while(current!=null){
		System.out.println("Data:"+current.data);
		current=current.next;

	}


	nodetoDelete.data=nodetoDelete.next.data;
	nodetoDelete.next=nodetoDelete.next.next;
current=head;
while(current!=null){
		System.out.println("Data:"+current.data);
		current=current.next;

	}
}
}