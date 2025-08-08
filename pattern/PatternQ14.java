package pattern;

import java.util.Scanner;

public class PatternQ14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();

		for(int i=1;i<=n;i++) {
			char ch = 65;
			int x = 65+i-1;
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print((char)x + " ");
				x--;
			}
			for(int j=1;j<i;j++) {
				ch++;
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}

}
