package mergeAndQuickSort;

import java.util.Scanner;

public class KthSmallestElement {
	static int ans;
	
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
	
	public static void quickSelect(int arr[],int n,int s,int e,int k) {
		if(s > e) {
			return;
		}
		if(s == e) {
			if(s == k-1) {
				ans = arr[s];
				return;
			}
		}
		int x = partition(arr,n,s,e);
		if(x == k-1) {
			ans = arr[x];
			return;
		}
		
		if(k-1 < x) {
			quickSelect(arr,n,s,x-1,k);
		}
		else {
			quickSelect(arr,n,x+1,e,k);
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
		System.out.print("Enter the value of k : ");
		int k = sc.nextInt();
		
		ans = -1;
		
		quickSelect(arr,n,0,n-1,k);
		System.out.println("The " + k + " th smallest element is : " + ans);
	}

}
