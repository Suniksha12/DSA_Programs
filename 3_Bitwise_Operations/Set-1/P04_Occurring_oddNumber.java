/* Implement a code in such that we are Given an array of positive integers. 
All numbers occur an even number of times except one number which occurs 
an odd number of times. Find the number in O(n) time & constant space.

Input : arr = {1, 2, 3, 2, 3, 1, 3}
Output : 3

Input : arr = {5, 7, 2, 7, 5, 2, 5}
Output : 5

Approach - 1 : Nested Loop brute forec approach

Time Complexity : O(n^2)

Space Complexity : O(1) */

public class P04_Occurring_oddNumber {
    static int getOddOccurences(int arr[] , int arr_size) {
        int i;
        for(i =0;i<arr_size;i++) {
            int count = 0;
            for(int j =0;j<arr_size;j++) {
                if(arr[i] == arr[j]) 
                   count++;
            }
            if(count % 2 != 0)
               return arr[i];
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{ 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
        int n = arr.length;
        System.out.println(getOddOccurences(arr, n));
}
}
