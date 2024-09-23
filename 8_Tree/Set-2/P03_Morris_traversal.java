/*Implement a code in java in which we have have to traverse a BST max sum using 
 * Morris traversal.
 * 
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class P03_Morris_traversal {
    public static int findMaxNode(TreeNode root) {
        int max_val = -Integer.MAX_VALUE;
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left == null) {
                max_val = Math.max(max_val, curr.val);
                curr = curr.right;
            } else {
                TreeNode pred = curr.left;
                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }
                if (pred.right == null) {
                    pred.right = curr;
                    curr = curr.left;
                } else {
                    pred.right = null;
                    max_val = Math.max(max_val, curr.val);
                    curr = curr.right;
                }
            }
        }
        return max_val;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(7);
        root.right = new TreeNode(10);
        root.right.right = new TreeNode(14);
        root.right.right.left = new TreeNode(13);

        int max_val = findMaxNode(root);
        System.out.println(
                "The node with maximum value in the binary search tree is "
                        + max_val);
    }
}
