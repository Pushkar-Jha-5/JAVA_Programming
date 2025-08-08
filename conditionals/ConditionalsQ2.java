package conditionals;

import java.util.Scanner;

public class ConditionalsQ2 {
	public static void absoluteValue(int n) {
		if(n<0) {
			System.out.println("Absolute value of " + n + " is " + (-n));
		}
		else {
			System.out.println("Absolute value of " + n + " is " + n);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		absoluteValue(n);
	}

}
