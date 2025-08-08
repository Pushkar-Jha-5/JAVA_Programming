package sorting;

import java.util.Scanner;

public class MinIndexAtMinElement {
	public static void minIndex(int arr[],int n) {
		int x = 0;
		for(int i=0;i<n;i++) {
			int min = Integer.MAX_VALUE;
			int minIndex = -1;
			for(int j=0;j<n;j++) {
				if(arr[j] < min && arr[j] > 0) {
					min = arr[j];
					minIndex = j;
				}
			}
			arr[minIndex] = x;
			x--;
		}
		System.out.println("The updated array is : ");
		for(int i=0;i<n;i++) {
			System.out.print((-1*arr[i]) + " ");
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
		
		minIndex(arr,n);
	}

}
