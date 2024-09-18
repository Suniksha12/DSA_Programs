/* We are given two sorted arrays. We need to merge these two arrays 
such that the initial numbers (after complete sorting) are in the first 
array and the remaining numbers are in the second array.

Approach - 1 :Insertion Sort 

Time Complexity : O(m*n)
Space Complexity : O(1)
*/

/* import java.util.*;
import java.util.Arrays;
public class P05_Merge_without_extra_Money {
    static int arr1[] = new int[] { 1, 5, 9, 10, 15, 20 };
    static int arr2[] = new int[] { 2, 3, 8, 13 };

    static void merge(int m , int n) {
        for(int i = n-1;i>=0;i--) {
            int j , last = arr1[m - 1];
            for(j = m-2;j>=0 && arr1[j] > arr2[i];j--) 
                arr1[j+1] = arr1[j];
            if(last > arr2[i]) {
                arr1[j+1] = arr2[i];
                arr2[i] = last;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        merge(arr1.length, arr2.length);
        System.out.print("After Merging First Array: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Second Array: ");
        System.out.println(Arrays.toString(arr2));
        in.close();
    }
} */

/* Approach 2: Traversing two sorted arrays parallely
 * Time Complexity: O((N+M) * log(N+M))
 * Space Complexity: O(1)
 */

import java.util.*;
import java.util.Arrays;

public class P05_Merge_without_extra_Money{
    static int arr1[] = new int[] { 1, 5, 9, 10, 15, 20 };
    static int arr2[] = new int[] { 2, 3, 8, 13 };

    static void merge(int m , int n) {
        int i =0, j =0, k = m-1;
        while(i<=k && j < n) {
            if(arr1[i] < arr2[j])
               i++;
            else {
                int temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        merge(arr1.length, arr2.length);
        System.out.print("After Merging First Array: ");
        System.out.println(Arrays.toString(arr1));
        System.out.print("Second Array: ");
        System.out.println(Arrays.toString(arr2));
        in.close();
    }
}
