
class Node{int data;Node next=null;public Node(int data){this.data=data;}}
class LLaddition{
	public static void main(String[] args) {
		Node head1=null,head2=null,curr=null;

		Node last1=null,last2=null;
		for (int i=1; i<4; i++) {
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
		for (int i=6; i<9; i++) {
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

		int n1=0,n2=0;

		curr=head1;
		int i=1;
		while (curr!=null) {
			// System.out.println("Number1: "+curr.data);
			n1=n1+curr.data*i;
			curr=curr.next;
			i*=10;
		}
		 i=1;
		curr=head2;
		while (curr!=null) {
			// System.out.println("Number1: "+curr.data);
			n2=n2+curr.data*i;
			curr=curr.next;
			i*=10;
		}
		System.out.println("Number1: "+n1+"\t Number2: "+n2);
		int ans=n1+n2;
		Node answer=null,answerlast=null;
		while(ans>0){
			Node n= new Node(ans%10);
			if(answer==null){
				answer=n;
				answerlast=answer;
			}
			else {
				answerlast.next=n;
				answerlast=n;
			}
		ans=ans/10;
		}
		curr=answer;
		
		while (curr!=null) {
			System.out.println("Answer: "+curr.data);
			curr=curr.next;
		}
		 i=1;
		curr=answer;
		int answerConstructed=0;
		while (curr!=null) {
			// System.out.println("Number1: "+curr.data);
			answerConstructed=answerConstructed+curr.data*i;
			curr=curr.next;
			i*=10;
		}
			System.out.println("answerConstructed: "+answerConstructed);
	}
}