package stack;
import java.util.*;
import java.util.Stack;

public class NextGreaterElement {
	public static void nextGreater(int[] arr,int n) {
		Stack<Integer> st = new Stack<Integer>();
		int[] ans = new int[n];
		ans[n-1] = -1;
		st.push(arr[n-1]);
		for(int i=n-2;i>=0;i--) {
			while(!st.isEmpty() && st.peek() <= arr[i]) {
				st.pop();
			}
			ans[i] = st.isEmpty() ? -1 : st.peek();
			st.push(arr[i]);
		}
		System.out.println("The next greater element is : ");
		for(int i=0;i<n;i++) {
			System.out.print(ans[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		nextGreater(arr,n);
	}

}
