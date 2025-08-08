package pattern;

import java.util.Scanner;

public class PatternQ20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if(i+j==n+1 || j-i==n-1 || j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		for(int i=1;i<=2*n-1;i++) {
			System.out.print("* ");
		}
		System.out.println();
		
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=2*n-1;j++) {
				if(i+j==n+1 || j-i==n-1 || j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
