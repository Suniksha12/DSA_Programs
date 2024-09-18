/*Implement Code in java inw hich we have toperform the deletion 
at the end of Linked List, we need to traverse the list to find 
the second last node, then set its next pointer to null. 
If the list is empty then there is no node to delete or has only 
one node then point head to null. */

class Node{
     int data;
     Node next;
     Node(int data){
        this.data = data;
        this.next = null;
     }
}
public class P07_Delete_end {
    public static Node removaLastNode(Node head){
         if(head==null){
            return null;
         }
         Node secondLast = head;
         while(secondLast.next.next != null){
            secondLast = secondLast.next;
         }
         secondLast.next = null;
         return head;
    }
    public static void printlist(Node head){
        while(head != null){
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

        System.out.print("Original list: ");
        printlist(head);

        head = removaLastNode(head);

        System.out.print("List after removing the last node: ");
        printlist(head);
    }
}
