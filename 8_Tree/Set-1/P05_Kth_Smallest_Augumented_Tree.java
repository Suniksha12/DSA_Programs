/*Implement a code in java in which we have to find the Kth smallest element using inorder traversal.

Time Comlexity : O(h)
Space Complexity : O(h)*/

class Node {
    int data;
    Node left, right;
    int LCount;

    Node(int x) {
        data = x;
        left = right = null;
        LCount = 0;
    }
}

public class P05_Kth_Smallest_Augumented_Tree {
    public static Node insert(Node root, int x) {
        if (root == null)
            return new Node(x);

        if (x < root.data) {
            root.left = insert(root.left, x);
            root.LCount++;
        } else if (x > root.data)
            root.right = insert(root.right, x);
        return root;
    }

    public static Node kthSmallest(Node root, int k) {
        if (root == null)
            return null;

        int count = root.LCount + 1;
        if (count == k)
            return root;
        if (count > k)
            return kthSmallest(root.left, k);

        return kthSmallest(root.right, k - count);
    }

    public static void main(String[] args) {
        Node root = null;
        int keys[] = { 20, 8, 22, 4, 12, 10, 14 };

        for (int x : keys)
            root = insert(root, x);

        int k = 4;
        Node res = kthSmallest(root, k);
        if (res == null)
            System.out.println("There are less than k nodes in the BST");
        else
            System.out.println("Kth Smallest Element is " + res.data);
    }
}
