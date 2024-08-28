/*Implement a code in java in which we are given a string, reverse it using stack. 

Example:

Input: str = “GeeksQuiz”
Output: ziuQskeeG

Input: str = “abc”
Output: cba

Time Complexity : O(N)
Space Complexity : O(N)*/

/* 
class Stack{
    int size,top;
    char[] a;

    boolean isEmpty(){ return(top<0);}

    Stack(int n){
        top = -1;
        size = n;
        a = new char[size];
    }
    boolean push(char x){
        if(top>=size){
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top] = x;
            return true;
        }
    }
    char pop(){
        if(top<0){
            System.out.println("stack underflow");
            return 0;
        } else {
            char x = a[top--];
            return x;
        }
    }
}
public class P01_Reversestring_Stack {
   public static void reverse(StringBuffer str){
    int n = str.length();
    Stack obj = new Stack(n);

    int i;
    for(i=0;i<n;i++)
        obj.push(str.charAt(i));

    for(i=0;i<n;i++){
        char ch = obj.pop();
        str.setCharAt(i, ch);;
    }
   } 
   public static void main(String[] args) {
    StringBuffer s = new StringBuffer("GeeksQuiz");
    reverse(s);
    System.out.println("Reversed string is " + s);
   }
}*/

/*Approach-2 InBuild library
 * 
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */

 import java.util.Stack;
 public class P01_Reversestring_Stack {
    static void the_helper(StringBuilder str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++) s.push(str.charAt(i));
        str.delete(0, str.length());

        while(!s.empty()){
            str.append(s.peek());
            s.pop();
        }
    }
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("GeeksQuiz");
        the_helper(str);
        System.out.println("Reversed String is: "+str);
    }
 }