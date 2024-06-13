//Implement Code in java the question is from TCS 

/*If you like numbers, you may have been fascinated by prime numbers. Sometimes we obtain by concatenating two primes. 
For example, concatenating 2 and 3, we obtain the prime 23. The aim is to find all such distinct “concatenated primes” 
that could be obtained by concatenating primes ≤ a given integer N. Input Format:

Integer N Output Format:

M, the number of distinct primes that could be obtained by concatenating two primes ≤ N Constraints:

N ≤ 70

Example 1

Input 10

Output 4

Explanations The primes ≤ 10 are 2, 3, 5, 7. 
These can be used to form the following concatenated numbers: 22, 23, 25, 27, 32, 33, 35, 37, 52, 53, 55, 57, 72, 73, 75, 77. 
Of these, there are four primes: 23 37 53 and 73. Hence the output is 4.

Example 2

Input 20

Output 17

Explanation The prime numbers up to 20 are 2 3 5 7 11 13 17 and 19.

Concatenating these two at a time in all possible ways, we get the following numbers:

22 23 25 27 211 213 217 219 32 33 35 37 311 313 317 319 52 53 55 57 511 513 517 519 72 73 75 77 711 713 717 719 112 113 115 117 
1111 1113 1117 1119 132 133 135 137 1311 1313 1317 1319 172 173 175 177 1711 1713 1717 1719 192 193 195 197 1911 1913 1917 1919

We have the following 17 primes numbers in this list: 23 37 53 73 113 137 173 193 197 211 311 313 317 719 1117 1319 1913 
Hence the output would be 17. */


import java.util.*;

public class Day_19_Concat_Prime {
    static boolean isPrime(int n) {
        if(n <= 1) return false;
        if(n <= 3) return true;
        if(n%2 == 0 || n % 3 ==0) return false;
        for(int i =5;i*i<=n;i=i+6) 
            if(n%i == 0 || n%(i+2)==0)
               return false;
        return true;
    }
    static int concatPrime(int N) {
        ArrayList<Integer> primes = new ArrayList<>();
    for(int i =2; i <= N; i++) 
       if(isPrime(i))
          primes.add(i);
   
    HashSet<Integer> uniqueprimes = new HashSet<>();
    for(int i = 0; i < primes.size(); i++) 
        for(int j = 0; j < primes.size(); j++) {
            String concat = Integer.toString(primes.get(i)) + Integer.toString(primes.get(j));
            int num = Integer.parseInt(concat);
            if(isPrime(num))
               uniqueprimes.add(num);
        }
        return uniqueprimes.size();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int num = in.nextInt();
         System.out.print(concatPrime(num));
         in.close();
    }
}
