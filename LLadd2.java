

class Node{int data;Node next=null;public Node(int data){this.data=data;}}

class LLadd2{
	public static void main(String[] args) {
		Node head1=null,head2=null,curr=null;

		Node last1=null,last2=null;
		for (int i=3; i<7; i++) {
			Node n= new Node(i);
			if(head1==null){
				head1=n;
				last1=head1;
			}
			else {
				last1.next=n;
				last1=n;
			}
		}
		for (int i=3; i<9; i++) {
			Node n= new Node(i);
			if (head2==null) {
				head2=n;
				last2=head2;
			}
			else {
				last2.next=n;
				last2=n;
			}
		}


		curr=head1;
		while (curr!=null) {
			System.out.println("Number1: "+curr.data);
			curr=curr.next;
		}

		curr=head2;
		while (curr!=null) {
			System.out.println("Number2: "+curr.data);
			curr=curr.next;
		}

		Node answerFirst=null,answerLast=null;
		Node curr1=head1,curr2=head2;
		int carry=0;
		while(curr1!=null && curr2!=null){
			int r= curr1.data+curr2.data+carry;
			Node n = new Node(r%10);
			if(answerFirst==null){
				answerFirst=n;
				answerLast=answerFirst;
			}
			else{
				answerLast.next=n;
				answerLast=n;
			}
			curr2=curr2.next;
			curr1=curr1.next;
			carry= r>=10?1:0;

		}
		while(curr1!=null){
			int r= curr1.data+carry;
			Node n = new Node(r);
			curr1=curr1.next;
			answerLast.next=n;
			answerLast=n;
			carry= r>=10?1:0;

		}
		while(curr2!=null){
			int r= curr2.data+carry;
			Node n = new Node(r);
			curr2=curr2.next;
			answerLast.next=n;
			answerLast=n;
			carry= r>=10?1:0;
		}
		if(carry==1){
			Node n = new Node(1);
			answerLast.next=n;
			answerLast=n;
		}


		curr=answerFirst;
		while (curr!=null) {
			System.out.println("ans: "+curr.data);
			curr=curr.next;
		}

	}
}