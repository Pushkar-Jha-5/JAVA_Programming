package queue;
import java.util.*;
// it use doubly LL
public class DeQueueUsingLL {
	public static class Node{
		int val;
		Node next;
		Node prev;
		
		Node(int val){
			this.val = val;
			this.next = null;
			this.prev = null;
		}
	}
	
	public static class DeQueue{
		Node front = null;
		Node rear = null;
		int size = 0;
		
		// isEmpty
		public boolean isEmpty() {
			if(size == 0) {
				return true;
			}
			return false;
		}
		
		// size
		public int size() {
			if(size == 0) {
				System.out.println("Queue is empty");
				return -1;
			}
			return size;
		}
		
		// insertAtFront
		public void insertAtFront(int x) {
			Node newNode = new Node(x);
			if(front == null) {
				front = rear = newNode;
			}
			else {
				newNode.next = front;
				front.prev = newNode;
				front = newNode;
			}
			size++;
		}
		
		// insertAtRear
		public void insertAtRear(int x) {
			Node newNode = new Node(x);
			if(rear == null) {
				front = rear = newNode;
			}
			else {
				rear.next = newNode;
				newNode.prev = rear;
				rear = newNode;
			}
			size++; 
		}
		
		// deleteFromFront
		public void deleteFromFront() {
			if(size == 0) {
				System.out.println("Queue is empty");
				return;
			}
			else {
				Node temp = front;
				front = front.next;
				front.prev = null;
				temp.next = null;
			}
			size--;
		}
		
		// deleteFromRear
		public void deleteFromRear() {
			if(size == 0) {
				System.out.println("Queue is empty");
				return;
			}
			else {
				Node temp = rear;
				rear = rear.prev;
				rear.next = null;
				temp.prev = null;
			}
			size--;
		}
		
		// getFront
		public int getFront() {
			if(size == 0) {
				System.out.println("Queue is empty");
				return -1;
			}
			else {
				return front.val;
			}
		}
		
		// getRear
		public int getRear() {
			if(size == 0) {
				System.out.println("Queue is empty");
				return -1;
			}
			else {
				return rear.val;
			}
		}
		
		// display
		public void display() {
			Node temp = front;
			while(temp != null) {
				System.out.print(temp.val + " ");
				temp = temp.next;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		DeQueue dq = new DeQueue();
		dq.insertAtRear(5);
		dq.insertAtRear(10);
		dq.insertAtRear(15);
		dq.insertAtRear(20);
		dq.insertAtRear(25);
		System.out.println("The queue is : ");
		dq.display();
		dq.insertAtFront(55);
		dq.insertAtFront(57);
		System.out.println("The queue is : ");
		dq.display();
		dq.deleteFromFront();
		dq.deleteFromRear();
		System.out.println("The queue is : ");
		dq.display();
		System.out.println("The front element is : " + dq.getFront());
		System.out.println("The rear element is : " + dq.getRear());
		System.out.println("Is queue empty : " + dq.isEmpty());
		System.out.println("The size of the queue is : " + dq.size());
		dq.insertAtFront(100);
		dq.deleteFromRear();
		System.out.println("The queue is : ");
		dq.display();
	}

}
