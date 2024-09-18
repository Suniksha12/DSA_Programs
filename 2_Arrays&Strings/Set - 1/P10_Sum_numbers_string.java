/* Implement Code in java such that we are Given a string str containing alphanumeric characters. 
The task is to calculate the sum of all the numbers present in the string.

Inpput : str = 1abc23
Output : 24

Time complexity : O(N)
Space Complexity : O(N) */

import java.util.*;

public class P10_Sum_numbers_string {
    public static long findSum(String str) {
        int number =0;
        int ans = 0;
        for(int i =0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9') {
                int N = ch-'0';
                number = number * 10 + N;
            } else {
                ans += number;
                number = 0;
            }
        }
        ans += number;
        return ans;
    }
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = in.nextLine();
        System.out.print(findSum(str));
        in.close();
    }
}
