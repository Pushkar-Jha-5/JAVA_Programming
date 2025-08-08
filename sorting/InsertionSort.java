package sorting;

import java.util.Scanner;

public class InsertionSort {
	public static void insertionSort(int arr[],int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j>=1;j--) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] =temp;
				}
				else {
					break;
				}
			}
		}
		System.out.println("The array after insertion sort is : ");
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
		
		insertionSort(arr,n);
	}

}
