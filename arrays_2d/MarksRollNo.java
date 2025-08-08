package arrays_2d;

import java.util.Scanner;

public class MarksRollNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows : ");
		int r = sc.nextInt();
		System.out.print("Enter the no. of columns : ");
		int c = sc.nextInt();
		
		int[][] arr = new int[r][c];
		System.out.println("Enter roll no. and marks : ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Roll Marks");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(" " + arr[i][j] + "   ");
			}
			System.out.println();
		}
	}

}
