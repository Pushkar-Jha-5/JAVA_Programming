package strings;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		String str = Integer.toString(n);
		int count = str.length();
		System.out.println("The no. of digit in " + n + " is : " + count);
	}

}
