/*Implement Code in java in which we are Give an algorithm for reversing a queue Q. Only the following standard operations are allowed on queue. 

enqueue(x): Add an item x to the rear of the queue.
dequeue(): Remove an item from the front of the queue.
empty(): Checks if a queue is empty or not.
The task is to reverse the queue.

Examples: 

Input: Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
Output: Q = [100, 90, 80, 70, 60, 50, 40, 30, 20, 10] 

Approach -1 Reversing a queue using stack

Time Complexity : O(N)
Spaec Complexity : O(N)*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class P04_Reverse_a_queue {
    static Queue<Integer> queue;
    static void print(){
        while(!queue.isEmpty()){
            System.out.print(queue.peek() + ",");
            queue.remove();
        }
    }
    static void reversequeue(){
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()){
            stack.add(queue.peek());
            queue.remove();
        }
        while (!stack.isEmpty()) {
            queue.add(stack.peek());
            stack.pop();
        }
    }
    public static void main(String[] args) {
        queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);

        reversequeue();
        print();
    }
}
