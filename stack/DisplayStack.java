package stack;
import java.util.Scanner;
import java.util.Stack;

public class DisplayStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		System.out.print("Enter the size : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements of the stack : ");
		for(int i=0;i<n;i++) {
			st.push(sc.nextInt());
		}
		System.out.println("The stack is : ");
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
	}

}
