package pattern;

import java.util.Scanner;

public class PatternQ15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		int x = n-1;
		char ch = 65;
		
		for(int i=1;i<=2*n-1;i++) {
			System.out.print(ch + " ");
			ch++;
		}
		System.out.println();
		for(int i=1;i<=x;i++) {
			ch = 65;
			for(int j=1;j<=x-i+1;j++) {
				System.out.print(ch + " ");
				ch++;
			}
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=x-i+1;j++) {
				System.out.print(++ch + " ");
			}
			System.out.println();
		}
	}

}
