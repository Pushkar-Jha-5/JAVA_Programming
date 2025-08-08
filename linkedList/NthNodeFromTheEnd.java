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

class NthNode_SLL{
	Node head;
	Node tail;
	int size;
	
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
	
	public int nthNodeFromTheEnd(int n) {
		Node temp = head;
		for(int i=1;i<size-n+1;i++) {
			temp = temp.next;
		}
		return temp.val;
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

public class NthNodeFromTheEnd {

	public static void main(String[] args) {
		NthNode_SLL list = new NthNode_SLL();
		list.insertAtTail(10);
		list.insertAtTail(20);
		list.insertAtTail(30);
		list.insertAtTail(40);
		list.insertAtTail(50);
		list.display();
		int x = list.nthNodeFromTheEnd(4);
		System.out.println("The element at position 4 from the end is : " + x);
	}

}
