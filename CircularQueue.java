class CircularQueue{
	int[] arr ;//= new int[10];
		int head, tail;
	public CircularQueue(){
		head=-1;tail=-1;
		arr= new int[10];
	}
	public void add(int x){
		if(head==tail+1 || )
			System.out.print("overflow");
		
		
	}
	public int  remove(){
			System.out.print("removing");
		if(head==-1){
			System.out.print("underflow");

		}
		else{
			if(head==10)
				head=0;
			if(head==tail)
			{
				System.out.print("empty now");
				head=-1;
			}
			System.out.print("removed");
			return arr[head++];
		}
			System.out.print("not possible to remove");
		return -1;
	}
	public static void main(String[] args) {
		CircularQueue c = new CircularQueue();
		c.add(2);
		c.remove();
	}
}