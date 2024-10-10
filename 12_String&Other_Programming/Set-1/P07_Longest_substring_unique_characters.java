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

/* 
import java.util.Arrays;

public class P07_Longest_substring_unique_characters {
   final static int MAX_CHARS = 26;
   static boolean isValid(int count[], int k){
       int val =0;
       for(int i=0;i<MAX_CHARS;i++) {
           if(count[i]>0){
               val++;
           }
       }
       return (k>=val);
   }
   static void KUniques(String s, int k){
       int u=0;
       int n = s.length();

       int count[] = new int[MAX_CHARS];
       Arrays.fill(count, 0);

       for(int i=0;i<n;i++){
           if(count[s.charAt(i)-'a']==0){
               u++;
           }
           count[s.charAt(i)-'a']++;
       }
       if(u<k){
           System.out.print("Not enough unique Characters");
           return;
       }
       int curr_start=0,curr_end=0;
       int max_window_size =1;
       int max_window_start =0;
       Arrays.fill(count,0);

       count[s.charAt(0)-'a']++;

       for(int i=1;i<n;i++){
           count[s.charAt(i)-'a']++;
           curr_end++;

           while (!isValid(count, k)) {
               count[s.charAt(curr_start)-'a']--;
               curr_start++;
           }
           if(curr_end - curr_start+1 > max_window_size){
               max_window_size = curr_end - curr_start + 1;
               max_window_start = curr_start;
           }
       }
       System.out.println("Max substring is : "
       + s.substring(max_window_start, 
           max_window_start + max_window_size) 
       + " with length " + max_window_size); 
   }
   public static void main(String[] args) {
       String s = "aabacbebebe"; 
       int k = 3; 
       KUniques(s, k);
   }
} */

/*Approach - 3 Linear Time 
 * 
 * Time Compelxity :  O(|S|)
 * Space Complexity :  O(|S|)
 */

import java.util.HashMap;
import java.util.Map;

public class P07_Longest_substring_unique_characters {
    public static int longestKSubstr(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int i = -1;
        int j = -1;
        int ans = -1;

        while (true) {
            boolean flag1 = false;
            boolean flag2 = false;
            while (i < s.length() - 1) {
                flag1 = true;
                i++;
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                if (map.size() < k)
                    continue;
                else if (map.size() == k) {
                    int len = i - j;
                    ans = Math.max(ans, len);
                } else
                    break;
            }
            while (j < i) {
                flag2 = true;
                j++;
                char ch = s.charAt(j);

                if (map.get(ch) == 1)
                    map.remove(ch);
                else
                    map.put(ch, map.get(ch) - 1);

                if (map.size() == k) {
                    int len = i - j;
                    ans = Math.max(ans, len);
                    break;
                } else if (map.size() > k)
                    continue;
            }
            if (flag1 == false && flag2 == false)
                break;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;

        int ans = longestKSubstr(s, k);
        System.out.println(ans);
    }
}