package stack;

public class StackImplementationUsingLL {
	
	public static class Node{
		int val;
		Node next;
		
		Node(int val){
			this.val = val;
			this.next = null;
		}
	}
	
	public static class Stack{
		Node head = null;
		int size = 0;
		
		// push
		void push(int x) {
			Node temp = new Node(x);
			temp.next = head;
			head = temp;
			size++;
		}
		
		// size
		int size() {
			return size;
		}
		
		// pop
		void pop() {
			if(isEmpty()) {
				System.out.println("Stack is empty");
			}
			else {
				head = head.next;
				size--;
			}
		}
		
		// peek
		int peek() {
			if(isEmpty()) {
				System.out.println("Stack is empty");
				return -1;
			}
			else {
				return head.val;
			}
		}
		
		// isEmpty
		boolean isEmpty() {
			if(head == null) {
				return true;
			}
			return false;
		}
		
		// display
		void display() {
			displayRec(head);
		}
		void displayRec(Node h) {
			if(h == null) {
				return;
			}
			displayRec(h.next);
			System.out.println(h.val);
		}
	}

	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(5);
		st.push(10);
		st.push(15);
		st.push(20);
		st.push(25);
		System.out.println("The peek element is : " + st.peek());
		st.pop();
		System.out.println("The peek element is : " + st.peek());
		System.out.println("The stack is : ");
		st.display();
		st.push(87);
		st.push(57);
		System.out.println("The stack is : ");
		st.display();
		System.out.println("The peek element is : " + st.peek());
		st.pop();
		System.out.println("The stack is : ");
		st.display();
		System.out.println("The peek element is : " + st.peek());
		System.out.println("The size is : " + st.size());
	}

}
