package binary_search;

import java.util.Scanner;

public class BSQ1 {
	public static int lastOccurence(int arr[],int n,int target) {
		int s = 0;
		int e = n - 1;
		int mid = s + (e - s)/2;
		int ub = n;
		while(s <= e) {
			mid = s + (e - s)/2;
			if(arr[mid] > target) {
				ub = mid;
				e = mid - 1;
			}
			else {
				s = mid + 1;
			}
		}
		return ub - 1;
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
		
		int x = lastOccurence(arr,n,target);
		System.out.println("The last occurence of the " + target + " is : " + x);
	}

}
