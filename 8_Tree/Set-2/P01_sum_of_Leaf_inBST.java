/*Implement a code in java in which we have been given a binary tree,
 * and finding the seum of all leaf nodes.
 * 
 * Examples: 
 

Input : 
        1
      /   \
     2     3
    / \   / \
   4   5 6   7
          \
           8
Output :
Sum = 4 + 5 + 8 + 7 = 24

Time Complexity :O(N)
Space Complexity : O(N)
*/

public class P01_sum_of_Leaf_inBST {
  static class Node {
    int data;
    Node left, right;

    Node(int data) {
      this.data = data;
      left = null;
      right = null;
    }
  }

  static int sum;

  static void leafSum(Node root) {
    if (root == null)
      return;
    if (root.left == null && root.right == null)
      sum += root.data;
    leafSum(root.right);
    leafSum(root.left);
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right = new Node(3);
    root.right.right = new Node(7);
    root.right.left = new Node(6);
    root.right.left.right = new Node(8);

    sum = 0;
    leafSum(root);
    System.out.println(sum);
  }
}