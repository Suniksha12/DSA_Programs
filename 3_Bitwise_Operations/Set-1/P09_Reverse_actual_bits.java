/*Implement Code in java such that we areGiven a non-negative integer n. 
The problem is to reverse the bits of n and print the number obtained after 
reversing the bits. Note that the actual binary representation of the number 
is being considered for reversing the bits, no leadings 0’s are being considered.
Examples : 
Input : 11
Output : 13
Explanation: (11)10 = (1011)2.
After reversing the bits we get:
(1101)2 = (13)10. 

Time Complexity : O(num)
Space Complexity : O(1)*/


public class P09_Reverse_actual_bits {
    public static int reversebit(int n) {
        int rev =0;
        while (n>0) {
            rev <<= 1;
            if((int)(n & 1) == 1)
               rev ^= 1;
               n >>= 1;
        }
        return rev;
    }
    public static void main(String[] args)
    {
        int n = 11;
        System.out.println(reversebit(n));
    } 
}
