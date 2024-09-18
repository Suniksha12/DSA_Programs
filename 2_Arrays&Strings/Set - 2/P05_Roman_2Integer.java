/*Implement Code in java such that Given a string in roman form, the task is to convert this given roman string into an integer.
 * 
 * Input: IX
Output: 9
Explanation: IX is a Roman symbol which represents 9

Time Complexity : O(n)
Space Complexity : O(1)
  */

import java.util.*;
public class P05_Roman_2Integer {
    static int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
    static int romanToDecimal(String str) {
        int res =0;
        for(int i =0;i<str.length();i++) {
            int s1 = value(str.charAt(i));

            if(i+1 < str.length()) {
                int s2 = value(str.charAt(i+1));

                if (s1 >= s2) {
                    res = res + s1;
                } else {
                    res = res + s2 - s1;
                    i++;
                }
            } else {
                res = res + s1;
            }
        }
        return res;
 
    }
    public static void main(String args[])
    {

        String str = "MCMIV";
        System.out.println("Integer form of Roman Numeral"
                           + romanToDecimal(str));
    }
}
