package arrays_2d;

import java.util.Scanner;

public class Array2DQ2 {
	public static void addMatrix(int arr[][],int brr[][],int r,int c) {
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j] += brr[i][j];
			}
		}
		
		System.out.println("The matrix after addition is : ");
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
		System.out.println("Enter the elements of the 1st array : ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int[][] brr = new int[r][c];
		System.out.println("Enter the elements of the 2nd array : ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				brr[i][j] = sc.nextInt();
			}
		}
		
		addMatrix(arr,brr,r,c);
	}

}
