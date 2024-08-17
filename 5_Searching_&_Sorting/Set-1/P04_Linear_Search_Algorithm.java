/*Implement a code in java in which we have to perform Linear Serach Algorithm.
 * Input : arr[] = {10, 50, 30, 70, 80, 20, 90, 40} and key = 30
 * Output: Element is present at index 3
 * 
 * Time Comlexity : O(N)
 * Space Complexity : O(1)
 */

public class P04_Linear_Search_Algorithm {
    static int search(int arr[] , int N , int x){
        for(int i =0;i<N;i++){
            if(arr[i] == x)
               return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;

        int result = search(arr, arr.length, x);
        if(result == -1){
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index " + result);
        }
    }
}
