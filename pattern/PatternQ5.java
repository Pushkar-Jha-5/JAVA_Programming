package pattern;

import java.util.Scanner;

public class PatternQ5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		int x = n-1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=x-i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
