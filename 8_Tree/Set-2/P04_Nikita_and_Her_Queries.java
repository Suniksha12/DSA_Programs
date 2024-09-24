/*Implement Code in java in whih we have the Nitika recently read about XOR operation, and she got obsessed with it. She has an array a containing N Positive integers. She wants to perform Q queries on the array. In a query, she gives two integers L and R (1 based indexing). Now, she asks what is the xor of all the elements of the array after not including the subarray ranging from L to R (both inclusive). Nitika guarantees that in each query, The resulting array is not empty. The queries are given in a 2D matrix query having L and R for each entry.

Examples:

Input: N = 10, Q = 3, a[] = {4, 7, 8, 5, 9, 6, 1, 0, 20, 10}, query = {{3, 8},{1, 6},{2, 3}}
Output:
29
31
17
Explanation: For the first query: The resulting array is: (4 ,7 ,20, 10). Their Xor will be: 29.
For the Second query: The resulting array is: (1, 0, 20, 10). Their Xor will be: 31.
For the Third query: The resulting array is: (4, 5, 9, 6, 1,0 ,20, 10). Their Xor will be: 17.

Time Complexity : O(N+Q)
Space Complexity : O(N)*/

import java.util.ArrayList;
import java.util.List;

public class P04_Nikita_and_Her_Queries {
    static List<Integer> specialXor(int N, int Q, int[] a, int[][] query) {
        List<Integer> x = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        x.add(a[0]);
        for (int i = 1; i < N; i++) {
            x.add(a[i] ^ x.get(i - 1));
        }
        int sep_xor = 0;
        for (int i = 0; i < Q; i++) {
            int l = query[i][0] - 1, r = query[i][1] - 1;
            if (l == 0)
                sep_xor = x.get(r);
            else
                sep_xor = x.get(r) ^ x.get(l - 1);
            ans.add(x.get(N - 1) ^ sep_xor);
        }
        return ans;
    }

    public static void main(String[] args) {
        int N = 10, Q = 3;
        int[] a = { 4, 7, 8, 5, 9, 6, 1, 0, 20, 10 };
        int[][] query = { { 3, 8 }, { 1, 6 }, { 2, 3 } };

        List<Integer> result = specialXor(N, Q, a, query);
        System.out.print("Results: ");
        for (int res : result) {
            System.out.print(res + " ");
        }
        System.out.println();
    }
}
