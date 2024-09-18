/*Implement Code in java in which we need to  insert a new node at a 
specific position in a circular linked list, we first check if the 
list is empty. If it is and the position is not 1 then we print an 
error message because the position doesn’t exist in the list. 
If the position is 1 then we create the new node and make it point
 to itself. If the list is not empty, we create the new node and 
 traverse the list to find the correct insertion point. If the 
 position is 1, we insert the new node at the beginning by adjusting 
 the pointers accordingly. For other positions, we traverse through
  the list until we reach the desired position and inserting the 
  new node by updating the pointers. If the new node is inserted 
  at the end, we also update the last pointer to reference the 
  new node, maintaining the circular structure of the list.
  
  Time Complexity : o(n)
  Space Complexity : O(1)*/

  class Node{
    int data;
    Node next;

    Node(int value){
        data = value;
        next = null;
    }
  }
public class P13_insert_at_specific_position {
    static Node insertAtPosition(Node last , int data , int pos) {
        if(last == null) {
            if(pos != 1){
                System.out.println("Invalid Position !");
                return last;
            }
            Node newNode = new Node(data);
            last = newNode;
            last.next = last;
            return last;
        }
        Node newNode = new Node(data);
        Node curr = last.next;

        if(pos == 1) {
            newNode.next = curr;
            last.next = newNode;
            return last;
        }

        for(int i =1;i<pos-1;++i) {
            curr= curr.next;
            if(curr == last.next){
                System.out.println("Invalid position");
                return last;
            }
        }
        newNode.next = curr.next;
        curr.next = newNode;

        if(curr == last)
           last = newNode;

        return last;
    }
    static void printList(Node last){
        if(last == null) return;

        Node head = last.next;
        while(true) {
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

        System.out.print("Original List: ");
        printList(last);

        int data =5;
        int pos = 2;
        last = insertAtPosition(last, data, pos);
        System.out.print("List after insertions: ");
        printList(last);
    }
}
