/*Implement Code in java in which we have been Given text string with length n and a pattern with length m, the task is to prints all occurrences of pattern in text.
Note: You may assume that n > m.

Examples: 

Input:  text = “THIS IS A TEST TEXT”, pattern = “TEST”
Output: Pattern found at index 10 

Time Complexity : O(N^2)
Space Complexity : O(1)*/

public class P01_Naive_Algorithm_pattern_searching {
    public static void search(String pat,String txt){
        int M = pat.length();
        int N = txt.length();
        for(int i=0;i<=N-M;i++){
            int j;
            for(j=0;j<M;j++){
                if(txt.charAt(i+j)!=pat.charAt(j)){
                    break;
                }
            }
            if(j==N){
                System.out.println("Pattern Found at index" + i);
            }
        }
    }
    public static void main(String[] args) {
        String txt1 = "AABAACAADAABAABA";
        String pat1 = "AABA";
        System.out.println("Example 1:");
        search(pat1, txt1);

        String txt2 = "agd";
        String pat2 = "g";
        System.out.println("\nExample 2:");
        search(pat2, txt2);
    }
}
