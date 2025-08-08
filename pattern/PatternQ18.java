package pattern;

import java.util.Scanner;

public class PatternQ18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		int x = n-1;
		
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=2*n-1;j++) {
				if(i==j || (i+j)==(2*n)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=2*x+1;j++) {
				if(j-i==1 || (i+j)==(2*x+1)) {
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
