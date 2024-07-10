/* Implement a code in such that we are Given an array of positive integers. 
All numbers occur an even number of times except one number which occurs 
an odd number of times. Find the number in O(n) time & constant space.

Input : arr = {1, 2, 3, 2, 3, 1, 3}
Output : 3

Input : arr = {5, 7, 2, 7, 5, 2, 5}
Output : 5

Approach - 1 : Nested Loop brute forec approach

Time Complexity : O(n^2)

Space Complexity : O(1) */

/*public class P04_Occurring_oddNumber {
    static int getOddOccurences(int arr[] , int arr_size) {
        int i;
        for(i =0;i<arr_size;i++) {
            int count = 0;
            for(int j =0;j<arr_size;j++) {
                if(arr[i] == arr[j]) 
                   count++;
            }
            if(count % 2 != 0)
               return arr[i];
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{ 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
        int n = arr.length;
        System.out.println(getOddOccurences(arr, n));
}
} */

/* Approach - 2  Hashing
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(n)
*/

/* 
import java.util.HashMap;

public class P04_Occurring_oddNumber { 
    static int getOddOccurences(int arr[] , int n) {
         HashMap<Integer, Integer> hamp = new HashMap<>();
         for(int i =0;i<n;i++) {
            if(hamp.containsKey(arr[i])) {
                int val = hamp.get(arr[i]);
                hamp.put(arr[i],val + 1);
            }
            else {
                hamp.put(arr[i],1);
            }
         }
         for(Integer a:hamp.keySet()) {
            if(hamp.get(a) % 2 != 0) return a;
         }
         return -1;
    }
    public static void main(String[] args) 
    {
        int arr[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        int n = arr.length;
        System.out.println(getOddOccurences(arr, n));
    } 
} */

/* Approach - 3 : Bitwise XOR
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(1)
*/

public class P04_Occurring_oddNumber { 
    static int getOddOccurences(int ar[] , int ar_size) {
        int i;
        int res = 0;
        for(i =0;i<ar_size;i++) {
            res = res ^ ar[i];
        }
        return res;
    }
    public static void main(String[] args) 
    {
        int ar[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        int n = ar.length;
        System.out.println(getOddOccurences(ar, n));
    }
}