class SingleArray3Stacks{
int stackSize=100;
int stackIndex[] = {-1,-1,-1};
int array[]= new int[3*stackSize];



void push(int whichstack,int data){
	if(stackIndex[whichstack]>=(stackSize-1)*3) {
		System.out.println("error,overflow");
		return;
	}
	stackIndex[whichstack]+=3;
	array[stackIndex[whichstack]]=data;
}
int pop(int whichstack){
	if(stackIndex[whichstack]==-1){
		System.out.println("error, empty");return -1;
	}
	int data= array[stackIndex[whichstack]];
	stackIndex[whichstack]-=3;
	return data;

}

}

class SingleArray3StacksTest{
	public static void main(String[] args) {
		SingleArray3Stacks s = new SingleArray3Stacks();
		for (int i=1000;i<1050 ;i++ ) {
			s.push(0,i);
			s.push(1,i);
			s.push(2,i);
		}
	
for (int i=1000;i<1051 ;i++ ) {
			s.pop(0);
			s.push(1,i);
			s.push(2,i);
		}

	}
}