/* Implement Code in java such that Given a string, print all permutations of it in sorted order. For example, if the input string is “ABC”, then output should be “ABC, ACB, BAC, BCA, CAB, CBA”
 * Time Complexity : O(n2 x n!) 
 * Space Complexity : O(n)
 */

import java.util.Arrays;

public class P04_permutation_in_sorted_order{
      static int findCeil(char[] str , char first , int l , int h) {
        int ceilIndex = l;
        for(int i =l+1;i<=h;i++) 
           if(str[i] > first && str[i] < str[ceilIndex])
              ceilIndex = i;

        return ceilIndex;
      }
      static void sortedPermutations(char[] str) {
        int size = str.length;
        Arrays.sort(str);
        boolean isFinished = false;
        while (!isFinished) {
            System.out.println(String.valueOf(str));
            int i;
            for(i = size - 2;i>=0;--i)
                if(str[i] < str[i+1])
                   break;

            if(i == -1)
              isFinished = true;
            else {
                int ceilIndex = findCeil(str, str[i] , i+1, size - 1);

                char temp = str[i];
                str[i] = str[ceilIndex];
                str[ceilIndex] = temp;

                Arrays.sort(str,i+1,size);
            }
        }
      }
      public static void main(String[] args)
      {
        char[] str = { 'A', 'B', 'C', 'D' };
        sortedPermutations(str);
      } 
 }