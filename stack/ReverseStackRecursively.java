package stack;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStackRecursively {
	public static void reverseStack(Stack<Integer> st) {
		if(st.isEmpty()) {
			return;
		}
		
		int top = st.pop();
		System.out.println(top);
		reverseStack(st);
		st.push(top);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		System.out.print("Enter the size : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++) {
			st.push(sc.nextInt());
		}
		System.out.println("The stack in reversed order is : ");
		reverseStack(st);
	}
}
