package arrays_2d;

import java.util.Scanner;

public class ProductOfElement {
	public static int productOfElement(int arr[][],int r,int c) {
		int product = 1;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				product *= arr[i][j];
			}
		}
		return product;
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
		
		int x = productOfElement(arr,r,c);
		System.out.println("The product of element is : " + x);
	}

}
