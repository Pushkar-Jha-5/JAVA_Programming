package binary_search;

import java.util.Scanner;

public class UpperBound {
	public static int upperBound(int arr[],int n,int target) {
		int s = 0;
		int e = n-1;
		int mid = s+(e-s)/2;
		int ub = n;
		while(s<=e) {
			mid = s+(e-s)/2;
			if(arr[mid] > target) {
				ub = Math.min(mid, ub);
				e = mid-1;
			}
			else {
				s = mid+1;
			}
		}
		return ub;
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
		
		int x = upperBound(arr,n,target);
		System.out.println("The upper bound index is : " + x);
	}
}
