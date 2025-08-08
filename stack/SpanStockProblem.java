package stack;
import java.util.*;
import java.util.Stack;

import java.util.Scanner;

public class SpanStockProblem {
	public static void spanStock(int[] arr,int n) {
		Stack<Integer> st = new Stack<Integer>();
		int[] ans = new int[n];
		st.push(0);
		for(int i=0;i<n;i++) {
			while(!st.isEmpty() && arr[st.peek()] <= arr[i]) {
				st.pop();
			}
			if(st.isEmpty()) {
				ans[i] = i+1;
			}
			else {
				ans[i] = i - st.peek();
			}
			st.push(i);
		}
		System.out.println("The no. of days stock is greater is : ");
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
		
		spanStock(arr,n);
	}

}
