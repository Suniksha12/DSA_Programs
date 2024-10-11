/*Implement Code in java in which we have been Given a string P consisting of small English letters and a string Q consisting of weight of all characters of English alphabet such that for all ‘i’, 0 ? Q[i] ? 9. The task is to find the total numbers of unique substring with sum of weights atmost K.
Examples:


Input: P = “ababab”, Q = “12345678912345678912345678”, K = 5 
Output: 7 
Explanation: 
The substrings with the sum of weights of individual characters ? 5 are: 
“a”, “ab”, “b”, “bc”, “c”, “d”, “e”
Input: P = “acbacbacaa”, Q = “12300045600078900012345000”, K = 2 
Output: 3 
Explanation: 
The substrings with the sum of weights of individual characters ? 2 are: 
“a”, “b”, “aa” 

Approach - Unordered set
Time Complexity : O(N^2)*/

import java.util.HashSet;

public class P02_Count_substring_with_weight_of_chars_atmostOf_K {
    static int distinctSubstring(String P, String Q, int k, int N) {
        HashSet<String> S = new HashSet<String>();
        for (int i = 0; i < N; i++) {
            int sum = 0;
            String s = "";
            for (int j = i; j < N; ++j) {
                int pos = P.charAt(j) - 'a';

                sum += Q.charAt(pos) - '0';

                s += P.charAt(j);

                if (sum <= k) {
                    S.add(s);
                } else {
                    break;
                }
            }
        }
        return S.size();
    }

    public static void main(String[] args) {
        String P = "abcde";
        String Q = "12345678912345678912345678";
        int K = 5;
        int N = P.length();

        System.out.print(distinctSubstring(P, Q, K, N));
    }
}
