package pattern;

import java.util.Scanner;

public class PatternQ7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rows : ");
		int r = sc.nextInt();
		System.out.print("Enter the column : ");
		int c = sc.nextInt();
		
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
