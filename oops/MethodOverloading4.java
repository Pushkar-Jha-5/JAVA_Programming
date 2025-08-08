package oops;

class Adder{
	// method overloading : same argument type but different argument count
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public void add(int a,int b,int c,int d) {
		System.out.println(a+b+c+d);
	}
	public void add(int a,int b,int c,int d,int e) {
		System.out.println(a+b+c+d+e);
	}
}

class AdvanceAdder{
	// var-args -> 0 to n
	public void add(int... args) {
		int sum = 0;
		for(int data : args) {
			sum += data;
		}
		System.out.println(sum);
	}
}

public class MethodOverloading4 {

	public static void main(String[] args) {
		System.out.println("From Adder class");
		Adder sum = new Adder();
		sum.add(10,20);
		sum.add(10,20,30);
		sum.add(10,20,30,40);
		sum.add(10,20,30,40,50);
		
		System.out.println("From AdvanceAdder class");
		AdvanceAdder advSum = new AdvanceAdder();
		advSum.add();
		advSum.add(10);
		advSum.add(10,20);
		advSum.add(10,20,30);
		advSum.add(10,20,30,40);
		advSum.add(10,20,30,40,50);
	}

}
