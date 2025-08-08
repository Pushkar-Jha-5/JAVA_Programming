package arrays;
import java.util.Scanner;

public class SumDoublet {
	public static void sumDoublet(int n,int arr[],int x) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==x) {
					System.out.println("(" + arr[i] + "," + arr[j] + ") at index " + "(" + i + "," + j + ")");
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the elements of array : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the target sum : ");
		int x = sc.nextInt();
		
		sumDoublet(n,arr,x);
	}

}
