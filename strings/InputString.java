package strings;
import java.util.Scanner;

public class InputString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your full name : ");
		String str = sc.nextLine();
		System.out.println(str);
		
		System.out.print("Enter your name : ");
		String s = sc.next();
		System.out.println(s);
	}

}
