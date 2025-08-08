package pattern;

import java.util.Scanner;

public class PatternQ13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();

		for(int i=1;i<=n;i++) {
			char ch = 65;
			int x = i+65;
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(ch + " ");
				ch++;
			}
			for(int j=1;j<i;j++) {
				System.out.print((char)x + " ");
				x++;
			}
			System.out.println();
		}
	}

}
