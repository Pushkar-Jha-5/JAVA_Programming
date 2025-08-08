package oops;

class Demo{
	public void method1(int i) {
		System.out.println("General Method");
	}
	// var-agrs
	public void method1(int... i) {
		System.out.println("Var-args Method");
	}
}

public class MethodOverloading5 {

	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.method1();     // var-args
		d1.method1(10);     // general method
		d1.method1(10,20);     // var-args
	}

}
