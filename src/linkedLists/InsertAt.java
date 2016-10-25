/**
 * 
 */
package linkedLists;

/**
 * InsertAt.java 
 * @author Basava R.Kanaparthi(basava.08@gmail.com)
 * Created on Mar 7, 2016
 */
public class InsertAt {	
	
	 static Node InsertNth(Node head, int data, int position) {
		   // This is a "method-only" submission. 
		    // You only need to complete this method.
		    Node new_node = new Node(data);
		    new_node.data = data;
		    new_node.next = null;
		    if (head == null)
		        return new_node;
		    Node prev = null, next = head;
		    while(next != null && (position > 0))
		    {
		    	prev = next;
		    	next = next.next;
		    	position--;
		    }
		    if (prev == null)
		    {
		        new_node.next = next;
		        return new_node;
		    }
		    else
		    {
		    	prev.next = new_node;
		    	new_node.next = next;
		    	return head;
		    }
		}

	 public static void main(String[] args)
	 {
		 Node head = null; //new Node();
//		 head.data = 1;
		 head = InsertNth(head, 3, 0);
//		 printList(head);
		 head = InsertNth(head, 5, 1);
//		 printList(head);
		 head = InsertNth(head, 4, 2);
//		 printList(head);
		 head = InsertNth(head, 2, 4);
//		 printList(head);
		 head = InsertNth(head, 10, 1);
		 printList(head);
		 
		 System.out.println(GetNode(head, 1));
//		 head = Reverse(head);
		 printList(head);
		 
	 }
	 public static void printList(Node head)
	 {
		 while(head != null)
		 {
			 System.out.print(head.data + "->");
			 head = head.next;
		 }
		 System.out.print("NULL" + "\n");
	 }
	 public static Node Reverse(Node head) {
		    Node curr = head;
		    Node next = null;
		    Node prev = null;
		    while(curr != null)
		    {
		       next = curr.next;
		       curr.next = prev;
		       prev = curr;
		       curr = next;

		    }
		    if (prev != null)
		    {
		        head = prev;   
		    }
		    return head;
		}
	 public static int GetNode(Node head,int n) {
	     // This is a "method-only" submission. 
	     // You only need to complete this method. 
	    Node iter = head;
	    int size = 0;
	    while(iter != null)
	        {
	        size++;
	        iter = iter.next;
	    }
	    size = size - n;
	    while(size > 1)
	    {
	        head = head.next;
	        size--;
	    }
	    return head.data;
	}
}
