package binary_search;

import java.util.Scanner;

public class SearchingInARotatedArray {
	public static int searchingInARotatedArray(int arr[],int n,int target) {
		int s = 0;
		int e = n-1;
		int mid = s+(e-s)/2;
        while(s <= e){
            mid = s+(e-s)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]<=arr[e]){
                if(arr[mid]<=target && target<=arr[e]){
                    s = mid+1;
                }
                else{
                    e = mid-1;
                }
            }
            else if(arr[mid]>arr[e]){
                if(arr[s]<=target && target<=arr[mid]){
                    e = mid-1;
                }
                else{
                    s = mid+1;
                }
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
		System.out.print("Enter the target : ");
		int target = sc.nextInt();
		
		int x = searchingInARotatedArray(arr,n,target);
		System.out.println("The " + target + " is present at index " + x);
	}

}
