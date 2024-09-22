/*Implememt a code in java in which we have Given a Binary Search Tree, the task is to find the node with the maximum value in a BST.
tree is 20 ->22R -> 8L -> 4L -> 12R -> 10L -> 14R 
For the above tree, we start with 20, then we move right to 22. We keep on moving to the right until we see NULL. 
Since the right of 22 is NULL, 22 is the node with the maximum value.

Time Complexity : O(h)
Space Complexity : O(1)*/

public class P02_max_Node {
    static class Node {
        int data;
        Node left;
        Node right;
    };

    static Node newNode(int data) {
        Node node = new Node();
        node.data = data;
        node.right = null;
        node.left = null;
        return node;
    }

    static Node insert(Node node, int data) {
        if (node == null)
            return (newNode(data));
        else {
            if (data <= node.data)
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
            return node;
        }
    }

    static int maxValue(Node node) {
        Node current = node;
        while (current.right != null)
            current = current.right;
        return current.data;
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 4);
        insert(root, 2);
        insert(root, 1);
        insert(root, 3);
        insert(root, 6);
        insert(root, 5);

        System.out.println("maximum value in BST is " + maxValue(root));
    }
}
