package algorithms;

/**
 * @author: basavakanaparthi
 * on 28,Sep,2016 at 10:21 PM.
 */
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class TriesContact {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Node root = new Node('*');
        for(int a0 = 0; a0 < n; a0++)
        {
            String op = in.next();
            String contact = in.next();
            if (op.equalsIgnoreCase("add"))
                addToTrie(root, contact);
            else
                System.out.println(getPartialMatches(root, contact));
        }
//        printTrie(root);
    }
    static void printTrie(Node root)
    {
        if (root == null)
            return;
        LinkedList<Node> trie = new LinkedList<>();
        trie.add(root);
        int level = 0;
        while (!trie.isEmpty())
        {
            Node curr = trie.poll();
            //System.out.println(curr.val);
            if (curr.children != null && curr.children.size() > 0)
            {
                System.out.println("Level: " + level++);
                System.out.println(curr.children.keySet().toString());
                trie.addAll(curr.children.values());
            }
        }
    }
    static void addToTrie(Node root, String contact)
    {
        if (root == null || contact == null || contact.length() <= 0) {
            if(root != null)
                root.isComplete = true;
            return;
        }
        Node temp = root;
        for (char c: contact.toCharArray())
        {
            if (!temp.children.containsKey(c))
            {
                Node currNode = new Node(c);
                temp.children.put(c, currNode);
                temp = currNode;
            } else
                temp = temp.children.get(c);
        }
        temp.isComplete = true;
    }
    static int getPartialMatches(Node root, String contact)
    {
        if (root == null || contact == null || contact.length() == 0 || !root.children.containsKey(contact.charAt(0)))
            return 0;
        root = root.children.get(contact.charAt(0));
        int i = 0;
        for( ; i < contact.length() - 1; i++)
        {
            if ( root == null || root.val != contact.charAt(i) || !root.children.containsKey(contact.charAt(i+1)))
                return 0;
            root = root.children.get(contact.charAt(i + 1));
        }
        if (i != contact.length()-1)
            return 0;
        return getNumDecendants(root);
    }

    static int getNumDecendants(Node root)
    {
        if (root == null)
            return 0;
        LinkedList<Node> trie = new LinkedList<>();
        trie.add(root);
        int number = 0;
        while (!trie.isEmpty())
        {
            Node curr = trie.poll();
            if (curr.isComplete)
            {
                number++;
            }
            if (curr.children != null)
            {
                trie.addAll(0, curr.children.values());
            }
        }
        return number;
    }
}

class Node
{
    char val;
    HashMap<Character, Node> children;
    boolean isComplete;
    Node(char c)
    {
        this.val = c;
        children = new HashMap<>();
    }
}
