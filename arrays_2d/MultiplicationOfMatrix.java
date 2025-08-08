package arrays_2d;

import java.util.Scanner;

public class MultiplicationOfMatrix {
	public static void multiplication(int arr[][],int r1,int c1,int brr[][],int r2,int c2) {
		int[][] ans = new int[r1][c2];
		if(c1!=r2) {
			System.out.println("Multiplication is not possible");
			return;
		}
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				for(int k=0;k<=c2;k++) {
					ans[i][j] += arr[i][k]*brr[k][j];
				}
			}
		}
		System.out.println("The matrix after multiplication is : ");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows of 1st array: ");
		int r1 = sc.nextInt();
		System.out.print("Enter the no. of columns of 1st array: ");
		int c1 = sc.nextInt();
		
		int[][] arr = new int[r1][c1];
		System.out.println("Enter the elements of the 1st array : ");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Enter the no. of rows of 2nd array: ");
		int r2 = sc.nextInt();
		System.out.print("Enter the no. of columns of 2nd array: ");
		int c2 = sc.nextInt();
		int[][] brr = new int[r2][c2];
		System.out.println("Enter the elements of the 2nd array : ");
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				brr[i][j] = sc.nextInt();
			}
		}
		
		multiplication(arr,r1,c1,brr,r2,c2);
	}

}
