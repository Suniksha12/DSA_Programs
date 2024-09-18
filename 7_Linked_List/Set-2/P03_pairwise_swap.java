/*implement Code in java in which we have been Given a singly linked list, 
write a function to swap elements pairwise. 

Input : 1->2->3->4->5->6->NULL 
Output : 2->1->4->3->6->5->NULL

Input : 1->2->3->4->5->NULL 
Output : 2->1->4->3->5->NULL 

Approach -1 Iterative

Time Complexity : O(N)
Space Complexity : O(1)*/

class P03_pairwise_swap {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    void pairWiseSwap() {
        Node temp = head;

        while(temp != null && temp.next != null) {
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        P03_pairwise_swap llist = new P03_pairwise_swap();

        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        System.out.println("Linked List before calling pairwise swap()");
        llist.printList();

        llist.pairWiseSwap();

        System.out.println("Linked list after calling pairwiseswap()");
        llist.printList();
    }
}

