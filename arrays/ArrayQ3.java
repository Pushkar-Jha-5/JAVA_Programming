package arrays;

import java.util.Scanner;

public class ArrayQ3 {
	public static int minimum(int arr[],int n) {
		int min = arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
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
		
		int x = minimum(arr,n);
		System.out.println("The minimum element of the array is : " + x);
	}

}
