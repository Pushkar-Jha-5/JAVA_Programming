package queue;
import java.util.*;

public class ReorderQueue {
	public static void reorderQueue(int[] arr,int n) {
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<n;i++) {
			q.add(arr[i]);
		}
		Stack<Integer> st1 = new Stack<>();
		Stack<Integer> st2 = new Stack<>();
		int size = q.size();
		
		for(int i=1;i<=size/2;i++) {
			st1.add(q.poll());
		}
		for(int i=1;i<=size/2;i++) {
			st2.add(q.poll());
		}
		
		for(int i=1;i<=n/2;i++) {
			q.add(st2.pop());
			q.add(st1.pop());
		}
		while(!q.isEmpty()) {
			st1.add(q.poll());
		}
		while(!st1.isEmpty()) {
			q.add(st1.pop());
		}
		System.out.println("The reorder queue is : ");
		System.out.println(q);
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
		
		reorderQueue(arr,n);
	}

}
