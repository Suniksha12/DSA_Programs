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
 
 /*
 public class P03_K_largest_element {
     static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
     }   
     static int partition(int[] arr , int l , int r){
        int x = arr[r];
        int i = l;
        for(int j=l;j<=r-1;j++){
            if(arr[j] <= x) {
                swap(arr,i,j);
                i++;
            }
        }
        swap(arr, x, i);
        return i;
     }
     static void Klargest(int[] arr, int l , int r , int k , int N) {
        int pos = partition(arr, l, r);
        if(pos - l == k-1)
           return;
        else if(pos-l<k-1)
                Klargest(arr,pos+1,r,k-pos+l-1,N);
            else
               Klargest(arr,l,pos-1,k,N);
     }
     public static void main(String[] args) {
        int[] arr = { 11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45 };
        int N = arr.length;
        int k = 3;
        Klargest(arr, 0, N - 1, k, N);

        System.out.print(k + " largest elements are: ");
        for (int i = N - 1; i >= N - k; i--)
            System.out.print(arr[i] + " ");

        System.out.println();
     }
 } */

/*Approach - 4 K largest elements in an array using Priority Queue(Min-Heap)
 * 
 * Time Complexity : O(N * log(K))
 * Space Complexity : O(K)
 */

 import java.util.PriorityQueue;
 public class P03_K_largest_element {
      static void klargest(int a[] , int n , int k){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i<n;++i) {
            pq.add(a[i]);
            if(pq.size() > k){
                pq.poll();
            }
        }
        while(!pq.isEmpty()){
            System.out.print(pq.peek() + " ");
            pq.poll();
        }
        System.out.println();
      }   
      public static void main(String[] args) {
        int a[] = { 11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45 };
        int n = a.length;
        int k = 3;
        System.out.print(k + " largest elements are : ");
        klargest(a, n, k);
      }
 }