package pattern;

import java.util.Scanner;

public class PatternQ9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();

		for(int i=1;i<=n;i++) {
			char ch = 65;
			for(int j=1;j<=i;j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}

}
