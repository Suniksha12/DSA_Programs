/*Implement Code in java in which we have been Given a linked list sorted in non-decreasing order. 
Return the list by deleting the duplicate nodes from the list. 
The returned list should also be in non-decreasing order.

Example:

Input : Linked List = 11->11->11->21->43->43->60
Output : 11->21->43->60 

Approach - 1 Naive Approach - Using HashSet 

Time Complexity : O(N)
Space Complexity : O(N)*/

/*
import java.util.HashSet;
class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next=null;
    }
}
public class P08_Remove_duplicates {
    static Node removeDuplicates(Node head){
        HashSet<Integer> st = new HashSet<>();
        Node temp = head;
        Node newHead = null;
        Node tail = null;

        while(temp != null){
            if(!st.contains(temp.data)){
                Node newNode = new Node(temp.data);
                if(newHead == null){
                    newHead = newNode;
                    tail = newHead;
                }else{
                    tail.next = newNode;
                    tail = newNode;
                }
                st.add(temp.data);
            }
            temp = temp.next;
        }
        return newHead;
    }
    public static void printlist(Node node){
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(11);
        head.next = new Node(11);
        head.next.next = new Node(11);
        head.next.next.next = new Node(13);
        head.next.next.next.next = new Node(13);
        head.next.next.next.next.next = new Node(20);

        System.out.println("Linked list Before duplicate removal:");
        printlist(head);

        head = removeDuplicates(head);
        
        System.out.println("Linked list after duplicate removal:");
        printlist(head);
    }
}
*/

/*Approach - 2 By changing next Pointer 
 * 
 * Time Complexity: O(N)
 * Space Complexity : O(1)
 */

/* 
class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}
public class P08_Remove_duplicates {
    static Node removeDuplicates(Node head){
           Node curr = head;
           while(curr != null && curr.next != null) {
               if(curr.data == curr.next.data){
                  Node nextNext = curr.next.next;
                  curr.next = nextNext;
               }
               else{
                curr = curr.next;
               }
           }
           return head;
    }
    static void printList(Node node){
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(11);
        head.next = new Node(11);
        head.next.next = new Node(11);
        head.next.next.next = new Node(13);
        head.next.next.next.next = new Node(13);
        head.next.next.next.next.next = new Node(20);

        System.out.println("Linked List before duplicate removal:");
        printList(head);

        head = removeDuplicates(head);

        System.out.println("Linked List after duplicate removal:");
        printList(head);
    }
} */

/*Aprroach - 3 Using Recursion 
 * 
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 */

class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}
public class P08_Remove_duplicates{
    static void removeDuplicates(Node head){
        if(head==null) return;

        if(head.next != null){
            if(head.data == head.next.data) {
                head.next = head.next.next;
                removeDuplicates(head);
            }else{
                removeDuplicates(head.next);
            }
        }
    }
    static void printList(Node node){
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(11);
        head.next = new Node(11);
        head.next.next = new Node(11);
        head.next.next.next = new Node(13);
        head.next.next.next.next = new Node(13);
        head.next.next.next.next.next = new Node(20);

        System.out.println("Linked list before duplicate removal:");
        printList(head);

        removeDuplicates(head);

        System.out.println("Linked list after duplicate removal:");
        printList(head);
    }
}