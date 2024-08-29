/*implement Code in java in which we have Been Given a string of balanced expressions, find if it contains a redundant parenthesis or not. A set of parenthesis is redundant if the same sub-expression is surrounded by unnecessary or multiple brackets. Print ‘Yes‘ if redundant, else ‘No‘.

Note: Expression may contain ‘+‘, ‘*‘, ‘–‘ and ‘/‘ operators. Given expression is valid and there are no white spaces present.

Examples: 

Input: str = “((a+b))”
Output: YES
Explanation: ((a+b)) can reduced to (a+b), this Redundant

Input: str = “(a+(b)/c)”
Output: YES
Explanation: (a+(b)/c) can reduced to (a+b/c) because b is surrounded by () which is redundant.

Time Complexity : O(N)
Space Complexity : O(N)*/

import java.util.Stack;

public class P02_Redundant_Bracket_using_stack {
    static boolean check(String s){
        Stack<Character> st = new Stack<>();
        char[] str = s.toCharArray();
        for(char ch: str){
            if(ch==')'){
                char top = st.peek();
                st.pop();
                boolean flag = true;
                while(top != '('){
                    if(top == '+' || top =='-' || top =='*' || top =='/'){
                        flag = false;
                    }
                    top = st.peek();
                    st.pop();
                }
                if(flag==true){
                    return true;
                }
            }else {
                    st.push(ch);
                }
            }
            return false;
    }
    static void find(String str){
        boolean ans = check(str);
        if(ans==true){
            System.out.println("Yes");
        }else {
            System.out.println("NO");
        }
    }
    public static void main(String[] args){
        String s = "((a+b))";
         find(s);
    }
}
