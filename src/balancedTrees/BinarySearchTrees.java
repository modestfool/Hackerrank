package balancedTrees;

import java.util.Scanner;

/**
 * @author: basavakanaparthi
 * on 21,Aug,2016 at 2:59 PM.
 */
/*
    Objective
        Today, we're working with Binary Search Trees (BSTs).
        Check out the Tutorial tab for learning materials and an instructional video!

    Task
        The height of a binary search tree is the number of edges between the
        tree's root and its furthest leaf. You are given a pointer, root,
        pointing to the root of a binary search tree.
        Complete the getHeight function provided in your editor so that it returns the height of the
        binary search tree.

    Input Format

        The locked stub code in your editor reads the following inputs and assembles them into a
        binary search tree:
        The first line contains an integer, n, denoting the number of nodes in the tree.
        Each of the n subsequent lines contains an integer, data , denoting the value of an element
        that must be added to the BST.

    Output Format

        The locked stub code in your editor will print the integer returned by your getHeight function
         denoting the height of the BST.
*/

public class BinarySearchTrees {

    public static int getHeight(Node root) {
        //Write your code here
        if (root == null)
            return -1;
        else if (root.left == null && root.right == null)
            return 0;
        else {
            return 1 + Math.max(getHeight(root.left), getHeight(root.right));
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root.insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}