package balancedTrees;

/**
 * @author: basavakanaparthi
 * on 01,Oct,2016 at 3:56 PM.
 */

import java.util.Scanner;

import static balancedTrees.Node.levelOrder;

/**
 * For the purposes of this challenge, we define a binary search tree to be a binary tree with the following ordering properties:
 * <p>
 * The  value of every node in a node's left subtree is less than the data value of that node.
 * The  value of every node in a node's right subtree is greater than the data value of that node.
 * Given the root node of a binary tree, can you determine if it's also a binary search tree?
 * <p>
 * Complete the function in your editor below, which has  parameter: a pointer to the root of a binary tree. It must return a boolean denoting whether or not the binary tree is a binary search tree. You may have to write one or more helper functions to complete this challenge.
 * <p>
 * Note: A binary tree is not a binary search if there are duplicate values.
 * <p>
 * Input Format
 * <p>
 * You are not responsible for reading any input from stdin. Hidden code stubs will assemble a binary tree and pass its root node to your function as an argument.
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * You are not responsible for printing any output to stdout.
 * Your function must return true if the tree is a binary search tree; otherwise, it must return false.
 * Hidden code stubs will print this result as a Yes or No answer on a new line.
 * <p>
 * Sample Input
 * <p>
 * tree
 * <p>
 * Sample Output
 * <p>
 * No
 */
public class CheckBST
{

    static boolean checkBST(Node root) {
        if (root == null)
            return true;
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean checkBST(Node root, int minValue, int maxValue)
    {
        if (root == null)
            return true;
        if (root.data < minValue || root.data > maxValue)
            return false;
        return checkBST(root.left, minValue, root.data -1) && checkBST(root.right, root.data+1, maxValue);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Node root=null;
        while(N-- > 0){
            int data=sc.nextInt();
            if(root == null)
                root = new Node(data);
            else
                Node.insert(root, data);
        }
        levelOrder(root);
        System.out.println(checkBST(root));
    }
}
