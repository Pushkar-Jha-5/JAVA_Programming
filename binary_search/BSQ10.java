package binary_search;

import java.util.Scanner;

public class BSQ10 {
	public static void rotatedArrayBS(int arr[],int n,int target) {
		int s = 0;
		int e = n-1;
		int mid = s+(e-s)/2;
		int pivot = -1;
		while(s <= e) {
			mid = s+(e-s)/2;
			if(arr[mid]<arr[mid-1] && arr[mid]<arr[mid+1]) {
				pivot = mid;
				break;
			}
			else if(arr[mid]>arr[mid-1] && arr[mid] <= arr[mid+1]) {
				s = mid+1;
			}
			else {
				e = mid-1;
			}
		}
		s = 0;
		e = pivot-1;
		mid = s+(e-s)/2;
		while(s <= e) {
			mid = s+(e-s)/2;
			if(arr[mid] == target) {
				System.out.println("Target is found");
				return;
			}
			else if(target > arr[mid]) {
				s = mid+1;
			}
			else {
				e = mid-1;
			}
		}
		s = pivot;
		e = n-1;
		mid = s+(e-s)/2;
		while(s <= e) {
			mid = s+(e-s)/2;
			if(arr[mid] == target) {
				System.out.println("Target is found");
				return;
			}
			else if(target > arr[mid]) {
				s = mid+1;
			}
			else {
				e = mid-1;
			}
		}
		System.out.println("Target is not found");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the elements of the array : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the target : ");
		int target = sc.nextInt();
		
		rotatedArrayBS(arr,n,target);
	}

}
