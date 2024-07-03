/* Implement Code in java such that Given N(very large), the task is to print the largest palindromic number obtained 
by permuting the digits of N. If it is not possible to make a palindromic number, then print an appropriate message.

Input : 313551
Output : 531135
Explanations : 531135 is the largest number 
which is a palindrome, 135531, 315513 and other 
numbers can also be formed but we need the highest 
of all of the palindromes. 

Input : 331
Output : 313

Input : 3444
Output : Palindrome cannot be formed 

Approach - Greedy Algorithm

Time Complexity : O(N)
Space Complexity : O(N)*/

import java.util.HashMap;

public class largest_palindrome {
    static boolean possibility(HashMap<Integer, Integer> m, int length, String s) {
        int countodd = 0;
        for(int i =0;i<length;i++) {
            if(m.get(s.charAt(i) - '0') % 2 == 1) 
               countodd++;

            if(countodd > 1)
               return false;
        }
        return true;
    }
    static void largestpalindrome(String s) {
        int l = s.length();
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i =0;i<l;i++)
           if(m.containsKey(s.charAt(i) - '0'))
              m.put(s.charAt(i) - '0' , m.get(s.charAt(i) - '0') + 1);
           else
              m.put(s.charAt(i) - '0', 1);

            if(possibility(m, l, s) == false) {
                System.out.print("Palindrome cannot be formed");
                return;
            }

            char []largest = new char[l];
            int front = 0;
            for(int i =9;i>=0;i--) {
                if(m.containsKey(i) && m.get(i) % 2==1) {
                    largest[l / 2] = (char)(i+48);
                    m.put(i,m.get(i) - 1);
                    while(m.get(i) > 0) {
                        largest[front] = (char)(i+48);
                        largest[l - front - 1] = (char)(i+48);
                        m.put(i,m.get(i) - 2);
                        front++;
                    }
                }
                else {
                    while(m.containsKey(i) && m.get(i) > 0) {
                        largest[front] = (char)(i + 48);
                        largest[l - front - 1] = (char)(i + 48);
                        m.put(i, m.get(i)-2);
                        front++;
                    }
                }
            }
            for(int i =0;i<l;i++)
                System.out.print(largest[i]);
    }
    public static void main(String[] args) {
        String s = "313551";
        largestpalindrome(s);
    }
}
