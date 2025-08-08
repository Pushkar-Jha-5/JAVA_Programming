package oops;

class Parent{
	public void property() {
		System.out.println("Land + Cash + Gold");
	}
	public void marry() {
		System.out.println("Relative Girl");
	}
}

class Child extends Parent{
	// Overriding
	public void marry() {
		// Re-implementation
		System.out.println("Some other Girl");
	}
}

public class MethodOverriding {
	
	public static void main(String[] args) {
		System.out.println("From Parent class");
		Parent p1 = new Parent();
		p1.property();
		p1.marry();
		System.out.println();
		
		System.out.println("From Child class");
		Child c1 = new Child();
		c1.property();
		c1.marry();
		System.out.println();
		
		System.out.println("From Child class -> Due to Overriding");
		Parent p2 = new Child();
		p2.property();
		p2.marry();
	}
}
