package arrays;

import java.util.Scanner;

public class ArrayQ5 {
	public static int smallestMissing(int arr[],int n) {
		int s = 0;
		int e = n-1;
		while(s <= e) {
			int mid = s+(e-s)/2;
			if(arr[mid] == mid+1) {
				s = mid+1;
			}
			else {
				e = mid-1;
			}
		}
		return s+1;
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
		
		int x = smallestMissing(arr,n);
		System.out.println("The smallest missing element is : " + x);
	}

}
