/* Write a code to implement in java in which Given an array arr[] and an integer K,
 the task is to reverse every subarray formed by consecutive K elements.
 
 Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9], K = 3 
Output: 3, 2, 1, 6, 5, 4, 9, 8, 7

Time Complexity : O(N)
Space Complexity : O(1)*/

import java.util.*;

public class P07_Reverse_array_in_group {
   static void reverse(int arr[], int n , int k) {
    for(int i =0;i<n;i+=k) {
        int left =i;
        int right = Math.min(i+k-1,n-1);
        int temp;
        while(left<right) {
            temp=arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left += 1;
            right -= 1;
        }
    }
   } 
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int arr[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
    int k =3;
    int n = arr.length;
    reverse(arr, n, k);
    for(int i=0;i<n;i++)
      System.out.print(arr[i] + " ");
    in.close();
   }
}
