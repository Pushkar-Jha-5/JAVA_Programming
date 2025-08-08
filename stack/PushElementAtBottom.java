package stack;
import java.util.Scanner;
import java.util.Stack;

public class PushElementAtBottom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		System.out.print("Enter the size : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements of the stack : ");
		for(int i=0;i<n;i++) {
			st.push(sc.nextInt());
		}
		Stack<Integer> temp = new Stack<>();
		while(!st.isEmpty()) {
			temp.push(st.pop());
		}
		System.out.print("Enter the element to be pushed at bottom : ");
		int x = sc.nextInt();
		st.push(x);
		while(!temp.isEmpty()) {
			st.push(temp.pop());
		}
		System.out.println("The stack is : ");
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
	}

}
