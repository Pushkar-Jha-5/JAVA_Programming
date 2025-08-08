package arrays;

import java.util.Scanner;

public class ArrayQ10 {
	public static void changeValue(int arr[],int n) {
		for(int i=0;i<n;i++) {
			if(i%2 == 0) {
				arr[i] += 10;
			}
			else {
				arr[i] *= 2;
			}
		}
		System.out.print("The updated array is : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
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
		
		changeValue(arr,n);
	}

}
