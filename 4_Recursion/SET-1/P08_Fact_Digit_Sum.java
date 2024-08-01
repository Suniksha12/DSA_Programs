/*Implement Code in java in which Given a number n, write code to find the sum of digits in the factorial of the number. Given n ≤ 5000
 Examples: 

Input : 10
Output : 27
Input : 100
Output : 648

Time Complexity : O(n^2)
Space Complexity : O(n)

Approach 1- using vector */

/* 
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
*/

/*Approach - 2 Using For Loop 
 * 
 * Time Complexity : O(n)
 * Space Compelxity : O(1)
 */

import java.math.BigInteger;

public class P08_Fact_Digit_Sum {
    public static int sumofdigitsfactorial(int n) {
        BigInteger fact = BigInteger.ONE;
        for(BigInteger i = BigInteger.valueOf(2);
            i.compareTo(BigInteger.valueOf(n)) <= 0;
            i = i.add(BigInteger.ONE)){
            fact = fact.multiply(i);
    }
    int sumOfDigits =0;
    for(char digit : fact.toString().toCharArray()) {
        sumOfDigits += Character.getNumericValue(digit);
    }
    return sumOfDigits;
}
public static void main(String[] args)
    {
        System.out.println(
            "Sum of digits factorial for n=10: "
            + sumofdigitsfactorial(10));
        System.out.println(
            "Sum of digits factorial for n=100: "
            + sumofdigitsfactorial(100));
    }
}
