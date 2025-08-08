package oops;

abstract class Parent2{
	public abstract void methodOne();
}

class Child2 extends Parent2{
	public void methodOne() {
		System.out.println("Child2Class : methodOne");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		Parent2 p2 = new Child2();
		p2.methodOne();
	}

}
