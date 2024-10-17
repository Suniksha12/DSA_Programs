/*Implement code in java in which we have been Given an array arr[] of size n, the task is to find the length of the longest subarray with sum equal to 0.

Examples:

Input: arr[] = {15, -2, 2, -8, 1, 7, 10, 23}
Output: 5
Explanation: The longest subarray with sum equals to 0 is {-2, 2, -8, 1, 7}

Input: arr[] = {1, 2, 3}
Output: 0
Explanation: There is no subarray with 0 sum

Input:  arr[] = {1, 0, 3}
Output:  1
Explanation: The longest sub-array with sum equal to 0 is {0} 

Approach - 1 Naive Approach 
Time Complexity : O(n^2)
Space Complexity : O(1)*/
/* 
public class P05_longest_subarray_with_0_sum {
    static int maxLen(int arr[]){
        int n = arr.length;
        int max_len =0;
        for(int i=0;i<n;i++){
            int curr_sum =0;
            for(int j=i;j<n;j++){
                curr_sum += arr[j];
                if(curr_sum == 0)
                   max_len = Math.max(max_len,j-i+1);
            }
        }
      return max_len;
    }
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(maxLen(arr));   
    }
}*/

/*Approach -2 Using hashmap and prefix sum
 * 
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 */

import java.util.HashMap;

public class P05_longest_subarray_with_0_sum {
     static int maxLen(int[] arr){
        HashMap<Integer,Integer> presum = new HashMap<>();

        int sum=0;
        int max_len=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum==0){
                max_len = i+1;
            }
            if(presum.containsKey(sum)){
                max_len = Math.max(max_len,i-presum.get(sum));
            } else {
                presum.put(sum, i);
            }
        }
        return max_len;
     }
     public static void main(String[] args) {
        int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
        System.out.println(maxLen(arr));
     }
 }