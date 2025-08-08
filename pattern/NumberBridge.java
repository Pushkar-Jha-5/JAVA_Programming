package pattern;

import java.util.Scanner;

public class NumberBridge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rows : ");
		int r = sc.nextInt();
		int x = r-1;
		
		for(int i=1;i<=2*r-1;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=(x-i+1);j++) {
				System.out.print(j + " ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=(x-i+1);j++) {
				System.out.print((i+j+x) + " ");
			}
			System.out.println();
		}
	}

}
