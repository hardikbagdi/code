import java.util.*;
public class AnimalShelter{
	class Animal{
		public String s;
		public int timestamp;
		public Animal(String name,int age){
		s=name;
		timestamp=age;
		}
		public String toString(){
			return s+String.valueOf(timestamp);
		}
	}


	private Queue<Animal> cats;
	private Queue<Animal> dogs;
	private int time;
	public AnimalShelter(){
		time=0;
		cats= new LinkedList<Animal>();
		dogs= new LinkedList<Animal>();
	}


	public void enqueue(String s){
		if(s.equals("dog")){dogs.add(new Animal(s,time));}
	
	else {
		cats.add(new Animal(s,time));
	}
	time++;
}

	public  Animal dequeue(){
		if(cats.isEmpty() && dogs.isEmpty()) return null;
		if(cats.isEmpty() && !dogs.isEmpty()) return dogs.poll();
		if(!cats.isEmpty() && dogs.isEmpty()) return cats.poll();
		
		if(cats.peek().timestamp<=dogs.peek().timestamp){
			return cats.poll();	
		}
		else{
			return dogs.poll();
		}
	}
	public  Animal dequeueDog(){
		if(!dogs.isEmpty()){
			return dogs.poll();
		}
	return null;
	}
	public  Animal dequeueCat(){
	if(!cats.isEmpty()){
			return cats.poll();
		}	
	return null;
	}
public static void main(String[] args) {
	AnimalShelter as= new AnimalShelter();
	as.enqueue("cat");
	as.enqueue("dog");
	as.enqueue("cat");
	as.enqueue("dog");
	as.enqueue("cat");

	System.out.println(as.dequeueDog());
	System.out.println(as.dequeueDog());
	System.out.println(as.dequeue());
	System.out.println(as.dequeue());
	

}

}