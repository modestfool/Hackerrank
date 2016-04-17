/**
 * 
 */
package linkedLists;

import java.util.Stack;

/**
 * ReversePrint.java 
 * @author Basava R.Kanaparthi(basava.08@gmail.com)
 * Created on Mar 7, 2016
 */
public class ReversePrint {
	static void Reverse(Node head) {
		  // This is a "method-only" submission. 
		  // You only need to complete this method. 
			Stack<Integer> listElements = new Stack<>();
			while(head != null)
			{
				listElements.push(head.data);
				head = head.next;
			}
			while(!listElements.isEmpty())
			{
				System.out.println(listElements.pop());
			}
		}
	
	public static void main (String[] args)
	{
		Node head = null;
		head = InsertAt.InsertNth(head, 3, 0);
		head = InsertAt.InsertNth(head, 5, 1);
		head = InsertAt.InsertNth(head, 4, 2);
		head = InsertAt.InsertNth(head, 2, 4);
		head = InsertAt.InsertNth(head, 10, 1);
		InsertAt.printList(head);
		
		Reverse(head);
//		InsertAt.printList(head);
	}
}
