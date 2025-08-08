package linkedList;

/*
class Node{
	int val;
	Node next;
	
	Node(int val){
		this.val = val;
	}
}
*/

class SinglyLLallImplementation{
	Node head;
	Node tail;
	int size;
	
	public void insertAtHead(int val) {
		Node temp = new Node(val);
		if(head == null) {
			head = tail = temp;
		}
		else {
			temp.next = head;
			head = temp;
		}
		size++;
	}
	
	public void insertAtTail(int val) {
		Node temp = new Node(val);
		if(head == null) {
			head = tail = temp;
		}
		else {
			tail.next = temp;
			tail = temp;
		}
		size++;
	}
	
	public void insertAtAnyIndex(int index,int val) {
		Node temp = new Node(val);
		if(index<0 || index>size) {
			System.out.println("Invalid index");
			return;
		}
		if(index == 0) {
			insertAtHead(val);
			return;
		}
		if(index == size) {
			insertAtTail(val);
			return;
		}
		if(head == null) {
			head = tail = temp;
		}
		else {
			Node currentNode = head;
			int i = 0;
			while(i<index-1) {
				currentNode = currentNode.next;
				i++;
			}
			temp.next = currentNode.next;
			currentNode.next = temp;
		}
		size++;
	}
	
	public void deleteFromHead() {
		if(head == null) {
			System.out.println("List is empty");
		}
		if(head == tail) {
			head = tail = null;
		}
		else {
			head = head.next;
		}
		size--;
	}
	
	public void deleteFromTail() {
		if(head == null) {
			System.out.println("List is empty");
		}
		if(head == tail) {
			head = tail = null;
		}
		else {
			Node currentNode = head;
			while(currentNode.next != tail) {
				currentNode = currentNode.next; 
			}
			currentNode.next = null;
			tail = currentNode;
		}
		size--;
	}
	
	public void deleteFromAnyIndex(int index) {
		if(index>=size || index<0) {
			System.out.println("Invalid index");
			return;
		}
		if(index == 0) {
			deleteFromHead();
			return;
		}
		if(index == size-1) {
			deleteFromTail();
			return;
		}
		else {
			Node currentNode = head;
			int i = 0;
			while(i<index-1) {
				currentNode = currentNode.next;
				i++;
			}
			currentNode.next = currentNode.next.next;
		}
		size--;
	}
	
	public int getElement(int index) {
		Node currentNode = head;
		if(index>=size || index<0) {
			System.out.println("Invalid index");
			return -1;
		}
		if(index == 0) {
			return head.val;
		}
		if(index == size-1) {
			return tail.val;
		}
		int i = 0;
		while(i<index) {
			currentNode = currentNode.next;
			i++;
		}
		return currentNode.val;
	}
	
	public void setElement(int index,int val) {
		Node currentNode = head;
		if(index>=size || index<0) {
			System.out.println("Invalid index");
			return;
		}
		if(index == 0) {
			head.val = val;
			return;
		}
		if(index == size-1) {
			tail.val = val;
			return;
		}
		int i = 0;
		while(i<index) {
			currentNode = currentNode.next;
			i++;
		}
		currentNode.val = val;
	}
	
 	public void length() {
		System.out.println("The size of the LL is : " + size);
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.println();
	}
}

public class SinglyLLQ3 {

	public static void main(String[] args) {
		SinglyLLallImplementation list = new SinglyLLallImplementation();
		list.insertAtTail(10);
		list.insertAtTail(20);
		list.insertAtTail(30);
		list.insertAtTail(40);
		list.insertAtTail(50);
		list.display();
		list.length();
		System.out.println();
		list.insertAtHead(5);
		list.display();
		list.length();
		System.out.println();
		list.insertAtAnyIndex(2, 15);
		list.display();
		list.length();
		System.out.println();
		list.deleteFromHead();
		list.display();
		list.length();
		System.out.println();
		list.deleteFromTail();
		list.display();
		list.length();
		System.out.println();
		list.deleteFromAnyIndex(2);
		list.display();
		list.length();
		System.out.println();
		int x = list.getElement(1);
		System.out.println("The element at index 1 is : " + x);
		System.out.println();
		list.setElement(2,25);
		list.display();
		list.length();
		System.out.println();
	}

}
