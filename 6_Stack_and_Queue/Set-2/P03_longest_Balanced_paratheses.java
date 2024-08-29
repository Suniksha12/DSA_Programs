/*Implement a code in java in which we have been Given a string of open bracket ‘(‘ and closed bracket ‘)’. The task is to find the length of longest balanced prefix. 

Examples: 

Input : S = "((()())())((" 
Output : 10
From index 0 to index 9, they are forming 
a balanced parentheses prefix.

Input : S = "()(())((()"
Output : 6

Time Complexity :O(len(str))
Space Complexity : O(1)*/

public class P03_longest_Balanced_paratheses {
    static int balanced(String str , int n){
        int max_length =0;
        int open_count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                open_count++;
            }
            else {
                if(open_count>0){
                    open_count--;
                    max_length = i+1;
                }
                else {
                    break;
                }
            }
        }
        return max_length;
    }
    public static void main(String[] args) {
        String str = "((()())())((";
        int n = str.length();
        System.out.println(balanced(str, n));
    }
}
