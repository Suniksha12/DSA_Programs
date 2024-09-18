//Implement code in java 

/* Given a string str and the task is to count palindrome words present in the string str.

Examples: 

Input : Madam Arora teaches malayalam
Output : 3
The string contains three palindrome words (i.e.,
Madam, Arora, malayalam) so the count is three.

Time Complexity : O(n^2)
Space complexity : O(n)*/


import java.util.*;

public class Day_20_Count_palin_words {
    static boolean checkPalin(String word) {
        int n = word.length();
        word = word.toLowerCase();
        for(int i =0;i<n;i++,n--)
           if(word.charAt(i) != word.charAt(n-1))
              return false;
        return true;
    }
    static int countPalin(String str) {
        str = str + " ";
        String word = "";
        int count = 0;
        for(int i =0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch!= ' ')
               word = word + ch;
            else {
                if(checkPalin(word))
                   count++;
                word = "";
            }
        }
        return count;


    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = in.nextLine();
        System.out.print(countPalin(str));
        in.close();
    }
}
