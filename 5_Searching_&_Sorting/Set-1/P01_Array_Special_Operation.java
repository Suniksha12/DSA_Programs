/*Impplement Code in java in which You are given an array A of size N. You can perform an operation in which you will remove the largest and the smallest element from the array and add  their difference back into the array. So, the size of the array will decrease by 1 after each oepration. You are given Q tasks and in each task, you are given an integer K. For each task, you have to tell sum of all the elements in the array after K operations.

Input:

First line contains two space-separated integers N and Q, denoting the number of elements in array and number of queries respectively.

Next line contains N space-separated integers denoting elements of the array.

Next Q lines contain a single integer K.

Output:

For each task, print answer in a new line.

Constraints:

2 <= N <= 105

1 <= Q <= 105

0 <= A[i] <= 109

0 <= K < N

Sample Input
5 2
3 2 1 5 4
1
2
Sample Output
13
9

Time Complexity :
Space Complexity : */

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P01_Array_Special_Operation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> qp = new PriorityQueue<>(Collections.reverseOrder());
        long sum =0;
        for(int i =0;i<n;i++) {
            int temp = in.nextInt();
            sum = sum + temp;
            pq.add(temp);
            qp.add(temp);
        }
        ArrayList<Long> al = new ArrayList<Long>();
        al.add(sum);
        for(int i =0;i<n;i++) {
            int a = pq.poll();
            int b = qp.poll();
            sum -= 2 * a;
            al.add(sum);
            pq.add(b-a);
            qp.add(b-a);
        }
        for(int i =0;i<q;i++) {
            System.out.println(al.get(in.nextInt()));
        }
        in.close();
    }
}