/*Implement a code in java in which we are Given a linked list, the task is to delete the Second last node of the given linked list.

Examples:  

Input: 1 -> 2 -> 3 -> 4 -> 5 -> NULL
Output: 1 -> 2 -> 3 -> 5 -> NULL 

Time Complexity : O(n)
Space Complexity : O(1)*/

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class P05_Deletion_Second_last {
    public static Node remove(Node head){
        if(head==null || head.next == null){
            return head;
        }

        if(head.next.next == null){
            head = head.next;
            return head;
        }
        Node prevtosecondLast = head;
        while(prevtosecondLast.next.next.next != null) {
            prevtosecondLast = prevtosecondLast.next;
        }
        prevtosecondLast.next = prevtosecondLast.next.next;
        return head;
    }
    public static void printList(Node head){
        while(head != null) {
            System.out.print(head.data + "->");
            head= head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List: ");
        printList(head);

        head = remove(head);

        System.err.println("List after removing the second last node: ");
        printList(head);
    }
}
