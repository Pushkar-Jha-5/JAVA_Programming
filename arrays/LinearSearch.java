package arrays;

import java.util.Scanner;

public class LinearSearch {
	public static boolean linearSearch(int n,int arr[],int x) {
		for(int i=0;i<n;i++) {
			if(arr[i]==x) {
				return true;
			}
		}
		return false;
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
		System.out.print("Enter the element to be searched : ");
		int x = sc.nextInt();
		
		boolean a = linearSearch(n,arr,x);
		if(a) {
			System.out.println("Element is found");
		}
		else {
			System.out.println("Element is not found");
		}
	}

}
