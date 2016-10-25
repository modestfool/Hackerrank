/**
 * 
 */
package linkedLists;

/**
 * MergePoint.java 
 * @author Basava R.Kanaparthi(basava.08@gmail.com)
 * Created on Mar 7, 2016
 */
public class MergePoint {
	int FindMergeNode(Node headA, Node headB)
	{
		int data = Integer.MIN_VALUE;
		int lenA = 0 ,lenB = 0;
		Node tempA = headA;
		Node tempB = headB;
		while(tempA != null)
		{
			tempA = tempA.next;
			lenA++;
			
		}
		while(tempB != null)
		{
			tempB = tempB.next;
			lenB++;
		}
		while(lenB-lenA > 0)
		{
			headB = headB.next;
			lenB--;
		}
		while(lenA-lenB > 0)
		{
			headA = headA.next;
			lenA--;
		}
		while(headA != null && headB != null)
		{
			if(headA.data == headB.data)
			{
				return headA.data;
			}
			headA = headA.next;
			headB = headB.next;
		}
		return -1;
	}

}
