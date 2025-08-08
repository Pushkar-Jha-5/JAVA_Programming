package binary_search;
import java.util.Scanner;

public class BinarySearch {
	public static boolean binarySearch(int arr[],int n,int target) {
		int s = 0;
		int e = n-1;
		int mid = s+(e-s)/2;
		while(s<=e) {
			if(target < arr[mid]) {
				e = mid-1;
				mid = s+(e-s)/2;
			}
			else if(target > arr[mid]) {
				s = mid+1;
				mid = s+(e-s)/2;
			}
			else {
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
		System.out.print("Enter the elements of the array : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the target : ");
		int target = sc.nextInt();
		
		boolean x = binarySearch(arr,n,target);
		if(x) {
			System.out.println("Element is found");
		}
		else {
			System.out.println("Element is not found");
		}
	}

}
