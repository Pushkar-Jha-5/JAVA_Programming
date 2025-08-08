package strings;

import java.util.Scanner;

public class ConvertIntegerToString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		String str = "" + n;
		System.out.println("After conversion : " + str);
	}

}
