package queue;
import java.util.*;

public class LLImplementation {
	public static class Node{
		int val;
		Node next;
		
		public Node(int val) {
			this.val = val;
			this.next = null;
		}
	}
	
	public static class Queue{
		Node head = null;
		Node tail = null;
		int size = 0;
		
		// add
		public void add(int x) {
			Node temp = new Node(x);
			if(size == 0) {
				head = tail = temp;
			}
			else {
				tail.next = temp;
				tail = temp;
			}
			size++;
		}
		
		// peek
		public int peek() {
			if(size == 0) {
				System.out.println("Queue is empty");
				return -1;
			}
			return head.val;
		}
		
		// remove
		public void remove() {
			if(size == 0) {
				System.out.println("Queue is empty");
				return;
			}
			else {
				head = head.next;
			}
			size--;
		}
		
		// isEmpty
		public boolean isEmpty() {
			if(size == 0) {
				return true;
			}
			return false;
		}
		
		// size
		public int size() {
			return size;
		}
		
		// display
		public void display() {
			Node temp = head;
			if(size == 0) {
				System.out.println("Queue is empty");
			}
			else {
				while(temp != null) {
					System.out.print(temp.val + " ");
					temp = temp.next;
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Queue q = new Queue();
		q.add(5);
		q.add(10);
		q.add(15);
		q.add(20);
		q.add(25);
		System.out.println("The queue is : ");
		q.display();
		q.remove();
		System.out.println("The queue is : ");
		q.display();
		System.out.println("The size is : " + q.size());
		System.out.println("The peek element is : " + q.peek());
		System.out.println("Is q ueue empty : " + q.isEmpty());
		q.add(50);
		q.add(87);
		System.out.println("The queue is : ");
		q.display();
		q.remove();
		System.out.println("The queue is : ");
		q.display();
		System.out.println("The size is : " + q.size());
	}

}
