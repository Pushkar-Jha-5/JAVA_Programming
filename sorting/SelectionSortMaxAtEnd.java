package sorting;

import java.util.Scanner;

public class SelectionSortMaxAtEnd {
	public static void selectionSortMaxAtEnd(int arr[],int n) {
		for(int i=n-1;i>=0;i--) {
			int max = arr[i];
			int maxIndex = i;
			for(int j=i;j>=0;j--) {
				if(arr[j] > max) {
					max = arr[j];
					maxIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex] = temp;
		}
		System.out.println("The array after sorting is : ");
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
		
		selectionSortMaxAtEnd(arr,n);
	}

}
