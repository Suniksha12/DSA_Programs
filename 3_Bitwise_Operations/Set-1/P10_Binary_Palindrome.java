/*Implement Code in java in whichh we are Given an integer ‘x’, write a C function that returns true if binary representation of x is palindrome 
else return false.

For example a numbers with binary representation as 10..01 is palindrome and number with binary representation as 10..00 
is not palindrome. 

Approach - 1 Using left and right method 

Time Complexity : O(x)

Space Complexity : O(1)*/

/*
public class P10_Binary_Palindrome {
    static int KthBitSet(long x , long k) {
        int rslt = ((x & (1 << (k - 1))) != 0 ) ? 1:0;
        return rslt;
    }
    static int isPalindrome(long x) {
        long l = 1;
        long r = (Integer.SIZE/8) * 8;
        while(l<r) {
            if(KthBitSet(x,l) != KthBitSet(x,r)) {
                return 0;
            }
            l++;r--;
        }
        return 1;
    }
    public static void main (String[] args)
    { 
        long x = 1 << 15 + 1 << 16 ; 
        System.out.println(isPalindrome(x)); 
         
        x = (1 << 31) + 1 ; 
        System.out.println(isPalindrome(x)); 
    } 
} */

/* Approach 2 - Using reverse function()
 * 
 * Time Complexity : O(log(x))
 * 
 * Space Complexity : O(1)
 */

 public class P10_Binary_Palindrome {
static String bin(int n)
{ 
	String ans = ""; 
	while(n > 0){
	ans = (Integer.toString(n&1)) + ans;
	n >>= 1; 
	}

	return ans; 
}

static int checkPalindrome(int n){
	String s1 = bin(n);
	StringBuilder s2 = new StringBuilder(s1);
	s2 = s2.reverse();
	return s1.equals(s2.toString()) ? 1 : 0;
}

public static void main(String[] args) {
	int x = 9; 
	System.out.println(checkPalindrome(x)); 
	x = 10; 
	System.out.println(checkPalindrome(x)); 
}
}

