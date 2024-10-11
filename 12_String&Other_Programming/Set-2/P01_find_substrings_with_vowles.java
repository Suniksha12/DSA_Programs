/*Implement code in java in which wehave been given a string in lowercase alphabets. We need to print substrings that contain all the vowels at least one time and there are no consonants (non-vowel characters) present in the substrings.

Examples:  

Input : str = aeoibddaeoiud
Output : aeoiu

Input : str = aeoibsddaeiouudb
Output : aeiou, aeiouu

Approach - 1 Hashing
Time Complexity : O(n^2)
Space Complexity : O(1)*/

import java.util.HashSet;

public class P01_find_substrings_with_vowles {
      static boolean isVowel(char x){
        return(x=='a'||x=='e'||x=='i'||x=='o'||x=='u');
      }    
      static void findSubstring(String str){
        HashSet<Character> hash = new HashSet<Character>();
        int n = str.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isVowel(str.charAt(j))==false)
                   break;
                hash.add(str.charAt(j));
                if(hash.size()==5)
                System.out.print(str.substring(i, j + 1) + " ");
            }
            hash.clear();
        }
      }
      public static void main(String[] args) {
        String str = "aeoibsddaeiouudb";
        findSubstring(str);
      }
}