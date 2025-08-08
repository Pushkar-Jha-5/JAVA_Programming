package arrays_2d;

import java.util.Scanner;

public class SpiralPrinting {
	public static void spiralPrinting(int arr[][],int r,int c) {
		int minRow = 0;
		int maxRow = r-1;
		int minCol = 0;
		int maxCol = c-1;
		System.out.println("The spiral form of the array is : ");
		while(minRow<=maxRow && minCol<=maxCol) {
			for(int j=minCol;j<=maxCol;j++) {
				System.out.print(arr[minRow][j] + " ");
			}
			minRow++;
			if(minRow>maxRow || minCol>maxCol) {
				break;
			}
			for(int i=minRow;i<=maxRow;i++) {
				System.out.print(arr[i][maxCol] + " ");
			}
			maxCol--;
			if(minRow>maxRow || minCol>maxCol) {
				break;
			}
			for(int j=maxCol;j>=minCol;j--) {
				System.out.print(arr[maxRow][j] + " ");
			}
			maxRow--;
			if(minRow>maxRow || minCol>maxCol) {
				break;
			}
			for(int i=maxRow;i>=minRow;i--) {
				System.out.print(arr[i][minCol] + " ");
			}
			minCol++;
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
		
		spiralPrinting(arr,r,c);
	}

}
