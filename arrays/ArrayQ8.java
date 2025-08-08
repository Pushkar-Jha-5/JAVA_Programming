package arrays;

import java.util.Scanner;

public class ArrayQ8 {
	public static boolean sorted(int arr[],int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					return false;
				}
			}
		}
		return true;
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
		
		boolean x = sorted(arr,n);
		if(x) {
			System.out.println("The array is sorted");
		}
		else {
			System.out.println("The array is not sorted");
		}
	}

}
