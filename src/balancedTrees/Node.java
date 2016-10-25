package balancedTrees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: basavakanaparthi
 * on 01,Oct,2016 at 4:09 PM.
 */
public class Node {
    Node left,right;
    int data;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
    static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }

    static void levelOrder(Node root){
        //Write your code here
        Queue<Node> tree = new LinkedList<>();
        tree.add(root);
        while (!tree.isEmpty())
        {
            Node temp = tree.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null)
                tree.add(temp.left);
            if (temp.right != null)
                tree.add(temp.right);
        }
    }
}
