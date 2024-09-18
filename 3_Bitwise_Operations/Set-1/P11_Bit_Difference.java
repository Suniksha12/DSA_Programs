/*Implement You are given two numbers A and B. The task is to count the number of bits needed to be flipped to convert A to B.

Example 1:

Input: A = 10, B = 20
Output: 4
Explanation:
A  = 01010
B  = 10100
As we can see, the bits of A that need 
to be flipped are 01010. If we flip 
these bits, we get 10100, which is B.

Time Complexity : O(log N)

Space Complexity : O(1) */

public class P11_Bit_Difference {
    static int countBits(int a , int b) {
        int c =0;
        while(a>0 || b>0) {
            if((a&1) != (b&1)) {
                c++;
            }
            a = a>>1;
            b = b>>1;
        }
        return c;
    }
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        System.out.println(countBits(m,n));
    }
}
