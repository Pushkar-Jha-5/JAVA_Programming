package strings;

import java.util.Scanner;

public class IndexOfMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		System.out.print("Enter the chracter : ");
		char ch = sc.next().charAt(0);
		
		System.out.println("The index of " + ch + " is " + str.indexOf(ch));
		System.out.println("The last index of " + ch + " is " + str.lastIndexOf(ch));
	}

}
