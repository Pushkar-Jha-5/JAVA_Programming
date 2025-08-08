package stack;
import java.util.Stack;
import java.util.Scanner;

public class InputStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		System.out.print("Enter the size : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements of stack : ");
		for(int i=0;i<n;i++) {
			st.push(sc.nextInt());
		}
		System.out.println("The elements of the stack is : " + st);
	}

}
