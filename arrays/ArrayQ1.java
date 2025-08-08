package arrays;

import java.util.Scanner;

public class ArrayQ1 {
	public static int product(int arr[],int n) {
		int product = 1;
		for(int i=0;i<n;i++) {
			product*=arr[i];
		}
		return product;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the elements of the array : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int x = product(arr,n);
		System.out.println("The product of elements of array is : " + x);
	}

}
