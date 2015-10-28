	class Node{int data;Node next=null; public Node(int x){data=x;}}
class klastlLL{
	public static void main(String[] args) {
		Node head,current=null,follow=null;
		Node prev=null;
		int ith=5;
		Node x= new Node(8);
		head= x;
		
		for (int i=0;i<30 ;i++ ) {
			x = new Node(i);
			x.next=head;
			head=x;
			}
			current=head;
		while(current!=null){
		System.out.println("Data:"+current.data);
		current=current.next;

	}
	current=head;
	int k=0;
	while(current!=null){
		if(k<ith){
				k++;
			System.out.println("next");

			current=current.next;
			//break;
		}
		if(k==ith-1){
			k+=2;
			System.out.println("follow initailize");
			follow=head;
			current=current.next;
			// break;
		}
		if(k>ith){
			//System.out.println("more");
			follow=follow.next;
			System.out.println("follow data:"+follow.data);
			System.out.println("current data:"+current.data);
			current=current.next;
			// break;
		}
	}


	if(follow!=null){
	System.out.println(follow.data);}
	else {
	System.out.println("follow.null");}
		
	
}
}