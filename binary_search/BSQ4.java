package binary_search;

import java.util.Scanner;

public class BSQ4 {
	public static int repeatedElement(int arr[],int n) {
		int s = 0;
		int e = n - 1;
		int mid = s + (e - s)/2;
		while(s <= e) {
			mid = s + (e - s)/2;
			int count = 0;
			for(int element : arr) {
				if(element <= mid) {
					count++;
				}
			}
			if(count > mid) {
				e = mid-1;
			}
			else {
				s = mid+1;
			}
		}
		return s;
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
		
		int x = repeatedElement(arr,n);
		System.out.println("The repeated element is : " + x);
	}

}
