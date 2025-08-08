package arrays;

import java.util.Scanner;

public class ArrayQ7 {
	public static void largestThree(int arr[],int n) {
		int max1 = arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max1) {
				max1 = arr[i];
			}
		}
		int max2 = arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max2 && arr[i]<max1) {
				max2 = arr[i];
			}
		}
		int max3 = arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max3 && arr[i]<max2) {
				max3 = arr[i];
			}
		}
		System.out.println("The 1st largest element is : " + max1);
		System.out.println("The 2nd largest element is : " + max2);
		System.out.println("The 3rd largest element is : " + max3);
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
		
		largestThree(arr,n);
	}

}
