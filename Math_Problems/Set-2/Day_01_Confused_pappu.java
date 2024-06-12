//Implement a Program in java 
/* The question says Pappu is confused between 6 & 9. 
He works in the billing department of abc company and his work is to return the remaining amount to the customers. 
If the actual remaining amount is given we need to find the maximum possible extra amount given by the pappu to the customers.

Example 1:

Input: amount = 56
Output: 3
Explanation: maximum possible extra 
             amount = 59 - 56 = 3. 
             
Time complexity : O(log10amount)
Space Complexity : O(log10amount)
*/

import java.util.*;

public class Day_01_Confused_pappu {
    static long findDiff(long amount) {
        long result =0;
        long multiplier =1;
        while(amount > 0) {
            long digit = amount % 10;
            if(digit == 6) {
                result += 3 * multiplier;

            }
        amount = amount/10;
        multiplier *= 10;
        }
        return result;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount: ");
        int amount = in.nextInt();
        System.out.print(findDiff(amount));
    }
}
