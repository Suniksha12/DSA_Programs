/*Implement code in java in which we have been Given a string you need to print longest possible substring that has exactly M unique characters. If there is more than one substring of longest possible length, then print any one of them.

Examples: 


Input: Str = “aabbcc”, k = 1
Output: 2
Explanation: Max substring can be any one from {“aa” , “bb” , “cc”}.


Input: Str = “aabbcc”, k = 2
Output: 4
Explanation: Max substring can be any one from {“aabb” , “bbcc”}.


Input: Str = “aabbcc”, k = 3
Output: 6
Explanation: 
There are substrings with exactly 3 unique characters
{“aabbcc” , “abbcc” , “aabbc” , “abbc” }
Max is “aabbcc” with length 6.

Approach - 1 Brute Force 
Time Complexity :O(n^2)
Space Complexity : O(n)*/

/*
import java.util.HashSet;

public class P07_Longest_substring_unique_characters {
    static void longestKSubstr(String s, int k) {
        int n = s.length();
        int answer = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                HashSet<Character> distinct = new HashSet<Character>();
                for (int x = i; x < j; x++) {
                    distinct.add(s.charAt(x));
                }
                if (distinct.size() == k) {
                    answer = Math.max(answer, j - i);
                }
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;

        longestKSubstr(s, k);
    }
}
*/

/*Approach - 2 Linear Time
 * 
 * Time Complexity : linear
 * Space Compelxity : O(MAX_CHARS).
 */
