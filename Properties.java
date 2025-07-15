package assignment2;

class Animal{
	void sleep() {
		System.out.println("Animal is Sleeping.....!!");
	}
	void eat() {
		System.out.println("Animal is Eating......!!");
	}
}
class Bird extends Animal{
	void sleep() {
		System.out.println("Bird is Sleeping.....!!");
	}
	void eat() {
		System.out.println("Bird is Eating......!!");
	}
	void fly() {
		System.out.println("Bird is Flying.....!!");
	}
}

public class Properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		a.sleep();
		a.eat();
		
		Bird b=new Bird();
		b.sleep();
		b.eat();
		b.fly();
		
	}

}
