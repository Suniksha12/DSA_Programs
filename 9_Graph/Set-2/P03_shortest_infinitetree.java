/*
 * Implement code in java in which we have to
 * Consider you have an infinitely long binary tree having a pattern as below:
 * 
 * 
 * 1
 * / \
 * 2 3
 * / \ / \
 * 4 5 6 7
 * / \ / \ / \ / \
 * . . . . . . . .
 * Given two nodes with values x and y. The task is to find the length of the
 * shortest path between the two nodes.
 * 
 * Examples:
 * 
 * Input: x = 2, y = 3
 * Output: 2
 * 
 * Input: x = 4, y = 6
 * Output: 4
 * 
 * Approach - 1 Naive Approach
 * 
 * The answer will be thus
 * 
 * distance = v1.size() – 1 – i + v2.size() – 1 – x
 * 
 * Time Comeplexity : O(log(max(x, y)) * log(max(x, y)))
 * Space Complexity : O(log(max(x, y)))
 * 
 */

import java.util.Collections;
import java.util.Vector;

public class P03_shortest_infinitetree {
    static Vector<Integer> v1 = new Vector<Integer>();
    static Vector<Integer> v2 = new Vector<Integer>();

    static int BinarySearch(int x) {
        int low = 0;
        int high = v2.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (v2.get(mid) == x)
                return mid;
            else if (v2.get(mid) > x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    static void MakeAncestorNode1(int x) {
        v1.clear();
        while (x > 0) {
            v1.add(x);
            x /= 2;
        }
        Collections.reverse(v1);
    }

    static void MakeAncestorNode2(int x) {
        v2.clear();
        while (x > 0) {
            v2.add(x);
            x /= 2;
        }
        Collections.reverse(v2);
    }

    static int Distance() {
        for (int i = v1.size() - 1; i >= 0; i--) {
            int x = BinarySearch(v1.get(i));
            if (x != -1) {
                return v1.size() - 1 - i + v2.size() - 1 - x;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        int node1 = 2, node2 = 3;
        MakeAncestorNode1(node1);
        MakeAncestorNode2(node2);
        System.out.print("Distance between " + node1 + " and " + node2 + " is : " + Distance());
    }
}