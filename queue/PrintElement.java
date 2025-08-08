package queue;
import java.util.*;

public class PrintElement {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(5);
		q.add(10);
		q.add(15);
		q.add(20);
		q.add(25);
		
		Queue<Integer> helper = new LinkedList<>();
		System.out.println("The queue is : ");
		while(!q.isEmpty()) {
			System.out.print(q.peek() + " ");
			helper.add(q.poll());
		}
		while(!helper.isEmpty()) {
			q.add(helper.poll());
		}
	}

}
