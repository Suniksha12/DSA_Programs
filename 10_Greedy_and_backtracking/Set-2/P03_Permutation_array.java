/*Implement Code in java in which we have been Given an array arr[] the task is to 
print all the possible permutations of the given array.

Examples:

Input: arr[] = {1, 2, 3}
Output: {1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 2, 1}, {3, 1, 2}
Explanation: There are 6 possible permutations 

Time complexity : O(N*N!)
Space Complexity : O(N)*/

import java.util.List;
import java.util.ArrayList;

public class P03_Permutation_array {
    static void permutations(List<List<Integer>> res, int[] arr, int idx) {
        if (idx == arr.length) {
            res.add(convertArrayList(arr));
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            swap(arr, idx, i);
            permutations(res, arr, idx + 1);
            swap(arr, idx, i);
        }
    }

    static List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        permutations(res, arr, 0);
        return res;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static List<Integer> convertArrayList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<List<Integer>> res = permute(arr);
        for (List<Integer> x : res) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
