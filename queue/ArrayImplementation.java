package queue;
import java.util.*;

public class ArrayImplementation {
	public static class Queue{
		int front = -1;
		int rear = -1;
		int size = 0;
		int[] arr = new int[50];
		
		// add
		public void add(int x) {
			if(rear == arr.length-1) {
				System.out.println("Queue is full");
				return;
			}
			if(front == -1 && rear == -1) {
				front = rear = 0;
				arr[rear] = x;
			}
			else {
				rear++;
				arr[rear] = x;
			}
			size++;
		}
		
		// remove
		public void remove() {
			if(size == 0) {
				System.out.println("Queue is empty");
				return;
			}
			if(front == 0 && rear == 0) {
				front = rear = -1;
			}
			else {
				front++;
			}
			size--;
		}
		
		// peek
		public int peek() {
			if(size == 0) {
				System.out.println("Queue is empty");
				return -1;
			}
			return arr[front];
		}
		
		// isEmpty
		public boolean isEmpty() {
			if(size == 0) {
				return true;
			}
			return false;
		}
		
		// display
		public void display() {
			if(size == 0) {
				System.out.println("Queue is empty");
				return;
			}
			else {
				for(int i=front;i<=rear;i++) {
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();
		}
		
		// size
		public int size() {
			return size;
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
		System.out.println("The size is : " + q.size());
		q.display();
		System.out.println("The peek element is : " + q.peek());
		System.out.println("Is queue empty : " + q.isEmpty());
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
