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

class SinglyLL{
	Node head;
	Node tail;
	int size;
	
	public void insertAtEnd(int val) {
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
	
	public void insertAtBegining(int val) {
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
	
	public void insertAtAnyIndex(int index,int val) {
		Node temp = new Node(val);
		if(index == 0) {
			insertAtBegining(val);
			return;
		}
		if(index == size) {
			insertAtEnd(val);
			return;
		}
		if(index>size || index<0) {
			System.out.println("Invalid index");
			return;
		}
		if(head == null) {
			head = tail = null;
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
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void length() {
		System.out.println("The size of the linked list is : " + size);
	}
}

public class ImplementationOfLL {

	public static void main(String[] args) {
		SinglyLL list = new SinglyLL();
		list.length();
		System.out.println();
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.display();
		list.length();
		System.out.println();
		list.insertAtEnd(30);
		list.insertAtEnd(40);
		list.insertAtEnd(50);
		list.display();
		list.length();
		System.out.println();
		list.insertAtEnd(60);
		list.display();
		list.length();
		System.out.println();
		list.insertAtBegining(5);
		list.display();
		list.length();
		System.out.println();
		list.insertAtAnyIndex(2, 18);
		list.display();
		list.length();
		System.out.println();
		list.insertAtAnyIndex(5, 32);
		list.display();
		list.length();
		System.out.println();
	}

}
