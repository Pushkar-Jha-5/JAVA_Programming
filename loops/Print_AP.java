package loops;

import java.util.Scanner;

public class Print_AP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		int a = 4;
		int d = 3;
		int tn = a+((n-1)*d);
		for(int i=a;i<=tn;i+=d) {
			System.out.print(i + " ");
		}
	}

}
