/*Implement Code in java such that you are Given an expression string exp, write a program to examine whether the pairs and the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in the given expression.

Example: 

Input: exp = “[()]{}{[()()]()}” 
Output: Balanced
Explanation: all the brackets are well-formed

Approach 1 - Using Stack

Time Comlexity : O(N)
Space Complexity : O(N)*/

/*
public class P03_Balanced_Brackets {
    static boolean balanced(String expr){
        Deque<Character> stack = new ArrayDeque<Character>();
        for(int i=0;i<expr.length();i++){
            char x = expr.charAt(i);
            if(x=='(' || x=='[' || x=='{'){
                stack.push(x);
                continue;
            }
            if(stack.isEmpty())
               return false;
            char check;
            switch(x){
                case ')':
                   check = stack.pop();
                   if(check == '{' || check == '[') return false;
                   break;
                case '}':
                   check = stack.pop();
                   if(check == '(' || check =='[') return false;
                   break;
                case ']':
                   check = stack.pop();
                   if(check == '(' || check == '{') return false;
                   break;
            }
        }
        return(stack.isEmpty());
    }
    public static void main(String[] args) {
        String expr = "([{}])";
        if(balanced(expr))
          System.out.println("Balanced");
        else 
          System.out.println("Not Balanced");
    }
}*/

/*Approach - 2 Without Using Stack 
 * 
 * Time Complexity :O(N)
 * Space Complexity : O(N)
*/

public class P03_Balanced_Brackets {
     static boolean balanced(String s){
        int i =-1;
        char[] stack = new char[s.length()];
        for(char ch:s.toCharArray()) {
            if(ch=='(' || ch=='{' || ch == '[') stack[++i] = ch;
            else {
                if(i>=0 && ((stack[i] == '(' && ch == ')')
                || (stack[i] == '{' && ch == '}')
                || (stack[i] == '[' && ch == ']')))
                   i--;
                else return false;
            }
        }
        return i==-1;
     }
public static void main(String[] args) {
    
    String expr = "{()}[]";
    if(balanced(expr))
    System.out.println("Balanced");
    else
        System.out.println("Not Balanced");
}
}