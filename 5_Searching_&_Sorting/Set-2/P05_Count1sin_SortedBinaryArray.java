/*Implement code in java in which we are given  a binary array arr[] of size N, which is sorted in non-increasing order, count the number of 1’s in it. 

Examples: 

Input: arr[] = {1, 1, 0, 0, 0, 0, 0}
Output: 2

Input: arr[] = {1, 1, 1, 1, 1, 1, 1}
Output: 7

Approach -1 Naive Approach*/

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
}
