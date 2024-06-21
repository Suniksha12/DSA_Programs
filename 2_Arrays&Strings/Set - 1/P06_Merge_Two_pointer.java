/*Time complexity : O(m+n)*O(log (m+n)),
 * Space Complexity : O(1)
 */

import java.util.*;

public class P06_Merge_Two_pointer {
    static void swapifgreater(int[] arr1 , int[] arr2, int i , int j){
        if(arr1[i]>arr2[j]) {
            int temp = arr1[i];
            arr1[i] = arr2[j];
            arr2[j] = temp;
        }
    }
    static void merge(int[] arr1, int[] arr2, int m , int n) {
        int len = m + n;
        int gap = (len/2) + (len % 2);
        while(gap>0) {
            int left = 0;
            int right = left + gap;
            while(right < len) {
                if(left < m && right >= m) {
                    swapifgreater(arr1, arr2, left, right-m);
                }
                else if(left >= m && right >= m) {
                    swapifgreater(arr1, arr2, left-m, right-m);
                }
                else {
                    swapifgreater(arr1, arr2, left, right);
                }
                left++;
                right++;
            }
            if(gap==1) {
                break;
            }
            gap = (gap/2) + (gap%2);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr1 = { 1, 5, 9, 10, 15, 20 };
        int[] arr2 = { 2, 3, 8, 13 };
        int m = arr1.length;
        int n = arr2.length;
        merge(arr1, arr2, m, n);
        System.out.print("After Merging \nFirst Array: ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.print("\nSecond Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
        in.close();
    }
}
