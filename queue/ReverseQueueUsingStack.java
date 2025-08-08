package queue;
import java.util.*;

public class ReverseQueueUsingStack {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(5);
		q.add(10);
		q.add(15);
		q.add(20);
		q.add(25);
		
		Stack<Integer> st = new Stack<Integer>();
		while(!q.isEmpty()) {
			st.push(q.poll());
		}
		while(!st.isEmpty()) {
			q.add(st.pop());
		}
		System.out.println("The queue in reversed is : ");
		System.out.println(q);
	}

}
