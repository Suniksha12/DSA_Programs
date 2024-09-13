/*Implement a code in java in which we are Given a linked list. The task is to find the second last node of the linked list using a single traversal only.

Examples: 

Input : List = 1 -> 2 -> 3 -> 4 -> 5 -> NULL 
Output : 4 

Time Complexity : O(n)
Space Complexity : O(1)*/

class Node{
    int data;
    Node next;
    Node(int d){
        this.data = d;
        this.next = null;
    }
}
public class P04_Second_last_LL {
    Node start;
    P04_Second_last_LL(){
        start = null;
    }

    public void push(int data) {
        if(this.start == null) {
            Node temp = new Node(data);
            this.start = temp;
        } else {
            Node temp = new Node(data);
            temp.next = this.start;
            this.start = temp;
        }
    }

    public int findsecondlastNode(Node ptr){
        Node temp = ptr;
        if(temp==null ||temp.next == null) return -1;

        while(temp.next.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }
    public static void main(String[] args) {
        P04_Second_last_LL ll = new P04_Second_last_LL();
        ll.push(12);
        ll.push(29);
        ll.push(11);
        ll.push(23);
        ll.push(8);
        System.out.println(ll.findsecondlastNode(ll.start));
    }
}
