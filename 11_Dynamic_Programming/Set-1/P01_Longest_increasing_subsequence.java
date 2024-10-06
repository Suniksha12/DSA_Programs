/*Implement Code in java in which we have been Given an array arr[] of size N, the task is to find the length of the Longest Increasing Subsequence (LIS) i.e., the longest possible subsequence in which the elements of the subsequence are sorted in increasing order.

Examples:            

Input: arr[] = {3, 10, 2, 1, 20}
Output: 3
Explanation: The longest increasing subsequence is 3, 10, 20
 
Approach - 1 Using Recursion
Time Complexity : Exponential
Space Complexity : O(N)*/

/*
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
} */

/*Approach - 2 Memoization
 * 
 * Time Complexity : O(N2)
 * Space Complexity : O(N2)
 */

/*
class P01_Longest_increasing_subsequence {
    static int lisEndAtI(int arr[], int i, int dp[]) {
        if (i == 0)
            return 1;

        if (dp[i] != -1)
            return dp[i];

        int mx = 1;
        for (int prev = 0; prev < i; prev++)
            if (arr[prev] < arr[i])
                mx = Math.max(mx, lisEndAtI(arr, prev, dp) + 1);
        dp[i] = mx;
        return dp[i];
    }

    static int lis(int arr[], int n) {
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }
        int res = 1;
        for (int i = 1; i < n; i++)
            res = Math.max(res, lisEndAtI(arr, i, dp));
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int n = arr.length;
        System.out.println("Length of lis is " + lis(arr, n));
    }
} */

/*Approach - 3 Dynamic Programming
 * 
 * Time Complexity : O(N^2)
 * Space Complexity : O(N)
 */

class P01_Longest_increasing_subsequence {
    static int lis(int arr[], int n) {
        int lis[] = new int[n];
        for (int i = 0; i < n; i++)
            lis[i] = 1;
        for (int i = 1; i < n; i++)
            for (int prev = 0; prev < i; prev++)
                if (arr[i] > arr[prev] && lis[i] < lis[prev] + 1)
                    lis[i] = lis[prev] + 1;
        int max = 1;
        for (int i = 1; i < n; i++)
            max = Math.max(max, lis[i]);
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int n = arr.length;
        System.out.println("Length of lis is "
                + lis(arr, n));
    }
}