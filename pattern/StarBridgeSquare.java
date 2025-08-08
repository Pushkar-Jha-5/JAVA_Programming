package pattern;

import java.util.Scanner;

public class StarBridgeSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rows : ");
		int r = sc.nextInt();
		
		for(int i=1;i<=2*r-1;i++) {
			System.out.print("* ");
		}
		System.out.println();
		int x = r-1;
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=x;j++) {
				System.out.print("* ");
			}
			for(int j=1;j<=x;j++) {
				if(j==x) {
					System.out.print("  ");
				}
			}
			for(int j=1;j<=x;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
