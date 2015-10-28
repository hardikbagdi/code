class Node{int data;Node next=null; public Node(int x){data=x;}}

class primeIndexLL{
	public static boolean isPrime(int n){

		if(n==2 || n==3 ) return true;
		if(n%2==0 || n%3==0 || n%5==0) return false;
		for (int i=7;i*i<n ; i+=2) {
			if(n%i==0) return false;
		}
	
	return true;
	}
	public static void main(String[] args) {
		Node head,current;
		Node x= new Node(30);
		head= x;
		
		for (int i=29;i>=1 ;i-- ) {
			x = new Node(i);
			x.next=head;
			head=x;
			}
			current=head;
		while(current!=null){
		System.out.println("Data:"+current.data);
		current=current.next;
		//System.out.println(isPrime(11));
	}
	
	current=head;

	int i=1;
	while(current.next.next!=null){
		if(isPrime(i+1)){
			current.next=current.next.next;

		}
		current=current.next;
				
			
		


	}
		System.out.println("qwe");
		current=head;
		while(current!=null){
		System.out.println("Data:"+current.data);
		current=current.next;
		//System.out.println(isPrime(11));
	}
	}
}