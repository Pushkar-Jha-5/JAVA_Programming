package queue;
import java.util.*;

public class CircularQueue {
	public static class Queue{
		int front = -1;
		int rear = -1;
		int size = 0;
		int[] arr = new int[50];
		
		// add
		public void add(int x) {
			if(size == arr.length) {
				System.out.println("Queue is full");
				return;
			}
			else if(size == 0) {
				front = rear = 0;
				arr[rear] = x;
			}
			else if(rear < arr.length-1) {
				rear++;
				arr[rear] = x;
			}
			else if(rear == arr.length-1) {
				rear = 0;
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
			else {
				if(front == arr.length-1) {
					front = 0;
				}
				else {
					front++;
				}
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
		
		// display
		public void display() {
			if(size == 0) {
				System.out.println("Queue is empty");
				return;
			}
			else if(front <= rear){
				for(int i=0;i<=rear;i++) {
					System.out.print(arr[i] + " ");
				}
			}
			else {
				for(int i=front;i<arr.length;i++) {
					System.out.print(arr[i] + " ");
				}
				for(int i=0;i<=rear;i++) {
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();
		}
		
		// size
		public int size() {
			return size;
		}
		
		// isEmpty
		public boolean isEmpty() {
			if(size == 0) {
				return true;
			}
			return false;
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
		System.out.println("Is queue empty : " + q.isEmpty());
		System.out.println("The peek element is : " + q.peek());
		q.add(57);
		System.out.println("The queue is : ");
		q.display();
	}

}
