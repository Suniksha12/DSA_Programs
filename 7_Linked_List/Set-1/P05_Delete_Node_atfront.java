/*Implement a java Code Deletion at the Beginning operation involves 
removing the first node of the linked list.

To perform the deletion at the beginning of Linked List, 
we need to change the head pointer to point to the second node. 
If the list is empty, there’s nothing to delete. 

Time Complexity : O(1)
Space Compelxity : O(1)*/

class Node{
    int data;
    Node next;

    Node(int value){
        data = value;
        next = null;
    }
}
public class P05_Delete_Node_atfront {
    public static Node deleteNode(Node head){
        if(head == null) return null;
        Node temp = head;
        head = head.next;
        temp = null;
        return head;
    }
    public static void printlist(Node head){
        while (head!=null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original list: ");
        printlist(head);
        head = deleteNode(head);
        System.out.println("List after deleting the head: ");
        printlist(head);
    }
}
