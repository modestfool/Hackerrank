package linkedLists;

import java.util.Scanner;

/**
 * @author: basavakanaparthi
 * on 21,Aug,2016 at 7:57 PM.
 */
public class RemoveDuplicates {

    public static Node removeDuplicates(Node head) {
        //Write your code here
        if (head == null || head.next == null)
            return head;
        Node prev = null;
        Node cur = head;
        while(cur != null)
        {
            if (prev != null)
            {
                if (prev.data == cur.data)
                {
                    prev.next = cur.next;
                    cur = cur.next;
                    continue;
                }
            }
            prev = cur;
            cur = cur.next;
        }
        return head;
    }
    public static  Node insert(Node head,int data)
    {
        Node p=new Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
    {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }

}

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }

}
