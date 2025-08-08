package binary_search;

import java.util.Scanner;

public class FirstAndLastOccurence {
	public static void occurence(int arr[],int n,int target) {
		int[] ans = new int[2];
		int s = 0;
		int e = n-1;
		int mid = s+(e-s)/2;
		
		boolean flag = false;
		while(s<=e) {
			if(target < arr[mid]) {
				e = mid-1;
				mid = s+(e-s)/2;
			}
			else if(target > arr[mid]) {
				s = mid+1;
				mid = s+(e-s)/2;
			}
			else if(target == arr[mid]){
				flag = true;
				break;
			}
		}
		if(flag == false) {
			ans[0] = -1;
			ans[1] = -1;
			System.out.println("The first and last occurence of the target is : " + " " + ans[0] + " " + ans[1]);
			return;
		}
		
		s = 0;
		e = n-1;
		mid = s+(e-s)/2;
		int fo = n;
		int lo = n;
		while(s <= e) {
			mid = s+(e-s)/2;
			if(arr[mid]>=target) {
				fo = mid;
				e = mid-1;
			}
			else {
				s = mid+1;
			}
		}
		ans[0] = fo;
		
		s = 0;
		e = n-1;
		mid = s+(e-s)/2;
		while(s <= e) {
			mid = s+(e-s)/2;
			if(arr[mid]>target) {
				lo = mid;
				e = mid-1;
			}
			else {
				s = mid+1;
			}
		}
		ans[1] = lo-1;
		System.out.println("The first and last occurence of the target is : ");
		for(int i=0;i<2;i++) {
			System.out.print(ans[i] + " ");
		}
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
		
		occurence(arr,n,target);
	}

}
