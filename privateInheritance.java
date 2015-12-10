class A{
	private int a;
	A(int i){
		a=i;
	}
	int getA(){
		return a;
	}
}
class B extends A{
	public B(int i){
		super(i);
	}
	public int getAa(){
		return super.getA();
	}
	public static void main(String[] args) {
		B b = new B(42);
		System.out.println(b.getAa());
	}
}