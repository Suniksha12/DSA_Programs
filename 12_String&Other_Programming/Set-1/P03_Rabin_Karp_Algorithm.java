/*Implememt Code in ajva in which we have Given a text T[0. . .n-1] and a pattern P[0. . .m-1], write a function search(char P[], char T[]) that prints all occurrences of P[] present in T[] using Rabin Karp algorithm. You may assume that n > m.

Examples: 


Input:  T[] = “THIS IS A TEST TEXT”, P[] = “TEST”
Output: Pattern found at index 10


Input:  T[] =  “AABAACAADAABAABA”, P[] =  “AABA”
Output: Pattern found at index 0
              Pattern found at index 9
              Pattern found at index 12
              
Time Complexity : O(N+M)
Space Complexity : O(1)*/

public class P03_Rabin_Karp_Algorithm {
    public final static int d = 256;

    static void search(String pat, String txt, int q) {
        int M = pat.length();
        int N = txt.length();
        int i, j;
        int p = 0;
        int t = 0;
        int h = 1;

        for (i = 0; i < M - 1; i++)
            h = (h * d) % q;

        for (i = 0; i < M; i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;

        }
        for (i = 0; i <= N - M; i++) {
            if (p == t) {
                for (j = 0; j < M; j++) {
                    if (txt.charAt(i + j) != pat.charAt(j))
                        break;
                }
                if (j == M)
                    System.out.println("Pattern Found at index " + i);
            }
            if (i < N - M) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + M)) % q;

                if (t < 0)
                    t = (t + q);
            }
        }
    }

    public static void main(String[] args) {
        String txt = "GEEKS FOR GEEKS";
        String pat = "GEEK";

        int q = 101;
        search(pat, txt, q);
    }
}
