package conditionals;

import java.util.Scanner;

public class FiveDigitNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		if(n>9999 && n<100000) {
			System.out.println(n + " is five digit no");
		}
		else {
			System.out.println(n + " is not five digit no");
		}
	}

}
