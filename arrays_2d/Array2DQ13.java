package arrays_2d;

import java.util.Scanner;

public class Array2DQ13 {
	public static void setZeroRowAndColumn(int arr[][],int r,int c) {
		boolean[] row = new boolean[r];
		boolean[] col = new boolean[c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(arr[i][j] == 0) {
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
		for(int i=0;i<r;i++) {
			if(row[i] == true) {
				for(int j=0;j<c;j++) {
					arr[i][j] = 0;
				}
			}
		}
		
		for(int j=0;j<c;j++) {
			if(col[j] == true) {
				for(int i=0;i<r;i++) {
					arr[i][j] = 0;
				}
			}
		}
		
		System.out.println("After updating array is : ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j] + " ");
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
		
		setZeroRowAndColumn(arr,r,c);
	}

}
