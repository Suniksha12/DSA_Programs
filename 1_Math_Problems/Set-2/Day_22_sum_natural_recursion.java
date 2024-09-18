//Implement code in java 

/*Given a number n, find sum of first n natural numbers. To calculate the sum, we will use a recursive function recur_sum().
 * Input : 3
 * Output : 6
 * Explanation : 1 + 2 + 3 = 6
 * 
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 */

import java.util.*;

public class Day_22_sum_natural_recursion {
    static int recur_sum(int n) {
        if(n<=1)
           return n;
        return n + recur_sum(n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println(recur_sum(n));
        in.close();
    }
}
