/*Implement Code in java in which we have been given an array of integers. Write a program to find the K-th largest sum of contiguous subarray within the array of numbers that has both negative and positive numbers.

Examples: 

Input: a[] = {20, -5, -1}, K = 3
Output: 14
Explanation: All sum of contiguous subarrays are (20, 15, 14, -5, -6, -1) 
so the 3rd largest sum is 14.

Input: a[] = {10, -10, 20, -40}, k = 6
Output: -10
Explanation: The 6th largest sum among
sum of all contiguous subarrays is -10.

Approach - Brute force
Time Complexity : O(n2*log(n2))
Space Complexity: O(n)*/

import java.util.ArrayList;
import java.util.Collections;
public class P04_K_largest_sum_subarray {
    static int KthLargestSum(int arr[] , int N, int K){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<N;i++){
            int sum =0;
            for(int j=i;j<N;j++){
                sum += arr[j];
                result.add(sum);
            }
        }
        Collections.sort(result,Collections.reverseOrder());

        return result.get(K-1);
    }
    public static void main(String[] args) {
        int a[] = { 20, -5, -1 };
        int N = a.length;
        int K = 3;

        System.out.println(KthLargestSum(a, N, K));
    }
}
