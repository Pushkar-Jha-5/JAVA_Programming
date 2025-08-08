package string_builder;
import java.util.Scanner;

public class InputStringBuilder {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		// method -> 1
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		
		// method -> 2
		System.out.print("Enter the String : ");
		StringBuilder s = new StringBuilder(sc.nextLine());
		System.out.println(s);
	}

}
