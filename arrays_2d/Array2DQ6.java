package arrays_2d;

import java.util.Scanner;

public class Array2DQ6 {
	public static void printMiddleRowAndColumn(int arr[][],int r,int c) {
		System.out.println("The middle row and column is : ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i==r/2 || j==c/2) {
					System.out.print(arr[i][j] + " ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows : ");
		int r = sc.nextInt();
		System.out.print("Enter the no. of columns : ");
		int c = sc.nextInt();
		
		int[][] arr = new int[r][c];
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		printMiddleRowAndColumn(arr,r,c);
	}

}
