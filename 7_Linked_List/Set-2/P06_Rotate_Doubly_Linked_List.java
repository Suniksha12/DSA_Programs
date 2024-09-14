/*Implement A code in java in which we have been Given a doubly-linked list, 
rotate the linked list counter-clockwise by N nodes. Here N is a given 
positive integer and is smaller than the count of nodes in linked list.  

Input : a  b  c  d  e   N = 2
Output : c  d  e  a  b 

Time Complexity : O(N)
Space Complexity : O(1)*/

class Node {
    char data;
    Node prev;
    Node next;
    Node(char d) {
        data = d;
        prev = next = null;
    }
}

class P06_Rotate_Doubly_Linked_List {
    static Node rotate(Node head, int N) {
        if (N == 0)
            return head;

        Node current = head;
        int count = 1;
        while (count < N && current != null) {
            current = current.next;
            count++;
        }
        if (current == null)
            return head;
        Node NthNode = current;

        while (current.next != null)
            current = current.next;

        current.next = head;
        head.prev = current;
        head = NthNode.next;
        head.prev = null;
        NthNode.next = null;
        return head;
    }

    static void printList(Node node) {
        while (node != null && node.next != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        if (node != null)
            System.out.print(node.data);
    }

    public static void main(String[] args)
    {
        Node head = null;

        head = new Node('a');
        head.next = new Node('b');
        head.next.next = new Node('c');
        head.next.next.next = new Node('d');
        head.next.next.next.next = new Node('e');;

        int N = 2;

        System.out.println("Given linked list ");
        printList(head);
        head = rotate(head, N);
        System.out.println();
        System.out.println("Rotated Linked list ");
        printList(head);
    }
}
