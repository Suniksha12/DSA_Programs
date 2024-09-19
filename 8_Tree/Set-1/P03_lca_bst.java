/*Implement a code in java in which we have been Given two values n1 and n2 
in a Binary Search Tree, find the Lowest Common Ancestor (LCA). 
You may assume that both values exist in the tree. 
The lowest common ancestor between two nodes n1 and n2 is defined as the 
lowest node that has both n1 and n2 as descendants (where we allow a node 
to be a descendant of itself). In other words, the LCA of n1 and n2 is 
the shared ancestor of n1 and n2 that is located farthest from the root 
[i.e., closest to n1 and n2]. 

Input: LCA of 10 and 14
Output:  12
Explanation: 12 is the closest node to both 10 and 14 
which is a ancestor of both the nodes.

Approach - 1 Recursive 
Time Complexity : O(h)
Space Complexity : O(h)*/

/*
class Node {
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class P03_lca_bst {
    Node root;
    Node lca(Node node, int n1, int n2)
    {
        if (node == null)
            return null;
        if (node.data > n1 && node.data > n2)
            return lca(node.left, n1, n2);
        if (node.data < n1 && node.data < n2)
            return lca(node.right, n1, n2);

        return node;
    }
    public static void main(String args[])
    {
        P03_lca_bst tree = new P03_lca_bst();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        int n1 = 10, n2 = 14;
        Node t = tree.lca(tree.root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2
                           + " is " + t.data);

        n1 = 14;
        n2 = 8;
        t = tree.lca(tree.root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2
                           + " is " + t.data);

        n1 = 10;
        n2 = 22;
        t = tree.lca(tree.root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2
                           + " is " + t.data);
    }
}
*/