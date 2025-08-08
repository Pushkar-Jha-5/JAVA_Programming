package arrays;

import java.util.Scanner;

public class NextGreatestElement {
	public static void nextGreatest(int arr[],int n) {
		for(int i=0;i<n;i++) {
			int max = 0;
			for(int j=i+1;j<n;j++) {
				if(arr[j] > max) {
					max = arr[j];
				}
			}
			arr[i] = max;
		}
		System.out.print("The next greatest element of the array is : ");
		for(int i=0;i<n-1;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(-1);
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
		
		nextGreatest(arr,n);
	}

}
