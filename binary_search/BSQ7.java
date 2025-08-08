package binary_search;

import java.util.Scanner;

public class BSQ7 {
	public static void descendingBS(int arr[],int n,int target) {
		int s = 0;
		int e = n-1;
		int mid = s+(e-s)/2;
		while(s <= e) {
			mid = s+(e-s)/2;
			if(arr[mid] == target) {
				System.out.println("Target is found");
				return;
			}
			else if(target < arr[mid]) {
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
		
		descendingBS(arr,n,target);
	}

}
