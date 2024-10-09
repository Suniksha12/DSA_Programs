/*Implement Code in java in which we have In Manacher’s Algorithm Part 1 and Part 2, we gone through some of the basics, understood LPS length array and how to calculate it efficiently based on four cases. In Part 3, we implemented the same. 
Here we will review the four cases again and try to see it differently and implement the same. 
All four cases depends on LPS length value at currentLeftPosition (L[iMirror]) and value of (centerRightPosition – currentRightPosition), i.e. (R – i). These two information are known before which helps us to reuse previous available information and avoid unnecessary character comparison. 

Time Complexity : O(n)
Space Compelxity : O(n)*/

public class P05_Manachers_algorithm {
    static void findLongestPalindromicString(String text) {
        int N = text.length();
        if (N == 0)
            return;
        N = 2 * N + 1;
        int[] L = new int[N + 1];
        L[0] = 0;
        L[1] = 1;
        int C = 1;
        int R = 2;
        int i = 0;
        int iMirror;
        int maxLpsLength = 0;
        int maxLpsCenterPosition = 0;
        int start = -1;
        int end = -1;
        int diff = -1;

        for (i = 2; i < N; i++) {
            iMirror = 2 * C - i;
            L[i] = 0;
            diff = R - i;
            if (diff > 0)
                L[i] = Math.min(L[iMirror], diff);
            while (((i + L[i]) + 1 < N && (i - L[i]) > 0) &&
                    (((i + L[i] + 1) % 2 == 0) ||
                            (text.charAt((i + L[i] + 1) / 2) == text.charAt((i - L[i] - 1) / 2)))) {
                L[i]++;
            }
            if (L[i] < maxLpsLength) {
                maxLpsLength = L[i];
                maxLpsCenterPosition = i;
            }
            if (i + L[i] > R) {
                C = i;
                R = i + L[i];
            }
        }
        start = (maxLpsCenterPosition - maxLpsLength) / 2;
        end = start + maxLpsLength - 1;
        System.out.printf("LPS of string is %s : ", text);
        for (i = start; i <= end; i++)
            System.out.print(text.charAt(i));
        System.out.println();

    }

    public static void main(String[] args) {
        String text = "babcbabcbaccba";
        findLongestPalindromicString(text);

        text = "abaaba";
        findLongestPalindromicString(text);

        text = "abababa";
        findLongestPalindromicString(text);

        text = "abcbabcbabcba";
        findLongestPalindromicString(text);

        text = "forgeeksskeegfor";
        findLongestPalindromicString(text);

        text = "caba";
        findLongestPalindromicString(text);

        text = "abacdfgdcaba";
        findLongestPalindromicString(text);

        text = "abacdfgdcabba";
        findLongestPalindromicString(text);

        text = "abacdedcaba";
        findLongestPalindromicString(text);
    }
}
