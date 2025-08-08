package mergeAndQuickSort;

import java.util.Scanner;

public class QuickSortQ3 {
	public static void swapTwoElement(int arr[],int n) {
		int x = -1;
		int y = -1;
		for(int i=0;i<n;i++) {
			if(arr[i]>arr[i+1]) {
				x = i;
				break;
			}
		}
		for(int i=x+1;i<n;i++) {
			if(arr[i]>arr[i+1]) {
				y = i+1;
				break;
			}
		}
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
		
		System.out.print("The sorted array is : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the elements of the array : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		swapTwoElement(arr,n);
	}

}
