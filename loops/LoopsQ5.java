package loops;

import java.util.Scanner;

public class LoopsQ5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.print(a + " " + b);
		for(int i=3;i<=n;i++) {
			int nextDigit = a+b;
			System.out.print(" " + nextDigit);
			a = b;
			b = nextDigit;
		}
	}

}
