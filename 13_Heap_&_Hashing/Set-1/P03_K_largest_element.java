/*Implement Code in java in which we have been given a Given an array arr[] of size N, the task is to printing K largest elements in an array.
Note: Elements in output array can be in any order

Examples:
Input:  [1, 23, 12, 9, 30, 2, 50], K = 3
Output: 50, 30, 23

Input:  [11, 5, 12, 9, 44, 17, 2], K = 2
Output: 44, 17

Approach - Using Sorting
Time Complexity : O(N * log(N))
Space Complexity : O(1)
*/

/*
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class P03_K_largest_element {
    static void Klargest(Integer[] arr, int k){
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0;i<k;i++)
           System.out.print(arr[i] + " ");

    }
    public static ArrayList<Integer> Klargest(int[] arr, int k){
        Integer[] obj_array = Arrays.stream(arr).boxed().toArray(Integer[] :: new);
        Arrays.sort(obj_array,Collections.reverseOrder());
        ArrayList<Integer> list = new ArrayList<>(k);

        for(int i=0;i<k;i++)
           list.add(obj_array[i]);
        return list;
    }
    public static void main(String[] args) {
        Integer arr[] = new Integer[] { 1, 23, 12, 9, 30, 2, 50 };
        int k = 3;
        Klargest(arr, k);

        int[] prim_array = { 1, 23, 12, 9, 30, 2, 50 };
        Klargest(prim_array, k);

    }
} */

/*Approach - 2 K largest elements in an array using Binary Search
 * Time Complexity : O(n * log (mx-mn))
 * Space Complexity : O(1)
 */

 /* 
 public class P03_K_largest_element {
     static int findKthLargest(int[] arr, int n , int k){
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;

        for(int i:arr){
            low = Math.min(low,i);
            high = Math.max(high,i);
        }
        while(low <= high){
            int mid = low+(high-low)/2;
            int count  =0;

            for(int i:arr){
                if(i>mid){
                    count++;
                }
            }
            if(count >= k) {
                low = mid +1;
            } else {
                high = mid - 1;
            }
        }
        return high;
     } 
     public static void printKlargest(int[] arr , int n , int k){
        int kthlargest = findKthLargest(arr, n, k);
        for(int i : arr) {
            if(i>=kthlargest){
                System.out.print(" " + i);
            }
        }
     }
     public static void main(String[] args) {
        int[] arr = { 12, 5, 787, 1, 23 };
        int n = arr.length;
        int k = 2;

        System.out.print("K largest elements:");
        printKlargest(arr, n, k);
     }
 }*/

/*Approach - 3 K largest elements in an array using Quick Sort partitioning algorithm
 * 
 * Time Complexity : O(N^2)
 * Space Compelxity : O(N)
 */

 