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

class SinglyList{
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
	
	public int getElement(int index) {
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
		else {
			Node currentNode = head;
			int i = 0;
			while(i<index) {
				currentNode = currentNode.next;
				i++;
			}
			return currentNode.val;
		}
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

public class GetElementMethod {

	public static void main(String[] args) {
		SinglyList list = new SinglyList();
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtEnd(40);
		list.insertAtEnd(50);
		list.display();
		int x = list.getElement(2);
		System.out.println("The element at index 2 is : " + x);
		System.out.println();
		list.insertAtEnd(60);
		list.insertAtEnd(70);
		list.insertAtEnd(80);
		list.insertAtEnd(90);
		list.insertAtEnd(98);
		list.display();
		x = list.getElement(7);
		System.out.println("The element at index 7 is : " + x);
		System.out.println();
	}

}
