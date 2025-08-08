package stack;
import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		Stack<Integer> st1 = new Stack<>();
		st1.push(5);
		st1.push(10);
		st1.push(15);
		st1.push(20);
		st1.push(25);
		System.out.println("The original stack is : " + st1);
		
		Stack<Integer> st2 = new Stack<>();
		while(!st1.isEmpty()) {
			st2.push(st1.pop());
		}
		System.out.println("The reversed stack is : " + st2);
	}
	
}
