/*Implement Code in java in which we are Give an integer n. We can flip exactly one bit. 
Write code to find the length of the longest sequence of 1 s you could create.  

example : Input : 1775         
Output : 8 
Binary representation of 1775 is 11011101111.
After flipping the highlighted bit, we get 
consecutive 8 bits. 11011111111.

Approach - 1 Efficient Solution 

Time Complexity : O(log2N)
Space Complexity : O(1)*/

/* 
public class Longest_sequenceof1s {
    static int flipBit(int a) {
        if(~a == 0) {
            return 8 * sizeof();
        }
        int currLen =0, prevLen = 0 , maxLen =0;
        while(a != 0) {
            if((a&1) == 1) {
                currLen++;
            }
            else if((a&1) == 0) {
                prevLen = (a&2) == 0 ? 0 : currLen;
                currLen = 0;
            }
            maxLen = Math.max(prevLen + currLen, maxLen);
            a >>= 1;
        }
        return maxLen + 1;
    }
    static byte sizeof() {
        byte sizeofInteger = 8;
        return sizeofInteger;
    }
    public static void main(String[] args) {
        System.out.println(flipBit(13));

        System.out.println(flipBit(1775));

        System.out.println(flipBit(15));
    }
}
*/

/* Approach - 2 Sliding Window */