/*Implement a code in java in which we are Given a number N and a bit number K, check if the Kth bit of N is set or not. A bit is called set if it is 1. 
Note: Indexing starts with 0 from LSB (least significant bit) side in the binary representation of the number.

Examples: 

Input: n = 5, k = 1
Output: NOT SET
Explanation: 5 is represented as 101 in binary and bit at position 1 is not set

Time Complexity : O(1)
Space Complexity : O(1)*/

public class P07_Kth_bit {
    public static void isKthBitSet(int n, int k)
    {
        if ((n & (1 <<k)) != 0)
            System.out.print("SET");
        else
            System.out.print("NOT SET");
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int n = 5, k = 1;
 
        // Function call
        isKthBitSet(n, k);
    }
}
