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

/* Approach - 2 Using Inorder Traversal and Two pointers
 * 
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 */

import java.util.List;
import java.util.ArrayList;
class Node{
    int key;
    Node left,right;
    Node(int x){
        key = x;
        left = right = null;
    }
}
public class P01_BST_sum {
    static void inOrderTraversal(Node root , List<Integer> arr) {
        if(root == null) return;

        inOrderTraversal(root.left, arr);
        arr.add(root.key);
        inOrderTraversal(root.right, arr);
    }
    static boolean findTarget(Node root, int sum) {
        List<Integer> arr = new ArrayList<>();
        inOrderTraversal(root, arr);

        int left =0,right = arr.size() - 1;

        while(left < right) {
            int currentSum = arr.get(left) + arr.get(right);
            if(currentSum == sum)
               return true;
            else if(currentSum < sum)
                    left++;
                else
                    right--;
        }
        return false;
    }
public static void main(String[] args) {
    Node root = new Node(7);
    root.left = new Node(3);
    root.right = new Node(8);
    root.left.left = new Node(2);
    root.left.right = new Node(4);
    root.right.right = new Node(9);

    int sum = 12;

    if(findTarget(root, sum)){
        System.out.println("True");
    } else {
        System.out.println("False");
    }
}
}