package binary_search;

import java.util.Scanner;

public class BSQ2 {
	public static int countOne(int arr[],int n) {
		int s = 0;
		int e = n - 1;
		int count = 0;
		int mid = s + (e - s)/2;
		while(s <= e) {
			mid = s + (e - s)/2;
			if(arr[mid] == 0) {
				s = mid + 1;
			}
			else if(arr[mid] == 1 && arr[mid-1] == 1) {
				e = mid - 1;
			}
			else if(arr[mid] == 1 && arr[mid-1] == 0){
				count = n - mid;
				return count;
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
		
		int x = countOne(arr,n);
		System.out.println("The total no. of one's in the array is : " + x);
	}

}
