package sorting;

import java.util.Scanner;

public class SelectionSort {
	public static void selectionSort(int arr[],int n) {
		for(int i=0;i<n-1;i++) {
			int min = arr[i];
			int minIndex = i;
			for(int j=i;j<n;j++) {
				if(arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			// swap arr[i] and arr[minIndex]
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		System.out.println("The array after selection sort is : ");
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
		
		selectionSort(arr,n);
	}

}
