package queue;
import java.util.*;

public class RemoveEvenIndexElement {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(5);
		q.add(10);
		q.add(15);
		q.add(20);
		q.add(25);
		
		Queue<Integer> ans = new LinkedList<>();
		System.out.println("The even index element is : ");
		while(!q.isEmpty()) {
			System.out.print(q.peek() + " ");
			q.poll();
			q.poll();
		}
	}

}
