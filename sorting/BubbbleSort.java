package sorting;

import java.util.Scanner;

public class BubbbleSort {
	public static void bubbleSort(int arr[],int n) {
//		// bubble sort -> 1
//		for(int i=0;i<n-1;i++) {
//			for(int j=0;j<n-1;j++) {     
//				if(arr[j] > arr[j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
		
		// bubble sort -> 2
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {     // it is optimized than (j<n-1)
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("The sorted array is : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System .in);
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the elements of array : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		bubbleSort(arr,n);
	}

}
