package recursion;

import java.util.Scanner;

public class PrintArrayElements {
	public static void print(int arr[],int n) {
		// base case
		if(n == 0) {
			return;
		}
		// recursive case
		print(arr,n-1);
		System.out.print(arr[n-1] + " ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the elements of the array : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("The elements of the array after traversing is : ");
		print(arr,n);
	}

}
