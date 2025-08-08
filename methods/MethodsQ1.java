package methods;

import java.util.Scanner;

public class MethodsQ1 {
	public static void printSquare(int n) {
		for(int i=1;i<=n;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i=1;i<=n;i++) {
			System.out.print(i*i + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		printSquare(n);
	}

}
