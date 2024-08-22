/*Implement code in java in which we are given  a binary array arr[] of size N, which is sorted in non-increasing order, count the number of 1’s in it. 

Examples: 

Input: arr[] = {1, 1, 0, 0, 0, 0, 0}
Output: 2

Input: arr[] = {1, 1, 1, 1, 1, 1, 1}
Output: 7

Approach -1 Naive Approach

Time Complexity : O(N)
Space Complexity : O(1)*/

/* 
public class P05_Count1sin_SortedBinaryArray {
    static int count(int arr[] , int n){
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == 1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr= new int[]{1,1,0,0,0,0};
        int n = 6;
        System.out.print(count(arr, n));
    }
}*/

/*Approavh - 2 Recursive approach
 * 
 * Time Complexity : O(Log(N))
 * Spaec complexity : O(Log(N))
*/

public class P05_Count1sin_SortedBinaryArray {
    int count(int arr[] , int low , int high){
        if(high >= low){
            int mid = low + (high - low)/2;
            if((mid == high || arr[mid + 1] ==0) && (arr[mid]==1)) return mid+1;
            if(arr[mid]==1) 
              return count(arr,(mid+1),high);
            return count(arr, low, (mid - 1));
        }
        return 0;
    }
public static void main(String[] args) {
    P05_Count1sin_SortedBinaryArray ob = new P05_Count1sin_SortedBinaryArray();
    int arr[] = { 1, 1, 1, 1, 0, 0, 0 };
        int n = arr.length;
        System.out.println("Count of 1's in given array is "
                           + ob.count(arr, 0, n - 1));
}
}