package pattern;

import java.util.Scanner;

public class StarDiamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rows : ");
		int r = sc.nextInt();
		int x = r-1;
		
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=r-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int j=1;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=(x-i+1);j++) {
				System.out.print("* ");
			}
			for(int j=1;j<=x-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
