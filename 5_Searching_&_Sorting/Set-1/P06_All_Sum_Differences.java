/*Implement Code in java in which we are given Given a positive value N, we need to find the count of numbers smaller than N such that the difference between the number and sum of its digits is greater than or equal to given specific value diff. 
Examples: 
 

Input : N = 13, diff = 2
Output : 4
Then 10, 11, 12 and 13 satisfy the given
condition shown below,
10 – sumofdigit(10) = 9 >= 2
11 – sumofdigit(11) = 9 >= 2
12 – sumofdigit(12) = 9 >= 2
13 – sumofdigit(13) = 9 >= 2  
Whereas no number from 1 to 9 satisfies 
above equation so final result will be 4

Time Complexity :
Space Complexity:*/

public class P06_All_Sum_Differences {
    static int sumofdigit(int K){
        int s =0;
        while(K != 0){
            s += K % 10;
            K /= 10;
        }
     return s;
    }    
    static int totalNumberDifference(int N, int diff){
        int low = 1, high = N;
        while(low <= high) {
            int mid = (low + high)/2;
            if(mid - sumofdigit(mid)<diff) 
               low = mid + 1;
            else
                high = mid - 1;
        }
        return ( N - high);
    }
    public static void main(String args[])
    {
        int N = 13;
        int diff = 2;
      
        System.out.println(totalNumberDifference(N, diff)); 
    }
}