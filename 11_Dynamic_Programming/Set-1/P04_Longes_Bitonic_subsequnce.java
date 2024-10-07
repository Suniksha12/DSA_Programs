/*Implement Code in java in which we have been Given an array of positive integers. Find the maximum length of Bitonic subsequence. 
A subsequence of array is called Bitonic if it is first strictly increasing, then strictly decreasing. Return the maximum length of bitonic subsequence.
 
Note : A strictly increasing or a strictly decreasing sequence should not be considered as a bitonic sequence

Examples :

Input: n = 5, nums[] = [1, 2, 5, 3, 2]
Output: 5
Explanation: The sequence {1, 2, 5} is increasing and the sequence {3, 2} is decreasing so merging both we will get length 5.

Time Complexity : O(n^2)
Space Complexity : O(n)*/

import java.util.Arrays;

public class P04_Longes_Bitonic_subsequnce {
    public static int longestBitonicSequence(int n, int[] nums) {
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1, 1);
        Arrays.fill(dp2, 1);
        // LIS from front:-
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && dp1[j] + 1 > dp1[i]) {
                    dp1[i] = 1 + dp1[j];
                }
            }
        }
        // LIS from rear:-
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j > i; j--) {
                if (nums[i] > nums[j] && dp2[j] + 1 > dp2[i]) {
                    dp2[i] = 1 + dp2[j];
                }
            }
        }

        if (dp1[n - 1] == n || dp2[0] == n)
            return 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (dp1[i] > 1 && dp2[i] > 1)
                ans = Math.max(ans, dp1[i] + dp2[i] - 1);
        }
        return ans;

    }

    public static void main(String[] args) {
        int n = 8;
        int nums[] = { 1, 11, 2, 10, 4, 5, 2, 1 };
        System.out.print(longestBitonicSequence(n, nums));
    }
}
