package loops;

import java.util.Scanner;
public class TableOfInputN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		int j=1;
		for(int i=n;i<=n*10;i+=n) {
			System.out.println(n + " * " + j + " = " + i);
			j++;
		}
	}

}
