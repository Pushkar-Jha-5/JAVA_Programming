package loops;

import java.util.Scanner;

public class Print_GP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		int a = 3;
		int r = 4;
		int x = a;
		for(int i=1;i<=n;i++) {
			System.out.print(x + " ");
			x*=4;
		}
	}

}
