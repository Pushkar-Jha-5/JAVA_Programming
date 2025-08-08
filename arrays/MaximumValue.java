package arrays;

import java.util.Scanner;

public class MaximumValue {
	public static int maxValue(int n,int arr[]) {
		int max = arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
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
		
		int x = maxValue(n,arr);
		System.out.println("The maximum value is : " + x);
	}

}
