/*Implememt Code in java in which we have been Given a number in the form of string, the task is to find the remainder when N is divided by 11. The input of number may be very large.

Examples: 

Input: str = 3435346456547566345436457867978 
Output: 4
Explanation: 

For first digit ‘3’: remainder = (0×10+3) mod  11 = 3
For second digit ‘4’: remainder=(3×10+4) mod  11 = 1 , Continuing this way, calculate until the last digit.
Input: str = 13589234356546756
Output: 6
Explanation:

For first digit ‘1’: remainder = (0×10+1) mod  11 = 1
For second digit ‘3’: remainder=(1×10+3) mod  11 = 2, Continuing this way, calculate until the last digit.

Approach - Naive Approach 
Time Complexity : O(d)
Space Complexity : O(1)*/

/*
public class P03_Remainder_Mod_11 {
    static int remainder(String str){
        int len = str.length();
        int num,rem=0;
        for(int i=0;i<len;i++){
            num = rem*10+(str.charAt(i)-'0');
            rem = num % 11;
        }
        return rem;
    }
    public static void main(String[] args) {
        String str = "3435346456547566345436457867978";
        System.out.println(remainder(str));
    }
} */

/*Approach - 2 Using Divisibility Rule of 11
 * 
 * Time Complexity : O(d)
 * Space Complexity : O(1)
*/

public class P03_Remainder_Mod_11 {
   public static int remainder(String str){
    int n = str.length();
    int sum=0;
    for(int i=n-1;i>=0;i--){
        int digit = str.charAt(i) - '0';
        if((n-i)%2==0){
            sum = (sum - digit + 11) % 11;
        }
        else {
            sum = (sum + digit) % 11;
        }
    }
    return sum;
   }    
   public static void main(String[] args) {
    String str = "3435346456547566345436457867978";
        System.out.println(remainder(str));
   }
}
