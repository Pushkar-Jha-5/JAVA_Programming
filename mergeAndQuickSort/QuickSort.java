package mergeAndQuickSort;

import java.util.Scanner;

public class QuickSort {
	public static void print(int arr[],int n) {
		System.out.println("The sorted array is : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int partition(int arr[],int n,int s,int e) {
		int pivot = arr[s];
		int pivotIndex = s;
		int count = 0;
		for(int i=s+1;i<=e;i++) {
			if(arr[i]<=pivot) {
				count++;
			}
		}
		int correctIndex = pivotIndex+count;
		int temp = arr[correctIndex];
		arr[correctIndex] = arr[pivotIndex];
		arr[pivotIndex] = temp;
		
		int i = s;
		int j = e;
		while(i<correctIndex && j>correctIndex) {
			if(arr[i]<=pivot) {
				i++;
			}
			else if(arr[j]>pivot) {
				j--;
			}
			else if(arr[i]>pivot && arr[j]<=pivot) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		return correctIndex;
	}
	
	public static void quickSort(int arr[],int n,int s,int e) {
		if(s >= e) {
			return;
		}
		int x = partition(arr,n,s,e);
		
		quickSort(arr,n,s,x-1);
		quickSort(arr,n,x+1,e);
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
		
		quickSort(arr,n,0,n-1);
		print(arr,n);
	}

}
