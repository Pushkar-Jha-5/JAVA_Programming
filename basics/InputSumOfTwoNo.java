package basics;

import java.util.Scanner;
public class InputSumOfTwoNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no");
		int a = sc.nextInt();
		System.out.println("Enter 2nd no");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("The sum is " + sum);
	}

}
