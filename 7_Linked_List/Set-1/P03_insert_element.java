/*implement Code in java in which we have to To insert a new node 
at a specific position, we need to traverse the list to position – 1.
 If the position is valid, we adjust the pointers similarly such that
  the next pointer of the new node points to the next of current nod 
  and next pointer of current node points to the new node.
  
  Time Complexity : O(N)
  Space Complexity: O(1)*/

class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
    this.next = null;
  }
}
public class P03_insert_element {
    public static Node insertAtPosition(Node head, int position , int data){
      Node newNode = new Node(data);
      if(position==1){
        newNode.next = head;
        head = newNode;
        return head;
      }
      Node current = head;
      for(int i=1;i<position-1 && current != null;++i){
         current = current.next;
      }
      if(current==null){
        System.out.println(
                "Position is out of bounds.");
            return head;
      }
      newNode.next = current.next;
      current.next = newNode;
      return head;
    }
   public static void printList(Node head){
    while(head != null){
      System.out.print(" " + head.data);
      head = head.next;
    }
    System.out.println();
   } 
   public static void main(String[] args) {
    Node head = new Node(3);
    head.next = new Node(5);
    head.next.next = new Node(8);
    head.next.next.next = new Node(10);

    System.out.print("Linked list before insertion:");
    printList(head);

    int data =12,pos=2;
    head = insertAtPosition(head, pos, data);
    System.out.print("Linked list after insertion of 12 at position " + pos + ":");
        printList(head);
   }
}
