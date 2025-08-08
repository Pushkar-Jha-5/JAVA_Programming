package pattern;

import java.util.Scanner;

public class AlphabetTriangleFlipped {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rows : ");
		int r = sc.nextInt();
		
		for(int i=1;i<=r;i++) {
			char ch = 65;
			for(int j=1;j<=r-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}

}
