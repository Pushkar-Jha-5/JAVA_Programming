package arrays_2d;

import java.util.Scanner;

public class SumOfElement {
	public static int sumOfElement(int arr[][],int r,int c) {
		int sum = 0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				sum += arr[i][j];
			}
		}
		return sum;
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
		
		int x = sumOfElement(arr,r,c);
		System.out.println("The sum of element is : " + x);
	}

}
