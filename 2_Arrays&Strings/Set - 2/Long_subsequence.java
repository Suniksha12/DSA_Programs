/*Implemnt Code in java such that Given an array of integers, find the length of the longest sub-sequence such that 
elements in the subsequence are consecutive integers, the consecutive numbers can be in any order. 

Examples:  

Input: arr[] = {1, 9, 3, 10, 4, 20, 2}
Output: 4
Explanation: The subsequence 1, 3, 4, 2 is the longest subsequence of consecutive elements 

Approach - 1 Naive Approach

Time Complexity : O(N(log N))
Space complexity : O(N)*/

import java.util.*;
public class Long_subsequence {
    static int findlongestsubsequence(int arr[], int n) {
        Arrays.sort(arr);
        int ans =0, count =0;
        ArrayList<Integer> v = new ArrayList<>();
        v.add(10);

        for(int i =1;i<n;i++) {
            if(arr[i] != arr[i-1])
               v.add(arr[i]);
        }
        for(int i =0;i<v.size();i++) {
            if(i > 0 && v.get(i) == v.get(i-1) + 1) 
               count++;
            else 
               count = 1;
        ans = Math.max(ans,count);
        }
        return ans;
    }
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int arr[] = new int[7];
       int n = arr.length;
       for(int i =0;i<n;i++) {
        arr[i] = in.nextInt();
       }
       System.out.println(findlongestsubsequence(arr,n));
       in.close();
    }
}