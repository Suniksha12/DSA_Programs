/*Implement Code in java in which we are Given a binary array, sort it using one traversal and no extra space

Examples: 

Input: 1 0 0 1 0 1 0 1 1 1 1 1 1 0 0 1 1 0 1 0 0 
Output: 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1
Explanation: The output is a sorted array of 0 and 1

Time Complexity : O(N)
Space Complexity : O(1)*/

/* 
public class P09_Binary_Array_sorting {
    static void sortBinaryArray(int a[] , int n){
        int j =-1;
        for(int i=0;i<n;i++){
            if(a[i]<1){
                j++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int a[] = { 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1,
            1, 1, 0, 0, 1, 1, 0, 1, 0, 0 };
        int n = a.length;
        sortBinaryArray(a,n);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " "); 
    }
} */

/*Approach 2- Two pointers approach 
 * Time Complexity : O(N)
 * Space Complexity : O(1)
*/

public class P09_Binary_Array_sorting {
    static void sort(int A[] , int n){
        int i=0;
        int j =n-1;
        while(i<j){
            if(A[i] == 1 && A[j] == 0) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            }
            else if (A[i]==0) {
                i++;
            }
            else if(A[j] == 1) {
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };
        sort(arr, arr.length);
        for(int i:arr)
            System.out.print(i+" ");
    }
}
