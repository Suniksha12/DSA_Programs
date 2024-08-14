/*Implement Code in java in which we are Given an array of random numbers, Push all the zero’s of a given array to the end of the array. For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. The order of all other elements should be same. Expected time complexity is O(n) and extra space is O(1).

Example: 

Input : arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};
Explanation : There are three 0s that are moved to end

Approach - 1 Naive Approach

Time Complexity : O(N)
Space Compelxity : o(N)*/

/*
public class P08_Move_All_Zeros_to_end {
    public static void main(String[] args) {
        int[] A= {5, 6, 0, 4, 6, 0, 9, 0, 8};
        int n = A.length;
        int[] B = new int[n];
        int j =0;
        int count =0;
        for(int i =0;i<n;i++) {
            if(A[i] != 0){
                B[j] = A[i];
                j++;

            }else {
                count++;
            }
        }
        while(count >0){
            B[j] = 0;
            count--;
            j++;
        }
        for(int i =0;i<n;i++){
            A[i] = B[i];

        }
        for(int i =0;i<n;i++){
            System.out.print(A[i] + " ");
        }
    }
}
*/

/*Approach -2 Better Approach 
 * 
 * Time Complexity :O(N)
 * Spae Compplexity : O(1)
 */

 public class P08_Move_All_Zeros_to_end {
    static void pushZerostoend(int arr[] , int n){
        int count=0;
        for(int i =0;i<n;i++){
            if(arr[i] !=0)
               arr[count++] = arr[i];

        while(count<n)
              arr[count++]=0;

        }
  
    }
    public static void main(String[] args) {
        int arr[] = {1,9,8,4,0,0,2,7,0,6,0,9};
        int n = arr.length;
        pushZerostoend(arr, n);
        System.out.println("Array after pushing zeros to the back : ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+"");
    }
 }