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

class Singly_LL{
	Node head;
	Node tail;
	int size;
	
	public void insertAtEnd(int val) {
		Node temp = new Node(val);
		if(head == null) {
			head = tail =temp;
		}
		else {
			tail.next = temp;
			tail = temp;
		}
		size++;
	}
	
	public void deleteFromHead() {
		if(head == tail) {
			head = tail = null;
		}
		else {
			head = head.next;
		}
		size--;
	}
	
	public void deleteFromTail() {
		if(head == tail) {
			head = tail = null;
		}
		else {
			Node temp = head;
			while(temp.next != tail) {
				temp = temp.next;
			}
			temp.next = null;
			tail = temp;
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
			Node temp = head;
			int i = 0;
			while(i<index-1) {
				temp = temp.next;
				i++;
			}
			temp.next = temp.next.next;
		}
		size--;
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

public class DeletionInLL {

	public static void main(String[] args) {
		Singly_LL list = new Singly_LL();
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtEnd(40);
		list.insertAtEnd(50);
		list.insertAtEnd(60);
		list.insertAtEnd(70);
		list.insertAtEnd(80);
		list.insertAtEnd(90);
		list.insertAtEnd(98);
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
		list.deleteFromAnyIndex(3);
		list.display();
		list.length();
		System.out.println();
		
	}

}
