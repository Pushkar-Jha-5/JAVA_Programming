package oops;

abstract class Bird{
	public abstract void fly();
	public abstract void eat();
}

class Sparrow extends Bird {
	public void fly() {
		System.out.println("Sparrow fly at low");
	}
	public void eat() {
		System.out.println("Sparrow eat grains");
	}
}

// abstract class can contain : concrete method and abstract method
abstract class Eagle extends Bird {
	public void fly() {
		System.out.println("Eagle fly at high");
	}
	public abstract void eat();
}

class SerpentEagle extends Eagle{
	public void eat() {
		System.out.println("Serpent eagle eat snake");
	}
}

class GoldenEagle extends Eagle{
	public void eat() {
		System.out.println("Golden eagle eat fish");
	}
}

class Crow extends Bird {
	public void fly() {
		System.out.println("Crow fly at medium");
	}
	public void eat() {
		System.out.println("Crow eat grains");
	}
}

class Sky{
	public void allowBird(Bird ref) {
		ref.fly();
		ref.eat();
		System.out.println();
	}
}

public class AbstractionMultipleLevel {

	public static void main(String[] args) {
		Sky s1 = new Sky();
		s1.allowBird(new Sparrow());
		s1.allowBird(new SerpentEagle());
		s1.allowBird(new GoldenEagle());
		s1.allowBird(new Crow());
	}

}
