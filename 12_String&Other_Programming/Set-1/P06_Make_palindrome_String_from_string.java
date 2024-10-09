/*Implement Code in java in which we have been Given a string S consisting of lower-case English alphabets only, we have two players playing the game. The rules are as follows:  

The player can remove any character from the given string S and write it on paper on any side(left or right) of an empty string.
The player wins the game, if at any move he can get a palindromic string first of length > 1.
If a palindromic string cannot be formed, Player-2 is declared the winner.
Both play optimally with player-1 starting the game. The task is to find the winner of the game. 

Examples: 


Input: S = “abc” 
Output: Player-2 
Explanation: 
There are all unique characters due to which there 
is no way to form a palindromic string of length > 1

Time Complexity : O(N)
Space cOmplexity : O(1)*/

import java.util.Arrays;

public class P06_Make_palindrome_String_from_string {
    static int palindromicWinner(String s) {
        int freq[] = new int[26];
        Arrays.fill(freq, 0);
        int count = 0;
        for (int i = 0; i < (int) s.length(); ++i) {
            if (freq[s.charAt(i) - 'a'] == 0)
                count++;
            freq[s.charAt(i) - 'a']++;
        }
        int unique = 0;
        int duplicate = 0;
        for (int i = 0; i < 26; ++i) {
            if (freq[i] == 1)
                unique++;
            else if (freq[i] >= 2)
                duplicate++;
        }
        if (unique == 1 && (unique + duplicate) == count)
            return 1;
        return 2;
    }

    public static void main(String[] args) {
        String S = "abcbc";
        System.out.println("Player-" + palindromicWinner(S));
    }
}
