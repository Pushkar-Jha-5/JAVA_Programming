package arrays;

import java.util.Scanner;

public class SecondLargestElement {
	public static int secondMax(int n,int arr[]) {
		int max = arr[0];
		int max2 = arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		int a = max;
		for(int i=0;i<n;i++) {
			if(arr[i]>max2 && arr[i]<a) {
				max2 = arr[i];
			}
		}
		return max2;
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
		
		int x = secondMax(n,arr);
		System.out.println("The second largest element is : " + x);
	}

}
