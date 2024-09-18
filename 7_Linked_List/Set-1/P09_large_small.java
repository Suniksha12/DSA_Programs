/*Implement a code in java in which we have Given a singly linked list of n nodes, 
the task is to find the smallest and largest element in linked list.

Examples: 

Input: 15 -> 14 -> 13 -> 22 -> 17
Output: 13 22
Explanation: The minimum element in the linked list is 13, and the maximum element is 22. 

Time Complexity : O(n)
Space Complexity : O(1)*/

class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}
class pair{
    public int minElement;
    public int maxElement;
     
    public pair(int minElement, int maxElement){
        this.minElement = minElement;
        this.maxElement = maxElement;
    }

}
public class P09_large_small {
       static pair findMaxMin(Node head){
        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;

        Node curr = head;

        while(curr != null){
            if(curr.data>maxElement){
                maxElement = curr.data;
            }
            if(curr.data < minElement){
                minElement = curr.data;
            }
            curr = curr.next;
        }
        return new pair(minElement, maxElement);
       }
    public static void main(String[] args) {
        Node head = new Node(15);
        head.next = new Node(14);
        head.next.next = new Node(13);
        head.next.next.next = new Node(22);
        head.next.next.next.next = new Node(17);

        pair result = findMaxMin(head);
        System.out.println(result.minElement + " " + result.maxElement);
    }
}
