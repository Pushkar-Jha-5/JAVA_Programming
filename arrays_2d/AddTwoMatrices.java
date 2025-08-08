package arrays_2d;

import java.util.Scanner;

public class AddTwoMatrices {
	public static void addMatrices(int arr[][],int brr[][],int r,int c) {
		int[][] ans = new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				ans[i][j] = arr[i][j]+brr[i][j];
			}
		}
		System.out.println("The resultant matrix is : ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(ans[i][j] + " ");
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
		
		addMatrices(arr,brr,r,c);
	}

}
