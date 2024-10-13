/*Implement code in java in which we have been given  an array of integers, return all the elements having positive and negative values of a number that exists in the array.

Note : If no such pair exists, simply return an empty array, also multiple pairs of the same number could exist and you need to put each of them in the array. Return the pairs in sorted order.

Examples:

Input: arr[] = [1, -3, 2, 3, 6, -1, -3, 3]
Output: [-1, 1, -3, 3, -3, 3]
Explanation: The array contains both 1 and -1, and 3 & -3 two time.
Input: arr[] = [4, 8, 9, -4, 1, -1, -8, -9]
Output: [-1, 1, -4, 4, -8, 8, -9, 9]
Explanation: Here, the array contains the pairs 1 & -1, 4 & -4, 8 & -8, and 9 & -9.

Expected Time Complexity: O(n*log(n))
Expected Auxiliary Space: O(n) */

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

class P02_pairs_postive_neg_values {
    public static List<Integer> posNegPair(int[] arr) {
        // Code here
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int num:arr){
            set.add(num);
        }
        Arrays.sort(arr);

        for(int num:arr){
            if(num>0 && set.contains(-num)){
                result.add(-num);
                result.add(num);
            }
        }
        return result;
    } 
}