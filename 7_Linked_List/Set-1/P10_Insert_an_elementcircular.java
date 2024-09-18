/*Insertion in the circular Linked List ;
 * 
 * Implement a code in java in which we have To insert a node in empty 
 * circular linked list, creates a new node with the given data, sets its 
 * next pointer to point to itself, and updates the last pointer to reference this new node.
 * 
 * Time Complexity : O(1)
 * Space Complexity : O(1)
 */

 
class Node{
    int data;
    Node next;
    Node(int value){
        data = value;
        next = null;
    }
}
public class P10_Insert_an_elementcircular {
    static Node insertInEmptyList(Node last , int data){
        if(last != null) return last;
        Node newNode = new Node(data);
        newNode.next = newNode;
        last = newNode;
        return last;
    }
    static void printList(Node last){
        if(last == null) return;
        Node head = last.next;
        while(true){
            System.out.print(head.data+" ");
            head = head.next;
            if(head==last.next) break;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node last = null;
        last = insertInEmptyList(last, 1);
        System.out.print("List after insertion: ");
        printList(last);
    }
}
