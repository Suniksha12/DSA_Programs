//Implement a code in java to find the Sum of all numbers that can be formed with permutations of n digits

/* Time Complexity : O(n)
 * Space Complexity : O(1)
 */

import java.util.*;
public class Day_11_Sum_of_all_Possible_permutations {
    static int factorial(int n ){
        int f = 1;
        if(n==0 || n ==1)  return 1;
        for(int i = 2;i<=n;i++) 
            f = f*i;
        return f;
    }
    static int getsum(int arr[] , int n) {
        int fact = factorial(n);
        int digitsum = 0;
        for(int i =0;i<n;i++) 
            digitsum += arr[i];
        digitsum *= (fact/n);

        int res =0;
        for(int i =1 , k = 1; i <= n;i++) {
            res += (k * digitsum);
            k = k*10;
        }
        return res;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter elements in array : ");
        int arr[] = new int[3];
        int n = arr.length;
        for(int i =0;i<n;i++) 
            arr[i] = in.nextInt();

        System.out.println(getsum(arr, n));
    }
}
