/*Implement code in java in which you have been Given a postfix expression, the task is to evaluate the postfix expression.

Postfix expression: The expression of the form “a b operator” (ab+) i.e., when a pair of operands is followed by an operator.

Examples:

Input: str = “2 3 1 * + 9 -“
Output: -4
Explanation: If the expression is converted into an infix expression, it will be 2 + (3 * 1) – 9 = 5 – 9 = -4.

Input: str = “100 200 + 2 / 5 * 7 +”
Output: 757

Approach - Using Stack

Time Complexity : O(N)
Space Complexity : O(N)*/

import java.util.Stack;
public class P05_Postfix_exp {
    static int evaluate(String exp){
      Stack<Integer> st= new Stack<>();
      for(int i =0;i<exp.length();i++){
        char ch = exp.charAt(i);
        if(Character.isDigit(ch))
           st.push(ch-'0');
       else {
       int val1 = st.pop();
       int val2 = st.pop();
       switch(ch){
          case '+':
           st.push(val2+val1);
           break;
          case '-':
            st.push(val2-val1);
            break;
          case '*':
            st.push(val2*val1);
            break;
          case '/':
            st.push(val2/val1);
            break;
       }

    }
    }
    return st.pop();
    }
    public static void main(String[] args) {
        String exp = "231*+9-";
        System.out.println("Postfix evaluation is : " + evaluate(exp));
    }
}
