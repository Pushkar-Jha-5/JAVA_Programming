package sorting;

import java.util.Scanner;

public class SortingQ13 {
	public static int smallestkth(int arr[],int n,int k) {
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr[k-1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System .in);
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the elements of array : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the value of k : ");
		int k = sc.nextInt();
		
		int x = smallestkth(arr,n,k);
		System.out.println("The smallest " + k + "th element is : " + x);
	}

}
