package binary_search;

import java.util.Scanner;

public class PeakElementInAMountainArray {
	public static int peakElement(int arr[],int n) {
	        int s = 1;
	        int e = n-2;
	        int mid = s+(e-s)/2;
	        while(s <= e){
	            mid = s+(e-s)/2;
	            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
	                return mid;
	            }
	            else if(arr[mid-1]>arr[mid]){
	                e = mid-1;
	            }
	            else if(arr[mid]<arr[mid+1]){
	                s = mid+1;
	            }
	        }
	        return -1;
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
		
		int x = peakElement(arr,n);
		System.out.println("The index of peak element is : " + x);
	}

}
