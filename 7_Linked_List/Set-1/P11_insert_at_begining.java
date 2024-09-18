/*implement a code in java in which we have to insert a new node at 
the beginning of a circular linked list, we first create the new node
 and allocate memory for it. If the list is empty (indicated by the 
 last pointer being NULL), we make the new node point to itself. 
 If the list already contains nodes then we set the new node’s next pointer 
 to point to the current head of the list (which is last->next), 
 and then update the last node’s next pointer to point to the new node. 
 This maintains the circular structure of the list. 
 
 Time Complexity : O(1)
 Space complexity : O(1)*/

class Node{
    int data;
    Node next;

    Node(int value){
        data = value;
        next = null;
    }
}
public class P11_insert_at_begining {
    public static Node insert(Node last , int value){
        Node newNode = new Node(value);
        if(last == null){
            newNode.next = newNode;
            return newNode;
        }
        newNode.next = last.next;
        last.next = newNode;

        return last;
    }
    public static void printList(Node last){
        if(last == null)return;

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

        System.out.println("Original List: ");
        printList(last);

        last = insert(last,5);
        System.out.println("List after Inserting 5 at the beginning : ");
        printList(last);
    }
}
