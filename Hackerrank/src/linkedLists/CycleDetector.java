/**
 * 
 */
package linkedLists;

import java.util.HashSet;
import java.util.Set;

/**
 * CycleDetector.java 
 * @author Basava R.Kanaparthi(basava.08@gmail.com)
 * Created on Mar 7, 2016
 */
public class CycleDetector {
	static int HasCycle(Node head) {
		Set <Node> nodes = new HashSet<>();
		while(head != null )
		{
			if(nodes.contains(head))
				return 1;
			else
				nodes.add(head);
			head = head.next;
		}
		return 0;
	}
	
	static int HasCycleOpt(Node head){
		Node tortoise = head;
		Node hare = head;

		while(hare != null && hare.next != null)
		{
			tortoise = tortoise.next;
			hare = hare.next.next;
			
			if(hare == tortoise)
				return 1;
		}
		return 0;
	}
	
	public static void main (String [] args)
	{
		Node head = null;
		head = InsertAt.InsertNth(head, 3, 0);
		head = InsertAt.InsertNth(head, 5, 1);
		head = InsertAt.InsertNth(head, 4, 2);
		head = InsertAt.InsertNth(head, 2, 4);
		head = InsertAt.InsertNth(head, 3, 4);
		
		InsertAt.printList(head);
		
		System.out.println(HasCycleOpt(head));
	}
}
