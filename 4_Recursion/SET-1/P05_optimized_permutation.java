/*Optimized Code of Lexicographic order of a string.
 * 
 * Time Compplexity : O(n x n!)
 * 
 * Space Complexity : O(n)
 */

import java.util.Arrays;

public class P05_optimized_permutation {
      static void swap(char[] str, int i , int j) {
        char t = str[i];
        str[i] = str[j];
        str[j] = t;
      }
      static void reverse(char str[] , int l , int h) {
        while(l<h) {
            swap(str,l,h);
            l++;
            h--;
        }
      }
      static int findCeil(char str[] , char first , int l , int h) {
        int ceilIndex = l;
        for(int i =l+1;i<=h;i++)
            if(str[i] > first && str[i] < str[ceilIndex])
               ceilIndex = i;

        return ceilIndex;
        }
       static void sortedPermutations(char str[]) {
        int size = str.length;
        Arrays.sort(str);
        boolean isFinished = false;
        while(!isFinished) {
            System.out.println(str);
            int i;
            for(i = size - 2;i>=0;--i)
               if(str[i] < str[i+1])
                  break;
            
            if(i==-1)
               isFinished = true;
            else{
                int ceilIndex = findCeil(str, str[i], i+1, size-1);
                swap(str,i,ceilIndex);
                reverse(str, i+1, size-1);
            }
        }
       }
     public static void main(String[] args)
    {
        char str[] = "ABCD".toCharArray();
        sortedPermutations(str);
    }  
 }