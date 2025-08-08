package basics;

public class UpdatingVariables {
	public static void main(String[] args) {
		int x = 5;
		System.out.println(x);
		x = 10;
		System.out.println(x);
		
		x = x + 6;
		System.out.println(x);
		
		x -= 20;     // x = x - 20;
		System.out.println(x);
		
		x *= -1;     // x = x * -1;
		System.out.println(x);
		
		x = x / 2;
		System.out.println(x);
	}
}
