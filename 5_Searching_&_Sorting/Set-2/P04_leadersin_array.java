/*Implement Code in which we have we have to Write a program to print all the Leaders in the array. An element is a Leader if it is greater than all the elements to its right side.

Note: The rightmost element is always a leader.

Examples:

Input: arr[] = {16, 17, 4, 3, 5, 2}
Output: 17 5 2 

Approach - 1 [Naive Approach] Using Nested Loops

Time Complexity : O(N^2)
Space Complexity : O(1)*/

/*
public class P04_leadersin_array {
    void printLeaders(int arr[] , int size){
        for(int i=0;i<size;i++){
            int j;
            for(j=i+1;j<size;j++){
                if(arr[i] < arr[j])
                   break;
            }
            if(j==size)
               System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        P04_leadersin_array lead = new P04_leadersin_array();
        int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };
        int n = arr.length;
        lead.printLeaders(arr, n);
    }
} */

/*Approach -2 Using Suffix Maximum  
 * 
 * Time Complexity : 
*/
