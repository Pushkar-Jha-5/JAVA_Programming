package strings;

public class PlusOperator {

	public static void main(String[] args) {
		String x = "abcde";
		String y = "fghij";
		System.out.println(x + y);
		
		x = x + y;     // x += y;
		System.out.println(x);
		
		y = y + 500;
		System.out.println(y);
		
		x = x + 'k';
		System.out.println(x);
		
		System.out.println("My name is " + 500);
		
		System.out.println("abc" + 10 + 20);
		System.out.println(10 + 20 + "abc");
		
		
	}

}
