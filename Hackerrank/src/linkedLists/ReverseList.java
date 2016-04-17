/**
 * 
 */
package linkedLists;

/**
 * ReverseList.java 
 * @author Basava R.Kanaparthi(basava.08@gmail.com)
 * Created on Mar 12, 2016
 */

public class ReverseList {
	static NodeD Reverse(NodeD head)
	{
		NodeD curr = head;
		NodeD temp = null;
		NodeD next = null;
		while (curr != null)
		{
			System.out.println(curr.data);
			temp = curr.prev;
			next = curr.next;
			curr.prev = curr.next;
			curr.next = temp;
			curr = next;
		}
		if (temp != null)
			head = temp.prev;
		return head;
	}
	public static void main(String[] args)
	{
		NodeD head = null;
		head = InsertSortedList.SortedInsert(head,5);
		head = InsertSortedList.SortedInsert(head,2);
		head = InsertSortedList.SortedInsert(head,3);
		head = InsertSortedList.SortedInsert(head,1);
		head = InsertSortedList.SortedInsert(head,7);
		InsertSortedList.printList(head);
		head = Reverse(head);
		InsertSortedList.printList(head);
	}
}
