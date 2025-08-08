package pattern;

import java.util.Scanner;

public class AlphabetTriangleReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rows : ");
		int r = sc.nextInt();
		System.out.print("Enter the column : ");
		int c = sc.nextInt();
		
		char ch = 65;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=r+1-i;j++) {
				System.out.print(ch + " ");
			}
			ch++;
			System.out.println();
		}
	}

}
