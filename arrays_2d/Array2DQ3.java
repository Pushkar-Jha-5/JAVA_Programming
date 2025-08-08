package arrays_2d;

import java.util.Scanner;

public class Array2DQ3 {
	public static int sumOfRectangle(int arr[][],int r,int c,int lri,int hri,int lci,int hci) {
		int sum = 0;
		for(int i=lri;i<=hri;i++) {
			for(int j=lci;j<=hci;j++) {
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
		
		System.out.print("Enter the lower row index : ");
		int lri = sc.nextInt();
		System.out.print("Enter the higher row index : ");
		int hri = sc.nextInt();
		
		System.out.print("Enter the lower column index : ");
		int lci = sc.nextInt();
		System.out.print("Enter the higher column index : ");
		int hci = sc.nextInt();
		
		int x = sumOfRectangle(arr,r,c,lri,hri,lci,hci);
		System.out.println("The sum of rectangle is : " + x);
	}

}
