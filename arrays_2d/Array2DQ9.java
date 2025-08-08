package arrays_2d;

import java.util.Scanner;

public class Array2DQ9 {
	public static void rotateBy90DegreeACW(int arr[][],int r,int c) {
		for(int i=0;i<r;i++) {
			for(int j=0;j<=i;j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		for(int j=0;j<c;j++) {
			int s = 0;
			int e = r-1;
			while(s<=e) {
				int temp = arr[s][j];
				arr[s][j] = arr[e][j];
				arr[e][j] = temp;
				s++;
				e--;
			}
		}
		
		System.out.println("The updated array is : ");
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
		
		rotateBy90DegreeACW(arr,r,c);
	}

}
