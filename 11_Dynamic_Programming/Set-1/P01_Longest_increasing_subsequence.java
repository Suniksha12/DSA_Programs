/*Implement Code in java in which we have been Given an array arr[] of size N, the task is to find the length of the Longest Increasing Subsequence (LIS) i.e., the longest possible subsequence in which the elements of the subsequence are sorted in increasing order.

Examples:            

Input: arr[] = {3, 10, 2, 1, 20}
Output: 3
Explanation: The longest increasing subsequence is 3, 10, 20
 
Approach - 1 Using Recursion
Time Complexity : Exponential
Space Complexity : O(N)*/

class P01_Longest_increasing_subsequence {
    static int lisEndAtI(int[] arr, int i) {
        if (i == 0)
            return 1;

        int mx = 1;
        for (int prev = 0; prev < i; prev++)
            if (arr[prev] < arr[i])
                mx = Math.max(mx, lisEndAtI(arr, prev) + 1);
        return mx;
    }

    static int lis(int[] arr) {
        int n = arr.length;
        int res = 1;
        for (int i = 1; i < n; i++)
            res = Math.max(res, lisEndAtI(arr, i));
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60 };
        System.out.println("Length of lis is " + lis(arr));
    }
}