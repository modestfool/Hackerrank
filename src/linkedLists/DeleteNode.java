/**
 * 
 */
package linkedLists;
/**
 * DeleteNode.java 
 * @author Basava R.Kanaparthi(basava.08@gmail.com)
 * Created on Mar 7, 2016
 */
public class DeleteNode {
	static Node Delete(Node head, int position)
	{
		if (head == null)
		{
			return null;
		}
		Node temp = head, prev = null;
		while (temp != null && position > 0)
		{
			prev = temp;
			temp = temp.next;
			position--;
		}
		if (prev != null)
		{
			if(temp != null)
				prev.next = temp.next;
		}
		else
		{
			head = head.next;
		}
		return head;
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
		
		head = Delete(head, 6);
		InsertAt.printList(head);
	}
}