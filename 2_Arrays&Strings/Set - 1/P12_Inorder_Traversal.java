/* Implement code in java to find the inorder traversal
 * of the binary Tree Given 
 * Input:
 *      1
 *   /    \
 * 3        2
 * 
 * output : 3 1 2
 * 
 * Inorder - left -> root -> right
 * 
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */

import java.util.ArrayList;
class Node {
    int data;
    Node left,right;
    Node(int item) {
        data= item;
        left = right = null;
    }
}
public class P12_Inorder_Traversal {
    ArrayList<Integer> inorder(Node root){
          ArrayList<Integer> res = new ArrayList<>();
          if(root == null) return res;

          res.addAll(inorder(root.left));
          res.add(root.data);
          res.addAll(inorder(root.right));

          return res;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        P12_Inorder_Traversal tree = new P12_Inorder_Traversal();
        ArrayList<Integer> result = tree.inorder(root);

        for(int val : result) {
            System.out.print(val + " ");
        }
    }
}
