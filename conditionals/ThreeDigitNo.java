package conditionals;

import java.util.Scanner;

public class ThreeDigitNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		if(n>99 && n<1000) {
			System.out.println(n + " is three digit no");
		}
		else {
			System.out.println(n + " is not three digit no");
		}
	}

}
