class Node{
    int data;
    Node left,right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Max_level {
    int max_level;
}

class binary_tree {
    Node root;
    Max_level = new Max_level();
    void rightViewUtil(Node node, int level, Max_level max_level) {
        if(node == null)
           return;
        if(max_level.max_level < level) {
            System.out.print(node.data + " ");
            
        }
    }
}
public class tree {
    
}
