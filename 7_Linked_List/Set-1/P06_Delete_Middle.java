/*Implement Code in java in which we have to 
To delete a node in the middle, we must first traverse the list 
to find the node just before the one we want to delete. 
Then, adjust the pointers to bypass the node being deleted.*/

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class P06_Delete_Middle {
    public static Node deleteNode(Node head, int position){
        Node temp = head;
        Node prev = null;

        if(temp==null) return head;

        if(position == 1){
            head = temp.next;
            return head;
        }
        for(int i=0;i<position && temp!= null;i++){
            prev = temp;
            temp = temp.next;
        }
        if(temp != null){
            prev.next = temp.next;
        }else{
            System.out.println("Data Not present");
      }
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

        System.out.print("Original List: ");
        printlist(head);

        int position = 3;
        head = deleteNode(head, position);

        System.out.print("List after deletion: ");
        printlist(head);
    }
}
