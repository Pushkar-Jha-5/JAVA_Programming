package mergeAndQuickSort;

import java.util.Scanner;

public class InversionCount {
	static int count = 0;
	public static int countInversion(int left[],int len1,int right[],int len2) {
		int i = 0;
		int j = 0;
		while(i<len1 && j<len2) {
			if(left[i]>right[j]) {
				count = count + (len1-i);
				j++;
			}
			else {
				i++;
			}
		}
		return count;
	}
	
	public static void merge(int arr[],int n,int s,int e) {
		int mid = s+(e-s)/2;
		int len1 = mid-s+1;
		int len2 = e-mid;
		int[] left = new int[len1];
		int[] right = new int[len2];
		int k = s;
		for(int i=0;i<len1;i++) {
			left[i] = arr[k++];
		}
		k = mid+1;
		for(int i=0;i<len2;i++) {
			right[i] = arr[k++];
		}
		countInversion(left,len1,right,len2);
		
		int i = 0;
		int j = 0;
		k = s;
		while(i<len1 && j<len2) {
			if(left[i] < right[j]) {
				arr[k++] = left[i++];
			}
			else {
				arr[k++] = right[j++];
			}
		}
		while(i<len1) {
			arr[k++] = left[i++];
		}
		while(j<len2) {
			arr[k++] = right[j++];
		}
	}
	
	public static void mergeSort(int arr[],int n,int s,int e) {
		int mid = s+(e-s)/2;
		if(s >= e) {
			return;
		}
		mergeSort(arr,n,s,mid);
		mergeSort(arr,n,mid+1,e);
		merge(arr,n,s,e);
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
		
		mergeSort(arr,n,0,n-1);
		System.out.println("The inversion count is : " + count);
	}

}
