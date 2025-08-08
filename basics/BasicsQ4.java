package basics;

public class BasicsQ4 {

	public static void main(String[] args) {
		int a = 10;
		System.out.println("Original value : " + a);
		
		a = ++a;
		System.out.println("After increment : " + a);
		
		a = --a;
		System.out.println("After decrement : " + a);
		
		a = (1%a);
		System.out.println("Remainder : " + a);
	}

}
