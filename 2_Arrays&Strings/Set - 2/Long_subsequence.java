/*Implemnt Code in java such that Given an array of integers, find the length of the longest sub-sequence such that 
elements in the subsequence are consecutive integers, the consecutive numbers can be in any order. 

Examples:  

Input: arr[] = {1, 9, 3, 10, 4, 20, 2}
Output: 4
Explanation: The subsequence 1, 3, 4, 2 is the longest subsequence of consecutive elements 

Approach - 1 Naive Approach

Time Complexity : O(N(log N))
Space complexity : O(N)*/

/*import java.util.*;
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
} */

/* Approach 2 : hashing 
 Time Complexity : O(n)
 Space Complexity : O(n)*/ 

/*import java.util.*;
public class Long_subsequence { 
    static int findlongestsubsequence(int arr[], int n) {
       HashSet<Integer> s = new HashSet<>();
       int ans =0;
       for(int i =0;i<n;++i)
           s.add(arr[i]);

       for(int i =0;i<n;++i){
        if(!s.contains(arr[i] - 1)) {
            int j = arr[i];
            while(s.contains(j))
                j++;

            if(ans<j-arr[i]) 
               ans = j - arr[i];
        }
       }
       return ans;
    }
    public static void main(String[] args) {
       
        int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
        int n = arr.length;
        System.out.println(
            "Length of the Longest consecutive subsequence is "
            + findlongestsubsequence(arr, n)); 
    }
} */

/* Approach - 3 Priority Queue
 * Time Complexity : O(N*log(N))
 * Space Complexity : O(N)
 */

import java.util.*;
public class Long_subsequence { 
    static int findlongestsubsequence(int arr[] , int N) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0;i<N;i++) {
            pq.add(arr[i]);
        }
        int prev = pq.poll();
        int c =1;
        int max = 1;
        for(int i = 1;i<N;i++) {
            if(pq.peek() - prev > 1) {
                c = 1;
                prev = pq.poll();
            }
            else if(pq.peek() - prev == 0) {
                prev = pq.poll();
            }
            else {
                c++;
                prev = pq.poll();
            }
            if(max < c) {
                max = c;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
        int n = arr.length;
        System.out.println(
            "Length of the Longest consecutive subsequence is "
            + findlongestsubsequence(arr, n));
    }
}