/*Implement Code in java in which we have suppose There are ‘N’ chocolates in a row, not necessarily from distinct manufacturers. You are allowed to pick any continuous segment of ‘K’ chocolates.

Once you pick them, you start eating the ones you picked, however, even if you have picked multiple chocolates from the same manufacturer, you will eat at most one chocolate from each manufacturer (See samples for more clarity). Now, you need to calculate how many chocolates you can eat, if you pick the segment [i,i+K-1] for all i i ∈ (1,N).

For example:

If one particular segment in an array is 1 4 3 4 1, you can eat only 3 chocolates, namely, from manufacturer 1, 4 and 3.
Detailed explanation ( Input/output format, Notes, Images )
Constraints -
1 <= 'T' <= 10
2 <= ‘K’<= ‘N’ <= 10^5
1 <= Chocolate[i] <= 10^9, i ∈ (1,N) 
Note - The sum of 'N' over all test cases does not exceed 10^5.
Time Limit: 1 sec
Sample Input 1:
2
6 3
1 4 3 4 4 4
5 2
1 1 1 1 1
Sample Output 1
3 2 2 1
1 1 1
Explanation for Sample Input 1:
In test case 1:
    The first segment is [1,4,3], so you can eat three chocolates, from manufacturers 1,4 and 3. 
    The second segment is [4,3,4], so you can eat two chocolates, from manufacturers 4 and 3.
    The third segment is [3,4,4], so you can eat two chocolates, from manufacturers 3 and 4.
    The fourth segment is [4,4,4], so you can eat only one chocolate, from manufacturer 4.

In test case 2:
    In all segments you can only eat one chocolate, from manufacturer 1.
Sample Input 2:
1
4 2
1 2 3 4
Sample Output 2:
2 2 2 

Approach - sliding window 
Time Complexity : O(n)
Space Complexity : O(n)*/

import java.util.HashMap;
import java.util.Map;

public class P02_Eat_Chocolates {
    public static int[] countChocolates(int n, int k, int[] chocolates) {
        // Write your code here.
        int[] result = new int[n - k + 1];
        Map<Integer, Integer> manufacturerCount = new HashMap<>();

        for (int i = 0; i < k; i++) {
            manufacturerCount.put(chocolates[i], manufacturerCount.getOrDefault(chocolates[i], 0) + 1);
        }
        result[0] = manufacturerCount.size();

        for (int i = 1; i <= n - k; i++) {
            int outgoing = chocolates[i - 1];
            if (manufacturerCount.get(outgoing) == 1) {
                manufacturerCount.remove(outgoing);
            } else {
                manufacturerCount.put(outgoing, manufacturerCount.get(outgoing) - 1);
            }
            int incoming = chocolates[i + k - 1];
            manufacturerCount.put(incoming, manufacturerCount.getOrDefault(incoming, 0) + 1);
            result[i] = manufacturerCount.size();
        }

        return result;
    }
}
