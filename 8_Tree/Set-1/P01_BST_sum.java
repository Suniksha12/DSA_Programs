/*Implement Code in java in which we have been Given the root of binary 
search tree (BST) and an integer sum, the task is to find if there exist 
a pair of elements such that their sum is equal to given sum.

Example:
Input: sum = 12

bst
Output: True

Approach - Hash Set 
Time Complexity : O(n)
Space Complexity : O(n)
*/

/*
import java.util.HashSet;

class Node {
    int key;
    Node left, right;

    Node(int X) {
        key = X;
        left = right = null;
    }
}

public class P01_BST_sum {
    static boolean dfs(Node root, HashSet<Integer> set, int sum) {
        if (root == null)
            return false;

        if (set.contains(sum - root.key))
            return true;

        set.add(root.key);

        return dfs(root.left, set, sum) || dfs(root.right, set, sum);
    }

    static boolean findTarget(Node root, int sum) {
        HashSet<Integer> set = new HashSet<>();
        return dfs(root, set, sum);
    }

    public static void main(String[] args) {
        Node root = new Node(7);
        root.left = new Node(3);
        root.right = new Node(8);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.right = new Node(9);

        int sum = 12;

        if (findTarget(root, sum)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
} */

/* Approach - 2  */