package strings;

import java.util.Scanner;

public class ContainsAndStartsWithMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		System.out.print("Enter the part of string : ");
		String part = sc.nextLine();
		
		System.out.println("contains() : " + str.contains(part));
		System.out.println("startsWith() : " + str.startsWith(part));
		System.out.println("endsWith() : " + str.endsWith(part));
	}

}
