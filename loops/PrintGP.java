package loops;

import java.util.Scanner;

public class PrintGP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		int a = 1;
		int r = 2;
		int x = a;
		for(int i=1;i<=n;i++) {
			System.out.print(x + " ");
			x*=r;
		}
	}

}
