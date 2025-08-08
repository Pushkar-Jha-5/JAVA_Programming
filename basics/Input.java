package basics;

import java.util.Scanner;
public class Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		System.out.println("The square of n is " + (n*n));
	}

}
