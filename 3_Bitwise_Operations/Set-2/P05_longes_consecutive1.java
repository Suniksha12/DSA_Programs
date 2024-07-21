/*Implement Code in java in which we are Given a number N,
 The task is to find the length of the longest consecutive 1s 
 series in its binary representation.
Examples : 

Input: N = 14
Output: 3
Explanation: The binary representation of 14 is 1110.

Time Complexity : O(log N)

Space Complexity : O(1)*/

public class P05_longes_consecutive1 {
    static int maxConsecutive(int x){
        int count = 0;
        while(x != 0) {
            x = (x & (x<<1));
            count++;
        }
        return count;
    }
    public static void main(String strings[])
    {
        System.out.println(maxConsecutive(14));
        System.out.println(maxConsecutive(222));
    }
}
