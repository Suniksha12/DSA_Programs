/*Implement Code in java such that we are Given an array of N positive elements, 
the task is to find the maximum AND value generated by any pair of elements from the array. 

Examples: 

Input: arr1[] = {16, 12, 8, 4}
Output: 8
Explanation: 8 AND12 will give us the maximum value 8 

Approach 1 : using Maximum value of AND

Time Complexity: O(N2)
Space Complexity : O(1) */

/*
public class Max_value {
    static int maxAND(int arr[] , int n) {
        int res = 0;
        for(int i =0;i<n;i++) 
           for(int j = i+1;j<n;j++)
               res = res > (arr[i] & arr[j]) ? res : (arr[i] & arr[j]);
        return res;
    }
    public static void main(String argc[])
    {
        int arr[] = { 4, 8, 6, 2 };
        int n = arr.length;
        System.out.println("Maximum AND Value = "
                           + maxAND(arr, n));
    }  
} */
