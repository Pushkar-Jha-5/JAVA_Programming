package oops;

class Calculator{
	// local variable
	public void add(int a,int b) {
		int result = a+b;
		System.out.println("The result is : " + result);
	}
}

public class LocalVariable {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.add(18, 7);
	}

}
