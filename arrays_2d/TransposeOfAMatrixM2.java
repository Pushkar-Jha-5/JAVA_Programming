package arrays_2d;

import java.util.Scanner;

public class TransposeOfAMatrixM2 {
	public static void tanspose(int arr[][],int r,int c) {
		int[][] ans = new int[r][c];
		System.out.println("Transpose of a matrix is : ");
		for(int j=0;j<c;j++) {
			for(int i=0;i<r;i++) {
				ans[i][j] = arr[i][j];
			}
		}
		for(int j=0;j<c;j++) {
			for(int i=0;i<r;i++) {
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
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		tanspose(arr,r,c);
	}

}
