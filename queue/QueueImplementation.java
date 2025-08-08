package queue;
import java.util.*;

public class QueueImplementation {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		// push or add
		q.add(5);
		q.add(10);
		q.add(15);
		q.add(20);
		q.add(25);
		System.out.println("The elements in queue is : ");
		System.out.println(q);
		
		// remove
		q.remove();
		System.out.println(q);
		
		// remove or poll
		q.poll();
		System.out.println(q);
		
		// peek
		System.out.println("The peek element is : " + q.peek());
		
		// size
		System.out.println("The size of the queue is : " + q.size());
		
		// isEmpty
		System.out.println("Is queue empty : " + q.isEmpty());
	}
}
