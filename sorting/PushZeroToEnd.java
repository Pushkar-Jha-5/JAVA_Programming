package sorting;

import java.util.Scanner;

public class PushZeroToEnd {
	public static void pushZeroAtEnd(int arr[],int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i] == 0) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
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
		
		pushZeroAtEnd(arr,n);
	}

}
