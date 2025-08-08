package pattern;

import java.util.Scanner;

public class Alphabet_square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side of square : ");
		int n = sc.nextInt();
		
		char ch = 65;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(ch + " ");
			}
			ch++;
			System.out.println();
		}
	}

}
