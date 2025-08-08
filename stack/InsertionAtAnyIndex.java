package stack;
import java.util.Scanner;
import java.util.Stack;

public class InsertionAtAnyIndex {

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
		System.out.print("Enter the position : ");
		int pos = sc.nextInt();
		while(st.size() >= pos) {
			temp.push(st.pop());
		}
		System.out.print("Enter the element to be pushed : ");
		int x = sc.nextInt();
		st.push(x);
		while(temp.size() > 0) {
			st.push(temp.pop());
		}
		System.out.println("Stack is : ");
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
	}

}
