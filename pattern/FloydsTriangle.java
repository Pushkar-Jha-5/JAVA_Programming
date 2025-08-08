package pattern;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rows : ");
		int r = sc.nextInt();
		System.out.print("Enter the column : ");
		int c = sc.nextInt();
		
		int x = 1;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(x + " ");
				x++;
			}
			System.out.println();
		}
	}

}
