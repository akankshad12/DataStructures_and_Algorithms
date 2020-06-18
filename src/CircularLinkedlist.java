import java.util.*;

		
public class CircularLinkedlist {
	static class Node{
		int element;
		Node next;
		
		Node(int d)
		{
			this.element = element;
			
		}
		
		public int size = 0;
		public Node head = null;
		public Node tail = null;

		public static void main (String[] args)
		{
			
			
		}
	public void print() {
		System.out.println("The list so far is: ");
		
		Node temp = head;
		do {
			System.out.println(" "+ temp.element);
			temp = temp.next;
		}
		while(temp!= head);
		System.out.println();
		
	}
	
	}
	
	
}
