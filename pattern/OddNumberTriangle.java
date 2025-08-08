package pattern;

import java.util.Scanner;

public class OddNumberTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rows : ");
		int r = sc.nextInt();
		System.out.print("Enter the column : ");
		int c = sc.nextInt();
		
		for(int i=1;i<=r;i++) {
			int x = 1;
			for(int j=1;j<=i;j++) {
				System.out.print(x + " ");
				x+=2;
			}
			System.out.println();
		}
	}

}
