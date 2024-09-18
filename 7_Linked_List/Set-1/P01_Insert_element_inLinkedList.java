/*Implement Code in java in which we have to add the node in the begineeing of the linkedList.
 * 
 * Time Complexity : O(1)
 * Space Complexity : O(1)
 */

class Node{
    int data;
    Node next;
    Node(int new_data){
        data = new_data;
        next = null;
    }
}
public class P01_Insert_element_inLinkedList {
    public static Node insert(Node head , int new_data){
          Node new_node = new Node(new_data);
          new_node.next = head;
          return new_node;
    }
    public static void print(Node head){
        Node curr = head;
        while (curr != null) {
            System.out.print(" "+ curr.data);
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node (5);

        System.out.println("Original LinkedList : ");
        print(head);

        System.out.println("Afatre inserting Nodes at the front: ");
        int data = 1;
        head = insert(head, data);
        print(head);
    }
}

