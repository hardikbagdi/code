class Node{int data; Node next=null;public Node(int x){data=x;}}

class LLpartitionx{
	public static void main(String[] args) {
		int partition=10;
		Node head=null,current=null;
		Node n;
		for (int i=0; i<20; i++) {
			n= new Node(i);
			n.next=head;
			head=n;
		}
		current=head;
		while(current!=null){
			System.out.println("Data: "+current.data);

			current=current.next;
		}

		Node before=null, after=null,saveAfter=null,saveBefore=null,present=null;
			System.out.println("processing");
		Node nextIteration=null;
		current=head;
		while (current!=null) {
			nextIteration=current.next;
			if(current.data<partition){
				current.next=before;
				before=current;
			}
			else {
				current.next=after;
				after=current;
			}
			current=nextIteration;
		}
			
		
	

		if(before==null){
			head=after;
		}
		else {
			head=before;
			while(before.next!=null){
				before=before.next;
			}
			before.next=after;
		}
current=head;
		while(current!=null){
			System.out.println("Data: "+current.data);

			current=current.next;
		}
		}
			
	
}