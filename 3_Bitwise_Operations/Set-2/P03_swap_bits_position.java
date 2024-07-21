/* Implement Code in java Given a number x and two positions (from the right side) in the binary representation of x, write a function that swaps n bits at the given two positions and returns the result. It is also given that the two sets of bits do not overlap.

Method 1 
Let p1 and p2 be the two given positions.

Example 1 

Input:
x = 47 (00101111)
p1 = 1 (Start from the second bit from the right side)
p2 = 5 (Start from the 6th bit from the right side)
n = 3 (No of bits to be swapped)
Output:
227 (11100011)
The 3 bits starting from the second bit (from the right side) are 
swapped with 3 bits starting from 6th position (from the right side)

Time Complexity : O(1)

Space Complexity : O(1)*/

public class P03_swap_bits_position {
    static int swapBits(int x , int p1, int p2, int n) {
        int set1 = (x >> p1) & ((1<<n) - 1);

        int set2 = (x >> p2) & ((1<<n) - 1);

        int xor = (set1 ^ set2);

        xor = (xor<<p1) | (xor << p2);

        int result = x ^ xor;

        return result;
    }
    public static void main(String[] args)
    {
        int res = swapBits(28, 0, 3, 2);
        System.out.println("Result = " + res);
    }
}
