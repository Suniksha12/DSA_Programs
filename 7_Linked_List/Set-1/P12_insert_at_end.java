/*Implement Code in java in which we have to To insert a new node at 
the end of a circular linked list, we first create the new node and 
allocate memory for it. If the list is empty (mean, last or tail 
pointer being NULL), we initialize the list with the new node and 
making it point to itself to form a circular structure. If the list 
already contains nodes then we set the new node’s next pointer to 
point to the current head (which is tail->next), then update the 
current tail’s next pointer to point to the new node. Finally, 
we update the tail pointer to the new node. This will ensure that 
the new node is now the last node in the list while maintaining the 
circular linkage.

Time Complexity : O(1)
Space Complexity : O(1)*/

class Node{
    int data;
    Node next;
    Node(int value){
        data = value;
        next = null;
    }
}
public class P12_insert_at_end {
    static Node insertEnd(Node tail , int value){
        Node newNode = new Node(value);
        if(tail==null) {
            tail = newNode;
            newNode.next = newNode;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        return tail;
    }
    static void printList(Node last){
        if(last == null) return;
        Node head = last.next;
        while(true){
            System.out.print(head.data + " ");
            head = head.next;
            if(head == last.next) break;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node first = new Node(2);
        first.next = new Node(3);
        first.next.next = new Node(4);

        Node last = first.next.next;
        last.next = first;

        System.out.println("Original list:");
        printList(last);

        last = insertEnd(last,5);
        last = insertEnd(last, 6);

        System.out.println("List after inserting 5 and 6: ");
        printList(last);
    }
}
