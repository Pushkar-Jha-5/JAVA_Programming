package linkedList;
import java.util.Scanner;

/*
class Node{
	int val;
	Node next;
	
	Node(int val){
		this.val = val;
	}
}
*/

class SLL{
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
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void length() {
		System.out.println("The length of the LL is : " + size);
	}
} 

public class LL_ImplementationUsingInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SLL list = new SLL();
		System.out.println("Enter the elements of the LL : ");
		while(true) {
			int val = sc.nextInt();
			if(val == -1) {
				break;
			}
			list.insertAtEnd(val);
		}
		list.display();
		list.length();
	}

}
