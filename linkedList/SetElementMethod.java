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

class LLSingly{
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
	
	public void setElement(int index,int val) {
		if(index>=size || index<0) {
			System.out.println("Invalid index");
			return;
		}
		if(index == 0) {
			head.val = val;
		}
		if(index == size-1) {
			tail.val = val;
		}
		else {
			Node currentNode = head;
			int i = 0;
			while(i<index) {
				currentNode = currentNode.next;  
				i++;
			}
			currentNode.val = val;
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

public class SetElementMethod {

	public static void main(String[] args) {
		LLSingly list = new LLSingly();
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtEnd(40);
		list.insertAtEnd(50);
		list.display();
		System.out.println();
		list.setElement(2,12);
		System.out.println("The linked list after set element at index 2 is : ");
		list.display();
		System.out.println();
		list.setElement(1,25);
		System.out.println("The linked list after set element at index 1 is : ");
		list.display();
		System.out.println();
	}

}
