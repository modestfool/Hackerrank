/**
 * 
 */
package linkedLists;

/**
 * InsertSortedList.java 
 * @author Basava R.Kanaparthi(basava.08@gmail.com)
 * Created on Mar 8, 2016
 */
public class InsertSortedList {
	public static NodeD SortedInsert(NodeD head,int data) {
		  NodeD new_node = new NodeD();
		  new_node.data = data;
		  new_node.next = null;
		  new_node.prev  = null;
		  if (head == null || new_node.data <= head.data)
		  {
			  new_node.next = head;
			  if (head != null)
				  head.prev = new_node;
		      head = new_node;
		  }
		  else 
		  {
			  NodeD temp = head;
			  while (temp.next != null && temp.next.data < new_node.data)  
			  {
			      temp = temp.next;
			  }
			  	new_node.next = temp.next;
				new_node.prev = temp;
			  	if(temp.next != null)
			  		temp.next.prev = new_node;
			  	temp.next = new_node;
			  	
		   }
		  printList(head);
		  System.out.println();
		       return head;
		  
	}
	
	public static void main(String[] args)
	{
		NodeD head = null;
		head = SortedInsert(head,5);
		head = SortedInsert(head,2);
		head = SortedInsert(head,3);
		head = SortedInsert(head,1);
		head = SortedInsert(head,7);
		head = SortedInsert(head,9);
//		printList(head);
	}
	 public static void printList(NodeD head)
	 {
		 while(head != null)
		 {
			 if(head.prev == null)
				 System.out.print("NULL<-");
			 else
				 System.out.print(head.prev.data + "<-");
//			 System.out.print(head.data + "->");
			 head = head.next;
		 }
//		 System.out.print("NULL" + "\n");
	 }
}

class NodeD{
	int data;
	NodeD next;
	NodeD prev;
}
