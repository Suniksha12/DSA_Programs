/*Implement Code in java in which we have to find the diameter/width of a tree , which it is definedas te number
of nodes on the longest pasth between any two node.

Approach - 1 Naive Approach 

Time Complexity : O(n^2)
Space Conplexity : O(n)*/

/*
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class P02_BST_diameter {
    Node root;

    int diameter(Node root) {
        if (root == null)
            return 0;
        int lheight = height(root.left);
        int rheight = height(root.right);

        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);

        return Math.max(lheight + rheight + 1, Math.max(ldiameter, rdiameter));
    }

    int diameter() {
        return diameter(root);
    }

    static int height(Node node) {
        if (node == null)
            return 0;
        return (1 + Math.max(height(node.left), height(node.right)));
    }

    public static void main(String[] args) {
        P02_BST_diameter tree = new P02_BST_diameter();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("The diameter of given binary tree is : " + tree.diameter());
    }
} */

/*Approach - 2 Efficient Approach
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 */

class Node {
    Node left, right;
    int data;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class Height {
    int h;
}

class P02_BST_diameter {
    Node root;

    int diameter(Node root, Height height) {
        Height lh = new Height(), rh = new Height();
        if (root == null) {
            height.h = 0;
            return 0;
        }
        int ldiameter = diameter(root.left, lh);
        int rdiameter = diameter(root.right, rh);

        height.h = Math.max(lh.h, rh.h) + 1;

        return Math.max(lh.h + rh.h + 1, Math.max(ldiameter, rdiameter));
    }

    int diameter() {
        Height height = new Height();
        return diameter(root, height);
    }

    static int height(Node node) {
        if (node == null)
            return 0;
        return (1 + Math.max(height(node.left), height(node.right)));
    }

    public static void main(String[] args) {
        P02_BST_diameter tree = new P02_BST_diameter();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("The diameter of given binary tree is: " + tree.diameter());
    }
}