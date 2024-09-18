//Implement Code in java

/* Given a number, find the sum of its digits.
Example : 

Input : n = 687
Output : 21

Time Complexity : O(|n|)
Space complexity : O(1)

Approach - 1 : Iterative Process*/


/*import java.util.*;
public class Day_25_Sum_of_digits {
    static int getSum(int n) {
        int sum =0;
        while(n!=0) {
            sum = sum + n%10;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = in.nextInt();
        System.out.println(getSum(n));
        in.close();
    }
}*/

/*Approach - 2 : Recursive Approach 
 * Time Complexity : O(log10n)
 * Space Compelxity : O(log10n)
*/

import java.util.*;
public class Day_25_Sum_of_digits {
    static int sumDigits(int n) {
        return n == 0 ? 0 : n%10 + sumDigits(n/10);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = in.nextInt();
        System.out.println(sumDigits(n));
        in.close();
    }
}