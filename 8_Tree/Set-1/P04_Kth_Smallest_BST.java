/*Implement Code in java in which we have Given the root of a binary search tree and K as input, find Kth smallest element in BST. 

For example, in the following BST, if k = 3, then the output should be 10, and if k = 5, then the output should be 14.

Approach - using Inorder 

Time Complexity : O(n)
Space Complexity : O(h)*/

class Node{
    int data;
    Node left,right;
    Node(int x){
        data = x;
        left=right=null;
    }
}
public class P04_Kth_Smallest_BST {
    static int count =0;
    static Node insert(Node root, int x){
        if(root==null)
          return new Node(x);
        if(x<root.data)
          root.left = insert(root.left, x);
        else if(x>root.data)
                root.right = insert(root.right, x);
        return root;
    }
    static Node KthSmallest(Node root, int k){
        if(root == null) return null;
        Node left = KthSmallest(root.left,k);
        if(left != null) return left;
        count++;
        if(count == k) return root;

        return KthSmallest(root.right,k);
    }
    public static void printKthSmallest(Node root , int k){
        Node res = KthSmallest(root,k);
        if(res==null)
           System.out.println("There are less than k nodes in the BST");
        else
           System.out.println("K-th Smallest Element is " + res.data);
    }
    public static void main(String[] args) {
        Node root = null;
        int keys[] = {20,8,22,4,12,10,14};
        for(int x : keys)
           root = insert(root,x);
        int k = 3;
        printKthSmallest(root,k);
    }
}
