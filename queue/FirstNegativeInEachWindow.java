package queue;
import java.util.*;

public class FirstNegativeInEachWindow {
	public static void window(int[] arr,int n,int k) {
		Queue<Integer> q = new LinkedList<>();
		int[] res = new int[n-k+1];
		for(int i=0;i<n;i++) {
			if(arr[i] < 0) {
				q.add(i);
			}
		}
		for(int i=0;i<n-k+1;i++) {
			if(!q.isEmpty() && q.peek() < i) {
				q.poll();
			}
			if(!q.isEmpty() && q.peek() <= i+k-1) {
				res[i] = arr[q.peek()];
			}
		}
		System.out.println("The updated array is : ");
		for(int i=0;i<n-k+1;i++) {
			System.out.print(res[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int n = sc.nextInt();
		System.out.print("Enter the elements : ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the value of k : ");
		int k = sc.nextInt();
		
		window(arr,n,k);
	}

}
