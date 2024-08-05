/*Implement code in java Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"] */

import java.util.ArrayList;
import java.util.List;

public class P04_Generate_parantheses {
    public void helper(int open , int close , int n , String temp, List<String> ans) {
        if(open == n && close == n) {
            ans.add(temp);
            return;
        }
        if(open < n) {
            temp += "(";
            helper(open + 1 , close , n , temp , ans);
            temp = temp.substring(0,temp.length()-1);
        }
        if(close < open) {
            temp += ")";
            helper(open, close + 1, n, temp, ans);
            temp = temp.substring(0,temp.length()-1);
        }

    }
    public List<String> generateParanthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(0,0,n,"",ans);
        return ans;
    }
   public static void main(String[] args) {
    int n =3;
    P04_Generate_parantheses gp = new P04_Generate_parantheses();
    List<String> gen = gp.generateParanthesis(n);
    System.out.println(gen);
   } 
}
