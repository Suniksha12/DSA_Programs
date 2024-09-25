/*Implement code in java in which we have the Given an array arr[], the task is to find the subarray that has the maximum sum and return its sum.

Examples:

Input: arr[] = {2, 3, -8, 7, -1, 2, 3}
Output: 11
Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.

Input: arr[] = {-2, -4}
Output: –2
Explanation: The subarray {-2} has the largest sum -2.

Approach - Naive Approach 

Time Complexity : O(N^2)
Space Complexity : O(1)*/

public class P05_Kadnes_algo {
    static int maxSubarraySum(int[] arr) {
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                currSum = currSum + arr[j];
                res = Math.max(res, currSum);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, -8, 7, -1, 2, 3 };
        System.out.println(maxSubarraySum(arr));
    }
}
