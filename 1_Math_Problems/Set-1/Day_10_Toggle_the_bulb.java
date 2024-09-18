//Implement a java program to Count the number of times a Bulb switches its state

/* Given two arrays switch[], consisting of binary integers denoting whether a switch is ON(0) or OFF(1), 
and query[], where query[i] denotes the switch to be toggled. The task after completing all the switch toggles is 
to print the number of times the bulb changes its state, i.e. from ON to OFF or vice-versa.
 
Time Complexity - O(N)
Space Complexity - O(1) */

import java.util.*;

public class Day_10_Toggle_the_bulb {
   static int solve(int[] A, int n, int Q[], int q) {
    int one = 0;
    for(int i = 0;i<n;i++) 
        if(A[i] == 1)
          one++;
    int glows = 0, count =0;
    if(one >= (int)Math.ceil(n/2))
       glows = 1;

    for(int i =0;i<q;i++) {
        int prev = glows;
        if(A[Q[i]-1] == 1)
           one--;
        if(A[Q[i]-1] == 0)
           one++;

        A[Q[i]-1] ^= 1;

        if(one >= (int)Math.ceil(n/2.0)) {
            glows = 1;
        } else {
            glows = 0;
        }
        if(prev != glows)
           count++;
    }
    return count;
   } 
   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int n = in.nextInt();
      System.out.print("Enter the values in Array: ");
      int arr[] = new int[n];
      for(int i =0;i<n;i++) {
        arr[i] = in.nextInt();
      }
      System.out.print("Enter a number : ");
      int q = in.nextInt();
      System.out.print("Enter the values in Query : ");
      int Q[] = new int[q];
      for(int i =0;i<q;i++) {
        Q[i] = in.nextInt();
      }
      System.out.println(solve(arr, n, Q, q));
   }
}
