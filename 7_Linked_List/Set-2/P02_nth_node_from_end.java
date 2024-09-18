/*Implement a Code in java in which we have been Given a Linked List of M nodes and a number N,
 find the value at the Nth node from the end of the Linked List. 
 If there is no Nth node from the end, print -1.

Examples:

Input: 1 -> 2 -> 3 -> 4, N = 3
Output: 2
Explanation: Node 2 is the third node from the end of the linked list.

Input: 35 -> 15 -> 4 -> 20, N = 4
Output: 35
Explanation: Node 35 is the fourth node from the end of the linked list. 

Approach -1 Naive Approach 

Time Complexity : O(m)
Space Complexity : O(1)*/

/*
class Node{
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}
public class P02_nth_node_from_end {
    static int findNth(Node head , int N) {
        int len =0,i;

        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            len++;
        }
        if(len<N)
           return -1;

        temp = head;

        for(i=1;i<len-N+1;i++)
            temp = temp.next;
        return temp.data;
    }

    public static void main(String[] args) {
        Node head = new Node(35);
        head.next = new Node(15);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);

        System.out.println(findNth(head, 4));
    }
} */

/* Using Two Pointers 
 * 
 * Time Complexity : O(m)
 * Space Complexity : O(1)
 */

class Node{
    int data;
    Node next;
    Node(int new_data) {
        data = new_data;
        next = null;
    }
}
public class P02_nth_node_from_end {
   static int nthFromEnd(Node head, int N) {
        Node main_ptr = head;
        Node ref_ptr = head;

        for(int i=1;i<N;i++){
            ref_ptr = ref_ptr.next;

            if(ref_ptr == null) {
                return -1;
            }
        }
        while(ref_ptr.next != null) {
            ref_ptr = ref_ptr.next;
            main_ptr = main_ptr.next;
        }
        return main_ptr.data;
   }
   public static void main(String[] args) {
      Node head = new Node(35);
      head.next = new Node(15);
      head.next.next = new Node(4);
      head.next.next.next = new Node(20);
      
      System.out.println(nthFromEnd(head,4));
   }
}