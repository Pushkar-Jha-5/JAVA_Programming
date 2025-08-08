package recursion;

import java.util.Scanner;

public class PrintZigZag {
	public static void zigZag(int n) {
		if(n == 0) {
			return;
		}
		System.out.print(n + " ");
		zigZag(n-1);
		System.out.print(n + " ");
		zigZag(n-1);
		System.out.print(n + " ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		System.out.println("The zig zag pattern is : ");
		zigZag(n);
	}

}
