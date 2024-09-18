/*Implement Code in java in which we have to Insert a Node after a Given Node in Linked List
If we want to insert a new node after a specific node, we first locate that node. Once we find it, 
we set the new node’s next reference to point to the node that follows the given node. 
Then, we update the given node’s next to point to the new node. 

This requires traversing the list to find the specified node.

Time complexity : O(N)
Space Complexity : O(1)
*/

class Node{
     int data;
     Node next;
     Node(int data){
        this.data = data;
        this.next= null;
     }
}
public class P02_insert_element_atspecific{
    public static Node insertAfter(Node head , int key , int newData){
        Node curr = head;
        while(curr != null){
            if(curr.data == key) break;
            curr = curr.next;
        }
        if(curr == null) return head;

        Node newNode = new Node(newData);
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }
    public static void printList(Node node){
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
       Node head = new Node(2);
       head.next = new Node(3);
       head.next.next = new Node(5);
       head.next.next.next = new Node(6);
       
       System.out.println("Original Linked List:");
       printList(head);

       int key =3, newData = 4;
       head = insertAfter(head, key, newData);
       System.out.println("Linked List after insertion: ");
       printList(head);
    }
}