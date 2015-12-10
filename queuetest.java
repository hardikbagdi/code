import java.util.*;
class queuetest{
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();

		q.add(5);
		q.add(4);
		q.add(3);
		q.add(2);
		q.add(1);
		System.out.println(q);
		q.remove(4);
		System.out.println(q);
		q.remove(2);
		System.out.println(q);
	}
}