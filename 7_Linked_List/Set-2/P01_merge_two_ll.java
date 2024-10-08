/*Implement code in java in which we have Given two sorted linked lists '
consisting of N and M nodes respectively. The task is to merge both of 
the lists (in place) and return the head of the merged list.

Examples:

Input: a: 5->10->15,  b: 2->3->20
Output: 2->3->5->10->15->20

Input: a: 1->1, b: 2->4
Output: 1->1->2->4 

Approach - Brute Force Way

Time Complexity: O(n+m)
Space Complexity : O(n+m)*/

/*
import java.util.ArrayList;
import java.util.Collections;

class Node{
    int data;
    Node next;
    Node(int x){
        this.data = x;
        this.next = null;
    }
}
public class P01_merge_two_ll{
    static Node mergeSort(Node a , Node b){
        ArrayList<Integer> list = new ArrayList<>();

        while(a!=null) {
            list.add(a.data);
            a = a.next;
        }

        while(b != null) {
            list.add(b.data);
            b = b.next;
        }

        Collections.sort(list);

        Node temp  = new Node(-1);
        Node head = temp;
        for(int value : list) {
            temp.next = new Node(value);
            temp = temp.next;
        }
        head = head.next;
        return head;
    }
    public static void main(String[] args) {
        Node a = new Node(2);
        a.next = new Node(3);
        a.next.next = new Node(8);
        a.next.next.next = new Node(9);

        Node b = new Node(1);
        b.next = new Node(3);
        b.next.next = new Node(8);
        b.next.next.next = new Node(10);

        Node res = mergeSort(a,b);

        Node temp = res;
        System.out.print("Merged Link list is :\n");

        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
} */

/* Approach - 2 Using Recursive Merge
 * 
 * Time Complexity : O(m+n)
 * Space Complexity : O(m+n)
 */

/*
class Node {
    int data;
    Node next;
    Node(int x){
        this.data=x;
        this.next = null;
    }
}
public class P01_merge_two_ll{
    public static Node mergSorted(Node a , Node b){
           Node result = null;

           if(a==null) 
              return b;
           else if(b==null)
               return a;

           if(a.data <= b.data){
            result = a;
            result.next = mergSorted(a.next,b);
           }
           else{
            result = b;
            result.next = mergSorted(a,b.next);
           }
           return result;
    }
    public static void main(String[] args) {
        Node a = new Node(2);
        a.next = new Node(4);
        a.next.next = new Node(8);
        a.next.next.next = new Node(9);

        Node b = new Node(1);
        b.next = new Node(3);
        b.next.next = new Node(8);
        b.next.next.next = new Node(10);

        Node res = mergSorted(a,b);

        Node temp = res;
        System.out.print("Merge Linked List is:\n");
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
} */

/*Approach - 3 Using Iterative Merge 
 * 
 * Time Complexity: O(m + n),
Auxiliary Space: O(1)
*/

public class P01_merge_two_ll{
    static class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }
    }
    static Node mergeList(Node a, Node b){
        if(a==null) return b;
        if(b==null) return a;

        Node head = null;
        Node tail = null;

        if(a.data <= b.data) {
            head = tail = a;
            a= a.next;
        }
        else {
            head = tail = b;
            b = b.next;
        }

        while(a != null && b != null) {
            if(a.data <= b.data) {
                tail.next = a;
                tail = a;
                a = a.next;
            } else {
                tail.next = b;
                tail = b;
                b = b.next;
            }
        }
        tail.next = (a != null) ? a:b;
        return head;
    }
    public static void main(String[] args) {
        Node a = new Node(2);
        a.next = new Node(4);
        a.next.next = new Node(8);
        a.next.next.next = new Node(9);

        Node b = new Node(1);
        b.next = new Node(3);
        b.next.next = new Node(8);
        b.next.next.next = new Node(10);

        Node res = mergeList(a, b);

        System.out.println("Merged Linked List is : ");
        while(res != null) {
            System.out.print(res.data + " ");
            res = res.next;
        }
    }
}