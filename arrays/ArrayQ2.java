package arrays;

import java.util.Scanner;

public class ArrayQ2 {
	public static int secondLargest(int arr[],int n) {
		int max = arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		int max2 = arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max2 && arr[i]<max) {
				max2 = arr[i];
			}
		}
		return max2;
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
		
		int x = secondLargest(arr,n);
		System.out.println("The second largest element of the array is : " + x);
	}

}
