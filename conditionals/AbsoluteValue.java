package conditionals;

import java.util.Scanner;
public class AbsoluteValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		if(n>=0) {
			System.out.println("Absolute value of " + n + " is " + n);
		}
		else {
			System.out.println("Absolute value of " + n + " is " + (-n));
		}
	}

}
