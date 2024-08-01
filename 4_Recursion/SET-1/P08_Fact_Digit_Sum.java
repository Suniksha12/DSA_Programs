/*Implement Code in java in which Given a number n, write code to find the sum of digits in the factorial of the number. Given n ≤ 5000
 Examples: 

Input : 10
Output : 27
Input : 100
Output : 648

Time Complexity : O(n^2)
Space Complexity : O(n)

Approach 1- using vector */

import java.util.ArrayList;

public class P08_Fact_Digit_Sum {
    static ArrayList<Integer> v = new ArrayList<>();
    static void multiply(int x) {
        int carry =0;
        int size = v.size();
        for(int i=0;i<size;i++) {
            int res = carry + v.get(i) * x;
            v.set(i,res % 10);
            carry = res / 10;
        }
        while (carry !=0) {
            v.add(carry % 10);
            carry /= 10;
        }
    }
    static int findSumOfDigits(int n) {
        v.add(1);
        for(int i =1;i<=n;i++)
            multiply(i);
        int sum =0;
        int size = v.size();
        for(int i =0;i<size;i++)
            sum += v.get(i);
        return sum;
    }
    public static void main(String[] args) 
{ 
    int n = 1000; 
    System.out.println(findSumOfDigits(n)); 
} 
}
