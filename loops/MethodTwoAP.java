package loops;

import java.util.Scanner;

public class MethodTwoAP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		int a = 4;
		int d = 3;
		int x = a;
		for(int i=1;i<=n;i++) {
			System.out.print(x + " ");
			x+=d;
		}
	}

}
