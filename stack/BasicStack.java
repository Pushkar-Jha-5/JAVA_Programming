package stack;
import java.util.Stack;

public class BasicStack {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		System.out.println("is stack empty : " + st.isEmpty());
		st.push(5);
		st.push(10);
		st.push(15);
		st.push(20);
		st.push(25);
		System.out.println("The stack size is : " + st.size());
		System.out.println("The stack is : " + st);
		System.out.println("The peek element is : " + st.peek());
		System.out.println("The poped element is : " + st.pop());
		System.out.println("The stack is : " + st);
		System.out.println("The poped element is : " + st.pop());
		System.out.println("The stack is : " + st);
		System.out.println("The stack size is : " + st.size());
		st.push(20);
		st.push(25);
		System.out.println("The stack is : " + st);
		
		// to access first element in stack
		while(st.size() > 1) {
			st.pop();
		}
		System.out.println("is stack empty : " + st.isEmpty());
		System.out.println("The peek element is : " + st.peek());
		System.out.println("The first element of stack is : " + st);
	}
}
