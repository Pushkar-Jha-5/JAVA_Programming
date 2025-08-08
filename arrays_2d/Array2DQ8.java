package arrays_2d;

import java.util.Scanner;

public class Array2DQ8 {
	public static void printDiagonal(int arr[][],int r,int c) {
		System.out.println("The diagonal of the array is : ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i==j || j==r-i-1) {
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
		
		printDiagonal(arr,r,c);
	}

}
