package arrays;

import java.util.Scanner;

public class MinimumValue {
	public static int minValue(int n,int arr[]) {
		int min = arr[0];
		for(int i=0;i<n;i++) {
				min = Math.min(arr[i], min);
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int x = minValue(n,arr);
		System.out.println("The minimum value is : " + x);
	}

}
