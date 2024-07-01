/* Implement Code in java such that we are Given a circular array of size n, 
find the maximum subarray sum of the non-empty subarray. 

Input: arr[] = {8, -8, 9, -9, 10, -11, 12}
Output: 22 
Explanation: Subarray 12, 8, -8, 9, -9, 10 gives the maximum sum, that is 22.

Algorithm : Kadane's Algorithm
Time Complexity : O(n)
Space Complexity : O(1)*/

public class P02_Max_Circular {
    public static int maxCircularSum(int a[] , int n) {
        if(n==1)
           return a[0];
        int sum =0;
        for(int i =0;i<n;i++) {
            sum += a[i];
        }
        int curr_max = a[0] , max_so_far = a[0],
            curr_min = a[0] , min_so_far = a[0];

        for(int i =1;i<n;i++) {
            curr_max = Math.max(curr_max + a[i] , a[i]);
            max_so_far = Math.max(max_so_far, curr_max);

            curr_min = Math.min(curr_min + a[i], a[i]);
            min_so_far = Math.min(min_so_far, curr_min);
        }
        if(min_so_far == sum) {
            return max_so_far;
        }
        return Math.max(max_so_far,sum-min_so_far);
    }
    public static void main(String[] args) {
        int a[] = { 11, 10, -20, 5, -3, -5, 8, -13, 10 };
    int n = 9;
    System.out.println("Maximum circular sum is "
                       + maxCircularSum(a, n));
    }
}
