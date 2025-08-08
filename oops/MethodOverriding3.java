package oops;

class Animal1{
	public void eat() {
		System.out.println("Animal1 is eating");
	}
	public void sleep() {
		System.out.println("Animal1 is sleeping");
	}
}

class Monkey1 extends Animal1 {
	public void eat() {
		System.out.println("Monkey1 is eating");
	}
	public void sleep() {
		System.out.println("Monkey1 is sleeping");
	}
}

class Deer1 extends Animal1{
	public void eat() {
		System.out.println("Deer1 is eating");
	}
	public void sleep() {
		System.out.println("Deer1 is sleeping");
	}
}

class Lion1 extends Animal1{
	public void eat() {
		System.out.println("Lion1 is eating");
	}
	public void sleep() {
		System.out.println("Lion1 is sleeping");
	}
}

class Forest{
	public void allowAnimal1(Animal1 a) {
		a.eat();
		a.sleep();
		System.out.println();
	}
}

public class MethodOverriding3 {

	public static void main(String[] args) {
		
		Forest f = new Forest();
		f.allowAnimal1(new Monkey1());
		f.allowAnimal1(new Deer1());
		f.allowAnimal1(new Lion1());
	}

}
