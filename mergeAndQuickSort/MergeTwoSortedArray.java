package mergeAndQuickSort;
import java.util.Scanner;

public class MergeTwoSortedArray {
	public static void print(int ans[],int m,int n) {
		System.out.println("The sorted array is : ");
		for(int i=0;i<m+n;i++) {
			System.out.print(ans[i] + " ");
		}
	}
	
	public static void merge(int arr[],int m,int brr[],int n) {
		int[] ans = new int[m+n];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<m && j<n) {
			if(arr[i] < brr[j]) {
				ans[k++] = arr[i++];
			}
			else {
				ans[k++] = brr[j++];
			}
		}
		while(i<m) {
			ans[k++] = arr[i++];
		}
		while(j<n) {
			ans[k++] = brr[j++];
		}
		
		print(ans,m,n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of 1st array : ");
		int m = sc.nextInt();
		int[] arr = new int[m];
		System.out.print("Enter the elements of 1st array : ");
		for(int i=0;i<m;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the size of 2nd array : ");
		int n = sc.nextInt();
		int[] brr = new int[n];
		System.out.print("Enter the elements of 2nd array : ");
		for(int i=0;i<n;i++) {
			brr[i] = sc.nextInt();
		}
		merge(arr,m,brr,n);
	}

}
