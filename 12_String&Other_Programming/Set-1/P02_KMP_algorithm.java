/*Implement Code in java in which we have been Given two strings txt and pat of size N and M, where N > M. String txt and pat represent the text and pattern respectively. The task is to print all indexes of occurrences of pattern string in the text string. Use one-based indexing while returning the indices.

Examples:

Input:  txt = “THIS IS A TEST TEXT”, pat = “TEST”
Output: Pattern found at index 10


Input:  txt=  “AABAACAADAABAABA”
          pat =  “AABA”
Output: Pattern found at index 0, Pattern found at index 9, Pattern found at index 12

Time Complexity : O(N+M)
Space Complexity : O(M)*/

import java.util.List;
public class P02_KMP_algorithm {
    static void computeLPSArray(String pat, int M , int[] lps){
        int len =0;
        lps[0]=0;
        int i=1;
        while(i<M){
            if(pat.charAt(i)==pat.charAt(len)) {
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len !=0){
                    len = lps[len-1];
                }
                else {
                    lps[i] =0;
                    i++;
                }
            }
        }
    }
    static List<Integer> KMPSearch(String pat, String txt){

    }
}
