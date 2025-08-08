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

class S_LL{
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
	
	public int middleElement() {
		Node slow = head;
		Node fast = head;
		Node temp = head;
		if(size%2 == 1) {
			while(fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow.val;
		}
		else {
			int i = 0;
			while(i<size/2-1) {
				temp = temp.next;
				i++;
			}
			return temp.val;
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

public class MiddleElementOfTheLL {

	public static void main(String[] args) {
		S_LL list = new S_LL();
		list.insertAtTail(10);
		list.insertAtTail(20);
		list.insertAtTail(30);
		list.insertAtTail(40);
		list.insertAtTail(50);
		list.insertAtTail(60);
		list.insertAtTail(70);
		list.insertAtTail(80);
		list.display();
		int x = list.middleElement();
		System.out.println("The middle element of the LL is : " + x);
	}

}
