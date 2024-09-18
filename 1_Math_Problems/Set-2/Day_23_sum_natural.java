//Implement Code in java

/* calculate the sum of N natural numbers using an iterative approach i.e. using a for a loop
 * Input: N = 10
 * Output: Sum of first 10 Natural Number = 55
 * 
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 */

/*import java.util.*;
public class Day_23_sum_natural {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int N = in.nextInt();
        int sum =0;
        for(int i =1;i<=N;i++) {
            sum += i;
        }
        System.out.println("Sum of First " + N + " Natural Number = " + sum);
        in.close();
    }
} */

/* Approach -2 : Using Mathematical Functions
 * Sum = N*(N+1)/2
 * 
 * Time Complexity : O(1)
 * Space Complexity : O(1)
 *
 */

import java.util.*;
public class Day_23_sum_natural {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int N = in.nextInt();
        int sum = (N*(N+1))/2;
        System.out.print("Sum of First " + N + " Natural Numbers = " + sum);
        in.close();
    }
}