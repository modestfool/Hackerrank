package balancedTrees;

import java.util.Scanner;

import static balancedTrees.Node.levelOrder;

/**
 * @author: basavakanaparthi
 * on 21,Aug,2016 at 6:28 PM.
 */

/*
Objective
    Today, we're going further with Binary Search Trees.
    Check out the Tutorial tab for learning materials and an instructional video!

Task
    A level-order traversal, also known as a breadth-first search,
    visits each level of a tree's nodes from left to right, top to bottom.
    You are given a pointer, , pointing to the root of a binary search tree.
    Complete the levelOrder function provided in your editor so that it prints the level-order traversal of the
    binary search tree.

    Hint: You'll find a queue helpful in completing this challenge.

Input Format

    The locked stub code in your editor reads the following inputs and assembles them into a BST:
    The first line contains an integer,  (the number of test cases).
    The  subsequent lines each contain an integer, , denoting the value of an element that must be added to the BST.
 */

//class Node{
//    Node left,right;
//    int data;
//    Node(int data){
//        this.data=data;
//        left=right=null;
//    }
//}
public class BSTLevelOrderTraversal {

    public static Node insert(Node root,int data){
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
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Node root=null;
        while(N-- > 0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}