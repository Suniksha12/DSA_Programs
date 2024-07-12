/*Implement the code in java such thate we Given an array arr[] consisting of N integers, the task is to find the maximum 
Bitwise XOR of Bitwise OR of every subarray after splitting the array into subarrays(possible zero subarrays).

Input: arr[] = {1, 5, 7}, N = 3
Output: 7
Explanation:
The given array can be expressed as the 1 subarray i.e., {1, 5, 7}.
The Bitwise XOR of the Bitwise OR of the formed subarray is 7, which is the maximum possible value.

Approach - 1 : Naive Approach 

Time Complexity : O(2^N)

Space Complexity : O(1)*/


public class P06_Divide_the_array {
    static int maxXor(int arr[] , int n , int xrr , int orr) {
        if(n==0) return xrr^orr;

        int x = maxXor(arr, n-1, xrr^orr, arr[n-1]);

        int y = maxXor(arr, n-1, xrr, orr | arr[n-1]);

        return Math.max(x,y);
    }
    static int maximumXOR(int arr[] , int N) {
        return maxXor(arr, N, 0, 0);
    }
    public static void main(String[] args)
    {
        int arr[] = { 1, 5, 7 };
        int N = arr.length;
        System.out.println(maximumXOR(arr, N));
    }
}
