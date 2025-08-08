package stack;

public class StackImplementationUsingArray {
	
	public static class Stack{
		public int[] arr = new int[50];
		int index = 0;
		
		// push
		void push(int x) {
			if(isFull()) {
				System.out.println("Stack is full");
				return;
			}
			else {
				arr[index] = x;
				index++;
			}
		}
		
		// peek
		int peek() {
			if(isEmpty()) {
				System.out.println("Stack is empty");
				return -1;
			}
			else {
				return arr[index-1];
			}
		}
		
		// display
		void display() {
			for(int i=0;i<index;i++) {
				System.out.println(arr[i]);
			}
		}
		
		// size
		int size() {
			return index;
		}
		
		// isEmpty
		boolean isEmpty() {
			if(index == 0) {
				return true;
			}
			return false;
		}
		
		// isFull
		boolean isFull() {
			if(index == arr.length) {
				return true;
			}
			return false;
		}
		
		// pop
		void pop() {
			if(isEmpty()) {
				System.out.println("Stack is empty");
			}
			else {
				index--;
			}
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
