/*Implement Code in java in which we have been Given two strings txt and pat of size N and M, where N > M. String txt and pat represent the text and pattern respectively. The task is to print all indexes of occurrences of pattern string in the text string. Use one-based indexing while returning the indices.

Examples:

Input:  txt = “THIS IS A TEST TEXT”, pat = “TEST”
Output: Pattern found at index 10


Input:  txt=  “AABAACAADAABAABA”
          pat =  “AABA”
Output: Pattern found at index 0, Pattern found at index 9, Pattern found at index 12

Time Complexity : O(N+M)
Space Complexity : O(M)*/

import java.util.ArrayList;
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
       int M = pat.length();
       int N = txt.length();

       int[] lps = new int[M];
       List<Integer> result = new ArrayList<>();
       computeLPSArray(pat,M,lps);

       int i=0;
       int j=0;
       while((N-i)>=(M-j)){
        if(pat.charAt(j) == txt.charAt(i)){
            j++;
            i++;
        }
        if(j==M){
            result.add(i-j+1);
            j=lps[j-1];
        } else if(i<N && pat.charAt(j)!= txt.charAt(i)){
            if(j!=0){
                j=lps[j-1];
            }else {
                i=i+1;
            }
        }
       }
       return result;
    }
    public static void main(String[] args) {
        String txt = "geeksforgeeks";
        String pat = "geeks";

        List<Integer> result = KMPSearch(pat, txt);
        for(int index:result){
            System.out.print(index+" ");
        }
    }
}
