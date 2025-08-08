package sorting;

import java.util.Scanner;

public class SortingQ5 {
	public static boolean almostSorted(int arr[],int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					return false;
				}
			}
		}
		return true;
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
		
		boolean x = almostSorted(arr,n);
		if(x) {
			System.out.println("The array is almost sorted");
		}
		else {
			System.out.println("The array is not almost sorted");
		}
	}

}
